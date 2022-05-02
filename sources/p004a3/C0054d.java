package p004a3;

import java.util.List;
import java.util.Objects;

public final class C0054d extends AbstractC0068j {
    public final List<AbstractC0074m> f182a;

    public C0054d(List<AbstractC0074m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f182a = list;
    }

    @Override
    public List<AbstractC0074m> mo42475c() {
        return this.f182a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0068j) {
            return this.f182a.equals(((AbstractC0068j) obj).mo42475c());
        }
        return false;
    }

    public int hashCode() {
        return this.f182a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f182a + "}";
    }
}
