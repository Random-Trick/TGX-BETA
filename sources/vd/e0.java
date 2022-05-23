package vd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.y;
import db.b;
import eb.k;
import ib.d;
import ne.m2;

public class e0 extends View implements k.b {
    public k M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public g0 f25450a;
    public m2 f25451b;
    public boolean f25452c;

    public e0(Context context) {
        super(context);
    }

    public void a() {
        if (this.f25451b == null) {
            m2 m2Var = new m2(j0.r(getContext()), a0.i(6.0f));
            this.f25451b = m2Var;
            m2Var.C(a0.i(2.0f));
            this.f25451b.r();
            this.f25451b.d(-1);
            this.f25451b.o(0.0f);
            this.f25451b.a(this);
            this.f25451b.p(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void b(g0 g0Var) {
        this.f25450a = g0Var;
    }

    public void c(float f10) {
        m2 m2Var = this.f25451b;
        if (m2Var != null) {
            m2Var.v(f10, true);
        }
    }

    public final void d(float f10) {
        if (this.N != f10) {
            this.N = f10;
            this.f25451b.o(f10);
            invalidate();
        }
    }

    public void e(boolean z10) {
        if (this.f25452c != z10) {
            this.f25452c = z10;
            a();
            boolean z11 = true;
            if (z10) {
                this.f25451b.v(0.0f, true);
            }
            float f10 = z10 ? 1.0f : 0.0f;
            if (getAlpha() == 0.0f || getParent() == null || ((View) getParent()).getAlpha() == 0.0f) {
                z11 = false;
            }
            if (z11) {
                if (this.M == null) {
                    float f11 = this.N;
                    if (f11 != f10) {
                        this.M = new k(0, this, b.f7287b, 180L, f11);
                    } else {
                        return;
                    }
                }
                this.M.i(f10);
                return;
            }
            k kVar = this.M;
            if (kVar != null) {
                kVar.l(f10);
            }
            d(f10);
        }
    }

    public void f(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            float f11 = this.P;
            if (((int) (this.R * f11)) != ((int) (f11 * f10))) {
                invalidate();
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        d(f10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        g0 g0Var = this.f25450a;
        float b12 = g0Var != null ? g0Var.b1() : this.Q;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (b12 != 0.0f) {
            RectF a02 = y.a0();
            float i11 = a0.i(1.5f);
            a02.set(i11, i11, measuredWidth - i10, measuredHeight - i10);
            canvas.drawArc(a02, -90.0f, (360.0f - this.O) * b12, false, y.E0());
        }
        if (this.f25451b != null) {
            canvas.drawCircle(measuredWidth / 2, measuredHeight / 2, a0.i(12.0f), y.g(d.a(this.f25451b.e(), 1140850688)));
            this.f25451b.c(canvas);
        }
        this.R = b12;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        double strokeWidth = y.E0().getStrokeWidth();
        double measuredWidth = (int) ((getMeasuredWidth() / 2) * 6.283185307179586d);
        this.P = (float) (measuredWidth - strokeWidth);
        this.O = ((float) (strokeWidth / measuredWidth)) * 360.0f;
        m2 m2Var = this.f25451b;
        if (m2Var != null) {
            m2Var.p(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
