package x4;

import android.text.Layout;

public final class g {
    public String f26033a;
    public int f26034b;
    public boolean f26035c;
    public int f26036d;
    public boolean f26037e;
    public float f26043k;
    public String f26044l;
    public Layout.Alignment f26047o;
    public Layout.Alignment f26048p;
    public b f26050r;
    public int f26038f = -1;
    public int f26039g = -1;
    public int f26040h = -1;
    public int f26041i = -1;
    public int f26042j = -1;
    public int f26045m = -1;
    public int f26046n = -1;
    public int f26049q = -1;
    public float f26051s = Float.MAX_VALUE;

    public g A(String str) {
        this.f26044l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f26041i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f26038f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f26048p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f26046n = i10;
        return this;
    }

    public g F(int i10) {
        this.f26045m = i10;
        return this;
    }

    public g G(float f10) {
        this.f26051s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f26047o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f26049q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f26050r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f26039g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f26037e) {
            return this.f26036d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f26035c) {
            return this.f26034b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f26033a;
    }

    public float e() {
        return this.f26043k;
    }

    public int f() {
        return this.f26042j;
    }

    public String g() {
        return this.f26044l;
    }

    public Layout.Alignment h() {
        return this.f26048p;
    }

    public int i() {
        return this.f26046n;
    }

    public int j() {
        return this.f26045m;
    }

    public float k() {
        return this.f26051s;
    }

    public int l() {
        int i10 = this.f26040h;
        if (i10 == -1 && this.f26041i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f26041i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public Layout.Alignment m() {
        return this.f26047o;
    }

    public boolean n() {
        return this.f26049q == 1;
    }

    public b o() {
        return this.f26050r;
    }

    public boolean p() {
        return this.f26037e;
    }

    public boolean q() {
        return this.f26035c;
    }

    public final g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f26035c && gVar.f26035c) {
                w(gVar.f26034b);
            }
            if (this.f26040h == -1) {
                this.f26040h = gVar.f26040h;
            }
            if (this.f26041i == -1) {
                this.f26041i = gVar.f26041i;
            }
            if (this.f26033a == null && (str = gVar.f26033a) != null) {
                this.f26033a = str;
            }
            if (this.f26038f == -1) {
                this.f26038f = gVar.f26038f;
            }
            if (this.f26039g == -1) {
                this.f26039g = gVar.f26039g;
            }
            if (this.f26046n == -1) {
                this.f26046n = gVar.f26046n;
            }
            if (this.f26047o == null && (alignment2 = gVar.f26047o) != null) {
                this.f26047o = alignment2;
            }
            if (this.f26048p == null && (alignment = gVar.f26048p) != null) {
                this.f26048p = alignment;
            }
            if (this.f26049q == -1) {
                this.f26049q = gVar.f26049q;
            }
            if (this.f26042j == -1) {
                this.f26042j = gVar.f26042j;
                this.f26043k = gVar.f26043k;
            }
            if (this.f26050r == null) {
                this.f26050r = gVar.f26050r;
            }
            if (this.f26051s == Float.MAX_VALUE) {
                this.f26051s = gVar.f26051s;
            }
            if (z10 && !this.f26037e && gVar.f26037e) {
                u(gVar.f26036d);
            }
            if (z10 && this.f26045m == -1 && (i10 = gVar.f26045m) != -1) {
                this.f26045m = i10;
            }
        }
        return this;
    }

    public boolean s() {
        return this.f26038f == 1;
    }

    public boolean t() {
        return this.f26039g == 1;
    }

    public g u(int i10) {
        this.f26036d = i10;
        this.f26037e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f26040h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f26034b = i10;
        this.f26035c = true;
        return this;
    }

    public g x(String str) {
        this.f26033a = str;
        return this;
    }

    public g y(float f10) {
        this.f26043k = f10;
        return this;
    }

    public g z(int i10) {
        this.f26042j = i10;
        return this;
    }
}
