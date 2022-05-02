package td;

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
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1410y;
import ge.C4896n;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p082fd.C4403w;
import p108hb.C5069h;
import p139jb.AbstractC5911c;
import p335xd.AbstractC10190e;
import p335xd.C10189d;

public class C9290s0 extends View implements AbstractC5911c, C1357a0.AbstractC1358a {
    public Drawable f30060M;
    public Drawable f30061N;
    public int f30062O;
    public int f30063P;
    public float f30064Q;
    public float f30065R;
    public Drawable f30066S;
    public int f30067T;
    public float f30068U;
    public float f30069V;
    public float f30071a;
    public float f30074b0;
    public boolean f30075c;
    public float f30076c0;
    public boolean f30077d0;
    public Animator.AnimatorListener f30078e0;
    public boolean f30079f0;
    public float f30080g0;
    public float f30070W = -1.0f;
    public float f30072a0 = -1.0f;
    public float f30073b = -C4896n.m24476h();

    public class C9291a extends AnimatorListenerAdapter {
        public C9291a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!C9290s0.this.f30075c) {
                C9290s0.this.setTouchEnabled(false);
            }
        }
    }

    public C9290s0(Context context) {
        super(context);
        C10189d.m5800d(this, 56.0f, 4.0f, R.id.theme_color_headerButton, null);
        int i = C1357a0.m37544i(4.0f);
        int i2 = C1357a0.m37544i(56.0f);
        this.f30071a = (i2 * 0.5f) + i;
        int i3 = i2 + (i * 2);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(i3, i3, (C4403w.m27986G2() ? 3 : 5) | 48);
        t1.topMargin = (View$OnClickListenerC9170d1.m10088T2(true) - C1357a0.m37544i(30.0f)) - i;
        int i4 = C1357a0.m37544i(16.0f) - i;
        t1.leftMargin = i4;
        t1.rightMargin = i4;
        setLayoutParams(t1);
        C1357a0.m37552a(this);
        this.f30075c = true;
        setTranslationY(this.f30073b);
        setAlpha(0.0f);
        setScaleX(0.4f);
        setScaleY(0.4f);
    }

    public static void m9624d(Canvas canvas, int i, Drawable drawable, float f, float f2, Paint paint, float f3) {
        if (drawable != null) {
            boolean l = C1362c.m37480l(i);
            if (l) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, f, (drawable.getMinimumHeight() / 2) + f2);
            }
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (f3 * 255.0f));
            C1362c.m37490b(canvas, drawable, f - (drawable.getMinimumWidth() / 2), f2, paint);
            paint.setAlpha(alpha);
            if (l) {
                canvas.restore();
            }
        }
    }

    private Animator.AnimatorListener getHideListener() {
        if (this.f30078e0 == null) {
            this.f30078e0 = new C9291a();
        }
        return this.f30078e0;
    }

    public void m9620h(ValueAnimator valueAnimator) {
        setShowFactor(1.0f - C2057b.m35738a(valueAnimator));
    }

    public void m9619i(ValueAnimator valueAnimator) {
        setShowFactor(C2057b.m35738a(valueAnimator));
    }

    @Override
    public void mo4501a3() {
        C1357a0.m37531v(this);
    }

    public final float m9623e(int i, Drawable drawable) {
        if (i == 0 || drawable == null) {
            return 0.0f;
        }
        if (i != R.drawable.baseline_chat_bubble_24) {
            return this.f30071a - (drawable.getMinimumHeight() / 2);
        }
        return C1357a0.m37544i(17.0f) + C1357a0.m37544i(4.0f);
    }

    public void m9622f() {
        if (this.f30075c) {
            this.f30075c = false;
            this.f30080g0 = 1.0f;
            ValueAnimator b = C2057b.m35737b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9290s0.this.m9620h(valueAnimator);
                }
            });
            b.setInterpolator(C2057b.f7279a);
            b.setDuration(380L);
            b.addListener(getHideListener());
            b.start();
        }
    }

    public void m9621g(float f, float f2, float f3, boolean z, boolean z2) {
        this.f30074b0 = f;
        this.f30076c0 = f2;
        this.f30077d0 = z2;
        if (f2 == f) {
            setTranslationY((1.0f - f) * this.f30073b);
        } else {
            m9618j(f, f3, z);
        }
    }

    public float getShowFactor() {
        return this.f30080g0;
    }

    public void m9618j(float f, float f2, boolean z) {
        if (this.f30070W != f || this.f30072a0 != f2) {
            this.f30070W = f;
            this.f30072a0 = f2;
            if (this.f30077d0) {
                float f3 = 1.0f - f;
                setTranslationY((this.f30073b * f3) - ((C4896n.m24479e() * this.f30074b0) * f3));
            } else if (z || this.f30074b0 != this.f30076c0) {
                setTranslationY((1.0f - f) * this.f30073b);
            }
            boolean z2 = false;
            if (!z) {
                float d = C5069h.m24090d(f2);
                setAlpha(d);
                float f4 = (f2 * 0.6f) + 0.4f;
                setScaleX(f4);
                setScaleY(f4);
                if (d != 0.0f) {
                    z2 = true;
                }
                this.f30075c = z2;
                setTouchEnabled(z2);
            } else if (f == 0.0f) {
                if (this.f30075c) {
                    this.f30075c = false;
                    C1399s0.m37181i(this, 0.0f, 0.0f, 0.0f, 380L, C2057b.f7279a, getHideListener());
                }
            } else if (!this.f30075c) {
                this.f30075c = true;
                setTouchEnabled(true);
                C1399s0.m37181i(this, 1.0f, 1.0f, 1.0f, 380L, C2057b.f7279a, null);
            }
        }
    }

    public void m9617k(int i, int i2) {
        if (i == 0 || i2 == 0 || i == i2) {
            this.f30060M = null;
            this.f30062O = 0;
            this.f30061N = null;
            this.f30063P = 0;
            if (i != 0) {
                Drawable g = C1362c.m37485g(getResources(), i);
                this.f30066S = g;
                this.f30067T = i;
                this.f30068U = m9623e(i, g);
            } else {
                Drawable g2 = C1362c.m37485g(getResources(), i2);
                this.f30066S = g2;
                this.f30067T = i2;
                this.f30068U = m9623e(i2, g2);
            }
            invalidate();
            return;
        }
        this.f30066S = null;
        this.f30068U = 0.0f;
        this.f30067T = 0;
        Drawable g3 = C1362c.m37485g(getResources(), i);
        this.f30060M = g3;
        this.f30062O = i;
        this.f30064Q = m9623e(i, g3);
        Drawable g4 = C1362c.m37485g(getResources(), i2);
        this.f30061N = g4;
        this.f30063P = i2;
        this.f30065R = m9623e(i2, g4);
        setFactor(0.0f);
    }

    public void m9616l(AbstractC9323v4<?> v4Var) {
        int J9 = v4Var.mo9413J9();
        this.f30075c = true;
        setTouchEnabled(true);
        m9617k(0, J9);
        setTranslationY((1.0f - ((v4Var.mo8865M9() - C4896n.m24479e()) / C4896n.m24476h())) * this.f30073b);
        this.f30080g0 = 0.0f;
        ValueAnimator b = C2057b.m35737b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9290s0.this.m9619i(valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7279a);
        b.setDuration(380L);
        b.start();
    }

    public void m9615m(int i) {
        setTranslationY((1.0f - ((i - C4896n.m24479e()) / C4896n.m24476h())) * this.f30073b);
    }

    @Override
    public void mo9611n1(int i) {
        C1399s0.m37158t0(this, (View$OnClickListenerC9170d1.m10088T2(true) - C1357a0.m37544i(30.0f)) - C1357a0.m37544i(4.0f));
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f30066S;
        if (drawable != null) {
            m9624d(canvas, this.f30067T, drawable, this.f30071a, this.f30068U, C1410y.m37075G(), 1.0f);
        } else if (this.f30060M != null || this.f30061N != null) {
            Paint G = C1410y.m37075G();
            Drawable drawable2 = this.f30060M;
            if (drawable2 != null) {
                m9624d(canvas, this.f30062O, drawable2, this.f30071a, this.f30064Q, G, 1.0f - C5069h.m24090d(this.f30069V));
            }
            Drawable drawable3 = this.f30061N;
            if (drawable3 != null) {
                m9624d(canvas, this.f30063P, drawable3, this.f30071a, this.f30065R, G, C5069h.m24090d(this.f30069V));
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30079f0 && super.onTouchEvent(motionEvent);
    }

    public void setFactor(float f) {
        if (this.f30069V != f && this.f30060M != null && this.f30061N != null) {
            this.f30069V = f;
            invalidate();
        }
    }

    public void setShowFactor(float f) {
        if (this.f30080g0 != f) {
            this.f30080g0 = f;
            setAlpha(C5069h.m24090d(f));
            float f2 = (f * 0.6f) + 0.4f;
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    public void setTouchEnabled(boolean z) {
        int i;
        if (this.f30079f0 != z) {
            this.f30079f0 = z;
            setEnabled(z);
            if (z) {
                i = AbstractC10190e.f32935O ? 1 : 2;
            } else {
                i = 0;
            }
            C1399s0.m37186f0(this, i);
        }
    }
}
