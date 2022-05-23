package ne;

import ae.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import ce.a0;
import db.b;
import gd.w;
import ud.u0;

public class g0 extends u0 {
    public final int U;
    public final int V;
    public final int W;
    public final int f18023a0;
    public final Paint f18024b0;
    public int f18025c0;
    public int f18026d0;
    public int f18027e0;
    public boolean f18028f0;
    public ValueAnimator f18029g0;
    public float f18030h0;

    public g0(Context context) {
        super(context);
        int i10 = a0.i(49.0f);
        this.U = i10;
        this.V = (int) (i10 * 0.5f);
        int i11 = a0.i(12.0f);
        this.W = i11;
        this.f18023a0 = (int) (i11 * 0.5f);
        Paint paint = new Paint(5);
        this.f18024b0 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(a0.i(2.0f));
        setLayoutParams(new LinearLayout.LayoutParams(i10, -1));
    }

    public void k(float f10, float f11, ValueAnimator valueAnimator) {
        setFactor(f10 + (f11 * b.a(valueAnimator)));
    }

    public void l(float f10, ValueAnimator valueAnimator) {
        setFactor(f10 - (b.a(valueAnimator) * f10));
    }

    public float getFactor() {
        return this.f18030h0;
    }

    public void m(boolean z10, boolean z11) {
        if (this.f18028f0 != z10) {
            this.f18028f0 = z10;
            float f10 = 1.0f;
            if (!z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                setFactor(f10);
                return;
            }
            final float factor = getFactor();
            ValueAnimator b10 = b.b();
            if (z10) {
                final float f11 = 1.0f - factor;
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        g0.this.k(factor, f11, valueAnimator);
                    }
                });
            } else {
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        g0.this.l(factor, valueAnimator);
                    }
                });
            }
            b10.setInterpolator(b.f7287b);
            b10.setDuration(162L);
            ValueAnimator valueAnimator = this.f18029g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            b10.start();
            this.f18029g0 = b10;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10 = this.f18025c0;
        if (i10 != 0) {
            this.f18024b0.setColor(j.L(i10));
        }
        if (this.f18030h0 > 0.0f && this.f18026d0 > 0) {
            canvas.save();
            canvas.rotate((w.G2() ? -90.0f : 90.0f) * (1.0f - this.f18030h0), this.V, this.f18027e0);
            int i11 = (int) (this.W * 0.5f * this.f18030h0);
            int i12 = this.V;
            int i13 = this.f18027e0;
            canvas.drawLine(i12 - i11, i13 - i11, i12 + i11, i13 + i11, this.f18024b0);
            int i14 = this.V;
            int i15 = this.f18027e0;
            canvas.drawLine(i14 + i11, i15 - i11, i14 - i11, i15 + i11, this.f18024b0);
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f18026d0 = getMeasuredHeight() - a0.i(1.0f);
        this.f18027e0 = a0.i(1.0f) + (this.f18026d0 / 2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f18030h0 == 1.0f && super.onTouchEvent(motionEvent);
    }

    public void setColorId(int i10) {
        this.f18025c0 = i10;
    }

    public void setFactor(float f10) {
        if (this.f18030h0 != f10) {
            this.f18030h0 = f10;
            if (f10 >= 0.0f) {
                invalidate();
            }
        }
    }

    public void setInProgress(boolean z10) {
    }
}
