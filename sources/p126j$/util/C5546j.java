package p126j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;

public final class C5546j {
    private static final C5546j f18076b = new C5546j();
    private final Object f18077a;

    private C5546j() {
        this.f18077a = null;
    }

    private C5546j(Object obj) {
        Objects.requireNonNull(obj);
        this.f18077a = obj;
    }

    public static C5546j m22478a() {
        return f18076b;
    }

    public static C5546j m22475d(Object obj) {
        return new C5546j(obj);
    }

    public Object m22477b() {
        Object obj = this.f18077a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean m22476c() {
        return this.f18077a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5546j)) {
            return false;
        }
        return AbstractC5485a.m22586A(this.f18077a, ((C5546j) obj).f18077a);
    }

    public int hashCode() {
        Object obj = this.f18077a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f18077a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
