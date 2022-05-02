package p300v6;

import java.util.concurrent.Executor;
import p262s6.C8682s;

public final class C9869t<ResultT> extends AbstractC9854e<ResultT> {
    public final Object f32149a = new Object();
    public final C9864o f32150b = new C9864o();
    public boolean f32151c;
    public Object f32152d;
    public Exception f32153e;

    @Override
    public final AbstractC9854e<ResultT> mo6729a(AbstractC9850a<ResultT> aVar) {
        this.f32150b.m6737a(new C9858i(C9855f.f32127a, aVar));
        m6714p();
        return this;
    }

    @Override
    public final AbstractC9854e<ResultT> mo6728b(Executor executor, AbstractC9851b bVar) {
        this.f32150b.m6737a(new C9860k(executor, bVar));
        m6714p();
        return this;
    }

    @Override
    public final AbstractC9854e<ResultT> mo6727c(AbstractC9851b bVar) {
        mo6728b(C9855f.f32127a, bVar);
        return this;
    }

    @Override
    public final AbstractC9854e<ResultT> mo6726d(Executor executor, AbstractC9852c<? super ResultT> cVar) {
        this.f32150b.m6737a(new C9862m(executor, cVar));
        m6714p();
        return this;
    }

    @Override
    public final AbstractC9854e<ResultT> mo6725e(AbstractC9852c<? super ResultT> cVar) {
        mo6726d(C9855f.f32127a, cVar);
        return this;
    }

    @Override
    public final Exception mo6724f() {
        Exception exc;
        synchronized (this.f32149a) {
            exc = this.f32153e;
        }
        return exc;
    }

    @Override
    public final ResultT mo6723g() {
        ResultT resultt;
        synchronized (this.f32149a) {
            m6716n();
            Exception exc = this.f32153e;
            if (exc == null) {
                resultt = (ResultT) this.f32152d;
            } else {
                throw new C9853d(exc);
            }
        }
        return resultt;
    }

    @Override
    public final boolean mo6722h() {
        boolean z;
        synchronized (this.f32149a) {
            z = this.f32151c;
        }
        return z;
    }

    @Override
    public final boolean mo6721i() {
        boolean z;
        synchronized (this.f32149a) {
            z = false;
            if (this.f32151c && this.f32153e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void m6720j(Exception exc) {
        synchronized (this.f32149a) {
            m6715o();
            this.f32151c = true;
            this.f32153e = exc;
        }
        this.f32150b.m6736b(this);
    }

    public final void m6719k(Object obj) {
        synchronized (this.f32149a) {
            m6715o();
            this.f32151c = true;
            this.f32152d = obj;
        }
        this.f32150b.m6736b(this);
    }

    public final boolean m6718l(Exception exc) {
        synchronized (this.f32149a) {
            if (this.f32151c) {
                return false;
            }
            this.f32151c = true;
            this.f32153e = exc;
            this.f32150b.m6736b(this);
            return true;
        }
    }

    public final boolean m6717m(Object obj) {
        synchronized (this.f32149a) {
            if (this.f32151c) {
                return false;
            }
            this.f32151c = true;
            this.f32152d = obj;
            this.f32150b.m6736b(this);
            return true;
        }
    }

    public final void m6716n() {
        C8682s.m11743b(this.f32151c, "Task is not yet complete");
    }

    public final void m6715o() {
        C8682s.m11743b(!this.f32151c, "Task is already complete");
    }

    public final void m6714p() {
        synchronized (this.f32149a) {
            if (this.f32151c) {
                this.f32150b.m6736b(this);
            }
        }
    }
}
