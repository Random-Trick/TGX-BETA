package p255s;

import androidx.camera.core.AbstractC0620m3;

public class C8461d3 implements AbstractC0620m3 {
    public float f27450a;
    public final float f27451b;
    public final float f27452c;
    public float f27453d;

    public C8461d3(float f, float f2) {
        this.f27451b = f;
        this.f27452c = f2;
    }

    @Override
    public float mo12423a() {
        return this.f27451b;
    }

    @Override
    public float mo12422b() {
        return this.f27452c;
    }

    @Override
    public float mo12421c() {
        return this.f27450a;
    }

    @Override
    public float mo12420d() {
        return this.f27453d;
    }

    public final float m12419e(float f) {
        float f2 = this.f27451b;
        float f3 = this.f27452c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    public void m12418f(float f) {
        if (f > this.f27451b || f < this.f27452c) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f27452c + " , " + this.f27451b + "]");
        }
        this.f27450a = f;
        this.f27453d = m12419e(f);
    }
}
