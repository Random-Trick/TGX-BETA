package j$.util;

import java.util.NoSuchElementException;

public final class C0285m {
    private static final C0285m f14469c = new C0285m();
    private final boolean f14470a;
    private final int f14471b;

    private C0285m() {
        this.f14470a = false;
        this.f14471b = 0;
    }

    private C0285m(int i10) {
        this.f14470a = true;
        this.f14471b = i10;
    }

    public static C0285m a() {
        return f14469c;
    }

    public static C0285m d(int i10) {
        return new C0285m(i10);
    }

    public final int b() {
        if (this.f14470a) {
            return this.f14471b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f14470a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0285m)) {
            return false;
        }
        C0285m mVar = (C0285m) obj;
        boolean z10 = this.f14470a;
        if (!z10 || !mVar.f14470a) {
            if (z10 == mVar.f14470a) {
                return true;
            }
        } else if (this.f14471b == mVar.f14471b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14470a) {
            return this.f14471b;
        }
        return 0;
    }

    public final String toString() {
        return this.f14470a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f14471b)) : "OptionalInt.empty";
    }
}
