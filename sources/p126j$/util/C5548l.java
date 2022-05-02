package p126j$.util;

import java.util.NoSuchElementException;

public final class C5548l {
    private static final C5548l f18081c = new C5548l();
    private final boolean f18082a;
    private final int f18083b;

    private C5548l() {
        this.f18082a = false;
        this.f18083b = 0;
    }

    private C5548l(int i) {
        this.f18082a = true;
        this.f18083b = i;
    }

    public static C5548l m22470a() {
        return f18081c;
    }

    public static C5548l m22467d(int i) {
        return new C5548l(i);
    }

    public int m22469b() {
        if (this.f18082a) {
            return this.f18083b;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean m22468c() {
        return this.f18082a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5548l)) {
            return false;
        }
        C5548l lVar = (C5548l) obj;
        boolean z = this.f18082a;
        if (!z || !lVar.f18082a) {
            if (z == lVar.f18082a) {
                return true;
            }
        } else if (this.f18083b == lVar.f18083b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f18082a) {
            return this.f18083b;
        }
        return 0;
    }

    public String toString() {
        return this.f18082a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f18083b)) : "OptionalInt.empty";
    }
}
