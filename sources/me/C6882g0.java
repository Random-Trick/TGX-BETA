package me;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import be.C1357a0;
import p037cb.C2057b;
import p082fd.C4403w;
import p364zd.C11524j;
import td.C9310u0;

public class C6882g0 extends C9310u0 {
    public final int f21642U;
    public final int f21643V;
    public final int f21644W;
    public final int f21645a0;
    public final Paint f21646b0;
    public int f21647c0;
    public int f21648d0;
    public int f21649e0;
    public boolean f21650f0;
    public ValueAnimator f21651g0;
    public float f21652h0;

    public C6882g0(Context context) {
        super(context);
        int i = C1357a0.m37541i(49.0f);
        this.f21642U = i;
        this.f21643V = (int) (i * 0.5f);
        int i2 = C1357a0.m37541i(12.0f);
        this.f21644W = i2;
        this.f21645a0 = (int) (i2 * 0.5f);
        Paint paint = new Paint(5);
        this.f21646b0 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(C1357a0.m37541i(2.0f));
        setLayoutParams(new LinearLayout.LayoutParams(i, -1));
    }

    public void m18687k(float f, float f2, ValueAnimator valueAnimator) {
        setFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m18686l(float f, ValueAnimator valueAnimator) {
        setFactor(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public float getFactor() {
        return this.f21652h0;
    }

    public void m18685m(boolean z, boolean z2) {
        if (this.f21650f0 != z) {
            this.f21650f0 = z;
            float f = 1.0f;
            if (!z2) {
                if (!z) {
                    f = 0.0f;
                }
                setFactor(f);
                return;
            }
            final float factor = getFactor();
            ValueAnimator b = C2057b.m35734b();
            if (z) {
                final float f2 = 1.0f - factor;
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C6882g0.this.m18687k(factor, f2, valueAnimator);
                    }
                });
            } else {
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C6882g0.this.m18686l(factor, valueAnimator);
                    }
                });
            }
            b.setInterpolator(C2057b.f7280b);
            b.setDuration(162L);
            ValueAnimator valueAnimator = this.f21651g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            b.start();
            this.f21651g0 = b;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i = this.f21647c0;
        if (i != 0) {
            this.f21646b0.setColor(C11524j.m228N(i));
        }
        if (this.f21652h0 > 0.0f && this.f21648d0 > 0) {
            canvas.save();
            canvas.rotate((C4403w.m27984G2() ? -90.0f : 90.0f) * (1.0f - this.f21652h0), this.f21643V, this.f21649e0);
            int i2 = (int) (this.f21644W * 0.5f * this.f21652h0);
            int i3 = this.f21643V;
            int i4 = this.f21649e0;
            canvas.drawLine(i3 - i2, i4 - i2, i3 + i2, i4 + i2, this.f21646b0);
            int i5 = this.f21643V;
            int i6 = this.f21649e0;
            canvas.drawLine(i5 + i2, i6 - i2, i5 - i2, i6 + i2, this.f21646b0);
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f21648d0 = getMeasuredHeight() - C1357a0.m37541i(1.0f);
        this.f21649e0 = C1357a0.m37541i(1.0f) + (this.f21648d0 / 2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21652h0 == 1.0f && super.onTouchEvent(motionEvent);
    }

    public void setColorId(int i) {
        this.f21647c0 = i;
    }

    public void setFactor(float f) {
        if (this.f21652h0 != f) {
            this.f21652h0 = f;
            if (f >= 0.0f) {
                invalidate();
            }
        }
    }

    public void setInProgress(boolean z) {
    }
}
