package p252rb;

import qa.C8294g;
import qa.C8298k;

public final class C8423d {
    public float f27335a;
    public float f27336b;

    public C8423d() {
        this(0.0f, 0.0f, 3, null);
    }

    public C8423d(float f, float f2) {
        this.f27335a = f;
        this.f27336b = f2;
    }

    public final void m12528a(C8423d dVar) {
        C8298k.m12933e(dVar, "v");
        this.f27335a += dVar.f27335a;
        this.f27336b += dVar.f27336b;
    }

    public final void m12527b(C8423d dVar, float f) {
        C8298k.m12933e(dVar, "v");
        this.f27335a += dVar.f27335a * f;
        this.f27336b += dVar.f27336b * f;
    }

    public final float m12526c() {
        return this.f27335a;
    }

    public final float m12525d() {
        return this.f27336b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8423d)) {
            return false;
        }
        C8423d dVar = (C8423d) obj;
        return Float.compare(this.f27335a, dVar.f27335a) == 0 && Float.compare(this.f27336b, dVar.f27336b) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f27335a) * 31) + Float.floatToIntBits(this.f27336b);
    }

    public String toString() {
        return "Vector(x=" + this.f27335a + ", y=" + this.f27336b + ")";
    }

    public C8423d(float f, float f2, int i, C8294g gVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
