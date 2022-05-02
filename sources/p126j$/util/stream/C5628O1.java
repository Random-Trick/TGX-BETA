package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

class C5628O1 extends AbstractC5679a2 {
    final AbstractC5521c f18202b;
    final BiConsumer f18203c;
    final AbstractC5542x f18204d;
    final C5721j f18205e;

    public C5628O1(int i, AbstractC5521c cVar, BiConsumer biConsumer, AbstractC5542x xVar, C5721j jVar) {
        super(i);
        this.f18202b = cVar;
        this.f18203c = biConsumer;
        this.f18204d = xVar;
        this.f18205e = jVar;
    }

    @Override
    public int mo22322a() {
        if (this.f18205e.m22243a().contains(EnumC5716i.UNORDERED)) {
            return EnumC5705f3.f18368r;
        }
        return 0;
    }

    @Override
    public AbstractC5670Y1 mo22321b() {
        return new C5633P1(this.f18204d, this.f18203c, this.f18202b);
    }
}
