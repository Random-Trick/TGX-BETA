package p020b5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p020b5.C1213l;

public final class C1226r<T> {
    public final AbstractC1192d f4550a;
    public final AbstractC1221n f4551b;
    public final AbstractC1228b<T> f4552c;
    public final CopyOnWriteArraySet<C1229c<T>> f4553d;
    public final ArrayDeque<Runnable> f4554e;
    public final ArrayDeque<Runnable> f4555f;
    public boolean f4556g;

    public interface AbstractC1227a<T> {
        void mo17513a(T t);
    }

    public interface AbstractC1228b<T> {
        void mo17512a(T t, C1213l lVar);
    }

    public static final class C1229c<T> {
        public final T f4557a;
        public C1213l.C1215b f4558b = new C1213l.C1215b();
        public boolean f4559c;
        public boolean f4560d;

        public C1229c(T t) {
            this.f4557a = t;
        }

        public void m37892a(int i, AbstractC1227a<T> aVar) {
            if (!this.f4560d) {
                if (i != -1) {
                    this.f4558b.m38026a(i);
                }
                this.f4559c = true;
                aVar.mo17513a(this.f4557a);
            }
        }

        public void m37891b(AbstractC1228b<T> bVar) {
            if (!this.f4560d && this.f4559c) {
                C1213l e = this.f4558b.m38022e();
                this.f4558b = new C1213l.C1215b();
                this.f4559c = false;
                bVar.mo17512a(this.f4557a, e);
            }
        }

        public void m37890c(AbstractC1228b<T> bVar) {
            this.f4560d = true;
            if (this.f4559c) {
                bVar.mo17512a(this.f4557a, this.f4558b.m38022e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1229c.class != obj.getClass()) {
                return false;
            }
            return this.f4557a.equals(((C1229c) obj).f4557a);
        }

        public int hashCode() {
            return this.f4557a.hashCode();
        }
    }

    public C1226r(Looper looper, AbstractC1192d dVar, AbstractC1228b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    public static void m37897g(CopyOnWriteArraySet copyOnWriteArraySet, int i, AbstractC1227a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C1229c) it.next()).m37892a(i, aVar);
        }
    }

    public void m37901c(T t) {
        if (!this.f4556g) {
            C1186a.m38185e(t);
            this.f4553d.add(new C1229c<>(t));
        }
    }

    public C1226r<T> m37900d(Looper looper, AbstractC1228b<T> bVar) {
        return new C1226r<>(this.f4553d, looper, this.f4550a, bVar);
    }

    public void m37899e() {
        if (!this.f4555f.isEmpty()) {
            if (!this.f4551b.mo37913e(0)) {
                AbstractC1221n nVar = this.f4551b;
                nVar.mo37916b(nVar.mo37914d(0));
            }
            boolean z = !this.f4554e.isEmpty();
            this.f4554e.addAll(this.f4555f);
            this.f4555f.clear();
            if (!z) {
                while (!this.f4554e.isEmpty()) {
                    this.f4554e.peekFirst().run();
                    this.f4554e.removeFirst();
                }
            }
        }
    }

    public final boolean m37898f(Message message) {
        Iterator<C1229c<T>> it = this.f4553d.iterator();
        while (it.hasNext()) {
            it.next().m37891b(this.f4552c);
            if (this.f4551b.mo37913e(0)) {
                return true;
            }
        }
        return true;
    }

    public void m37896h(final int i, final AbstractC1227a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f4553d);
        this.f4555f.add(new Runnable() {
            @Override
            public final void run() {
                C1226r.m37897g(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    public void m37895i() {
        Iterator<C1229c<T>> it = this.f4553d.iterator();
        while (it.hasNext()) {
            it.next().m37890c(this.f4552c);
        }
        this.f4553d.clear();
        this.f4556g = true;
    }

    public void m37894j(T t) {
        Iterator<C1229c<T>> it = this.f4553d.iterator();
        while (it.hasNext()) {
            C1229c<T> next = it.next();
            if (next.f4557a.equals(t)) {
                next.m37890c(this.f4552c);
                this.f4553d.remove(next);
            }
        }
    }

    public void m37893k(int i, AbstractC1227a<T> aVar) {
        m37896h(i, aVar);
        m37899e();
    }

    public C1226r(CopyOnWriteArraySet<C1229c<T>> copyOnWriteArraySet, Looper looper, AbstractC1192d dVar, AbstractC1228b<T> bVar) {
        this.f4550a = dVar;
        this.f4553d = copyOnWriteArraySet;
        this.f4552c = bVar;
        this.f4554e = new ArrayDeque<>();
        this.f4555f = new ArrayDeque<>();
        this.f4551b = dVar.mo38083b(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                boolean f;
                f = C1226r.this.m37898f(message);
                return f;
            }
        });
    }
}
