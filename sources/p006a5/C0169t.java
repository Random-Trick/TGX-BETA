package p006a5;

import android.net.Uri;
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
import p006a5.AbstractC0180y;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p343y6.AbstractC10434j;
import p358z6.AbstractC11378l;
import p358z6.AbstractC11401r;
import p358z6.C11387o0;

public class C0169t extends AbstractC0139f implements AbstractC0180y {
    public final boolean f624e;
    public final int f625f;
    public final int f626g;
    public final String f627h;
    public final AbstractC0180y.C0186f f628i;
    public final AbstractC0180y.C0186f f629j;
    public final boolean f630k;
    public AbstractC10434j<String> f631l;
    public C0159o f632m;
    public HttpURLConnection f633n;
    public InputStream f634o;
    public boolean f635p;
    public int f636q;
    public long f637r;
    public long f638s;

    public static final class C0171b implements AbstractC0180y.AbstractC0182b {
        public AbstractC0150i0 f640b;
        public AbstractC10434j<String> f641c;
        public String f642d;
        public boolean f645g;
        public boolean f646h;
        public final AbstractC0180y.C0186f f639a = new AbstractC0180y.C0186f();
        public int f643e = 8000;
        public int f644f = 8000;

        public C0169t mo4407a() {
            C0169t tVar = new C0169t(this.f642d, this.f643e, this.f644f, this.f645g, this.f639a, this.f641c, this.f646h);
            AbstractC0150i0 i0Var = this.f640b;
            if (i0Var != null) {
                tVar.mo17399g(i0Var);
            }
            return tVar;
        }

        public C0171b m42149c(String str) {
            this.f642d = str;
            return this;
        }
    }

    public static class C0172c extends AbstractC11378l<String, List<String>> {
        public final Map<String, List<String>> f647a;

        public C0172c(Map<String, List<String>> map) {
            this.f647a = map;
        }

        public static boolean m42145i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static boolean m42144j(String str) {
            return str != null;
        }

        @Override
        public Map<String, List<String>> mo789a() {
            return this.f647a;
        }

        @Override
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override
        public boolean containsValue(Object obj) {
            return super.m793c(obj);
        }

        @Override
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return C11387o0.m781b(super.entrySet(), C0174v.f649a);
        }

        @Override
        public boolean equals(Object obj) {
            return obj != null && super.m792d(obj);
        }

        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override
        public int hashCode() {
            return super.m791e();
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
            return C11387o0.m781b(super.keySet(), C0173u.f648a);
        }

