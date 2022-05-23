package m2;

import android.content.Context;
import f2.j;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class d<T> {
    public static final String f16462f = j.f("ConstraintTracker");
    public final r2.a f16463a;
    public final Context f16464b;
    public final Object f16465c = new Object();
    public final Set<k2.a<T>> f16466d = new LinkedHashSet();
    public T f16467e;

    public class a implements Runnable {
        public final List f16468a;

        public a(List list) {
            this.f16468a = list;
        }

        @Override
        public void run() {
            for (k2.a aVar : this.f16468a) {
                aVar.a(d.this.f16467e);
            }
        }
    }

    public d(Context context, r2.a aVar) {
        this.f16464b = context.getApplicationContext();
        this.f16463a = aVar;
    }

    public void a(k2.a<T> aVar) {
        synchronized (this.f16465c) {
            if (this.f16466d.add(aVar)) {
                if (this.f16466d.size() == 1) {
                    this.f16467e = b();
                    j.c().a(f16462f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f16467e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f16467e);
            }
        }
    }

    public abstract T b();

    public void c(k2.a<T> aVar) {
        synchronized (this.f16465c) {
            if (this.f16466d.remove(aVar) && this.f16466d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t10) {
        synchronized (this.f16465c) {
            T t11 = this.f16467e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f16467e = t10;
                this.f16463a.a().execute(new a(new ArrayList(this.f16466d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
