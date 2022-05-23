package o3;

import android.os.Handler;
import c5.l0;
import m3.q1;
import o3.s;
import p3.e;
import p3.h;

public interface s {

    public static final class a {
        public final Handler f18892a;
        public final s f18893b;

        public a(Handler handler, s sVar) {
            this.f18892a = sVar != null ? (Handler) c5.a.e(handler) : null;
            this.f18893b = sVar;
        }

        public void A(int i10, long j10, long j11) {
            ((s) l0.j(this.f18893b)).w(i10, j10, j11);
        }

        public void r(Exception exc) {
            ((s) l0.j(this.f18893b)).t(exc);
        }

        public void s(Exception exc) {
            ((s) l0.j(this.f18893b)).c(exc);
        }

        public void t(String str, long j10, long j11) {
            ((s) l0.j(this.f18893b)).i(str, j10, j11);
        }

        public void u(String str) {
            ((s) l0.j(this.f18893b)).h(str);
        }

        public void v(e eVar) {
            eVar.c();
            ((s) l0.j(this.f18893b)).j(eVar);
        }

        public void w(e eVar) {
            ((s) l0.j(this.f18893b)).v(eVar);
        }

        public void x(q1 q1Var, h hVar) {
            ((s) l0.j(this.f18893b)).D(q1Var);
            ((s) l0.j(this.f18893b)).k(q1Var, hVar);
        }

        public void y(long j10) {
            ((s) l0.j(this.f18893b)).s(j10);
        }

        public void z(boolean z10) {
            ((s) l0.j(this.f18893b)).b(z10);
        }

        public void B(final long j10) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.y(j10);
                    }
                });
            }
        }

        public void C(final boolean z10) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.z(z10);
                    }
                });
            }
        }

        public void D(final int i10, final long j10, final long j11) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.A(i10, j10, j11);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.t(str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.u(str);
                    }
                });
            }
        }

        public void o(final e eVar) {
            eVar.c();
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.v(eVar);
                    }
                });
            }
        }

        public void p(final e eVar) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.w(eVar);
                    }
                });
            }
        }

        public void q(final q1 q1Var, final h hVar) {
            Handler handler = this.f18892a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        s.a.this.x(q1Var, hVar);
                    }
                });
            }
        }
    }

    @Deprecated
    void D(q1 q1Var);

    void b(boolean z10);

    void c(Exception exc);

    void h(String str);

    void i(String str, long j10, long j11);

    void j(e eVar);

    void k(q1 q1Var, h hVar);

    void s(long j10);

    void t(Exception exc);

    void v(e eVar);

    void w(int i10, long j10, long j11);
}
