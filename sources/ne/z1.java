package ne;

import ae.j;
import ae.v;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import db.b;
import eb.k;
import gd.w;
import kb.c;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.j2;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import yd.g;
import zd.hj;
import zd.o6;
import zd.u0;
import zd.ya;

public class z1 extends FrameLayoutFix implements c, a0.a, u0, k.b, j2.j, Runnable, a.h {
    public n2 M;
    public TextView N;
    public LinearLayout O;
    public boolean Q;
    public boolean R;
    public k U;
    public boolean V;
    public boolean W;
    public int P = -1;
    public float S = -1.0f;
    public float T = -1.0f;

    public z1(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.q1(-1, a0.o()));
        a0.a(this);
        int L = j.L(fd.a.f11881c);
        n2 n2Var = new n2(context);
        this.M = n2Var;
        float f10 = 1.0f;
        n2Var.j(1.0f);
        this.M.setProgressColor(L);
        this.M.setLayoutParams(new LinearLayout.LayoutParams(a0.i(24.0f), -1));
        b2 b2Var = new b2(context);
        this.N = b2Var;
        b2Var.setLayoutParams(FrameLayoutFix.q1(-2, -1));
        this.N.setGravity(16);
        this.N.setTextSize(1, 13.0f);
        this.N.setTextColor(L);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(0);
        if (w.G2()) {
            this.O.addView(this.N);
            this.O.addView(this.M);
        } else {
            this.O.addView(this.M);
            this.O.addView(this.N);
        }
        this.O.setLayoutParams(FrameLayoutFix.r1(-2, -1, 1));
        addView(this.O);
        g.j(this, R.id.theme_color_statusBar);
        ya.o1().b1().c(this);
        setNetworkState(ya.o1().j0().D4());
        setFactor(!this.R ? 0.0f : f10);
        j0.r(getContext()).Q(this);
    }

    private float getVisibilityFactor() {
        if (this.Q) {
            return 1.0f;
        }
        return this.S;
    }

    private void setColorFactor(float f10) {
        if (this.T != f10) {
            this.T = f10;
            invalidate();
        }
    }

    private void setFactor(float f10) {
        if (this.S != f10) {
            this.S = f10;
            this.O.setAlpha(f10);
            this.O.setTranslationY((-a0.o()) + ((int) (a0.o() * getVisibilityFactor())));
            B1();
        }
    }

    private void setIsPaused(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            B1();
        }
    }

    private void setLowProfile(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            if (z10) {
                run();
                return;
            }
            removeCallbacks(this);
            a r10 = j0.r(getContext());
            if (!r10.A1()) {
                r10.v3(0, false);
            }
        }
    }

    private void setNetworkState(int i10) {
        if (this.P != i10) {
            this.P = i10;
            this.M.setVisibility((i10 == 0 || i10 == 4) ? 8 : 0);
            this.N.setText(w.i1(hj.T8(i10)));
            H1();
        }
    }

    public final void A1(float f10, boolean z10) {
        if (this.U == null) {
            this.U = new k(0, this, b.f7287b, 180L, this.S);
        }
        k kVar = this.U;
        float f11 = this.S;
        kVar.F(((f11 == 1.0f || f11 == 0.0f) && !z10) ? this.R ? 300L : 1200L : 0L);
        this.U.i(f10);
    }

    public final void B1() {
        setLowProfile(!this.W && (this.R || this.S != 0.0f));
    }

    public final void C1(float f10) {
        k kVar = this.U;
        if (kVar != null) {
            kVar.l(f10);
        }
        setFactor(f10);
    }

    public final void D1(boolean z10, boolean z11) {
        if (this.R != z10) {
            this.R = z10;
            float f10 = 1.0f;
            if (getParent() == null || getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
                if (!z10) {
                    f10 = 0.0f;
                }
                C1(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            A1(f10, z11);
        }
    }

    public void E1() {
        this.O.removeView(this.N);
        this.O.removeView(this.M);
        if (w.G2()) {
            this.O.addView(this.N);
            this.O.addView(this.M);
            return;
        }
        this.O.addView(this.M);
        this.O.addView(this.N);
    }

    @Override
    public boolean F1(float f10, float f11) {
        return true;
    }

    public void G1(int i10) {
        if (this.P != -1 && getVisibilityFactor() > 0.0f) {
            int T8 = hj.T8(this.P);
            if (i10 == 0 || i10 == T8) {
                this.N.setText(w.i1(T8));
            }
        }
    }

    public void H1() {
        boolean w12 = j0.r(getContext()).w1();
        boolean z10 = true;
        boolean z11 = this.P != 0 && !w12;
        if (!this.Q && !w12) {
            z10 = false;
        }
        this.Q = z10;
        D1(z11, z10);
    }

    @Override
    public void M4() {
        setIsPaused(true);
    }

    @Override
    public void Q0(int i10, boolean z10) {
    }

    @Override
    public void Q2() {
        ya.o1().b1().y(this);
        j0.r(getContext()).s2(this);
        removeCallbacks(this);
        a0.v(this);
    }

    @Override
    public void c3(o6 o6Var, int i10, boolean z10) {
        if (z10) {
            setNetworkState(i10);
            H1();
        }
    }

    @Override
    public void c6() {
        setIsPaused(true);
    }

    @Override
    public void k1(int i10) {
        Log.i("new height: %d", Integer.valueOf(i10));
        if (getLayoutParams() != null && getLayoutParams().height != i10) {
            getLayoutParams().height = i10;
            setLayoutParams(getLayoutParams());
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setFactor(f10);
        } else if (i10 == 1) {
            setColorFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0 && f10 == 1.0f) {
            this.Q = false;
        }
    }

    @Override
    public void o6() {
        setIsPaused(false);
    }

    @Override
    public void run() {
        if (this.V) {
            a r10 = j0.r(getContext());
            if (!r10.A1()) {
                r10.v3(1, false);
            }
            postDelayed(this, ((1.0f - this.S) * 1000.0f) + 2500);
        }
    }

    @Override
    public void v(boolean z10) {
    }

    @Override
    public void v6(int i10, int i11) {
    }

    public void z1(v vVar) {
        TextView textView = this.N;
        int i10 = fd.a.f11881c;
        vVar.c(textView, i10);
        vVar.c(this.M, i10);
    }
}