        @Override
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public static void m42158B(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = C1216l0.f4526a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) C1186a.m38188e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean m42152y(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public final HttpURLConnection m42159A(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) {
        HttpURLConnection C = m42157C(url);
        C.setConnectTimeout(this.f625f);
        C.setReadTimeout(this.f626g);
        HashMap hashMap = new HashMap();
        AbstractC0180y.C0186f fVar = this.f628i;
        if (fVar != null) {
            hashMap.putAll(fVar.m42134a());
        }
        hashMap.putAll(this.f629j.m42134a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            C.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a = C0187z.m42133a(j, j2);
        if (a != null) {
            C.setRequestProperty("Range", a);
        }
        String str = this.f627h;
        if (str != null) {
            C.setRequestProperty("User-Agent", str);
        }
        C.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        C.setInstanceFollowRedirects(z2);
        C.setDoOutput(bArr != null);
        C.setRequestMethod(C0159o.m42205c(i));
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

    public HttpURLConnection m42157C(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final int m42156D(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f637r;
        if (j != -1) {
            long j2 = j - this.f638s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) C1216l0.m37971j(this.f634o)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f638s += read;
        m42228s(read);
        return read;
    }

    public final void m42155E(long j, C0159o oVar) {
        if (j != 0) {
            byte[] bArr = new byte[Log.TAG_EMOJI];
            while (j > 0) {
                int read = ((InputStream) C1216l0.m37971j(this.f634o)).read(bArr, 0, (int) Math.min(j, (long) Log.TAG_EMOJI));
                if (Thread.currentThread().isInterrupted()) {
                    throw new AbstractC0180y.C0183c(new InterruptedIOException(), oVar, 2000, 1);
                } else if (read != -1) {
                    j -= read;
                    m42228s(read);
                } else {
                    throw new AbstractC0180y.C0183c(oVar, 2008, 1);
                }
            }
        }
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        try {
            return m42156D(bArr, i, i2);
        } catch (IOException e) {
            throw AbstractC0180y.C0183c.m42135c(e, (C0159o) C1216l0.m37971j(this.f632m), 2);
        }
    }

    @Override
    public long mo4413c(C0159o oVar) {
        byte[] bArr;
        this.f632m = oVar;
        long j = 0;
        this.f638s = 0L;
        this.f637r = 0L;
        m42226u(oVar);
        try {
            HttpURLConnection z = m42151z(oVar);
            this.f633n = z;
            this.f636q = z.getResponseCode();
            String responseMessage = z.getResponseMessage();
            int i = this.f636q;
            long j2 = -1;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = z.getHeaderFields();
                if (this.f636q == 416) {
                    if (oVar.f559g == C0187z.m42131c(z.getHeaderField("Content-Range"))) {
                        this.f635p = true;
                        m42225v(oVar);
                        long j3 = oVar.f560h;
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = z.getErrorStream();
                try {
                    bArr = errorStream != null ? C1216l0.m38017D0(errorStream) : C1216l0.f4531f;
                } catch (IOException unused) {
                    bArr = C1216l0.f4531f;
                }
                byte[] bArr2 = bArr;
                m42154w();
                throw new AbstractC0180y.C0185e(this.f636q, responseMessage, this.f636q == 416 ? new C0156l(2008) : null, headerFields, oVar, bArr2);
            }
            String contentType = z.getContentType();
            AbstractC10434j<String> jVar = this.f631l;
            if (jVar == null || jVar.apply(contentType)) {
                if (this.f636q == 200) {
                    long j4 = oVar.f559g;
                    if (j4 != 0) {
                        j = j4;
                    }
                }
                boolean y = m42152y(z);
                if (!y) {
                    long j5 = oVar.f560h;
                    if (j5 != -1) {
                        this.f637r = j5;
                    } else {
                        long b = C0187z.m42132b(z.getHeaderField("Content-Length"), z.getHeaderField("Content-Range"));
                        if (b != -1) {
                            j2 = b - j;
                        }
                        this.f637r = j2;
                    }
                } else {
                    this.f637r = oVar.f560h;
                }
                try {
                    this.f634o = z.getInputStream();
                    if (y) {
                        this.f634o = new GZIPInputStream(this.f634o);
                    }
                    this.f635p = true;
                    m42225v(oVar);
                    try {
                        m42155E(j, oVar);
                        return this.f637r;
                    } catch (IOException e) {
                        m42154w();
                        if (e instanceof AbstractC0180y.C0183c) {
                            throw ((AbstractC0180y.C0183c) e);
                        }
                        throw new AbstractC0180y.C0183c(e, oVar, 2000, 1);
                    }
                } catch (IOException e2) {
                    m42154w();
                    throw new AbstractC0180y.C0183c(e2, oVar, 2000, 1);
                }
            } else {
                m42154w();
                throw new AbstractC0180y.C0184d(contentType, oVar);
            }
        } catch (IOException e3) {
            m42154w();
            throw AbstractC0180y.C0183c.m42135c(e3, oVar, 1);
        }
    }

    @Override
    public void close() {
        try {
            InputStream inputStream = this.f634o;
            if (inputStream != null) {
                long j = this.f637r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f638s;
                }
                m42158B(this.f633n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new AbstractC0180y.C0183c(e, (C0159o) C1216l0.m37971j(this.f632m), 2000, 3);
                }
            }
        } finally {
            this.f634o = null;
            m42154w();
            if (this.f635p) {
                this.f635p = false;
                m42227t();
            }
        }
    }

    @Override
    public Map<String, List<String>> mo17398l() {
        HttpURLConnection httpURLConnection = this.f633n;
        if (httpURLConnection == null) {
            return AbstractC11401r.m740j();
        }
        return new C0172c(httpURLConnection.getHeaderFields());
    }

    @Override
    public Uri mo4412p() {
        HttpURLConnection httpURLConnection = this.f633n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void m42154w() {
        HttpURLConnection httpURLConnection = this.f633n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C1230s.m37889d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f633n = null;
        }
    }

    public final URL m42153x(URL url, String str, C0159o oVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new AbstractC0180y.C0183c(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), oVar, 2001, 1);
                } else if (this.f624e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    sb2.append("Disallowed cross-protocol redirect (");
                    sb2.append(protocol2);
                    sb2.append(" to ");
                    sb2.append(protocol);
                    sb2.append(")");
                    throw new AbstractC0180y.C0183c(sb2.toString(), oVar, 2001, 1);
                }
            } catch (MalformedURLException e) {
                throw new AbstractC0180y.C0183c(e, oVar, 2001, 1);
            }
        } else {
            throw new AbstractC0180y.C0183c("Null location redirect", oVar, 2001, 1);
        }
    }

    public final java.net.HttpURLConnection m42151z(p006a5.C0159o r26) {
        throw new UnsupportedOperationException("Method not decompiled: p006a5.C0169t.m42151z(a5.o):java.net.HttpURLConnection");
    }

    public C0169t(String str, int i, int i2, boolean z, AbstractC0180y.C0186f fVar, AbstractC10434j<String> jVar, boolean z2) {
        super(true);
        this.f627h = str;
        this.f625f = i;
        this.f626g = i2;
        this.f624e = z;
        this.f628i = fVar;
        this.f631l = jVar;
        this.f629j = new AbstractC0180y.C0186f();
        this.f630k = z2;
    }
}
