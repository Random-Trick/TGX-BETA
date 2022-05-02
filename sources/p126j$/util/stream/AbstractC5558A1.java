package p126j$.util.stream;

import java.util.Objects;
import java.util.concurrent.CountedCompleter;
import p126j$.util.AbstractC5468G;

public abstract class AbstractC5558A1 extends CountedCompleter implements AbstractC5759q2 {
    protected final AbstractC5468G f18096a;
    protected final AbstractC5572D0 f18097b;
    protected final long f18098c;
    protected long f18099d;
    protected long f18100e;
    protected int f18101f;
    protected int f18102g;

    public AbstractC5558A1(AbstractC5468G g, AbstractC5572D0 d0, int i) {
        this.f18096a = g;
        this.f18097b = d0;
        this.f18098c = AbstractC5701f.m22271h(g.estimateSize());
        this.f18099d = 0L;
        this.f18100e = i;
    }

    public AbstractC5558A1(AbstractC5558A1 a1, AbstractC5468G g, long j, long j2, int i) {
        super(a1);
        this.f18096a = g;
        this.f18097b = a1.f18097b;
        this.f18098c = a1.f18098c;
        this.f18099d = j;
        this.f18100e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    abstract AbstractC5558A1 mo22129a(AbstractC5468G g, long j, long j2);

    @Override
    public void mo22135c(double d) {
        AbstractC5572D0.m22421i();
        throw null;
    }

    @Override
    public void compute() {
        AbstractC5468G trySplit;
        AbstractC5468G g = this.f18096a;
        AbstractC5558A1 a1 = this;
        while (g.estimateSize() > a1.f18098c && (trySplit = g.trySplit()) != null) {
            a1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            a1.mo22129a(trySplit, a1.f18099d, estimateSize).fork();
            a1 = a1.mo22129a(g, a1.f18099d + estimateSize, a1.f18100e - estimateSize);
        }
        AbstractC5686c cVar = (AbstractC5686c) a1.f18097b;
        Objects.requireNonNull(cVar);
        cVar.mo22306M(cVar.mo22299r0(a1), g);
        a1.propagateCompletion();
    }

    @Override
    public void mo22134d(int i) {
        AbstractC5572D0.m22414m();
        throw null;
    }

    @Override
    public void mo22133e(long j) {
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        long j2 = this.f18100e;
        if (j <= j2) {
            int i = (int) this.f18099d;
            this.f18101f = i;
            this.f18102g = i + ((int) j2);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
