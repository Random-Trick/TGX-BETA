package xa;

public final class a implements c<Double> {
    public final double f26187a;
    public final double f26188b;

    public a(double d10, double d11) {
        this.f26187a = d10;
        this.f26188b = d11;
    }

    public Double m() {
        return Double.valueOf(this.f26188b);
    }

    public Double g() {
        return Double.valueOf(this.f26187a);
    }

    public boolean c(double d10, double d11) {
        return d10 <= d11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (isEmpty() && ((a) obj).isEmpty()) {
                return true;
            }
            a aVar = (a) obj;
            if (this.f26187a == aVar.f26187a) {
                if (this.f26188b == aVar.f26188b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean f(Double d10, Double d11) {
        return c(d10.doubleValue(), d11.doubleValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.f26187a).hashCode() * 31) + Double.valueOf(this.f26188b).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.f26187a > this.f26188b;
    }

    public String toString() {
        return this.f26187a + ".." + this.f26188b;
    }
}
