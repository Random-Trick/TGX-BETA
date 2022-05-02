package p126j$.util.stream;

import p126j$.util.function.AbstractC5531m;

public abstract class AbstractC5673Z0 extends AbstractC5641R0 implements AbstractC5627O0 {
    public AbstractC5673Z0(AbstractC5627O0 o0, AbstractC5627O0 o02) {
        super(o0, o02);
    }

    @Override
    public void mo22157i(Object obj, int i) {
        ((AbstractC5627O0) this.f18221a).mo22157i(obj, i);
        ((AbstractC5627O0) this.f18222b).mo22157i(obj, i + ((int) ((AbstractC5627O0) this.f18221a).count()));
    }

    @Override
    public Object mo22156l() {
        long count = count();
        if (count < 2147483639) {
            Object g = mo22347g((int) count);
            mo22157i(g, 0);
            return g;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public void mo22155m(Object obj) {
        ((AbstractC5627O0) this.f18221a).mo22155m(obj);
        ((AbstractC5627O0) this.f18222b).mo22155m(obj);
    }

    @Override
    public Object[] mo22152p(AbstractC5531m mVar) {
        return AbstractC5572D0.m22410o(this, mVar);
    }

    public String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f18221a, this.f18222b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
