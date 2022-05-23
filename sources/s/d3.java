package s;

import androidx.camera.core.l3;

public class d3 implements l3 {
    public float f21995a;
    public final float f21996b;
    public final float f21997c;
    public float f21998d;

    public d3(float f10, float f11) {
        this.f21996b = f10;
        this.f21997c = f11;
    }

    @Override
    public float a() {
        return this.f21996b;
    }

    @Override
    public float b() {
        return this.f21997c;
    }

    @Override
    public float c() {
        return this.f21995a;
    }

    @Override
    public float d() {
        return this.f21998d;
    }

    public final float e(float f10) {
        float f11 = this.f21996b;
        float f12 = this.f21997c;
        if (f11 == f12) {
            return 0.0f;
        }
        if (f10 == f11) {
            return 1.0f;
        }
        if (f10 == f12) {
            return 0.0f;
        }
        float f13 = 1.0f / f12;
        return ((1.0f / f10) - f13) / ((1.0f / f11) - f13);
    }

    public void f(float f10) {
        if (f10 > this.f21996b || f10 < this.f21997c) {
            throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f21997c + " , " + this.f21996b + "]");
        }
        this.f21995a = f10;
        this.f21998d = e(f10);
    }
}
