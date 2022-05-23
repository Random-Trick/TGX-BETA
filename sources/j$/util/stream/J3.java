package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

final class J3 extends K3 implements H, Consumer {
    Object f14554e;

    public J3(H h10, long j10, long j11) {
        super(h10, j10, j11);
    }

    J3(H h10, J3 j32) {
        super(h10, j32);
    }

    @Override
    public final boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (r() != 1 && this.f14560a.a(this)) {
            if (o(1L) == 1) {
                consumer.l(this.f14554e);
                this.f14554e = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C0360n3 n3Var = null;
        while (true) {
            int r10 = r();
            if (r10 == 1) {
                return;
            }
            if (r10 == 2) {
                if (n3Var == null) {
                    n3Var = new C0360n3();
                } else {
                    n3Var.f14829a = 0;
                }
                long j10 = 0;
                while (this.f14560a.a(n3Var)) {
                    j10++;
                    if (j10 >= 128) {
                        break;
                    }
                }
                if (j10 != 0) {
                    long o10 = o(j10);
                    for (int i10 = 0; i10 < o10; i10++) {
                        consumer.l(n3Var.f14823b[i10]);
                    }
                } else {
                    return;
                }
            } else {
                this.f14560a.forEachRemaining(consumer);
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

    @Override
    public final void l(Object obj) {
        this.f14554e = obj;
    }

    @Override
    protected final H q(H h10) {
        return new J3(h10, this);
    }
}
