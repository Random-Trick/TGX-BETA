package b5;

import a7.l;
import a7.p0;
import a7.r;
import android.net.Uri;
import b5.y;
import c5.l0;
import c5.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.thunderdog.challegram.Log;
import z6.k;

public class t extends f implements y {
    public final boolean f3974e;
    public final int f3975f;
    public final int f3976g;
    public final String f3977h;
    public final y.f f3978i;
    public final y.f f3979j;
    public final boolean f3980k;
    public k<String> f3981l;
    public o f3982m;
    public HttpURLConnection f3983n;
    public InputStream f3984o;
    public boolean f3985p;
    public int f3986q;
    public long f3987r;
    public long f3988s;

    public static final class b implements y.b {
        public i0 f3990b;
        public k<String> f3991c;
        public String f3992d;
        public boolean f3995g;
        public boolean f3996h;
        public final y.f f3989a = new y.f();
        public int f3993e = 8000;
        public int f3994f = 8000;

        public t a() {
            t tVar = new t(this.f3992d, this.f3993e, this.f3994f, this.f3995g, this.f3989a, this.f3991c, this.f3996h);
            i0 i0Var = this.f3990b;
            if (i0Var != null) {
                tVar.i(i0Var);
            }
            return tVar;
        }

        public b c(String str) {
            this.f3992d = str;
            return this;
        }
    }

    public static class c extends l<String, List<String>> {
        public final Map<String, List<String>> f3997a;

        public c(Map<String, List<String>> map) {
            this.f3997a = map;
        }

        public static boolean i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static boolean j(String str) {
            return str != null;
        }

        @Override
        public Map<String, List<String>> a() {
            return this.f3997a;
        }

        @Override
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return p0.b(super.entrySet(), v.f3999a);
        }

        @Override
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override
        public int hashCode() {
            return super.e();
        }

        @Override
        public boolean isEmpty() {
            if (!super.isEmpty()) {
                return super.size() == 1 && super.containsKey(null);
            }
            return true;
        }

        @Override
        public Set<String> keySet() {
            return p0.b(super.keySet(), u.f3998a);
        }

