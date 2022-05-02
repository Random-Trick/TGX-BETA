package p051db;

import android.graphics.RectF;

public class C3968t implements AbstractC3936b {
    public final C3967s f13335M;
    public final RectF f13336N;
    public final C3967s f13337a;
    public final C3967s f13338b;
    public final C3967s f13339c;

    public C3968t() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public boolean mo26679a() {
        return C3935a.m29592b(this);
    }

    @Override
    public void mo26678b(boolean z) {
        this.f13337a.m29456c(z);
        this.f13338b.m29456c(z);
        this.f13339c.m29456c(z);
        this.f13335M.m29456c(z);
    }

    @Override
    public boolean mo26677c(float f) {
        return this.f13335M.m29458a(f) || (this.f13339c.m29458a(f) || (this.f13338b.m29458a(f) || this.f13337a.m29458a(f)));
    }

    public boolean m29451d(float f, float f2, float f3, float f4) {
        return this.f13337a.m29457b(f) || this.f13338b.m29457b(f2) || this.f13339c.m29457b(f3) || this.f13335M.m29457b(f4);
    }

    @Override
    public void mo26676e() {
        C3935a.m29593a(this);
    }

    @Override
    public void mo26675f() {
        C3935a.m29591c(this);
    }

    public float m29450g() {
        return this.f13335M.m29455d();
    }

    public float m29449h() {
        return this.f13337a.m29455d();
    }

    public float m29448i() {
        return this.f13339c.m29455d();
    }

    public float m29447j() {
        return this.f13338b.m29455d();
    }

    public void m29446k(float f, float f2, float f3, float f4) {
        this.f13337a.m29454e(f);
        this.f13338b.m29454e(f2);
        this.f13339c.m29454e(f3);
        this.f13335M.m29454e(f4);
    }

    public void m29445l(float f, float f2, float f3, float f4) {
        this.f13337a.m29452g(f);
        this.f13338b.m29452g(f2);
        this.f13339c.m29452g(f3);
        this.f13335M.m29452g(f4);
    }

    public RectF m29444m() {
        this.f13336N.set(m29449h(), m29447j(), m29448i(), m29450g());
        return this.f13336N;
    }

    public C3968t(float f, float f2, float f3, float f4) {
        this.f13336N = new RectF();
        this.f13337a = new C3967s(f);
        this.f13338b = new C3967s(f2);
        this.f13339c = new C3967s(f3);
        this.f13335M = new C3967s(f4);
    }
}
