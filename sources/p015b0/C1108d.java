package p015b0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p182n.AbstractC7094a;

public class C1108d<V> implements AbstractFutureC1291a<V> {
    public final AbstractFutureC1291a<V> f4305a;
    public C6287c.C6288a<V> f4306b;

    public class C1109a implements C6287c.AbstractC6290c<V> {
        public C1109a() {
        }

        @Override
        public Object mo5520a(C6287c.C6288a<V> aVar) {
            C1132h.m38319h(C1108d.this.f4306b == null, "The result can only set once!");
            C1108d.this.f4306b = aVar;
            return "FutureChain[" + C1108d.this + "]";
        }
    }

    public C1108d(AbstractFutureC1291a<V> aVar) {
        this.f4305a = (AbstractFutureC1291a) C1132h.m38322e(aVar);
    }

    public static <V> C1108d<V> m38363b(AbstractFutureC1291a<V> aVar) {
        return aVar instanceof C1108d ? (C1108d) aVar : new C1108d<>(aVar);
    }

    @Override
    public void mo13372a(Runnable runnable, Executor executor) {
        this.f4305a.mo13372a(runnable, executor);
    }

    public boolean m38362c(V v) {
        C6287c.C6288a<V> aVar = this.f4306b;
        if (aVar != null) {
            return aVar.m20716c(v);
        }
        return false;
    }

    @Override
    public boolean cancel(boolean z) {
        return this.f4305a.cancel(z);
    }

    public boolean m38361d(Throwable th) {
        C6287c.C6288a<V> aVar = this.f4306b;
        if (aVar != null) {
            return aVar.m20713f(th);
        }
        return false;
    }

    public final <T> C1108d<T> m38360e(AbstractC7094a<? super V, T> aVar, Executor executor) {
        return (C1108d) C1111f.m38344o(this, aVar, executor);
    }

    public final <T> C1108d<T> m38359f(AbstractC1104a<? super V, T> aVar, Executor executor) {
        return (C1108d) C1111f.m38343p(this, aVar, executor);
    }

    @Override
    public V get() {
        return this.f4305a.get();
    }

    @Override
    public boolean isCancelled() {
        return this.f4305a.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.f4305a.isDone();
    }

    @Override
    public V get(long j, TimeUnit timeUnit) {
        return this.f4305a.get(j, timeUnit);
    }

    public C1108d() {
        this.f4305a = C6287c.m20719a(new C1109a());
    }
}
