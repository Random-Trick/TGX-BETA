package p177m6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p163l5.C6378r;

public final class C6778m0<TResult> extends AbstractC6775l<TResult> {
    public final Object f21250a = new Object();
    public final C6770i0<TResult> f21251b = new C6770i0<>();
    @GuardedBy("mLock")
    public boolean f21252c;
    public volatile boolean f21253d;
    @GuardedBy("mLock")
    public TResult f21254e;
    @GuardedBy("mLock")
    public Exception f21255f;

    @Override
    public final AbstractC6775l<TResult> mo19080a(Executor executor, AbstractC6761e eVar) {
        this.f21251b.m19090a(new C6791y(executor, eVar));
        m19055z();
        return this;
    }

    @Override
    public final AbstractC6775l<TResult> mo19079b(Executor executor, AbstractC6763f<TResult> fVar) {
        this.f21251b.m19090a(new C6754a0(executor, fVar));
        m19055z();
        return this;
    }

    @Override
    public final AbstractC6775l<TResult> mo19078c(AbstractC6763f<TResult> fVar) {
        this.f21251b.m19090a(new C6754a0(C6779n.f21256a, fVar));
        m19055z();
        return this;
    }

    @Override
    public final AbstractC6775l<TResult> mo19077d(Executor executor, AbstractC6765g gVar) {
        this.f21251b.m19090a(new C6758c0(executor, gVar));
        m19055z();
        return this;
    }

    @Override
    public final AbstractC6775l<TResult> mo19076e(AbstractC6765g gVar) {
        mo19077d(C6779n.f21256a, gVar);
        return this;
    }

    @Override
    public final AbstractC6775l<TResult> mo19075f(Executor executor, AbstractC6767h<? super TResult> hVar) {
        this.f21251b.m19090a(new C6762e0(executor, hVar));
        m19055z();
        return this;
    }

    @Override
    public final AbstractC6775l<TResult> mo19074g(AbstractC6767h<? super TResult> hVar) {
        mo19075f(C6779n.f21256a, hVar);
        return this;
    }

    @Override
    public final <TContinuationResult> AbstractC6775l<TContinuationResult> mo19073h(Executor executor, AbstractC6757c<TResult, TContinuationResult> cVar) {
        C6778m0 m0Var = new C6778m0();
        this.f21251b.m19090a(new C6787u(executor, cVar, m0Var));
        m19055z();
        return m0Var;
    }

    @Override
    public final <TContinuationResult> AbstractC6775l<TContinuationResult> mo19072i(AbstractC6757c<TResult, TContinuationResult> cVar) {
        return mo19073h(C6779n.f21256a, cVar);
    }

    @Override
    public final <TContinuationResult> AbstractC6775l<TContinuationResult> mo19071j(Executor executor, AbstractC6757c<TResult, AbstractC6775l<TContinuationResult>> cVar) {
        C6778m0 m0Var = new C6778m0();
        this.f21251b.m19090a(new C6789w(executor, cVar, m0Var));
        m19055z();
        return m0Var;
    }

    @Override
    public final Exception mo19070k() {
        Exception exc;
        synchronized (this.f21250a) {
            exc = this.f21255f;
        }
        return exc;
    }

    @Override
    public final TResult mo19069l() {
        TResult tresult;
        synchronized (this.f21250a) {
            m19058w();
            m19056y();
            Exception exc = this.f21255f;
            if (exc == null) {
                tresult = this.f21254e;
            } else {
                throw new C6771j(exc);
            }
        }
        return tresult;
    }

    @Override
    public final <X extends Throwable> TResult mo19068m(Class<X> cls) {
        TResult tresult;
        synchronized (this.f21250a) {
            m19058w();
            m19056y();
            if (!cls.isInstance(this.f21255f)) {
                Exception exc = this.f21255f;
                if (exc == null) {
                    tresult = this.f21254e;
                } else {
                    throw new C6771j(exc);
                }
            } else {
                throw cls.cast(this.f21255f);
            }
        }
        return tresult;
    }

    @Override
    public final boolean mo19067n() {
        return this.f21253d;
    }

    @Override
    public final boolean mo19066o() {
        boolean z;
        synchronized (this.f21250a) {
            z = this.f21252c;
        }
        return z;
    }

    @Override
    public final boolean mo19065p() {
        boolean z;
        synchronized (this.f21250a) {
            z = false;
            if (this.f21252c && !this.f21253d && this.f21255f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override
    public final <TContinuationResult> AbstractC6775l<TContinuationResult> mo19064q(Executor executor, AbstractC6773k<TResult, TContinuationResult> kVar) {
        C6778m0 m0Var = new C6778m0();
        this.f21251b.m19090a(new C6766g0(executor, kVar, m0Var));
        m19055z();
        return m0Var;
    }

    public final void m19063r(TResult tresult) {
        synchronized (this.f21250a) {
            m19057x();
            this.f21252c = true;
            this.f21254e = tresult;
        }
        this.f21251b.m19089b(this);
    }

    public final boolean m19062s(TResult tresult) {
        synchronized (this.f21250a) {
            if (this.f21252c) {
                return false;
            }
            this.f21252c = true;
            this.f21254e = tresult;
            this.f21251b.m19089b(this);
            return true;
        }
    }

    public final void m19061t(Exception exc) {
        C6378r.m20505l(exc, "Exception must not be null");
        synchronized (this.f21250a) {
            m19057x();
            this.f21252c = true;
            this.f21255f = exc;
        }
        this.f21251b.m19089b(this);
    }

    public final boolean m19060u(Exception exc) {
        C6378r.m20505l(exc, "Exception must not be null");
        synchronized (this.f21250a) {
            if (this.f21252c) {
                return false;
            }
            this.f21252c = true;
            this.f21255f = exc;
            this.f21251b.m19089b(this);
            return true;
        }
    }

    public final boolean m19059v() {
        synchronized (this.f21250a) {
            if (this.f21252c) {
                return false;
            }
            this.f21252c = true;
            this.f21253d = true;
            this.f21251b.m19089b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    public final void m19058w() {
        C6378r.m20503n(this.f21252c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    public final void m19057x() {
        if (this.f21252c) {
            throw C6759d.m19094a(this);
        }
    }

    @GuardedBy("mLock")
    public final void m19056y() {
        if (this.f21253d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void m19055z() {
        synchronized (this.f21250a) {
            if (this.f21252c) {
                this.f21251b.m19089b(this);
            }
        }
    }
}
