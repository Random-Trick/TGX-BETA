package p032c5;

import android.os.Handler;
import android.os.SystemClock;
import p020b5.C1186a;
import p020b5.C1216l0;
import p032c5.AbstractC1642z;
import p174m3.C6600g1;
import p216p3.C8024e;
import p216p3.C8028h;

public interface AbstractC1642z {

    public static final class C1643a {
        public final Handler f6061a;
        public final AbstractC1642z f6062b;

        public C1643a(Handler handler, AbstractC1642z zVar) {
            this.f6061a = zVar != null ? (Handler) C1186a.m38185e(handler) : null;
            this.f6062b = zVar;
        }

        public void m36131q(String str, long j, long j2) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17637n(str, j, j2);
        }

        public void m36130r(String str) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17640m(str);
        }

        public void m36129s(C8024e eVar) {
            eVar.m13781c();
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17715H(eVar);
        }

        public void m36128t(int i, long j) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17711I(i, j);
        }

        public void m36127u(C8024e eVar) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17648j(eVar);
        }

        public void m36126v(C6600g1 g1Var, C8028h hVar) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17624r(g1Var);
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17707J(g1Var, hVar);
        }

        public void m36125w(Object obj, long j) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17688Q(obj, j);
        }

        public void m36124x(long j, int i) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17645k0(j, i);
        }

        public void m36123y(Exception exc) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo17669Z(exc);
        }

        public void m36122z(C1607b0 b0Var) {
            ((AbstractC1642z) C1216l0.m37968j(this.f6062b)).mo19329b(b0Var);
        }

        public void m36151A(final Object obj) {
            if (this.f6061a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f6061a.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36125w(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void m36150B(final long j, final int i) {
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36124x(j, i);
                    }
                });
            }
        }

        public void m36149C(final Exception exc) {
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36123y(exc);
                    }
                });
            }
        }

        public void m36148D(final C1607b0 b0Var) {
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36122z(b0Var);
                    }
                });
            }
        }

        public void m36137k(final String str, final long j, final long j2) {
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36131q(str, j, j2);
                    }
                });
            }
        }

        public void m36136l(final String str) {
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36130r(str);
                    }
                });
            }
        }

        public void m36135m(final C8024e eVar) {
            eVar.m13781c();
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36129s(eVar);
                    }
                });
            }
        }

        public void m36134n(final int i, final long j) {
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36128t(i, j);
                    }
                });
            }
        }

        public void m36133o(final C8024e eVar) {
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36127u(eVar);
                    }
                });
            }
        }

        public void m36132p(final C6600g1 g1Var, final C8028h hVar) {
            Handler handler = this.f6061a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC1642z.C1643a.this.m36126v(g1Var, hVar);
                    }
                });
            }
        }
    }

    void mo17715H(C8024e eVar);

    void mo17711I(int i, long j);

    void mo17707J(C6600g1 g1Var, C8028h hVar);

    void mo17688Q(Object obj, long j);

    void mo17669Z(Exception exc);

    void mo19329b(C1607b0 b0Var);

    void mo17648j(C8024e eVar);

    void mo17645k0(long j, int i);

    void mo17640m(String str);

    void mo17637n(String str, long j, long j2);

    @Deprecated
    void mo17624r(C6600g1 g1Var);
}
