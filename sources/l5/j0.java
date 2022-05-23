package l5;

import android.os.Bundle;
import j5.a;
import java.util.concurrent.locks.Lock;
import k5.f;
import m5.e;
import m5.r;

public final class j0 implements f.b, f.c {
    public final l0 f16119a;

    public j0(l0 l0Var, b0 b0Var) {
        this.f16119a = l0Var;
    }

    @Override
    public final void q(int i10) {
    }

    @Override
    public final void r(a aVar) {
        Lock lock;
        Lock lock2;
        boolean m10;
        lock = this.f16119a.f16129b;
        lock.lock();
        try {
            m10 = this.f16119a.m(aVar);
            if (m10) {
                this.f16119a.l();
                this.f16119a.i();
            } else {
                this.f16119a.n(aVar);
            }
        } finally {
            lock2 = this.f16119a.f16129b;
            lock2.unlock();
        }
    }

    @Override
    public final void t(Bundle bundle) {
        e eVar;
        k6.f fVar;
        eVar = this.f16119a.f16145r;
        e eVar2 = (e) r.k(eVar);
        fVar = this.f16119a.f16138k;
        ((k6.f) r.k(fVar)).j(new i0(this.f16119a));
    }
}
