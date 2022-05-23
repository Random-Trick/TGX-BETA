package j$.util.stream;

import j$.util.H;
import j$.util.function.Consumer;
import java.util.Deque;

final class C0382s1 extends AbstractC0386t1 {
    public C0382s1(Q0 q02) {
        super(q02);
    }

    @Override
    public final boolean a(Consumer consumer) {
        Q0 b10;
        if (!d()) {
            return false;
        }
        boolean a10 = this.f14861d.a(consumer);
        if (!a10) {
            if (this.f14860c != null || (b10 = b(this.f14862e)) == null) {
                this.f14858a = null;
            } else {
                H spliterator = b10.mo31spliterator();
                this.f14861d = spliterator;
                return spliterator.a(consumer);
            }
        }
        return a10;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        if (this.f14858a != null) {
            if (this.f14861d == null) {
                H h10 = this.f14860c;
                if (h10 == null) {
                    Deque c10 = c();
                    while (true) {
                        Q0 b10 = b(c10);
                        if (b10 != null) {
                            b10.a(consumer);
                        } else {
                            this.f14858a = null;
                            return;
                        }
                    }
                } else {
                    h10.forEachRemaining(consumer);
                }
            } else {
                do {
                } while (a(consumer));
            }
        }
    }
}
