package n6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import m5.r;

public final class m0<TResult> extends l<TResult> {
    public final Object f17725a = new Object();
    public final i0<TResult> f17726b = new i0<>();
    @GuardedBy("mLock")
    public boolean f17727c;
    public volatile boolean f17728d;
    @GuardedBy("mLock")
    public TResult f17729e;
    @GuardedBy("mLock")
    public Exception f17730f;

    @Override
    public final l<TResult> a(Executor executor, e eVar) {
        this.f17726b.a(new y(executor, eVar));
        z();
        return this;
    }

    @Override
    public final l<TResult> b(Executor executor, f<TResult> fVar) {
        this.f17726b.a(new a0(executor, fVar));
        z();
        return this;
    }

    @Override
    public final l<TResult> c(f<TResult> fVar) {
        this.f17726b.a(new a0(n.f17731a, fVar));
        z();
        return this;
    }

    @Override
    public final l<TResult> d(Executor executor, g gVar) {
        this.f17726b.a(new c0(executor, gVar));
        z();
        return this;
    }

    @Override
    public final l<TResult> e(g gVar) {
        d(n.f17731a, gVar);
        return this;
    }

    @Override
    public final l<TResult> f(Executor executor, h<? super TResult> hVar) {
        this.f17726b.a(new e0(executor, hVar));
        z();
        return this;
    }

    @Override
    public final l<TResult> g(h<? super TResult> hVar) {
        f(n.f17731a, hVar);
        return this;
    }

    @Override
    public final <TContinuationResult> l<TContinuationResult> h(Executor executor, c<TResult, TContinuationResult> cVar) {
        m0 m0Var = new m0();
        this.f17726b.a(new u(executor, cVar, m0Var));
        z();
        return m0Var;
    }

    @Override
    public final <TContinuationResult> l<TContinuationResult> i(c<TResult, TContinuationResult> cVar) {
        return h(n.f17731a, cVar);
    }

    @Override
    public final <TContinuationResult> l<TContinuationResult> j(Executor executor, c<TResult, l<TContinuationResult>> cVar) {
        m0 m0Var = new m0();
        this.f17726b.a(new w(executor, cVar, m0Var));
        z();
        return m0Var;
    }

    @Override
    public final Exception k() {
        Exception exc;
        synchronized (this.f17725a) {
            exc = this.f17730f;
        }
        return exc;
    }

    @Override
    public final TResult l() {
        TResult tresult;
        synchronized (this.f17725a) {
            w();
            y();
            Exception exc = this.f17730f;
            if (exc == null) {
                tresult = this.f17729e;
            } else {
                throw new j(exc);
            }
        }
        return tresult;
    }

    @Override
    public final <X extends Throwable> TResult m(Class<X> cls) {
        TResult tresult;
        synchronized (this.f17725a) {
            w();
            y();
            if (!cls.isInstance(this.f17730f)) {
                Exception exc = this.f17730f;
                if (exc == null) {
                    tresult = this.f17729e;
                } else {
                    throw new j(exc);
                }
            } else {
                throw cls.cast(this.f17730f);
            }
        }
        return tresult;
    }

    @Override
    public final boolean n() {
        return this.f17728d;
    }

    @Override
    public final boolean o() {
        boolean z10;
        synchronized (this.f17725a) {
            z10 = this.f17727c;
        }
        return z10;
    }

    @Override
    public final boolean p() {
        boolean z10;
        synchronized (this.f17725a) {
            z10 = false;
            if (this.f17727c && !this.f17728d && this.f17730f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final <TContinuationResult> l<TContinuationResult> q(Executor executor, k<TResult, TContinuationResult> kVar) {
        m0 m0Var = new m0();
        this.f17726b.a(new g0(executor, kVar, m0Var));
        z();
        return m0Var;
    }

    public final void r(TResult tresult) {
        synchronized (this.f17725a) {
            x();
            this.f17727c = true;
            this.f17729e = tresult;
        }
        this.f17726b.b(this);
    }

    public final boolean s(TResult tresult) {
        synchronized (this.f17725a) {
            if (this.f17727c) {
                return false;
            }
            this.f17727c = true;
            this.f17729e = tresult;
            this.f17726b.b(this);
            return true;
        }
    }

    public final void t(Exception exc) {
        r.l(exc, "Exception must not be null");
        synchronized (this.f17725a) {
            x();
            this.f17727c = true;
            this.f17730f = exc;
        }
        this.f17726b.b(this);
    }

    public final boolean u(Exception exc) {
        r.l(exc, "Exception must not be null");
        synchronized (this.f17725a) {
            if (this.f17727c) {
                return false;
            }
            this.f17727c = true;
            this.f17730f = exc;
            this.f17726b.b(this);
            return true;
        }
    }

    public final boolean v() {
        synchronized (this.f17725a) {
            if (this.f17727c) {
                return false;
            }
            this.f17727c = true;
            this.f17728d = true;
            this.f17726b.b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    public final void w() {
        r.n(this.f17727c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    public final void x() {
        if (this.f17727c) {
            throw d.a(this);
        }
    }

    @GuardedBy("mLock")
    public final void y() {
        if (this.f17728d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void z() {
        synchronized (this.f17725a) {
            if (this.f17727c) {
                this.f17726b.b(this);
            }
        }
    }
}
