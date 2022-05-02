package p291uc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import be.C1357a0;
import be.C1410y;
import be.C1411z;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p364zd.C11524j;

public class C9626o4 {
    public static float f31211k;
    public static float f31212l;
    public static int f31213m;
    public static int f31214n;
    public static int f31215o;
    public static RectF f31216p;
    public Paint f31217a;
    public float f31218b = 1.0f;
    public byte[] f31219c;
    public C9627a[] f31220d;
    public int f31221e;
    public int f31222f;
    public Bitmap f31223g;
    public int f31224h;
    public boolean f31225i;
    public int f31226j;

    public static class C9627a {
        public float f31227a;

        public C9627a(float f) {
            this.f31227a = f;
        }

        public void m7962a(Canvas canvas, int i, float f, float f2, Paint paint) {
            float f3 = C9626o4.f31211k;
            float f4 = this.f31227a;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            float f5 = f3 + (f4 * f2);
            C9626o4.f31216p.left = i;
            C9626o4.f31216p.top = f - f5;
            C9626o4.f31216p.bottom = f + f5;
            C9626o4.f31216p.right = i + C9626o4.f31213m;
            canvas.drawRoundRect(C9626o4.f31216p, C9626o4.f31215o, C9626o4.f31215o, paint);
        }

        public void m7961b(Canvas canvas, int i, float f, Paint paint) {
            float f2 = C9626o4.f31211k + this.f31227a;
            C9626o4.f31216p.left = i;
            C9626o4.f31216p.top = f - f2;
            C9626o4.f31216p.bottom = f + f2;
            C9626o4.f31216p.right = i + C9626o4.f31213m;
            canvas.drawRoundRect(C9626o4.f31216p, C9626o4.f31215o, C9626o4.f31215o, paint);
        }
    }

    public C9626o4(byte[] bArr, int i, boolean z) {
        if (f31211k == 0.0f) {
            f31211k = C1357a0.m37539k(1.5f);
            f31212l = C1357a0.m37539k(7.0f);
            f31213m = C1357a0.m37541i(3.0f);
            f31214n = C1357a0.m37541i(1.0f);
            f31215o = C1357a0.m37541i(1.0f);
        }
        if (f31216p == null) {
            f31216p = new RectF();
        }
        Paint paint = new Paint(7);
        this.f31217a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f31224h = i;
        this.f31225i = z;
        if (bArr == null || bArr.length == 0) {
            this.f31219c = new byte[50];
            return;
        }
        this.f31219c = bArr;
        m7973e();
    }

    public static int m7966l() {
        return (int) ((f31211k + f31212l) * 2.0f);
    }

    public static void m7965m(byte[] bArr, int[] iArr) {
        for (int i = 0; i < bArr.length; i++) {
            int length = (iArr.length * i) / bArr.length;
            int i2 = bArr[i];
            if (i2 < 0) {
                i2 = -i2;
            }
            if (iArr[length] < i2) {
                iArr[length] = i2;
            }
        }
    }

