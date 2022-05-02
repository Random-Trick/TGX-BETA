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
    public final AbstractC4508a f35956a;
    public final ConnectivityManager f35957b;
    public final Context f35958c;
    public final URL f35959d;
    public final AbstractC6045a f35960e;
    public final AbstractC6045a f35961f;
    public final int f35962g;

    public static final class C11233a {
        public final URL f35963a;
        public final AbstractC0068j f35964b;
        public final String f35965c;

        public C11233a(URL url, AbstractC0068j jVar, String str) {
            this.f35963a = url;
            this.f35964b = jVar;
            this.f35965c = str;
        }

        public C11233a m1163a(URL url) {
            return new C11233a(url, this.f35964b, this.f35965c);
        }
    }

    public static final class C11234b {
        public final int f35966a;
        public final URL f35967b;
        public final long f35968c;

        public C11234b(int i, URL url, long j) {
            this.f35966a = i;
            this.f35967b = url;
            this.f35968c = j;
        }
    }

    public C11232d(Context context, AbstractC6045a aVar, AbstractC6045a aVar2, int i) {
        this.f35956a = AbstractC0068j.m42479b();
        this.f35958c = context;
        this.f35957b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f35959d = m1164n(C11229a.f35946c);
        this.f35960e = aVar2;
        this.f35961f = aVar;
        this.f35962g = i;
    }

    public static int m1172f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC0077o.EnumC0079b.UNKNOWN_MOBILE_SUBTYPE.m42425b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC0077o.EnumC0079b.COMBINED.m42425b();
        }
        if (AbstractC0077o.EnumC0079b.m42426a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int m1171g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC0077o.EnumC0080c.NONE.m42423b();
        }
        return networkInfo.getType();
    }

    public static int m1170h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C4118a.m28884c("CctTransportBackend", "Unable to find version code for package", e);
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
        URL url = bVar.f35967b;
        if (url == null) {
            return null;
        }
        C4118a.m28886a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m1163a(bVar.f35967b);
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
        URL url = this.f35959d;
        String str = null;
        if (fVar.mo36512c() != null) {
            try {
                C11229a e = C11229a.m1181e(fVar.mo36512c());
                if (e.m1180f() != null) {
                    str = e.m1180f();
                }
                if (e.m1179g() != null) {
                    url = m1164n(e.m1179g());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC1541g.m36508a();
            }
        }
        try {
            C11234b bVar = (C11234b) C4258b.m28333a(5, new C11233a(url, i, str), new AbstractC4257a() {
                @Override
                public final Object apply(Object obj) {
                    C11232d.C11234b e2;
                    e2 = C11232d.this.m1173e((C11232d.C11233a) obj);
                    return e2;
                }
            }, C11231c.f35955a);
            int i2 = bVar.f35966a;
            if (i2 == 200) {
                return AbstractC1541g.m36505d(bVar.f35968c);
            }
            if (i2 < 500 && i2 != 404) {
                return AbstractC1541g.m36508a();
            }
            return AbstractC1541g.m36504e();
        } catch (IOException e2) {
            C4118a.m28884c("CctTransportBackend", "Could not make request to the backend", e2);
            return AbstractC1541g.m36504e();
        }
    }

    @Override
    public AbstractC1150h mo1176b(AbstractC1150h hVar) {
        NetworkInfo activeNetworkInfo = this.f35957b.getActiveNetworkInfo();
        return hVar.m38297l().m38296a("sdk-version", Build.VERSION.SDK_INT).m38294c("model", Build.MODEL).m38294c("hardware", Build.HARDWARE).m38294c("device", Build.DEVICE).m38294c("product", Build.PRODUCT).m38294c("os-uild", Build.ID).m38294c("manufacturer", Build.MANUFACTURER).m38294c("fingerprint", Build.FINGERPRINT).m38295b("tz-offset", m1167k()).m38296a("net-type", m1171g(activeNetworkInfo)).m38296a("mobile-subtype", m1172f(activeNetworkInfo)).m38294c("country", Locale.getDefault().getCountry()).m38294c("locale", Locale.getDefault().getLanguage()).m38294c("mcc_mnc", m1168j(this.f35958c).getSimOperator()).m38294c("application_build", Integer.toString(m1170h(this.f35958c))).mo38293d();
    }

    public final C11234b m1173e(C11233a aVar) {
        Throwable e;
        Throwable e2;
        C4118a.m28886a("CctTransportBackend", "Making request to: %s", aVar.f35963a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f35963a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f35962g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.0.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f35965c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f35956a.mo23513a(aVar.f35964b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C4118a.m28882e("CctTransportBackend", "Status Code: " + responseCode);
                C4118a.m28882e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                C4118a.m28882e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C11234b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new C11234b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m = m1165m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C11234b bVar = new C11234b(responseCode, null, AbstractC0076n.m42434b(new BufferedReader(new InputStreamReader(m))).mo42433c());
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
            C4118a.m28884c("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C11234b(400, null, 0L);
        } catch (ConnectException e4) {
            e = e4;
            C4118a.m28884c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C11234b(500, null, 0L);
        } catch (UnknownHostException e5) {
            e = e5;
            C4118a.m28884c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C11234b(500, null, 0L);
        } catch (IOException e6) {
            e2 = e6;
            C4118a.m28884c("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C11234b(400, null, 0L);
        }
    }

    public final AbstractC0068j m1169i(AbstractC1539f fVar) {
        AbstractC0072l.AbstractC0073a j;
        HashMap hashMap = new HashMap();
        for (AbstractC1150h hVar : fVar.mo36513b()) {
            String j2 = hVar.mo38299j();
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
            AbstractC0074m.AbstractC0075a b = AbstractC0074m.m42453a().mo42440f(EnumC0081p.DEFAULT).mo42439g(this.f35961f.mo21443a()).mo42438h(this.f35960e.mo21443a()).mo42444b(AbstractC0069k.m42477a().mo42472c(AbstractC0069k.EnumC0071b.ANDROID_FIREBASE).mo42473b(AbstractC0042a.m42512a().mo42481m(Integer.valueOf(hVar2.m38302g("sdk-version"))).mo42484j(hVar2.m38307b("model")).mo42488f(hVar2.m38307b("hardware")).mo42490d(hVar2.m38307b("device")).mo42482l(hVar2.m38307b("product")).mo42483k(hVar2.m38307b("os-uild")).mo42486h(hVar2.m38307b("manufacturer")).mo42489e(hVar2.m38307b("fingerprint")).mo42491c(hVar2.m38307b("country")).mo42487g(hVar2.m38307b("locale")).mo42485i(hVar2.m38307b("mcc_mnc")).mo42492b(hVar2.m38307b("application_build")).mo42493a()).mo42474a());
            try {
                b.m42437i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.m42436j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC1150h hVar3 : (List) entry.getValue()) {
                C1149g e = hVar3.mo38304e();
                C10352b b2 = e.m38309b();
                if (b2.equals(C10352b.m5368b("proto"))) {
                    j = AbstractC0072l.m42462j(e.m38310a());
                } else if (b2.equals(C10352b.m5368b("json"))) {
                    j = AbstractC0072l.m42463i(new String(e.m38310a(), Charset.forName("UTF-8")));
                } else {
                    C4118a.m28881f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                j.mo42459c(hVar3.mo38303f()).mo42458d(hVar3.mo38298k()).mo42454h(hVar3.m38301h("tz-offset")).mo42457e(AbstractC0077o.m42432a().mo42427c(AbstractC0077o.EnumC0080c.m42424a(hVar3.m38302g("net-type"))).mo42428b(AbstractC0077o.EnumC0079b.m42426a(hVar3.m38302g("mobile-subtype"))).mo42429a());
                if (hVar3.mo38305d() != null) {
                    j.mo42460b(hVar3.mo38305d());
                }
                arrayList3.add(j.mo42461a());
            }
            b.mo42443c(arrayList3);
            arrayList2.add(b.mo42445a());
        }
        return AbstractC0068j.m42480a(arrayList2);
    }

    public C11232d(Context context, AbstractC6045a aVar, AbstractC6045a aVar2) {
        this(context, aVar, aVar2, 40000);
    }
}
