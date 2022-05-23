package z2;

import a3.j;
import a3.k;
import a3.l;
import a3.m;
import a3.n;
import a3.o;
import a3.p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b3.h;
import c3.f;
import c3.g;
import c3.m;
import h7.c;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import z2.d;

public final class d implements m {
    public final h7.a f26827a;
    public final ConnectivityManager f26828b;
    public final Context f26829c;
    public final URL f26830d;
    public final k3.a f26831e;
    public final k3.a f26832f;
    public final int f26833g;

    public static final class a {
        public final URL f26834a;
        public final j f26835b;
        public final String f26836c;

        public a(URL url, j jVar, String str) {
            this.f26834a = url;
            this.f26835b = jVar;
            this.f26836c = str;
        }

        public a a(URL url) {
            return new a(url, this.f26835b, this.f26836c);
        }
    }

    public static final class b {
        public final int f26837a;
        public final URL f26838b;
        public final long f26839c;

        public b(int i10, URL url, long j10) {
            this.f26837a = i10;
            this.f26838b = url;
            this.f26839c = j10;
        }
    }

    public d(Context context, k3.a aVar, k3.a aVar2, int i10) {
        this.f26827a = j.b();
        this.f26829c = context;
        this.f26828b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f26830d = n(z2.a.f26817c);
        this.f26831e = aVar2;
        this.f26832f = aVar;
        this.f26833g = i10;
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.b();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.b();
        }
        return networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            e3.a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static a l(a aVar, b bVar) {
        URL url = bVar.f26838b;
        if (url == null) {
            return null;
        }
        e3.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f26838b);
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override
    public g a(f fVar) {
        j i10 = i(fVar);
        URL url = this.f26830d;
        String str = null;
        if (fVar.c() != null) {
            try {
                z2.a e10 = z2.a.e(fVar.c());
                if (e10.f() != null) {
                    str = e10.f();
                }
                if (e10.g() != null) {
                    url = n(e10.g());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) f3.b.a(5, new a(url, i10, str), new f3.a() {
                @Override
                public final Object apply(Object obj) {
                    d.b e11;
                    e11 = d.this.e((d.a) obj);
                    return e11;
                }
            }, c.f26826a);
            int i11 = bVar.f26837a;
            if (i11 == 200) {
                return g.d(bVar.f26839c);
            }
            if (i11 < 500 && i11 != 404) {
                return g.a();
            }
            return g.e();
        } catch (IOException e11) {
            e3.a.c("CctTransportBackend", "Could not make request to the backend", e11);
            return g.e();
        }
    }

    @Override
    public h b(h hVar) {
        NetworkInfo activeNetworkInfo = this.f26828b.getActiveNetworkInfo();
        return hVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f26829c).getSimOperator()).c("application_build", Integer.toString(h(this.f26829c))).d();
    }

    public final b e(a aVar) {
        Throwable e10;
        Throwable e11;
        e3.a.a("CctTransportBackend", "Making request to: %s", aVar.f26834a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f26834a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f26833g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.0.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f26836c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f26827a.a(aVar.f26835b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                e3.a.e("CctTransportBackend", "Status Code: " + responseCode);
                e3.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                e3.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                    if (m10 != null) {
                        m10.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (c e12) {
            e11 = e12;
            e3.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new b(400, null, 0L);
        } catch (ConnectException e13) {
            e10 = e13;
            e3.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new b(500, null, 0L);
        } catch (UnknownHostException e14) {
            e10 = e14;
            e3.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new b(500, null, 0L);
        } catch (IOException e15) {
            e11 = e15;
            e3.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new b(400, null, 0L);
        }
    }

    public final j i(f fVar) {
        l.a j10;
        HashMap hashMap = new HashMap();
        for (h hVar : fVar.b()) {
            String j11 = hVar.j();
            if (!hashMap.containsKey(j11)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(j11, arrayList);
            } else {
                ((List) hashMap.get(j11)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            h hVar2 = (h) ((List) entry.getValue()).get(0);
            m.a b10 = a3.m.a().f(p.DEFAULT).g(this.f26832f.a()).h(this.f26831e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(a3.a.a().m(Integer.valueOf(hVar2.g("sdk-version"))).j(hVar2.b("model")).f(hVar2.b("hardware")).d(hVar2.b("device")).l(hVar2.b("product")).k(hVar2.b("os-uild")).h(hVar2.b("manufacturer")).e(hVar2.b("fingerprint")).c(hVar2.b("country")).g(hVar2.b("locale")).i(hVar2.b("mcc_mnc")).b(hVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar3 : (List) entry.getValue()) {
                b3.g e10 = hVar3.e();
                y2.b b11 = e10.b();
                if (b11.equals(y2.b.b("proto"))) {
                    j10 = l.j(e10.a());
                } else if (b11.equals(y2.b.b("json"))) {
                    j10 = l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    e3.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                j10.c(hVar3.f()).d(hVar3.k()).h(hVar3.h("tz-offset")).e(o.a().c(o.c.a(hVar3.g("net-type"))).b(o.b.a(hVar3.g("mobile-subtype"))).a());
                if (hVar3.d() != null) {
                    j10.b(hVar3.d());
                }
                arrayList3.add(j10.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    public d(Context context, k3.a aVar, k3.a aVar2) {
        this(context, aVar, aVar2, 40000);
    }
}
