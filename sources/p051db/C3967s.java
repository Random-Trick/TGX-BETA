package p051db;

public class C3967s {
    public float f13332a;
    public float f13333b;
    public float f13334c;

    public C3967s(float f) {
        m29456e(f);
    }

    public boolean m29460a(float f) {
        float f2 = this.f13333b;
        float f3 = f2 + ((this.f13334c - f2) * f);
        if (this.f13332a == f3) {
            return false;
        }
        this.f13332a = f3;
        return true;
    }

    public boolean m29459b(float f) {
        return this.f13334c != f;
    }

    public void m29458c(boolean z) {
        if (z) {
            float f = this.f13334c;
            this.f13332a = f;
            this.f13333b = f;
            return;
        }
        this.f13333b = this.f13332a;
    }

    public float m29457d() {
        return this.f13332a;
    }

    public void m29456e(float f) {
        this.f13333b = f;
        this.f13334c = f;
        this.f13332a = f;
    }

    public void m29455f(float f) {
        this.f13333b = f;
    }

    public void m29454g(float f) {
        this.f13334c = f;
    }
}
