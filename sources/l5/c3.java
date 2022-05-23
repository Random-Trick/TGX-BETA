package l5;

import android.os.Bundle;
import j5.a;
import java.util.concurrent.locks.Lock;

public final class c3 implements j1 {
    public final e3 f16054a;

    public c3(e3 e3Var, b3 b3Var) {
        this.f16054a = e3Var;
    }

    @Override
    public final void a(a aVar) {
        e3.n(this.f16054a).lock();
        try {
            e3.q(this.f16054a, aVar);
            e3.o(this.f16054a);
        } finally {
            e3.n(this.f16054a).unlock();
        }
    }

    @Override
    public final void b(Bundle bundle) {
        e3.n(this.f16054a).lock();
        try {
            e3.p(this.f16054a, bundle);
            e3.q(this.f16054a, a.N);
            e3.o(this.f16054a);
        } finally {
            e3.n(this.f16054a).unlock();
        }
    }

    @Override
    public final void c(int i10, boolean z10) {
        Lock n10;
        e3.n(this.f16054a).lock();
        try {
            if (!e3.r(this.f16054a) && e3.s(this.f16054a) != null && e3.s(this.f16054a).f()) {
                e3.t(this.f16054a, true);
                e3.v(this.f16054a).q(i10);
                n10 = e3.n(this.f16054a);
                n10.unlock();
            }
            e3.t(this.f16054a, false);
            e3.u(this.f16054a, i10, z10);
            n10 = e3.n(this.f16054a);
            n10.unlock();
        } catch (Throwable th) {
            e3.n(this.f16054a).unlock();
            throw th;
        }
    }
}
