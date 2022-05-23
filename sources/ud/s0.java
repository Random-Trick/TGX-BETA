package ud;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import ce.a0;
import ce.p0;
import ce.y;
import db.b;
import gd.w;
import he.n;
import ib.h;
import kb.c;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import yd.d;
import yd.e;

public class s0 extends View implements c, a0.a {
    public Drawable M;
    public Drawable N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public Drawable S;
    public int T;
    public float U;
    public float V;
    public float f24424a;
    public float f24427b0;
    public boolean f24428c;
    public float f24429c0;
    public boolean f24430d0;
    public Animator.AnimatorListener f24431e0;
    public boolean f24432f0;
    public float f24433g0;
    public float W = -1.0f;
    public float f24425a0 = -1.0f;
    public float f24426b = -n.h();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!s0.this.f24428c) {
                s0.this.setTouchEnabled(false);
            }
        }
    }

    public s0(Context context) {
        super(context);
        d.d(this, 56.0f, 4.0f, R.id.theme_color_headerButton, null);
        int i10 = a0.i(4.0f);
        int i11 = a0.i(56.0f);
        this.f24424a = (i11 * 0.5f) + i10;
        int i12 = i11 + (i10 * 2);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(i12, i12, (w.G2() ? 3 : 5) | 48);
        r12.topMargin = (d1.R2(true) - a0.i(30.0f)) - i10;
        int i13 = a0.i(16.0f) - i10;
        r12.leftMargin = i13;
        r12.rightMargin = i13;
        setLayoutParams(r12);
        a0.a(this);
        this.f24428c = true;
        setTranslationY(this.f24426b);
        setAlpha(0.0f);
        setScaleX(0.4f);
        setScaleY(0.4f);
    }

    public static void d(Canvas canvas, int i10, Drawable drawable, float f10, float f11, Paint paint, float f12) {
        if (drawable != null) {
            boolean l10 = ce.c.l(i10);
            if (l10) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, f10, (drawable.getMinimumHeight() / 2) + f11);
            }
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (f12 * 255.0f));
            ce.c.b(canvas, drawable, f10 - (drawable.getMinimumWidth() / 2), f11, paint);
            paint.setAlpha(alpha);
            if (l10) {
                canvas.restore();
            }
        }
    }

    private Animator.AnimatorListener getHideListener() {
        if (this.f24431e0 == null) {
            this.f24431e0 = new a();
        }
        return this.f24431e0;
    }

    public void h(ValueAnimator valueAnimator) {
        setShowFactor(1.0f - b.a(valueAnimator));
    }

    public void i(ValueAnimator valueAnimator) {
        setShowFactor(b.a(valueAnimator));
    }

    @Override
    public void Q2() {
        a0.v(this);
    }

    public final float e(int i10, Drawable drawable) {
        if (i10 == 0 || drawable == null) {
            return 0.0f;
        }
        if (i10 != R.drawable.baseline_chat_bubble_24) {
            return this.f24424a - (drawable.getMinimumHeight() / 2);
        }
        return a0.i(17.0f) + a0.i(4.0f);
    }

    public void f() {
        if (this.f24428c) {
            this.f24428c = false;
            this.f24433g0 = 1.0f;
            ValueAnimator b10 = b.b();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    s0.this.h(valueAnimator);
                }
            });
            b10.setInterpolator(b.f7286a);
            b10.setDuration(380L);
            b10.addListener(getHideListener());
            b10.start();
        }
    }

    public void g(float f10, float f11, float f12, boolean z10, boolean z11) {
        this.f24427b0 = f10;
        this.f24429c0 = f11;
        this.f24430d0 = z11;
        if (f11 == f10) {
            setTranslationY((1.0f - f10) * this.f24426b);
        } else {
            j(f10, f12, z10);
        }
    }

    public float getShowFactor() {
        return this.f24433g0;
    }

    public void j(float f10, float f11, boolean z10) {
        if (this.W != f10 || this.f24425a0 != f11) {
            this.W = f10;
            this.f24425a0 = f11;
            if (this.f24430d0) {
                float f12 = 1.0f - f10;
                setTranslationY((this.f24426b * f12) - ((n.e() * this.f24427b0) * f12));
            } else if (z10 || this.f24427b0 != this.f24429c0) {
                setTranslationY((1.0f - f10) * this.f24426b);
            }
            boolean z11 = false;
            if (!z10) {
                float d10 = h.d(f11);
                setAlpha(d10);
                float f13 = (f11 * 0.6f) + 0.4f;
                setScaleX(f13);
                setScaleY(f13);
                if (d10 != 0.0f) {
                    z11 = true;
                }
                this.f24428c = z11;
                setTouchEnabled(z11);
            } else if (f10 == 0.0f) {
                if (this.f24428c) {
                    this.f24428c = false;
                    p0.f(this, 0.0f, 0.0f, 0.0f, 380L, b.f7286a, getHideListener());
                }
            } else if (!this.f24428c) {
                this.f24428c = true;
                setTouchEnabled(true);
                p0.f(this, 1.0f, 1.0f, 1.0f, 380L, b.f7286a, null);
            }
        }
    }

    public void k(int i10, int i11) {
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            this.M = null;
            this.O = 0;
            this.N = null;
            this.P = 0;
            if (i10 != 0) {
                Drawable g10 = ce.c.g(getResources(), i10);
                this.S = g10;
                this.T = i10;
                this.U = e(i10, g10);
            } else {
                Drawable g11 = ce.c.g(getResources(), i11);
                this.S = g11;
                this.T = i11;
                this.U = e(i11, g11);
            }
            invalidate();
            return;
        }
        this.S = null;
        this.U = 0.0f;
        this.T = 0;
        Drawable g12 = ce.c.g(getResources(), i10);
        this.M = g12;
        this.O = i10;
        this.Q = e(i10, g12);
        Drawable g13 = ce.c.g(getResources(), i11);
        this.N = g13;
        this.P = i11;
        this.R = e(i11, g13);
        setFactor(0.0f);
    }

    @Override
    public void k1(int i10) {
        p0.m0(this, (d1.R2(true) - a0.i(30.0f)) - a0.i(4.0f));
    }

    public void l(v4<?> v4Var) {
        int J9 = v4Var.J9();
        this.f24428c = true;
        setTouchEnabled(true);
        k(0, J9);
        setTranslationY((1.0f - ((v4Var.M9() - n.e()) / n.h())) * this.f24426b);
        this.f24433g0 = 0.0f;
        ValueAnimator b10 = b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s0.this.i(valueAnimator);
            }
        });
        b10.setInterpolator(b.f7286a);
        b10.setDuration(380L);
        b10.start();
    }

    public void m(int i10) {
        setTranslationY((1.0f - ((i10 - n.e()) / n.h())) * this.f24426b);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.S;
        if (drawable != null) {
            d(canvas, this.T, drawable, this.f24424a, this.U, y.G(), 1.0f);
        } else if (this.M != null || this.N != null) {
            Paint G = y.G();
            Drawable drawable2 = this.M;
            if (drawable2 != null) {
                d(canvas, this.O, drawable2, this.f24424a, this.Q, G, 1.0f - h.d(this.V));
            }
            Drawable drawable3 = this.N;
            if (drawable3 != null) {
                d(canvas, this.P, drawable3, this.f24424a, this.R, G, h.d(this.V));
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f24432f0 && super.onTouchEvent(motionEvent);
    }

    public void setFactor(float f10) {
        if (this.V != f10 && this.M != null && this.N != null) {
            this.V = f10;
            invalidate();
        }
    }

    public void setShowFactor(float f10) {
        if (this.f24433g0 != f10) {
            this.f24433g0 = f10;
            setAlpha(h.d(f10));
            float f11 = (f10 * 0.6f) + 0.4f;
            setScaleX(f11);
            setScaleY(f11);
        }
    }

    public void setTouchEnabled(boolean z10) {
        int i10;
        if (this.f24432f0 != z10) {
            this.f24432f0 = z10;
            setEnabled(z10);
            if (z10) {
                i10 = e.O ? 1 : 2;
            } else {
                i10 = 0;
            }
            p0.Y(this, i10);
        }
    }
}
