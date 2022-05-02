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
    public boolean mo26680a() {
        return C3935a.m29594b(this);
    }

    @Override
    public void mo26679b(boolean z) {
        this.f13337a.m29458c(z);
        this.f13338b.m29458c(z);
        this.f13339c.m29458c(z);
        this.f13335M.m29458c(z);
    }

    @Override
    public boolean mo26678c(float f) {
        return this.f13335M.m29460a(f) || (this.f13339c.m29460a(f) || (this.f13338b.m29460a(f) || this.f13337a.m29460a(f)));
    }

    public boolean m29453d(float f, float f2, float f3, float f4) {
        return this.f13337a.m29459b(f) || this.f13338b.m29459b(f2) || this.f13339c.m29459b(f3) || this.f13335M.m29459b(f4);
    }

    @Override
    public void mo26677e() {
        C3935a.m29595a(this);
    }

    @Override
    public void mo26676f() {
        C3935a.m29593c(this);
    }

    public float m29452g() {
        return this.f13335M.m29457d();
    }

    public float m29451h() {
        return this.f13337a.m29457d();
    }

    public float m29450i() {
        return this.f13339c.m29457d();
    }

    public float m29449j() {
        return this.f13338b.m29457d();
    }

    public void m29448k(float f, float f2, float f3, float f4) {
        this.f13337a.m29456e(f);
        this.f13338b.m29456e(f2);
        this.f13339c.m29456e(f3);
        this.f13335M.m29456e(f4);
    }

    public void m29447l(float f, float f2, float f3, float f4) {
        this.f13337a.m29454g(f);
        this.f13338b.m29454g(f2);
        this.f13339c.m29454g(f3);
        this.f13335M.m29454g(f4);
    }

    public RectF m29446m() {
        this.f13336N.set(m29451h(), m29449j(), m29450i(), m29452g());
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
