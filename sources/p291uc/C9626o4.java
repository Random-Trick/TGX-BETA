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
    public static float f31214k;
    public static float f31215l;
    public static int f31216m;
    public static int f31217n;
    public static int f31218o;
    public static RectF f31219p;
    public Paint f31220a;
    public float f31221b = 1.0f;
    public byte[] f31222c;
    public C9627a[] f31223d;
    public int f31224e;
    public int f31225f;
    public Bitmap f31226g;
    public int f31227h;
    public boolean f31228i;
    public int f31229j;

    public static class C9627a {
        public float f31230a;

        public C9627a(float f) {
            this.f31230a = f;
        }

        public void m7962a(Canvas canvas, int i, float f, float f2, Paint paint) {
            float f3 = C9626o4.f31214k;
            float f4 = this.f31230a;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            float f5 = f3 + (f4 * f2);
            C9626o4.f31219p.left = i;
            C9626o4.f31219p.top = f - f5;
            C9626o4.f31219p.bottom = f + f5;
            C9626o4.f31219p.right = i + C9626o4.f31216m;
            canvas.drawRoundRect(C9626o4.f31219p, C9626o4.f31218o, C9626o4.f31218o, paint);
        }

        public void m7961b(Canvas canvas, int i, float f, Paint paint) {
            float f2 = C9626o4.f31214k + this.f31230a;
            C9626o4.f31219p.left = i;
            C9626o4.f31219p.top = f - f2;
            C9626o4.f31219p.bottom = f + f2;
            C9626o4.f31219p.right = i + C9626o4.f31216m;
            canvas.drawRoundRect(C9626o4.f31219p, C9626o4.f31218o, C9626o4.f31218o, paint);
        }
    }

    public C9626o4(byte[] bArr, int i, boolean z) {
        if (f31214k == 0.0f) {
            f31214k = C1357a0.m37542k(1.5f);
            f31215l = C1357a0.m37542k(7.0f);
            f31216m = C1357a0.m37544i(3.0f);
            f31217n = C1357a0.m37544i(1.0f);
            f31218o = C1357a0.m37544i(1.0f);
        }
        if (f31219p == null) {
            f31219p = new RectF();
        }
        Paint paint = new Paint(7);
        this.f31220a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f31227h = i;
        this.f31228i = z;
        if (bArr == null || bArr.length == 0) {
            this.f31222c = new byte[50];
            return;
        }
        this.f31222c = bArr;
        m7973e();
    }

    public static int m7966l() {
        return (int) ((f31214k + f31215l) * 2.0f);
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
        this.f31224e = 0;
        byte[] bArr = this.f31222c;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i];
            if (i2 < 0) {
                i2 = -i2;
            }
            if (i2 > this.f31224e) {
                this.f31224e = i2;
            }
        }
    }

    public void m7972f(Canvas canvas, float f, int i, int i2) {
        Bitmap bitmap;
        int i3 = i;
        int i4 = this.f31227h;
        int i5 = R.id.theme_color_bubbleOut_waveformActive;
        if (i4 != 0) {
            if (i4 == 1 && this.f31223d != null) {
                int i6 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i6 == 0 || f == 1.0f) {
                    this.f31220a.setColor(C11524j.m228N(i6 == 0 ? this.f31228i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive : this.f31228i ? R.id.theme_color_bubbleOut_waveformActive : R.id.theme_color_waveformActive));
                    for (C9627a aVar : this.f31223d) {
                        aVar.m7962a(canvas, i3, i2, this.f31221b, this.f31220a);
                        i3 += f31216m + f31217n;
                    }
                    return;
                }
                int l = m7966l() * 2;
                float f2 = i3;
                float f3 = (this.f31225f * f) + f2;
                canvas.save();
                float f4 = i2 - l;
                float f5 = l + i2;
                canvas.clipRect(f2, f4, f3, f5);
                Paint paint = this.f31220a;
                if (!this.f31228i) {
                    i5 = R.id.theme_color_waveformActive;
                }
                paint.setColor(C11524j.m228N(i5));
                C9627a[] aVarArr = this.f31223d;
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
                    aVarArr[i8].m7962a(canvas, i7, i2, this.f31221b, this.f31220a);
                    int i11 = f31216m;
                    int i12 = f31217n;
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
                canvas.clipRect(f3 - 1.0f, f4, this.f31225f + i3, f5);
                this.f31220a.setColor(C11524j.m228N(this.f31228i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive));
                int i14 = i9;
                while (true) {
                    C9627a[] aVarArr2 = this.f31223d;
                    if (i14 < aVarArr2.length) {
                        aVarArr2[i14].m7962a(canvas, i7, i2, this.f31221b, this.f31220a);
                        i7 += f31216m + f31217n;
                        i14++;
                    } else {
                        canvas.restore();
                        return;
                    }
                }
            }
        } else if (this.f31223d != null && (bitmap = this.f31226g) != null && !bitmap.isRecycled()) {
            int N = C11524j.m228N(this.f31228i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive);
            if (this.f31220a.getColor() != N) {
                this.f31220a.setColorFilter(C1410y.m37052b(N));
                this.f31220a.setColor(N);
            }
            int height = i2 - ((int) (this.f31226g.getHeight() * 0.5f));
            if (f == 0.0f) {
                canvas.drawBitmap(this.f31226g, i3, height, this.f31220a);
            } else if (f == 1.0f) {
                if (!this.f31228i) {
                    i5 = R.id.theme_color_waveformActive;
                }
                canvas.drawBitmap(this.f31226g, i3, height, C1411z.m37001b(i5));
            } else {
                canvas.save();
                float f6 = i3;
                float f7 = height;
                float f8 = (this.f31225f * f) + f6;
                canvas.clipRect(f6, f7, f8, this.f31226g.getHeight() + height);
                if (!this.f31228i) {
                    i5 = R.id.theme_color_waveformActive;
                }
                canvas.drawBitmap(this.f31226g, f6, f7, C1411z.m37001b(i5));
                canvas.restore();
                canvas.save();
                canvas.clipRect(f8, f7, this.f31226g.getWidth() + i3, height + this.f31226g.getHeight());
                canvas.drawBitmap(this.f31226g, f6, f7, this.f31220a);
                canvas.restore();
            }
        }
    }

    public float m7971g() {
        return this.f31221b;
    }

    public int m7970h() {
        return this.f31224e;
    }

    public int m7969i() {
        return this.f31225f;
    }

    public void m7968j(int i) {
        m7967k(i, false);
    }

    public final void m7967k(int i, boolean z) {
        int i2;
        C9627a aVar;
        if (i > 0) {
            int i3 = f31216m;
            int i4 = f31217n;
            int i5 = (int) (i / (i3 + i4));
            C9627a[] aVarArr = this.f31223d;
            if (aVarArr == null || aVarArr.length != i5 || z) {
                this.f31229j = i;
                this.f31225f = ((i3 + i4) * i5) - i4;
                if (aVarArr == null) {
                    this.f31223d = new C9627a[i5];
                    i2 = 0;
                } else {
                    i2 = Math.min(aVarArr.length, i5);
                    C9627a[] aVarArr2 = new C9627a[i5];
                    System.arraycopy(this.f31223d, 0, aVarArr2, 0, i2);
                    this.f31223d = aVarArr2;
                }
                int i6 = (((int) (f31214k + f31215l)) * 2) + C1357a0.m37544i(10.0f);
                Canvas canvas = null;
                if (this.f31227h == 0) {
                    Bitmap bitmap = this.f31226g;
                    if (bitmap != null && bitmap.getWidth() == this.f31225f && this.f31226g.getHeight() == i6) {
                        this.f31226g.eraseColor(0);
                        canvas = new Canvas(this.f31226g);
                    } else {
                        Bitmap bitmap2 = this.f31226g;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            this.f31226g = null;
                        }
                        this.f31226g = Bitmap.createBitmap(this.f31225f, i6, Bitmap.Config.ARGB_8888);
                        canvas = new Canvas(this.f31226g);
                    }
                }
                int[] iArr = new int[i5];
                m7965m(this.f31222c, iArr);
                if (this.f31227h == 0) {
                    this.f31220a.setColor(C11524j.m228N(this.f31228i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive));
                }
                int i7 = (int) (i6 * 0.5f);
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = iArr[i9];
                    int i11 = this.f31224e;
                    float f = i11 == 0 ? 0.0f : (i10 / i11) * f31215l;
                    if (i9 >= i2) {
                        C9627a[] aVarArr3 = this.f31223d;
                        aVar = new C9627a(f);
                        aVarArr3[i9] = aVar;
                    } else {
                        aVar = this.f31223d[i9];
                        aVar.f31230a = f;
                    }
                    if (canvas != null) {
                        aVar.m7961b(canvas, i8, i7, this.f31220a);
                        i8 += f31216m + f31217n;
                    }
                }
                C7389v0.m16571v2(canvas);
            }
        }
    }

    public void m7964n(byte[] bArr) {
        if (bArr == null) {
            this.f31222c = new byte[50];
            this.f31224e = 0;
        } else {
            this.f31222c = bArr;
            m7973e();
        }
        this.f31221b = 0.0f;
        int i = this.f31229j;
        if (i != 0) {
            m7967k(i, true);
        }
    }

    public void m7963o(float f) {
        this.f31221b = f;
    }
}
