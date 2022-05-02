package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.Consumer;

final class C5760q3 extends AbstractC5715h3 implements AbstractC5811y {
    C5760q3(AbstractC5572D0 d0, AbstractC5468G g, boolean z) {
        super(d0, g, z);
    }

    public C5760q3(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        super(d0, xVar, z);
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22565q(this, consumer);
    }

    @Override
    void mo22168e() {
        C5651T2 t2 = new C5651T2();
        this.f18387h = t2;
        this.f18384e = this.f18381b.mo22300r0(new C5755p3(t2, 0));
        this.f18385f = new C5681b(this, 4);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22573c(this, consumer);
    }

    @Override
    AbstractC5715h3 mo22165h(AbstractC5468G g) {
        return new C5760q3(this.f18381b, g, this.f18380a);
    }

    @Override
    public boolean tryAdvance(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        boolean b = m22255b();
        if (b) {
            C5651T2 t2 = (C5651T2) this.f18387h;
            long j = this.f18386g;
            int x = t2.m22331x(j);
            gVar.mo22151c((t2.f18342c == 0 && x == 0) ? ((double[]) t2.f18282e)[(int) j] : ((double[][]) t2.f18283f)[x][(int) (j - t2.f18343d[x])]);
        }
        return b;
    }

    @Override
    public void forEachRemaining(AbstractC5525g gVar) {
        if (this.f18387h != null || this.f18388i) {
            do {
            } while (tryAdvance(gVar));
            return;
        }
        Objects.requireNonNull(gVar);
        m22253d();
        this.f18381b.mo22301q0(new C5755p3(gVar, 1), this.f18383d);
        this.f18388i = true;
    }

    @Override
    public AbstractC5811y trySplit() {
        return (AbstractC5811y) super.trySplit();
    }
}