    public final void m7973e() {
        this.f31221e = 0;
        byte[] bArr = this.f31219c;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i];
            if (i2 < 0) {
                i2 = -i2;
            }
            if (i2 > this.f31221e) {
                this.f31221e = i2;
            }
        }
    }

    public void m7972f(Canvas canvas, float f, int i, int i2) {
        Bitmap bitmap;
        int i3 = i;
        int i4 = this.f31224h;
        int i5 = R.id.theme_color_bubbleOut_waveformActive;
        if (i4 != 0) {
            if (i4 == 1 && this.f31220d != null) {
                int i6 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i6 == 0 || f == 1.0f) {
                    this.f31217a.setColor(C11524j.m228N(i6 == 0 ? this.f31225i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive : this.f31225i ? R.id.theme_color_bubbleOut_waveformActive : R.id.theme_color_waveformActive));
                    for (C9627a aVar : this.f31220d) {
                        aVar.m7962a(canvas, i3, i2, this.f31218b, this.f31217a);
                        i3 += f31213m + f31214n;
                    }
                    return;
                }
                int l = m7966l() * 2;
                float f2 = i3;
                float f3 = (this.f31222f * f) + f2;
                canvas.save();
                float f4 = i2 - l;
                float f5 = l + i2;
                canvas.clipRect(f2, f4, f3, f5);
                Paint paint = this.f31217a;
                if (!this.f31225i) {
                    i5 = R.id.theme_color_waveformActive;
                }
                paint.setColor(C11524j.m228N(i5));
                C9627a[] aVarArr = this.f31220d;
                int length = aVarArr.length;
                int i7 = i3;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    int i10 = i8;
                    length = length;
                    aVarArr = aVarArr;
                    aVarArr[i8].m7962a(canvas, i7, i2, this.f31218b, this.f31217a);
                    int i11 = f31213m;
                    int i12 = f31214n;
                    int i13 = i7 + i11 + i12;
                    if (i13 > f3) {
                        i7 = i13 - (i11 + i12);
                        break;
                    }
                    i9++;
                    i8 = i10 + 1;
                    i7 = i13;
                }
                canvas.restore();
                canvas.save();
                canvas.clipRect(f3 - 1.0f, f4, this.f31222f + i3, f5);
                this.f31217a.setColor(C11524j.m228N(this.f31225i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive));
                int i14 = i9;
                while (true) {
                    C9627a[] aVarArr2 = this.f31220d;
                    if (i14 < aVarArr2.length) {
                        aVarArr2[i14].m7962a(canvas, i7, i2, this.f31218b, this.f31217a);
                        i7 += f31213m + f31214n;
                        i14++;
                    } else {
                        canvas.restore();
                        return;
                    }
                }
            }
        } else if (this.f31220d != null && (bitmap = this.f31223g) != null && !bitmap.isRecycled()) {
            int N = C11524j.m228N(this.f31225i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive);
            if (this.f31217a.getColor() != N) {
                this.f31217a.setColorFilter(C1410y.m37049b(N));
                this.f31217a.setColor(N);
            }
            int height = i2 - ((int) (this.f31223g.getHeight() * 0.5f));
            if (f == 0.0f) {
                canvas.drawBitmap(this.f31223g, i3, height, this.f31217a);
            } else if (f == 1.0f) {
                if (!this.f31225i) {
                    i5 = R.id.theme_color_waveformActive;
                }
                canvas.drawBitmap(this.f31223g, i3, height, C1411z.m36998b(i5));
            } else {
                canvas.save();
                float f6 = i3;
                float f7 = height;
                float f8 = (this.f31222f * f) + f6;
                canvas.clipRect(f6, f7, f8, this.f31223g.getHeight() + height);
                if (!this.f31225i) {
                    i5 = R.id.theme_color_waveformActive;
                }
                canvas.drawBitmap(this.f31223g, f6, f7, C1411z.m36998b(i5));
                canvas.restore();
                canvas.save();
                canvas.clipRect(f8, f7, this.f31223g.getWidth() + i3, height + this.f31223g.getHeight());
                canvas.drawBitmap(this.f31223g, f6, f7, this.f31217a);
                canvas.restore();
            }
        }
    }

    public float m7971g() {
        return this.f31218b;
    }

    public int m7970h() {
        return this.f31221e;
    }

    public int m7969i() {
        return this.f31222f;
    }

    public void m7968j(int i) {
        m7967k(i, false);
    }

    public final void m7967k(int i, boolean z) {
        int i2;
        C9627a aVar;
        if (i > 0) {
            int i3 = f31213m;
            int i4 = f31214n;
            int i5 = (int) (i / (i3 + i4));
            C9627a[] aVarArr = this.f31220d;
            if (aVarArr == null || aVarArr.length != i5 || z) {
                this.f31226j = i;
                this.f31222f = ((i3 + i4) * i5) - i4;
                if (aVarArr == null) {
                    this.f31220d = new C9627a[i5];
                    i2 = 0;
                } else {
                    i2 = Math.min(aVarArr.length, i5);
                    C9627a[] aVarArr2 = new C9627a[i5];
                    System.arraycopy(this.f31220d, 0, aVarArr2, 0, i2);
                    this.f31220d = aVarArr2;
                }
                int i6 = (((int) (f31211k + f31212l)) * 2) + C1357a0.m37541i(10.0f);
                Canvas canvas = null;
                if (this.f31224h == 0) {
                    Bitmap bitmap = this.f31223g;
                    if (bitmap != null && bitmap.getWidth() == this.f31222f && this.f31223g.getHeight() == i6) {
                        this.f31223g.eraseColor(0);
                        canvas = new Canvas(this.f31223g);
                    } else {
                        Bitmap bitmap2 = this.f31223g;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            this.f31223g = null;
                        }
                        this.f31223g = Bitmap.createBitmap(this.f31222f, i6, Bitmap.Config.ARGB_8888);
                        canvas = new Canvas(this.f31223g);
                    }
                }
                int[] iArr = new int[i5];
                m7965m(this.f31219c, iArr);
                if (this.f31224h == 0) {
                    this.f31217a.setColor(C11524j.m228N(this.f31225i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive));
                }
                int i7 = (int) (i6 * 0.5f);
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = iArr[i9];
                    int i11 = this.f31221e;
                    float f = i11 == 0 ? 0.0f : (i10 / i11) * f31212l;
                    if (i9 >= i2) {
                        C9627a[] aVarArr3 = this.f31220d;
                        aVar = new C9627a(f);
                        aVarArr3[i9] = aVar;
                    } else {
                        aVar = this.f31220d[i9];
                        aVar.f31227a = f;
                    }
                    if (canvas != null) {
                        aVar.m7961b(canvas, i8, i7, this.f31217a);
                        i8 += f31213m + f31214n;
                    }
                }
                C7389v0.m16571v2(canvas);
            }
        }
    }

    public void m7964n(byte[] bArr) {
        if (bArr == null) {
            this.f31219c = new byte[50];
            this.f31221e = 0;
        } else {
            this.f31219c = bArr;
            m7973e();
        }
        this.f31218b = 0.0f;
        int i = this.f31226j;
        if (i != 0) {
            m7967k(i, true);
        }
    }

    public void m7963o(float f) {
        this.f31218b = f;
    }
}
