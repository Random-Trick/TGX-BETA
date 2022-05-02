package p311w4;

import android.text.Layout;

public final class C9977g {
    public String f32441a;
    public int f32442b;
    public boolean f32443c;
    public int f32444d;
    public boolean f32445e;
    public float f32451k;
    public String f32452l;
    public Layout.Alignment f32455o;
    public Layout.Alignment f32456p;
    public C9969b f32458r;
    public int f32446f = -1;
    public int f32447g = -1;
    public int f32448h = -1;
    public int f32449i = -1;
    public int f32450j = -1;
    public int f32453m = -1;
    public int f32454n = -1;
    public int f32457q = -1;
    public float f32459s = Float.MAX_VALUE;

    public C9977g m6349A(String str) {
        this.f32452l = str;
        return this;
    }

    public C9977g m6348B(boolean z) {
        this.f32449i = z ? 1 : 0;
        return this;
    }

    public C9977g m6347C(boolean z) {
        this.f32446f = z ? 1 : 0;
        return this;
    }

    public C9977g m6346D(Layout.Alignment alignment) {
        this.f32456p = alignment;
        return this;
    }

    public C9977g m6345E(int i) {
        this.f32454n = i;
        return this;
    }

    public C9977g m6344F(int i) {
        this.f32453m = i;
        return this;
    }

    public C9977g m6343G(float f) {
        this.f32459s = f;
        return this;
    }

    public C9977g m6342H(Layout.Alignment alignment) {
        this.f32455o = alignment;
        return this;
    }

    public C9977g m6341I(boolean z) {
        this.f32457q = z ? 1 : 0;
        return this;
    }

    public C9977g m6340J(C9969b bVar) {
        this.f32458r = bVar;
        return this;
    }

    public C9977g m6339K(boolean z) {
        this.f32447g = z ? 1 : 0;
        return this;
    }

    public C9977g m6338a(C9977g gVar) {
        return m6321r(gVar, true);
    }

    public int m6337b() {
        if (this.f32445e) {
            return this.f32444d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int m6336c() {
        if (this.f32443c) {
            return this.f32442b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String m6335d() {
        return this.f32441a;
    }

    public float m6334e() {
        return this.f32451k;
    }

    public int m6333f() {
        return this.f32450j;
    }

    public String m6332g() {
        return this.f32452l;
    }

    public Layout.Alignment m6331h() {
        return this.f32456p;
    }

    public int m6330i() {
        return this.f32454n;
    }

    public int m6329j() {
        return this.f32453m;
    }

    public float m6328k() {
        return this.f32459s;
    }

    public int m6327l() {
        int i = this.f32448h;
        if (i == -1 && this.f32449i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f32449i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public Layout.Alignment m6326m() {
        return this.f32455o;
    }

    public boolean m6325n() {
        return this.f32457q == 1;
    }

    public C9969b m6324o() {
        return this.f32458r;
    }

    public boolean m6323p() {
        return this.f32445e;
    }

    public boolean m6322q() {
        return this.f32443c;
    }

    public final C9977g m6321r(C9977g gVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f32443c && gVar.f32443c) {
                m6316w(gVar.f32442b);
            }
            if (this.f32448h == -1) {
                this.f32448h = gVar.f32448h;
            }
            if (this.f32449i == -1) {
                this.f32449i = gVar.f32449i;
            }
            if (this.f32441a == null && (str = gVar.f32441a) != null) {
                this.f32441a = str;
            }
            if (this.f32446f == -1) {
                this.f32446f = gVar.f32446f;
            }
            if (this.f32447g == -1) {
                this.f32447g = gVar.f32447g;
            }
            if (this.f32454n == -1) {
                this.f32454n = gVar.f32454n;
            }
            if (this.f32455o == null && (alignment2 = gVar.f32455o) != null) {
                this.f32455o = alignment2;
            }
            if (this.f32456p == null && (alignment = gVar.f32456p) != null) {
                this.f32456p = alignment;
            }
            if (this.f32457q == -1) {
                this.f32457q = gVar.f32457q;
            }
            if (this.f32450j == -1) {
                this.f32450j = gVar.f32450j;
                this.f32451k = gVar.f32451k;
            }
            if (this.f32458r == null) {
                this.f32458r = gVar.f32458r;
            }
            if (this.f32459s == Float.MAX_VALUE) {
                this.f32459s = gVar.f32459s;
            }
            if (z && !this.f32445e && gVar.f32445e) {
                m6318u(gVar.f32444d);
            }
            if (z && this.f32453m == -1 && (i = gVar.f32453m) != -1) {
                this.f32453m = i;
            }
        }
        return this;
    }

    public boolean m6320s() {
        return this.f32446f == 1;
    }

    public boolean m6319t() {
        return this.f32447g == 1;
    }

    public C9977g m6318u(int i) {
        this.f32444d = i;
        this.f32445e = true;
        return this;
    }

    public C9977g m6317v(boolean z) {
        this.f32448h = z ? 1 : 0;
        return this;
    }

    public C9977g m6316w(int i) {
        this.f32442b = i;
        this.f32443c = true;
        return this;
    }

    public C9977g m6315x(String str) {
        this.f32441a = str;
        return this;
    }

    public C9977g m6314y(float f) {
        this.f32451k = f;
        return this;
    }

    public C9977g m6313z(int i) {
        this.f32450j = i;
        return this;
    }
}
