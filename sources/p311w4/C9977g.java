package p311w4;

import android.text.Layout;

public final class C9977g {
    public String f32438a;
    public int f32439b;
    public boolean f32440c;
    public int f32441d;
    public boolean f32442e;
    public float f32448k;
    public String f32449l;
    public Layout.Alignment f32452o;
    public Layout.Alignment f32453p;
    public C9969b f32455r;
    public int f32443f = -1;
    public int f32444g = -1;
    public int f32445h = -1;
    public int f32446i = -1;
    public int f32447j = -1;
    public int f32450m = -1;
    public int f32451n = -1;
    public int f32454q = -1;
    public float f32456s = Float.MAX_VALUE;

    public C9977g m6349A(String str) {
        this.f32449l = str;
        return this;
    }

    public C9977g m6348B(boolean z) {
        this.f32446i = z ? 1 : 0;
        return this;
    }

    public C9977g m6347C(boolean z) {
        this.f32443f = z ? 1 : 0;
        return this;
    }

    public C9977g m6346D(Layout.Alignment alignment) {
        this.f32453p = alignment;
        return this;
    }

    public C9977g m6345E(int i) {
        this.f32451n = i;
        return this;
    }

    public C9977g m6344F(int i) {
        this.f32450m = i;
        return this;
    }

    public C9977g m6343G(float f) {
        this.f32456s = f;
        return this;
    }

    public C9977g m6342H(Layout.Alignment alignment) {
        this.f32452o = alignment;
        return this;
    }

    public C9977g m6341I(boolean z) {
        this.f32454q = z ? 1 : 0;
        return this;
    }

    public C9977g m6340J(C9969b bVar) {
        this.f32455r = bVar;
        return this;
    }

    public C9977g m6339K(boolean z) {
        this.f32444g = z ? 1 : 0;
        return this;
    }

    public C9977g m6338a(C9977g gVar) {
        return m6321r(gVar, true);
    }

    public int m6337b() {
        if (this.f32442e) {
            return this.f32441d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int m6336c() {
        if (this.f32440c) {
            return this.f32439b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String m6335d() {
        return this.f32438a;
    }

    public float m6334e() {
        return this.f32448k;
    }

    public int m6333f() {
        return this.f32447j;
    }

    public String m6332g() {
        return this.f32449l;
    }

    public Layout.Alignment m6331h() {
        return this.f32453p;
    }

    public int m6330i() {
        return this.f32451n;
    }

    public int m6329j() {
        return this.f32450m;
    }

    public float m6328k() {
        return this.f32456s;
    }

    public int m6327l() {
        int i = this.f32445h;
        if (i == -1 && this.f32446i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f32446i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public Layout.Alignment m6326m() {
        return this.f32452o;
    }

    public boolean m6325n() {
        return this.f32454q == 1;
    }

    public C9969b m6324o() {
        return this.f32455r;
    }

    public boolean m6323p() {
        return this.f32442e;
    }

    public boolean m6322q() {
        return this.f32440c;
    }

    public final C9977g m6321r(C9977g gVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f32440c && gVar.f32440c) {
                m6316w(gVar.f32439b);
            }
            if (this.f32445h == -1) {
                this.f32445h = gVar.f32445h;
            }
            if (this.f32446i == -1) {
                this.f32446i = gVar.f32446i;
            }
            if (this.f32438a == null && (str = gVar.f32438a) != null) {
                this.f32438a = str;
            }
            if (this.f32443f == -1) {
                this.f32443f = gVar.f32443f;
            }
            if (this.f32444g == -1) {
                this.f32444g = gVar.f32444g;
            }
            if (this.f32451n == -1) {
                this.f32451n = gVar.f32451n;
            }
            if (this.f32452o == null && (alignment2 = gVar.f32452o) != null) {
                this.f32452o = alignment2;
            }
            if (this.f32453p == null && (alignment = gVar.f32453p) != null) {
                this.f32453p = alignment;
            }
            if (this.f32454q == -1) {
                this.f32454q = gVar.f32454q;
            }
            if (this.f32447j == -1) {
                this.f32447j = gVar.f32447j;
                this.f32448k = gVar.f32448k;
            }
            if (this.f32455r == null) {
                this.f32455r = gVar.f32455r;
            }
            if (this.f32456s == Float.MAX_VALUE) {
                this.f32456s = gVar.f32456s;
            }
            if (z && !this.f32442e && gVar.f32442e) {
                m6318u(gVar.f32441d);
            }
            if (z && this.f32450m == -1 && (i = gVar.f32450m) != -1) {
                this.f32450m = i;
            }
        }
        return this;
    }

    public boolean m6320s() {
        return this.f32443f == 1;
    }

    public boolean m6319t() {
        return this.f32444g == 1;
    }

    public C9977g m6318u(int i) {
        this.f32441d = i;
        this.f32442e = true;
        return this;
    }

    public C9977g m6317v(boolean z) {
        this.f32445h = z ? 1 : 0;
        return this;
    }

    public C9977g m6316w(int i) {
        this.f32439b = i;
        this.f32440c = true;
        return this;
    }

    public C9977g m6315x(String str) {
        this.f32438a = str;
        return this;
    }

    public C9977g m6314y(float f) {
        this.f32448k = f;
        return this;
    }

    public C9977g m6313z(int i) {
        this.f32447j = i;
        return this;
    }
}
