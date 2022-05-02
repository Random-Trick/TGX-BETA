package p278tb;

import java.util.concurrent.TimeUnit;
import qa.C8294g;
import qa.C8298k;
import za.C11452o;

public final class C9075d {
    public final boolean f29082a;
    public final boolean f29083b;
    public final int f29084c;
    public final int f29085d;
    public final boolean f29086e;
    public final boolean f29087f;
    public final boolean f29088g;
    public final int f29089h;
    public final int f29090i;
    public final boolean f29091j;
    public final boolean f29092k;
    public final boolean f29093l;
    public String f29094m;
    public static final C9077b f29081p = new C9077b(null);
    public static final C9075d f29079n = new C9076a().m10532d().m10535a();
    public static final C9075d f29080o = new C9076a().m10531e().m10533c(Integer.MAX_VALUE, TimeUnit.SECONDS).m10535a();

    public static final class C9076a {
        public boolean f29095a;
        public boolean f29096b;
        public int f29097c = -1;
        public int f29098d = -1;
        public int f29099e = -1;
        public boolean f29100f;
        public boolean f29101g;
        public boolean f29102h;

        public final C9075d m10535a() {
            return new C9075d(this.f29095a, this.f29096b, this.f29097c, -1, false, false, false, this.f29098d, this.f29099e, this.f29100f, this.f29101g, this.f29102h, null, null);
        }

        public final int m10534b(long j) {
            if (j > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final C9076a m10533c(int i, TimeUnit timeUnit) {
            C8298k.m12934e(timeUnit, "timeUnit");
            if (i >= 0) {
                this.f29098d = m10534b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        public final C9076a m10532d() {
            this.f29095a = true;
            return this;
        }

        public final C9076a m10531e() {
            this.f29100f = true;
            return this;
        }
    }

    public static final class C9077b {
        public C9077b() {
        }

        public final int m10530a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C11452o.m619B(str2, str.charAt(i), false, 2, null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public final p278tb.C9075d m10529b(p278tb.C9122v r32) {
            throw new UnsupportedOperationException("Method not decompiled: p278tb.C9075d.C9077b.m10529b(tb.v):tb.d");
        }

        public C9077b(C8294g gVar) {
            this();
        }
    }

    public C9075d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f29082a = z;
        this.f29083b = z2;
        this.f29084c = i;
        this.f29085d = i2;
        this.f29086e = z3;
        this.f29087f = z4;
        this.f29088g = z5;
        this.f29089h = i3;
        this.f29090i = i4;
        this.f29091j = z6;
        this.f29092k = z7;
        this.f29093l = z8;
        this.f29094m = str;
    }

    public final boolean m10544a() {
        return this.f29086e;
    }

    public final boolean m10543b() {
        return this.f29087f;
    }

    public final int m10542c() {
        return this.f29084c;
    }

    public final int m10541d() {
        return this.f29089h;
    }

    public final int m10540e() {
        return this.f29090i;
    }

    public final boolean m10539f() {
        return this.f29088g;
    }

    public final boolean m10538g() {
        return this.f29082a;
    }

    public final boolean m10537h() {
        return this.f29083b;
    }

    public final boolean m10536i() {
        return this.f29091j;
    }

    public String toString() {
        String str = this.f29094m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f29082a) {
            sb2.append("no-cache, ");
        }
        if (this.f29083b) {
            sb2.append("no-store, ");
        }
        if (this.f29084c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f29084c);
            sb2.append(", ");
        }
        if (this.f29085d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f29085d);
            sb2.append(", ");
        }
        if (this.f29086e) {
            sb2.append("private, ");
        }
        if (this.f29087f) {
            sb2.append("public, ");
        }
        if (this.f29088g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f29089h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f29089h);
            sb2.append(", ");
        }
        if (this.f29090i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f29090i);
            sb2.append(", ");
        }
        if (this.f29091j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f29092k) {
            sb2.append("no-transform, ");
        }
        if (this.f29093l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        C8298k.m12935d(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f29094m = sb3;
        return sb3;
    }

    public C9075d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C8294g gVar) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
