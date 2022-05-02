package p051db;

public class C3967s {
    public float f13332a;
    public float f13333b;
    public float f13334c;

    public C3967s(float f) {
        m29454e(f);
    }

    public boolean m29458a(float f) {
        float f2 = this.f13333b;
        float f3 = f2 + ((this.f13334c - f2) * f);
        if (this.f13332a == f3) {
            return false;
        }
        this.f13332a = f3;
        return true;
    }

    public boolean m29457b(float f) {
        return this.f13334c != f;
    }

    public void m29456c(boolean z) {
        if (z) {
            float f = this.f13334c;
            this.f13332a = f;
            this.f13333b = f;
            return;
        }
        this.f13333b = this.f13332a;
    }

    public float m29455d() {
        return this.f13332a;
    }

    public void m29454e(float f) {
        this.f13333b = f;
        this.f13334c = f;
        this.f13332a = f;
    }

    public void m29453f(float f) {
        this.f13333b = f;
    }

    public void m29452g(float f) {
        this.f13334c = f;
    }
}
