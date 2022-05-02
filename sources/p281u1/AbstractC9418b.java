package p281u1;

import p323x1.AbstractC10074f;

public abstract class AbstractC9418b<T> extends AbstractC9433k {
    public AbstractC9418b(AbstractC9421e eVar) {
        super(eVar);
    }

    public abstract void mo8741g(AbstractC10074f fVar, T t);

    public final void m8740h(T t) {
        AbstractC10074f a = m8677a();
        try {
            mo8741g(a, t);
            a.mo5370u0();
        } finally {
            m8672f(a);
        }
    }
}
