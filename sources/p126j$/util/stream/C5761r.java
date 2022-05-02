package p126j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p126j$.util.AbstractC5468G;
import p126j$.util.concurrent.ConcurrentHashMap;
import p126j$.util.function.AbstractC5531m;

public class C5761r extends AbstractC5709g2 {
    public C5761r(AbstractC5686c cVar, int i, int i2) {
        super(cVar, i, i2);
    }

    @Override
    AbstractC5632P0 mo22141B0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar) {
        if (EnumC5705f3.DISTINCT.m22265d(d0.mo22301Z())) {
            return d0.mo22304R(g, false, mVar);
        }
        if (EnumC5705f3.ORDERED.m22265d(d0.mo22301Z())) {
            return m22200P0(d0, g);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new C5664X(new C5741n(atomicBoolean, concurrentHashMap, 0), false).mo22319f(d0, g);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new C5649T0(keySet);
    }

    @Override
    AbstractC5468G mo22140C0(AbstractC5572D0 d0, AbstractC5468G g) {
        return EnumC5705f3.DISTINCT.m22265d(d0.mo22301Z()) ? d0.mo22298s0(g) : EnumC5705f3.ORDERED.m22265d(d0.mo22301Z()) ? ((C5649T0) m22200P0(d0, g)).mo42629spliterator() : new C5750o3(d0.mo22298s0(g));
    }

    @Override
    public AbstractC5759q2 mo22136E0(int i, AbstractC5759q2 q2Var) {
        Objects.requireNonNull(q2Var);
        return EnumC5705f3.DISTINCT.m22265d(i) ? q2Var : EnumC5705f3.SORTED.m22265d(i) ? new C5751p(this, q2Var) : new C5756q(this, q2Var);
    }

    AbstractC5632P0 m22200P0(AbstractC5572D0 d0, AbstractC5468G g) {
        return new C5649T0((Collection) ((AbstractC5679a2) AbstractC5572D0.m22411n0(C5746o.f18436a, C5676a.f18286c, C5726k.f18397b)).mo22319f(d0, g));
    }
}
