package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Outline;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import bd.a;
import bd.o;
import ce.a0;
import ce.j0;
import hd.i;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.j2;
import org.thunderdog.challegram.Log;
import ud.v4;
import zd.ya;

public class s extends c implements o.b, a.AbstractC0060a {
    public static boolean f4176m0 = false;
    public bd.a R;
    public int S;
    public String T;
    public p U;
    public o V;
    public boolean W;
    public boolean f4177a0;
    public float f4178b0;
    public float f4179c0;
    public p f4180d0;
    public float f4181e0;
    public float f4182f0;
    public boolean f4183g0;
    public boolean f4184h0;
    public boolean f4185i0;
    public boolean f4186j0;
    public boolean f4187k0;
    public boolean f4188l0;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, s.this.U.getMeasuredWidth(), s.this.U.getMeasuredHeight());
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final float f4190a;

        public b(float f10) {
            this.f4190a = f10;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (this.f4190a != 0.0f) {
                s.this.D1(false);
            } else {
                s.this.U.B1();
                s.this.d2();
            }
            s.this.f4183g0 = false;
        }
    }

    public s(Context context, v4<?> v4Var) {
        super(context, v4Var);
        if (f4176m0) {
            j0.i0(this);
        }
        this.R = new bd.a(context, this);
        this.S = a0.i(20.0f);
    }

    public void Y1(float f10, float f11, ValueAnimator valueAnimator) {
        setCloseFactor(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void Z1() {
        requestLayout();
    }

    @Override
    public void B0(j2 j2Var) {
        if (this.T != null) {
            ya.o1().w2().W0(16, true);
            this.U.D1(this.T);
        }
    }

    @Override
    public boolean B1() {
        i iVar = this.M;
        if (iVar.f13075e == 0 || iVar.f13076f == 0) {
            return false;
        }
        C1(a0.g());
        return true;
    }

    @Override
    public int C1(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: bd.s.C1(int):int");
    }

    @Override
    public void D1(boolean z10) {
        if (!z10 || !this.f4177a0) {
            this.Q.s2(z10);
            return;
        }
        b1();
        X1(1.0f, 0.0f);
    }

    @Override
    public void G0() {
        p pVar = this.U;
        if (pVar != null) {
            pVar.B1();
        }
    }

    @Override
    public void G1() {
        p pVar = this.f4180d0;
        if (pVar != null) {
            pVar.E1();
            this.f4180d0 = null;
        }
    }

    @Override
    public void H() {
        p pVar = this.U;
        if (pVar != null && pVar.getPlayer() != null && this.U.C1() && this.V != null) {
            org.thunderdog.challegram.a aVar = (org.thunderdog.challegram.a) getContext();
            if (this.f4188l0) {
                c2();
            }
            aVar.m2(this.Q);
            this.Q.setHideBackground(true);
            this.Q.setDisableCancelOnTouchDown(true);
            setFooterVisibility(8);
            o oVar = this.V;
            this.f4177a0 = true;
            oVar.setMinimized(true);
            C1(getMeasuredWidth());
            this.U.setElevation(a0.i(3.0f));
            this.U.setTranslationZ(a0.i(1.0f));
            this.U.setOutlineProvider(new a());
            this.U.requestLayout();
        }
    }

    @Override
    public boolean H1(String str) {
        String d10 = f.d(str);
        if (d10 == null || !d10.equals(this.T)) {
            return false;
        }
        i();
        return true;
    }

    @Override
    public boolean I1(i iVar) {
        String d10 = f.d(iVar.f13072b);
        this.T = d10;
        if (!ib.i.i(d10)) {
            ya.o1().w2().W0(16, true);
            o oVar = new o(getContext());
            this.V = oVar;
            oVar.setCanMinimize(this.O.c().Ve());
            this.V.setCallback(this);
            this.V.setLayoutParams(FrameLayoutFix.r1(-1, -2, 48));
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, -2, 80);
            r12.bottomMargin = this.N;
            p pVar = new p(getContext());
            this.U = pVar;
            if (f4176m0) {
                j0.i0(pVar);
            }
            this.U.setControls(this.V);
            this.U.setParentLayout(this);
            this.U.setLayoutParams(r12);
            addView(this.U);
            this.U.addView(this.V);
        }
        return super.I1(iVar);
    }

    @Override
    public void U(boolean z10) {
        org.thunderdog.challegram.a r10 = j0.r(getContext());
        if (this.f4188l0 && r10 != null) {
            r10.v3(!z10 ? 1 : 0, false);
        }
    }

    public final void X1(float f10, float f11) {
        if (!this.f4183g0 && this.f4184h0) {
            this.f4183g0 = true;
            this.f4184h0 = false;
            final float closeFactor = getCloseFactor();
            final float f12 = f10 - closeFactor;
            ValueAnimator b10 = db.b.b();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    s.this.Y1(closeFactor, f12, valueAnimator);
                }
            });
            b10.setDuration(f11 == 0.0f ? 200L : f10 == 1.0f ? 160L : 120L);
            b10.setInterpolator(db.b.f7287b);
            b10.addListener(new b(f10));
            b10.start();
        }
    }

    @Override
    public void a() {
        p pVar = this.U;
        if (pVar != null) {
            pVar.K1();
        }
    }

    public final void a2(boolean z10) {
        org.thunderdog.challegram.a r10 = j0.r(getContext());
        if (z10) {
            r10.setRequestedOrientation(6);
            r10.v3(1, false);
            return;
        }
        r10.setRequestedOrientation(-1);
        r10.v3(0, false);
    }

    @Override
    public void b1() {
        this.f4184h0 = true;
        this.f4185i0 = false;
        f2();
        this.U.K1();
    }

    public final void c2() {
        a2(false);
    }

    @Override
    public void d0() {
        try {
            p pVar = this.U;
            if (!(pVar == null || pVar.getPlayer() == null || !this.U.C1())) {
                if (this.U.getPlayer().l()) {
                    this.U.getPlayer().b();
                } else {
                    this.U.getPlayer().g();
                }
            }
        } catch (Throwable th) {
            Log.w("YouTube onPlayPause", th, new Object[0]);
        }
    }

    public final void d2() {
        if (this.f4186j0) {
            this.f4186j0 = false;
            p pVar = this.U;
            if (pVar != null && pVar.getPlayer() != null) {
                this.U.getPlayer().g();
            }
        }
    }

    public final void f2() {
        p pVar;
        if (!this.f4186j0 && (pVar = this.U) != null && pVar.getPlayer() != null && this.U.getPlayer().l()) {
            this.f4186j0 = true;
            this.U.getPlayer().b();
        }
    }

    public float getCloseFactor() {
        return this.f4181e0;
    }

    @Override
    public int getPreviewHeight() {
        return a0.e();
    }

    @Override
    public void h(int i10) {
        p pVar = this.U;
        if (pVar != null) {
            pVar.H1(i10);
        }
    }

    @Override
    public void i() {
        if (this.V != null && !this.f4183g0) {
            j0.r(getContext()).M1(this.Q);
            this.Q.setHideBackground(false);
            this.Q.setDisableCancelOnTouchDown(false);
            if (this.f4188l0) {
                a2(true);
            }
            setFooterVisibility(0);
            o oVar = this.V;
            this.f4177a0 = false;
            oVar.setMinimized(false);
            C1(getMeasuredWidth());
            this.U.setElevation(0.0f);
            this.U.setTranslationZ(0.0f);
            this.U.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            this.U.requestLayout();
        }
    }

    @Override
    public void n1(boolean z10) {
        p pVar = this.U;
        if (pVar != null && pVar.getPlayer() != null && this.U.C1()) {
            this.V.setFullscreen(z10);
            this.f4188l0 = z10;
            if (!z10) {
                this.f4187k0 = he.i.c2().X2(4L);
            }
            a2(z10);
            post(new Runnable() {
                @Override
                public final void run() {
                    s.this.Z1();
                }
            });
        }
    }

    @Override
    public boolean n7(float f10, float f11) {
        if (!this.f4184h0 || this.f4183g0) {
            return false;
        }
        float abs = Math.abs(f10);
        if (abs <= Math.abs(f11)) {
            return false;
        }
        float f12 = 1.0f;
        if (abs <= a0.j(350.0f, 1.0f)) {
            return false;
        }
        if (f10 <= 0.0f) {
            f12 = -1.0f;
        }
        X1(f12, abs);
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4184h0 || this.f4183g0) {
            return true;
        }
        this.R.a(motionEvent);
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4184h0) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        this.R.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1) {
            float f10 = this.f4181e0;
            X1(f10 >= 0.5f ? 1.0f : f10 <= -0.5f ? -1.0f : 0.0f, 0.0f);
        } else if (action == 2) {
            float x10 = motionEvent.getX();
            if (!this.f4185i0) {
                this.f4185i0 = true;
                this.f4182f0 = x10;
            }
            setCloseFactor((x10 - this.f4182f0) / this.f4178b0);
        } else if (action == 3) {
            X1(0.0f, 0.0f);
        }
        return true;
    }

    public void setCloseFactor(float f10) {
        if (this.f4181e0 != f10) {
            this.f4181e0 = f10;
            p pVar = this.U;
            if (pVar != null) {
                pVar.setTranslationX(this.f4179c0 + (this.f4178b0 * f10));
                this.U.setAlpha(1.0f - Math.abs(f10));
            }
        }
    }

    @Override
    public void w(j2 j2Var) {
        if (this.f4188l0) {
            n1(false);
        }
        ya.o1().w2().W0(16, false);
        p pVar = this.U;
        if (pVar != null) {
            pVar.G1();
            this.f4180d0 = this.U;
            this.U = null;
        }
    }

    @Override
    public boolean w0() {
        return this.f4184h0 && this.f4186j0;
    }
}
