package p317wa;

public final class C10016b implements AbstractC10017c<Float> {
    public final float f32624a;
    public final float f32625b;

    public C10016b(float f, float f2) {
        this.f32624a = f;
        this.f32625b = f2;
    }

    public Float mo6212m() {
        return Float.valueOf(this.f32625b);
    }

    public Float mo6213i() {
        return Float.valueOf(this.f32624a);
    }

    public boolean m6215c(float f, float f2) {
        return f <= f2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10016b) {
            if (isEmpty() && ((C10016b) obj).isEmpty()) {
                return true;
            }
            C10016b bVar = (C10016b) obj;
            if (this.f32624a == bVar.f32624a) {
                if (this.f32625b == bVar.f32625b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean mo6214h(Float f, Float f2) {
        return m6215c(f.floatValue(), f2.floatValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f32624a).hashCode() * 31) + Float.valueOf(this.f32625b).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.f32624a > this.f32625b;
    }

    public String toString() {
        return this.f32624a + ".." + this.f32625b;
    }
}
