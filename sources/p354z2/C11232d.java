package p354z2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
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
import p004a3.AbstractC0042a;
import p004a3.AbstractC0068j;
import p004a3.AbstractC0069k;
import p004a3.AbstractC0072l;
import p004a3.AbstractC0074m;
import p004a3.AbstractC0076n;
import p004a3.AbstractC0077o;
import p004a3.EnumC0081p;
import p018b3.AbstractC1150h;
import p018b3.C1149g;
import p030c3.AbstractC1539f;
import p030c3.AbstractC1541g;
import p030c3.AbstractC1549m;
import p058e3.C4118a;
import p072f3.AbstractC4257a;
import p072f3.C4258b;
import p092g7.AbstractC4508a;
import p092g7.C4510c;
import p146k3.AbstractC6045a;
import p339y2.C10352b;
import p354z2.C11232d;

public final class C11232d implements AbstractC1549m {
    public final AbstractC4508a f35953a;
    public final ConnectivityManager f35954b;
    public final Context f35955c;
    public final URL f35956d;
    public final AbstractC6045a f35957e;
    public final AbstractC6045a f35958f;
    public final int f35959g;

    public static final class C11233a {
        public final URL f35960a;
        public final AbstractC0068j f35961b;
        public final String f35962c;

        public C11233a(URL url, AbstractC0068j jVar, String str) {
            this.f35960a = url;
            this.f35961b = jVar;
            this.f35962c = str;
        }

        public C11233a m1163a(URL url) {
            return new C11233a(url, this.f35961b, this.f35962c);
        }
    }

    public static final class C11234b {
        public final int f35963a;
        public final URL f35964b;
        public final long f35965c;

        public C11234b(int i, URL url, long j) {
            this.f35963a = i;
            this.f35964b = url;
            this.f35965c = j;
        }
    }

    public C11232d(Context context, AbstractC6045a aVar, AbstractC6045a aVar2, int i) {
        this.f35953a = AbstractC0068j.m42476b();
        this.f35955c = context;
        this.f35954b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f35956d = m1164n(C11229a.f35943c);
        this.f35957e = aVar2;
        this.f35958f = aVar;
        this.f35959g = i;
    }

