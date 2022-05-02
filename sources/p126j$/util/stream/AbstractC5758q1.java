package p126j$.util.stream;

import java.util.Deque;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5468G;

abstract class AbstractC5758q1 extends AbstractC5768s1 implements AbstractC5466E {
    public AbstractC5758q1(AbstractC5627O0 o0) {
        super(o0);
    }

    @Override
    public void m22201n(Object obj) {
        if (this.f18464a != null) {
            if (this.f18467d == null) {
                AbstractC5468G g = this.f18466c;
                if (g == null) {
                    Deque c = m22184c();
                    while (true) {
                        AbstractC5627O0 o0 = (AbstractC5627O0) m22185b(c);
                        if (o0 != null) {
                            o0.mo22155m(obj);
                        } else {
                            this.f18464a = null;
                            return;
                        }
                    }
                } else {
                    ((AbstractC5466E) g).forEachRemaining(obj);
                }
            } else {
                do {
                } while (m22203l(obj));
            }
        }
    }

    @Override
    public boolean m22203l(Object obj) {
        AbstractC5627O0 o0;
        if (!m22183d()) {
            return false;
        }
        boolean tryAdvance = ((AbstractC5466E) this.f18467d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f18466c != null || (o0 = (AbstractC5627O0) m22185b(this.f18468e)) == null) {
                this.f18464a = null;
            } else {
                AbstractC5466E spliterator = o0.mo42629spliterator();
                this.f18467d = spliterator;
                return spliterator.tryAdvance(obj);
            }
        }
        return tryAdvance;
    }
}
