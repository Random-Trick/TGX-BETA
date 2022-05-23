package tb;

import java.util.Random;
import ra.k;

public final class a {
    public float f23019a;
    public Float f23020b;
    public float f23021c;
    public Float f23022d;
    public final Random f23023e;

    public a(Random random) {
        k.e(random, "random");
        this.f23023e = random;
    }

    public final float a() {
        if (this.f23020b == null) {
            return this.f23019a;
        }
        float nextFloat = this.f23023e.nextFloat();
        Float f10 = this.f23020b;
        k.c(f10);
        float floatValue = f10.floatValue();
        float f11 = this.f23019a;
        return (nextFloat * (floatValue - f11)) + f11;
    }

    public final float b() {
        if (this.f23022d == null) {
            return this.f23021c;
        }
        float nextFloat = this.f23023e.nextFloat();
        Float f10 = this.f23022d;
        k.c(f10);
        float floatValue = f10.floatValue();
        float f11 = this.f23021c;
        return (nextFloat * (floatValue - f11)) + f11;
    }

    public final void c(float f10) {
        this.f23019a = f10;
    }

    public final void d(float f10) {
        this.f23021c = f10;
    }
}
