package me;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import p108hb.C5064d;

public class C6937j4 extends View {
    public int f21916a;
    public float f21917b;

    public C6937j4(Context context) {
        super(context);
    }

    public void m18401a(int i, float f) {
        if (this.f21916a != i || this.f21917b != f) {
            this.f21916a = i;
            this.f21917b = f;
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = C1357a0.m37541i(12.0f);
        int i2 = measuredHeight / 2;
        int i3 = (measuredWidth / 2) - ((this.f21916a / 2) * i);
        for (int i4 = 0; i4 < this.f21916a; i4++) {
            float abs = 1.0f - Math.abs(this.f21917b - i4);
            if (abs > 1.0f || abs < 0.0f) {
                abs = 0.0f;
            }
            canvas.drawCircle(i3, i2, C1357a0.m37541i(2.0f), C1410y.m37039g(C5064d.m24130b((int) (((abs * 0.4f) + 0.6f) * 255.0f), 16777215)));
            i3 += i;
        }
    }

    public void setPositionFactor(float f) {
        if (this.f21917b != f) {
            this.f21917b = f;
            invalidate();
        }
    }
}
