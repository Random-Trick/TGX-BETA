package p126j$.util.stream;

import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5485a;

public abstract class AbstractC5595H3 extends AbstractC5605J3 implements AbstractC5466E {
    public AbstractC5595H3(AbstractC5466E e, long j, long j2) {
        super(e, j, j2);
    }

    public AbstractC5595H3(AbstractC5466E e, AbstractC5595H3 h3) {
        super(e, h3);
    }

    @Override
    public void m22379n(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC5735l3 l3Var = null;
        while (true) {
            int q = m22373q();
            if (q == 1) {
                return;
            }
            if (q == 2) {
                if (l3Var == null) {
                    l3Var = mo22377u(Log.TAG_YOUTUBE);
                } else {
                    l3Var.f18426b = 0;
                }
                long j = 0;
                while (((AbstractC5466E) this.f18165a).tryAdvance(l3Var)) {
                    j++;
                    if (j >= 128) {
                        break;
                    }
                }
                if (j != 0) {
                    l3Var.mo22218a(obj, m22375o(j));
                } else {
                    return;
                }
            } else {
                ((AbstractC5466E) this.f18165a).forEachRemaining(obj);
                return;
            }
        }
    }

    @Override
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override
    public long getExactSizeIfKnown() {
        return AbstractC5485a.m22570h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22569j(this, i);
    }

    protected abstract void mo22378r(Object obj);

    @Override
    public boolean m22381l(Object obj) {
        Objects.requireNonNull(obj);
        while (m22373q() != 1 && ((AbstractC5466E) this.f18165a).tryAdvance(this)) {
            if (m22375o(1L) == 1) {
                mo22378r(obj);
                return true;
            }
        }
        return false;
    }

    protected abstract AbstractC5735l3 mo22377u(int i);
}
