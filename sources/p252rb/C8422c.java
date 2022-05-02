package p252rb;

import android.content.res.Resources;
import qa.C8294g;
import qa.C8298k;

public final class C8422c {
    public final int f27333a;
    public final float f27334b;

    public C8422c(int i, float f) {
        this.f27333a = i;
        this.f27334b = f;
        if (!(f != 0.0f)) {
            throw new IllegalArgumentException(("mass=" + f + " must be != 0").toString());
        }
    }

    public final float m12530a() {
        return this.f27334b;
    }

    public final float m12529b() {
        Resources system = Resources.getSystem();
        C8298k.m12934d(system, "Resources.getSystem()");
        return this.f27333a * system.getDisplayMetrics().density;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8422c)) {
            return false;
        }
        C8422c cVar = (C8422c) obj;
        return this.f27333a == cVar.f27333a && Float.compare(this.f27334b, cVar.f27334b) == 0;
    }

    public int hashCode() {
        return (this.f27333a * 31) + Float.floatToIntBits(this.f27334b);
    }

    public String toString() {
        return "Size(sizeInDp=" + this.f27333a + ", mass=" + this.f27334b + ")";
    }

    public C8422c(int i, float f, int i2, C8294g gVar) {
        this(i, (i2 & 2) != 0 ? 5.0f : f);
    }
}
