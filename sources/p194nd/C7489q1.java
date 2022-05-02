package p194nd;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1363c0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import me.C6847b2;
import me.C6890g4;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p108hb.C5069h;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6253l;
import p194nd.C7484p1;
import p364zd.AbstractC11531p;
import p364zd.C11524j;

public class C7489q1 extends FrameLayoutFix implements C3950k.AbstractC3952b, AbstractC5911c {
    public final TextView f23963M;
    public final TextView f23964N;
    public final C7484p1 f23965O;
    public final C7465m1 f23966P;
    public C6890g4 f23967Q;
    public boolean f23968R;
    public C3940f f23969S = new C3940f(0, this, C2057b.f7280b, 180);
    public long f23970T;
    public long f23971U;

    public C7489q1(Context context) {
        super(context);
        setWillNotDraw(false);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(56.0f), 80);
        C7484p1 p1Var = new C7484p1(context);
        this.f23965O = p1Var;
        p1Var.setAnchorMode(0);
        p1Var.setForceBackgroundColorId(R.id.theme_color_videoSliderInactive);
        p1Var.setForceSecondaryColorId(R.id.theme_color_videoSliderInactive);
        p1Var.m15841h(true, false);
        p1Var.m15842g(R.id.theme_color_videoSliderActive, false);
        p1Var.setPadding(C1357a0.m37541i(56.0f), 0, C1357a0.m37541i(56.0f), 0);
        p1Var.setLayoutParams(t1);
        addView(p1Var);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), C1357a0.m37541i(56.0f), 83);
        C6847b2 b2Var = new C6847b2(context);
        this.f23963M = b2Var;
        m15826I1(b2Var);
        b2Var.setLayoutParams(t12);
        addView(b2Var);
        FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), C1357a0.m37541i(56.0f), 85);
        C6847b2 b2Var2 = new C6847b2(context);
        this.f23964N = b2Var2;
        m15826I1(b2Var2);
        b2Var2.setLayoutParams(t13);
        addView(b2Var2);
        C7465m1 m1Var = new C7465m1(context);
        this.f23966P = m1Var;
        m1Var.setTranslationX(-C1357a0.m37541i(44.0f));
        m1Var.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(44.0f), C1357a0.m37541i(56.0f), 83));
        addView(m1Var);
    }

    public static void m15826I1(TextView textView) {
        textView.setTextColor(-1);
        textView.setPadding(C1357a0.m37541i(2.0f), 0, C1357a0.m37541i(2.0f), 0);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setTypeface(C1389o.m37258k());
        textView.setTextSize(1, 12.0f);
        textView.setText(C1363c0.m37433h(0L));
    }

    private void setNowMs(long j) {
        if (this.f23971U != j) {
            this.f23971U = j;
            this.f23963M.setText(C1363c0.m37433h(Math.round(j / 1000.0d)));
        }
    }

    private void setTimelineVisible(boolean z) {
        C6890g4 g4Var;
        if (this.f23968R != z && (g4Var = this.f23967Q) != null) {
            this.f23968R = z;
            int i = 0;
            g4Var.setVisibility(z ? 0 : 8);
            C7484p1 p1Var = this.f23965O;
            if (z) {
                i = 8;
            }
            p1Var.setVisibility(i);
        }
    }

    private void setTotalMs(long j) {
        if (this.f23970T != j) {
            this.f23970T = j;
            this.f23964N.setText(C1363c0.m37433h(Math.round(j / 1000.0d)));
        }
    }

    public void m15831C1(C6890g4.AbstractC6893c cVar, AbstractC11531p pVar) {
        m15827G1(true, false);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(56.0f), 80);
        C6890g4 g4Var = new C6890g4(getContext());
        this.f23967Q = g4Var;
        g4Var.m18569D(true, false);
        this.f23967Q.m18571B(R.id.theme_color_white, R.id.theme_color_black, R.id.theme_color_transparentEditor);
        this.f23967Q.setPadding(C1357a0.m37541i(54.0f) + C1357a0.m37541i(32.0f), C1357a0.m37541i(6.0f), C1357a0.m37541i(54.0f), C1357a0.m37541i(6.0f));
        this.f23967Q.setLayoutParams(t1);
        this.f23967Q.setDelegate(cVar);
        this.f23967Q.setForcedTheme(pVar);
        addView(this.f23967Q, 0);
        this.f23967Q.setVisibility(8);
    }

    public void m15830D1(long j, long j2, boolean z, boolean z2) {
        boolean z3 = z && j > 0;
        this.f23965O.m15841h(z3, z2);
        C6890g4 g4Var = this.f23967Q;
        if (g4Var != null) {
            g4Var.m18572A(z3, z2);
            this.f23967Q.setSliderProgress(j > 0 ? (float) (j2 / j) : 0.0f);
            this.f23967Q.invalidate();
        }
        m15828F1(j2, z2);
        setTotalMs(j);
    }

    public void m15829E1(boolean z, boolean z2) {
        this.f23966P.m15979a(z, z2 && this.f23969S.m29584g() > 0.0f);
    }

    public void m15828F1(long j, boolean z) {
        setNowMs(j);
        m15823M1(z);
    }

    public void m15827G1(boolean z, boolean z2) {
        if (this.f23967Q == null) {
            this.f23969S.m29575p(z || this.f23968R, z2);
        }
    }

    public void m15825J1(float f) {
        float d = C5069h.m24089d(f);
        C7484p1 p1Var = this.f23965O;
        if (p1Var != null) {
            p1Var.setSecondaryValue(d);
        }
    }

    public void m15824L1(long j, long j2, float f) {
        setNowMs(j);
        setTotalMs(j2);
        float d = C5069h.m24089d(f);
        C7484p1 p1Var = this.f23965O;
        if (p1Var != null) {
            p1Var.setValue(d);
        }
        C6890g4 g4Var = this.f23967Q;
        if (g4Var != null) {
            g4Var.setSliderProgress(d);
        }
    }

    public final void m15823M1(boolean z) {
        long j = this.f23970T;
        float d = C5069h.m24089d(j > 0 ? (float) (this.f23971U / j) : 0.0f);
        this.f23965O.setValue(d);
        C6890g4 g4Var = this.f23967Q;
        if (g4Var != null) {
            g4Var.setSliderProgress(d);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        int i2 = (int) (C1357a0.m37541i(32.0f) * f);
        this.f23963M.setTranslationX(i2);
        this.f23965O.setAddPaddingLeft(i2);
        this.f23966P.setTranslationX((-C1357a0.m37541i(44.0f)) * (1.0f - f));
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        setFile(null);
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, getMeasuredHeight() - C1357a0.m37541i(56.0f), getMeasuredWidth(), getMeasuredHeight(), C1410y.m37039g(C11524j.m228N(R.id.theme_color_transparentEditor)));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !C1399s0.m37205P(this, motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public void setFile(C6253l lVar) {
        double d;
        double d2;
        double d3;
        float f;
        float f2;
        if (this.f23967Q != null) {
            String q = lVar != null ? lVar.mo20875q() : null;
            boolean z = !C5070i.m24061i(q);
            if (lVar == null || !lVar.m20847a1()) {
                d2 = -1.0d;
                d = 0.0d;
                f2 = 0.0f;
                d3 = -1.0d;
                f = 1.0f;
            } else {
                long Q0 = lVar.m20857Q0();
                double P0 = lVar.m20858P0();
                double d4 = Q0;
                f2 = (float) (P0 / d4);
                double J0 = lVar.m20864J0();
                f = (float) (J0 / d4);
                d3 = P0 / 1000000.0d;
                d2 = J0 / 1000000.0d;
                d = d4 / 1000000.0d;
            }
            this.f23967Q.m18567F(q, f2, f, d3, d2, d, this.f23968R && z);
            this.f23967Q.setSliderProgress(0.0f);
            setTimelineVisible(z);
        }
    }

    public void setInnerAlpha(float f) {
        this.f23965O.setAlpha(f);
        C6890g4 g4Var = this.f23967Q;
        if (g4Var != null) {
            g4Var.setAlpha(f);
        }
        this.f23963M.setAlpha(f);
        this.f23964N.setAlpha(f);
    }

    public void setOnPlayPauseClick(View.OnClickListener onClickListener) {
        this.f23966P.setOnClickListener(onClickListener);
    }

    public void setSlideEnabled(boolean z) {
        boolean z2 = z && this.f23970T > 0;
        this.f23965O.m15841h(z2, true);
        C6890g4 g4Var = this.f23967Q;
        if (g4Var != null) {
            g4Var.m18572A(z2, true);
        }
    }

    public void setSliderListener(C7484p1.AbstractC7485a aVar) {
        this.f23965O.setListener(aVar);
    }
}
