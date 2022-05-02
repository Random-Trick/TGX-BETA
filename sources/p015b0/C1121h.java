package p015b0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0003a;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;

public class C1121h<V> implements AbstractFutureC1291a<List<V>> {
    public final AtomicInteger f4319M;
    public final AbstractFutureC1291a<List<V>> f4320N = C6287c.m20720a(new C1122a());
    public C6287c.C6288a<List<V>> f4321O;
    public List<? extends AbstractFutureC1291a<? extends V>> f4322a;
    public List<V> f4323b;
    public final boolean f4324c;

    public class C1122a implements C6287c.AbstractC6290c<List<V>> {
        public C1122a() {
        }

        @Override
        public Object mo5520a(C6287c.C6288a<List<V>> aVar) {
            C1132h.m38322h(C1121h.this.f4321O == null, "The result can only set once!");
            C1121h.this.f4321O = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    public class RunnableC1123b implements Runnable {
        public RunnableC1123b() {
        }

        @Override
        public void run() {
            C1121h hVar = C1121h.this;
            hVar.f4323b = null;
            hVar.f4322a = null;
        }
    }

    public class RunnableC1124c implements Runnable {
        public final int f4327a;
        public final AbstractFutureC1291a f4328b;

        public RunnableC1124c(int i, AbstractFutureC1291a aVar) {
            this.f4327a = i;
            this.f4328b = aVar;
        }

        @Override
        public void run() {
            C1121h.this.m38339f(this.f4327a, this.f4328b);
        }
    }

    public C1121h(List<? extends AbstractFutureC1291a<? extends V>> list, boolean z, Executor executor) {
        this.f4322a = (List) C1132h.m38325e(list);
        this.f4323b = new ArrayList(list.size());
        this.f4324c = z;
        this.f4319M = new AtomicInteger(list.size());
        m38340e(executor);
    }

    @Override
    public void mo13371a(Runnable runnable, Executor executor) {
        this.f4320N.mo13371a(runnable, executor);
    }

    public final void m38343b() {
        List<? extends AbstractFutureC1291a<? extends V>> list = this.f4322a;
        if (!(list == null || isDone())) {
            for (AbstractFutureC1291a<? extends V> aVar : list) {
                while (!aVar.isDone()) {
                    try {
                        aVar.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f4324c) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public List<V> get() {
        m38343b();
        return this.f4320N.get();
    }

    @Override
    public boolean cancel(boolean z) {
        List<? extends AbstractFutureC1291a<? extends V>> list = this.f4322a;
        if (list != null) {
            for (AbstractFutureC1291a<? extends V> aVar : list) {
                aVar.cancel(z);
            }
        }
        return this.f4320N.cancel(z);
    }

    public List<V> get(long j, TimeUnit timeUnit) {
        return this.f4320N.get(j, timeUnit);
    }

    public final void m38340e(Executor executor) {
        mo13371a(new RunnableC1123b(), C0003a.m42614a());
        if (this.f4322a.isEmpty()) {
            this.f4321O.m20717c(new ArrayList(this.f4323b));
            return;
        }
        for (int i = 0; i < this.f4322a.size(); i++) {
            this.f4323b.add(null);
        }
        List<? extends AbstractFutureC1291a<? extends V>> list = this.f4322a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            AbstractFutureC1291a<? extends V> aVar = list.get(i2);
            aVar.mo13371a(new RunnableC1124c(i2, aVar), executor);
        }
    }

    public void m38339f(int i, Future<? extends V> future) {
        C6287c.C6288a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f4323b;
        if (isDone() || list == 0) {
            C1132h.m38322h(this.f4324c, "Future was done before all dependencies completed");
            return;
        }
        boolean z = true;
        try {
            try {
                try {
                    try {
                        C1132h.m38322h(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i, C1111f.m38357e(future));
                        decrementAndGet = this.f4319M.decrementAndGet();
                        if (decrementAndGet < 0) {
                            z = false;
                        }
                        C1132h.m38322h(z, "Less than 0 remaining futures");
                    } catch (ExecutionException e) {
                        if (this.f4324c) {
                            this.f4321O.m20714f(e.getCause());
                        }
                        int decrementAndGet2 = this.f4319M.decrementAndGet();
                        if (decrementAndGet2 < 0) {
                            z = false;
                        }
                        C1132h.m38322h(z, "Less than 0 remaining futures");
                        if (decrementAndGet2 == 0) {
                            List<V> list2 = this.f4323b;
                            if (list2 != null) {
                                aVar = this.f4321O;
                                arrayList = new ArrayList(list2);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (RuntimeException e2) {
                    if (this.f4324c) {
                        this.f4321O.m20714f(e2);
                    }
                    int decrementAndGet3 = this.f4319M.decrementAndGet();
                    if (decrementAndGet3 < 0) {
                        z = false;
                    }
                    C1132h.m38322h(z, "Less than 0 remaining futures");
                    if (decrementAndGet3 == 0) {
                        List<V> list3 = this.f4323b;
                        if (list3 != null) {
                            aVar = this.f4321O;
                            arrayList = new ArrayList(list3);
                        }
                    } else {
                        return;
                    }
                }
            } catch (Error e3) {
                this.f4321O.m20714f(e3);
                int decrementAndGet4 = this.f4319M.decrementAndGet();
                if (decrementAndGet4 < 0) {
                    z = false;
                }
                C1132h.m38322h(z, "Less than 0 remaining futures");
                if (decrementAndGet4 == 0) {
                    List<V> list4 = this.f4323b;
                    if (list4 != null) {
                        aVar = this.f4321O;
                        arrayList = new ArrayList(list4);
                    }
                } else {
                    return;
                }
            } catch (CancellationException unused) {
                if (this.f4324c) {
                    cancel(false);
                }
                int decrementAndGet5 = this.f4319M.decrementAndGet();
                if (decrementAndGet5 < 0) {
                    z = false;
                }
                C1132h.m38322h(z, "Less than 0 remaining futures");
                if (decrementAndGet5 == 0) {
                    List<V> list5 = this.f4323b;
                    if (list5 != null) {
                        aVar = this.f4321O;
                        arrayList = new ArrayList(list5);
                    }
                } else {
                    return;
                }
            }
            if (decrementAndGet == 0) {
                List<V> list6 = this.f4323b;
                if (list6 != null) {
                    aVar = this.f4321O;
                    arrayList = new ArrayList(list6);
                    aVar.m20717c(arrayList);
                    return;
                }
                C1132h.m38323g(isDone());
            }
        } catch (Throwable th) {
            int decrementAndGet6 = this.f4319M.decrementAndGet();
            if (decrementAndGet6 < 0) {
                z = false;
            }
            C1132h.m38322h(z, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.f4323b;
                if (list7 != null) {
                    this.f4321O.m20717c(new ArrayList(list7));
                } else {
                    C1132h.m38323g(isDone());
                }
            }
            throw th;
        }
    }

    @Override
    public boolean isCancelled() {
        return this.f4320N.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.f4320N.isDone();
    }
}
