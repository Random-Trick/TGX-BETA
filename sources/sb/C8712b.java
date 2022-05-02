package sb;

import java.util.Random;
import p252rb.C8423d;
import qa.C8298k;

public final class C8712b {
    public double f28064a;
    public Double f28065b;
    public float f28066c;
    public Float f28067d;
    public float f28068e = -1.0f;
    public float f28069f = 1.0f;
    public float f28070g = 0.2f;
    public final Random f28071h;

    public C8712b(Random random) {
        C8298k.m12934e(random, "random");
        this.f28071h = random;
    }

    public final float m11698a() {
        return this.f28068e;
    }

    public final double m11697b() {
        Double d = this.f28065b;
        if (d == null) {
            return this.f28064a;
        }
        C8298k.m12936c(d);
        return ((d.doubleValue() - this.f28064a) * this.f28071h.nextDouble()) + this.f28064a;
    }

    public final float m11696c() {
        float f = this.f28069f;
        return f + (this.f28070g * f * ((this.f28071h.nextFloat() * 2.0f) - 1.0f));
    }

    public final float m11695d() {
        Float f = this.f28067d;
        if (f == null) {
            return this.f28066c;
        }
        C8298k.m12936c(f);
        return ((f.floatValue() - this.f28066c) * this.f28071h.nextFloat()) + this.f28066c;
    }

    public final C8423d m11694e() {
        float d = m11695d();
        double b = m11697b();
        return new C8423d(((float) Math.cos(b)) * d, d * ((float) Math.sin(b)));
    }

    public final void m11693f(Double d) {
        this.f28065b = d;
    }

    public final void m11692g(Float f) {
        C8298k.m12936c(f);
        if (f.floatValue() < 0) {
            f = Float.valueOf(0.0f);
        }
        this.f28067d = f;
    }

    public final void m11691h(double d) {
        this.f28064a = d;
    }

    public final void m11690i(float f) {
        if (f < 0) {
            f = 0.0f;
        }
        this.f28066c = f;
    }
}
