package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.BiConsumer;
import j$.util.function.F;

final class P1 extends AbstractC0299b2 {
    final AbstractC0275c f14597b;
    final BiConsumer f14598c;
    final F f14599d;
    final AbstractC0341k f14600e;

    public P1(int i10, AbstractC0275c cVar, BiConsumer biConsumer, F f10, AbstractC0341k kVar) {
        super(i10);
        this.f14597b = cVar;
        this.f14598c = biConsumer;
        this.f14599d = f10;
        this.f14600e = kVar;
    }

    @Override
    public final int a() {
        if (((C0336j) this.f14600e).b().contains(EnumC0331i.UNORDERED)) {
            return EnumC0325g3.f14763r;
        }
        return 0;
    }

    @Override
    public final Z1 b() {
        return new Q1(this.f14599d, this.f14598c, this.f14597b);
    }
}
