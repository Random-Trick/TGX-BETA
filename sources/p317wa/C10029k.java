package p317wa;

import qa.C8298k;

public class C10029k {
    public static final void m6196a(boolean z, Number number) {
        C8298k.m12933e(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    public static final AbstractC10017c<Double> m6195b(double d, double d2) {
        return new C10015a(d, d2);
    }

    public static final AbstractC10017c<Float> m6194c(float f, float f2) {
        return new C10016b(f, f2);
    }
}
