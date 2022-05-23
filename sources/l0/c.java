package l0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class c {

    public static final class a<T> {
        public Object f15988a;
        public d<T> f15989b;
        public l0.d<Void> f15990c = l0.d.s();
        public boolean f15991d;

        public void a(Runnable runnable, Executor executor) {
            l0.d<Void> dVar = this.f15990c;
            if (dVar != null) {
                dVar.a(runnable, executor);
            }
        }

        public void b() {
            this.f15988a = null;
            this.f15989b = null;
            this.f15990c.p(null);
        }

        public boolean c(T t10) {
            boolean z10 = true;
            this.f15991d = true;
            d<T> dVar = this.f15989b;
            if (dVar == null || !dVar.c(t10)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            boolean z10 = true;
            this.f15991d = true;
            d<T> dVar = this.f15989b;
            if (dVar == null || !dVar.b(true)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        public final void e() {
            this.f15988a = null;
            this.f15989b = null;
            this.f15990c = null;
        }

        public boolean f(Throwable th) {
            boolean z10 = true;
            this.f15991d = true;
            d<T> dVar = this.f15989b;
            if (dVar == null || !dVar.d(th)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        public void finalize() {
            l0.d<Void> dVar;
            d<T> dVar2 = this.f15989b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f15988a));
            }
            if (!this.f15991d && (dVar = this.f15990c) != null) {
                dVar.p(null);
            }
        }
    }

    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface AbstractC0147c<T> {
        Object a(a<T> aVar);
    }

    public static final class d<T> implements c7.a<T> {
        public final WeakReference<a<T>> f15992a;
        public final l0.a<T> f15993b = new a();

        public class a extends l0.a<T> {
            public a() {
            }

            @Override
            public String m() {
                a<T> aVar = d.this.f15992a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f15988a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f15992a = new WeakReference<>(aVar);
        }

        @Override
        public void a(Runnable runnable, Executor executor) {
            this.f15993b.a(runnable, executor);
        }

        public boolean b(boolean z10) {
            return this.f15993b.cancel(z10);
        }

        public boolean c(T t10) {
            return this.f15993b.p(t10);
        }

        @Override
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f15992a.get();
            boolean cancel = this.f15993b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        public boolean d(Throwable th) {
            return this.f15993b.q(th);
        }

        @Override
        public T get() {
            return this.f15993b.get();
        }

        @Override
        public boolean isCancelled() {
            return this.f15993b.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.f15993b.isDone();
        }

        public String toString() {
            return this.f15993b.toString();
        }

        @Override
        public T get(long j10, TimeUnit timeUnit) {
            return this.f15993b.get(j10, timeUnit);
        }
    }

    public static <T> c7.a<T> a(AbstractC0147c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f15989b = dVar;
        aVar.f15988a = cVar.getClass();
        try {
            Object a10 = cVar.a(aVar);
            if (a10 != null) {
                aVar.f15988a = a10;
            }
        } catch (Exception e10) {
            dVar.d(e10);
        }
        return dVar;
    }
}
