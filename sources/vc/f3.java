package vc;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import de.rh;
import gd.w;
import hd.a5;
import hd.s4;
import hd.t4;
import vc.i;

public class f3 extends i.e {
    public i f24942d;
    public rh f24943e;

    public void O(s4 s4Var) {
        this.f24943e.cr(s4Var.h4(), true, true);
    }

    public void P(s4 s4Var) {
        this.f24943e.Aq(s4Var.I2(), s4Var.I1());
    }

    @Override
    public boolean B(RecyclerView.c0 c0Var, int i10) {
        final s4 message = j1.S(c0Var.f2982a).getMessage();
        boolean z10 = false;
        if (!message.R9()) {
            return false;
        }
        Runnable runnable = null;
        int i11 = 8;
        if (i10 == (w.G2() ? 8 : 4) && M()) {
            runnable = new Runnable() {
                @Override
                public final void run() {
                    f3.this.O(message);
                }
            };
        }
        if (w.G2()) {
            i11 = 4;
        }
        if (i10 == i11 && N()) {
            runnable = new Runnable() {
                @Override
                public final void run() {
                    f3.this.P(message);
                }
            };
            z10 = true;
        }
        message.B7(c0Var.f2982a, runnable, z10);
        return true;
    }

    @Override
    public void C(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f10, float f11, int i10, boolean z10) {
        if (i10 == 1 && j1.T(c0Var.n())) {
            s4 message = j1.S(c0Var.f2982a).getMessage();
            message.H9(f10, true);
            View view = c0Var.f2982a;
            if (view instanceof h1) {
                ((h1) view).setSwipeTranslation(message.R4());
            }
        }
    }

    @Override
    public boolean G(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
        return false;
    }

    @Override
    public void J(RecyclerView.c0 c0Var, int i10) {
        this.f24942d.Q(c0Var, i10);
        s4 message = j1.S(c0Var.f2982a).getMessage();
        if (message.R4() != 0.0f) {
            message.I0();
            View view = c0Var.f2982a;
            if (view instanceof h1) {
                ((h1) view).setSwipeTranslation(0.0f);
            }
            if (i10 == (w.G2() ? 8 : 4)) {
                if (M()) {
                    this.f24943e.cr(message.h4(), true, true);
                }
            } else if (N()) {
                this.f24943e.Aq(message.I2(), message.I1());
            }
        }
    }

    public boolean M() {
        return he.i.c2().B2() && this.f24943e.Li() && !this.f24943e.fo();
    }

    public boolean N() {
        return he.i.c2().C2() && !this.f24943e.gl();
    }

    public void Q(rh rhVar) {
        this.f24943e = rhVar;
    }

    public void R(i iVar) {
        this.f24942d = iVar;
    }

    @Override
    public int q(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        int i10;
        rh rhVar = this.f24943e;
        if (rhVar != null && !rhVar.Oa() && this.f24943e.bc() != null && j1.T(c0Var.n())) {
            s4 message = j1.S(c0Var.f2982a).getMessage();
            if (message.w0() && !(message instanceof a5) && !(message instanceof t4) && !message.n6() && message.I2() != 0) {
                int i11 = 8;
                if (!M() || !message.u0()) {
                    i10 = 0;
                } else {
                    i10 = (w.G2() ? 8 : 4) | 0;
                }
                if (N() && message.n0()) {
                    if (w.G2()) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                return i.e.A(0, i10);
            }
        }
        return 0;
    }

    @Override
    public float r(RecyclerView.c0 c0Var) {
        float measuredWidth = c0Var.f2982a.getMeasuredWidth();
        if (this.f24943e.nk().x3()) {
            return a0.i(42.0f) / measuredWidth;
        }
        return (a0.i(124.0f) / measuredWidth) * (he.i.c2().C2() ? 1 : 3);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean w() {
        return false;
    }
}
