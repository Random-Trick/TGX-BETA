package p291uc;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import p037cb.C2057b;
import p108hb.C5064d;
import p364zd.C11524j;

public class C9686w3 extends View {
    public boolean f31466M;
    public final Drawable f31467N;
    public ValueAnimator f31468O;
    public float f31469P;
    public final int f31470a;
    public final int f31471b;
    public final float f31472c;

    public void m7594c(float f, float f2, ValueAnimator valueAnimator) {
        setFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m7593d(float f, ValueAnimator valueAnimator) {
        setFactor(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public boolean m7592e() {
        setValue(!this.f31466M);
        return this.f31466M;
    }

    public float getFactor() {
        return this.f31469P;
    }

    public boolean getIsSilent() {
        return this.f31466M;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int i;
        if (getVisibility() == 0) {
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            C1362c.m37487b(canvas, this.f31467N, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f31467N.getMinimumHeight() / 2), C1410y.m37068J());
            if (this.f31469P != 0.0f) {
                canvas.save();
                canvas.rotate(-45.0f, measuredWidth, measuredHeight);
                int i2 = C1357a0.m37541i(1.0f);
                float f = this.f31472c;
                float f2 = (int) (measuredWidth - i2);
                float f3 = ((int) (measuredHeight - (0.5f * f))) + i2;
                canvas.clipRect(f2, f3, this.f31470a + i + this.f31471b, (f * this.f31469P) + f3);
                RectF a0 = C1410y.m37050a0();
                a0.set(f2, f3, this.f31470a + i, this.f31472c + f3);
                int min = (int) (Math.min(1.0f, (this.f31472c * this.f31469P) / C1357a0.m37539k(8.0f)) * 255.0f);
                int i3 = this.f31470a;
                canvas.drawRoundRect(a0, i3 / 2, i3 / 2, C1410y.m37039g(min == 255 ? C11524j.m159q0() : C5064d.m24130b(min, C11524j.m159q0())));
                int i4 = this.f31470a;
                canvas.drawRect(i + i4, f3, i + i4 + this.f31471b, f3 + this.f31472c, C1410y.m37039g(C5064d.m24130b((int) (this.f31469P * 255.0f), C11524j.m148w())));
                canvas.restore();
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return getVisibility() == 0 && super.onTouchEvent(motionEvent);
    }

    public void setFactor(float f) {
        if (this.f31469P != f) {
            this.f31469P = f;
            invalidate();
        }
    }

    public void setValue(boolean z) {
        if (this.f31466M != z) {
            this.f31466M = z;
            final float factor = getFactor();
            ValueAnimator b = C2057b.m35734b();
            if (this.f31466M) {
                final float f = 1.0f - factor;
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C9686w3.this.m7594c(factor, f, valueAnimator);
                    }
                });
            } else {
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C9686w3.this.m7593d(factor, valueAnimator);
                    }
                });
            }
            b.setDuration(150L);
            b.setInterpolator(C2057b.f7280b);
            ValueAnimator valueAnimator = this.f31468O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f31468O = b;
            b.start();
        }
    }
}
