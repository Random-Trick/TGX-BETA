package sb;

import java.util.Random;
import qa.C8298k;

public final class C8711a {
    public float f28059a;
    public Float f28060b;
    public float f28061c;
    public Float f28062d;
    public final Random f28063e;

    public C8711a(Random random) {
        C8298k.m12934e(random, "random");
        this.f28063e = random;
    }

    public final float m11702a() {
        if (this.f28060b == null) {
            return this.f28059a;
        }
        float nextFloat = this.f28063e.nextFloat();
        Float f = this.f28060b;
        C8298k.m12936c(f);
        float floatValue = f.floatValue();
        float f2 = this.f28059a;
        return (nextFloat * (floatValue - f2)) + f2;
    }

    public final float m11701b() {
        if (this.f28062d == null) {
            return this.f28061c;
        }
        float nextFloat = this.f28063e.nextFloat();
        Float f = this.f28062d;
        C8298k.m12936c(f);
        float floatValue = f.floatValue();
        float f2 = this.f28061c;
        return (nextFloat * (floatValue - f2)) + f2;
    }

    public final void m11700c(float f) {
        this.f28059a = f;
    }

    public final void m11699d(float f) {
        this.f28061c = f;
    }
}
