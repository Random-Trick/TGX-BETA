package p126j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;

abstract class AbstractC5768s1 implements AbstractC5468G {
    AbstractC5632P0 f18464a;
    int f18465b;
    AbstractC5468G f18466c;
    AbstractC5468G f18467d;
    Deque f18468e;

    public AbstractC5768s1(AbstractC5632P0 p0) {
        this.f18464a = p0;
    }

    public final AbstractC5632P0 m22186b(Deque deque) {
        while (true) {
            AbstractC5632P0 p0 = (AbstractC5632P0) deque.pollFirst();
            if (p0 == null) {
                return null;
            }
            if (p0.mo22154o() != 0) {
                for (int o = p0.mo22154o() - 1; o >= 0; o--) {
                    deque.addFirst(p0.mo22159f(o));
                }
            } else if (p0.count() > 0) {
                return p0;
            }
        }
    }

    public final Deque m22185c() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int o = this.f18464a.mo22154o();
        while (true) {
            o--;
            if (o < this.f18465b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f18464a.mo22159f(o));
        }
    }

    @Override
    public final int characteristics() {
        return 64;
    }

    public final boolean m22184d() {
        if (this.f18464a == null) {
            return false;
        }
        if (this.f18467d != null) {
            return true;
        }
        AbstractC5468G g = this.f18466c;
        if (g == null) {
            Deque c = m22185c();
            this.f18468e = c;
            AbstractC5632P0 b = m22186b(c);
            if (b != null) {
                g = b.mo42632spliterator();
            } else {
                this.f18464a = null;
                return false;
            }
        }
        this.f18467d = g;
        return true;
    }

    @Override
    public final long estimateSize() {
        long j = 0;
        if (this.f18464a == null) {
            return 0L;
        }
        AbstractC5468G g = this.f18466c;
        if (g != null) {
            return g.estimateSize();
        }
        for (int i = this.f18465b; i < this.f18464a.mo22154o(); i++) {
            j += this.f18464a.mo22159f(i).count();
        }
        return j;
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
    public final AbstractC5468G trySplit() {
        AbstractC5632P0 p0 = this.f18464a;
        if (p0 == null || this.f18467d != null) {
            return null;
        }
        AbstractC5468G g = this.f18466c;
        if (g != null) {
            return g.trySplit();
        }
        if (this.f18465b < p0.mo22154o() - 1) {
            AbstractC5632P0 p02 = this.f18464a;
            int i = this.f18465b;
            this.f18465b = i + 1;
            return p02.mo22159f(i).mo42632spliterator();
        }
        AbstractC5632P0 f = this.f18464a.mo22159f(this.f18465b);
        this.f18464a = f;
        if (f.mo22154o() == 0) {
            AbstractC5468G spliterator = this.f18464a.mo42632spliterator();
            this.f18466c = spliterator;
            return spliterator.trySplit();
        }
        this.f18465b = 0;
        AbstractC5632P0 p03 = this.f18464a;
        this.f18465b = 0 + 1;
        return p03.mo22159f(0).mo42632spliterator();
    }
}
