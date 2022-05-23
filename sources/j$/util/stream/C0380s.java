package j$.util.stream;

import j$.util.H;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.o;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C0380s extends AbstractC0329h2 {
    public C0380s(AbstractC0301c cVar, int i10, int i11) {
        super(cVar, i11);
    }

    @Override
    final Q0 F0(E0 e02, H h10, o oVar) {
        if (EnumC0325g3.DISTINCT.d(e02.e0())) {
            return e02.W(h10, false, oVar);
        }
        if (EnumC0325g3.ORDERED.d(e02.e0())) {
            return T0(e02, h10);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new Y(new C0361o(atomicBoolean, concurrentHashMap, 0), false).f(e02, h10);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new U0(keySet);
    }

    @Override
    final H G0(E0 e02, H h10) {
        return EnumC0325g3.DISTINCT.d(e02.e0()) ? e02.w0(h10) : EnumC0325g3.ORDERED.d(e02.e0()) ? ((U0) T0(e02, h10)).mo31spliterator() : new C0370p3(e02.w0(h10));
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        Objects.requireNonNull(r2Var);
        return EnumC0325g3.DISTINCT.d(i10) ? r2Var : EnumC0325g3.SORTED.d(i10) ? new C0371q(r2Var) : new r(this, r2Var);
    }

    final Q0 T0(E0 e02, H h10) {
        return new U0((Collection) ((AbstractC0299b2) E0.s0(C0366p.f14830a, C0291a.f14670c, C0346l.f14791b)).f(e02, h10));
    }
}
