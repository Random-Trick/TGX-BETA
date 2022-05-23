package j$.util.function;

import java.util.function.LongConsumer;

public final class u implements v {
    final LongConsumer f14461a;

    private u(LongConsumer longConsumer) {
        this.f14461a = longConsumer;
    }

    public static v a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return new u(longConsumer);
    }

    @Override
    public final void e(long j10) {
        this.f14461a.accept(j10);
    }
}
