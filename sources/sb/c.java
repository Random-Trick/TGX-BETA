package sb;

import android.content.res.Resources;
import ra.g;
import ra.k;

public final class c {
    public final int f22700a;
    public final float f22701b;

    public c(int i10, float f10) {
        this.f22700a = i10;
        this.f22701b = f10;
        if (!(f10 != 0.0f)) {
            throw new IllegalArgumentException(("mass=" + f10 + " must be != 0").toString());
        }
    }

    public final float a() {
        return this.f22701b;
    }

    public final float b() {
        Resources system = Resources.getSystem();
        k.d(system, "Resources.getSystem()");
        return this.f22700a * system.getDisplayMetrics().density;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22700a == cVar.f22700a && Float.compare(this.f22701b, cVar.f22701b) == 0;
    }

    public int hashCode() {
        return (this.f22700a * 31) + Float.floatToIntBits(this.f22701b);
    }

    public String toString() {
        return "Size(sizeInDp=" + this.f22700a + ", mass=" + this.f22701b + ")";
    }

    public c(int i10, float f10, int i11, g gVar) {
        this(i10, (i11 & 2) != 0 ? 5.0f : f10);
    }
}
