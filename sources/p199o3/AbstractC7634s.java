package p199o3;

import android.os.Handler;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6600g1;
import p199o3.AbstractC7634s;
import p216p3.C8024e;
import p216p3.C8028h;

public interface AbstractC7634s {

    public static final class C7635a {
        public final Handler f24457a;
        public final AbstractC7634s f24458b;

        public C7635a(Handler handler, AbstractC7634s sVar) {
            this.f24457a = sVar != null ? (Handler) C1186a.m38185e(handler) : null;
            this.f24458b = sVar;
        }

        public void m15414A(int i, long j, long j2) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15416h0(i, j, j2);
        }

        public void m15393r(Exception exc) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15420Y(exc);
        }

        public void m15392s(Exception exc) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15418f(exc);
        }

        public void m15391t(String str, long j, long j2) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15425A(str, j, j2);
        }

        public void m15390u(String str) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15415z(str);
        }

        public void m15389v(C8024e eVar) {
            eVar.m13781c();
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15424B(eVar);
        }

        public void m15388w(C8024e eVar) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15417g0(eVar);
        }

        public void m15387x(C6600g1 g1Var, C8028h hVar) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15422S(g1Var);
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15423E(g1Var, hVar);
        }

        public void m15386y(long j) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15421W(j);
        }

        public void m15385z(boolean z) {
            ((AbstractC7634s) C1216l0.m37968j(this.f24458b)).mo15419a(z);
        }

        public void m15413B(final long j) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15386y(j);
                    }
                });
            }
        }

        public void m15412C(final boolean z) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15385z(z);
                    }
                });
            }
        }

        public void m15411D(final int i, final long j, final long j2) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15414A(i, j, j2);
                    }
                });
            }
        }

        public void m15400k(final Exception exc) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15393r(exc);
                    }
                });
            }
        }

        public void m15399l(final Exception exc) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15392s(exc);
                    }
                });
            }
        }

        public void m15398m(final String str, final long j, final long j2) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15391t(str, j, j2);
                    }
                });
            }
        }

        public void m15397n(final String str) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15390u(str);
                    }
                });
            }
        }

        public void m15396o(final C8024e eVar) {
            eVar.m13781c();
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15389v(eVar);
                    }
                });
            }
        }

        public void m15395p(final C8024e eVar) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15388w(eVar);
                    }
                });
            }
        }

        public void m15394q(final C6600g1 g1Var, final C8028h hVar) {
            Handler handler = this.f24457a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7634s.C7635a.this.m15387x(g1Var, hVar);
                    }
                });
            }
        }
    }

    void mo15425A(String str, long j, long j2);

    void mo15424B(C8024e eVar);

    void mo15423E(C6600g1 g1Var, C8028h hVar);

    @Deprecated
    void mo15422S(C6600g1 g1Var);

    void mo15421W(long j);

    void mo15420Y(Exception exc);

    void mo15419a(boolean z);

    void mo15418f(Exception exc);

    void mo15417g0(C8024e eVar);

    void mo15416h0(int i, long j, long j2);

    void mo15415z(String str);
}
