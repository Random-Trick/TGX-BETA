package p317wa;

public final class C10015a implements AbstractC10017c<Double> {
    public final double f32622a;
    public final double f32623b;

    public C10015a(double d, double d2) {
        this.f32622a = d;
        this.f32623b = d2;
    }

    public Double mo6212m() {
        return Double.valueOf(this.f32623b);
    }

    public Double mo6213i() {
        return Double.valueOf(this.f32622a);
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
            if (this.f32622a == aVar.f32622a) {
                if (this.f32623b == aVar.f32623b) {
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
        return (Double.valueOf(this.f32622a).hashCode() * 31) + Double.valueOf(this.f32623b).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.f32622a > this.f32623b;
    }

    public String toString() {
        return this.f32622a + ".." + this.f32623b;
    }
}
