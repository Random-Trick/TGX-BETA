package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p082fd.C4403w;
import p364zd.C11524j;

public class View$OnClickListenerC9150b extends C9310u0 implements View.OnClickListener {
    public boolean f29493U;
    public float f29494V;
    public View$OnClickListenerC9170d1 f29495W;
    public final Paint f29496a0;
    public int f29497b0;

    public View$OnClickListenerC9150b(Context context) {
        super(context);
        Paint paint = new Paint(5);
        this.f29496a0 = paint;
        paint.setStrokeWidth(C1357a0.m37544i(2.0f));
        paint.setColor(C11524j.m169l0());
    }

    public static float m10175i(int i) {
        if (i != 3) {
            return i != 4 ? 0.0f : 2.0f;
        }
        return 1.0f;
    }

    public int getColor() {
        return this.f29497b0;
    }

    public float getFactor() {
        return this.f29494V;
    }

    @Override
    public void onClick(View view) {
        View$OnClickListenerC9170d1 d1Var = this.f29495W;
        if (d1Var != null) {
            if (d1Var.m10048k3()) {
                this.f29495W.m10026v2(true, true);
                return;
            } else if (this.f29495W.m10051j3()) {
                this.f29495W.m10029t2(true, null);
                return;
            }
        }
        AbstractView$OnTouchListenerC7889a r = C1379j0.m37310r(getContext());
        if (r == null) {
            return;
        }
        if (this.f29494V != 0.0f) {
            r.m14524W1(true);
        } else if (r.m14552P0() != null && !r.m14552P0().m9957Ff()) {
            r.m14552P0().m9928Yf();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        int i = 1;
        boolean z = C4403w.m27986G2() != this.f29493U;
        canvas.save();
        canvas.translate(getPaddingLeft() + (getMeasuredWidth() / 2), getMeasuredHeight() / 2);
        float min = 1.0f - (Math.min(this.f29494V, 1.0f) * 0.12f);
        canvas.scale(min, min);
        int i2 = C1357a0.m37544i(9.0f);
        int i3 = C1357a0.m37544i(8.5f);
        int i4 = C1357a0.m37544i(5.0f);
        int i5 = C1357a0.m37544i(3.5f);
        int i6 = C1357a0.m37544i(0.5f);
        int i7 = C1357a0.m37544i(1.0f);
        float f3 = this.f29494V;
        float f4 = 180.0f;
        if (f3 <= 1.0f) {
            if (z) {
                f4 = -180.0f;
            }
            canvas.rotate(f3 * f4);
            float f5 = -i2;
            float f6 = i2;
            canvas.drawLine(f5, 0.0f, f6 - (i7 * this.f29494V), 0.0f, this.f29496a0);
            float f7 = i4;
            float abs = f7 + (i5 * Math.abs(this.f29494V));
            float f8 = i6;
            float abs2 = (f7 * (1.0f - Math.abs(this.f29494V))) - (Math.abs(this.f29494V) * f8);
            if (C4403w.m27986G2()) {
                f = f6 - (i3 * Math.abs(this.f29494V));
                f2 = f5 + (f8 * Math.abs(this.f29494V));
            } else {
                f = f5 + (i3 * Math.abs(this.f29494V));
                f2 = f6 - (f8 * Math.abs(this.f29494V));
            }
            float f9 = f;
            float f10 = f2;
            canvas.drawLine(f9, -abs, f10, -abs2, this.f29496a0);
            canvas.drawLine(f9, abs, f10, abs2, this.f29496a0);
        } else {
            float f11 = f3 - 1.0f;
            float f12 = ((z ? -135.0f : 135.0f) * f11) + 180.0f;
            if (C4403w.m27986G2()) {
                i = -1;
            }
            canvas.rotate(f12 * i);
            int i8 = -i2;
            canvas.drawLine(i8, 0.0f, i2 - i7, 0.0f, this.f29496a0);
            int i9 = i2 - i6;
            float f13 = ((i9 + i2) - i3) * f11;
            if (C4403w.m27986G2()) {
                float f14 = i2 - i3;
                float f15 = i4 + i5;
                float f16 = -i6;
                float f17 = i8 + i6 + f13;
                canvas.drawLine(f14, -f15, f17, -f16, this.f29496a0);
                canvas.drawLine(f14, f15, f17, f16, this.f29496a0);
            } else {
                float f18 = i8 + i3;
                float f19 = i9 - f13;
                canvas.drawLine(f18, (-i4) - i5, f19, i6, this.f29496a0);
                canvas.drawLine(f18, i4 + i5, f19, -i6, this.f29496a0);
            }
        }
        canvas.restore();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f29495W != null && motionEvent.getAction() == 0) {
            this.f29495W.m10022x3(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setButtonFactor(int i) {
        if (i != 1) {
            setFactor(m10175i(i));
        }
    }

    public void setColor(int i) {
        if (this.f29497b0 != i) {
            this.f29497b0 = i;
            this.f29496a0.setColor(i);
            invalidate();
        }
    }

    public void setFactor(float f) {
        if (this.f29494V != f) {
            this.f29494V = f;
            invalidate();
        }
    }

    public void setIsReverse(boolean z) {
        this.f29493U = z;
    }

    public void setParentHeader(View$OnClickListenerC9170d1 d1Var) {
        this.f29495W = d1Var;
    }
}
