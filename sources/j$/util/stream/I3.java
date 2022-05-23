package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.F;
import java.util.Comparator;
import java.util.Objects;

public abstract class I3 extends K3 implements F {
    public I3(F f10, long j10, long j11) {
        super(f10, j10, j11);
    }

    public I3(F f10, I3 i32) {
        super(f10, i32);
    }

    @Override
    public final void n(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC0355m3 m3Var = null;
        while (true) {
            int r10 = r();
            if (r10 == 1) {
                return;
            }
            if (r10 == 2) {
                if (m3Var == null) {
                    m3Var = v();
                } else {
                    m3Var.f14820b = 0;
                }
                long j10 = 0;
                while (((F) this.f14560a).tryAdvance(m3Var)) {
                    j10++;
                    if (j10 >= 128) {
                        break;
                    }
                }
                if (j10 != 0) {
                    m3Var.a(obj, o(j10));
                } else {
                    return;
                }
            } else {
                ((F) this.f14560a).forEachRemaining(obj);
                return;
            }
        }
    }

    @Override
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return AbstractC0264a.h(this);
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return AbstractC0264a.k(this, i10);
    }

    protected abstract void s(Object obj);

    @Override
    public final boolean j(Object obj) {
        Objects.requireNonNull(obj);
        while (r() != 1 && ((F) this.f14560a).tryAdvance(this)) {
            if (o(1L) == 1) {
                s(obj);
                return true;
            }
        }
        return false;
    }

    protected abstract AbstractC0355m3 v();
}
