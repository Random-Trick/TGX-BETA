package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.j0;
import gd.w;
import org.thunderdog.challegram.a;

public class b extends u0 implements View.OnClickListener {
    public boolean U;
    public float V;
    public d1 W;
    public final Paint f24047a0;
    public int f24048b0;

    public b(Context context) {
        super(context);
        Paint paint = new Paint(5);
        this.f24047a0 = paint;
        paint.setStrokeWidth(a0.i(2.0f));
        paint.setColor(j.j0());
    }

    public static float i(int i10) {
        if (i10 != 3) {
            return i10 != 4 ? 0.0f : 2.0f;
        }
        return 1.0f;
    }

    public int getColor() {
        return this.f24048b0;
    }

    public float getFactor() {
        return this.V;
    }

    @Override
    public void onClick(View view) {
        d1 d1Var = this.W;
        if (d1Var != null) {
            if (d1Var.l3()) {
                this.W.r2(true, true);
                return;
            } else if (this.W.j3()) {
                this.W.n2(true, null);
                return;
            }
        }
        a r10 = j0.r(getContext());
        if (r10 == null) {
            return;
        }
        if (this.V != 0.0f) {
            r10.Y1(true);
        } else if (r10.S0() != null && !r10.S0().Ff()) {
            r10.S0().Yf();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = 1;
        boolean z10 = w.G2() != this.U;
        canvas.save();
        canvas.translate(getPaddingLeft() + (getMeasuredWidth() / 2), getMeasuredHeight() / 2);
        float min = 1.0f - (Math.min(this.V, 1.0f) * 0.12f);
        canvas.scale(min, min);
        int i11 = a0.i(9.0f);
        int i12 = a0.i(8.5f);
        int i13 = a0.i(5.0f);
        int i14 = a0.i(3.5f);
        int i15 = a0.i(0.5f);
        int i16 = a0.i(1.0f);
        float f12 = this.V;
        float f13 = 180.0f;
        if (f12 <= 1.0f) {
            if (z10) {
                f13 = -180.0f;
            }
            canvas.rotate(f12 * f13);
            float f14 = -i11;
            float f15 = i11;
            canvas.drawLine(f14, 0.0f, f15 - (i16 * this.V), 0.0f, this.f24047a0);
            float f16 = i13;
            float abs = f16 + (i14 * Math.abs(this.V));
            float f17 = i15;
            float abs2 = (f16 * (1.0f - Math.abs(this.V))) - (Math.abs(this.V) * f17);
            if (w.G2()) {
                f10 = f15 - (i12 * Math.abs(this.V));
                f11 = f14 + (f17 * Math.abs(this.V));
            } else {
                f10 = f14 + (i12 * Math.abs(this.V));
                f11 = f15 - (f17 * Math.abs(this.V));
            }
            float f18 = f10;
            float f19 = f11;
            canvas.drawLine(f18, -abs, f19, -abs2, this.f24047a0);
            canvas.drawLine(f18, abs, f19, abs2, this.f24047a0);
        } else {
            float f20 = f12 - 1.0f;
            float f21 = ((z10 ? -135.0f : 135.0f) * f20) + 180.0f;
            if (w.G2()) {
                i10 = -1;
            }
            canvas.rotate(f21 * i10);
            int i17 = -i11;
            canvas.drawLine(i17, 0.0f, i11 - i16, 0.0f, this.f24047a0);
            int i18 = i11 - i15;
            float f22 = ((i18 + i11) - i12) * f20;
            if (w.G2()) {
                float f23 = i11 - i12;
                float f24 = i13 + i14;
                float f25 = -i15;
                float f26 = i17 + i15 + f22;
                canvas.drawLine(f23, -f24, f26, -f25, this.f24047a0);
                canvas.drawLine(f23, f24, f26, f25, this.f24047a0);
            } else {
                float f27 = i17 + i12;
                float f28 = i18 - f22;
                canvas.drawLine(f27, (-i13) - i14, f28, i15, this.f24047a0);
                canvas.drawLine(f27, i13 + i14, f28, -i15, this.f24047a0);
            }
        }
        canvas.restore();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.W != null && motionEvent.getAction() == 0) {
            this.W.y3(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setButtonFactor(int i10) {
        if (i10 != 1) {
            setFactor(i(i10));
        }
    }

    public void setColor(int i10) {
        if (this.f24048b0 != i10) {
            this.f24048b0 = i10;
            this.f24047a0.setColor(i10);
            invalidate();
        }
    }

    public void setFactor(float f10) {
        if (this.V != f10) {
            this.V = f10;
            invalidate();
        }
    }

    public void setIsReverse(boolean z10) {
        this.U = z10;
    }

    public void setParentHeader(d1 d1Var) {
        this.W = d1Var;
    }
}
