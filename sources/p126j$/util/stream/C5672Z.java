package p126j$.util.stream;

import java.util.Objects;
import java.util.concurrent.CountedCompleter;
import p126j$.util.AbstractC5468G;
import p126j$.util.concurrent.ConcurrentHashMap;

final class C5672Z extends CountedCompleter {
    public static final int f18273h = 0;
    private final AbstractC5572D0 f18274a;
    private AbstractC5468G f18275b;
    private final long f18276c;
    private final ConcurrentHashMap f18277d;
    private final AbstractC5759q2 f18278e;
    private final C5672Z f18279f;
    private AbstractC5632P0 f18280g;

    public C5672Z(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5759q2 q2Var) {
        super(null);
        this.f18274a = d0;
        this.f18275b = g;
        this.f18276c = AbstractC5701f.m22271h(g.estimateSize());
        this.f18277d = new ConcurrentHashMap(Math.max(16, AbstractC5701f.f18349g << 1));
        this.f18278e = q2Var;
        this.f18279f = null;
    }

    C5672Z(C5672Z z, AbstractC5468G g, C5672Z z2) {
        super(z);
        this.f18274a = z.f18274a;
        this.f18275b = g;
        this.f18276c = z.f18276c;
        this.f18277d = z.f18277d;
        this.f18278e = z.f18278e;
        this.f18279f = z2;
    }

    @Override
    public final void compute() {
        AbstractC5468G trySplit;
        AbstractC5468G g = this.f18275b;
        long j = this.f18276c;
        boolean z = false;
        C5672Z z2 = this;
        while (g.estimateSize() > j && (trySplit = g.trySplit()) != null) {
            C5672Z z3 = new C5672Z(z2, trySplit, z2.f18279f);
            C5672Z z4 = new C5672Z(z2, g, z3);
            z2.addToPendingCount(1);
            z4.addToPendingCount(1);
            z2.f18277d.put(z3, z4);
            if (z2.f18279f != null) {
                z3.addToPendingCount(1);
                if (z2.f18277d.replace(z2.f18279f, z2, z3)) {
                    z2.addToPendingCount(-1);
                } else {
                    z3.addToPendingCount(-1);
                }
            }
            if (z) {
                g = trySplit;
                z2 = z3;
                z3 = z4;
            } else {
                z2 = z4;
            }
            z = !z;
            z3.fork();
        }
        if (z2.getPendingCount() > 0) {
            C5731l lVar = C5731l.f18419e;
            AbstractC5572D0 d0 = z2.f18274a;
            AbstractC5592H0 k0 = d0.mo22189k0(d0.mo22303S(g), lVar);
            AbstractC5686c cVar = (AbstractC5686c) z2.f18274a;
            Objects.requireNonNull(cVar);
            Objects.requireNonNull(k0);
            cVar.mo22306M(cVar.mo22299r0(k0), g);
            z2.f18280g = k0.mo42630b();
            z2.f18275b = null;
        }
        z2.tryComplete();
    }

    @Override
    public void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5632P0 p0 = this.f18280g;
        if (p0 != null) {
            p0.mo22176a(this.f18278e);
            this.f18280g = null;
        } else {
            AbstractC5468G g = this.f18275b;
            if (g != null) {
                this.f18274a.mo22300q0(this.f18278e, g);
                this.f18275b = null;
            }
        }
        C5672Z z = (C5672Z) this.f18277d.remove(this);
        if (z != null) {
            z.tryComplete();
        }
    }
}
