package p126j$.util.stream;

import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.Consumer;

final class C5600I3 extends AbstractC5605J3 implements AbstractC5468G, Consumer {
    Object f18159e;

    public C5600I3(AbstractC5468G g, long j, long j2) {
        super(g, j, j2);
    }

    C5600I3(AbstractC5468G g, C5600I3 i3) {
        super(g, i3);
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (m22372q() != 1 && this.f18165a.mo22124a(this)) {
            if (m22374o(1L) == 1) {
                consumer.mo22128k(this.f18159e);
                this.f18159e = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C5740m3 m3Var = null;
        while (true) {
            int q = m22372q();
            if (q == 1) {
                return;
            }
            if (q == 2) {
                if (m3Var == null) {
                    m3Var = new C5740m3(Log.TAG_YOUTUBE);
                } else {
                    m3Var.f18435a = 0;
                }
                long j = 0;
                while (this.f18165a.mo22124a(m3Var)) {
                    j++;
                    if (j >= 128) {
                        break;
                    }
                }
                if (j != 0) {
                    long o = m22374o(j);
                    for (int i = 0; i < o; i++) {
                        consumer.mo22128k(m3Var.f18429b[i]);
                    }
                } else {
                    return;
                }
            } else {
                this.f18165a.forEachRemaining(consumer);
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
        return AbstractC5485a.m22569h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22568j(this, i);
    }

    @Override
    public final void mo22128k(Object obj) {
        this.f18159e = obj;
    }

    @Override
    protected AbstractC5468G mo22373p(AbstractC5468G g) {
        return new C5600I3(g, this);
    }
}
