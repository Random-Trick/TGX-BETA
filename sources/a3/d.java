package a3;

import java.util.List;
import java.util.Objects;

public final class d extends j {
    public final List<m> f168a;

    public d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f168a = list;
    }

    @Override
    public List<m> c() {
        return this.f168a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f168a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f168a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f168a + "}";
    }
}
