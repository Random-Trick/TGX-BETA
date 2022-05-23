package vc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import ce.a0;
import ce.y;

public class s extends Drawable {
    public static final int[] f25225b = {-1, -2758925, -13805707, -13657655};
    public byte[] f25226a;

    public s(byte[] bArr) {
        this.f25226a = bArr;
    }

    public final int a(int i10) {
        return (this.f25226a[i10 / 8] >> (i10 % 8)) & 3;
    }

    @Override
    public void draw(Canvas canvas) {
        byte[] bArr = this.f25226a;
        if (bArr != null) {
            if (bArr.length == 16) {
                float floor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
                float f10 = 8.0f * floor;
                float max = Math.max(0.0f, (getBounds().width() - f10) / 2.0f);
                float max2 = Math.max(0.0f, (getBounds().height() - f10) / 2.0f);
                int i10 = 0;
                for (int i11 = 0; i11 < 8; i11++) {
                    for (int i12 = 0; i12 < 8; i12++) {
                        int a10 = a(i10);
                        i10 += 2;
                        int abs = Math.abs(a10);
                        int[] iArr = f25225b;
                        float f11 = max + (i12 * floor);
                        float f12 = i11 * floor;
                        canvas.drawRect(f11, f12 + max2, f11 + floor, f12 + floor + max2, y.g(iArr[abs % iArr.length]));
                    }
                }
                return;
            }
            float floor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
            float f13 = 12.0f * floor2;
            float max3 = Math.max(0.0f, (getBounds().width() - f13) / 2.0f);
            float max4 = Math.max(0.0f, (getBounds().height() - f13) / 2.0f);
            int i13 = 0;
            for (int i14 = 0; i14 < 12; i14++) {
                for (int i15 = 0; i15 < 12; i15++) {
                    int abs2 = Math.abs(a(i13));
                    int[] iArr2 = f25225b;
                    float f14 = max3 + (i15 * floor2);
                    float f15 = i14 * floor2;
                    canvas.drawRect(f14, f15 + max4, f14 + floor2, f15 + floor2 + max4, y.g(iArr2[abs2 % iArr2.length]));
                    i13 += 2;
                }
            }
        }
    }

    @Override
    public int getIntrinsicHeight() {
        return a0.i(32.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return a0.i(32.0f);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i10) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
