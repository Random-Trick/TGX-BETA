package p194nd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import p037cb.C2057b;
import p051db.C3950k;
import p082fd.C4403w;
import p156kd.AbstractC6264v;
import p194nd.RunnableC7470o;
import p225pd.C8112b;
import p225pd.C8113c;

public class C7401b0 extends FrameLayoutFix {
    public C8113c f23362M;
    public RunnableC7470o f23363N;
    public RunnableC7470o f23364O;
    public GestureDetector$OnGestureListenerC7501t f23365P;
    public View$OnClickListenerC7430j1 f23366Q;
    public boolean f23367R;
    public boolean f23368S;
    public AbstractC7403b f23369T;
    public RunnableC7470o f23370U;
    public C7462l1 f23371V;
    public int f23372W;
    public int f23373a0;
    public int f23374b0;
    public int f23375c0;
    public int f23376d0;
    public boolean f23377e0;
    public float f23378f0;
    public AbstractC7404c f23379g0;
    public boolean f23380h0;
    public ValueAnimator f23381i0;
    public boolean f23382j0;
    public float f23383k0;
    public boolean f23384l0;
    public float f23385m0;
    public float f23386n0;
    public boolean f23387o0;
    public boolean f23388p0;
    public float f23389q0;
    public float f23390r0;
    public boolean f23391s0;
    public boolean f23392t0;

