package eb;

public class s {
    public float f11491a;
    public float f11492b;
    public float f11493c;

    public s(float f10) {
        e(f10);
    }

    public boolean a(float f10) {
        float f11 = this.f11492b;
        float f12 = f11 + ((this.f11493c - f11) * f10);
        if (this.f11491a == f12) {
            return false;
        }
        this.f11491a = f12;
        return true;
    }

    public boolean b(float f10) {
        return this.f11493c != f10;
    }

    public void c(boolean z10) {
        if (z10) {
            float f10 = this.f11493c;
            this.f11491a = f10;
            this.f11492b = f10;
            return;
        }
        this.f11492b = this.f11491a;
    }

    public float d() {
        return this.f11491a;
    }

    public void e(float f10) {
        this.f11492b = f10;
        this.f11493c = f10;
        this.f11491a = f10;
    }

    public void f(float f10) {
        this.f11492b = f10;
    }

    public void g(float f10) {
        this.f11493c = f10;
    }
}
