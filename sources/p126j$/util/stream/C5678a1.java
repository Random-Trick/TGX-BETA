package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

public final class C5678a1 extends AbstractC5641R0 {
    public C5678a1(AbstractC5632P0 p0, AbstractC5632P0 p02) {
        super(p0, p02);
    }

    @Override
    public void mo22176a(Consumer consumer) {
        this.f18221a.mo22176a(consumer);
        this.f18222b.mo22176a(consumer);
    }

    @Override
    public void mo22154n(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        this.f18221a.mo22154n(objArr, i);
        this.f18222b.mo22154n(objArr, i + ((int) this.f18221a.count()));
    }

    @Override
    public Object[] mo22152p(AbstractC5531m mVar) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) mVar.mo22178w((int) count);
            mo22154n(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public AbstractC5632P0 mo22151q(long j, long j2, AbstractC5531m mVar) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.f18221a.count();
        return j >= count ? this.f18222b.mo22151q(j - count, j2 - count, mVar) : j2 <= count ? this.f18221a.mo22151q(j, j2, mVar) : AbstractC5572D0.m22438L(1, this.f18221a.mo22151q(j, count, mVar), this.f18222b.mo22151q(0L, j2 - count, mVar));
    }

    @Override
    public AbstractC5468G mo42629spliterator() {
        return new C5763r1(this);
    }

    public String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f18221a, this.f18222b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
