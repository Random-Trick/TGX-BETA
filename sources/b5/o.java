package b5;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m3.n1;

public final class o {
    public final Uri f3904a;
    public final long f3905b;
    public final int f3906c;
    public final byte[] f3907d;
    public final Map<String, String> f3908e;
    @Deprecated
    public final long f3909f;
    public final long f3910g;
    public final long f3911h;
    public final String f3912i;
    public final int f3913j;
    public final Object f3914k;

    public static final class b {
        public Uri f3915a;
        public long f3916b;
        public int f3917c;
        public byte[] f3918d;
        public Map<String, String> f3919e;
        public long f3920f;
        public long f3921g;
        public String f3922h;
        public int f3923i;
        public Object f3924j;

        public o a() {
            c5.a.i(this.f3915a, "The uri must be set.");
            return new o(this.f3915a, this.f3916b, this.f3917c, this.f3918d, this.f3919e, this.f3920f, this.f3921g, this.f3922h, this.f3923i, this.f3924j);
        }

        public b b(int i10) {
            this.f3923i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f3918d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f3917c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f3919e = map;
            return this;
        }

        public b f(String str) {
            this.f3922h = str;
            return this;
        }

        public b g(long j10) {
            this.f3920f = j10;
            return this;
        }

        public b h(Uri uri) {
            this.f3915a = uri;
            return this;
        }

        public b i(String str) {
            this.f3915a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f3917c = 1;
            this.f3919e = Collections.emptyMap();
            this.f3921g = -1L;
        }

        public b(o oVar) {
            this.f3915a = oVar.f3904a;
            this.f3916b = oVar.f3905b;
            this.f3917c = oVar.f3906c;
            this.f3918d = oVar.f3907d;
            this.f3919e = oVar.f3908e;
            this.f3920f = oVar.f3910g;
            this.f3921g = oVar.f3911h;
            this.f3922h = oVar.f3912i;
            this.f3923i = oVar.f3913j;
            this.f3924j = oVar.f3914k;
        }
    }

    static {
        n1.a("goog.exo.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f3906c);
    }

    public boolean d(int i10) {
        return (this.f3913j & i10) == i10;
    }

    public String toString() {
        String b10 = b();
        String valueOf = String.valueOf(this.f3904a);
        long j10 = this.f3910g;
        long j11 = this.f3911h;
        String str = this.f3912i;
        int i10 = this.f3913j;
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 70 + valueOf.length() + String.valueOf(str).length());
        sb2.append("DataSpec[");
        sb2.append(b10);
        sb2.append(" ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    public o(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        c5.a.a(j13 >= 0);
        c5.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        c5.a.a(z10);
        this.f3904a = uri;
        this.f3905b = j10;
        this.f3906c = i10;
        this.f3907d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f3908e = Collections.unmodifiableMap(new HashMap(map));
        this.f3910g = j11;
        this.f3909f = j13;
        this.f3911h = j12;
        this.f3912i = str;
        this.f3913j = i11;
        this.f3914k = obj;
    }
}
