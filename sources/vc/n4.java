package vc;

import ae.j;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import ce.a0;
import ce.y;
import ce.z;
import oc.v0;
import org.thunderdog.challegram.R;

public class n4 {
    public static float f25136k;
    public static float f25137l;
    public static int f25138m;
    public static int f25139n;
    public static int f25140o;
    public static RectF f25141p;
    public Paint f25142a;
    public float f25143b = 1.0f;
    public byte[] f25144c;
    public a[] f25145d;
    public int f25146e;
    public int f25147f;
    public Bitmap f25148g;
    public int f25149h;
    public boolean f25150i;
    public int f25151j;

    public static class a {
        public float f25152a;

        public a(float f10) {
            this.f25152a = f10;
        }

        public void a(Canvas canvas, int i10, float f10, float f11, Paint paint) {
            float f12 = n4.f25136k;
            float f13 = this.f25152a;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            float f14 = f12 + (f13 * f11);
            n4.f25141p.left = i10;
            n4.f25141p.top = f10 - f14;
            n4.f25141p.bottom = f10 + f14;
            n4.f25141p.right = i10 + n4.f25138m;
            canvas.drawRoundRect(n4.f25141p, n4.f25140o, n4.f25140o, paint);
        }

        public void b(Canvas canvas, int i10, float f10, Paint paint) {
            float f11 = n4.f25136k + this.f25152a;
            n4.f25141p.left = i10;
            n4.f25141p.top = f10 - f11;
            n4.f25141p.bottom = f10 + f11;
            n4.f25141p.right = i10 + n4.f25138m;
            canvas.drawRoundRect(n4.f25141p, n4.f25140o, n4.f25140o, paint);
        }
    }

    public n4(byte[] bArr, int i10, boolean z10) {
        if (f25136k == 0.0f) {
            f25136k = a0.k(1.5f);
            f25137l = a0.k(7.0f);
            f25138m = a0.i(3.0f);
            f25139n = a0.i(1.0f);
            f25140o = a0.i(1.0f);
        }
        if (f25141p == null) {
            f25141p = new RectF();
        }
        Paint paint = new Paint(7);
        this.f25142a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f25149h = i10;
        this.f25150i = z10;
        if (bArr == null || bArr.length == 0) {
            this.f25144c = new byte[50];
            return;
        }
        this.f25144c = bArr;
        e();
    }

    public static int l() {
        return (int) ((f25136k + f25137l) * 2.0f);
    }

