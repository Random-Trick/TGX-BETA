package p158l0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p022b7.AbstractFutureC1291a;

public final class C6287c {

    public static final class C6288a<T> {
        public Object f19824a;
        public C6291d<T> f19825b;
        public C6293d<Void> f19826c = C6293d.m20706s();
        public boolean f19827d;

        public void m20718a(Runnable runnable, Executor executor) {
            C6293d<Void> dVar = this.f19826c;
            if (dVar != null) {
                dVar.mo13372a(runnable, executor);
            }
        }

        public void m20717b() {
            this.f19824a = null;
            this.f19825b = null;
            this.f19826c.mo20708p(null);
        }

        public boolean m20716c(T t) {
            boolean z = true;
            this.f19827d = true;
            C6291d<T> dVar = this.f19825b;
            if (dVar == null || !dVar.m20711c(t)) {
                z = false;
            }
            if (z) {
                m20714e();
            }
            return z;
        }

        public boolean m20715d() {
            boolean z = true;
            this.f19827d = true;
            C6291d<T> dVar = this.f19825b;
            if (dVar == null || !dVar.m20712b(true)) {
                z = false;
            }
            if (z) {
                m20714e();
            }
            return z;
        }

        public final void m20714e() {
            this.f19824a = null;
            this.f19825b = null;
            this.f19826c = null;
        }

        public boolean m20713f(Throwable th) {
            boolean z = true;
            this.f19827d = true;
            C6291d<T> dVar = this.f19825b;
            if (dVar == null || !dVar.m20710d(th)) {
                z = false;
            }
            if (z) {
                m20714e();
            }
            return z;
        }

        public void finalize() {
            C6293d<Void> dVar;
            C6291d<T> dVar2 = this.f19825b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.m20710d(new C6289b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f19824a));
            }
            if (!this.f19827d && (dVar = this.f19826c) != null) {
                dVar.mo20708p(null);
            }
        }
    }

    public static final class C6289b extends Throwable {
        public C6289b(String str) {
            super(str);
        }

        @Override
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface AbstractC6290c<T> {
        Object mo5520a(C6288a<T> aVar);
    }

    public static final class C6291d<T> implements AbstractFutureC1291a<T> {
        public final WeakReference<C6288a<T>> f19828a;
        public final AbstractC6275a<T> f19829b = new C6292a();

        public class C6292a extends AbstractC6275a<T> {
            public C6292a() {
            }

            @Override
            public String mo20709m() {
                C6288a<T> aVar = C6291d.this.f19828a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f19824a + "]";
            }
        }

        public C6291d(C6288a<T> aVar) {
            this.f19828a = new WeakReference<>(aVar);
        }

        @Override
        public void mo13372a(Runnable runnable, Executor executor) {
            this.f19829b.mo13372a(runnable, executor);
        }

        public boolean m20712b(boolean z) {
            return this.f19829b.cancel(z);
        }

        public boolean m20711c(T t) {
            return this.f19829b.mo20708p(t);
        }

        @Override
        public boolean cancel(boolean z) {
            C6288a<T> aVar = this.f19828a.get();
            boolean cancel = this.f19829b.cancel(z);
            if (cancel && aVar != null) {
                aVar.m20717b();
            }
            return cancel;
        }

        public boolean m20710d(Throwable th) {
            return this.f19829b.mo20707q(th);
        }

        @Override
        public T get() {
            return this.f19829b.get();
        }

        @Override
        public boolean isCancelled() {
            return this.f19829b.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.f19829b.isDone();
        }

        public String toString() {
            return this.f19829b.toString();
        }

        @Override
        public T get(long j, TimeUnit timeUnit) {
            return this.f19829b.get(j, timeUnit);
        }
    }

    public static <T> AbstractFutureC1291a<T> m20719a(AbstractC6290c<T> cVar) {
        C6288a<T> aVar = new C6288a<>();
        C6291d<T> dVar = new C6291d<>(aVar);
        aVar.f19825b = dVar;
        aVar.f19824a = cVar.getClass();
        try {
            Object a = cVar.mo5520a(aVar);
            if (a != null) {
                aVar.f19824a = a;
            }
        } catch (Exception e) {
            dVar.m20710d(e);
        }
        return dVar;
    }
}