    public static int m1172f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC0077o.EnumC0079b.UNKNOWN_MOBILE_SUBTYPE.m42422b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC0077o.EnumC0079b.COMBINED.m42422b();
        }
        if (AbstractC0077o.EnumC0079b.m42423a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int m1171g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC0077o.EnumC0080c.NONE.m42420b();
        }
        return networkInfo.getType();
    }

    public static int m1170h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C4118a.m28882c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    public static TelephonyManager m1168j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long m1167k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static C11233a m1166l(C11233a aVar, C11234b bVar) {
        URL url = bVar.f35964b;
        if (url == null) {
            return null;
        }
        C4118a.m28884a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m1163a(bVar.f35964b);
    }

    public static InputStream m1165m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL m1164n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override
    public AbstractC1541g mo1177a(AbstractC1539f fVar) {
        AbstractC0068j i = m1169i(fVar);
        URL url = this.f35956d;
        String str = null;
        if (fVar.mo36509c() != null) {
            try {
                C11229a e = C11229a.m1181e(fVar.mo36509c());
                if (e.m1180f() != null) {
                    str = e.m1180f();
                }
                if (e.m1179g() != null) {
                    url = m1164n(e.m1179g());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC1541g.m36505a();
            }
        }
        try {
            C11234b bVar = (C11234b) C4258b.m28331a(5, new C11233a(url, i, str), new AbstractC4257a() {
                @Override
                public final Object apply(Object obj) {
                    C11232d.C11234b e2;
                    e2 = C11232d.this.m1173e((C11232d.C11233a) obj);
                    return e2;
                }
            }, C11231c.f35952a);
            int i2 = bVar.f35963a;
            if (i2 == 200) {
                return AbstractC1541g.m36502d(bVar.f35965c);
            }
            if (i2 < 500 && i2 != 404) {
                return AbstractC1541g.m36505a();
            }
            return AbstractC1541g.m36501e();
        } catch (IOException e2) {
            C4118a.m28882c("CctTransportBackend", "Could not make request to the backend", e2);
            return AbstractC1541g.m36501e();
        }
    }

    @Override
    public AbstractC1150h mo1176b(AbstractC1150h hVar) {
        NetworkInfo activeNetworkInfo = this.f35954b.getActiveNetworkInfo();
        return hVar.m38294l().m38293a("sdk-version", Build.VERSION.SDK_INT).m38291c("model", Build.MODEL).m38291c("hardware", Build.HARDWARE).m38291c("device", Build.DEVICE).m38291c("product", Build.PRODUCT).m38291c("os-uild", Build.ID).m38291c("manufacturer", Build.MANUFACTURER).m38291c("fingerprint", Build.FINGERPRINT).m38292b("tz-offset", m1167k()).m38293a("net-type", m1171g(activeNetworkInfo)).m38293a("mobile-subtype", m1172f(activeNetworkInfo)).m38291c("country", Locale.getDefault().getCountry()).m38291c("locale", Locale.getDefault().getLanguage()).m38291c("mcc_mnc", m1168j(this.f35955c).getSimOperator()).m38291c("application_build", Integer.toString(m1170h(this.f35955c))).mo38290d();
    }

    public final C11234b m1173e(C11233a aVar) {
        Throwable e;
        Throwable e2;
        C4118a.m28884a("CctTransportBackend", "Making request to: %s", aVar.f35960a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f35960a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f35959g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.0.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f35962c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f35953a.mo23512a(aVar.f35961b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C4118a.m28880e("CctTransportBackend", "Status Code: " + responseCode);
                C4118a.m28880e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                C4118a.m28880e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C11234b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new C11234b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m = m1165m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C11234b bVar = new C11234b(responseCode, null, AbstractC0076n.m42431b(new BufferedReader(new InputStreamReader(m))).mo42430c());
                    if (m != null) {
                        m.close();
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
        } catch (C4510c e3) {
            e2 = e3;
            C4118a.m28882c("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C11234b(400, null, 0L);
        } catch (ConnectException e4) {
            e = e4;
            C4118a.m28882c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C11234b(500, null, 0L);
        } catch (UnknownHostException e5) {
            e = e5;
            C4118a.m28882c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C11234b(500, null, 0L);
        } catch (IOException e6) {
            e2 = e6;
            C4118a.m28882c("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C11234b(400, null, 0L);
        }
    }

    public final AbstractC0068j m1169i(AbstractC1539f fVar) {
        AbstractC0072l.AbstractC0073a j;
        HashMap hashMap = new HashMap();
        for (AbstractC1150h hVar : fVar.mo36510b()) {
            String j2 = hVar.mo38296j();
            if (!hashMap.containsKey(j2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(j2, arrayList);
            } else {
                ((List) hashMap.get(j2)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC1150h hVar2 = (AbstractC1150h) ((List) entry.getValue()).get(0);
            AbstractC0074m.AbstractC0075a b = AbstractC0074m.m42450a().mo42437f(EnumC0081p.DEFAULT).mo42436g(this.f35958f.mo21442a()).mo42435h(this.f35957e.mo21442a()).mo42441b(AbstractC0069k.m42474a().mo42469c(AbstractC0069k.EnumC0071b.ANDROID_FIREBASE).mo42470b(AbstractC0042a.m42509a().mo42478m(Integer.valueOf(hVar2.m38299g("sdk-version"))).mo42481j(hVar2.m38304b("model")).mo42485f(hVar2.m38304b("hardware")).mo42487d(hVar2.m38304b("device")).mo42479l(hVar2.m38304b("product")).mo42480k(hVar2.m38304b("os-uild")).mo42483h(hVar2.m38304b("manufacturer")).mo42486e(hVar2.m38304b("fingerprint")).mo42488c(hVar2.m38304b("country")).mo42484g(hVar2.m38304b("locale")).mo42482i(hVar2.m38304b("mcc_mnc")).mo42489b(hVar2.m38304b("application_build")).mo42490a()).mo42471a());
            try {
                b.m42434i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.m42433j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC1150h hVar3 : (List) entry.getValue()) {
                C1149g e = hVar3.mo38301e();
                C10352b b2 = e.m38306b();
                if (b2.equals(C10352b.m5368b("proto"))) {
                    j = AbstractC0072l.m42459j(e.m38307a());
                } else if (b2.equals(C10352b.m5368b("json"))) {
                    j = AbstractC0072l.m42460i(new String(e.m38307a(), Charset.forName("UTF-8")));
                } else {
                    C4118a.m28879f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                j.mo42456c(hVar3.mo38300f()).mo42455d(hVar3.mo38295k()).mo42451h(hVar3.m38298h("tz-offset")).mo42454e(AbstractC0077o.m42429a().mo42424c(AbstractC0077o.EnumC0080c.m42421a(hVar3.m38299g("net-type"))).mo42425b(AbstractC0077o.EnumC0079b.m42423a(hVar3.m38299g("mobile-subtype"))).mo42426a());
                if (hVar3.mo38302d() != null) {
                    j.mo42457b(hVar3.mo38302d());
                }
                arrayList3.add(j.mo42458a());
            }
            b.mo42440c(arrayList3);
            arrayList2.add(b.mo42442a());
        }
        return AbstractC0068j.m42477a(arrayList2);
    }

    public C11232d(Context context, AbstractC6045a aVar, AbstractC6045a aVar2) {
        this(context, aVar, aVar2, 40000);
    }
}
