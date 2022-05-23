package j$.util.stream;

import j$.util.function.o;

abstract class AbstractC0293a1 extends S0 implements P0 {
    public AbstractC0293a1(P0 p02, P0 p03) {
        super(p02, p03);
    }

    @Override
    public final void j(Object obj, int i10) {
        ((P0) this.f14616a).j(obj, i10);
        ((P0) this.f14617b).j(obj, i10 + ((int) ((P0) this.f14616a).count()));
    }

    @Override
    public final Object m() {
        long count = count();
        if (count < 2147483639) {
            Object g10 = g((int) count);
            j(g10, 0);
            return g10;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public final void n(Object obj) {
        ((P0) this.f14616a).n(obj);
        ((P0) this.f14617b).n(obj);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f14616a, this.f14617b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }

    @Override
    public final Object[] v(o oVar) {
        return E0.r(this, oVar);
    }
}
