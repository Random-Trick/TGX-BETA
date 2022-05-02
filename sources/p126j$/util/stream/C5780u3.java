package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.Consumer;

final class C5780u3 extends AbstractC5715h3 implements AbstractC5464C {
    C5780u3(AbstractC5572D0 d0, AbstractC5468G g, boolean z) {
        super(d0, g, z);
    }

    public C5780u3(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        super(d0, xVar, z);
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22563s(this, consumer);
    }

    @Override
    void mo22168e() {
        C5667X2 x2 = new C5667X2();
        this.f18387h = x2;
        this.f18384e = this.f18381b.mo22300r0(new C5775t3(x2, 0));
        this.f18385f = new C5681b(this, 6);
    }

    @Override
    public void forEachRemaining(AbstractC5535q qVar) {
        if (this.f18387h != null || this.f18388i) {
            do {
            } while (tryAdvance(qVar));
            return;
        }
        Objects.requireNonNull(qVar);
        m22253d();
        this.f18381b.mo22301q0(new C5775t3(qVar, 1), this.f18383d);
        this.f18388i = true;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22571e(this, consumer);
    }

    @Override
    public boolean tryAdvance(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        boolean b = m22255b();
        if (b) {
            C5667X2 x2 = (C5667X2) this.f18387h;
            long j = this.f18386g;
            int x = x2.m22331x(j);
            qVar.mo22128e((x2.f18342c == 0 && x == 0) ? ((long[]) x2.f18282e)[(int) j] : ((long[][]) x2.f18283f)[x][(int) (j - x2.f18343d[x])]);
        }
        return b;
    }

    @Override
    AbstractC5715h3 mo22165h(AbstractC5468G g) {
        return new C5780u3(this.f18381b, g, this.f18380a);
    }

    @Override
    public AbstractC5464C trySplit() {
        return (AbstractC5464C) super.trySplit();
    }
}
