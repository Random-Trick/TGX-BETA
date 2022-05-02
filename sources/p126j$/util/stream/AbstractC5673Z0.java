package p126j$.util.stream;

import p126j$.util.function.AbstractC5531m;

public abstract class AbstractC5673Z0 extends AbstractC5641R0 implements AbstractC5627O0 {
    public AbstractC5673Z0(AbstractC5627O0 o0, AbstractC5627O0 o02) {
        super(o0, o02);
    }

    @Override
    public void mo22158i(Object obj, int i) {
        ((AbstractC5627O0) this.f18221a).mo22158i(obj, i);
        ((AbstractC5627O0) this.f18222b).mo22158i(obj, i + ((int) ((AbstractC5627O0) this.f18221a).count()));
    }

    @Override
    public Object mo22157l() {
        long count = count();
        if (count < 2147483639) {
            Object g = mo22348g((int) count);
            mo22158i(g, 0);
            return g;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public void mo22156m(Object obj) {
        ((AbstractC5627O0) this.f18221a).mo22156m(obj);
        ((AbstractC5627O0) this.f18222b).mo22156m(obj);
    }

    @Override
    public Object[] mo22153p(AbstractC5531m mVar) {
        return AbstractC5572D0.m22411o(this, mVar);
    }

    public String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f18221a, this.f18222b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
