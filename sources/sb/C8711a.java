package sb;

import java.util.Random;
import qa.C8298k;

public final class C8711a {
    public float f28062a;
    public Float f28063b;
    public float f28064c;
    public Float f28065d;
    public final Random f28066e;

    public C8711a(Random random) {
        C8298k.m12933e(random, "random");
        this.f28066e = random;
    }

    public final float m11701a() {
        if (this.f28063b == null) {
            return this.f28062a;
        }
        float nextFloat = this.f28066e.nextFloat();
        Float f = this.f28063b;
        C8298k.m12935c(f);
        float floatValue = f.floatValue();
        float f2 = this.f28062a;
        return (nextFloat * (floatValue - f2)) + f2;
    }

    public final float m11700b() {
        if (this.f28065d == null) {
            return this.f28064c;
        }
        float nextFloat = this.f28066e.nextFloat();
        Float f = this.f28065d;
        C8298k.m12935c(f);
        float floatValue = f.floatValue();
        float f2 = this.f28064c;
        return (nextFloat * (floatValue - f2)) + f2;
    }

    public final void m11699c(float f) {
        this.f28062a = f;
    }

    public final void m11698d(float f) {
        this.f28064c = f;
    }
}
