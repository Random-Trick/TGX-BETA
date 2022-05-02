package p126j$.util;

import java.util.NoSuchElementException;

public final class C5547k {
    private static final C5547k f18078c = new C5547k();
    private final boolean f18079a;
    private final double f18080b;

    private C5547k() {
        this.f18079a = false;
        this.f18080b = Double.NaN;
    }

    private C5547k(double d) {
        this.f18079a = true;
        this.f18080b = d;
    }

    public static C5547k m22474a() {
        return f18078c;
    }

    public static C5547k m22471d(double d) {
        return new C5547k(d);
    }

    public double m22473b() {
        if (this.f18079a) {
            return this.f18080b;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean m22472c() {
        return this.f18079a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5547k)) {
            return false;
        }
        C5547k kVar = (C5547k) obj;
        boolean z = this.f18079a;
        if (!z || !kVar.f18079a) {
            if (z == kVar.f18079a) {
                return true;
            }
        } else if (Double.compare(this.f18080b, kVar.f18080b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (!this.f18079a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f18080b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public String toString() {
        return this.f18079a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f18080b)) : "OptionalDouble.empty";
    }
}
