package p278tb;

import java.util.concurrent.TimeUnit;
import qa.C8294g;
import qa.C8298k;
import za.C11452o;

public final class C9075d {
    public final boolean f29085a;
    public final boolean f29086b;
    public final int f29087c;
    public final int f29088d;
    public final boolean f29089e;
    public final boolean f29090f;
    public final boolean f29091g;
    public final int f29092h;
    public final int f29093i;
    public final boolean f29094j;
    public final boolean f29095k;
    public final boolean f29096l;
    public String f29097m;
    public static final C9077b f29084p = new C9077b(null);
    public static final C9075d f29082n = new C9076a().m10531d().m10534a();
    public static final C9075d f29083o = new C9076a().m10530e().m10532c(Integer.MAX_VALUE, TimeUnit.SECONDS).m10534a();

    public static final class C9076a {
        public boolean f29098a;
        public boolean f29099b;
        public int f29100c = -1;
        public int f29101d = -1;
        public int f29102e = -1;
        public boolean f29103f;
        public boolean f29104g;
        public boolean f29105h;

        public final C9075d m10534a() {
            return new C9075d(this.f29098a, this.f29099b, this.f29100c, -1, false, false, false, this.f29101d, this.f29102e, this.f29103f, this.f29104g, this.f29105h, null, null);
        }

        public final int m10533b(long j) {
            if (j > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final C9076a m10532c(int i, TimeUnit timeUnit) {
            C8298k.m12933e(timeUnit, "timeUnit");
            if (i >= 0) {
                this.f29101d = m10533b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        public final C9076a m10531d() {
            this.f29098a = true;
            return this;
        }

        public final C9076a m10530e() {
            this.f29103f = true;
            return this;
        }
    }

    public static final class C9077b {
        public C9077b() {
        }

        public final int m10529a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C11452o.m619B(str2, str.charAt(i), false, 2, null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public final p278tb.C9075d m10528b(p278tb.C9122v r32) {
            throw new UnsupportedOperationException("Method not decompiled: p278tb.C9075d.C9077b.m10528b(tb.v):tb.d");
        }

        public C9077b(C8294g gVar) {
            this();
        }
    }

    public C9075d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f29085a = z;
        this.f29086b = z2;
        this.f29087c = i;
        this.f29088d = i2;
        this.f29089e = z3;
        this.f29090f = z4;
        this.f29091g = z5;
        this.f29092h = i3;
        this.f29093i = i4;
        this.f29094j = z6;
        this.f29095k = z7;
        this.f29096l = z8;
        this.f29097m = str;
    }

    public final boolean m10543a() {
        return this.f29089e;
    }

    public final boolean m10542b() {
        return this.f29090f;
    }

    public final int m10541c() {
        return this.f29087c;
    }

    public final int m10540d() {
        return this.f29092h;
    }

    public final int m10539e() {
        return this.f29093i;
    }

    public final boolean m10538f() {
        return this.f29091g;
    }

    public final boolean m10537g() {
        return this.f29085a;
    }

    public final boolean m10536h() {
        return this.f29086b;
    }

    public final boolean m10535i() {
        return this.f29094j;
    }

    public String toString() {
        String str = this.f29097m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f29085a) {
            sb2.append("no-cache, ");
        }
        if (this.f29086b) {
            sb2.append("no-store, ");
        }
        if (this.f29087c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f29087c);
            sb2.append(", ");
        }
        if (this.f29088d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f29088d);
            sb2.append(", ");
        }
        if (this.f29089e) {
            sb2.append("private, ");
        }
        if (this.f29090f) {
            sb2.append("public, ");
        }
        if (this.f29091g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f29092h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f29092h);
            sb2.append(", ");
        }
        if (this.f29093i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f29093i);
            sb2.append(", ");
        }
        if (this.f29094j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f29095k) {
            sb2.append("no-transform, ");
        }
        if (this.f29096l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        C8298k.m12934d(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f29097m = sb3;
        return sb3;
    }

    public C9075d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C8294g gVar) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
