package p291uc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import be.C1357a0;
import be.C1410y;

public class C9655t extends Drawable {
    public static final int[] f31363b = {-1, -2758925, -13805707, -13657655};
    public byte[] f31364a;

    public C9655t(byte[] bArr) {
        this.f31364a = bArr;
    }

    public final int m7849a(int i) {
        return (this.f31364a[i / 8] >> (i % 8)) & 3;
    }

    @Override
    public void draw(Canvas canvas) {
        byte[] bArr = this.f31364a;
        if (bArr != null) {
            if (bArr.length == 16) {
                float floor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
                float f = 8.0f * floor;
                float max = Math.max(0.0f, (getBounds().width() - f) / 2.0f);
                float max2 = Math.max(0.0f, (getBounds().height() - f) / 2.0f);
                int i = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    for (int i3 = 0; i3 < 8; i3++) {
                        int a = m7849a(i);
                        i += 2;
                        int abs = Math.abs(a);
                        int[] iArr = f31363b;
                        float f2 = max + (i3 * floor);
                        float f3 = i2 * floor;
                        canvas.drawRect(f2, f3 + max2, f2 + floor, f3 + floor + max2, C1410y.m37042g(iArr[abs % iArr.length]));
                    }
                }
                return;
            }
            float floor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
            float f4 = 12.0f * floor2;
            float max3 = Math.max(0.0f, (getBounds().width() - f4) / 2.0f);
            float max4 = Math.max(0.0f, (getBounds().height() - f4) / 2.0f);
            int i4 = 0;
            for (int i5 = 0; i5 < 12; i5++) {
                for (int i6 = 0; i6 < 12; i6++) {
                    int abs2 = Math.abs(m7849a(i4));
                    int[] iArr2 = f31363b;
                    float f5 = max3 + (i6 * floor2);
                    float f6 = i5 * floor2;
                    canvas.drawRect(f5, f6 + max4, f5 + floor2, f6 + floor2 + max4, C1410y.m37042g(iArr2[abs2 % iArr2.length]));
                    i4 += 2;
                }
            }
        }
    }

    @Override
    public int getIntrinsicHeight() {
        return C1357a0.m37544i(32.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return C1357a0.m37544i(32.0f);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
