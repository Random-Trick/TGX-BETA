package p015b0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p001a0.C0003a;
import p015b0.AbstractC1117g;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p182n.AbstractC7094a;

public final class C1111f {
    public static final AbstractC7094a<?, ?> f4309a = new C1113b();

    public class C1112a implements AbstractC1104a<I, O> {
        public final AbstractC7094a f4310a;

        public C1112a(AbstractC7094a aVar) {
            this.f4310a = aVar;
        }

        @Override
        public AbstractFutureC1291a<O> apply(I i) {
            return C1111f.m38354h(this.f4310a.apply(i));
        }
    }

    public class C1113b implements AbstractC7094a<Object, Object> {
        @Override
        public Object apply(Object obj) {
            return obj;
        }
    }

    public class C1114c implements AbstractC1107c<I> {
        public final C6287c.C6288a f4311a;
        public final AbstractC7094a f4312b;

        public C1114c(C6287c.C6288a aVar, AbstractC7094a aVar2) {
            this.f4311a = aVar;
            this.f4312b = aVar2;
        }

        @Override
        public void mo5503a(I i) {
            try {
                this.f4311a.m20717c(this.f4312b.apply(i));
            } catch (Throwable th) {
                this.f4311a.m20714f(th);
            }
        }

        @Override
        public void mo5502b(Throwable th) {
            this.f4311a.m20714f(th);
        }
    }

    public class RunnableC1115d implements Runnable {
        public final AbstractFutureC1291a f4313a;

        public RunnableC1115d(AbstractFutureC1291a aVar) {
            this.f4313a = aVar;
        }

        @Override
        public void run() {
            this.f4313a.cancel(true);
        }
    }

    public static final class RunnableC1116e<V> implements Runnable {
        public final Future<V> f4314a;
        public final AbstractC1107c<? super V> f4315b;

        public RunnableC1116e(Future<V> future, AbstractC1107c<? super V> cVar) {
            this.f4314a = future;
            this.f4315b = cVar;
        }

        @Override
        public void run() {
            Throwable e;
            try {
                this.f4315b.mo5503a(C1111f.m38358d(this.f4314a));
            } catch (Error e2) {
                e = e2;
                this.f4315b.mo5502b(e);
            } catch (RuntimeException e3) {
                e = e3;
                this.f4315b.mo5502b(e);
            } catch (ExecutionException e4) {
                this.f4315b.mo5502b(e4.getCause());
            }
        }

        public String toString() {
            return RunnableC1116e.class.getSimpleName() + "," + this.f4315b;
        }
    }

    public static <V> void m38360b(AbstractFutureC1291a<V> aVar, AbstractC1107c<? super V> cVar, Executor executor) {
        C1132h.m38325e(cVar);
        aVar.mo13371a(new RunnableC1116e(aVar, cVar), executor);
    }

    public static <V> AbstractFutureC1291a<List<V>> m38359c(Collection<? extends AbstractFutureC1291a<? extends V>> collection) {
        return new C1121h(new ArrayList(collection), true, C0003a.m42614a());
    }

    public static <V> V m38358d(Future<V> future) {
        boolean isDone = future.isDone();
        C1132h.m38322h(isDone, "Future was expected to be done, " + future);
        return (V) m38357e(future);
    }

    public static <V> V m38357e(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static <V> AbstractFutureC1291a<V> m38356f(Throwable th) {
        return new AbstractC1117g.C1118a(th);
    }

    public static <V> ScheduledFuture<V> m38355g(Throwable th) {
        return new AbstractC1117g.ScheduledFutureC1119b(th);
    }

    public static <V> AbstractFutureC1291a<V> m38354h(V v) {
        if (v == null) {
            return AbstractC1117g.m38345b();
        }
        return new AbstractC1117g.C1120c(v);
    }

    public static Object m38353i(AbstractFutureC1291a aVar, C6287c.C6288a aVar2) {
        m38349m(false, aVar, f4309a, aVar2, C0003a.m42614a());
        return "nonCancellationPropagating[" + aVar + "]";
    }

    public static <V> AbstractFutureC1291a<V> m38352j(final AbstractFutureC1291a<V> aVar) {
        C1132h.m38325e(aVar);
        return aVar.isDone() ? aVar : C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar2) {
                Object i;
                i = C1111f.m38353i(AbstractFutureC1291a.this, aVar2);
                return i;
            }
        });
    }

    public static <V> void m38351k(AbstractFutureC1291a<V> aVar, C6287c.C6288a<V> aVar2) {
        m38350l(aVar, f4309a, aVar2, C0003a.m42614a());
    }

    public static <I, O> void m38350l(AbstractFutureC1291a<I> aVar, AbstractC7094a<? super I, ? extends O> aVar2, C6287c.C6288a<O> aVar3, Executor executor) {
        m38349m(true, aVar, aVar2, aVar3, executor);
    }

    public static <I, O> void m38349m(boolean z, AbstractFutureC1291a<I> aVar, AbstractC7094a<? super I, ? extends O> aVar2, C6287c.C6288a<O> aVar3, Executor executor) {
        C1132h.m38325e(aVar);
        C1132h.m38325e(aVar2);
        C1132h.m38325e(aVar3);
        C1132h.m38325e(executor);
        m38360b(aVar, new C1114c(aVar3, aVar2), executor);
        if (z) {
            aVar3.m20719a(new RunnableC1115d(aVar), C0003a.m42614a());
        }
    }

    public static <V> AbstractFutureC1291a<List<V>> m38348n(Collection<? extends AbstractFutureC1291a<? extends V>> collection) {
        return new C1121h(new ArrayList(collection), false, C0003a.m42614a());
    }

    public static <I, O> AbstractFutureC1291a<O> m38347o(AbstractFutureC1291a<I> aVar, AbstractC7094a<? super I, ? extends O> aVar2, Executor executor) {
        C1132h.m38325e(aVar2);
        return m38346p(aVar, new C1112a(aVar2), executor);
    }

    public static <I, O> AbstractFutureC1291a<O> m38346p(AbstractFutureC1291a<I> aVar, AbstractC1104a<? super I, ? extends O> aVar2, Executor executor) {
        RunnableC1105b bVar = new RunnableC1105b(aVar2, aVar);
        aVar.mo13371a(bVar, executor);
        return bVar;
    }
}
