package j$.util.stream;

import j$.util.H;
import java.util.concurrent.CountedCompleter;

public abstract class B1 extends CountedCompleter implements AbstractC0378r2 {
    protected final H f14491a;
    protected final E0 f14492b;
    protected final long f14493c;
    protected long f14494d;
    protected long f14495e;
    protected int f14496f;
    protected int f14497g;

    public B1(H h10, E0 e02, int i10) {
        this.f14491a = h10;
        this.f14492b = e02;
        this.f14493c = AbstractC0316f.h(h10.estimateSize());
        this.f14494d = 0L;
        this.f14495e = i10;
    }

    public B1(B1 b12, H h10, long j10, long j11, int i10) {
        super(b12);
        this.f14491a = h10;
        this.f14492b = b12.f14492b;
        this.f14493c = b12.f14493c;
        this.f14494d = j10;
        this.f14495e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
        }
    }

    abstract B1 a(H h10, long j10, long j11);

    @Override
    public void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void compute() {
        H trySplit;
        H h10 = this.f14491a;
        B1 b12 = this;
        while (h10.estimateSize() > b12.f14493c && (trySplit = h10.trySplit()) != null) {
            b12.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            b12.a(trySplit, b12.f14494d, estimateSize).fork();
            b12 = b12.a(h10, b12.f14494d + estimateSize, b12.f14495e - estimateSize);
        }
        b12.f14492b.u0(b12, h10);
        b12.propagateCompletion();
    }

    @Override
    public void d(int i10) {
        E0.p();
        throw null;
    }

    @Override
    public void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        long j11 = this.f14495e;
        if (j10 <= j11) {
            int i10 = (int) this.f14494d;
            this.f14496f = i10;
            this.f14497g = i10 + ((int) j11);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override
    public final boolean u() {
        return false;
    }
}
