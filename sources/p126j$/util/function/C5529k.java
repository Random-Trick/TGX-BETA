package p126j$.util.function;

import java.util.function.IntConsumer;

public final class C5529k implements AbstractC5530l {
    final IntConsumer f18072a;

    private C5529k(IntConsumer intConsumer) {
        this.f18072a = intConsumer;
    }

    public static AbstractC5530l m22485a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return new C5529k(intConsumer);
    }

    @Override
    public void mo22145d(int i) {
        this.f18072a.accept(i);
    }
}
