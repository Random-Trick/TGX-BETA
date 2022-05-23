package y;

import androidx.lifecycle.n;
import androidx.lifecycle.o;
import b1.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import y.m1;
import y.r1;

public final class m1<T> implements r1<T> {
    public final n<b<T>> f26359a = new n<>();
    public final Map<r1.a<? super T>, a<T>> f26360b = new HashMap();

    public static final class a<T> implements o<b<T>> {
        public final AtomicBoolean f26361a = new AtomicBoolean(true);
        public final r1.a<? super T> f26362b;
        public final Executor f26363c;

        public a(Executor executor, r1.a<? super T> aVar) {
            this.f26363c = executor;
            this.f26362b = aVar;
        }

        public void d(b bVar) {
            if (this.f26361a.get()) {
                if (bVar.a()) {
                    this.f26362b.a((Object) bVar.d());
                    return;
                }
                h.e(bVar.c());
                this.f26362b.b(bVar.c());
            }
        }

        public void c() {
            this.f26361a.set(false);
        }

        public void a(final b<T> bVar) {
            this.f26363c.execute(new Runnable() {
                @Override
                public final void run() {
                    m1.a.this.d(bVar);
                }
            });
        }
    }

    public static final class b<T> {
        public final T f26364a;
        public final Throwable f26365b;

        public b(T t10, Throwable th) {
            this.f26364a = t10;
            this.f26365b = th;
        }

        public static <T> b<T> b(T t10) {
            return new b<>(t10, null);
        }

        public boolean a() {
            return this.f26365b == null;
        }

        public Throwable c() {
            return this.f26365b;
        }

        public T d() {
            if (a()) {
                return this.f26364a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f26364a;
            } else {
                str = "Error: " + this.f26365b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    public void e(a aVar, a aVar2) {
        if (aVar != null) {
            this.f26359a.l(aVar);
        }
        this.f26359a.h(aVar2);
    }

    public void f(a aVar) {
        this.f26359a.l(aVar);
    }

    @Override
    public void a(Executor executor, r1.a<? super T> aVar) {
        synchronized (this.f26360b) {
            final a<T> aVar2 = this.f26360b.get(aVar);
            if (aVar2 != null) {
                aVar2.c();
            }
            final a<T> aVar3 = new a<>(executor, aVar);
            this.f26360b.put(aVar, aVar3);
            a0.a.d().execute(new Runnable() {
                @Override
                public final void run() {
                    m1.this.e(aVar2, aVar3);
                }
            });
        }
    }

    @Override
    public void b(r1.a<? super T> aVar) {
        synchronized (this.f26360b) {
            final a<T> remove = this.f26360b.remove(aVar);
            if (remove != null) {
                remove.c();
                a0.a.d().execute(new Runnable() {
                    @Override
                    public final void run() {
                        m1.this.f(remove);
                    }
                });
            }
        }
    }

    public void g(T t10) {
        this.f26359a.k(b.b(t10));
    }
}
