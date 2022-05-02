package p009a8;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p021b6.C1278p;
import p163l5.C6378r;
import p177m6.AbstractC6753a;
import p177m6.AbstractC6775l;
import p177m6.C6755b;
import p177m6.C6777m;
import p177m6.C6781o;
import p314w7.C9987a;

public abstract class AbstractC0220k {
    public final AtomicInteger f697b = new AtomicInteger(0);
    public final AtomicBoolean f698c = new AtomicBoolean(false);
    @RecentlyNonNull
    public final C0224o f696a = new C0224o();

    @RecentlyNonNull
    public <T> AbstractC6775l<T> m42074a(@RecentlyNonNull final Executor executor, @RecentlyNonNull final Callable<T> callable, @RecentlyNonNull final AbstractC6753a aVar) {
        C6378r.m20505m(this.f697b.get() > 0);
        if (aVar.mo19045a()) {
            return C6781o.m19052d();
        }
        final C6755b bVar = new C6755b();
        final C6777m mVar = new C6777m(bVar.m19098b());
        this.f696a.m42065a(new Executor() {
            @Override
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                AbstractC6753a aVar2 = aVar;
                C6755b bVar2 = bVar;
                C6777m mVar2 = mVar;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e) {
                    if (aVar2.mo19045a()) {
                        bVar2.m19099a();
                    } else {
                        mVar2.m19086b(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() {
            @Override
            public final void run() {
                AbstractC0220k.this.m42071f(aVar, bVar, callable, mVar);
            }
        });
        return mVar.m19087a();
    }

    public abstract void mo29614b();

    public void m42073c() {
        this.f697b.incrementAndGet();
    }

    public abstract void mo29613d();

    public void m42072e(@RecentlyNonNull Executor executor) {
        C6378r.m20505m(this.f697b.get() > 0);
        this.f696a.m42065a(executor, new Runnable() {
            @Override
            public final void run() {
                AbstractC0220k.this.m42070g();
            }
        });
    }

    public final void m42071f(@RecentlyNonNull AbstractC6753a aVar, @RecentlyNonNull C6755b bVar, @RecentlyNonNull Callable callable, @RecentlyNonNull C6777m mVar) {
        try {
            if (aVar.mo19045a()) {
                bVar.m19099a();
                return;
            }
            try {
                if (!this.f698c.get()) {
                    mo29614b();
                    this.f698c.set(true);
                }
                if (aVar.mo19045a()) {
                    bVar.m19099a();
                    return;
                }
                Object call = callable.call();
                if (aVar.mo19045a()) {
                    bVar.m19099a();
                } else {
                    mVar.m19085c(call);
                }
            } catch (RuntimeException e) {
                throw new C9987a("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e2) {
            if (aVar.mo19045a()) {
                bVar.m19099a();
            } else {
                mVar.m19086b(e2);
            }
        }
    }

    public final void m42070g() {
        int decrementAndGet = this.f697b.decrementAndGet();
        C6378r.m20505m(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            mo29613d();
            this.f698c.set(false);
        }
        C1278p.m37804a();
    }
}
