package u1;

import java.util.concurrent.atomic.AtomicBoolean;
import x1.f;

public abstract class k {
    public final AtomicBoolean f23529a = new AtomicBoolean(false);
    public final e f23530b;
    public volatile f f23531c;

    public k(e eVar) {
        this.f23530b = eVar;
    }

    public f a() {
        b();
        return e(this.f23529a.compareAndSet(false, true));
    }

    public void b() {
        this.f23530b.a();
    }

    public final f c() {
        return this.f23530b.d(d());
    }

    public abstract String d();

    public final f e(boolean z10) {
        if (!z10) {
            return c();
        }
        if (this.f23531c == null) {
            this.f23531c = c();
        }
        return this.f23531c;
    }

    public void f(f fVar) {
        if (fVar == this.f23531c) {
            this.f23529a.set(false);
        }
    }
}
