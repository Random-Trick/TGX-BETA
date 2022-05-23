package ne;

import ae.j;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import ce.a0;
import ce.b;
import ce.o;
import ce.y;
import ib.d;
import ib.h;
import ib.i;
import java.util.HashMap;
import oc.v0;
import org.thunderdog.challegram.R;

public class i3 {
    public static TextPaint f18112i;
    public static final int f18113j = Math.round(9.900001f) * 2;
    public static i3[] f18114k;
    public static HashMap<String, Float> f18115l;
    public final Bitmap f18116a;
    public final Canvas f18117b;
    public float f18118c;
    public float f18119d;
    public int f18120e;
    public int f18121f;
    public String f18122g;
    public float f18123h;

    public i3(float f10, String str, float f11, int i10, int i11, boolean z10, float f12) {
        int l10 = l();
        Bitmap createBitmap = Bitmap.createBitmap(l10, l10, Bitmap.Config.ARGB_8888);
        this.f18116a = createBitmap;
        this.f18117b = new Canvas(createBitmap);
        e(f10, true, str, f11, i10, i11, z10, f12);
    }

    public static void b(Canvas canvas, int i10, int i11, float f10, String str) {
        c(canvas, i10, i11, f10, str, null);
    }

    public static void c(Canvas canvas, int i10, int i11, float f10, String str, i3 i3Var) {
        d(canvas, i10, i11, f10, str, i3Var, j.m(), j.l(), false, 0.0f);
    }

    public static void d(Canvas canvas, int i10, int i11, float f10, String str, i3 i3Var, int i12, int i13, boolean z10, float f11) {
        i3 i3Var2;
        float f12;
        boolean z11 = true;
        if (i3Var == null) {
            int f13 = f(f10);
            if (f13 != 0) {
                if (f18114k == null) {
                    f18114k = new i3[f18113j];
                }
                i3[] i3VarArr = f18114k;
                if (i3VarArr[f13] == null) {
                    i3Var2 = new i3(f13 / (f18113j - 1), str, g(str), i12, i13, z10, f11);
                    i3VarArr[f13] = i3Var2;
                    z11 = false;
                } else {
                    i3Var2 = i3VarArr[f13];
                }
            } else {
                return;
            }
        } else {
            i3Var2 = i3Var;
        }
        if (z11) {
            if (str == null || !i.c(str, i3Var2.f18122g)) {
                f12 = g(str);
            } else {
                f12 = i3Var2.f18123h;
            }
            i3Var2.e(f10, false, str, f12, i12, i13, z10, f11);
        }
        Bitmap bitmap = i3Var2.f18116a;
        canvas.drawBitmap(bitmap, i10 - (bitmap.getWidth() / 2.0f), i11 - (i3Var2.f18116a.getHeight() / 2.0f), y.j());
    }

    public static int f(float f10) {
        return Math.round(h.d(f10) * (f18113j - 1));
    }

    public static float g(String str) {
        if (i.i(str)) {
            return 0.0f;
        }
        Float f10 = null;
        HashMap<String, Float> hashMap = f18115l;
        if (hashMap == null) {
            f18115l = new HashMap<>();
        } else {
            f10 = hashMap.get(str);
        }
        if (f10 != null) {
            return f10.floatValue();
        }
        j();
        float T1 = v0.T1(str, f18112i);
        f18115l.put(str, Float.valueOf(T1));
        return T1;
    }

    public static i3 h(float f10, String str) {
        return i(f10, str, R.id.theme_color_checkActive, R.id.theme_color_checkContent, false, 0.0f);
    }

    public static i3 i(float f10, String str, int i10, int i11, boolean z10, float f11) {
        return new i3(f10, str, g(str), i10, i11, z10, f11);
    }

    public static void j() {
        if (f18112i == null) {
            TextPaint textPaint = new TextPaint(5);
            f18112i = textPaint;
            textPaint.setTypeface(o.g());
            f18112i.setTextSize(a0.i(12.0f));
        }
    }

