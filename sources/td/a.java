package td;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ce.a0;
import ce.y;
import ib.h;

public class a extends View {
    public float M;
    public int N;
    public int O;
    public float f23383a;
    public float f23384b;
    public float f23385c;

    public a(Context context) {
        super(context);
    }

    public void a(float f10, float[] fArr) {
        if (this.f23384b != f10 || this.f23385c != fArr[1] || this.M != fArr[2]) {
            this.f23384b = f10;
            this.f23385c = fArr[1];
            this.M = fArr[2];
            if (this.f23383a > 0.0f) {
                invalidate();
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        int i10;
        float f11;
        if (this.f23383a != 0.0f) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float f12 = this.O + (this.N * this.f23384b);
            float f13 = this.f23385c * measuredWidth;
            float i11 = (measuredHeight - a0.i(18.0f)) - (((measuredHeight - getPaddingTop()) - a0.i(18.0f)) * this.M);
            float i12 = a0.i(1.0f);
            float i13 = a0.i(3.0f);
            float i14 = a0.i(6.0f);
            float h10 = h.h(f12, measuredHeight, f13, i11);
            int floor = (int) Math.floor(h10 / i14);
            float f14 = floor;
            float f15 = (f13 - f12) / f14;
            float f16 = (i11 - measuredHeight) / f14;
            float i15 = a0.i(48.0f) / 2;
            float max = Math.max(a0.i(8.0f) + i15, Math.min((measuredWidth - i15) - a0.i(8.0f), f13));
            float i16 = (i11 - a0.i(64.0f)) + i15;
            float h11 = h.h(f13, i11, max, i16);
            int floor2 = (int) Math.floor(h11 / i14);
            float f17 = 1.0f / ((floor + floor2) + 1.0f);
            float f18 = this.f23383a;
            float f19 = h10 / f14;
            float abs = Math.abs(h10 - f19);
            float f20 = f12 + f15;
            float f21 = measuredHeight + f16;
            int i17 = 1;
            while (true) {
                if (i17 >= floor) {
                    f10 = i12;
                    break;
                }
                if (f18 > f17) {
                    i10 = floor;
                    f11 = 1.0f;
                } else {
                    f11 = f18 / f17;
                    i10 = floor;
                }
                float f22 = i12 * f11;
                f10 = i12;
                canvas.drawCircle(f20, f21, f22, y.g(-520093697));
                f20 += f15;
                f21 += f16;
                abs -= Math.abs(f19);
                f18 -= f17;
                if (f18 > 0.0f) {
                    if (abs < i13 * 2.0f) {
                        break;
                    }
                    i17++;
                    i12 = f10;
                    floor = i10;
                } else {
                    return;
                }
            }
            canvas.drawCircle(f13, i11, (f18 > f17 ? 1.0f : f18 / f17) * i13, y.g(-520093697));
            float f23 = f18 - f17;
            float f24 = floor2;
            float f25 = h11 / f24;
            float abs2 = Math.abs(h11 - f25);
            float f26 = (max - f13) / f24;
            float f27 = (i16 - i11) / f24;
            float f28 = f13 + f26;
            float f29 = (i11 + f27) - i13;
            for (int i18 = 0; i18 < floor2; i18++) {
                canvas.drawCircle(f28, f29, (f23 > f17 ? 1.0f : f23 / f17) * f10, y.g(-520093697));
                f28 += f26;
                f29 += f27;
                abs2 -= Math.abs(f25);
                f23 -= f17;
                if (f23 <= 0.0f || abs2 < f10 * 2.0f) {
                    return;
                }
            }
        }
    }

    public void setFactor(float f10) {
        if (this.f23383a != f10) {
            this.f23383a = f10;
            invalidate();
        }
    }

    public void setPickerLeft(int i10) {
        if (this.O != i10) {
            this.O = i10;
            if (this.f23383a > 0.0f) {
                invalidate();
            }
        }
    }

    public void setPickerWidth(int i10) {
        if (this.N != i10) {
            this.N = i10;
            if (this.f23383a > 0.0f) {
                invalidate();
            }
        }
    }
}
