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
    public boolean f31469M;
    public final Drawable f31470N;
    public ValueAnimator f31471O;
    public float f31472P;
    public final int f31473a;
    public final int f31474b;
    public final float f31475c;

    public void m7594c(float f, float f2, ValueAnimator valueAnimator) {
        setFactor(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m7593d(float f, ValueAnimator valueAnimator) {
        setFactor(f - (C2057b.m35738a(valueAnimator) * f));
    }

    public boolean m7592e() {
        setValue(!this.f31469M);
        return this.f31469M;
    }

    public float getFactor() {
        return this.f31472P;
    }

    public boolean getIsSilent() {
        return this.f31469M;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int i;
        if (getVisibility() == 0) {
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            C1362c.m37490b(canvas, this.f31470N, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f31470N.getMinimumHeight() / 2), C1410y.m37071J());
            if (this.f31472P != 0.0f) {
                canvas.save();
                canvas.rotate(-45.0f, measuredWidth, measuredHeight);
                int i2 = C1357a0.m37544i(1.0f);
                float f = this.f31475c;
                float f2 = (int) (measuredWidth - i2);
                float f3 = ((int) (measuredHeight - (0.5f * f))) + i2;
                canvas.clipRect(f2, f3, this.f31473a + i + this.f31474b, (f * this.f31472P) + f3);
                RectF a0 = C1410y.m37053a0();
                a0.set(f2, f3, this.f31473a + i, this.f31475c + f3);
                int min = (int) (Math.min(1.0f, (this.f31475c * this.f31472P) / C1357a0.m37542k(8.0f)) * 255.0f);
                int i3 = this.f31473a;
                canvas.drawRoundRect(a0, i3 / 2, i3 / 2, C1410y.m37042g(min == 255 ? C11524j.m159q0() : C5064d.m24131b(min, C11524j.m159q0())));
                int i4 = this.f31473a;
                canvas.drawRect(i + i4, f3, i + i4 + this.f31474b, f3 + this.f31475c, C1410y.m37042g(C5064d.m24131b((int) (this.f31472P * 255.0f), C11524j.m148w())));
                canvas.restore();
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return getVisibility() == 0 && super.onTouchEvent(motionEvent);
    }

    public void setFactor(float f) {
        if (this.f31472P != f) {
            this.f31472P = f;
            invalidate();
        }
    }

    public void setValue(boolean z) {
        if (this.f31469M != z) {
            this.f31469M = z;
            final float factor = getFactor();
            ValueAnimator b = C2057b.m35737b();
            if (this.f31469M) {
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
            ValueAnimator valueAnimator = this.f31471O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f31471O = b;
            b.start();
        }
    }
}
