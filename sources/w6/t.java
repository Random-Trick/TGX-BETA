package w6;

import java.util.concurrent.Executor;
import t6.s;

public final class t<ResultT> extends e<ResultT> {
    public final Object f25797a = new Object();
    public final o f25798b = new o();
    public boolean f25799c;
    public Object f25800d;
    public Exception f25801e;

    @Override
    public final e<ResultT> a(a<ResultT> aVar) {
        this.f25798b.a(new i(f.f25775a, aVar));
        p();
        return this;
    }

    @Override
    public final e<ResultT> b(Executor executor, b bVar) {
        this.f25798b.a(new k(executor, bVar));
        p();
        return this;
    }

    @Override
    public final e<ResultT> c(b bVar) {
        b(f.f25775a, bVar);
        return this;
    }

    @Override
    public final e<ResultT> d(Executor executor, c<? super ResultT> cVar) {
        this.f25798b.a(new m(executor, cVar));
        p();
        return this;
    }

    @Override
    public final e<ResultT> e(c<? super ResultT> cVar) {
        d(f.f25775a, cVar);
        return this;
    }

    @Override
    public final Exception f() {
        Exception exc;
        synchronized (this.f25797a) {
            exc = this.f25801e;
        }
        return exc;
    }

    @Override
    public final ResultT g() {
        ResultT resultt;
        synchronized (this.f25797a) {
            n();
            Exception exc = this.f25801e;
            if (exc == null) {
                resultt = (ResultT) this.f25800d;
            } else {
                throw new d(exc);
            }
        }
        return resultt;
    }

    @Override
    public final boolean h() {
        boolean z10;
        synchronized (this.f25797a) {
            z10 = this.f25799c;
        }
        return z10;
    }

    @Override
    public final boolean i() {
        boolean z10;
        synchronized (this.f25797a) {
            z10 = false;
            if (this.f25799c && this.f25801e == null) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void j(Exception exc) {
        synchronized (this.f25797a) {
            o();
            this.f25799c = true;
            this.f25801e = exc;
        }
        this.f25798b.b(this);
    }

    public final void k(Object obj) {
        synchronized (this.f25797a) {
            o();
            this.f25799c = true;
            this.f25800d = obj;
        }
        this.f25798b.b(this);
    }

    public final boolean l(Exception exc) {
        synchronized (this.f25797a) {
            if (this.f25799c) {
                return false;
            }
            this.f25799c = true;
            this.f25801e = exc;
            this.f25798b.b(this);
            return true;
        }
    }

    public final boolean m(Object obj) {
        synchronized (this.f25797a) {
            if (this.f25799c) {
                return false;
            }
            this.f25799c = true;
            this.f25800d = obj;
            this.f25798b.b(this);
            return true;
        }
    }

    public final void n() {
        s.b(this.f25799c, "Task is not yet complete");
    }

    public final void o() {
        s.b(!this.f25799c, "Task is already complete");
    }

    public final void p() {
        synchronized (this.f25797a) {
            if (this.f25799c) {
                this.f25798b.b(this);
            }
        }
    }
}
