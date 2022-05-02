package p336y;

import java.util.Objects;

public final class C10207c extends AbstractC10316x0 {
    public final Object f32966a;

    public C10207c(Object obj) {
        Objects.requireNonNull(obj, "Null value");
        this.f32966a = obj;
    }

    @Override
    public Object mo5481b() {
        return this.f32966a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10316x0) {
            return this.f32966a.equals(((AbstractC10316x0) obj).mo5481b());
        }
        return false;
    }

    public int hashCode() {
        return this.f32966a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f32966a + "}";
    }
}
