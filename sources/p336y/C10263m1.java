package p336y;

import androidx.lifecycle.AbstractC0856o;
import androidx.lifecycle.C0855n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.C0003a;
import p016b1.C1132h;
import p336y.AbstractC10293r1;
import p336y.C10263m1;

public final class C10263m1<T> implements AbstractC10293r1<T> {
    public final C0855n<C10265b<T>> f33076a = new C0855n<>();
    public final Map<AbstractC10293r1.AbstractC10294a<? super T>, C10264a<T>> f33077b = new HashMap();

    public static final class C10264a<T> implements AbstractC0856o<C10265b<T>> {
        public final AtomicBoolean f33078a = new AtomicBoolean(true);
        public final AbstractC10293r1.AbstractC10294a<? super T> f33079b;
        public final Executor f33080c;

        public C10264a(Executor executor, AbstractC10293r1.AbstractC10294a<? super T> aVar) {
            this.f33080c = executor;
            this.f33079b = aVar;
        }

        public void m5594d(C10265b bVar) {
            if (this.f33078a.get()) {
                if (bVar.m5592a()) {
                    this.f33079b.mo5528a((Object) bVar.m5589d());
                    return;
                }
                C1132h.m38325e(bVar.m5590c());
                this.f33079b.mo5527b(bVar.m5590c());
            }
        }

        public void m5595c() {
            this.f33078a.set(false);
        }

        public void mo5597a(final C10265b<T> bVar) {
            this.f33080c.execute(new Runnable() {
                @Override
                public final void run() {
                    C10263m1.C10264a.this.m5594d(bVar);
                }
            });
        }
    }

    public static final class C10265b<T> {
        public final T f33081a;
        public final Throwable f33082b;

        public C10265b(T t, Throwable th) {
            this.f33081a = t;
            this.f33082b = th;
        }

        public static <T> C10265b<T> m5591b(T t) {
            return new C10265b<>(t, null);
        }

        public boolean m5592a() {
            return this.f33082b == null;
        }

        public Throwable m5590c() {
            return this.f33082b;
        }

        public T m5589d() {
            if (m5592a()) {
                return this.f33081a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (m5592a()) {
                str = "Value: " + this.f33081a;
            } else {
                str = "Error: " + this.f33082b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    public void m5600e(C10264a aVar, C10264a aVar2) {
        if (aVar != null) {
            this.f33076a.mo15731l(aVar);
        }
        this.f33076a.m39686h(aVar2);
    }

    public void m5599f(C10264a aVar) {
        this.f33076a.mo15731l(aVar);
    }

    @Override
    public void mo5530a(Executor executor, AbstractC10293r1.AbstractC10294a<? super T> aVar) {
        synchronized (this.f33077b) {
            final C10264a<T> aVar2 = this.f33077b.get(aVar);
            if (aVar2 != null) {
                aVar2.m5595c();
            }
            final C10264a<T> aVar3 = new C10264a<>(executor, aVar);
            this.f33077b.put(aVar, aVar3);
            C0003a.m42611d().execute(new Runnable() {
                @Override
                public final void run() {
                    C10263m1.this.m5600e(aVar2, aVar3);
                }
            });
        }
    }

    @Override
    public void mo5529b(AbstractC10293r1.AbstractC10294a<? super T> aVar) {
        synchronized (this.f33077b) {
            final C10264a<T> remove = this.f33077b.remove(aVar);
            if (remove != null) {
                remove.m5595c();
                C0003a.m42611d().execute(new Runnable() {
                    @Override
                    public final void run() {
                        C10263m1.this.m5599f(remove);
                    }
                });
            }
        }
    }

    public void m5598g(T t) {
        this.f33076a.mo39637k(C10265b.m5591b(t));
    }
}
