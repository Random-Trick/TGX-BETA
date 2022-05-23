package q3;

import android.os.Handler;
import c5.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o4.s;
import q3.w;

public interface w {

    public static class a {
        public final int f21367a;
        public final s.b f21368b;
        public final CopyOnWriteArrayList<C0194a> f21369c;

        public static final class C0194a {
            public Handler f21370a;
            public w f21371b;

            public C0194a(Handler handler, w wVar) {
                this.f21370a = handler;
                this.f21371b = wVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void n(w wVar) {
            wVar.E(this.f21367a, this.f21368b);
        }

        public void o(w wVar) {
            wVar.C(this.f21367a, this.f21368b);
        }

        public void p(w wVar) {
            wVar.g0(this.f21367a, this.f21368b);
        }

        public void q(w wVar, int i10) {
            wVar.l0(this.f21367a, this.f21368b);
            wVar.F(this.f21367a, this.f21368b, i10);
        }

        public void r(w wVar, Exception exc) {
            wVar.J(this.f21367a, this.f21368b, exc);
        }

        public void s(w wVar) {
            wVar.k0(this.f21367a, this.f21368b);
        }

        public void g(Handler handler, w wVar) {
            c5.a.e(handler);
            c5.a.e(wVar);
            this.f21369c.add(new C0194a(handler, wVar));
        }

        public void h() {
            Iterator<C0194a> it = this.f21369c.iterator();
            while (it.hasNext()) {
                C0194a next = it.next();
                final w wVar = next.f21371b;
                l0.x0(next.f21370a, new Runnable() {
                    @Override
                    public final void run() {
                        w.a.this.n(wVar);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0194a> it = this.f21369c.iterator();
            while (it.hasNext()) {
                C0194a next = it.next();
                final w wVar = next.f21371b;
                l0.x0(next.f21370a, new Runnable() {
                    @Override
                    public final void run() {
                        w.a.this.o(wVar);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0194a> it = this.f21369c.iterator();
            while (it.hasNext()) {
                C0194a next = it.next();
                final w wVar = next.f21371b;
                l0.x0(next.f21370a, new Runnable() {
                    @Override
                    public final void run() {
                        w.a.this.p(wVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator<C0194a> it = this.f21369c.iterator();
            while (it.hasNext()) {
                C0194a next = it.next();
                final w wVar = next.f21371b;
                l0.x0(next.f21370a, new Runnable() {
                    @Override
                    public final void run() {
                        w.a.this.q(wVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0194a> it = this.f21369c.iterator();
            while (it.hasNext()) {
                C0194a next = it.next();
                final w wVar = next.f21371b;
                l0.x0(next.f21370a, new Runnable() {
                    @Override
                    public final void run() {
                        w.a.this.r(wVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0194a> it = this.f21369c.iterator();
            while (it.hasNext()) {
                C0194a next = it.next();
                final w wVar = next.f21371b;
                l0.x0(next.f21370a, new Runnable() {
                    @Override
                    public final void run() {
                        w.a.this.s(wVar);
                    }
                });
            }
        }

        public void t(w wVar) {
            Iterator<C0194a> it = this.f21369c.iterator();
            while (it.hasNext()) {
                C0194a next = it.next();
                if (next.f21371b == wVar) {
                    this.f21369c.remove(next);
                }
            }
        }

        public a u(int i10, s.b bVar) {
            return new a(this.f21369c, i10, bVar);
        }

        public a(CopyOnWriteArrayList<C0194a> copyOnWriteArrayList, int i10, s.b bVar) {
            this.f21369c = copyOnWriteArrayList;
            this.f21367a = i10;
            this.f21368b = bVar;
        }
    }

    void C(int i10, s.b bVar);

    void E(int i10, s.b bVar);

    void F(int i10, s.b bVar, int i11);

    void J(int i10, s.b bVar, Exception exc);

    void g0(int i10, s.b bVar);

    void k0(int i10, s.b bVar);

    @Deprecated
    void l0(int i10, s.b bVar);
}
