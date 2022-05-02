package p291uc;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import gd.AbstractC4761s4;
import gd.C4583a5;
import gd.C4791t4;
import ge.C4868i;
import p038ce.View$OnClickListenerC2971rh;
import p082fd.C4403w;
import p291uc.C9570j;

public class C9547g3 extends C9570j.AbstractC9575e {
    public C9570j f30947d;
    public View$OnClickListenerC2971rh f30948e;

    public void m8368O(AbstractC4761s4 s4Var) {
        this.f30948e.m32445cr(s4Var.m25893k4(), true, true);
    }

    public void m8367P(AbstractC4761s4 s4Var) {
        this.f30948e.m32810Aq(s4Var.m26146K2(), s4Var.m26147K1());
    }

    @Override
    public boolean mo8171B(RecyclerView.AbstractC0886d0 d0Var, int i) {
        final AbstractC4761s4 message = C9586k1.m8093S(d0Var.f3479a).getMessage();
        boolean z = false;
        if (!message.m26069R9()) {
            return false;
        }
        Runnable runnable = null;
        int i2 = 8;
        if (i == (C4403w.m27986G2() ? 8 : 4) && m8370M()) {
            runnable = new Runnable() {
                @Override
                public final void run() {
                    C9547g3.this.m8368O(message);
                }
            };
        }
        if (C4403w.m27986G2()) {
            i2 = 4;
        }
        if (i == i2 && m8369N()) {
            runnable = new Runnable() {
                @Override
                public final void run() {
                    C9547g3.this.m8367P(message);
                }
            };
            z = true;
        }
        message.m26235B7(d0Var.f3479a, runnable, z);
        return true;
    }

    @Override
    public void mo8170C(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1 && C9586k1.m8092T(d0Var.m39335n())) {
            AbstractC4761s4 message = C9586k1.m8093S(d0Var.f3479a).getMessage();
            message.m26170H9(f, true);
            View view = d0Var.f3479a;
            if (view instanceof C9565i1) {
                ((C9565i1) view).setSwipeTranslation(message.m26063S4());
            }
        }
    }

    @Override
    public boolean mo8166G(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
        return false;
    }

    @Override
    public void mo8163J(RecyclerView.AbstractC0886d0 d0Var, int i) {
        this.f30947d.m8207R(d0Var, i);
        AbstractC4761s4 message = C9586k1.m8093S(d0Var.f3479a).getMessage();
        if (message.m26063S4() != 0.0f) {
            message.m26178H0();
            View view = d0Var.f3479a;
            if (view instanceof C9565i1) {
                ((C9565i1) view).setSwipeTranslation(0.0f);
            }
            if (i == (C4403w.m27986G2() ? 8 : 4)) {
                if (m8370M()) {
                    this.f30948e.m32445cr(message.m25893k4(), true, true);
                }
            } else if (m8369N()) {
                this.f30948e.m32810Aq(message.m26146K2(), message.m26147K1());
            }
        }
    }

    public boolean m8370M() {
        return C4868i.m24727c2().m24918B2() && this.f30948e.m32674Li() && !this.f30948e.m32409fo();
    }

    public boolean m8369N() {
        return C4868i.m24727c2().m24911C2() && !this.f30948e.m32399gl();
    }

    public void m8366Q(View$OnClickListenerC2971rh rhVar) {
        this.f30948e = rhVar;
    }

    public void m8365R(C9570j jVar) {
        this.f30947d = jVar;
    }

    @Override
    public int mo8146q(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
        int i;
        View$OnClickListenerC2971rh rhVar = this.f30948e;
        if (rhVar != null && !rhVar.m9374Oa() && this.f30948e.m9284bc() != null && C9586k1.m8092T(d0Var.m39335n())) {
            AbstractC4761s4 message = C9586k1.m8093S(d0Var.f3479a).getMessage();
            if (message.m25787v0() && !(message instanceof C4583a5) && !(message instanceof C4791t4) && !message.m25852o6() && message.m26146K2() != 0) {
                int i2 = 8;
                if (!m8370M() || !message.mo25807t0()) {
                    i = 0;
                } else {
                    i = (C4403w.m27986G2() ? 8 : 4) | 0;
                }
                if (m8369N() && message.m25888l0()) {
                    if (C4403w.m27986G2()) {
                        i2 = 4;
                    }
                    i |= i2;
                }
                return C9570j.AbstractC9575e.m8172A(0, i);
            }
        }
        return 0;
    }

    @Override
    public float mo8145r(RecyclerView.AbstractC0886d0 d0Var) {
        float measuredWidth = d0Var.f3479a.getMeasuredWidth();
        if (this.f30948e.m32308nk().m7615x3()) {
            return C1357a0.m37544i(42.0f) / measuredWidth;
        }
        return (C1357a0.m37544i(124.0f) / measuredWidth) * (C4868i.m24727c2().m24911C2() ? 1 : 3);
    }

    @Override
    public boolean mo8141v() {
        return false;
    }

    @Override
    public boolean mo8140w() {
        return false;
    }
}