    public static void k() {
        TextPaint textPaint = f18112i;
        if (textPaint != null) {
            textPaint.setTextSize(a0.i(12.0f));
        }
        if (f18114k != null) {
            int i10 = 0;
            while (true) {
                i3[] i3VarArr = f18114k;
                if (i10 < i3VarArr.length) {
                    if (i3VarArr[i10] != null) {
                        i3VarArr[i10].a();
                        f18114k[i10] = null;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static int l() {
        return a0.i(20.0f) + (a0.i(2.0f) * 2);
    }

    public void a() {
        this.f18116a.recycle();
    }

    public final void e(float f10, boolean z10, String str, float f11, int i10, int i11, boolean z11, float f12) {
        float f13;
        RectF rectF;
        RectF rectF2;
        int i12;
        if (z10 || this.f18118c != f10 || this.f18120e != i10 || this.f18121f != i11 || this.f18119d != f12 || !i.c(this.f18122g, str)) {
            this.f18118c = f10;
            this.f18120e = i10;
            this.f18121f = i11;
            this.f18122g = str;
            this.f18123h = f11;
            this.f18119d = f12;
            this.f18116a.eraseColor(0);
            int width = this.f18116a.getWidth() / 2;
            int height = this.f18116a.getHeight() / 2;
            int i13 = (int) (a0.i(10.0f) - (a0.i(1.0f) * f12));
            float f14 = i13;
            float f15 = 1.0f - f10;
            int i14 = (int) (f14 * f15);
            if (i14 < i13) {
                int i15 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                float j10 = i15 > 0 ? h.j(i13, a0.i(3.0f), f12) : f14;
                RectF a02 = y.a0();
                if (i15 > 0) {
                    a02.set(width - i13, height - i13, width + i13, i13 + height);
                    this.f18117b.drawRoundRect(a02, j10, j10, y.g(i10));
                } else {
                    this.f18117b.drawCircle(width, height, f14, y.g(i10));
                }
                if (i.i(str)) {
                    if (z11) {
                        rectF2 = a02;
                        b.c(this.f18117b, width, height, f10, i11, a0.i(8.0f));
                    } else {
                        rectF2 = a02;
                        float f16 = f10 <= 0.2f ? 0.0f : (f10 - 0.2f) / 0.8f;
                        if (f16 > 0.0f) {
                            int i16 = (f16 > 0.3f ? 1 : (f16 == 0.3f ? 0 : -1));
                            float f17 = i16 <= 0 ? f16 / 0.3f : 1.0f;
                            float f18 = i16 <= 0 ? 0.0f : (f16 - 0.3f) / 0.7f;
                            this.f18117b.save();
                            this.f18117b.translate(-a0.i(0.35f), height);
                            this.f18117b.rotate(-45.0f);
                            int i17 = a0.i(10.0f);
                            int i18 = a0.i(5.0f);
                            int i19 = a0.i(4.0f);
                            int i20 = a0.i(11.0f);
                            int i21 = a0.i(2.0f);
                            float f19 = i19;
                            rectF = rectF2;
                            f13 = j10;
                            this.f18117b.drawRect(f19, i20 - i18, i19 + i21, i12 + ((int) (i18 * f17)), y.g(i11));
                            this.f18117b.drawRect(f19, i20 - i21, i19 + ((int) (i17 * f18)), i20, y.g(i11));
                            this.f18117b.restore();
                        }
                    }
                    rectF = rectF2;
                    f13 = j10;
                } else {
                    rectF = a02;
                    f13 = j10;
                    int i22 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i22 < 0) {
                        this.f18117b.save();
                        float f20 = (0.4f * f10) + 0.6f;
                        this.f18117b.scale(f20, f20, width, height);
                        f18112i.setColor(d.a(f10, i11));
                    } else {
                        f18112i.setColor(i11);
                    }
                    this.f18117b.drawText(str, width - (f11 / 2.0f), a0.i(4.5f) + height, f18112i);
                    if (i22 < 0) {
                        this.f18117b.restore();
                    }
                }
                if (i14 == 0) {
                    return;
                }
                if (i15 > 0) {
                    this.f18117b.save();
                    this.f18117b.scale(f15, f15, width, height);
                    float f21 = f13;
                    this.f18117b.drawRoundRect(rectF, f21, f21, y.D());
                    this.f18117b.restore();
                    return;
                }
                this.f18117b.drawCircle(width, height, i14, y.D());
            }
        }
    }
}
