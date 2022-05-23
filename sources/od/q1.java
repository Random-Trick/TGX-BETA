package od;

import ae.j;
import ae.p;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.c0;
import ce.o;
import ce.p0;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import ib.h;
import ib.i;
import kb.c;
import ld.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.f4;
import od.p1;
import org.thunderdog.challegram.R;

public class q1 extends FrameLayoutFix implements k.b, c {
    public final TextView M;
    public final TextView N;
    public final p1 O;
    public final m1 P;
    public f4 Q;
    public boolean R;
    public f S = new f(0, this, b.f7287b, 180);
    public long T;
    public long U;

    public q1(Context context) {
        super(context);
        setWillNotDraw(false);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, a0.i(56.0f), 80);
        p1 p1Var = new p1(context);
        this.O = p1Var;
        p1Var.setAnchorMode(0);
        p1Var.setForceBackgroundColorId(R.id.theme_color_videoSliderInactive);
        p1Var.setForceSecondaryColorId(R.id.theme_color_videoSliderInactive);
        p1Var.h(true, false);
        p1Var.g(R.id.theme_color_videoSliderActive, false);
        p1Var.setPadding(a0.i(56.0f), 0, a0.i(56.0f), 0);
        p1Var.setLayoutParams(r12);
        addView(p1Var);
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(a0.i(56.0f), a0.i(56.0f), 83);
        b2 b2Var = new b2(context);
        this.M = b2Var;
        E1(b2Var);
        b2Var.setLayoutParams(r13);
        addView(b2Var);
        FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(a0.i(56.0f), a0.i(56.0f), 85);
        b2 b2Var2 = new b2(context);
        this.N = b2Var2;
        E1(b2Var2);
        b2Var2.setLayoutParams(r14);
        addView(b2Var2);
        m1 m1Var = new m1(context);
        this.P = m1Var;
        m1Var.setTranslationX(-a0.i(44.0f));
        m1Var.setLayoutParams(FrameLayoutFix.r1(a0.i(44.0f), a0.i(56.0f), 83));
        addView(m1Var);
    }

    public static void E1(TextView textView) {
        textView.setTextColor(-1);
        textView.setPadding(a0.i(2.0f), 0, a0.i(2.0f), 0);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setTypeface(o.k());
        textView.setTextSize(1, 12.0f);
        textView.setText(c0.h(0L));
    }

    private void setNowMs(long j10) {
        if (this.U != j10) {
            this.U = j10;
            this.M.setText(c0.h(Math.round(j10 / 1000.0d)));
        }
    }

    private void setTimelineVisible(boolean z10) {
        f4 f4Var;
        if (this.R != z10 && (f4Var = this.Q) != null) {
            this.R = z10;
            int i10 = 0;
            f4Var.setVisibility(z10 ? 0 : 8);
            p1 p1Var = this.O;
            if (z10) {
                i10 = 8;
            }
            p1Var.setVisibility(i10);
        }
    }

    private void setTotalMs(long j10) {
        if (this.T != j10) {
            this.T = j10;
            this.N.setText(c0.h(Math.round(j10 / 1000.0d)));
        }
    }

    public void A1(long j10, long j11, boolean z10, boolean z11) {
        boolean z12 = z10 && j10 > 0;
        this.O.h(z12, z11);
        f4 f4Var = this.Q;
        if (f4Var != null) {
            f4Var.A(z12, z11);
            this.Q.setSliderProgress(j10 > 0 ? (float) (j11 / j10) : 0.0f);
            this.Q.invalidate();
        }
        C1(j11, z11);
        setTotalMs(j10);
    }

    public void B1(boolean z10, boolean z11) {
        this.P.a(z10, z11 && this.S.g() > 0.0f);
    }

    public void C1(long j10, boolean z10) {
        setNowMs(j10);
        I1(z10);
    }

    public void D1(boolean z10, boolean z11) {
        if (this.Q == null) {
            this.S.p(z10 || this.R, z11);
        }
    }

    public void G1(float f10) {
        float d10 = h.d(f10);
        p1 p1Var = this.O;
        if (p1Var != null) {
            p1Var.setSecondaryValue(d10);
        }
    }

    public void H1(long j10, long j11, float f10) {
        setNowMs(j10);
        setTotalMs(j11);
        float d10 = h.d(f10);
        p1 p1Var = this.O;
        if (p1Var != null) {
            p1Var.setValue(d10);
        }
        f4 f4Var = this.Q;
        if (f4Var != null) {
            f4Var.setSliderProgress(d10);
        }
    }

    public final void I1(boolean z10) {
        long j10 = this.T;
        float d10 = h.d(j10 > 0 ? (float) (this.U / j10) : 0.0f);
        this.O.setValue(d10);
        f4 f4Var = this.Q;
        if (f4Var != null) {
            f4Var.setSliderProgress(d10);
        }
    }

    @Override
    public void Q2() {
        setFile(null);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        int i11 = (int) (a0.i(32.0f) * f10);
        this.M.setTranslationX(i11);
        this.O.setAddPaddingLeft(i11);
        this.P.setTranslationX((-a0.i(44.0f)) * (1.0f - f10));
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, getMeasuredHeight() - a0.i(56.0f), getMeasuredWidth(), getMeasuredHeight(), y.g(j.L(R.id.theme_color_transparentEditor)));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !p0.J(this, motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public void setFile(l lVar) {
        double d10;
        double d11;
        double d12;
        float f10;
        float f11;
        if (this.Q != null) {
            String q10 = lVar != null ? lVar.q() : null;
            boolean z10 = !i.i(q10);
            if (lVar == null || !lVar.a1()) {
                d11 = -1.0d;
                d10 = 0.0d;
                f11 = 0.0f;
                d12 = -1.0d;
                f10 = 1.0f;
            } else {
                long Q0 = lVar.Q0();
                double P0 = lVar.P0();
                double d13 = Q0;
                f11 = (float) (P0 / d13);
                double J0 = lVar.J0();
                f10 = (float) (J0 / d13);
                d12 = P0 / 1000000.0d;
                d11 = J0 / 1000000.0d;
                d10 = d13 / 1000000.0d;
            }
            this.Q.F(q10, f11, f10, d12, d11, d10, this.R && z10);
            this.Q.setSliderProgress(0.0f);
            setTimelineVisible(z10);
        }
    }

    public void setInnerAlpha(float f10) {
        this.O.setAlpha(f10);
        f4 f4Var = this.Q;
        if (f4Var != null) {
            f4Var.setAlpha(f10);
        }
        this.M.setAlpha(f10);
        this.N.setAlpha(f10);
    }

    public void setOnPlayPauseClick(View.OnClickListener onClickListener) {
        this.P.setOnClickListener(onClickListener);
    }

    public void setSlideEnabled(boolean z10) {
        boolean z11 = z10 && this.T > 0;
        this.O.h(z11, true);
        f4 f4Var = this.Q;
        if (f4Var != null) {
            f4Var.A(z11, true);
        }
    }

    public void setSliderListener(p1.a aVar) {
        this.O.setListener(aVar);
    }

    public void z1(f4.c cVar, p pVar) {
        D1(true, false);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, a0.i(56.0f), 80);
        f4 f4Var = new f4(getContext());
        this.Q = f4Var;
        f4Var.D(true, false);
        this.Q.B(R.id.theme_color_white, R.id.theme_color_black, R.id.theme_color_transparentEditor);
        this.Q.setPadding(a0.i(54.0f) + a0.i(32.0f), a0.i(6.0f), a0.i(54.0f), a0.i(6.0f));
        this.Q.setLayoutParams(r12);
        this.Q.setDelegate(cVar);
        this.Q.setForcedTheme(pVar);
        addView(this.Q, 0);
        this.Q.setVisibility(8);
    }
}
