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
    public Drawable f30057M;
    public Drawable f30058N;
    public int f30059O;
    public int f30060P;
    public float f30061Q;
    public float f30062R;
    public Drawable f30063S;
    public int f30064T;
    public float f30065U;
    public float f30066V;
    public float f30068a;
    public float f30071b0;
    public boolean f30072c;
    public float f30073c0;
    public boolean f30074d0;
    public Animator.AnimatorListener f30075e0;
    public boolean f30076f0;
    public float f30077g0;
    public float f30067W = -1.0f;
    public float f30069a0 = -1.0f;
    public float f30070b = -C4896n.m24475h();

    public class C9291a extends AnimatorListenerAdapter {
        public C9291a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!C9290s0.this.f30072c) {
                C9290s0.this.setTouchEnabled(false);
            }
        }
    }

    public C9290s0(Context context) {
        super(context);
        C10189d.m5800d(this, 56.0f, 4.0f, R.id.theme_color_headerButton, null);
        int i = C1357a0.m37541i(4.0f);
        int i2 = C1357a0.m37541i(56.0f);
        this.f30068a = (i2 * 0.5f) + i;
        int i3 = i2 + (i * 2);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(i3, i3, (C4403w.m27984G2() ? 3 : 5) | 48);
        t1.topMargin = (View$OnClickListenerC9170d1.m10089T2(true) - C1357a0.m37541i(30.0f)) - i;
        int i4 = C1357a0.m37541i(16.0f) - i;
        t1.leftMargin = i4;
        t1.rightMargin = i4;
        setLayoutParams(t1);
        C1357a0.m37549a(this);
        this.f30072c = true;
        setTranslationY(this.f30070b);
        setAlpha(0.0f);
        setScaleX(0.4f);
        setScaleY(0.4f);
    }

    public static void m9625d(Canvas canvas, int i, Drawable drawable, float f, float f2, Paint paint, float f3) {
        if (drawable != null) {
            boolean l = C1362c.m37477l(i);
            if (l) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, f, (drawable.getMinimumHeight() / 2) + f2);
            }
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (f3 * 255.0f));
            C1362c.m37487b(canvas, drawable, f - (drawable.getMinimumWidth() / 2), f2, paint);
            paint.setAlpha(alpha);
            if (l) {
                canvas.restore();
            }
        }
    }

    private Animator.AnimatorListener getHideListener() {
        if (this.f30075e0 == null) {
            this.f30075e0 = new C9291a();
        }
        return this.f30075e0;
    }

    public void m9621h(ValueAnimator valueAnimator) {
        setShowFactor(1.0f - C2057b.m35735a(valueAnimator));
    }

    public void m9620i(ValueAnimator valueAnimator) {
        setShowFactor(C2057b.m35735a(valueAnimator));
    }

    @Override
    public void mo4501a3() {
        C1357a0.m37528v(this);
    }

    public final float m9624e(int i, Drawable drawable) {
        if (i == 0 || drawable == null) {
            return 0.0f;
        }
        if (i != R.drawable.baseline_chat_bubble_24) {
            return this.f30068a - (drawable.getMinimumHeight() / 2);
        }
        return C1357a0.m37541i(17.0f) + C1357a0.m37541i(4.0f);
    }

    public void m9623f() {
        if (this.f30072c) {
            this.f30072c = false;
            this.f30077g0 = 1.0f;
            ValueAnimator b = C2057b.m35734b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9290s0.this.m9621h(valueAnimator);
                }
            });
            b.setInterpolator(C2057b.f7279a);
            b.setDuration(380L);
            b.addListener(getHideListener());
            b.start();
        }
    }

    public void m9622g(float f, float f2, float f3, boolean z, boolean z2) {
        this.f30071b0 = f;
        this.f30073c0 = f2;
        this.f30074d0 = z2;
        if (f2 == f) {
            setTranslationY((1.0f - f) * this.f30070b);
        } else {
            m9619j(f, f3, z);
        }
    }

    public float getShowFactor() {
        return this.f30077g0;
    }

    public void m9619j(float f, float f2, boolean z) {
        if (this.f30067W != f || this.f30069a0 != f2) {
            this.f30067W = f;
            this.f30069a0 = f2;
            if (this.f30074d0) {
                float f3 = 1.0f - f;
                setTranslationY((this.f30070b * f3) - ((C4896n.m24478e() * this.f30071b0) * f3));
            } else if (z || this.f30071b0 != this.f30073c0) {
                setTranslationY((1.0f - f) * this.f30070b);
            }
            boolean z2 = false;
            if (!z) {
                float d = C5069h.m24089d(f2);
                setAlpha(d);
                float f4 = (f2 * 0.6f) + 0.4f;
                setScaleX(f4);
                setScaleY(f4);
                if (d != 0.0f) {
                    z2 = true;
                }
                this.f30072c = z2;
                setTouchEnabled(z2);
            } else if (f == 0.0f) {
                if (this.f30072c) {
                    this.f30072c = false;
                    C1399s0.m37178i(this, 0.0f, 0.0f, 0.0f, 380L, C2057b.f7279a, getHideListener());
                }
            } else if (!this.f30072c) {
                this.f30072c = true;
                setTouchEnabled(true);
                C1399s0.m37178i(this, 1.0f, 1.0f, 1.0f, 380L, C2057b.f7279a, null);
            }
        }
    }

    public void m9618k(int i, int i2) {
        if (i == 0 || i2 == 0 || i == i2) {
            this.f30057M = null;
            this.f30059O = 0;
            this.f30058N = null;
            this.f30060P = 0;
            if (i != 0) {
                Drawable g = C1362c.m37482g(getResources(), i);
                this.f30063S = g;
                this.f30064T = i;
                this.f30065U = m9624e(i, g);
            } else {
                Drawable g2 = C1362c.m37482g(getResources(), i2);
                this.f30063S = g2;
                this.f30064T = i2;
                this.f30065U = m9624e(i2, g2);
            }
            invalidate();
            return;
        }
        this.f30063S = null;
        this.f30065U = 0.0f;
        this.f30064T = 0;
        Drawable g3 = C1362c.m37482g(getResources(), i);
        this.f30057M = g3;
        this.f30059O = i;
        this.f30061Q = m9624e(i, g3);
        Drawable g4 = C1362c.m37482g(getResources(), i2);
        this.f30058N = g4;
        this.f30060P = i2;
        this.f30062R = m9624e(i2, g4);
        setFactor(0.0f);
    }

    public void m9617l(AbstractC9323v4<?> v4Var) {
        int J9 = v4Var.mo9413J9();
        this.f30072c = true;
        setTouchEnabled(true);
        m9618k(0, J9);
        setTranslationY((1.0f - ((v4Var.mo8865M9() - C4896n.m24478e()) / C4896n.m24475h())) * this.f30070b);
        this.f30077g0 = 0.0f;
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9290s0.this.m9620i(valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7279a);
        b.setDuration(380L);
        b.start();
    }

    public void m9616m(int i) {
        setTranslationY((1.0f - ((i - C4896n.m24478e()) / C4896n.m24475h())) * this.f30070b);
    }

    @Override
    public void mo9612n1(int i) {
        C1399s0.m37155t0(this, (View$OnClickListenerC9170d1.m10089T2(true) - C1357a0.m37541i(30.0f)) - C1357a0.m37541i(4.0f));
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f30063S;
        if (drawable != null) {
            m9625d(canvas, this.f30064T, drawable, this.f30068a, this.f30065U, C1410y.m37072G(), 1.0f);
        } else if (this.f30057M != null || this.f30058N != null) {
            Paint G = C1410y.m37072G();
            Drawable drawable2 = this.f30057M;
            if (drawable2 != null) {
                m9625d(canvas, this.f30059O, drawable2, this.f30068a, this.f30061Q, G, 1.0f - C5069h.m24089d(this.f30066V));
            }
            Drawable drawable3 = this.f30058N;
            if (drawable3 != null) {
                m9625d(canvas, this.f30060P, drawable3, this.f30068a, this.f30062R, G, C5069h.m24089d(this.f30066V));
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30076f0 && super.onTouchEvent(motionEvent);
    }

    public void setFactor(float f) {
        if (this.f30066V != f && this.f30057M != null && this.f30058N != null) {
            this.f30066V = f;
            invalidate();
        }
    }

    public void setShowFactor(float f) {
        if (this.f30077g0 != f) {
            this.f30077g0 = f;
            setAlpha(C5069h.m24089d(f));
            float f2 = (f * 0.6f) + 0.4f;
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    public void setTouchEnabled(boolean z) {
        int i;
        if (this.f30076f0 != z) {
            this.f30076f0 = z;
            setEnabled(z);
            if (z) {
                i = AbstractC10190e.f32932O ? 1 : 2;
            } else {
                i = 0;
            }
            C1399s0.m37183f0(this, i);
        }
    }
}
