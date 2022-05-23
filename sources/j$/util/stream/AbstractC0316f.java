package j$.util.stream;

import j$.util.H;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

public abstract class AbstractC0316f extends CountedCompleter {
    static final int f14739g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final E0 f14740a;
    protected H f14741b;
    protected long f14742c;
    protected AbstractC0316f f14743d;
    protected AbstractC0316f f14744e;
    private Object f14745f;

    public AbstractC0316f(E0 e02, H h10) {
        super(null);
        this.f14740a = e02;
        this.f14741b = h10;
        this.f14742c = 0L;
    }

    public AbstractC0316f(AbstractC0316f fVar, H h10) {
        super(fVar);
        this.f14741b = h10;
        this.f14740a = fVar.f14740a;
        this.f14742c = fVar.f14742c;
    }

    public static long h(long j10) {
        long j11 = j10 / f14739g;
        if (j11 > 0) {
            return j11;
        }
        return 1L;
    }

    public abstract Object a();

    public Object b() {
        return this.f14745f;
    }

    public final AbstractC0316f c() {
        return (AbstractC0316f) getCompleter();
    }

    @Override
    public void compute() {
        H trySplit;
        H h10 = this.f14741b;
        long estimateSize = h10.estimateSize();
        long j10 = this.f14742c;
        if (j10 == 0) {
            j10 = h(estimateSize);
            this.f14742c = j10;
        }
        boolean z10 = false;
        AbstractC0316f fVar = this;
        while (estimateSize > j10 && (trySplit = h10.trySplit()) != null) {
            AbstractC0316f f10 = fVar.f(trySplit);
            fVar.f14743d = f10;
            AbstractC0316f f11 = fVar.f(h10);
            fVar.f14744e = f11;
            fVar.setPendingCount(1);
            if (z10) {
                h10 = trySplit;
                fVar = f10;
                f10 = f11;
            } else {
                fVar = f11;
            }
            z10 = !z10;
            f10.fork();
            estimateSize = h10.estimateSize();
        }
        fVar.g(fVar.a());
        fVar.tryComplete();
    }

    public final boolean d() {
        return this.f14743d == null;
    }

    public final boolean e() {
        return c() == null;
    }

    public abstract AbstractC0316f f(H h10);

    public void g(Object obj) {
        this.f14745f = obj;
    }

    @Override
    public Object getRawResult() {
        return this.f14745f;
    }

    @Override
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f14741b = null;
        this.f14744e = null;
        this.f14743d = null;
    }

    @Override
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
