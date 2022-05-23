package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c;
import ce.j0;
import ce.p0;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import eb.l;
import gb.h;
import ib.d;
import ne.m2;

public class u0 extends View {
    public int M;
    public float N = -1.0f;
    public a O;
    public int P;
    public int Q;
    public f R;
    public m2 S;
    public float T;
    public Drawable f24472a;
    public int f24473b;
    public int f24474c;

    public interface a {
        void a(u0 u0Var, MotionEvent motionEvent);
    }

    public u0(Context context) {
        super(context);
        p0.T(this);
    }

    public static boolean b(View view) {
        return view == null || (view.getVisibility() == 0 && view.getAlpha() > 0.0f);
    }

    public void d(int i10, float f10, float f11, k kVar) {
        if (this.T != f10) {
            this.T = f10;
            invalidate();
        }
    }

    public final int c(int i10) {
        int i11 = this.f24474c;
        if (i11 == 0) {
            return i10;
        }
        if (this.N != -1.0f) {
            return d.d(j.L(i11), j.L(this.M), this.N);
        }
        return j.L(i11);
    }

    public void e(boolean z10, float f10) {
        if (this.R == null) {
            if (z10) {
                this.R = new f(0, new k.b() {
                    @Override
                    public final void n4(int i10, float f11, float f12, k kVar) {
                        u0.this.d(i10, f11, f12, kVar);
                    }

                    @Override
                    public void o4(int i10, float f11, k kVar) {
                        l.a(this, i10, f11, kVar);
                    }
                }, b.f7287b, 180L);
            } else {
                return;
            }
        }
        if (this.S == null) {
            m2 m2Var = new m2(j0.r(getContext()), a0.i(15.0f));
            this.S = m2Var;
            if (f10 >= 0.0f) {
                m2Var.v(f10, false);
                this.S.r();
            }
            this.S.d(d.a(this.T, c(j.F0())));
            this.S.C(a0.i(2.5f));
            this.S.p(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.S.D();
            this.S.E(new h(this));
        }
        this.R.p(z10, true);
    }

    public u0 f(float f10) {
        float f11 = this.N;
        if (!(f11 == f10 || f11 == -1.0f)) {
            this.N = f10;
            invalidate();
        }
        return this;
    }

    public u0 g(int i10) {
        this.f24474c = i10;
        this.N = -1.0f;
        invalidate();
        return this;
    }

    public Drawable getDrawable() {
        return this.f24472a;
    }

    public u0 h(int i10, int i11, float f10) {
        this.f24474c = i10;
        this.M = i11;
        this.N = f10;
        invalidate();
        return this;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        m2 m2Var;
        float f10 = this.T;
        if (f10 > 0.0f && (m2Var = this.S) != null) {
            m2Var.d(d.a(f10, c(j.F0())));
            this.S.c(canvas);
        }
        if (this.f24472a != null) {
            if (this.f24474c == 0) {
                paint = y.j();
            } else {
                paint = y.W(c(0));
            }
            boolean l10 = c.l(this.f24473b);
            if (l10) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
            float f11 = ((1.0f - this.T) * 0.2f) + 0.8f;
            int i10 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            if (i10 != 0) {
                canvas.save();
                canvas.scale(f11, f11, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
            c.b(canvas, this.f24472a, (getMeasuredWidth() / 2) - (this.f24472a.getMinimumWidth() / 2), (getMeasuredHeight() / 2) - (this.f24472a.getMinimumHeight() / 2), paint);
            if (i10 != 0) {
                canvas.restore();
            }
            if (l10) {
                canvas.restore();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m2 m2Var = this.S;
        if (m2Var != null) {
            m2Var.p(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !b(this)) {
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.O != null && motionEvent.getAction() == 0) {
            this.O.a(this, motionEvent);
        }
        return onTouchEvent;
    }

    public void setButtonBackground(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            setBackgroundResource(i10);
        }
    }

    public void setCurrentProgress(float f10) {
        m2 m2Var = this.S;
        if (m2Var != null) {
            m2Var.v(f10, this.T > 0.0f);
        }
    }

    public void setImageResource(int i10) {
        if (this.P != i10) {
            this.P = i10;
            boolean z10 = this.f24472a != null;
            this.f24472a = i10 != 0 ? c.g(getResources(), i10) : null;
            this.f24473b = i10;
            if (z10) {
                invalidate();
            }
        }
    }

    public void setTouchDownListener(a aVar) {
        this.O = aVar;
    }
}
