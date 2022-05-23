package zc;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.y;
import gd.w;
import he.i;
import ib.d;
import ie.i0;
import java.util.ArrayList;
import java.util.Iterator;
import oc.v0;
import org.thunderdog.challegram.R;
import ud.d1;

public class c extends View {
    public int M;
    public String N;
    public b O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public Drawable V;
    public float W;
    public boolean f27149a;
    public float f27150a0;
    public int f27151b = j0.z();
    public ArrayList<g> f27152b0;
    public int f27153c;
    public e[] f27154c0;
    public float f27155d0;
    public g f27156e0;
    public i0 f27157f0;
    public float f27158g0;
    public boolean f27159h0;
    public l f27160i0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            c.this.e(false);
            g.l(1.0f);
            c.this.f27159h0 = false;
            c.this.invalidate();
        }
    }

    public interface b {
        String L2();

        void Q();

        void z1(i0 i0Var);

        boolean z2();
    }

    public c(Context context) {
        super(context);
    }

    private float getTextLeft() {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        int i10 = this.M;
        if ((i10 == 1 || i10 == 3 || i10 == 4 || i10 == 5) && this.f27151b == 2) {
            measuredWidth *= 0.5f;
        }
        return measuredWidth - (this.R * 0.5f);
    }

    private float getTextTop() {
        float k10;
        int paddingTop;
        int i10 = this.M;
        if (i10 == 1) {
            k10 = a0.k(91.0f);
            paddingTop = getPaddingTop();
        } else if (i10 == 2) {
            k10 = a0.k(123.0f);
            paddingTop = getPaddingTop();
        } else if (i10 != 3) {
            if (i10 != 4 && i10 != 5) {
                return 0.0f;
            }
            if (this.f27151b == 1) {
                k10 = a0.k(83.0f);
                paddingTop = getPaddingTop();
            } else {
                k10 = ((a0.e() - d1.a3(false)) - getPaddingTop()) * 0.5f;
                paddingTop = getPaddingTop();
            }
        } else if (this.f27151b == 1) {
            k10 = a0.k(147.0f);
            paddingTop = getPaddingTop();
        } else {
            k10 = ((a0.e() - d1.a3(false)) - getPaddingTop()) * 0.5f;
            paddingTop = getPaddingTop();
        }
        return k10 + paddingTop;
    }

    public void i(ValueAnimator valueAnimator) {
        setPatternFactor(db.b.a(valueAnimator));
    }

    public final void c(int i10, boolean z10) {
        i0 i0Var = this.f27157f0;
        if (i0Var != null) {
            if (!z10 && i0Var.e() > 0) {
                e eVar = this.f27154c0[this.f27157f0.d()];
                e eVar2 = this.f27154c0[i10];
                p(eVar.d() + ((eVar2.d() - eVar.d()) * 0.5f), eVar.e() + ((eVar2.e() - eVar.e()) * 0.5f), true);
                g gVar = new g(eVar.d(), eVar.e(), this.f27156e0.i(), this.f27156e0.j());
                gVar.p(this);
                gVar.r(eVar2.d(), eVar2.e());
                this.f27152b0.add(gVar);
            }
            this.f27157f0.a(i10);
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth != 0) {
            this.P = getTextLeft();
            l();
            k();
            j(measuredWidth, getMeasuredHeight());
        }
    }

    public void e(boolean z10) {
        this.f27149a = false;
        if (!z10) {
            i0 i0Var = this.f27157f0;
            if (i0Var != null) {
                i0Var.b();
                this.f27152b0.clear();
                for (e eVar : this.f27154c0) {
                    eVar.i(false);
                }
                return;
            }
            return;
        }
        this.f27158g0 = 0.0f;
        this.f27159h0 = true;
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.this.i(valueAnimator);
            }
        });
        b10.setInterpolator(db.b.f7287b);
        b10.setDuration(160L);
        b10.addListener(new a());
        b10.start();
    }

    public final void f(Canvas canvas) {
        for (e eVar : this.f27154c0) {
            eVar.b(canvas);
        }
        if (this.O.z2()) {
            Iterator<g> it = this.f27152b0.iterator();
            while (it.hasNext()) {
                it.next().h(canvas);
            }
            if (this.f27149a || this.f27159h0) {
                this.f27156e0.h(canvas);
            }
        }
    }

    public final void g(Canvas canvas) {
        this.f27160i0.l(canvas);
    }

    public b getCallback() {
        return this.O;
    }

    public l getPincodeOutput() {
        return this.f27160i0;
    }

    public int getState() {
        return this.f27153c;
    }

    public String getText() {
        return this.N;
    }

    public boolean h() {
        return this.f27149a;
    }

    public final void j(int i10, int i11) {
        int i12 = this.M;
        if (i12 == 1) {
            n();
        } else if (i12 == 3) {
            m(i10, i11);
        }
    }

    public void k() {
        Drawable drawable = this.V;
        if (drawable != null) {
            this.W = (this.P + (this.R * 0.5f)) - (drawable.getMinimumWidth() * 0.5f);
            this.f27150a0 = Math.max((this.Q * 0.5f) - (this.V.getMinimumHeight() * 0.5f), a0.i(40.0f));
        }
    }

    public final void l() {
        int i10 = this.M;
        if (i10 == 1) {
            this.S = j0.N() ? a0.k(20.0f) : (a0.g() - (a0.i(106.0f) * 3)) / 2;
            this.T = a0.k(148.0f);
        } else if (i10 != 2) {
            this.T = -1.0f;
        } else {
            this.S = a0.k(44.0f);
            this.T = a0.k(170.0f);
        }
        float f10 = this.T;
        if (f10 != -1.0f) {
            this.T = f10 + getPaddingTop();
            this.U = ((this.M == 1 && this.f27151b == 2) ? getMeasuredWidth() * 0.5f : getMeasuredWidth()) - this.S;
        }
    }

    public final void m(int i10, int i11) {
        float f10;
        float f11;
        if (this.f27154c0 == null) {
            this.f27157f0 = new i0();
            this.f27156e0 = new g(0.0f, 0.0f, 0.0f, 0.0f);
            this.f27152b0 = new ArrayList<>();
            this.f27154c0 = new e[]{new e(this), new e(this), new e(this), new e(this), new e(this), new e(this), new e(this), new e(this), new e(this)};
        }
        float k10 = a0.k(102.0f);
        float k11 = a0.k(72.0f);
        if (this.f27151b == 2) {
            f11 = a0.i(12.0f);
            f10 = f11;
        } else {
            f11 = a0.k(206.0f);
            f10 = a0.k(88.0f);
        }
        this.f27155d0 = a0.k(26.0f);
        float f12 = k10 * 2.0f;
        float f13 = (k11 * 2.0f) + f12;
        float f14 = f12 + f11 + f10;
        float f15 = i10;
        float f16 = f13 != f15 ? f15 / f13 : 1.0f;
        float f17 = i11;
        if (f14 != f17) {
            f16 = Math.min(f16, f17 / f14);
        }
        if (f16 != 1.0f) {
            if (f16 < 1.0f) {
                k10 *= f16;
                this.f27155d0 = Math.max(a0.k(12.0f), this.f27155d0 * f16);
                f12 = k10 * 2.0f;
                f11 *= f16;
            }
            if (this.f27151b == 1) {
                k11 = (f15 - f12) * 0.5f;
            } else {
                f11 = (f17 - f12) * 0.5f;
            }
        }
        if (this.f27151b == 2) {
            k11 = (f15 - f12) - k11;
        } else {
            f11 += getPaddingTop();
        }
        float f18 = k11;
        int i12 = 0;
        for (e eVar : this.f27154c0) {
            eVar.j(f18, f11);
            i12++;
            if (i12 % 3 == 0) {
                f11 += k10;
                f18 = k11;
            } else {
                f18 += k10;
            }
        }
    }

    public final void n() {
        if (this.f27160i0 == null) {
            l lVar = new l();
            this.f27160i0 = lVar;
            lVar.w(this);
        }
        this.f27160i0.x(this.S, (this.T - a0.i(52.0f)) - 1.0f, this.U, this.T - 1.0f);
    }

    public final boolean o(MotionEvent motionEvent) {
        if (this.f27159h0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f27156e0.q(x10, y10);
            e(false);
            if (p(x10, y10, false)) {
                this.f27149a = true;
                return true;
            }
        } else if (action != 1) {
            if (action == 2 && this.f27149a) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                this.f27156e0.q(x11, y11);
                if (!p(x11, y11, false)) {
                    invalidate();
                }
                return true;
            }
        } else if (this.f27149a) {
            b bVar = this.O;
            if (bVar != null) {
                bVar.z1(new i0(this.f27157f0));
            }
            e(true);
            invalidate();
            return true;
        }
        return false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10 = this.T;
        if (f10 != -1.0f) {
            canvas.drawRect(this.S, f10, this.U, f10 + a0.i(1.0f), y.g(d.a(0.3f, j.L(R.id.theme_color_passcodeText))));
        }
        int i10 = this.M;
        if (i10 == 1) {
            g(canvas);
        } else if (i10 == 3) {
            f(canvas);
        }
        String str = this.N;
        if (str != null) {
            canvas.drawText(str, this.P, this.Q, y.c0(13.0f, j.D0()));
        }
        Drawable drawable = this.V;
        if (drawable != null) {
            ce.c.b(canvas, drawable, this.W, this.f27150a0, y.S());
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            d();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.M != 3) {
            return super.onTouchEvent(motionEvent);
        }
        return o(motionEvent);
    }

    public final boolean p(float f10, float f11, boolean z10) {
        e[] eVarArr;
        int i10 = 0;
        for (e eVar : this.f27154c0) {
            if (eVar.f(f10, f11, this.f27155d0)) {
                eVar.i(true);
                c(i10, z10);
                if (!z10) {
                    this.f27156e0.n(f10, f11);
                    this.f27156e0.o(eVar.d(), eVar.e());
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    public void q() {
        this.V = ce.c.j(R.drawable.deproko_logo_telegram_passcode_56);
    }

    public void r(int i10, int i11) {
        if (this.M != i10) {
            this.f27153c = i11;
            setMode(i10);
            return;
        }
        setState(i11);
    }

    public final void s() {
        int t12 = i.c2().t1(this.O.L2());
        if (t12 > 0) {
            this.N = w.j1(R.string.format_PasscodeTooManyAttempts, w.o2(R.string.TryAgainSeconds, t12));
        } else {
            this.N = he.d.n(this.M, this.f27153c);
        }
        if (this.N != null) {
            if (this.f27153c == 3 && he.d.c(this.M) && !this.O.z2()) {
                this.N = w.j1(R.string.passcode_confirm_invisible, this.N);
            }
            this.R = v0.T1(this.N, y.b0(13.0f));
            this.Q = getTextTop();
            this.P = getTextLeft();
        }
    }

    public void setCallback(b bVar) {
        this.O = bVar;
    }

    public void setMode(int i10) {
        if (this.M != i10) {
            this.M = i10;
            s();
            l();
            d();
            invalidate();
        }
    }

    public void setOrientation(int i10) {
        this.f27151b = i10;
        int i11 = this.M;
        if (i11 == 1) {
            n();
        } else if (i11 == 3) {
            this.Q = getTextTop();
            e(false);
        } else if (i11 == 4 || i11 == 5) {
            this.Q = getTextTop();
        }
    }

    public void setPatternFactor(float f10) {
        if (this.f27158g0 != f10) {
            this.f27158g0 = f10;
            g.l(1.0f - f10);
            invalidate();
        }
    }

    public void setState(int i10) {
        if (this.f27153c != i10) {
            this.f27153c = i10;
            s();
            invalidate();
            if (i10 == 3) {
                this.O.Q();
            }
        }
    }

    public void t() {
        s();
        invalidate();
    }
}
