package eb;

import android.graphics.RectF;

public class t implements b {
    public final s M;
    public final RectF N;
    public final s f11494a;
    public final s f11495b;
    public final s f11496c;

    public t() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public boolean a() {
        return a.b(this);
    }

    @Override
    public void b(boolean z10) {
        this.f11494a.c(z10);
        this.f11495b.c(z10);
        this.f11496c.c(z10);
        this.M.c(z10);
    }

    @Override
    public boolean c(float f10) {
        return this.M.a(f10) || (this.f11496c.a(f10) || (this.f11495b.a(f10) || this.f11494a.a(f10)));
    }

    public boolean d(float f10, float f11, float f12, float f13) {
        return this.f11494a.b(f10) || this.f11495b.b(f11) || this.f11496c.b(f12) || this.M.b(f13);
    }

    @Override
    public void e() {
        a.a(this);
    }

    @Override
    public void f() {
        a.c(this);
    }

    public float g() {
        return this.M.d();
    }

    public float h() {
        return this.f11494a.d();
    }

    public float i() {
        return this.f11496c.d();
    }

    public float j() {
        return this.f11495b.d();
    }

    public void k(float f10, float f11, float f12, float f13) {
        this.f11494a.e(f10);
        this.f11495b.e(f11);
        this.f11496c.e(f12);
        this.M.e(f13);
    }

    public void l(float f10, float f11, float f12, float f13) {
        this.f11494a.g(f10);
        this.f11495b.g(f11);
        this.f11496c.g(f12);
        this.M.g(f13);
    }

    public RectF m() {
        this.N.set(h(), j(), i(), g());
        return this.N;
    }

    public t(float f10, float f11, float f12, float f13) {
        this.N = new RectF();
        this.f11494a = new s(f10);
        this.f11495b = new s(f11);
        this.f11496c = new s(f12);
        this.M = new s(f13);
    }
}
