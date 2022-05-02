package p006a5;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p020b5.C1186a;
import p174m3.C6585d1;

public final class C0159o {
    public final Uri f553a;
    public final long f554b;
    public final int f555c;
    public final byte[] f556d;
    public final Map<String, String> f557e;
    @Deprecated
    public final long f558f;
    public final long f559g;
    public final long f560h;
    public final String f561i;
    public final int f562j;
    public final Object f563k;

    public static final class C0161b {
        public Uri f564a;
        public long f565b;
        public int f566c;
        public byte[] f567d;
        public Map<String, String> f568e;
        public long f569f;
        public long f570g;
        public String f571h;
        public int f572i;
        public Object f573j;

        public C0159o m42200a() {
            C1186a.m38181i(this.f564a, "The uri must be set.");
            return new C0159o(this.f564a, this.f565b, this.f566c, this.f567d, this.f568e, this.f569f, this.f570g, this.f571h, this.f572i, this.f573j);
        }

        public C0161b m42199b(int i) {
            this.f572i = i;
            return this;
        }

        public C0161b m42198c(byte[] bArr) {
            this.f567d = bArr;
            return this;
        }

        public C0161b m42197d(int i) {
            this.f566c = i;
            return this;
        }

        public C0161b m42196e(Map<String, String> map) {
            this.f568e = map;
            return this;
        }

        public C0161b m42195f(String str) {
            this.f571h = str;
            return this;
        }

        public C0161b m42194g(long j) {
            this.f569f = j;
            return this;
        }

        public C0161b m42193h(Uri uri) {
            this.f564a = uri;
            return this;
        }

        public C0161b m42192i(String str) {
            this.f564a = Uri.parse(str);
            return this;
        }

        public C0161b() {
            this.f566c = 1;
            this.f568e = Collections.emptyMap();
            this.f570g = -1L;
        }

        public C0161b(C0159o oVar) {
            this.f564a = oVar.f553a;
            this.f565b = oVar.f554b;
            this.f566c = oVar.f555c;
            this.f567d = oVar.f556d;
            this.f568e = oVar.f557e;
            this.f569f = oVar.f559g;
            this.f570g = oVar.f560h;
            this.f571h = oVar.f561i;
            this.f572i = oVar.f562j;
            this.f573j = oVar.f563k;
        }
    }

    static {
        C6585d1.m19945a("goog.exo.datasource");
    }

    public static String m42202c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public C0161b m42204a() {
        return new C0161b();
    }

    public final String m42203b() {
        return m42202c(this.f555c);
    }

    public boolean m42201d(int i) {
        return (this.f562j & i) == i;
    }

    public String toString() {
        String b = m42203b();
        String valueOf = String.valueOf(this.f553a);
        long j = this.f559g;
        long j2 = this.f560h;
        String str = this.f561i;
        int i = this.f562j;
        StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 70 + valueOf.length() + String.valueOf(str).length());
        sb2.append("DataSpec[");
        sb2.append(b);
        sb2.append(" ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(j);
        sb2.append(", ");
        sb2.append(j2);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(i);
        sb2.append("]");
        return sb2.toString();
    }

    public C0159o(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        C1186a.m38189a(j4 >= 0);
        C1186a.m38189a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C1186a.m38189a(z);
        this.f553a = uri;
        this.f554b = j;
        this.f555c = i;
        this.f556d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f557e = Collections.unmodifiableMap(new HashMap(map));
        this.f559g = j2;
        this.f558f = j4;
        this.f560h = j3;
        this.f561i = str;
        this.f562j = i2;
        this.f563k = obj;
    }
}
