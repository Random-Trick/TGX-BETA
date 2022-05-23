package vc;

import ae.j;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c;
import ce.y;
import db.b;
import ib.d;

public class v3 extends View {
    public boolean M;
    public final Drawable N;
    public ValueAnimator O;
    public float P;
    public final int f25296a;
    public final int f25297b;
    public final float f25298c;

    public void c(float f10, float f11, ValueAnimator valueAnimator) {
        setFactor(f10 + (f11 * b.a(valueAnimator)));
    }

    public void d(float f10, ValueAnimator valueAnimator) {
        setFactor(f10 - (b.a(valueAnimator) * f10));
    }

    public boolean e() {
        setValue(!this.M);
        return this.M;
    }

    public float getFactor() {
        return this.P;
    }

    public boolean getIsSilent() {
        return this.M;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        if (getVisibility() == 0) {
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            c.b(canvas, this.N, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.N.getMinimumHeight() / 2), y.J());
            if (this.P != 0.0f) {
                canvas.save();
                canvas.rotate(-45.0f, measuredWidth, measuredHeight);
                int i11 = a0.i(1.0f);
                float f10 = this.f25298c;
                float f11 = (int) (measuredWidth - i11);
                float f12 = ((int) (measuredHeight - (0.5f * f10))) + i11;
                canvas.clipRect(f11, f12, this.f25296a + i10 + this.f25297b, (f10 * this.P) + f12);
                RectF a02 = y.a0();
                a02.set(f11, f12, this.f25296a + i10, this.f25298c + f12);
                int min = (int) (Math.min(1.0f, (this.f25298c * this.P) / a0.k(8.0f)) * 255.0f);
                int i12 = this.f25296a;
                canvas.drawRoundRect(a02, i12 / 2, i12 / 2, y.g(min == 255 ? j.o0() : d.b(min, j.o0())));
                int i13 = this.f25296a;
                canvas.drawRect(i10 + i13, f12, i10 + i13 + this.f25297b, f12 + this.f25298c, y.g(d.b((int) (this.P * 255.0f), j.u())));
                canvas.restore();
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return getVisibility() == 0 && super.onTouchEvent(motionEvent);
    }

    public void setFactor(float f10) {
        if (this.P != f10) {
            this.P = f10;
            invalidate();
        }
    }

    public void setValue(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            final float factor = getFactor();
            ValueAnimator b10 = b.b();
            if (this.M) {
                final float f10 = 1.0f - factor;
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        v3.this.c(factor, f10, valueAnimator);
                    }
                });
            } else {
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        v3.this.d(factor, valueAnimator);
                    }
                });
            }
            b10.setDuration(150L);
            b10.setInterpolator(b.f7287b);
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.O = b10;
            b10.start();
        }
    }
}
