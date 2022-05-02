package p126j$.util.stream;

import java.util.Deque;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.Consumer;

final class C5763r1 extends AbstractC5768s1 {
    public C5763r1(AbstractC5632P0 p0) {
        super(p0);
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        AbstractC5632P0 b;
        if (!m22183d()) {
            return false;
        }
        boolean a = this.f18467d.mo22124a(consumer);
        if (!a) {
            if (this.f18466c != null || (b = m22185b(this.f18468e)) == null) {
                this.f18464a = null;
            } else {
                AbstractC5468G spliterator = b.mo42629spliterator();
                this.f18467d = spliterator;
                return spliterator.mo22124a(consumer);
            }
        }
        return a;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        if (this.f18464a != null) {
            if (this.f18467d == null) {
                AbstractC5468G g = this.f18466c;
                if (g == null) {
                    Deque c = m22184c();
                    while (true) {
                        AbstractC5632P0 b = m22185b(c);
                        if (b != null) {
                            b.mo22176a(consumer);
                        } else {
                            this.f18464a = null;
                            return;
                        }
                    }
                } else {
                    g.forEachRemaining(consumer);
                }
            } else {
                do {
                } while (mo22124a(consumer));
            }
        }
    }
}
