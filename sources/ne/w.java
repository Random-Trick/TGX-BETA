package ne;

import ae.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import ce.a0;
import ce.y;
import db.b;
import ib.d;
import me.vkryl.android.widget.FrameLayoutFix;

public class w extends View {
    public final int M;
    public final int Q;
    public final RectF R;
    public final Paint S;
    public float f18413b;
    public int f18414c;
    public final int N = a0.i(4.0f);
    public final int O = a0.i(11.0f);
    public final int P = a0.i(1.5f);
    public float f18412a = 1.0f;

    public w(Context context) {
        super(context);
        int i10 = a0.i(2.0f);
        this.M = i10;
        int i11 = (int) (i10 * 0.5f);
        this.Q = i11;
        Paint paint = new Paint(5);
        this.S = paint;
        paint.setColor(j.I0());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i10);
        RectF rectF = new RectF();
        this.R = rectF;
        rectF.left = i11;
        rectF.top = i11;
    }

    public void c(float f10, float f11, ValueAnimator valueAnimator) {
        setFactor(f10 + (f11 * b.a(valueAnimator)));
    }

    public void d(float f10, ValueAnimator valueAnimator) {
        setFactor(f10 - (b.a(valueAnimator) * f10));
    }

    public static w f(Context context) {
        return g(context, gd.w.G2());
    }

    public static w g(Context context, boolean z10) {
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(18.0f), a0.i(18.0f));
        q12.gravity = (z10 ? 3 : 5) | 16;
        int i10 = a0.i(19.0f);
        q12.rightMargin = i10;
        q12.leftMargin = i10;
        w wVar = new w(context);
        wVar.setLayoutParams(q12);
        return wVar;
    }

    public void e(boolean z10, boolean z11) {
        if (z10 && (this.f18414c & 1) != 0) {
            return;
        }
        if (z10 || (this.f18414c & 1) != 0) {
            if (z10) {
                this.f18414c |= 1;
            } else {
                this.f18414c &= -2;
            }
            float f10 = 1.0f;
            if (!z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                this.f18413b = f10;
                invalidate();
                return;
            }
            final float factor = getFactor();
            ValueAnimator b10 = b.b();
            if (z10) {
                final float f11 = 1.0f - factor;
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        w.this.c(factor, f11, valueAnimator);
                    }
                });
            } else {
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        w.this.d(factor, valueAnimator);
                    }
                });
            }
            b10.setDuration(165L);
            b10.setInterpolator(b.f7287b);
            b10.start();
        }
    }

    public float getFactor() {
        return this.f18413b;
    }

    public float getShowFactor() {
        return this.f18412a;
    }

    public boolean h() {
        e((this.f18414c & 1) == 0, true);
        return (this.f18414c & 1) != 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = this.f18412a;
        if (f10 != 0.0f) {
            int i14 = (int) (f10 * 255.0f);
            float min = Math.min(this.f18413b / 0.65f, 1.0f);
            float f11 = this.f18413b;
            float f12 = f11 <= 0.65f ? 0.0f : (f11 - 0.65f) / 0.35000002f;
            float f13 = 1.0f - ((min == 1.0f ? 1.0f - f12 : min) * 0.15f);
            RectF rectF = this.R;
            float f14 = (rectF.left + rectF.right) * 0.5f;
            float f15 = (rectF.top + rectF.bottom) * 0.5f;
            canvas.save();
            canvas.scale(f13, f13, f14, f15);
            int d10 = d.d(j.I0(), j.H0(), (this.f18414c & 4) != 0 ? 0.0f : min);
            this.S.setColor(d10);
            this.S.setAlpha(i14);
            RectF rectF2 = this.R;
            int i15 = this.M;
            canvas.drawRoundRect(rectF2, i15, i15, this.S);
            if (min != 0.0f) {
                RectF rectF3 = this.R;
                float f16 = rectF3.right;
                float f17 = rectF3.left;
                int i16 = this.Q;
                float f18 = (int) (((f16 - f17) - (i16 * 2)) * 0.5f * min);
                int i17 = (int) (f17 + i16 + f18);
                int i18 = (int) ((f16 - i16) - f18);
                int a10 = d.a(this.f18412a, d10);
                RectF rectF4 = this.R;
                float f19 = rectF4.left;
                int i19 = this.Q;
                float f20 = i17;
                canvas.drawRect(f19 + i19, rectF4.top + i19, f20, rectF4.bottom - i19, y.g(a10));
                float f21 = i18;
                RectF rectF5 = this.R;
                float f22 = rectF5.top;
                int i20 = this.Q;
                canvas.drawRect(f21, i20 + f22, rectF5.right - i20, rectF5.bottom - i20, y.g(a10));
                float f23 = this.R.top;
                int i21 = this.Q;
                float f24 = (int) (((rectF3.bottom - rectF3.top) - (i16 * 2)) * 0.5f * min);
                canvas.drawRect(f20, i21 + f23, f21, f23 + i21 + f24, y.g(a10));
                float f25 = this.R.bottom;
                int i22 = this.Q;
                canvas.drawRect(f20, (f25 - i22) - f24, f21, f25 - i22, y.g(a10));
                if (f12 != 0.0f) {
                    canvas.translate(-a0.i(0.5f), 0.0f);
                    canvas.rotate(-45.0f, f14, f15);
                    int i23 = (int) (a0.i(12.0f) * f12);
                    int a11 = d.a(this.f18412a, j.G0());
                    canvas.drawRect(this.N, i11 - ((int) (a0.i(6.0f) * f12)), i10 + this.P, this.O, y.g(a11));
                    canvas.drawRect(this.N, i13 - this.P, i12 + i23, this.O, y.g(a11));
                }
            }
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        RectF rectF = this.R;
        int i12 = this.Q;
        rectF.right = min - (i12 * 2);
        rectF.bottom = min - (i12 * 2);
    }

    public void setDisabled(boolean z10) {
        if (z10 && (this.f18414c & 4) != 0) {
            return;
        }
        if (z10 || (this.f18414c & 4) != 0) {
            if (z10) {
                this.f18414c |= 4;
            } else {
                this.f18414c &= -5;
            }
            invalidate();
        }
    }

    public void setFactor(float f10) {
        if (this.f18413b != f10) {
            this.f18413b = f10;
            invalidate();
        }
    }

    public void setShowFactor(float f10) {
        if (this.f18412a != f10) {
            this.f18412a = f10;
            invalidate();
        }
    }
}
