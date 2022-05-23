package b8;

import androidx.annotation.RecentlyNonNull;
import c6.p;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m5.r;
import n6.a;
import n6.b;
import n6.l;
import n6.m;
import n6.o;

public abstract class k {
    public final AtomicInteger f4041b = new AtomicInteger(0);
    public final AtomicBoolean f4042c = new AtomicBoolean(false);
    @RecentlyNonNull
    public final o f4040a = new o();

    @RecentlyNonNull
    public <T> l<T> a(@RecentlyNonNull final Executor executor, @RecentlyNonNull final Callable<T> callable, @RecentlyNonNull final a aVar) {
        r.m(this.f4041b.get() > 0);
        if (aVar.a()) {
            return o.d();
        }
        final b bVar = new b();
        final m mVar = new m(bVar.b());
        this.f4040a.a(new Executor() {
            @Override
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                a aVar2 = aVar;
                b bVar2 = bVar;
                m mVar2 = mVar;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e10) {
                    if (aVar2.a()) {
                        bVar2.a();
                    } else {
                        mVar2.b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() {
            @Override
            public final void run() {
                k.this.f(aVar, bVar, callable, mVar);
            }
        });
        return mVar.a();
    }

    public abstract void b();

    public void c() {
        this.f4041b.incrementAndGet();
    }

    public abstract void d();

    public void e(@RecentlyNonNull Executor executor) {
        r.m(this.f4041b.get() > 0);
        this.f4040a.a(executor, new Runnable() {
            @Override
            public final void run() {
                k.this.g();
            }
        });
    }

    public final void f(@RecentlyNonNull a aVar, @RecentlyNonNull b bVar, @RecentlyNonNull Callable callable, @RecentlyNonNull m mVar) {
        try {
            if (aVar.a()) {
                bVar.a();
                return;
            }
            try {
                if (!this.f4042c.get()) {
                    b();
                    this.f4042c.set(true);
                }
                if (aVar.a()) {
                    bVar.a();
                    return;
                }
                Object call = callable.call();
                if (aVar.a()) {
                    bVar.a();
                } else {
                    mVar.c(call);
                }
            } catch (RuntimeException e10) {
                throw new x7.a("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (aVar.a()) {
                bVar.a();
            } else {
                mVar.b(e11);
            }
        }
    }

    public final void g() {
        int decrementAndGet = this.f4041b.decrementAndGet();
        r.m(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            d();
            this.f4042c.set(false);
        }
        p.a();
    }
}
