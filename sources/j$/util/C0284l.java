package j$.util;

import java.util.NoSuchElementException;

public final class C0284l {
    private static final C0284l f14466c = new C0284l();
    private final boolean f14467a;
    private final double f14468b;

    private C0284l() {
        this.f14467a = false;
        this.f14468b = Double.NaN;
    }

    private C0284l(double d10) {
        this.f14467a = true;
        this.f14468b = d10;
    }

    public static C0284l a() {
        return f14466c;
    }

    public static C0284l d(double d10) {
        return new C0284l(d10);
    }

    public final double b() {
        if (this.f14467a) {
            return this.f14468b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f14467a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0284l)) {
            return false;
        }
        C0284l lVar = (C0284l) obj;
        boolean z10 = this.f14467a;
        if (!z10 || !lVar.f14467a) {
            if (z10 == lVar.f14467a) {
                return true;
            }
        } else if (Double.compare(this.f14468b, lVar.f14468b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f14467a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f14468b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return this.f14467a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f14468b)) : "OptionalDouble.empty";
    }
}
