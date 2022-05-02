package p126j$.util.function;

import java.util.function.LongConsumer;

public final class C5534p implements AbstractC5535q {
    final LongConsumer f18073a;

    private C5534p(LongConsumer longConsumer) {
        this.f18073a = longConsumer;
    }

    public static AbstractC5535q m22484a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return new C5534p(longConsumer);
    }

    @Override
    public void mo22128e(long j) {
        this.f18073a.accept(j);
    }
}