    public class C7402a extends AnimatorListenerAdapter {
        public C7402a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (C7401b0.this.f23378f0 != 0.0f) {
                C7401b0.this.m16542I1();
            }
            C7401b0.this.f23380h0 = false;
            if (C7401b0.this.f23378f0 == 0.0f && C7401b0.this.f23364O != null) {
                C7401b0.this.f23364O.setMedia(null);
            }
        }
    }

    public interface AbstractC7403b {
        void mo16088x5(C7401b0 b0Var, float f, float f2);
    }

    public interface AbstractC7404c {
        void mo16219h(C7401b0 b0Var, float f);
    }

    public C7401b0(Context context) {
        super(context);
    }

    public void m16521i2(float f, float f2, ValueAnimator valueAnimator) {
        m16509z2(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    private void setFactorImpl(float f) {
        if (this.f23378f0 != f) {
            this.f23378f0 = f;
            AbstractC7404c cVar = this.f23379g0;
            if (cVar != null) {
                cVar.mo16219h(this, f);
            }
        }
    }

    public final void m16549A2() {
        float f = this.f23378f0;
        if (f == 0.0f || this.f23364O == null) {
            this.f23363N.setFactor(0.0f);
            RunnableC7470o oVar = this.f23364O;
            if (oVar != null) {
                oVar.setFactor(-1.0f);
            }
            if (indexOfChild(this.f23363N) != 1) {
                bringChildToFront(this.f23363N);
            }
        } else if (f < 0.0f) {
            this.f23363N.setFactor(f);
            this.f23364O.setFactor(this.f23378f0 + 1.0f);
            if (indexOfChild(this.f23364O) != 1) {
                bringChildToFront(this.f23364O);
            }
        } else {
            this.f23363N.setFactor(f);
            this.f23364O.setFactor(this.f23378f0 - 1.0f);
            if (indexOfChild(this.f23363N) != 1) {
                bringChildToFront(this.f23363N);
            }
        }
    }

    public final void m16548B2(float f) {
        float f2 = this.f23378f0;
        if (f2 == 0.0f) {
            this.f23383k0 = f;
            this.f23388p0 = false;
            return;
        }
        this.f23383k0 = f + (this.f23372W * f2 * (C4403w.m27984G2() ? -1.0f : 1.0f));
        this.f23388p0 = true;
    }

    public final boolean m16542I1() {
        float f = this.f23378f0;
        if (f <= -0.5f) {
            if (!this.f23362M.m13453o()) {
                return false;
            }
            this.f23362M.m13466b();
            setFactorImpl(this.f23378f0 + 1.0f);
        } else if (f < 0.5f || !this.f23362M.m13454n()) {
            return false;
        } else {
            this.f23362M.m13467a();
            setFactorImpl(this.f23378f0 - 1.0f);
        }
        RunnableC7470o oVar = this.f23363N;
        this.f23363N = this.f23364O;
        this.f23364O = oVar;
        m16549A2();
        invalidate();
        return true;
    }

    public void m16541J1(boolean z) {
        this.f23363N.m15933Y(z);
    }

    public final void m16540L1(boolean z) {
        this.f23377e0 = true;
        this.f23363N.getDetector().m15870m(z);
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.getDetector().m15860w();
        }
        m16534T1();
        m16520k2();
    }

    public boolean m16539M1() {
        return !this.f23392t0;
    }

    public boolean m16538N1(RunnableC7470o oVar) {
        View$OnClickListenerC7430j1 j1Var = this.f23366Q;
        return j1Var == null || j1Var.m16118ti() != 3 || this.f23366Q.m16356Qg();
    }

    public boolean m16537O1(RunnableC7470o oVar) {
        return this.f23363N == oVar && this.f23378f0 == 0.0f;
    }

    public void m16536Q1() {
        View$OnClickListenerC7430j1 j1Var = this.f23366Q;
        if (j1Var != null) {
            j1Var.m16255ck();
        }
    }

    public final void m16535S1() {
        if (this.f23388p0) {
            m16533U1(0, 0.0f);
        }
        this.f23387o0 = false;
        this.f23388p0 = false;
    }

    public final void m16534T1() {
        this.f23382j0 = true;
    }

    public void m16533U1(int r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.C7401b0.m16533U1(int, float):void");
    }

    public RunnableC7470o m16532V1(C8112b bVar) {
        RunnableC7470o oVar = this.f23363N;
        if (oVar != null && oVar.getMedia() == bVar) {
            return this.f23363N;
        }
        RunnableC7470o oVar2 = this.f23364O;
        if (oVar2 == null || oVar2.getMedia() != bVar) {
            return null;
        }
        return this.f23364O;
    }

    public boolean m16531W1() {
        return !m16529Y1() && this.f23362M.m13454n();
    }

    public boolean m16530X1() {
        return !m16529Y1() && this.f23362M.m13453o();
    }

    public boolean m16529Y1() {
        return this.f23367R;
    }

    public void m16528Z() {
        this.f23363N.m15920h0();
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.m15920h0();
        }
    }

    public void m16527Z1(C8113c cVar) {
        this.f23362M = cVar;
        this.f23363N.setFactor(0.0f);
        this.f23363N.setMedia(cVar.m13461g());
    }

    public boolean m16526a2() {
        return this.f23363N.m15916l0();
    }

    public boolean m16525b2() {
        return this.f23388p0;
    }

    public boolean m16524d2() {
        View$OnClickListenerC7430j1 j1Var = this.f23366Q;
        return j1Var != null && j1Var.m16281Zi();
    }

    public boolean m16523f2() {
        return this.f23378f0 == 0.0f;
    }

    public int getActualImageHeight() {
        return (getMeasuredHeight() - this.f23374b0) - this.f23375c0;
    }

    public int getActualImageWidth() {
        int measuredWidth = getMeasuredWidth();
        int i = this.f23376d0;
        return (measuredWidth - i) - i;
    }

    public RunnableC7470o getBaseCell() {
        return this.f23363N;
    }

    public AbstractC6264v getBaseReceiver() {
        return this.f23363N.getReceiver();
    }

    public int getBottomAdd() {
        View$OnClickListenerC7430j1 j1Var = this.f23366Q;
        if (j1Var == null || !j1Var.m9348S9() || this.f23366Q.m9131x9().f23721b != 3) {
            return 0;
        }
        return this.f23366Q.m16199ji();
    }

    public float getCurrentZoom() {
        return this.f23363N.getDetector().m15872k();
    }

    public float getFactor() {
        return this.f23378f0;
    }

    public int getOffsetBottom() {
        return this.f23375c0;
    }

    public int getOffsetHorizontal() {
        return this.f23376d0;
    }

    public int getOffsetTop() {
        return this.f23374b0;
    }

    public boolean m16522h2(boolean z) {
        View$OnClickListenerC7430j1 j1Var;
        return !this.f23368S && ((j1Var = this.f23366Q) == null || j1Var.m16364Pg(z));
    }

    public void m16520k2() {
        int bottomAdd = this.f23373a0 + getBottomAdd();
        this.f23363N.m15905t0(this.f23376d0, this.f23374b0, this.f23375c0, this.f23372W, bottomAdd);
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.m15905t0(this.f23376d0, this.f23374b0, this.f23375c0, this.f23372W, bottomAdd);
        }
    }

    public void m16519l2() {
        this.f23363N.m15893z0();
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.m15893z0();
        }
    }

    public void m16518m2() {
        this.f23363N.m15968A0();
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.m15968A0();
        }
    }

    public void m16517n2(float f, float f2) {
        View$OnClickListenerC7430j1 j1Var = this.f23366Q;
        if (j1Var != null) {
            j1Var.m16272ak(this, f, f2);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23363N.m15934X();
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.m15934X();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23363N.m15919i0();
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.m15919i0();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f23384l0 || this.f23367R || this.f23368S || this.f23365P == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23385m0 = motionEvent.getX();
            this.f23386n0 = motionEvent.getY();
            m16511x2();
            m16548B2(this.f23385m0);
            if (!this.f23388p0 && motionEvent.getPointerCount() == 1) {
                z = true;
            }
            this.f23387o0 = z;
            if (!this.f23388p0) {
                this.f23365P.m15769a(motionEvent);
            }
        } else if (action == 2 && this.f23387o0 && Math.abs(motionEvent.getX() - this.f23385m0) > C1357a0.m37533q() && Math.abs(motionEvent.getY() - this.f23386n0) < C1357a0.m37533q()) {
            this.f23387o0 = false;
            this.f23383k0 = motionEvent.getX();
            this.f23388p0 = true;
        }
        return this.f23388p0;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = this.f23372W == size;
        if (this.f23373a0 != size2 || !z) {
            this.f23372W = size;
            this.f23373a0 = size2;
            m16540L1(z);
        }
        super.onMeasure(i, i2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23365P == null) {
            return false;
        }
        if (this.f23368S) {
            if (this.f23369T != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f23389q0 = motionEvent.getX();
                    this.f23390r0 = motionEvent.getY();
                    this.f23391s0 = true;
                } else if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f23391s0 = false;
                        }
                    } else if (this.f23391s0 && Math.max(Math.abs(motionEvent.getX() - this.f23389q0), Math.abs(motionEvent.getY() - this.f23390r0)) > C1357a0.m37534p()) {
                        this.f23391s0 = false;
                    }
                } else if (this.f23391s0) {
                    this.f23391s0 = false;
                    playSoundEffect(0);
                    this.f23369T.mo16088x5(this, motionEvent.getX(), motionEvent.getY());
                }
                return this.f23391s0;
            }
            m16535S1();
            return false;
        } else if (motionEvent.getPointerCount() > 1 || this.f23367R) {
            m16535S1();
            return true;
        } else {
            boolean a = this.f23365P.m15769a(motionEvent);
            float x = motionEvent.getX();
            int action2 = motionEvent.getAction();
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 == 3 && this.f23388p0) {
                        m16533U1(0, 0.0f);
                        this.f23388p0 = false;
                    }
                } else if (this.f23388p0) {
                    float f = ((x - this.f23383k0) / this.f23372W) * (C4403w.m27984G2() ? 1.0f : -1.0f);
                    if ((f > 0.0f && !this.f23362M.m13454n()) || (f < 0.0f && !this.f23362M.m13453o())) {
                        f *= 0.5f;
                    }
                    m16509z2(f);
                }
            } else if (a) {
                this.f23388p0 = false;
            } else if (this.f23388p0) {
                m16533U1(0, 0.0f);
                this.f23388p0 = false;
            }
            return true;
        }
    }

    public void m16516p2() {
        this.f23363N.m15966B0();
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.m15966B0();
        }
    }

    public void m16515r2(boolean z) {
        this.f23363N = new RunnableC7470o(getContext());
        if (z) {
            RunnableC7470o oVar = new RunnableC7470o(getContext());
            this.f23364O = oVar;
            oVar.setFactor(-1.0f);
            addView(this.f23364O);
        }
        addView(this.f23363N);
        if (z) {
            GestureDetector$OnGestureListenerC7501t tVar = new GestureDetector$OnGestureListenerC7501t(getContext());
            this.f23365P = tVar;
            tVar.m15768b(this);
        }
        setWillNotDraw(false);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.f23384l0 = z;
        m16535S1();
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setBoundController(View$OnClickListenerC7430j1 j1Var) {
        this.f23366Q = j1Var;
    }

    public void setButStillNeedClick(AbstractC7403b bVar) {
        if (this.f23369T != bVar) {
            this.f23369T = bVar;
            this.f23391s0 = false;
        }
    }

    public void setCellCallback(RunnableC7470o.AbstractC7472b bVar) {
        this.f23363N.setCallback(bVar);
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.setCallback(bVar);
        }
    }

    public void setDisableAnimations(boolean z) {
        this.f23363N.setDisableAnimations(z);
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.setDisableAnimations(z);
        }
    }

    public void setDisableDoubleTapZoom(boolean z) {
        this.f23392t0 = z;
    }

    public void setDisableTouch(boolean z) {
        this.f23368S = z;
    }

    public void setDisallowMove(boolean z) {
        this.f23367R = z;
    }

    public void setFactorChangeListener(AbstractC7404c cVar) {
        this.f23379g0 = cVar;
    }

    public void setOffsetBottom(int i) {
        m16513u2(this.f23376d0, this.f23374b0, i);
    }

    public void setOffsetHorizontal(int i) {
        if (this.f23376d0 != i) {
            m16513u2(i, this.f23374b0, this.f23375c0);
        }
    }

    public void setPendingOpenAnimator(C3950k kVar) {
        this.f23370U.setTargetAnimator(kVar);
    }

    public void setRevealFactor(float f) {
        this.f23370U.setRevealFactor(f);
    }

    public void setSeekProgress(float f) {
        this.f23363N.setSeekProgress(f);
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.setSeekProgress(f);
        }
    }

    public void m16514t2(float f) {
        this.f23363N.m15960E0(f);
        RunnableC7470o oVar = this.f23364O;
        if (oVar != null) {
            oVar.m15960E0(f);
        }
    }

    public void m16513u2(int i, int i2, int i3) {
        if (this.f23376d0 != i || this.f23374b0 != i2 || this.f23375c0 != i3) {
            this.f23374b0 = i2;
            this.f23375c0 = i3;
            this.f23376d0 = i;
            if (this.f23377e0) {
                this.f23363N.m15952I0(i, i2, i3);
                RunnableC7470o oVar = this.f23364O;
                if (oVar != null) {
                    oVar.m15952I0(i, i2, i3);
                }
            }
        }
    }

    public void m16512v2(C7462l1 l1Var, float f) {
        this.f23371V = l1Var;
        RunnableC7470o oVar = this.f23363N;
        this.f23370U = oVar;
        oVar.setTargetLocation(l1Var);
        this.f23370U.setRevealFactor(f);
        this.f23370U.setDisappearing(f == 1.0f);
    }

    public final void m16511x2() {
        if (this.f23380h0) {
            this.f23380h0 = false;
            this.f23381i0.cancel();
        }
    }

    public void m16510y2(float f, float f2) {
        RunnableC7470o oVar = this.f23364O;
        if (oVar == null) {
            return;
        }
        if (f > 0.0f) {
            if (f2 <= 0.0f) {
                oVar.setMedia(this.f23362M.m13456l());
            }
        } else if (f < 0.0f && f2 >= 0.0f) {
            oVar.setMedia(this.f23362M.m13455m());
        }
    }

    public void m16509z2(float f) {
        float f2 = this.f23378f0;
        if (f2 != f) {
            m16510y2(f, f2);
            setFactorImpl(f);
            m16549A2();
            invalidate();
        }
    }
}
