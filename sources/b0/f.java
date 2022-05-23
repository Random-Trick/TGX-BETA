package b0;

import b0.g;
import b1.h;
import c7.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import l0.c;

public final class f {
    public static final n.a<?, ?> f3673a = new b();

    public class a implements b0.a<I, O> {
        public final n.a f3674a;

        public a(n.a aVar) {
            this.f3674a = aVar;
        }

        @Override
        public c7.a<O> apply(I i10) {
            return f.h(this.f3674a.apply(i10));
        }
    }

    public class b implements n.a<Object, Object> {
        @Override
        public Object apply(Object obj) {
            return obj;
        }
    }

    public class c implements b0.c<I> {
        public final c.a f3675a;
        public final n.a f3676b;

        public c(c.a aVar, n.a aVar2) {
            this.f3675a = aVar;
            this.f3676b = aVar2;
        }

        @Override
        public void a(I i10) {
            try {
                this.f3675a.c(this.f3676b.apply(i10));
            } catch (Throwable th) {
                this.f3675a.f(th);
            }
        }

        @Override
        public void b(Throwable th) {
            this.f3675a.f(th);
        }
    }

    public class d implements Runnable {
        public final c7.a f3677a;

        public d(c7.a aVar) {
            this.f3677a = aVar;
        }

        @Override
        public void run() {
            this.f3677a.cancel(true);
        }
    }

    public static final class e<V> implements Runnable {
        public final Future<V> f3678a;
        public final b0.c<? super V> f3679b;

        public e(Future<V> future, b0.c<? super V> cVar) {
            this.f3678a = future;
            this.f3679b = cVar;
        }

        @Override
        public void run() {
            Throwable e10;
            try {
                this.f3679b.a(f.d(this.f3678a));
            } catch (Error e11) {
                e10 = e11;
                this.f3679b.b(e10);
            } catch (RuntimeException e12) {
                e10 = e12;
                this.f3679b.b(e10);
            } catch (ExecutionException e13) {
                this.f3679b.b(e13.getCause());
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f3679b;
        }
    }

    public static <V> void b(c7.a<V> aVar, b0.c<? super V> cVar, Executor executor) {
        h.e(cVar);
        aVar.a(new e(aVar, cVar), executor);
    }

    public static <V> c7.a<List<V>> c(Collection<? extends c7.a<? extends V>> collection) {
        return new h(new ArrayList(collection), true, a0.a.a());
    }

    public static <V> V d(Future<V> future) {
        boolean isDone = future.isDone();
        h.h(isDone, "Future was expected to be done, " + future);
        return (V) e(future);
    }

    public static <V> V e(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static <V> c7.a<V> f(Throwable th) {
        return new g.a(th);
    }

    public static <V> ScheduledFuture<V> g(Throwable th) {
        return new g.b(th);
    }

    public static <V> c7.a<V> h(V v10) {
        if (v10 == null) {
            return g.b();
        }
        return new g.c(v10);
    }

    public static Object i(c7.a aVar, c.a aVar2) {
        m(false, aVar, f3673a, aVar2, a0.a.a());
        return "nonCancellationPropagating[" + aVar + "]";
    }

    public static <V> c7.a<V> j(final c7.a<V> aVar) {
        h.e(aVar);
        return aVar.isDone() ? aVar : l0.c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar2) {
                Object i10;
                i10 = f.i(a.this, aVar2);
                return i10;
            }
        });
    }

    public static <V> void k(c7.a<V> aVar, c.a<V> aVar2) {
        l(aVar, f3673a, aVar2, a0.a.a());
    }

    public static <I, O> void l(c7.a<I> aVar, n.a<? super I, ? extends O> aVar2, c.a<O> aVar3, Executor executor) {
        m(true, aVar, aVar2, aVar3, executor);
    }

    public static <I, O> void m(boolean z10, c7.a<I> aVar, n.a<? super I, ? extends O> aVar2, c.a<O> aVar3, Executor executor) {
        h.e(aVar);
        h.e(aVar2);
        h.e(aVar3);
        h.e(executor);
        b(aVar, new c(aVar3, aVar2), executor);
        if (z10) {
            aVar3.a(new d(aVar), a0.a.a());
        }
    }

    public static <V> c7.a<List<V>> n(Collection<? extends c7.a<? extends V>> collection) {
        return new h(new ArrayList(collection), false, a0.a.a());
    }

    public static <I, O> c7.a<O> o(c7.a<I> aVar, n.a<? super I, ? extends O> aVar2, Executor executor) {
        h.e(aVar2);
        return p(aVar, new a(aVar2), executor);
    }

    public static <I, O> c7.a<O> p(c7.a<I> aVar, b0.a<? super I, ? extends O> aVar2, Executor executor) {
        b0.b bVar = new b0.b(aVar2, aVar);
        aVar.a(bVar, executor);
        return bVar;
    }
}
