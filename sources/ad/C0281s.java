package ad;

import ad.C0274o;
import ad.GestureDetector$OnGestureListenerC0256a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1379j0;
import gd.C4658i;
import ge.C4868i;
import me.C6924j2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import p037cb.C2057b;
import p108hb.C5070i;
import p350yd.C10536ab;
import td.AbstractC9323v4;

public class C0281s extends AbstractView$OnClickListenerC0259c implements C0274o.AbstractC0276b, GestureDetector$OnGestureListenerC0256a.AbstractC0257a {
    public static boolean f891m0 = false;
    public GestureDetector$OnGestureListenerC0256a f892R;
    public int f893S;
    public String f894T;
    public C0277p f895U;
    public C0274o f896V;
    public boolean f897W;
    public boolean f898a0;
    public float f899b0;
    public float f900c0;
    public C0277p f901d0;
    public float f902e0;
    public float f903f0;
    public boolean f904g0;
    public boolean f905h0;
    public boolean f906i0;
    public boolean f907j0;
    public boolean f908k0;
    public boolean f909l0;

    public class C0282a extends ViewOutlineProvider {
        public C0282a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, C0281s.this.f895U.getMeasuredWidth(), C0281s.this.f895U.getMeasuredHeight());
        }
    }

    public class C0283b extends AnimatorListenerAdapter {
        public final float f911a;

        public C0283b(float f) {
            this.f911a = f;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (this.f911a != 0.0f) {
                C0281s.this.mo41912G1(false);
            } else {
                C0281s.this.f895U.m41926E1();
                C0281s.this.m41893f2();
            }
            C0281s.this.f904g0 = false;
        }
    }

    public C0281s(Context context, AbstractC9323v4<?> v4Var) {
        super(context, v4Var);
        if (f891m0) {
            C1379j0.m37324i0(this);
        }
        this.f892R = new GestureDetector$OnGestureListenerC0256a(context, this);
        this.f893S = C1357a0.m37541i(20.0f);
    }

    public void m41900Z1(float f, float f2, ValueAnimator valueAnimator) {
        setCloseFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m41898a2() {
        requestLayout();
    }

    @Override
    public boolean mo41915E1() {
        C4658i iVar = this.f782M;
        if (iVar.f15552e == 0 || iVar.f15553f == 0) {
            return false;
        }
        mo41913F1(C1357a0.m37543g());
        return true;
    }

    @Override
    public void mo41914F0() {
        C0277p pVar = this.f895U;
        if (pVar != null) {
            pVar.m41926E1();
        }
    }

    @Override
    public int mo41913F1(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ad.C0281s.mo41913F1(int):int");
    }

    @Override
    public void mo41912G1(boolean z) {
        if (!z || !this.f898a0) {
            this.f786Q.m18408y2(z);
            return;
        }
        mo41895d1();
        m41901Y1(1.0f, 0.0f);
    }

    @Override
    public void mo41911H() {
        C0277p pVar = this.f895U;
        if (pVar != null && pVar.getPlayer() != null && this.f895U.m41925F1() && this.f896V != null) {
            AbstractView$OnTouchListenerC7889a aVar = (AbstractView$OnTouchListenerC7889a) getContext();
            if (this.f909l0) {
                m41894d2();
            }
            aVar.m14469l2(this.f786Q);
            this.f786Q.setHideBackground(true);
            this.f786Q.setDisableCancelOnTouchDown(true);
            setFooterVisibility(8);
            C0274o oVar = this.f896V;
            this.f898a0 = true;
            oVar.setMinimized(true);
            mo41913F1(getMeasuredWidth());
            if (Build.VERSION.SDK_INT >= 21) {
                this.f895U.setElevation(C1357a0.m37541i(3.0f));
                this.f895U.setTranslationZ(C1357a0.m37541i(1.0f));
                this.f895U.setOutlineProvider(new C0282a());
            }
            this.f895U.requestLayout();
        }
    }

    @Override
    public void mo41910J1() {
        C0277p pVar = this.f901d0;
        if (pVar != null) {
            pVar.m41923I1();
            this.f901d0 = null;
        }
    }

    @Override
    public boolean mo41909L1(String str) {
        String d = C0264f.m41971d(str);
        if (d == null || !d.equals(this.f894T)) {
            return false;
        }
        mo41890i();
        return true;
    }

    @Override
    public boolean mo41908M1(C4658i iVar) {
        String d = C0264f.m41971d(iVar.f15549b);
        this.f894T = d;
        if (!C5070i.m24061i(d)) {
            C10536ab.m4667o1().m4636w2().m7075W0(16, true);
            C0274o oVar = new C0274o(getContext());
            this.f896V = oVar;
            oVar.setCanMinimize(this.f784O.mo4348c().m2696Pe());
            this.f896V.setCallback(this);
            this.f896V.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 48));
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, 80);
            t1.bottomMargin = this.f783N;
            C0277p pVar = new C0277p(getContext());
            this.f895U = pVar;
            if (f891m0) {
                C1379j0.m37324i0(pVar);
            }
            this.f895U.setControls(this.f896V);
            this.f895U.setParentLayout(this);
            this.f895U.setLayoutParams(t1);
            addView(this.f895U);
            this.f895U.addView(this.f896V);
        }
        return super.mo41908M1(iVar);
    }

    @Override
    public void mo41907T(boolean z) {
        AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(getContext());
        if (this.f909l0 && r != null && Build.VERSION.SDK_INT >= 14) {
            r.m14432u3(!z ? 1 : 0, false);
        }
    }

    public final void m41901Y1(float f, float f2) {
        if (!this.f904g0 && this.f905h0) {
            this.f904g0 = true;
            this.f905h0 = false;
            final float closeFactor = getCloseFactor();
            final float f3 = f - closeFactor;
            ValueAnimator b = C2057b.m35734b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C0281s.this.m41900Z1(closeFactor, f3, valueAnimator);
                }
            });
            b.setDuration(f2 == 0.0f ? 200L : f == 1.0f ? 160L : 120L);
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C0283b(f));
            b.start();
        }
    }

    @Override
    public void mo41899a() {
        C0277p pVar = this.f895U;
        if (pVar != null) {
            pVar.m41919N1();
        }
    }

    @Override
    public void mo41897b0() {
        try {
            C0277p pVar = this.f895U;
            if (!(pVar == null || pVar.getPlayer() == null || !this.f895U.m41925F1())) {
                if (this.f895U.getPlayer().mo5937l()) {
                    this.f895U.getPlayer().mo5947b();
                } else {
                    this.f895U.getPlayer().mo5942g();
                }
            }
        } catch (Throwable th) {
            Log.m14710w("YouTube onPlayPause", th, new Object[0]);
        }
    }

    public final void m41896b2(boolean z) {
        AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(getContext());
        if (z) {
            int i = Build.VERSION.SDK_INT;
            r.setRequestedOrientation(6);
            if (i >= 14) {
                r.m14432u3(1, false);
                return;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        r.setRequestedOrientation(-1);
        if (i2 >= 14) {
            r.m14432u3(0, false);
        }
    }

    @Override
    public void mo41895d1() {
        this.f905h0 = true;
        this.f906i0 = false;
        m41891h2();
        this.f895U.m41919N1();
    }

    public final void m41894d2() {
        m41896b2(false);
    }

    @Override
    public void mo18406f0(C6924j2 j2Var) {
        if (this.f894T != null) {
            C10536ab.m4667o1().m4636w2().m7075W0(16, true);
            this.f895U.m41924G1(this.f894T);
        }
    }

    public final void m41893f2() {
        if (this.f907j0) {
            this.f907j0 = false;
            C0277p pVar = this.f895U;
            if (pVar != null && pVar.getPlayer() != null) {
                this.f895U.getPlayer().mo5942g();
            }
        }
    }

    public float getCloseFactor() {
        return this.f902e0;
    }

    @Override
    public int getPreviewHeight() {
        return C1357a0.m37545e();
    }

    @Override
    public void mo41892h(int i) {
        C0277p pVar = this.f895U;
        if (pVar != null) {
            pVar.m41921L1(i);
        }
    }

    public final void m41891h2() {
        C0277p pVar;
        if (!this.f907j0 && (pVar = this.f895U) != null && pVar.getPlayer() != null && this.f895U.getPlayer().mo5937l()) {
            this.f907j0 = true;
            this.f895U.getPlayer().mo5947b();
        }
    }

    @Override
    public void mo41890i() {
        if (this.f896V != null && !this.f904g0) {
            C1379j0.m37307r(getContext()).m14566L1(this.f786Q);
            this.f786Q.setHideBackground(false);
            this.f786Q.setDisableCancelOnTouchDown(false);
            if (this.f909l0) {
                m41896b2(true);
            }
            setFooterVisibility(0);
            C0274o oVar = this.f896V;
            this.f898a0 = false;
            oVar.setMinimized(false);
            mo41913F1(getMeasuredWidth());
            if (Build.VERSION.SDK_INT >= 21) {
                this.f895U.setElevation(0.0f);
                this.f895U.setTranslationZ(0.0f);
                this.f895U.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            this.f895U.requestLayout();
        }
    }

    @Override
    public void mo3000j2(C6924j2 j2Var) {
        if (this.f909l0) {
            mo41889q1(false);
        }
        C10536ab.m4667o1().m4636w2().m7075W0(16, false);
        C0277p pVar = this.f895U;
        if (pVar != null) {
            pVar.m41922J1();
            this.f901d0 = this.f895U;
            this.f895U = null;
        }
    }

    @Override
    public boolean mo7205o7(float f, float f2) {
        if (!this.f905h0 || this.f904g0) {
            return false;
        }
        float abs = Math.abs(f);
        if (abs <= Math.abs(f2)) {
            return false;
        }
        float f3 = 1.0f;
        if (abs <= C1357a0.m37540j(350.0f, 1.0f)) {
            return false;
        }
        if (f <= 0.0f) {
            f3 = -1.0f;
        }
        m41901Y1(f3, abs);
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f905h0 || this.f904g0) {
            return true;
        }
        this.f892R.m41994a(motionEvent);
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f905h0) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        this.f892R.m41994a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1) {
            float f = this.f902e0;
            m41901Y1(f >= 0.5f ? 1.0f : f <= -0.5f ? -1.0f : 0.0f, 0.0f);
        } else if (action == 2) {
            float x = motionEvent.getX();
            if (!this.f906i0) {
                this.f906i0 = true;
                this.f903f0 = x;
            }
            setCloseFactor((x - this.f903f0) / this.f899b0);
        } else if (action == 3) {
            m41901Y1(0.0f, 0.0f);
        }
        return true;
    }

    @Override
    public void mo41889q1(boolean z) {
        C0277p pVar = this.f895U;
        if (pVar != null && pVar.getPlayer() != null && this.f895U.m41925F1()) {
            this.f896V.setFullscreen(z);
            this.f909l0 = z;
            if (!z) {
                this.f908k0 = C4868i.m24726c2().m24763X2(4L);
            }
            m41896b2(z);
            post(new Runnable() {
                @Override
                public final void run() {
                    C0281s.this.m41898a2();
                }
            });
        }
    }

    public void setCloseFactor(float f) {
        if (this.f902e0 != f) {
            this.f902e0 = f;
            C0277p pVar = this.f895U;
            if (pVar != null) {
                pVar.setTranslationX(this.f900c0 + (this.f899b0 * f));
                this.f895U.setAlpha(1.0f - Math.abs(f));
            }
        }
    }

    @Override
    public boolean mo41888x0() {
        return this.f905h0 && this.f907j0;
    }
}
