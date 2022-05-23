package y;

import java.util.Objects;

public final class c extends x0 {
    public final Object f26272a;

    public c(Object obj) {
        Objects.requireNonNull(obj, "Null value");
        this.f26272a = obj;
    }

    @Override
    public Object b() {
        return this.f26272a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            return this.f26272a.equals(((x0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f26272a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f26272a + "}";
    }
}
