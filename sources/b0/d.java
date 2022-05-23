package b0;

import b1.h;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l0.c;

public class d<V> implements c7.a<V> {
    public final c7.a<V> f3669a;
    public c.a<V> f3670b;

    public class a implements c.AbstractC0147c<V> {
        public a() {
        }

        @Override
        public Object a(c.a<V> aVar) {
            h.h(d.this.f3670b == null, "The result can only set once!");
            d.this.f3670b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    public d(c7.a<V> aVar) {
        this.f3669a = (c7.a) h.e(aVar);
    }

    public static <V> d<V> b(c7.a<V> aVar) {
        return aVar instanceof d ? (d) aVar : new d<>(aVar);
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.f3669a.a(runnable, executor);
    }

    public boolean c(V v10) {
        c.a<V> aVar = this.f3670b;
        if (aVar != null) {
            return aVar.c(v10);
        }
        return false;
    }

    @Override
    public boolean cancel(boolean z10) {
        return this.f3669a.cancel(z10);
    }

    public boolean d(Throwable th) {
        c.a<V> aVar = this.f3670b;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    public final <T> d<T> e(n.a<? super V, T> aVar, Executor executor) {
        return (d) f.o(this, aVar, executor);
    }

    public final <T> d<T> f(b0.a<? super V, T> aVar, Executor executor) {
        return (d) f.p(this, aVar, executor);
    }

    @Override
    public V get() {
        return this.f3669a.get();
    }

    @Override
    public boolean isCancelled() {
        return this.f3669a.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.f3669a.isDone();
    }

    @Override
    public V get(long j10, TimeUnit timeUnit) {
        return this.f3669a.get(j10, timeUnit);
    }

    public d() {
        this.f3669a = c.a(new a());
    }
}
