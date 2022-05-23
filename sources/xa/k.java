package xa;

public class k {
    public static final void a(boolean z10, Number number) {
        ra.k.e(number, "step");
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    public static final c<Double> b(double d10, double d11) {
        return new a(d10, d11);
    }

    public static final c<Float> c(float f10, float f11) {
        return new b(f10, f11);
    }
}
