package p126j$.util.stream;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.Consumer;

public final class C5570C3 extends AbstractC5575D3 implements AbstractC5468G {
    public C5570C3(AbstractC5468G g, long j, long j2) {
        super(g, j, j2, 0L, Math.min(g.estimateSize(), j2));
    }

    private C5570C3(AbstractC5468G g, long j, long j2, long j3, long j4) {
        super(g, j, j2, j3, j4);
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        long j;
        Objects.requireNonNull(consumer);
        if (this.f18126a >= this.f18130e) {
            return false;
        }
        while (true) {
            long j2 = this.f18126a;
            j = this.f18129d;
            if (j2 <= j) {
                break;
            }
            this.f18128c.mo22124a(C5731l.f18424j);
            this.f18129d++;
        }
        if (j >= this.f18130e) {
            return false;
        }
        this.f18129d = j + 1;
        return this.f18128c.mo22124a(consumer);
    }

    @Override
    protected AbstractC5468G mo22138b(AbstractC5468G g, long j, long j2, long j3, long j4) {
        return new C5570C3(g, j, j2, j3, j4);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j = this.f18126a;
        long j2 = this.f18130e;
        if (j < j2) {
            long j3 = this.f18129d;
            if (j3 < j2) {
                if (j3 < j || this.f18128c.estimateSize() + j3 > this.f18127b) {
                    while (this.f18126a > this.f18129d) {
                        this.f18128c.mo22124a(C5726k.f18409n);
                        this.f18129d++;
                    }
                    while (this.f18129d < this.f18130e) {
                        this.f18128c.mo22124a(consumer);
                        this.f18129d++;
                    }
                    return;
                }
                this.f18128c.forEachRemaining(consumer);
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
        return AbstractC5485a.m22569h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22568j(this, i);
    }
}
