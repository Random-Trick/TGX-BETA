package j$.util.function;

import java.util.function.DoubleConsumer;

public final class C0277e implements AbstractC0278f {
    final DoubleConsumer f14459a;

    private C0277e(DoubleConsumer doubleConsumer) {
        this.f14459a = doubleConsumer;
    }

    public static AbstractC0278f a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return new C0277e(doubleConsumer);
    }

    @Override
    public final void c(double d10) {
        this.f14459a.accept(d10);
    }
}
