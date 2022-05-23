package j$.util.function;

import java.util.function.IntConsumer;

public final class m implements n {
    final IntConsumer f14460a;

    private m(IntConsumer intConsumer) {
        this.f14460a = intConsumer;
    }

    public static n a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return new m(intConsumer);
    }

    @Override
    public final void d(int i10) {
        this.f14460a.accept(i10);
    }
}
