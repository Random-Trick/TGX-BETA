package j$.util.stream;

import j$.util.F;
import j$.util.H;
import java.util.Deque;

abstract class AbstractC0377r1 extends AbstractC0386t1 implements F {
    public AbstractC0377r1(P0 p02) {
        super(p02);
    }

    @Override
    public final void n(Object obj) {
        if (this.f14858a != null) {
            if (this.f14861d == null) {
                H h10 = this.f14860c;
                if (h10 == null) {
                    Deque c10 = c();
                    while (true) {
                        P0 p02 = (P0) b(c10);
                        if (p02 != null) {
                            p02.n(obj);
                        } else {
                            this.f14858a = null;
                            return;
                        }
                    }
                } else {
                    ((F) h10).forEachRemaining(obj);
                }
            } else {
                do {
                } while (j(obj));
            }
        }
    }

    @Override
    public final boolean j(Object obj) {
        P0 p02;
        if (!d()) {
            return false;
        }
        boolean tryAdvance = ((F) this.f14861d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f14860c != null || (p02 = (P0) b(this.f14862e)) == null) {
                this.f14858a = null;
            } else {
                F spliterator = p02.mo31spliterator();
                this.f14861d = spliterator;
                return spliterator.tryAdvance(obj);
            }
        }
        return tryAdvance;
    }
}
