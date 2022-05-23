package o3;

public final class x {
    public final int f18940a;
    public final float f18941b;

    public x(int i10, float f10) {
        this.f18940a = i10;
        this.f18941b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f18940a == xVar.f18940a && Float.compare(xVar.f18941b, this.f18941b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f18940a) * 31) + Float.floatToIntBits(this.f18941b);
    }
}
