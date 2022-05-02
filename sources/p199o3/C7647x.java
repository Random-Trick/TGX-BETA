package p199o3;

public final class C7647x {
    public final int f24514a;
    public final float f24515b;

    public C7647x(int i, float f) {
        this.f24514a = i;
        this.f24515b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7647x.class != obj.getClass()) {
            return false;
        }
        C7647x xVar = (C7647x) obj;
        return this.f24514a == xVar.f24514a && Float.compare(xVar.f24515b, this.f24515b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f24514a) * 31) + Float.floatToIntBits(this.f24515b);
    }
}
