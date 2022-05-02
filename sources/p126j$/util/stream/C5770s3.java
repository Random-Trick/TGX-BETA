package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.Consumer;

final class C5770s3 extends AbstractC5715h3 implements AbstractC5462A {
    C5770s3(AbstractC5572D0 d0, AbstractC5468G g, boolean z) {
        super(d0, g, z);
    }

    public C5770s3(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        super(d0, xVar, z);
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22564r(this, consumer);
    }

    @Override
    void mo22168e() {
        C5659V2 v2 = new C5659V2();
        this.f18387h = v2;
        this.f18384e = this.f18381b.mo22300r0(new C5765r3(v2, 0));
        this.f18385f = new C5681b(this, 5);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22572d(this, consumer);
    }

    @Override
    AbstractC5715h3 mo22165h(AbstractC5468G g) {
        return new C5770s3(this.f18381b, g, this.f18380a);
    }

    @Override
    public boolean tryAdvance(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        boolean b = m22255b();
        if (b) {
            C5659V2 v2 = (C5659V2) this.f18387h;
            long j = this.f18386g;
            int x = v2.m22331x(j);
            lVar.mo22145d((v2.f18342c == 0 && x == 0) ? ((int[]) v2.f18282e)[(int) j] : ((int[][]) v2.f18283f)[x][(int) (j - v2.f18343d[x])]);
        }
        return b;
    }

    @Override
    public void forEachRemaining(AbstractC5530l lVar) {
        if (this.f18387h != null || this.f18388i) {
            do {
            } while (tryAdvance(lVar));
            return;
        }
        Objects.requireNonNull(lVar);
        m22253d();
        this.f18381b.mo22301q0(new C5765r3(lVar, 1), this.f18383d);
        this.f18388i = true;
    }

    @Override
    public AbstractC5462A trySplit() {
        return (AbstractC5462A) super.trySplit();
    }
}
