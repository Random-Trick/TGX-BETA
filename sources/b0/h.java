package b0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l0.c;

public class h<V> implements c7.a<List<V>> {
    public final AtomicInteger M;
    public final c7.a<List<V>> N = l0.c.a(new a());
    public c.a<List<V>> O;
    public List<? extends c7.a<? extends V>> f3683a;
    public List<V> f3684b;
    public final boolean f3685c;

    public class a implements c.AbstractC0147c<List<V>> {
        public a() {
        }

        @Override
        public Object a(c.a<List<V>> aVar) {
            b1.h.h(h.this.O == null, "The result can only set once!");
            h.this.O = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override
        public void run() {
            h hVar = h.this;
            hVar.f3684b = null;
            hVar.f3683a = null;
        }
    }

    public class c implements Runnable {
        public final int f3688a;
        public final c7.a f3689b;

        public c(int i10, c7.a aVar) {
            this.f3688a = i10;
            this.f3689b = aVar;
        }

        @Override
        public void run() {
            h.this.f(this.f3688a, this.f3689b);
        }
    }

    public h(List<? extends c7.a<? extends V>> list, boolean z10, Executor executor) {
        this.f3683a = (List) b1.h.e(list);
        this.f3684b = new ArrayList(list.size());
        this.f3685c = z10;
        this.M = new AtomicInteger(list.size());
        e(executor);
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.N.a(runnable, executor);
    }

    public final void b() {
        List<? extends c7.a<? extends V>> list = this.f3683a;
        if (!(list == null || isDone())) {
            for (c7.a<? extends V> aVar : list) {
                while (!aVar.isDone()) {
                    try {
                        aVar.get();
                    } catch (Error e10) {
                        throw e10;
                    } catch (InterruptedException e11) {
                        throw e11;
                    } catch (Throwable unused) {
                        if (this.f3685c) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public List<V> get() {
        b();
        return this.N.get();
    }

    @Override
    public boolean cancel(boolean z10) {
        List<? extends c7.a<? extends V>> list = this.f3683a;
        if (list != null) {
            for (c7.a<? extends V> aVar : list) {
                aVar.cancel(z10);
            }
        }
        return this.N.cancel(z10);
    }

    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.N.get(j10, timeUnit);
    }

    public final void e(Executor executor) {
        a(new b(), a0.a.a());
        if (this.f3683a.isEmpty()) {
            this.O.c(new ArrayList(this.f3684b));
            return;
        }
        for (int i10 = 0; i10 < this.f3683a.size(); i10++) {
            this.f3684b.add(null);
        }
        List<? extends c7.a<? extends V>> list = this.f3683a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c7.a<? extends V> aVar = list.get(i11);
            aVar.a(new c(i11, aVar), executor);
        }
    }

    public void f(int i10, Future<? extends V> future) {
        c.a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f3684b;
        if (isDone() || list == 0) {
            b1.h.h(this.f3685c, "Future was done before all dependencies completed");
            return;
        }
        boolean z10 = true;
        try {
            try {
                try {
                    try {
                        b1.h.h(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i10, f.e(future));
                        decrementAndGet = this.M.decrementAndGet();
                        if (decrementAndGet < 0) {
                            z10 = false;
                        }
                        b1.h.h(z10, "Less than 0 remaining futures");
                    } catch (ExecutionException e10) {
                        if (this.f3685c) {
                            this.O.f(e10.getCause());
                        }
                        int decrementAndGet2 = this.M.decrementAndGet();
                        if (decrementAndGet2 < 0) {
                            z10 = false;
                        }
                        b1.h.h(z10, "Less than 0 remaining futures");
                        if (decrementAndGet2 == 0) {
                            List<V> list2 = this.f3684b;
                            if (list2 != null) {
                                aVar = this.O;
                                arrayList = new ArrayList(list2);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (RuntimeException e11) {
                    if (this.f3685c) {
                        this.O.f(e11);
                    }
                    int decrementAndGet3 = this.M.decrementAndGet();
                    if (decrementAndGet3 < 0) {
                        z10 = false;
                    }
                    b1.h.h(z10, "Less than 0 remaining futures");
                    if (decrementAndGet3 == 0) {
                        List<V> list3 = this.f3684b;
                        if (list3 != null) {
                            aVar = this.O;
                            arrayList = new ArrayList(list3);
                        }
                    } else {
                        return;
                    }
                }
            } catch (Error e12) {
                this.O.f(e12);
                int decrementAndGet4 = this.M.decrementAndGet();
                if (decrementAndGet4 < 0) {
                    z10 = false;
                }
                b1.h.h(z10, "Less than 0 remaining futures");
                if (decrementAndGet4 == 0) {
                    List<V> list4 = this.f3684b;
                    if (list4 != null) {
                        aVar = this.O;
                        arrayList = new ArrayList(list4);
                    }
                } else {
                    return;
                }
            } catch (CancellationException unused) {
                if (this.f3685c) {
                    cancel(false);
                }
                int decrementAndGet5 = this.M.decrementAndGet();
                if (decrementAndGet5 < 0) {
                    z10 = false;
                }
                b1.h.h(z10, "Less than 0 remaining futures");
                if (decrementAndGet5 == 0) {
                    List<V> list5 = this.f3684b;
                    if (list5 != null) {
                        aVar = this.O;
                        arrayList = new ArrayList(list5);
                    }
                } else {
                    return;
                }
            }
            if (decrementAndGet == 0) {
                List<V> list6 = this.f3684b;
                if (list6 != null) {
                    aVar = this.O;
                    arrayList = new ArrayList(list6);
                    aVar.c(arrayList);
                    return;
                }
                b1.h.g(isDone());
            }
        } catch (Throwable th) {
            int decrementAndGet6 = this.M.decrementAndGet();
            if (decrementAndGet6 < 0) {
                z10 = false;
            }
            b1.h.h(z10, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.f3684b;
                if (list7 != null) {
                    this.O.c(new ArrayList(list7));
                } else {
                    b1.h.g(isDone());
                }
            }
            throw th;
        }
    }

    @Override
    public boolean isCancelled() {
        return this.N.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.N.isDone();
    }
}
