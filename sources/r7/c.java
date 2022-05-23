package r7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import l7.f;
import m5.r;
import n7.b;
import o7.h;
import org.json.JSONException;
import org.json.JSONObject;
import r5.a;
import r7.d;
import r7.f;
import w7.i;

public class c {
    public static final Pattern f21779e = Pattern.compile("[0-9]+s");
    public static final Charset f21780f = Charset.forName("UTF-8");
    public final Context f21781a;
    public final b<i> f21782b;
    public final b<f> f21783c;
    public final e f21784d = new e();

    public c(Context context, b<i> bVar, b<f> bVar2) {
        this.f21781a = context;
        this.f21782b = bVar;
        this.f21783c = bVar2;
    }

    public static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    public static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static boolean i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    public static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    public static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o10 = o(httpURLConnection);
        if (!TextUtils.isEmpty(o10)) {
            Log.w("Firebase-Installations", o10);
            Log.w("Firebase-Installations", a(str, str2, str3));
        }
    }

    public static long m(String str) {
        r.b(f21779e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static String o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f21780f));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    public static void s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public d d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        d n10;
        if (this.f21784d.b()) {
            URL g10 = g(String.format("projects/%s/installations", str3));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l10 = l(g10, str);
                try {
                    l10.setRequestMethod("POST");
                    l10.setDoOutput(true);
                    if (str5 != null) {
                        l10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(l10, str2, str4);
                    responseCode = l10.getResponseCode();
                    this.f21784d.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (i(responseCode)) {
                    n10 = n(l10);
                } else {
                    k(l10, str4, str, str3);
                    if (responseCode == 429) {
                        throw new h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", h.a.TOO_MANY_REQUESTS);
                    } else if (responseCode < 500 || responseCode >= 600) {
                        j();
                        n10 = d.a().e(d.b.BAD_CONFIG).a();
                    } else {
                        l10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                l10.disconnect();
                TrafficStats.clearThreadStatsTag();
                return n10;
            }
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }

    public f e(String str, String str2, String str3, String str4) {
        int responseCode;
        f p10;
        if (this.f21784d.b()) {
            URL g10 = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l10 = l(g10, str);
                try {
                    l10.setRequestMethod("POST");
                    l10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l10.setDoOutput(true);
                    r(l10);
                    responseCode = l10.getResponseCode();
                    this.f21784d.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (i(responseCode)) {
                    p10 = p(l10);
                } else {
                    k(l10, null, str, str3);
                    if (!(responseCode == 401 || responseCode == 404)) {
                        if (responseCode == 429) {
                            throw new h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", h.a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            j();
                            p10 = f.a().b(f.b.BAD_CONFIG).a();
                        } else {
                            l10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    p10 = f.a().b(f.b.AUTH_ERROR).a();
                }
                l10.disconnect();
                TrafficStats.clearThreadStatsTag();
                return p10;
            }
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }

    public final String f() {
        try {
            Context context = this.f21781a;
            byte[] a10 = a.a(context, context.getPackageName());
            if (a10 != null) {
                return r5.i.a(a10, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f21781a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f21781a.getPackageName(), e10);
            return null;
        }
    }

    public final URL g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new h(e10.getMessage(), h.a.UNAVAILABLE);
        }
    }

    public final HttpURLConnection l(URL url, String str) {
        f.a a10;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f21781a.getPackageName());
            if (!(this.f21783c.get() == null || this.f21782b.get() == null || (a10 = this.f21783c.get().a("fire-installations-id")) == f.a.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f21782b.get().a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a10.a()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
    }

    public final d n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f21780f));
        f.a a10 = f.a();
        d.a a11 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a11.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a11.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a11.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a10.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a10.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a11.b(a10.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a11.e(d.b.OK).a();
    }

    public final f p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f21780f));
        f.a a10 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a10.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a10.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a10.b(f.b.OK).a();
    }

    public final void q(HttpURLConnection httpURLConnection, String str, String str2) {
        s(httpURLConnection, h(b(str, str2)));
    }

    public final void r(HttpURLConnection httpURLConnection) {
        s(httpURLConnection, h(c()));
    }
}
