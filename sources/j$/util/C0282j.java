package j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;

public final class C0282j {
    private static final C0282j f14464b = new C0282j();
    private final Object f14465a;

    private C0282j() {
        this.f14465a = null;
    }

    private C0282j(Object obj) {
        Objects.requireNonNull(obj);
        this.f14465a = obj;
    }

    public static C0282j a() {
        return f14464b;
    }

    public static C0282j d(Object obj) {
        return new C0282j(obj);
    }

    public final Object b() {
        Object obj = this.f14465a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f14465a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0282j)) {
            return false;
        }
        return AbstractC0264a.w(this.f14465a, ((C0282j) obj).f14465a);
    }

    public final int hashCode() {
        Object obj = this.f14465a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f14465a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
