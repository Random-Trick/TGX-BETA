package xa;

public final class b implements c<Float> {
    public final float f26189a;
    public final float f26190b;

    public b(float f10, float f11) {
        this.f26189a = f10;
        this.f26190b = f11;
    }

    public Float m() {
        return Float.valueOf(this.f26190b);
    }

    public Float g() {
        return Float.valueOf(this.f26189a);
    }

    public boolean c(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (isEmpty() && ((b) obj).isEmpty()) {
                return true;
            }
            b bVar = (b) obj;
            if (this.f26189a == bVar.f26189a) {
                if (this.f26190b == bVar.f26190b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean f(Float f10, Float f11) {
        return c(f10.floatValue(), f11.floatValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f26189a).hashCode() * 31) + Float.valueOf(this.f26190b).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.f26189a > this.f26190b;
    }

    public String toString() {
        return this.f26189a + ".." + this.f26190b;
    }
}
