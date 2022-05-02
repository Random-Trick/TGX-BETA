package me;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import be.C1357a0;
import be.C1359b;
import be.C1389o;
import be.C1410y;
import java.util.HashMap;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p364zd.C11524j;

public class C6918i3 {
    public static TextPaint f21858i;
    public static final int f21859j = Math.round(9.900001f) * 2;
    public static C6918i3[] f21860k;
    public static HashMap<String, Float> f21861l;
    public final Bitmap f21862a;
    public final Canvas f21863b;
    public float f21864c;
    public float f21865d;
    public int f21866e;
    public int f21867f;
    public String f21868g;
    public float f21869h;

    public C6918i3(float f, String str, float f2, int i, int i2, boolean z, float f3) {
        int l = m18456l();
        Bitmap createBitmap = Bitmap.createBitmap(l, l, Bitmap.Config.ARGB_8888);
        this.f21862a = createBitmap;
        this.f21863b = new Canvas(createBitmap);
        m18463e(f, true, str, f2, i, i2, z, f3);
    }

    public static void m18466b(Canvas canvas, int i, int i2, float f, String str) {
        m18465c(canvas, i, i2, f, str, null);
    }

    public static void m18465c(Canvas canvas, int i, int i2, float f, String str, C6918i3 i3Var) {
        m18464d(canvas, i, i2, f, str, i3Var, C11524j.m168m(), C11524j.m170l(), false, 0.0f);
    }

    public static void m18464d(Canvas canvas, int i, int i2, float f, String str, C6918i3 i3Var, int i3, int i4, boolean z, float f2) {
        C6918i3 i3Var2;
        float f3;
        boolean z2 = true;
        if (i3Var == null) {
            int f4 = m18462f(f);
            if (f4 != 0) {
                if (f21860k == null) {
                    f21860k = new C6918i3[f21859j];
                }
                C6918i3[] i3VarArr = f21860k;
                if (i3VarArr[f4] == null) {
                    i3Var2 = new C6918i3(f4 / (f21859j - 1), str, m18461g(str), i3, i4, z, f2);
                    i3VarArr[f4] = i3Var2;
                    z2 = false;
                } else {
                    i3Var2 = i3VarArr[f4];
                }
            } else {
                return;
            }
        } else {
            i3Var2 = i3Var;
        }
        if (z2) {
            if (str == null || !C5070i.m24068c(str, i3Var2.f21868g)) {
                f3 = m18461g(str);
            } else {
                f3 = i3Var2.f21869h;
            }
            i3Var2.m18463e(f, false, str, f3, i3, i4, z, f2);
        }
        Bitmap bitmap = i3Var2.f21862a;
        canvas.drawBitmap(bitmap, i - (bitmap.getWidth() / 2.0f), i2 - (i3Var2.f21862a.getHeight() / 2.0f), C1410y.m37036j());
    }

    public static int m18462f(float f) {
        return Math.round(C5069h.m24090d(f) * (f21859j - 1));
    }

    public static float m18461g(String str) {
        if (C5070i.m24062i(str)) {
            return 0.0f;
        }
        Float f = null;
        HashMap<String, Float> hashMap = f21861l;
        if (hashMap == null) {
            f21861l = new HashMap<>();
        } else {
            f = hashMap.get(str);
        }
        if (f != null) {
            return f.floatValue();
        }
        m18458j();
        float T1 = C7389v0.m16680T1(str, f21858i);
        f21861l.put(str, Float.valueOf(T1));
        return T1;
    }

    public static C6918i3 m18460h(float f, String str) {
        return m18459i(f, str, R.id.theme_color_checkActive, R.id.theme_color_checkContent, false, 0.0f);
    }

    public static C6918i3 m18459i(float f, String str, int i, int i2, boolean z, float f2) {
        return new C6918i3(f, str, m18461g(str), i, i2, z, f2);
    }

    public static void m18458j() {
        if (f21858i == null) {
            TextPaint textPaint = new TextPaint(5);
            f21858i = textPaint;
            textPaint.setTypeface(C1389o.m37265g());
            f21858i.setTextSize(C1357a0.m37544i(12.0f));
        }
    }

