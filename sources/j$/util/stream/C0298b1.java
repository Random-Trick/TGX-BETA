package j$.util.stream;

import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.o;
import java.util.Objects;

public final class C0298b1 extends S0 {
    public C0298b1(Q0 q02, Q0 q03) {
        super(q02, q03);
    }

    @Override
    public final void a(Consumer consumer) {
        this.f14616a.a(consumer);
        this.f14617b.a(consumer);
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        Objects.requireNonNull(objArr);
        this.f14616a.q(objArr, i10);
        this.f14617b.q(objArr, i10 + ((int) this.f14616a.count()));
    }

    @Override
    public final H mo31spliterator() {
        return new C0382s1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f14616a, this.f14617b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }

    @Override
    public final Object[] v(o oVar) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) oVar.z((int) count);
            q(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        if (j10 == 0 && j11 == count()) {
            return this;
        }
        long count = this.f14616a.count();
        return j10 >= count ? this.f14617b.w(j10 - count, j11 - count, oVar) : j11 <= count ? this.f14616a.w(j10, j11, oVar) : E0.Q(1, this.f14616a.w(j10, count, oVar), this.f14617b.w(0L, j11 - count, oVar));
    }
}