        @Override
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public static void B(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = l0.f4841a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) c5.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean y(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public final HttpURLConnection A(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection C = C(url);
        C.setConnectTimeout(this.f3975f);
        C.setReadTimeout(this.f3976g);
        HashMap hashMap = new HashMap();
        y.f fVar = this.f3978i;
        if (fVar != null) {
            hashMap.putAll(fVar.a());
        }
        hashMap.putAll(this.f3979j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            C.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = z.a(j10, j11);
        if (a10 != null) {
            C.setRequestProperty("Range", a10);
        }
        String str = this.f3977h;
        if (str != null) {
            C.setRequestProperty("User-Agent", str);
        }
        C.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        C.setInstanceFollowRedirects(z11);
        C.setDoOutput(bArr != null);
        C.setRequestMethod(o.c(i10));
        if (bArr != null) {
            C.setFixedLengthStreamingMode(bArr.length);
            C.connect();
            OutputStream outputStream = C.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            C.connect();
        }
        return C;
    }

    public HttpURLConnection C(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final int D(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f3987r;
        if (j10 != -1) {
            long j11 = j10 - this.f3988s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) l0.j(this.f3984o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f3988s += read;
        s(read);
        return read;
    }

    public final void E(long j10, o oVar) {
        if (j10 != 0) {
            byte[] bArr = new byte[Log.TAG_EMOJI];
            while (j10 > 0) {
                int read = ((InputStream) l0.j(this.f3984o)).read(bArr, 0, (int) Math.min(j10, (long) Log.TAG_EMOJI));
                if (Thread.currentThread().isInterrupted()) {
                    throw new y.c(new InterruptedIOException(), oVar, 2000, 1);
                } else if (read != -1) {
                    j10 -= read;
                    s(read);
                } else {
                    throw new y.c(oVar, 2008, 1);
                }
            }
        }
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        try {
            return D(bArr, i10, i11);
        } catch (IOException e10) {
            throw y.c.c(e10, (o) l0.j(this.f3982m), 2);
        }
    }

    @Override
    public void close() {
        try {
            InputStream inputStream = this.f3984o;
            if (inputStream != null) {
                long j10 = this.f3987r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f3988s;
                }
                B(this.f3983n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new y.c(e10, (o) l0.j(this.f3982m), 2000, 3);
                }
            }
        } finally {
            this.f3984o = null;
            w();
            if (this.f3985p) {
                this.f3985p = false;
                t();
            }
        }
    }

    @Override
    public long d(o oVar) {
        byte[] bArr;
        this.f3982m = oVar;
        long j10 = 0;
        this.f3988s = 0L;
        this.f3987r = 0L;
        u(oVar);
        try {
            HttpURLConnection z10 = z(oVar);
            this.f3983n = z10;
            this.f3986q = z10.getResponseCode();
            String responseMessage = z10.getResponseMessage();
            int i10 = this.f3986q;
            long j11 = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = z10.getHeaderFields();
                if (this.f3986q == 416) {
                    if (oVar.f3910g == z.c(z10.getHeaderField("Content-Range"))) {
                        this.f3985p = true;
                        v(oVar);
                        long j12 = oVar.f3911h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = z10.getErrorStream();
                try {
                    bArr = errorStream != null ? l0.E0(errorStream) : l0.f4846f;
                } catch (IOException unused) {
                    bArr = l0.f4846f;
                }
                byte[] bArr2 = bArr;
                w();
                throw new y.e(this.f3986q, responseMessage, this.f3986q == 416 ? new l(2008) : null, headerFields, oVar, bArr2);
            }
            String contentType = z10.getContentType();
            k<String> kVar = this.f3981l;
            if (kVar == null || kVar.apply(contentType)) {
                if (this.f3986q == 200) {
                    long j13 = oVar.f3910g;
                    if (j13 != 0) {
                        j10 = j13;
                    }
                }
                boolean y10 = y(z10);
                if (!y10) {
                    long j14 = oVar.f3911h;
                    if (j14 != -1) {
                        this.f3987r = j14;
                    } else {
                        long b10 = z.b(z10.getHeaderField("Content-Length"), z10.getHeaderField("Content-Range"));
                        if (b10 != -1) {
                            j11 = b10 - j10;
                        }
                        this.f3987r = j11;
                    }
                } else {
                    this.f3987r = oVar.f3911h;
                }
                try {
                    this.f3984o = z10.getInputStream();
                    if (y10) {
                        this.f3984o = new GZIPInputStream(this.f3984o);
                    }
                    this.f3985p = true;
                    v(oVar);
                    try {
                        E(j10, oVar);
                        return this.f3987r;
                    } catch (IOException e10) {
                        w();
                        if (e10 instanceof y.c) {
                            throw ((y.c) e10);
                        }
                        throw new y.c(e10, oVar, 2000, 1);
                    }
                } catch (IOException e11) {
                    w();
                    throw new y.c(e11, oVar, 2000, 1);
                }
            } else {
                w();
                throw new y.d(contentType, oVar);
            }
        } catch (IOException e12) {
            w();
            throw y.c.c(e12, oVar, 1);
        }
    }

    @Override
    public Map<String, List<String>> l() {
        HttpURLConnection httpURLConnection = this.f3983n;
        if (httpURLConnection == null) {
            return r.j();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    @Override
    public Uri p() {
        HttpURLConnection httpURLConnection = this.f3983n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void w() {
        HttpURLConnection httpURLConnection = this.f3983n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                s.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f3983n = null;
        }
    }

    public final URL x(URL url, String str, o oVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new y.c(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), oVar, 2001, 1);
                } else if (this.f3974e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    sb2.append("Disallowed cross-protocol redirect (");
                    sb2.append(protocol2);
                    sb2.append(" to ");
                    sb2.append(protocol);
                    sb2.append(")");
                    throw new y.c(sb2.toString(), oVar, 2001, 1);
                }
            } catch (MalformedURLException e10) {
                throw new y.c(e10, oVar, 2001, 1);
            }
        } else {
            throw new y.c("Null location redirect", oVar, 2001, 1);
        }
    }

    public final java.net.HttpURLConnection z(b5.o r27) {
        throw new UnsupportedOperationException("Method not decompiled: b5.t.z(b5.o):java.net.HttpURLConnection");
    }

    public t(String str, int i10, int i11, boolean z10, y.f fVar, k<String> kVar, boolean z11) {
        super(true);
        this.f3977h = str;
        this.f3975f = i10;
        this.f3976g = i11;
        this.f3974e = z10;
        this.f3978i = fVar;
        this.f3981l = kVar;
        this.f3979j = new y.f();
        this.f3980k = z11;
    }
}
