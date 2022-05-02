package p317wa;

public final class C10016b implements AbstractC10017c<Float> {
    public final float f32621a;
    public final float f32622b;

    public C10016b(float f, float f2) {
        this.f32621a = f;
        this.f32622b = f2;
    }

    public Float mo6212m() {
        return Float.valueOf(this.f32622b);
    }

    public Float mo6213i() {
        return Float.valueOf(this.f32621a);
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
            if (this.f32621a == bVar.f32621a) {
                if (this.f32622b == bVar.f32622b) {
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
        return (Float.valueOf(this.f32621a).hashCode() * 31) + Float.valueOf(this.f32622b).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.f32621a > this.f32622b;
    }

    public String toString() {
        return this.f32621a + ".." + this.f32622b;
    }
}
