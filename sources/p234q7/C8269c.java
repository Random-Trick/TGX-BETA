package p234q7;

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
import org.json.JSONException;
import org.json.JSONObject;
import p150k7.AbstractC6214f;
import p163l5.C6378r;
import p178m7.AbstractC6794b;
import p190n7.C7290h;
import p232q5.C8241a;
import p232q5.C8249i;
import p234q7.AbstractC8270d;
import p234q7.AbstractC8274f;
import p301v7.AbstractC9882i;

public class C8269c {
    public static final Pattern f26739e = Pattern.compile("[0-9]+s");
    public static final Charset f26740f = Charset.forName("UTF-8");
    public final Context f26741a;
    public final AbstractC6794b<AbstractC9882i> f26742b;
    public final AbstractC6794b<AbstractC6214f> f26743c;
    public final C8273e f26744d = new C8273e();

    public C8269c(Context context, AbstractC6794b<AbstractC9882i> bVar, AbstractC6794b<AbstractC6214f> bVar2) {
        this.f26741a = context;
        this.f26742b = bVar;
        this.f26743c = bVar2;
    }

    public static String m13013a(String str, String str2, String str3) {
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

    public static JSONObject m13012b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static JSONObject m13011c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static byte[] m13006h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static boolean m13005i(int i) {
        return i >= 200 && i < 300;
    }

    public static void m13004j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    public static void m13003k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o = m12999o(httpURLConnection);
        if (!TextUtils.isEmpty(o)) {
            Log.w("Firebase-Installations", o);
            Log.w("Firebase-Installations", m13013a(str, str2, str3));
        }
    }

    public static long m13001m(String str) {
        C6378r.m20516b(f26739e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static String m12999o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f26740f));
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

    public static void m12995s(URLConnection uRLConnection, byte[] bArr) {
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

    public AbstractC8270d m13010d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC8270d n;
        if (this.f26744d.m12981b()) {
            URL g = m13007g(String.format("projects/%s/installations", str3));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = m13002l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m12997q(l, str2, str4);
                    responseCode = l.getResponseCode();
                    this.f26744d.m12977f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (m13005i(responseCode)) {
                    n = m13000n(l);
                } else {
                    m13003k(l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new C7290h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C7290h.EnumC7291a.TOO_MANY_REQUESTS);
                    } else if (responseCode < 500 || responseCode >= 600) {
                        m13004j();
                        n = AbstractC8270d.m12994a().mo12984e(AbstractC8270d.EnumC8272b.BAD_CONFIG).mo12988a();
                    } else {
                        l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return n;
            }
            throw new C7290h("Firebase Installations Service is unavailable. Please try again later.", C7290h.EnumC7291a.UNAVAILABLE);
        }
        throw new C7290h("Firebase Installations Service is unavailable. Please try again later.", C7290h.EnumC7291a.UNAVAILABLE);
    }

    public AbstractC8274f m13009e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC8274f p;
        if (this.f26744d.m12981b()) {
            URL g = m13007g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = m13002l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    m12996r(l);
                    responseCode = l.getResponseCode();
                    this.f26744d.m12977f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (m13005i(responseCode)) {
                    p = m12998p(l);
                } else {
                    m13003k(l, null, str, str3);
                    if (!(responseCode == 401 || responseCode == 404)) {
                        if (responseCode == 429) {
                            throw new C7290h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C7290h.EnumC7291a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m13004j();
                            p = AbstractC8274f.m12976a().mo12971b(AbstractC8274f.EnumC8276b.BAD_CONFIG).mo12972a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    p = AbstractC8274f.m12976a().mo12971b(AbstractC8274f.EnumC8276b.AUTH_ERROR).mo12972a();
                }
                l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return p;
            }
            throw new C7290h("Firebase Installations Service is unavailable. Please try again later.", C7290h.EnumC7291a.UNAVAILABLE);
        }
        throw new C7290h("Firebase Installations Service is unavailable. Please try again later.", C7290h.EnumC7291a.UNAVAILABLE);
    }

    public final String m13008f() {
        try {
            Context context = this.f26741a;
            byte[] a = C8241a.m13057a(context, context.getPackageName());
            if (a != null) {
                return C8249i.m13042a(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f26741a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f26741a.getPackageName(), e);
            return null;
        }
    }

    public final URL m13007g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new C7290h(e.getMessage(), C7290h.EnumC7291a.UNAVAILABLE);
        }
    }

    public final HttpURLConnection m13002l(URL url, String str) {
        AbstractC6214f.EnumC6215a a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f26741a.getPackageName());
            if (!(this.f26743c.get() == null || this.f26742b.get() == null || (a = this.f26743c.get().mo21061a("fire-installations-id")) == AbstractC6214f.EnumC6215a.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f26742b.get().mo6695a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.m21060a()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m13008f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C7290h("Firebase Installations Service is unavailable. Please try again later.", C7290h.EnumC7291a.UNAVAILABLE);
        }
    }

    public final AbstractC8270d m13000n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f26740f));
        AbstractC8274f.AbstractC8275a a = AbstractC8274f.m12976a();
        AbstractC8270d.AbstractC8271a a2 = AbstractC8270d.m12994a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo12983f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo12986c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo12985d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo12970c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo12969d(m13001m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo12987b(a.mo12972a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo12984e(AbstractC8270d.EnumC8272b.OK).mo12988a();
    }

    public final AbstractC8274f m12998p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f26740f));
        AbstractC8274f.AbstractC8275a a = AbstractC8274f.m12976a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo12970c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo12969d(m13001m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo12971b(AbstractC8274f.EnumC8276b.OK).mo12972a();
    }

    public final void m12997q(HttpURLConnection httpURLConnection, String str, String str2) {
        m12995s(httpURLConnection, m13006h(m13012b(str, str2)));
    }

    public final void m12996r(HttpURLConnection httpURLConnection) {
        m12995s(httpURLConnection, m13006h(m13011c()));
    }
}
