package p317wa;

public final class C10015a implements AbstractC10017c<Double> {
    public final double f32619a;
    public final double f32620b;

    public C10015a(double d, double d2) {
        this.f32619a = d;
        this.f32620b = d2;
    }

    public Double mo6212m() {
        return Double.valueOf(this.f32620b);
    }

    public Double mo6213i() {
        return Double.valueOf(this.f32619a);
    }

    public boolean m6218c(double d, double d2) {
        return d <= d2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10015a) {
            if (isEmpty() && ((C10015a) obj).isEmpty()) {
                return true;
            }
            C10015a aVar = (C10015a) obj;
            if (this.f32619a == aVar.f32619a) {
                if (this.f32620b == aVar.f32620b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean mo6214h(Double d, Double d2) {
        return m6218c(d.doubleValue(), d2.doubleValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.f32619a).hashCode() * 31) + Double.valueOf(this.f32620b).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.f32619a > this.f32620b;
    }

    public String toString() {
        return this.f32619a + ".." + this.f32620b;
    }
}
