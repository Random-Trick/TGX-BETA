package p255s;

import androidx.camera.core.AbstractC0620m3;

public class C8461d3 implements AbstractC0620m3 {
    public float f27453a;
    public final float f27454b;
    public final float f27455c;
    public float f27456d;

    public C8461d3(float f, float f2) {
        this.f27454b = f;
        this.f27455c = f2;
    }

    @Override
    public float mo12422a() {
        return this.f27454b;
    }

    @Override
    public float mo12421b() {
        return this.f27455c;
    }

    @Override
    public float mo12420c() {
        return this.f27453a;
    }

    @Override
    public float mo12419d() {
        return this.f27456d;
    }

    public final float m12418e(float f) {
        float f2 = this.f27454b;
        float f3 = this.f27455c;
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

    public void m12417f(float f) {
        if (f > this.f27454b || f < this.f27455c) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f27455c + " , " + this.f27454b + "]");
        }
        this.f27453a = f;
        this.f27456d = m12418e(f);
    }
}
