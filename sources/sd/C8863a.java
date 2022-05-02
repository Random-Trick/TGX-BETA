package sd;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import p108hb.C5069h;

public class C8863a extends View {
    public float f28614M;
    public int f28615N;
    public int f28616O;
    public float f28617a;
    public float f28618b;
    public float f28619c;

    public C8863a(Context context) {
        super(context);
    }

    public void m11082a(float f, float[] fArr) {
        if (this.f28618b != f || this.f28619c != fArr[1] || this.f28614M != fArr[2]) {
            this.f28618b = f;
            this.f28619c = fArr[1];
            this.f28614M = fArr[2];
            if (this.f28617a > 0.0f) {
                invalidate();
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        float f2;
        if (this.f28617a != 0.0f) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float f3 = this.f28616O + (this.f28615N * this.f28618b);
            float f4 = this.f28619c * measuredWidth;
            float i2 = (measuredHeight - C1357a0.m37541i(18.0f)) - (((measuredHeight - getPaddingTop()) - C1357a0.m37541i(18.0f)) * this.f28614M);
            float i3 = C1357a0.m37541i(1.0f);
            float i4 = C1357a0.m37541i(3.0f);
            float i5 = C1357a0.m37541i(6.0f);
            float h = C5069h.m24085h(f3, measuredHeight, f4, i2);
            int floor = (int) Math.floor(h / i5);
            float f5 = floor;
            float f6 = (f4 - f3) / f5;
            float f7 = (i2 - measuredHeight) / f5;
            float i6 = C1357a0.m37541i(48.0f) / 2;
            float max = Math.max(C1357a0.m37541i(8.0f) + i6, Math.min((measuredWidth - i6) - C1357a0.m37541i(8.0f), f4));
            float i7 = (i2 - C1357a0.m37541i(64.0f)) + i6;
            float h2 = C5069h.m24085h(f4, i2, max, i7);
            int floor2 = (int) Math.floor(h2 / i5);
            float f8 = 1.0f / ((floor + floor2) + 1.0f);
            float f9 = this.f28617a;
            float f10 = h / f5;
            float abs = Math.abs(h - f10);
            float f11 = f3 + f6;
            float f12 = measuredHeight + f7;
            int i8 = 1;
            while (true) {
                if (i8 >= floor) {
                    f = i3;
                    break;
                }
                if (f9 > f8) {
                    i = floor;
                    f2 = 1.0f;
                } else {
                    f2 = f9 / f8;
                    i = floor;
                }
                float f13 = i3 * f2;
                f = i3;
                canvas.drawCircle(f11, f12, f13, C1410y.m37039g(-520093697));
                f11 += f6;
                f12 += f7;
                abs -= Math.abs(f10);
                f9 -= f8;
                if (f9 > 0.0f) {
                    if (abs < i4 * 2.0f) {
                        break;
                    }
                    i8++;
                    i3 = f;
                    floor = i;
                } else {
                    return;
                }
            }
            canvas.drawCircle(f4, i2, (f9 > f8 ? 1.0f : f9 / f8) * i4, C1410y.m37039g(-520093697));
            float f14 = f9 - f8;
            float f15 = floor2;
            float f16 = h2 / f15;
            float abs2 = Math.abs(h2 - f16);
            float f17 = (max - f4) / f15;
            float f18 = (i7 - i2) / f15;
            float f19 = f4 + f17;
            float f20 = (i2 + f18) - i4;
            for (int i9 = 0; i9 < floor2; i9++) {
                canvas.drawCircle(f19, f20, (f14 > f8 ? 1.0f : f14 / f8) * f, C1410y.m37039g(-520093697));
                f19 += f17;
                f20 += f18;
                abs2 -= Math.abs(f16);
                f14 -= f8;
                if (f14 <= 0.0f || abs2 < f * 2.0f) {
                    return;
                }
            }
        }
    }

    public void setFactor(float f) {
        if (this.f28617a != f) {
            this.f28617a = f;
            invalidate();
        }
    }

    public void setPickerLeft(int i) {
        if (this.f28616O != i) {
            this.f28616O = i;
            if (this.f28617a > 0.0f) {
                invalidate();
            }
        }
    }

    public void setPickerWidth(int i) {
        if (this.f28615N != i) {
            this.f28615N = i;
            if (this.f28617a > 0.0f) {
                invalidate();
            }
        }
    }
}
