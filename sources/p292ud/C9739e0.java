package p292ud;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import be.C1357a0;
import be.C1359b;
import be.C1399s0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p108hb.C5064d;
import p364zd.C11524j;

public class C9739e0 extends View {
    public float f31694a;
    public float f31695b;

    public class C9740a extends ViewOutlineProvider {
        public C9740a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), (int) (view.getMeasuredHeight() - (C1357a0.m37544i(33.0f) * C9739e0.this.f31694a)), C1357a0.m37544i(33.0f) / 2);
        }
    }

    public C9739e0(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C9740a());
        }
        setLayoutParams(new ViewGroup.LayoutParams(C1357a0.m37544i(33.0f), C1357a0.m37544i(66.0f)));
    }

    private float getCenterY() {
        return ((int) (getMeasuredHeight() - (C1357a0.m37544i(33.0f) * this.f31694a))) - (C1357a0.m37544i(33.0f) / 2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int w = C11524j.m148w();
        RectF a0 = C1410y.m37053a0();
        int measuredWidth = getMeasuredWidth();
        a0.set(0.0f, 0.0f, measuredWidth, getMeasuredHeight() - (C1357a0.m37544i(33.0f) * this.f31694a));
        int i = C1357a0.m37544i(33.0f) / 2;
        float f = i;
        canvas.drawRoundRect(a0, f, f, C1410y.m37042g(w));
        int i2 = ((int) a0.bottom) - i;
        int i3 = measuredWidth / 2;
        int i4 = C1357a0.m37544i(33.0f) / 2;
        int q0 = C11524j.m159q0();
        int N = C11524j.m228N(R.id.theme_color_iconNegative);
        int i5 = (int) (C1357a0.m37544i(2.0f) * this.f31694a * (1.0f - this.f31695b));
        int i6 = (int) (C1357a0.m37544i(6.0f) + (C1357a0.m37544i(2.0f) * (1.0f - this.f31695b)));
        int i7 = (int) (C1357a0.m37544i(6.0f) + (C1357a0.m37544i(1.0f) * (1.0f - this.f31695b)));
        int i8 = (int) ((C1357a0.m37544i(33.0f) / 3) * (1.0f - this.f31694a));
        a0.set(i3 - i6, (i4 - i7) + i8 + i5, i6 + i3, i4 + i7 + i8 + i5);
        canvas.drawRoundRect(a0, C1357a0.m37544i(2.0f), C1357a0.m37544i(2.0f), C1410y.m37042g(C5064d.m24129d(q0, N, this.f31695b)));
        if (this.f31695b < 1.0f) {
            canvas.drawCircle(i3, a0.centerY(), C1357a0.m37544i(2.0f), C1410y.m37042g(C5064d.m24132a(1.0f - this.f31695b, w)));
            int i9 = i8 / 2;
            a0.offset(0.0f, -i9);
            Paint D0 = C1410y.m37080D0(C5064d.m24132a(1.0f - this.f31695b, q0));
            a0.set(i3 - C1357a0.m37544i(5.0f), a0.top - C1357a0.m37544i(5.0f), C1357a0.m37544i(5.0f) + i3, a0.top + C1357a0.m37544i(5.0f));
            canvas.drawArc(a0, 180.0f, 180.0f, false, D0);
            if (i9 > 0) {
                int centerY = (int) a0.centerY();
                float f2 = (int) a0.left;
                float f3 = centerY;
                canvas.drawLine(f2, f3, f2, centerY + i9, D0);
                float f4 = a0.right;
                canvas.drawLine(f4, f3, f4, centerY + Math.min(C1357a0.m37544i(2.0f), i9), D0);
            }
        }
        float f5 = this.f31694a;
        if (f5 < 1.0f) {
            C1359b.m37511k(canvas, i3, i2, C5064d.m24132a(1.0f - (f5 >= 0.5f ? 1.0f : f5 / 0.5f), q0), 48);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotX(getMeasuredWidth() / 2);
        setPivotY(getCenterY());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C1399s0.m37208P(this, motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setCollapseFactor(float f) {
        if (this.f31694a != f) {
            this.f31694a = f;
            setPivotY(getCenterY());
            invalidate();
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    public void setSendFactor(float f) {
        if (this.f31695b != f) {
            this.f31695b = f;
            invalidate();
        }
    }
}
