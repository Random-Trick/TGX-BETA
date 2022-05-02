package p126j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p126j$.util.AbstractC5468G;

public abstract class AbstractC5701f extends CountedCompleter {
    static final int f18349g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final AbstractC5572D0 f18350a;
    protected AbstractC5468G f18351b;
    protected long f18352c;
    protected AbstractC5701f f18353d;
    protected AbstractC5701f f18354e;
    private Object f18355f;

    public AbstractC5701f(AbstractC5572D0 d0, AbstractC5468G g) {
        super(null);
        this.f18350a = d0;
        this.f18351b = g;
        this.f18352c = 0L;
    }

    public AbstractC5701f(AbstractC5701f fVar, AbstractC5468G g) {
        super(fVar);
        this.f18351b = g;
        this.f18350a = fVar.f18350a;
        this.f18352c = fVar.f18352c;
    }

    public static long m22271h(long j) {
        long j2 = j / f18349g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object mo22278a();

    public Object mo22277b() {
        return this.f18355f;
    }

    public AbstractC5701f m22276c() {
        return (AbstractC5701f) getCompleter();
    }

    @Override
    public void compute() {
        AbstractC5468G trySplit;
        AbstractC5468G g = this.f18351b;
        long estimateSize = g.estimateSize();
        long j = this.f18352c;
        if (j == 0) {
            j = m22271h(estimateSize);
            this.f18352c = j;
        }
        boolean z = false;
        AbstractC5701f fVar = this;
        while (estimateSize > j && (trySplit = g.trySplit()) != null) {
            AbstractC5701f f = fVar.mo22273f(trySplit);
            fVar.f18353d = f;
            AbstractC5701f f2 = fVar.mo22273f(g);
            fVar.f18354e = f2;
            fVar.setPendingCount(1);
            if (z) {
                g = trySplit;
                fVar = f;
                f = f2;
            } else {
                fVar = f2;
            }
            z = !z;
            f.fork();
            estimateSize = g.estimateSize();
        }
        fVar.mo22272g(fVar.mo22278a());
        fVar.tryComplete();
    }

    public boolean m22275d() {
        return this.f18353d == null;
    }

    public boolean m22274e() {
        return m22276c() == null;
    }

    public abstract AbstractC5701f mo22273f(AbstractC5468G g);

    public void mo22272g(Object obj) {
        this.f18355f = obj;
    }

    @Override
    public Object getRawResult() {
        return this.f18355f;
    }

    @Override
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f18351b = null;
        this.f18354e = null;
        this.f18353d = null;
    }

    @Override
    protected void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
