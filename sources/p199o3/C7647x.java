package p199o3;

public final class C7647x {
    public final int f24511a;
    public final float f24512b;

    public C7647x(int i, float f) {
        this.f24511a = i;
        this.f24512b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7647x.class != obj.getClass()) {
            return false;
        }
        C7647x xVar = (C7647x) obj;
        return this.f24511a == xVar.f24511a && Float.compare(xVar.f24512b, this.f24512b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f24511a) * 31) + Float.floatToIntBits(this.f24512b);
    }
}
