package me;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import p037cb.C2057b;
import p082fd.C4403w;
import p108hb.C5064d;
import p364zd.C11524j;

public class C7057w extends View {
    public final int f22391M;
    public final int f22395Q;
    public final RectF f22396R;
    public final Paint f22397S;
    public float f22399b;
    public int f22400c;
    public final int f22392N = C1357a0.m37544i(4.0f);
    public final int f22393O = C1357a0.m37544i(11.0f);
    public final int f22394P = C1357a0.m37544i(1.5f);
    public float f22398a = 1.0f;

    public C7057w(Context context) {
        super(context);
        int i = C1357a0.m37544i(2.0f);
        this.f22391M = i;
        int i2 = (int) (i * 0.5f);
        this.f22395Q = i2;
        Paint paint = new Paint(5);
        this.f22397S = paint;
        paint.setColor(C11524j.m233K0());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i);
        RectF rectF = new RectF();
        this.f22396R = rectF;
        rectF.left = i2;
        rectF.top = i2;
    }

    public void m17935c(float f, float f2, ValueAnimator valueAnimator) {
        setFactor(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m17934d(float f, ValueAnimator valueAnimator) {
        setFactor(f - (C2057b.m35738a(valueAnimator) * f));
    }

    public static C7057w m17932f(Context context) {
        return m17931g(context, C4403w.m27986G2());
    }

    public static C7057w m17931g(Context context, boolean z) {
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37544i(18.0f), C1357a0.m37544i(18.0f));
        s1.gravity = (z ? 3 : 5) | 16;
        int i = C1357a0.m37544i(19.0f);
        s1.rightMargin = i;
        s1.leftMargin = i;
        C7057w wVar = new C7057w(context);
        wVar.setLayoutParams(s1);
        return wVar;
    }

    public void m17933e(boolean z, boolean z2) {
        if (z && (this.f22400c & 1) != 0) {
            return;
        }
        if (z || (this.f22400c & 1) != 0) {
            if (z) {
                this.f22400c |= 1;
            } else {
                this.f22400c &= -2;
            }
            float f = 1.0f;
            if (!z2) {
                if (!z) {
                    f = 0.0f;
                }
                this.f22399b = f;
                invalidate();
                return;
            }
            final float factor = getFactor();
            ValueAnimator b = C2057b.m35737b();
            if (z) {
                final float f2 = 1.0f - factor;
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C7057w.this.m17935c(factor, f2, valueAnimator);
                    }
                });
            } else {
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C7057w.this.m17934d(factor, valueAnimator);
                    }
                });
            }
            b.setDuration(165L);
            b.setInterpolator(C2057b.f7280b);
            b.start();
        }
    }

    public float getFactor() {
        return this.f22399b;
    }

    public float getShowFactor() {
        return this.f22398a;
    }

    public boolean m17930h() {
        m17933e((this.f22400c & 1) == 0, true);
        return (this.f22400c & 1) != 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        float f = this.f22398a;
        if (f != 0.0f) {
            int i5 = (int) (f * 255.0f);
            float min = Math.min(this.f22399b / 0.65f, 1.0f);
            float f2 = this.f22399b;
            float f3 = f2 <= 0.65f ? 0.0f : (f2 - 0.65f) / 0.35000002f;
            float f4 = 1.0f - ((min == 1.0f ? 1.0f - f3 : min) * 0.15f);
            RectF rectF = this.f22396R;
            float f5 = (rectF.left + rectF.right) * 0.5f;
            float f6 = (rectF.top + rectF.bottom) * 0.5f;
            canvas.save();
            canvas.scale(f4, f4, f5, f6);
            int d = C5064d.m24129d(C11524j.m233K0(), C11524j.m235J0(), (this.f22400c & 4) != 0 ? 0.0f : min);
            this.f22397S.setColor(d);
            this.f22397S.setAlpha(i5);
            RectF rectF2 = this.f22396R;
            int i6 = this.f22391M;
            canvas.drawRoundRect(rectF2, i6, i6, this.f22397S);
            if (min != 0.0f) {
                RectF rectF3 = this.f22396R;
                float f7 = rectF3.right;
                float f8 = rectF3.left;
                int i7 = this.f22395Q;
                float f9 = (int) (((f7 - f8) - (i7 * 2)) * 0.5f * min);
                int i8 = (int) (f8 + i7 + f9);
                int i9 = (int) ((f7 - i7) - f9);
                int a = C5064d.m24132a(this.f22398a, d);
                RectF rectF4 = this.f22396R;
                float f10 = rectF4.left;
                int i10 = this.f22395Q;
                float f11 = i8;
                canvas.drawRect(f10 + i10, rectF4.top + i10, f11, rectF4.bottom - i10, C1410y.m37042g(a));
                float f12 = i9;
                RectF rectF5 = this.f22396R;
                float f13 = rectF5.top;
                int i11 = this.f22395Q;
                canvas.drawRect(f12, i11 + f13, rectF5.right - i11, rectF5.bottom - i11, C1410y.m37042g(a));
                float f14 = this.f22396R.top;
                int i12 = this.f22395Q;
                float f15 = (int) (((rectF3.bottom - rectF3.top) - (i7 * 2)) * 0.5f * min);
                canvas.drawRect(f11, i12 + f14, f12, f14 + i12 + f15, C1410y.m37042g(a));
                float f16 = this.f22396R.bottom;
                int i13 = this.f22395Q;
                canvas.drawRect(f11, (f16 - i13) - f15, f12, f16 - i13, C1410y.m37042g(a));
                if (f3 != 0.0f) {
                    canvas.translate(-C1357a0.m37544i(0.5f), 0.0f);
                    canvas.rotate(-45.0f, f5, f6);
                    int i14 = (int) (C1357a0.m37544i(12.0f) * f3);
                    int a2 = C5064d.m24132a(this.f22398a, C11524j.m237I0());
                    canvas.drawRect(this.f22392N, i2 - ((int) (C1357a0.m37544i(6.0f) * f3)), i + this.f22394P, this.f22393O, C1410y.m37042g(a2));
                    canvas.drawRect(this.f22392N, i4 - this.f22394P, i3 + i14, this.f22393O, C1410y.m37042g(a2));
                }
            }
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        RectF rectF = this.f22396R;
        int i3 = this.f22395Q;
        rectF.right = min - (i3 * 2);
        rectF.bottom = min - (i3 * 2);
    }

    public void setDisabled(boolean z) {
        if (z && (this.f22400c & 4) != 0) {
            return;
        }
        if (z || (this.f22400c & 4) != 0) {
            if (z) {
                this.f22400c |= 4;
            } else {
                this.f22400c &= -5;
            }
            invalidate();
        }
    }

    public void setFactor(float f) {
        if (this.f22399b != f) {
            this.f22399b = f;
            invalidate();
        }
    }

    public void setShowFactor(float f) {
        if (this.f22398a != f) {
            this.f22398a = f;
            invalidate();
        }
    }
}
