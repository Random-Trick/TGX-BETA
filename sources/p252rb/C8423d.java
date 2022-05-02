package p252rb;

import qa.C8294g;
import qa.C8298k;

public final class C8423d {
    public float f27332a;
    public float f27333b;

    public C8423d() {
        this(0.0f, 0.0f, 3, null);
    }

    public C8423d(float f, float f2) {
        this.f27332a = f;
        this.f27333b = f2;
    }

    public final void m12529a(C8423d dVar) {
        C8298k.m12934e(dVar, "v");
        this.f27332a += dVar.f27332a;
        this.f27333b += dVar.f27333b;
    }

    public final void m12528b(C8423d dVar, float f) {
        C8298k.m12934e(dVar, "v");
        this.f27332a += dVar.f27332a * f;
        this.f27333b += dVar.f27333b * f;
    }

    public final float m12527c() {
        return this.f27332a;
    }

    public final float m12526d() {
        return this.f27333b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8423d)) {
            return false;
        }
        C8423d dVar = (C8423d) obj;
        return Float.compare(this.f27332a, dVar.f27332a) == 0 && Float.compare(this.f27333b, dVar.f27333b) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f27332a) * 31) + Float.floatToIntBits(this.f27333b);
    }

    public String toString() {
        return "Vector(x=" + this.f27332a + ", y=" + this.f27333b + ")";
    }

    public C8423d(float f, float f2, int i, C8294g gVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
