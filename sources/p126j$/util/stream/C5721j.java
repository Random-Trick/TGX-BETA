package p126j$.util.stream;

import java.util.Set;
import java.util.stream.Collector;

public final class C5721j {
    final Collector f18392a;

    private C5721j(Collector collector) {
        this.f18392a = collector;
    }

    public static C5721j m22242b(Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C5721j(collector);
    }

    public Set m22243a() {
        return this.f18392a.characteristics();
    }
}