    public static void m18457k() {
        TextPaint textPaint = f21858i;
        if (textPaint != null) {
            textPaint.setTextSize(C1357a0.m37544i(12.0f));
        }
        if (f21860k != null) {
            int i = 0;
            while (true) {
                C6918i3[] i3VarArr = f21860k;
                if (i < i3VarArr.length) {
                    if (i3VarArr[i] != null) {
                        i3VarArr[i].m18467a();
                        f21860k[i] = null;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static int m18456l() {
        return C1357a0.m37544i(20.0f) + (C1357a0.m37544i(2.0f) * 2);
    }

    public void m18467a() {
        this.f21862a.recycle();
    }

    public final void m18463e(float f, boolean z, String str, float f2, int i, int i2, boolean z2, float f3) {
        float f4;
        RectF rectF;
        RectF rectF2;
        int i3;
        if (z || this.f21864c != f || this.f21866e != i || this.f21867f != i2 || this.f21865d != f3 || !C5070i.m24068c(this.f21868g, str)) {
            this.f21864c = f;
            this.f21866e = i;
            this.f21867f = i2;
            this.f21868g = str;
            this.f21869h = f2;
            this.f21865d = f3;
            this.f21862a.eraseColor(0);
            int width = this.f21862a.getWidth() / 2;
            int height = this.f21862a.getHeight() / 2;
            int i4 = (int) (C1357a0.m37544i(10.0f) - (C1357a0.m37544i(1.0f) * f3));
            float f5 = i4;
            float f6 = 1.0f - f;
            int i5 = (int) (f5 * f6);
            if (i5 < i4) {
                int i6 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                float j = i6 > 0 ? C5069h.m24084j(i4, C1357a0.m37544i(3.0f), f3) : f5;
                RectF a0 = C1410y.m37053a0();
                if (i6 > 0) {
                    a0.set(width - i4, height - i4, width + i4, i4 + height);
                    this.f21863b.drawRoundRect(a0, j, j, C1410y.m37042g(i));
                } else {
                    this.f21863b.drawCircle(width, height, f5, C1410y.m37042g(i));
                }
                if (C5070i.m24062i(str)) {
                    if (z2) {
                        rectF2 = a0;
                        C1359b.m37519c(this.f21863b, width, height, f, i2, C1357a0.m37544i(8.0f));
                    } else {
                        rectF2 = a0;
                        float f7 = f <= 0.2f ? 0.0f : (f - 0.2f) / 0.8f;
                        if (f7 > 0.0f) {
                            int i7 = (f7 > 0.3f ? 1 : (f7 == 0.3f ? 0 : -1));
                            float f8 = i7 <= 0 ? f7 / 0.3f : 1.0f;
                            float f9 = i7 <= 0 ? 0.0f : (f7 - 0.3f) / 0.7f;
                            this.f21863b.save();
                            this.f21863b.translate(-C1357a0.m37544i(0.35f), height);
                            this.f21863b.rotate(-45.0f);
                            int i8 = C1357a0.m37544i(10.0f);
                            int i9 = C1357a0.m37544i(5.0f);
                            int i10 = C1357a0.m37544i(4.0f);
                            int i11 = C1357a0.m37544i(11.0f);
                            int i12 = C1357a0.m37544i(2.0f);
                            float f10 = i10;
                            rectF = rectF2;
                            f4 = j;
                            this.f21863b.drawRect(f10, i11 - i9, i10 + i12, i3 + ((int) (i9 * f8)), C1410y.m37042g(i2));
                            this.f21863b.drawRect(f10, i11 - i12, i10 + ((int) (i8 * f9)), i11, C1410y.m37042g(i2));
                            this.f21863b.restore();
                        }
                    }
                    rectF = rectF2;
                    f4 = j;
                } else {
                    rectF = a0;
                    f4 = j;
                    int i13 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                    if (i13 < 0) {
                        this.f21863b.save();
                        float f11 = (0.4f * f) + 0.6f;
                        this.f21863b.scale(f11, f11, width, height);
                        f21858i.setColor(C5064d.m24132a(f, i2));
                    } else {
                        f21858i.setColor(i2);
                    }
                    this.f21863b.drawText(str, width - (f2 / 2.0f), C1357a0.m37544i(4.5f) + height, f21858i);
                    if (i13 < 0) {
                        this.f21863b.restore();
                    }
                }
                if (i5 == 0) {
                    return;
                }
                if (i6 > 0) {
                    this.f21863b.save();
                    this.f21863b.scale(f6, f6, width, height);
                    float f12 = f4;
                    this.f21863b.drawRoundRect(rectF, f12, f12, C1410y.m37081D());
                    this.f21863b.restore();
                    return;
                }
                this.f21863b.drawCircle(width, height, i5, C1410y.m37081D());
            }
        }
    }
}
