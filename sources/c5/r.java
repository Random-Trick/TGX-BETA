package c5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c5.l;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class r<T> {
    public final d f4880a;
    public final n f4881b;
    public final b<T> f4882c;
    public final CopyOnWriteArraySet<c<T>> f4883d;
    public final ArrayDeque<Runnable> f4884e;
    public final ArrayDeque<Runnable> f4885f;
    public boolean f4886g;

    public interface a<T> {
        void a(T t10);
    }

    public interface b<T> {
        void a(T t10, l lVar);
    }

    public static final class c<T> {
        public final T f4887a;
        public l.b f4888b = new l.b();
        public boolean f4889c;
        public boolean f4890d;

        public c(T t10) {
            this.f4887a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (!this.f4890d) {
                if (i10 != -1) {
                    this.f4888b.a(i10);
                }
                this.f4889c = true;
                aVar.a(this.f4887a);
            }
        }

        public void b(b<T> bVar) {
            if (!this.f4890d && this.f4889c) {
                l e10 = this.f4888b.e();
                this.f4888b = new l.b();
                this.f4889c = false;
                bVar.a(this.f4887a, e10);
            }
        }

        public void c(b<T> bVar) {
            this.f4890d = true;
            if (this.f4889c) {
                bVar.a(this.f4887a, this.f4888b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f4887a.equals(((c) obj).f4887a);
        }

        public int hashCode() {
            return this.f4887a.hashCode();
        }
    }

    public r(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    public static void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        if (!this.f4886g) {
            c5.a.e(t10);
            this.f4883d.add(new c<>(t10));
        }
    }

    public r<T> d(Looper looper, d dVar, b<T> bVar) {
        return new r<>(this.f4883d, looper, dVar, bVar);
    }

    public r<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f4880a, bVar);
    }

    public void f() {
        if (!this.f4885f.isEmpty()) {
            if (!this.f4881b.e(0)) {
                n nVar = this.f4881b;
                nVar.b(nVar.d(0));
            }
            boolean z10 = !this.f4884e.isEmpty();
            this.f4884e.addAll(this.f4885f);
            this.f4885f.clear();
            if (!z10) {
                while (!this.f4884e.isEmpty()) {
                    this.f4884e.peekFirst().run();
                    this.f4884e.removeFirst();
                }
            }
        }
    }

    public final boolean g(Message message) {
        Iterator<c<T>> it = this.f4883d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f4882c);
            if (this.f4881b.e(0)) {
                return true;
            }
        }
        return true;
    }

    public void i(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f4883d);
        this.f4885f.add(new Runnable() {
            @Override
            public final void run() {
                r.h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        Iterator<c<T>> it = this.f4883d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f4882c);
        }
        this.f4883d.clear();
        this.f4886g = true;
    }

    public void k(T t10) {
        Iterator<c<T>> it = this.f4883d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f4887a.equals(t10)) {
                next.c(this.f4882c);
                this.f4883d.remove(next);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }

    public r(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f4880a = dVar;
        this.f4883d = copyOnWriteArraySet;
        this.f4882c = bVar;
        this.f4884e = new ArrayDeque<>();
        this.f4885f = new ArrayDeque<>();
        this.f4881b = dVar.b(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                boolean g10;
                g10 = r.this.g(message);
                return g10;
            }
        });
    }
}
