package sb;

import java.util.Random;
import p252rb.C8423d;
import qa.C8298k;

public final class C8712b {
    public double f28067a;
    public Double f28068b;
    public float f28069c;
    public Float f28070d;
    public float f28071e = -1.0f;
    public float f28072f = 1.0f;
    public float f28073g = 0.2f;
    public final Random f28074h;

    public C8712b(Random random) {
        C8298k.m12933e(random, "random");
        this.f28074h = random;
    }

    public final float m11697a() {
        return this.f28071e;
    }

    public final double m11696b() {
        Double d = this.f28068b;
        if (d == null) {
            return this.f28067a;
        }
        C8298k.m12935c(d);
        return ((d.doubleValue() - this.f28067a) * this.f28074h.nextDouble()) + this.f28067a;
    }

    public final float m11695c() {
        float f = this.f28072f;
        return f + (this.f28073g * f * ((this.f28074h.nextFloat() * 2.0f) - 1.0f));
    }

    public final float m11694d() {
        Float f = this.f28070d;
        if (f == null) {
            return this.f28069c;
        }
        C8298k.m12935c(f);
        return ((f.floatValue() - this.f28069c) * this.f28074h.nextFloat()) + this.f28069c;
    }

    public final C8423d m11693e() {
        float d = m11694d();
        double b = m11696b();
        return new C8423d(((float) Math.cos(b)) * d, d * ((float) Math.sin(b)));
    }

    public final void m11692f(Double d) {
        this.f28068b = d;
    }

    public final void m11691g(Float f) {
        C8298k.m12935c(f);
        if (f.floatValue() < 0) {
            f = Float.valueOf(0.0f);
        }
        this.f28070d = f;
    }

    public final void m11690h(double d) {
        this.f28067a = d;
    }

    public final void m11689i(float f) {
        if (f < 0) {
            f = 0.0f;
        }
        this.f28069c = f;
    }
}
