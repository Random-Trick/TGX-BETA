package d5;

import android.os.Handler;
import android.os.SystemClock;
import c5.l0;
import d5.z;
import m3.q1;
import p3.e;
import p3.h;

public interface z {

    public static final class a {
        public final Handler f6335a;
        public final z f6336b;

        public a(Handler handler, z zVar) {
            this.f6335a = zVar != null ? (Handler) c5.a.e(handler) : null;
            this.f6336b = zVar;
        }

        public void q(String str, long j10, long j11) {
            ((z) l0.j(this.f6336b)).f(str, j10, j11);
        }

        public void r(String str) {
            ((z) l0.j(this.f6336b)).e(str);
        }

        public void s(e eVar) {
            eVar.c();
            ((z) l0.j(this.f6336b)).l(eVar);
        }

        public void t(int i10, long j10) {
            ((z) l0.j(this.f6336b)).m(i10, j10);
        }

        public void u(e eVar) {
            ((z) l0.j(this.f6336b)).d(eVar);
        }

        public void v(q1 q1Var, h hVar) {
            ((z) l0.j(this.f6336b)).z(q1Var);
            ((z) l0.j(this.f6336b)).n(q1Var, hVar);
        }

        public void w(Object obj, long j10) {
            ((z) l0.j(this.f6336b)).p(obj, j10);
        }

        public void x(long j10, int i10) {
            ((z) l0.j(this.f6336b)).y(j10, i10);
        }

        public void y(Exception exc) {
            ((z) l0.j(this.f6336b)).u(exc);
        }

        public void z(b0 b0Var) {
            ((z) l0.j(this.f6336b)).x(b0Var);
        }

        public void A(final Object obj) {
            if (this.f6335a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f6335a.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.w(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.x(j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.y(exc);
                    }
                });
            }
        }

        public void D(final b0 b0Var) {
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.z(b0Var);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.q(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.r(str);
                    }
                });
            }
        }

        public void m(final e eVar) {
            eVar.c();
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.s(eVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.t(i10, j10);
                    }
                });
            }
        }

        public void o(final e eVar) {
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.u(eVar);
                    }
                });
            }
        }

        public void p(final q1 q1Var, final h hVar) {
            Handler handler = this.f6335a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        z.a.this.v(q1Var, hVar);
                    }
                });
            }
        }
    }

    void d(e eVar);

    void e(String str);

    void f(String str, long j10, long j11);

    void l(e eVar);

    void m(int i10, long j10);

    void n(q1 q1Var, h hVar);

    void p(Object obj, long j10);

    void u(Exception exc);

    void x(b0 b0Var);

    void y(long j10, int i10);

    @Deprecated
    void z(q1 q1Var);
}
