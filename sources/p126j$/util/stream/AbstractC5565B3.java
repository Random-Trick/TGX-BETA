package p126j$.util.stream;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5485a;

public abstract class AbstractC5565B3 extends AbstractC5575D3 implements AbstractC5466E {
    public AbstractC5565B3(AbstractC5466E e, long j, long j2) {
        super(e, j, j2, 0L, Math.min(e.estimateSize(), j2));
    }

    protected abstract Object mo22138c();

    @Override
    public void m22451n(Object obj) {
        Objects.requireNonNull(obj);
        long j = this.f18126a;
        long j2 = this.f18130e;
        if (j < j2) {
            long j3 = this.f18129d;
            if (j3 < j2) {
                if (j3 < j || ((AbstractC5466E) this.f18128c).estimateSize() + j3 > this.f18127b) {
                    while (this.f18126a > this.f18129d) {
                        ((AbstractC5466E) this.f18128c).tryAdvance(mo22138c());
                        this.f18129d++;
                    }
                    while (this.f18129d < this.f18130e) {
                        ((AbstractC5466E) this.f18128c).tryAdvance(obj);
                        this.f18129d++;
                    }
                    return;
                }
                ((AbstractC5466E) this.f18128c).forEachRemaining(obj);
                this.f18129d = this.f18130e;
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

    @Override
    public boolean m22453l(Object obj) {
        long j;
        Objects.requireNonNull(obj);
        if (this.f18126a >= this.f18130e) {
            return false;
        }
        while (true) {
            long j2 = this.f18126a;
            j = this.f18129d;
            if (j2 <= j) {
                break;
            }
            ((AbstractC5466E) this.f18128c).tryAdvance(mo22138c());
            this.f18129d++;
        }
        if (j >= this.f18130e) {
            return false;
        }
        this.f18129d = j + 1;
        return ((AbstractC5466E) this.f18128c).tryAdvance(obj);
    }

    public AbstractC5565B3(AbstractC5466E e, long j, long j2, long j3, long j4, AbstractC5572D0 d0) {
        super(e, j, j2, j3, j4);
    }
}
