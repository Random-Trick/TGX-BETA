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
    public C8113c f23365M;
    public RunnableC7470o f23366N;
    public RunnableC7470o f23367O;
    public GestureDetector$OnGestureListenerC7501t f23368P;
    public View$OnClickListenerC7430j1 f23369Q;
    public boolean f23370R;
    public boolean f23371S;
    public AbstractC7403b f23372T;
    public RunnableC7470o f23373U;
    public C7462l1 f23374V;
    public int f23375W;
    public int f23376a0;
    public int f23377b0;
    public int f23378c0;
    public int f23379d0;
    public boolean f23380e0;
    public float f23381f0;
    public AbstractC7404c f23382g0;
    public boolean f23383h0;
    public ValueAnimator f23384i0;
    public boolean f23385j0;
    public float f23386k0;
    public boolean f23387l0;
    public float f23388m0;
    public float f23389n0;
    public boolean f23390o0;
    public boolean f23391p0;
    public float f23392q0;
    public float f23393r0;
    public boolean f23394s0;
    public boolean f23395t0;

    public class C7402a extends AnimatorListenerAdapter {
        public C7402a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (C7401b0.this.f23381f0 != 0.0f) {
                C7401b0.this.m16542I1();
            }
            C7401b0.this.f23383h0 = false;
            if (C7401b0.this.f23381f0 == 0.0f && C7401b0.this.f23367O != null) {
                C7401b0.this.f23367O.setMedia(null);
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
        m16509z2(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    private void setFactorImpl(float f) {
        if (this.f23381f0 != f) {
            this.f23381f0 = f;
            AbstractC7404c cVar = this.f23382g0;
            if (cVar != null) {
                cVar.mo16219h(this, f);
            }
        }
    }

    public final void m16549A2() {
        float f = this.f23381f0;
        if (f == 0.0f || this.f23367O == null) {
            this.f23366N.setFactor(0.0f);
            RunnableC7470o oVar = this.f23367O;
            if (oVar != null) {
                oVar.setFactor(-1.0f);
            }
            if (indexOfChild(this.f23366N) != 1) {
                bringChildToFront(this.f23366N);
            }
        } else if (f < 0.0f) {
            this.f23366N.setFactor(f);
            this.f23367O.setFactor(this.f23381f0 + 1.0f);
            if (indexOfChild(this.f23367O) != 1) {
                bringChildToFront(this.f23367O);
            }
        } else {
            this.f23366N.setFactor(f);
            this.f23367O.setFactor(this.f23381f0 - 1.0f);
            if (indexOfChild(this.f23366N) != 1) {
                bringChildToFront(this.f23366N);
            }
        }
    }

    public final void m16548B2(float f) {
        float f2 = this.f23381f0;
        if (f2 == 0.0f) {
            this.f23386k0 = f;
            this.f23391p0 = false;
            return;
        }
        this.f23386k0 = f + (this.f23375W * f2 * (C4403w.m27986G2() ? -1.0f : 1.0f));
        this.f23391p0 = true;
    }

    public final boolean m16542I1() {
        float f = this.f23381f0;
        if (f <= -0.5f) {
            if (!this.f23365M.m13452o()) {
                return false;
            }
            this.f23365M.m13465b();
            setFactorImpl(this.f23381f0 + 1.0f);
        } else if (f < 0.5f || !this.f23365M.m13453n()) {
            return false;
        } else {
            this.f23365M.m13466a();
            setFactorImpl(this.f23381f0 - 1.0f);
        }
        RunnableC7470o oVar = this.f23366N;
        this.f23366N = this.f23367O;
        this.f23367O = oVar;
        m16549A2();
        invalidate();
        return true;
    }

    public void m16541J1(boolean z) {
        this.f23366N.m15933Y(z);
    }

    public final void m16540L1(boolean z) {
        this.f23380e0 = true;
        this.f23366N.getDetector().m15870m(z);
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.getDetector().m15860w();
        }
        m16534T1();
        m16520k2();
    }

    public boolean m16539M1() {
        return !this.f23395t0;
    }

    public boolean m16538N1(RunnableC7470o oVar) {
        View$OnClickListenerC7430j1 j1Var = this.f23369Q;
        return j1Var == null || j1Var.m16118ti() != 3 || this.f23369Q.m16356Qg();
    }

    public boolean m16537O1(RunnableC7470o oVar) {
        return this.f23366N == oVar && this.f23381f0 == 0.0f;
    }

    public void m16536Q1() {
        View$OnClickListenerC7430j1 j1Var = this.f23369Q;
        if (j1Var != null) {
            j1Var.m16255ck();
        }
    }

    public final void m16535S1() {
        if (this.f23391p0) {
            m16533U1(0, 0.0f);
        }
        this.f23390o0 = false;
        this.f23391p0 = false;
    }

    public final void m16534T1() {
        this.f23385j0 = true;
    }

    public void m16533U1(int r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.C7401b0.m16533U1(int, float):void");
    }

    public RunnableC7470o m16532V1(C8112b bVar) {
        RunnableC7470o oVar = this.f23366N;
        if (oVar != null && oVar.getMedia() == bVar) {
            return this.f23366N;
        }
        RunnableC7470o oVar2 = this.f23367O;
        if (oVar2 == null || oVar2.getMedia() != bVar) {
            return null;
        }
        return this.f23367O;
    }

    public boolean m16531W1() {
        return !m16529Y1() && this.f23365M.m13453n();
    }

    public boolean m16530X1() {
        return !m16529Y1() && this.f23365M.m13452o();
    }

    public boolean m16529Y1() {
        return this.f23370R;
    }

    public void m16528Z() {
        this.f23366N.m15920h0();
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.m15920h0();
        }
    }

    public void m16527Z1(C8113c cVar) {
        this.f23365M = cVar;
        this.f23366N.setFactor(0.0f);
        this.f23366N.setMedia(cVar.m13460g());
    }

    public boolean m16526a2() {
        return this.f23366N.m15916l0();
    }

    public boolean m16525b2() {
        return this.f23391p0;
    }

    public boolean m16524d2() {
        View$OnClickListenerC7430j1 j1Var = this.f23369Q;
        return j1Var != null && j1Var.m16281Zi();
    }

    public boolean m16523f2() {
        return this.f23381f0 == 0.0f;
    }

    public int getActualImageHeight() {
        return (getMeasuredHeight() - this.f23377b0) - this.f23378c0;
    }

    public int getActualImageWidth() {
        int measuredWidth = getMeasuredWidth();
        int i = this.f23379d0;
        return (measuredWidth - i) - i;
    }

    public RunnableC7470o getBaseCell() {
        return this.f23366N;
    }

    public AbstractC6264v getBaseReceiver() {
        return this.f23366N.getReceiver();
    }

    public int getBottomAdd() {
        View$OnClickListenerC7430j1 j1Var = this.f23369Q;
        if (j1Var == null || !j1Var.m9348S9() || this.f23369Q.m9131x9().f23724b != 3) {
            return 0;
        }
        return this.f23369Q.m16199ji();
    }

    public float getCurrentZoom() {
        return this.f23366N.getDetector().m15872k();
    }

    public float getFactor() {
        return this.f23381f0;
    }

    public int getOffsetBottom() {
        return this.f23378c0;
    }

    public int getOffsetHorizontal() {
        return this.f23379d0;
    }

    public int getOffsetTop() {
        return this.f23377b0;
    }

    public boolean m16522h2(boolean z) {
        View$OnClickListenerC7430j1 j1Var;
        return !this.f23371S && ((j1Var = this.f23369Q) == null || j1Var.m16364Pg(z));
    }

    public void m16520k2() {
        int bottomAdd = this.f23376a0 + getBottomAdd();
        this.f23366N.m15905t0(this.f23379d0, this.f23377b0, this.f23378c0, this.f23375W, bottomAdd);
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.m15905t0(this.f23379d0, this.f23377b0, this.f23378c0, this.f23375W, bottomAdd);
        }
    }

    public void m16519l2() {
        this.f23366N.m15893z0();
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.m15893z0();
        }
    }

    public void m16518m2() {
        this.f23366N.m15968A0();
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.m15968A0();
        }
    }

    public void m16517n2(float f, float f2) {
        View$OnClickListenerC7430j1 j1Var = this.f23369Q;
        if (j1Var != null) {
            j1Var.m16272ak(this, f, f2);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23366N.m15934X();
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.m15934X();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23366N.m15919i0();
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.m15919i0();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f23387l0 || this.f23370R || this.f23371S || this.f23368P == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23388m0 = motionEvent.getX();
            this.f23389n0 = motionEvent.getY();
            m16511x2();
            m16548B2(this.f23388m0);
            if (!this.f23391p0 && motionEvent.getPointerCount() == 1) {
                z = true;
            }
            this.f23390o0 = z;
            if (!this.f23391p0) {
                this.f23368P.m15769a(motionEvent);
            }
        } else if (action == 2 && this.f23390o0 && Math.abs(motionEvent.getX() - this.f23388m0) > C1357a0.m37536q() && Math.abs(motionEvent.getY() - this.f23389n0) < C1357a0.m37536q()) {
            this.f23390o0 = false;
            this.f23386k0 = motionEvent.getX();
            this.f23391p0 = true;
        }
        return this.f23391p0;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = this.f23375W == size;
        if (this.f23376a0 != size2 || !z) {
            this.f23375W = size;
            this.f23376a0 = size2;
            m16540L1(z);
        }
        super.onMeasure(i, i2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23368P == null) {
            return false;
        }
        if (this.f23371S) {
            if (this.f23372T != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f23392q0 = motionEvent.getX();
                    this.f23393r0 = motionEvent.getY();
                    this.f23394s0 = true;
                } else if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f23394s0 = false;
                        }
                    } else if (this.f23394s0 && Math.max(Math.abs(motionEvent.getX() - this.f23392q0), Math.abs(motionEvent.getY() - this.f23393r0)) > C1357a0.m37537p()) {
                        this.f23394s0 = false;
                    }
                } else if (this.f23394s0) {
                    this.f23394s0 = false;
                    playSoundEffect(0);
                    this.f23372T.mo16088x5(this, motionEvent.getX(), motionEvent.getY());
                }
                return this.f23394s0;
            }
            m16535S1();
            return false;
        } else if (motionEvent.getPointerCount() > 1 || this.f23370R) {
            m16535S1();
            return true;
        } else {
            boolean a = this.f23368P.m15769a(motionEvent);
            float x = motionEvent.getX();
            int action2 = motionEvent.getAction();
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 == 3 && this.f23391p0) {
                        m16533U1(0, 0.0f);
                        this.f23391p0 = false;
                    }
                } else if (this.f23391p0) {
                    float f = ((x - this.f23386k0) / this.f23375W) * (C4403w.m27986G2() ? 1.0f : -1.0f);
                    if ((f > 0.0f && !this.f23365M.m13453n()) || (f < 0.0f && !this.f23365M.m13452o())) {
                        f *= 0.5f;
                    }
                    m16509z2(f);
                }
            } else if (a) {
                this.f23391p0 = false;
            } else if (this.f23391p0) {
                m16533U1(0, 0.0f);
                this.f23391p0 = false;
            }
            return true;
        }
    }

    public void m16516p2() {
        this.f23366N.m15966B0();
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.m15966B0();
        }
    }

    public void m16515r2(boolean z) {
        this.f23366N = new RunnableC7470o(getContext());
        if (z) {
            RunnableC7470o oVar = new RunnableC7470o(getContext());
            this.f23367O = oVar;
            oVar.setFactor(-1.0f);
            addView(this.f23367O);
        }
        addView(this.f23366N);
        if (z) {
            GestureDetector$OnGestureListenerC7501t tVar = new GestureDetector$OnGestureListenerC7501t(getContext());
            this.f23368P = tVar;
            tVar.m15768b(this);
        }
        setWillNotDraw(false);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.f23387l0 = z;
        m16535S1();
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setBoundController(View$OnClickListenerC7430j1 j1Var) {
        this.f23369Q = j1Var;
    }

    public void setButStillNeedClick(AbstractC7403b bVar) {
        if (this.f23372T != bVar) {
            this.f23372T = bVar;
            this.f23394s0 = false;
        }
    }

    public void setCellCallback(RunnableC7470o.AbstractC7472b bVar) {
        this.f23366N.setCallback(bVar);
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.setCallback(bVar);
        }
    }

    public void setDisableAnimations(boolean z) {
        this.f23366N.setDisableAnimations(z);
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.setDisableAnimations(z);
        }
    }

    public void setDisableDoubleTapZoom(boolean z) {
        this.f23395t0 = z;
    }

    public void setDisableTouch(boolean z) {
        this.f23371S = z;
    }

    public void setDisallowMove(boolean z) {
        this.f23370R = z;
    }

    public void setFactorChangeListener(AbstractC7404c cVar) {
        this.f23382g0 = cVar;
    }

    public void setOffsetBottom(int i) {
        m16513u2(this.f23379d0, this.f23377b0, i);
    }

    public void setOffsetHorizontal(int i) {
        if (this.f23379d0 != i) {
            m16513u2(i, this.f23377b0, this.f23378c0);
        }
    }

    public void setPendingOpenAnimator(C3950k kVar) {
        this.f23373U.setTargetAnimator(kVar);
    }

    public void setRevealFactor(float f) {
        this.f23373U.setRevealFactor(f);
    }

    public void setSeekProgress(float f) {
        this.f23366N.setSeekProgress(f);
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.setSeekProgress(f);
        }
    }

    public void m16514t2(float f) {
        this.f23366N.m15960E0(f);
        RunnableC7470o oVar = this.f23367O;
        if (oVar != null) {
            oVar.m15960E0(f);
        }
    }

    public void m16513u2(int i, int i2, int i3) {
        if (this.f23379d0 != i || this.f23377b0 != i2 || this.f23378c0 != i3) {
            this.f23377b0 = i2;
            this.f23378c0 = i3;
            this.f23379d0 = i;
            if (this.f23380e0) {
                this.f23366N.m15952I0(i, i2, i3);
                RunnableC7470o oVar = this.f23367O;
                if (oVar != null) {
                    oVar.m15952I0(i, i2, i3);
                }
            }
        }
    }

    public void m16512v2(C7462l1 l1Var, float f) {
        this.f23374V = l1Var;
        RunnableC7470o oVar = this.f23366N;
        this.f23373U = oVar;
        oVar.setTargetLocation(l1Var);
        this.f23373U.setRevealFactor(f);
        this.f23373U.setDisappearing(f == 1.0f);
    }

    public final void m16511x2() {
        if (this.f23383h0) {
            this.f23383h0 = false;
            this.f23384i0.cancel();
        }
    }

    public void m16510y2(float f, float f2) {
        RunnableC7470o oVar = this.f23367O;
        if (oVar == null) {
            return;
        }
        if (f > 0.0f) {
            if (f2 <= 0.0f) {
                oVar.setMedia(this.f23365M.m13455l());
            }
        } else if (f < 0.0f && f2 >= 0.0f) {
            oVar.setMedia(this.f23365M.m13454m());
        }
    }

    public void m16509z2(float f) {
        float f2 = this.f23381f0;
        if (f2 != f) {
            m16510y2(f, f2);
            setFactorImpl(f);
            m16549A2();
            invalidate();
        }
    }
}
