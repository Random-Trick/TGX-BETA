package ub;

import ab.o;
import java.util.concurrent.TimeUnit;
import ra.g;
import ra.k;

public final class d {
    public final boolean f23756a;
    public final boolean f23757b;
    public final int f23758c;
    public final int f23759d;
    public final boolean f23760e;
    public final boolean f23761f;
    public final boolean f23762g;
    public final int f23763h;
    public final int f23764i;
    public final boolean f23765j;
    public final boolean f23766k;
    public final boolean f23767l;
    public String f23768m;
    public static final b f23755p = new b(null);
    public static final d f23753n = new a().d().a();
    public static final d f23754o = new a().e().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    public static final class a {
        public boolean f23769a;
        public boolean f23770b;
        public int f23771c = -1;
        public int f23772d = -1;
        public int f23773e = -1;
        public boolean f23774f;
        public boolean f23775g;
        public boolean f23776h;

        public final d a() {
            return new d(this.f23769a, this.f23770b, this.f23771c, -1, false, false, false, this.f23772d, this.f23773e, this.f23774f, this.f23775g, this.f23776h, null, null);
        }

        public final int b(long j10) {
            if (j10 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final a c(int i10, TimeUnit timeUnit) {
            k.e(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f23772d = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f23769a = true;
            return this;
        }

        public final a e() {
            this.f23774f = true;
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }

        public final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (o.B(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        public final ub.d b(ub.v r32) {
            throw new UnsupportedOperationException("Method not decompiled: ub.d.b.b(ub.v):ub.d");
        }
    }

    public d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f23756a = z10;
        this.f23757b = z11;
        this.f23758c = i10;
        this.f23759d = i11;
        this.f23760e = z12;
        this.f23761f = z13;
        this.f23762g = z14;
        this.f23763h = i12;
        this.f23764i = i13;
        this.f23765j = z15;
        this.f23766k = z16;
        this.f23767l = z17;
        this.f23768m = str;
    }

    public final boolean a() {
        return this.f23760e;
    }

    public final boolean b() {
        return this.f23761f;
    }

    public final int c() {
        return this.f23758c;
    }

    public final int d() {
        return this.f23763h;
    }

    public final int e() {
        return this.f23764i;
    }

    public final boolean f() {
        return this.f23762g;
    }

    public final boolean g() {
        return this.f23756a;
    }

    public final boolean h() {
        return this.f23757b;
    }

    public final boolean i() {
        return this.f23765j;
    }

    public String toString() {
        String str = this.f23768m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f23756a) {
            sb2.append("no-cache, ");
        }
        if (this.f23757b) {
            sb2.append("no-store, ");
        }
        if (this.f23758c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f23758c);
            sb2.append(", ");
        }
        if (this.f23759d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f23759d);
            sb2.append(", ");
        }
        if (this.f23760e) {
            sb2.append("private, ");
        }
        if (this.f23761f) {
            sb2.append("public, ");
        }
        if (this.f23762g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f23763h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f23763h);
            sb2.append(", ");
        }
        if (this.f23764i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f23764i);
            sb2.append(", ");
        }
        if (this.f23765j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f23766k) {
            sb2.append("no-transform, ");
        }
        if (this.f23767l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        k.d(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f23768m = sb3;
        return sb3;
    }

    public d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, g gVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }
}
