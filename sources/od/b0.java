package od;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import eb.k;
import gd.w;
import ld.v;
import me.vkryl.android.widget.FrameLayoutFix;
import od.o;

public class b0 extends FrameLayoutFix {
    public qd.c M;
    public o N;
    public o O;
    public t P;
    public j1 Q;
    public boolean R;
    public boolean S;
    public b T;
    public o U;
    public l1 V;
    public int W;
    public int f19468a0;
    public int f19469b0;
    public int f19470c0;
    public int f19471d0;
    public boolean f19472e0;
    public float f19473f0;
    public c f19474g0;
    public boolean f19475h0;
    public ValueAnimator f19476i0;
    public boolean f19477j0;
    public float f19478k0;
    public boolean f19479l0;
    public float f19480m0;
    public float f19481n0;
    public boolean f19482o0;
    public boolean f19483p0;
    public float f19484q0;
    public float f19485r0;
    public boolean f19486s0;
    public boolean f19487t0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (b0.this.f19473f0 != 0.0f) {
                b0.this.E1();
            }
            b0.this.f19475h0 = false;
            if (b0.this.f19473f0 == 0.0f && b0.this.O != null) {
                b0.this.O.setMedia(null);
            }
        }
    }

    public interface b {
        void x4(b0 b0Var, float f10, float f11);
    }

    public interface c {
        void X3(b0 b0Var, float f10);
    }

    public b0(Context context) {
        super(context);
    }

    public void g2(float f10, float f11, ValueAnimator valueAnimator) {
        u2(f10 + (f11 * db.b.a(valueAnimator)));
    }

    private void setFactorImpl(float f10) {
        if (this.f19473f0 != f10) {
            this.f19473f0 = f10;
            c cVar = this.f19474g0;
            if (cVar != null) {
                cVar.X3(this, f10);
            }
        }
    }

    public final boolean E1() {
        float f10 = this.f19473f0;
        if (f10 <= -0.5f) {
            if (!this.M.o()) {
                return false;
            }
            this.M.b();
            setFactorImpl(this.f19473f0 + 1.0f);
        } else if (f10 < 0.5f || !this.M.n()) {
            return false;
        } else {
            this.M.a();
            setFactorImpl(this.f19473f0 - 1.0f);
        }
        o oVar = this.N;
        this.N = this.O;
        this.O = oVar;
        v2();
        invalidate();
        return true;
    }

    public void G1(boolean z10) {
        this.N.Y(z10);
    }

    public final void H1(boolean z10) {
        this.f19472e0 = true;
        this.N.getDetector().m(z10);
        o oVar = this.O;
        if (oVar != null) {
            oVar.getDetector().w();
        }
        R1();
        h2();
    }

    public boolean I1() {
        return !this.f19487t0;
    }

    public boolean K1(o oVar) {
        j1 j1Var = this.Q;
        return j1Var == null || j1Var.ti() != 3 || this.Q.Qg();
    }

    public boolean L1(o oVar) {
        return this.N == oVar && this.f19473f0 == 0.0f;
    }

    public void O1() {
        j1 j1Var = this.Q;
        if (j1Var != null) {
            j1Var.ck();
        }
    }

    public final void P1() {
        if (this.f19483p0) {
            S1(0, 0.0f);
        }
        this.f19482o0 = false;
        this.f19483p0 = false;
    }

    public final void R1() {
        this.f19477j0 = true;
    }

    public void S1(int r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: od.b0.S1(int, float):void");
    }

    public o T1(qd.b bVar) {
        o oVar = this.N;
        if (oVar != null && oVar.getMedia() == bVar) {
            return this.N;
        }
        o oVar2 = this.O;
        if (oVar2 == null || oVar2.getMedia() != bVar) {
            return null;
        }
        return this.O;
    }

    public boolean V1() {
        return !X1() && this.M.n();
    }

    public boolean W1() {
        return !X1() && this.M.o();
    }

    public boolean X1() {
        return this.R;
    }

    public void Y1(qd.c cVar) {
        this.M = cVar;
        this.N.setFactor(0.0f);
        this.N.setMedia(cVar.g());
    }

    public boolean Z1() {
        return this.N.l0();
    }

    public boolean a2() {
        return this.f19483p0;
    }

    public void b0() {
        this.N.h0();
        o oVar = this.O;
        if (oVar != null) {
            oVar.h0();
        }
    }

    public boolean c2() {
        j1 j1Var = this.Q;
        return j1Var != null && j1Var.Zi();
    }

    public boolean d2() {
        return this.f19473f0 == 0.0f;
    }

    public boolean f2(boolean z10) {
        j1 j1Var;
        return !this.S && ((j1Var = this.Q) == null || j1Var.Pg(z10));
    }

    public int getActualImageHeight() {
        return (getMeasuredHeight() - this.f19469b0) - this.f19470c0;
    }

    public int getActualImageWidth() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f19471d0;
        return (measuredWidth - i10) - i10;
    }

    public o getBaseCell() {
        return this.N;
    }

    public v getBaseReceiver() {
        return this.N.getReceiver();
    }

    public int getBottomAdd() {
        j1 j1Var = this.Q;
        if (j1Var == null || !j1Var.S9() || this.Q.x9().f19673b != 3) {
            return 0;
        }
        return this.Q.ji();
    }

    public float getCurrentZoom() {
        return this.N.getDetector().k();
    }

    public float getFactor() {
        return this.f19473f0;
    }

    public int getOffsetBottom() {
        return this.f19470c0;
    }

    public int getOffsetHorizontal() {
        return this.f19471d0;
    }

    public int getOffsetTop() {
        return this.f19469b0;
    }

    public void h2() {
        int bottomAdd = this.f19468a0 + getBottomAdd();
        this.N.t0(this.f19471d0, this.f19469b0, this.f19470c0, this.W, bottomAdd);
        o oVar = this.O;
        if (oVar != null) {
            oVar.t0(this.f19471d0, this.f19469b0, this.f19470c0, this.W, bottomAdd);
        }
    }

    public void i2() {
        this.N.z0();
        o oVar = this.O;
        if (oVar != null) {
            oVar.z0();
        }
    }

    public void j2() {
        this.N.A0();
        o oVar = this.O;
        if (oVar != null) {
            oVar.A0();
        }
    }

    public void k2(float f10, float f11) {
        j1 j1Var = this.Q;
        if (j1Var != null) {
            j1Var.ak(this, f10, f11);
        }
    }

    public void l2() {
        this.N.B0();
        o oVar = this.O;
        if (oVar != null) {
            oVar.B0();
        }
    }

    public void m2(boolean z10) {
        this.N = new o(getContext());
        if (z10) {
            o oVar = new o(getContext());
            this.O = oVar;
            oVar.setFactor(-1.0f);
            addView(this.O);
        }
        addView(this.N);
        if (z10) {
            t tVar = new t(getContext());
            this.P = tVar;
            tVar.b(this);
        }
        setWillNotDraw(false);
    }

    public void n2(float f10) {
        this.N.E0(f10);
        o oVar = this.O;
        if (oVar != null) {
            oVar.E0(f10);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N.X();
        o oVar = this.O;
        if (oVar != null) {
            oVar.X();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N.i0();
        o oVar = this.O;
        if (oVar != null) {
            oVar.i0();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (this.f19479l0 || this.R || this.S || this.P == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19480m0 = motionEvent.getX();
            this.f19481n0 = motionEvent.getY();
            s2();
            y2(this.f19480m0);
            if (!this.f19483p0 && motionEvent.getPointerCount() == 1) {
                z10 = true;
            }
            this.f19482o0 = z10;
            if (!this.f19483p0) {
                this.P.a(motionEvent);
            }
        } else if (action == 2 && this.f19482o0 && Math.abs(motionEvent.getX() - this.f19480m0) > a0.q() && Math.abs(motionEvent.getY() - this.f19481n0) < a0.q()) {
            this.f19482o0 = false;
            this.f19478k0 = motionEvent.getX();
            this.f19483p0 = true;
        }
        return this.f19483p0;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = this.W == size;
        if (this.f19468a0 != size2 || !z10) {
            this.W = size;
            this.f19468a0 = size2;
            H1(z10);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == null) {
            return false;
        }
        if (this.S) {
            if (this.T != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f19484q0 = motionEvent.getX();
                    this.f19485r0 = motionEvent.getY();
                    this.f19486s0 = true;
                } else if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f19486s0 = false;
                        }
                    } else if (this.f19486s0 && Math.max(Math.abs(motionEvent.getX() - this.f19484q0), Math.abs(motionEvent.getY() - this.f19485r0)) > a0.p()) {
                        this.f19486s0 = false;
                    }
                } else if (this.f19486s0) {
                    this.f19486s0 = false;
                    playSoundEffect(0);
                    this.T.x4(this, motionEvent.getX(), motionEvent.getY());
                }
                return this.f19486s0;
            }
            P1();
            return false;
        } else if (motionEvent.getPointerCount() > 1 || this.R) {
            P1();
            return true;
        } else {
            boolean a10 = this.P.a(motionEvent);
            float x10 = motionEvent.getX();
            int action2 = motionEvent.getAction();
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 == 3 && this.f19483p0) {
                        S1(0, 0.0f);
                        this.f19483p0 = false;
                    }
                } else if (this.f19483p0) {
                    float f10 = ((x10 - this.f19478k0) / this.W) * (w.G2() ? 1.0f : -1.0f);
                    if ((f10 > 0.0f && !this.M.n()) || (f10 < 0.0f && !this.M.o())) {
                        f10 *= 0.5f;
                    }
                    u2(f10);
                }
            } else if (a10) {
                this.f19483p0 = false;
            } else if (this.f19483p0) {
                S1(0, 0.0f);
                this.f19483p0 = false;
            }
            return true;
        }
    }

    public void p2(int i10, int i11, int i12) {
        if (this.f19471d0 != i10 || this.f19469b0 != i11 || this.f19470c0 != i12) {
            this.f19469b0 = i11;
            this.f19470c0 = i12;
            this.f19471d0 = i10;
            if (this.f19472e0) {
                this.N.I0(i10, i11, i12);
                o oVar = this.O;
                if (oVar != null) {
                    oVar.I0(i10, i11, i12);
                }
            }
        }
    }

    public void r2(l1 l1Var, float f10) {
        this.V = l1Var;
        o oVar = this.N;
        this.U = oVar;
        oVar.setTargetLocation(l1Var);
        this.U.setRevealFactor(f10);
        this.U.setDisappearing(f10 == 1.0f);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        this.f19479l0 = z10;
        P1();
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void s2() {
        if (this.f19475h0) {
            this.f19475h0 = false;
            this.f19476i0.cancel();
        }
    }

    public void setBoundController(j1 j1Var) {
        this.Q = j1Var;
    }

    public void setButStillNeedClick(b bVar) {
        if (this.T != bVar) {
            this.T = bVar;
            this.f19486s0 = false;
        }
    }

    public void setCellCallback(o.b bVar) {
        this.N.setCallback(bVar);
        o oVar = this.O;
        if (oVar != null) {
            oVar.setCallback(bVar);
        }
    }

    public void setDisableAnimations(boolean z10) {
        this.N.setDisableAnimations(z10);
        o oVar = this.O;
        if (oVar != null) {
            oVar.setDisableAnimations(z10);
        }
    }

    public void setDisableDoubleTapZoom(boolean z10) {
        this.f19487t0 = z10;
    }

    public void setDisableTouch(boolean z10) {
        this.S = z10;
    }

    public void setDisallowMove(boolean z10) {
        this.R = z10;
    }

    public void setFactorChangeListener(c cVar) {
        this.f19474g0 = cVar;
    }

    public void setOffsetBottom(int i10) {
        p2(this.f19471d0, this.f19469b0, i10);
    }

    public void setOffsetHorizontal(int i10) {
        if (this.f19471d0 != i10) {
            p2(i10, this.f19469b0, this.f19470c0);
        }
    }

    public void setPendingOpenAnimator(k kVar) {
        this.U.setTargetAnimator(kVar);
    }

    public void setRevealFactor(float f10) {
        this.U.setRevealFactor(f10);
    }

    public void setSeekProgress(float f10) {
        this.N.setSeekProgress(f10);
        o oVar = this.O;
        if (oVar != null) {
            oVar.setSeekProgress(f10);
        }
    }

    public void t2(float f10, float f11) {
        o oVar = this.O;
        if (oVar == null) {
            return;
        }
        if (f10 > 0.0f) {
            if (f11 <= 0.0f) {
                oVar.setMedia(this.M.l());
            }
        } else if (f10 < 0.0f && f11 >= 0.0f) {
            oVar.setMedia(this.M.m());
        }
    }

    public void u2(float f10) {
        float f11 = this.f19473f0;
        if (f11 != f10) {
            t2(f10, f11);
            setFactorImpl(f10);
            v2();
            invalidate();
        }
    }

    public final void v2() {
        float f10 = this.f19473f0;
        if (f10 == 0.0f || this.O == null) {
            this.N.setFactor(0.0f);
            o oVar = this.O;
            if (oVar != null) {
                oVar.setFactor(-1.0f);
            }
            if (indexOfChild(this.N) != 1) {
                bringChildToFront(this.N);
            }
        } else if (f10 < 0.0f) {
            this.N.setFactor(f10);
            this.O.setFactor(this.f19473f0 + 1.0f);
            if (indexOfChild(this.O) != 1) {
                bringChildToFront(this.O);
            }
        } else {
            this.N.setFactor(f10);
            this.O.setFactor(this.f19473f0 - 1.0f);
            if (indexOfChild(this.N) != 1) {
                bringChildToFront(this.N);
            }
        }
    }

    public final void y2(float f10) {
        float f11 = this.f19473f0;
        if (f11 == 0.0f) {
            this.f19478k0 = f10;
            this.f19483p0 = false;
            return;
        }
        this.f19478k0 = f10 + (this.W * f11 * (w.G2() ? -1.0f : 1.0f));
        this.f19483p0 = true;
    }
}
