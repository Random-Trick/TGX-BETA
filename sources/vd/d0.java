package vd;

import ae.j;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import ce.a0;
import ce.b;
import ce.p0;
import ce.y;
import ib.d;
import org.thunderdog.challegram.R;

public class d0 extends View {
    public float f25443a;
    public float f25444b;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), (int) (view.getMeasuredHeight() - (a0.i(33.0f) * d0.this.f25443a)), a0.i(33.0f) / 2);
        }
    }

    public d0(Context context) {
        super(context);
        setOutlineProvider(new a());
        setLayoutParams(new ViewGroup.LayoutParams(a0.i(33.0f), a0.i(66.0f)));
    }

    private float getCenterY() {
        return ((int) (getMeasuredHeight() - (a0.i(33.0f) * this.f25443a))) - (a0.i(33.0f) / 2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int u10 = j.u();
        RectF a02 = y.a0();
        int measuredWidth = getMeasuredWidth();
        a02.set(0.0f, 0.0f, measuredWidth, getMeasuredHeight() - (a0.i(33.0f) * this.f25443a));
        int i10 = a0.i(33.0f) / 2;
        float f10 = i10;
        canvas.drawRoundRect(a02, f10, f10, y.g(u10));
        int i11 = ((int) a02.bottom) - i10;
        int i12 = measuredWidth / 2;
        int i13 = a0.i(33.0f) / 2;
        int o02 = j.o0();
        int L = j.L(R.id.theme_color_iconNegative);
        int i14 = (int) (a0.i(2.0f) * this.f25443a * (1.0f - this.f25444b));
        int i15 = (int) (a0.i(6.0f) + (a0.i(2.0f) * (1.0f - this.f25444b)));
        int i16 = (int) (a0.i(6.0f) + (a0.i(1.0f) * (1.0f - this.f25444b)));
        int i17 = (int) ((a0.i(33.0f) / 3) * (1.0f - this.f25443a));
        a02.set(i12 - i15, (i13 - i16) + i17 + i14, i15 + i12, i13 + i16 + i17 + i14);
        canvas.drawRoundRect(a02, a0.i(2.0f), a0.i(2.0f), y.g(d.d(o02, L, this.f25444b)));
        if (this.f25444b < 1.0f) {
            canvas.drawCircle(i12, a02.centerY(), a0.i(2.0f), y.g(d.a(1.0f - this.f25444b, u10)));
            int i18 = i17 / 2;
            a02.offset(0.0f, -i18);
            Paint C0 = y.C0(d.a(1.0f - this.f25444b, o02));
            a02.set(i12 - a0.i(5.0f), a02.top - a0.i(5.0f), a0.i(5.0f) + i12, a02.top + a0.i(5.0f));
            canvas.drawArc(a02, 180.0f, 180.0f, false, C0);
            if (i18 > 0) {
                int centerY = (int) a02.centerY();
                float f11 = (int) a02.left;
                float f12 = centerY;
                canvas.drawLine(f11, f12, f11, centerY + i18, C0);
                float f13 = a02.right;
                canvas.drawLine(f13, f12, f13, centerY + Math.min(a0.i(2.0f), i18), C0);
            }
        }
        float f14 = this.f25443a;
        if (f14 < 1.0f) {
            b.k(canvas, i12, i11, d.a(1.0f - (f14 >= 0.5f ? 1.0f : f14 / 0.5f), o02), 48);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(getMeasuredWidth() / 2);
        setPivotY(getCenterY());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return p0.J(this, motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setCollapseFactor(float f10) {
        if (this.f25443a != f10) {
            this.f25443a = f10;
            setPivotY(getCenterY());
            invalidate();
            invalidateOutline();
        }
    }

    public void setSendFactor(float f10) {
        if (this.f25444b != f10) {
            this.f25444b = f10;
            invalidate();
        }
    }
}
