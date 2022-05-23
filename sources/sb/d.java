package sb;

import ra.g;
import ra.k;

public final class d {
    public float f22702a;
    public float f22703b;

    public d() {
        this(0.0f, 0.0f, 3, null);
    }

    public d(float f10, float f11) {
        this.f22702a = f10;
        this.f22703b = f11;
    }

    public final void a(d dVar) {
        k.e(dVar, "v");
        this.f22702a += dVar.f22702a;
        this.f22703b += dVar.f22703b;
    }

    public final void b(d dVar, float f10) {
        k.e(dVar, "v");
        this.f22702a += dVar.f22702a * f10;
        this.f22703b += dVar.f22703b * f10;
    }

    public final float c() {
        return this.f22702a;
    }

    public final float d() {
        return this.f22703b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f22702a, dVar.f22702a) == 0 && Float.compare(this.f22703b, dVar.f22703b) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f22702a) * 31) + Float.floatToIntBits(this.f22703b);
    }

    public String toString() {
        return "Vector(x=" + this.f22702a + ", y=" + this.f22703b + ")";
    }

    public d(float f10, float f11, int i10, g gVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