    public static void m(byte[] bArr, int[] iArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (iArr.length * i10) / bArr.length;
            int i11 = bArr[i10];
            if (i11 < 0) {
                i11 = -i11;
            }
            if (iArr[length] < i11) {
                iArr[length] = i11;
            }
        }
    }

    public final void e() {
        this.f25146e = 0;
        byte[] bArr = this.f25144c;
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bArr[i10];
            if (i11 < 0) {
                i11 = -i11;
            }
            if (i11 > this.f25146e) {
                this.f25146e = i11;
            }
        }
    }

    public void f(Canvas canvas, float f10, int i10, int i11) {
        Bitmap bitmap;
        int i12 = i10;
        int i13 = this.f25149h;
        int i14 = R.id.theme_color_bubbleOut_waveformActive;
        if (i13 != 0) {
            if (i13 == 1 && this.f25145d != null) {
                int i15 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i15 == 0 || f10 == 1.0f) {
                    this.f25142a.setColor(j.L(i15 == 0 ? this.f25150i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive : this.f25150i ? R.id.theme_color_bubbleOut_waveformActive : R.id.theme_color_waveformActive));
                    for (a aVar : this.f25145d) {
                        aVar.a(canvas, i12, i11, this.f25143b, this.f25142a);
                        i12 += f25138m + f25139n;
                    }
                    return;
                }
                int l10 = l() * 2;
                float f11 = i12;
                float f12 = (this.f25147f * f10) + f11;
                canvas.save();
                float f13 = i11 - l10;
                float f14 = l10 + i11;
                canvas.clipRect(f11, f13, f12, f14);
                Paint paint = this.f25142a;
                if (!this.f25150i) {
                    i14 = R.id.theme_color_waveformActive;
                }
                paint.setColor(j.L(i14));
                a[] aVarArr = this.f25145d;
                int length = aVarArr.length;
                int i16 = i12;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    int i19 = i17;
                    length = length;
                    aVarArr = aVarArr;
                    aVarArr[i17].a(canvas, i16, i11, this.f25143b, this.f25142a);
                    int i20 = f25138m;
                    int i21 = f25139n;
                    int i22 = i16 + i20 + i21;
                    if (i22 > f12) {
                        i16 = i22 - (i20 + i21);
                        break;
                    }
                    i18++;
                    i17 = i19 + 1;
                    i16 = i22;
                }
                canvas.restore();
                canvas.save();
                canvas.clipRect(f12 - 1.0f, f13, this.f25147f + i12, f14);
                this.f25142a.setColor(j.L(this.f25150i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive));
                int i23 = i18;
                while (true) {
                    a[] aVarArr2 = this.f25145d;
                    if (i23 < aVarArr2.length) {
                        aVarArr2[i23].a(canvas, i16, i11, this.f25143b, this.f25142a);
                        i16 += f25138m + f25139n;
                        i23++;
                    } else {
                        canvas.restore();
                        return;
                    }
                }
            }
        } else if (this.f25145d != null && (bitmap = this.f25148g) != null && !bitmap.isRecycled()) {
            int L = j.L(this.f25150i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive);
            if (this.f25142a.getColor() != L) {
                this.f25142a.setColorFilter(y.b(L));
                this.f25142a.setColor(L);
            }
            int height = i11 - ((int) (this.f25148g.getHeight() * 0.5f));
            if (f10 == 0.0f) {
                canvas.drawBitmap(this.f25148g, i12, height, this.f25142a);
            } else if (f10 == 1.0f) {
                if (!this.f25150i) {
                    i14 = R.id.theme_color_waveformActive;
                }
                canvas.drawBitmap(this.f25148g, i12, height, z.b(i14));
            } else {
                canvas.save();
                float f15 = i12;
                float f16 = height;
                float f17 = (this.f25147f * f10) + f15;
                canvas.clipRect(f15, f16, f17, this.f25148g.getHeight() + height);
                if (!this.f25150i) {
                    i14 = R.id.theme_color_waveformActive;
                }
                canvas.drawBitmap(this.f25148g, f15, f16, z.b(i14));
                canvas.restore();
                canvas.save();
                canvas.clipRect(f17, f16, this.f25148g.getWidth() + i12, height + this.f25148g.getHeight());
                canvas.drawBitmap(this.f25148g, f15, f16, this.f25142a);
                canvas.restore();
            }
        }
    }

    public float g() {
        return this.f25143b;
    }

    public int h() {
        return this.f25146e;
    }

    public int i() {
        return this.f25147f;
    }

    public void j(int i10) {
        k(i10, false);
    }

    public final void k(int i10, boolean z10) {
        int i11;
        a aVar;
        if (i10 > 0) {
            int i12 = f25138m;
            int i13 = f25139n;
            int i14 = (int) (i10 / (i12 + i13));
            a[] aVarArr = this.f25145d;
            if (aVarArr == null || aVarArr.length != i14 || z10) {
                this.f25151j = i10;
                this.f25147f = ((i12 + i13) * i14) - i13;
                if (aVarArr == null) {
                    this.f25145d = new a[i14];
                    i11 = 0;
                } else {
                    i11 = Math.min(aVarArr.length, i14);
                    a[] aVarArr2 = new a[i14];
                    System.arraycopy(this.f25145d, 0, aVarArr2, 0, i11);
                    this.f25145d = aVarArr2;
                }
                int i15 = (((int) (f25136k + f25137l)) * 2) + a0.i(10.0f);
                Canvas canvas = null;
                if (this.f25149h == 0) {
                    Bitmap bitmap = this.f25148g;
                    if (bitmap != null && bitmap.getWidth() == this.f25147f && this.f25148g.getHeight() == i15) {
                        this.f25148g.eraseColor(0);
                        canvas = new Canvas(this.f25148g);
                    } else {
                        Bitmap bitmap2 = this.f25148g;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            this.f25148g = null;
                        }
                        this.f25148g = Bitmap.createBitmap(this.f25147f, i15, Bitmap.Config.ARGB_8888);
                        canvas = new Canvas(this.f25148g);
                    }
                }
                int[] iArr = new int[i14];
                m(this.f25144c, iArr);
                if (this.f25149h == 0) {
                    this.f25142a.setColor(j.L(this.f25150i ? R.id.theme_color_bubbleOut_waveformInactive : R.id.theme_color_waveformInactive));
                }
                int i16 = (int) (i15 * 0.5f);
                int i17 = 0;
                for (int i18 = 0; i18 < i14; i18++) {
                    int i19 = iArr[i18];
                    int i20 = this.f25146e;
                    float f10 = i20 == 0 ? 0.0f : (i19 / i20) * f25137l;
                    if (i18 >= i11) {
                        a[] aVarArr3 = this.f25145d;
                        aVar = new a(f10);
                        aVarArr3[i18] = aVar;
                    } else {
                        aVar = this.f25145d[i18];
                        aVar.f25152a = f10;
                    }
                    if (canvas != null) {
                        aVar.b(canvas, i17, i16, this.f25142a);
                        i17 += f25138m + f25139n;
                    }
                }
                v0.v2(canvas);
            }
        }
    }

    public void n(byte[] bArr) {
        if (bArr == null) {
            this.f25144c = new byte[50];
            this.f25146e = 0;
        } else {
            this.f25144c = bArr;
            e();
        }
        this.f25143b = 0.0f;
        int i10 = this.f25151j;
        if (i10 != 0) {
            k(i10, true);
        }
    }

    public void o(float f10) {
        this.f25143b = f10;
    }
}
