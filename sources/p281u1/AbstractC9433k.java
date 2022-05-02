package p281u1;

import java.util.concurrent.atomic.AtomicBoolean;
import p323x1.AbstractC10074f;

public abstract class AbstractC9433k {
    public final AtomicBoolean f30552a = new AtomicBoolean(false);
    public final AbstractC9421e f30553b;
    public volatile AbstractC10074f f30554c;

    public AbstractC9433k(AbstractC9421e eVar) {
        this.f30553b = eVar;
    }

    public AbstractC10074f m8677a() {
        m8676b();
        return m8673e(this.f30552a.compareAndSet(false, true));
    }

    public void m8676b() {
        this.f30553b.m8733a();
    }

    public final AbstractC10074f m8675c() {
        return this.f30553b.m8730d(mo8674d());
    }

    public abstract String mo8674d();

    public final AbstractC10074f m8673e(boolean z) {
        if (!z) {
            return m8675c();
        }
        if (this.f30554c == null) {
            this.f30554c = m8675c();
        }
        return this.f30554c;
    }

    public void m8672f(AbstractC10074f fVar) {
        if (fVar == this.f30554c) {
            this.f30552a.set(false);
        }
    }
}
