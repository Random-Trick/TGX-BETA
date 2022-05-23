package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.BiConsumer;
import j$.util.function.C0274b;
import j$.util.function.F;
import j$.util.function.Function;
import java.util.Set;
import java.util.stream.Collector;

public final class C0336j implements AbstractC0341k {
    final Collector f14784a;

    private C0336j(Collector collector) {
        this.f14784a = collector;
    }

    public static AbstractC0341k d(Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C0336j(collector);
    }

    public final BiConsumer a() {
        return BiConsumer.VivifiedWrapper.convert(this.f14784a.accumulator());
    }

    public final Set b() {
        return this.f14784a.characteristics();
    }

    public final AbstractC0275c c() {
        return C0274b.h(this.f14784a.combiner());
    }

    public final Function e() {
        return Function.VivifiedWrapper.convert(this.f14784a.finisher());
    }

    public final F f() {
        return C0274b.w(this.f14784a.supplier());
    }
}
