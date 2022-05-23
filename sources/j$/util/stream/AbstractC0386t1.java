package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

abstract class AbstractC0386t1 implements H {
    Q0 f14858a;
    int f14859b;
    H f14860c;
    H f14861d;
    ArrayDeque f14862e;

    public AbstractC0386t1(Q0 q02) {
        this.f14858a = q02;
    }

    public final Q0 b(Deque deque) {
        while (true) {
            Q0 q02 = (Q0) deque.pollFirst();
            if (q02 == null) {
                return null;
            }
            if (q02.s() != 0) {
                for (int s10 = q02.s() - 1; s10 >= 0; s10--) {
                    deque.addFirst(q02.f(s10));
                }
            } else if (q02.count() > 0) {
                return q02;
            }
        }
    }

    public final Deque c() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int s10 = this.f14858a.s();
        while (true) {
            s10--;
            if (s10 < this.f14859b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f14858a.f(s10));
        }
    }

    @Override
    public final int characteristics() {
        return 64;
    }

    public final boolean d() {
        if (this.f14858a == null) {
            return false;
        }
        if (this.f14861d != null) {
            return true;
        }
        H h10 = this.f14860c;
        if (h10 == null) {
            Deque c10 = c();
            this.f14862e = (ArrayDeque) c10;
            Q0 b10 = b(c10);
            if (b10 != null) {
                h10 = b10.mo31spliterator();
            } else {
                this.f14858a = null;
                return false;
            }
        }
        this.f14861d = h10;
        return true;
    }

    @Override
    public final long estimateSize() {
        long j10 = 0;
        if (this.f14858a == null) {
            return 0L;
        }
        H h10 = this.f14860c;
        if (h10 != null) {
            return h10.estimateSize();
        }
        for (int i10 = this.f14859b; i10 < this.f14858a.s(); i10++) {
            j10 += this.f14858a.f(i10).count();
        }
        return j10;
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

    @Override
    public final H trySplit() {
        Q0 q02 = this.f14858a;
        if (q02 == null || this.f14861d != null) {
            return null;
        }
        H h10 = this.f14860c;
        if (h10 != null) {
            return h10.trySplit();
        }
        if (this.f14859b < q02.s() - 1) {
            Q0 q03 = this.f14858a;
            int i10 = this.f14859b;
            this.f14859b = i10 + 1;
            return q03.f(i10).mo31spliterator();
        }
        Q0 f10 = this.f14858a.f(this.f14859b);
        this.f14858a = f10;
        if (f10.s() == 0) {
            H spliterator = this.f14858a.mo31spliterator();
            this.f14860c = spliterator;
            return spliterator.trySplit();
        }
        Q0 q04 = this.f14858a;
        this.f14859b = 0 + 1;
        return q04.f(0).mo31spliterator();
    }
}
