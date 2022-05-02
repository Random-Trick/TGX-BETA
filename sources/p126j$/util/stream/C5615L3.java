package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.Consumer;

final class C5615L3 extends AbstractC5715h3 {
    C5615L3(AbstractC5572D0 d0, AbstractC5468G g, boolean z) {
        super(d0, g, z);
    }

    public C5615L3(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        super(d0, xVar, z);
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean b = m22255b();
        if (b) {
            C5680a3 a3Var = (C5680a3) this.f18387h;
            long j = this.f18386g;
            if (a3Var.f18342c == 0) {
                if (j < a3Var.f18341b) {
                    obj = a3Var.f18309e[(int) j];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else if (j < a3Var.count()) {
                for (int i = 0; i <= a3Var.f18342c; i++) {
                    long[] jArr = a3Var.f18343d;
                    long j2 = jArr[i];
                    Object[][] objArr = a3Var.f18310f;
                    if (j < j2 + objArr[i].length) {
                        obj = objArr[i][(int) (j - jArr[i])];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.mo22129k(obj);
        }
        return b;
    }

    @Override
    void mo22168e() {
        C5680a3 a3Var = new C5680a3();
        this.f18387h = a3Var;
        this.f18384e = this.f18381b.mo22300r0(new C5610K3(a3Var, 1));
        this.f18385f = new C5681b(this, 7);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        if (this.f18387h != null || this.f18388i) {
            do {
            } while (mo22125a(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        m22253d();
        this.f18381b.mo22301q0(new C5610K3(consumer, 0), this.f18383d);
        this.f18388i = true;
    }

    @Override
    AbstractC5715h3 mo22165h(AbstractC5468G g) {
        return new C5615L3(this.f18381b, g, this.f18380a);
    }
}
