package p126j$.util.function;

import java.util.function.DoubleConsumer;

public final class C5524f implements AbstractC5525g {
    final DoubleConsumer f18071a;

    private C5524f(DoubleConsumer doubleConsumer) {
        this.f18071a = doubleConsumer;
    }

    public static AbstractC5525g m22486a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return new C5524f(doubleConsumer);
    }

    @Override
    public void mo22151c(double d) {
        this.f18071a.accept(d);
    }
}
