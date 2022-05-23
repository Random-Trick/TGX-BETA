package tb;

import java.util.Random;
import ra.k;
import sb.d;

public final class b {
    public double f23024a;
    public Double f23025b;
    public float f23026c;
    public Float f23027d;
    public float f23028e = -1.0f;
    public float f23029f = 1.0f;
    public float f23030g = 0.2f;
    public final Random f23031h;

    public b(Random random) {
        k.e(random, "random");
        this.f23031h = random;
    }

    public final float a() {
        return this.f23028e;
    }

    public final double b() {
        Double d10 = this.f23025b;
        if (d10 == null) {
            return this.f23024a;
        }
        k.c(d10);
        return ((d10.doubleValue() - this.f23024a) * this.f23031h.nextDouble()) + this.f23024a;
    }

    public final float c() {
        float f10 = this.f23029f;
        return f10 + (this.f23030g * f10 * ((this.f23031h.nextFloat() * 2.0f) - 1.0f));
    }

    public final float d() {
        Float f10 = this.f23027d;
        if (f10 == null) {
            return this.f23026c;
        }
        k.c(f10);
        return ((f10.floatValue() - this.f23026c) * this.f23031h.nextFloat()) + this.f23026c;
    }

    public final d e() {
        float d10 = d();
        double b10 = b();
        return new d(((float) Math.cos(b10)) * d10, d10 * ((float) Math.sin(b10)));
    }

    public final void f(Double d10) {
        this.f23025b = d10;
    }

    public final void g(Float f10) {
        k.c(f10);
        if (f10.floatValue() < 0) {
            f10 = Float.valueOf(0.0f);
        }
        this.f23027d = f10;
    }

    public final void h(double d10) {
        this.f23024a = d10;
    }

    public final void i(float f10) {
        if (f10 < 0) {
            f10 = 0.0f;
        }
        this.f23026c = f10;
    }
}
