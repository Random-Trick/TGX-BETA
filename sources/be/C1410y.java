package be;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Looper;
import android.text.TextPaint;
import ie.C5386e;
import ie.C5457w0;
import java.lang.ref.SoftReference;
import me.RunnableC6969m2;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p143k0.C6038h;
import p181mb.C6815f;
import p364zd.C11524j;
import p364zd.C11541z;

public class C1410y {
    public static TextPaint f5108A;
    public static TextPaint f5109B;
    public static TextPaint f5110C;
    public static Paint f5111D;
    public static Paint f5112E;
    public static Paint f5113F;
    public static Paint f5114G;
    public static Paint f5115H;
    public static int f5116I;
    public static int f5117J;
    public static int f5118K;
    public static int f5119L;
    public static int f5120M;
    public static Paint f5121N;
    public static C6038h<PorterDuffColorFilter> f5122O;
    public static PorterDuffColorFilter f5123P;
    public static int f5124Q;
    public static int f5125R;
    public static Paint f5126S;
    public static int f5127T;
    public static Paint f5128U;
    public static float f5129V;
    public static Paint f5130W;
    public static RectF f5131X;
    public static Path f5132Y;
    public static Rect f5133Z;
    public static Paint f5134a;
    public static C6815f<Paint.FontMetricsInt> f5135a0;
    public static Paint f5136b;
    public static TextPaint f5137b0;
    public static TextPaint f5138c;
    public static TextPaint f5139c0;
    public static TextPaint f5140d;
    public static Paint f5141d0;
    public static TextPaint f5142e;
    public static int f5143e0;
    public static TextPaint f5144f;
    public static Paint f5145f0;
    public static Paint f5146g;
    public static Paint f5147g0;
    public static int f5148h;
    public static Paint f5149h0;
    public static int f5150i;
    public static TextPaint f5151i0;
    public static Paint f5152j;
    public static C6815f<TextPaint> f5153j0;
    public static Paint f5154k;
    public static C6815f<TextPaint> f5155k0;
    public static int f5156l;
    public static C6815f<TextPaint> f5157l0;
    public static Paint f5158m;
    public static C6815f<TextPaint> f5159m0;
    public static int f5160n;
    public static TextPaint f5161n0;
    public static float f5162o;
    public static TextPaint f5163o0;
    public static float f5164p;
    public static C6038h<C5457w0> f5165p0;
    public static C6815f<SoftReference<TextPaint>> f5166q;
    public static C5457w0 f5167q0;
    public static C6815f<SoftReference<TextPaint>> f5168r;
    public static C5457w0 f5169r0;
    public static TextPaint f5170s;
    public static TextPaint f5171t;
    public static TextPaint f5172u;
    public static TextPaint f5173v;
    public static TextPaint f5174w;
    public static TextPaint f5175x;
    public static TextPaint f5176y;
    public static TextPaint f5177z;

    public static TextPaint m37087A() {
        if (f5142e == null) {
            TextPaint textPaint = new TextPaint(5);
            f5142e = textPaint;
            int S0 = C11524j.m217S0();
            f5148h = S0;
            textPaint.setColor(S0);
            f5142e.setTypeface(C1389o.m37261k());
            f5142e.setTextSize(C1357a0.m37544i(14.0f));
        }
        return f5142e;
    }

    public static C5457w0 m37086A0(float f) {
        if (f == 15.0f) {
            if (f5167q0 == null) {
                f5167q0 = new C5457w0(C1389o.m37248x()).m22656m(15.0f);
            }
            return f5167q0;
        } else if (f == 13.0f) {
            if (f5169r0 == null) {
                f5169r0 = new C5457w0(C1389o.m37248x()).m22656m(13.0f);
            }
            return f5169r0;
        } else {
            if (f5165p0 == null) {
                f5165p0 = new C6038h<>();
            }
            int floatToIntBits = Float.floatToIntBits(f);
            int g = f5165p0.m21470g(floatToIntBits);
            if (g >= 0) {
                return f5165p0.m21463o(g);
            }
            C6038h<C5457w0> hVar = f5165p0;
            C5457w0 m = new C5457w0(C1389o.m37248x()).m22656m(f);
            hVar.m21467j(floatToIntBits, m);
            return m;
        }
    }

    public static TextPaint m37085B(int i) {
        TextPaint A = m37087A();
        if (f5148h != i) {
            f5148h = i;
            A.setColor(i);
        }
        return f5142e;
    }

    public static Paint m37084B0(int i) {
        Paint paint = f5158m;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5158m = paint2;
            paint2.setStyle(Paint.Style.FILL);
            float max = Math.max(1.0f, C1357a0.m37542k(0.5f));
            f5158m.setShadowLayer(max, 0.0f, max, 1509949440);
            Paint paint3 = f5158m;
            f5160n = i;
            paint3.setColor(i);
        } else if (f5160n != i) {
            f5160n = i;
            paint.setColor(i);
        }
        return f5158m;
    }

    public static Paint m37083C() {
        return C1411z.m37001b(R.id.theme_color_textLight);
    }

    public static <T extends Paint> T m37082C0(T t, float f) {
        t.setTextSize(C1357a0.m37544i(f));
        return t;
    }

    public static Paint m37081D() {
        if (f5145f0 == null) {
            synchronized (C1410y.class) {
                if (f5145f0 == null) {
                    Paint paint = new Paint(3);
                    f5145f0 = paint;
                    paint.setColor(0);
                    f5145f0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
            }
        }
        return f5145f0;
    }

    public static Paint m37080D0(int i) {
        if (f5154k == null) {
            Paint paint = new Paint(5);
            f5154k = paint;
            paint.setStyle(Paint.Style.STROKE);
            f5154k.setStrokeWidth(C1357a0.m37544i(2.0f));
        }
        f5154k.setColor(i);
        return f5154k;
    }

    public static Paint.FontMetricsInt m37079E(TextPaint textPaint) {
        if (f5135a0 == null) {
            synchronized (C1410y.class) {
                if (f5135a0 == null) {
                    f5135a0 = new C6815f<>();
                }
            }
        }
        Paint.FontMetricsInt a = f5135a0.m18902a();
        if (a == null) {
            C6815f<Paint.FontMetricsInt> fVar = f5135a0;
            Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
            fVar.m18901b(fontMetricsInt);
            a = fontMetricsInt;
        }
        textPaint.getFontMetricsInt(a);
        return a;
    }

    public static Paint m37078E0(int i) {
        Paint paint = f5152j;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5152j = paint2;
            f5156l = i;
            paint2.setColor(i);
            f5152j.setStyle(Paint.Style.STROKE);
            f5152j.setStrokeWidth(C1357a0.m37529x());
        } else if (f5156l != i) {
            f5156l = i;
            paint.setColor(i);
        }
        return f5152j;
    }

    public static Paint m37077F() {
        return C1411z.m37001b(R.id.theme_color_textSecure);
    }

    public static Paint m37076F0() {
        if (f5146g == null) {
            Paint paint = new Paint(5);
            f5146g = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f5146g.setStyle(Paint.Style.STROKE);
            f5146g.setColor(-1610612737);
            f5146g.setStrokeWidth(C1357a0.m37544i(3.0f));
        }
        return f5146g;
    }

    public static Paint m37075G() {
        return C1411z.m37001b(R.id.theme_color_headerButtonIcon);
    }

    public static TextPaint m37074G0(float f, boolean z, boolean z2) {
        if (z2 && Looper.myLooper() != Looper.getMainLooper()) {
            TextPaint textPaint = null;
            synchronized (C1410y.class) {
                C6815f<SoftReference<TextPaint>> fVar = z ? f5166q : f5168r;
                if (fVar == null) {
                    fVar = new C6815f<>();
                    if (z) {
                        f5166q = fVar;
                    } else {
                        f5168r = fVar;
                    }
                }
                SoftReference<TextPaint> a = fVar.m18902a();
                if (a != null) {
                    textPaint = a.get();
                }
                if (textPaint == null) {
                    textPaint = m37007x0(z);
                    fVar.m18901b(new SoftReference<>(textPaint));
                }
                textPaint.setTextSize(C1357a0.m37544i(f));
            }
            return textPaint;
        } else if (z) {
            TextPaint textPaint2 = f5140d;
            if (textPaint2 == null) {
                TextPaint x0 = m37007x0(true);
                f5140d = x0;
                f5164p = f;
                x0.setTextSize(C1357a0.m37544i(f));
            } else if (f5164p != f) {
                f5164p = f;
                textPaint2.setTextSize(C1357a0.m37544i(f));
            }
            return f5140d;
        } else {
            TextPaint textPaint3 = f5138c;
            if (textPaint3 == null) {
                TextPaint x02 = m37007x0(false);
                f5138c = x02;
                f5162o = f;
                x02.setTextSize(C1357a0.m37544i(f));
            } else if (f5162o != f) {
                f5162o = f;
                textPaint3.setTextSize(C1357a0.m37544i(f));
            }
            return f5138c;
        }
    }

    public static Paint m37073H() {
        return C1411z.m37001b(R.id.theme_color_headerIcon);
    }

    public static Paint m37072I() {
        return C1411z.m37001b(R.id.theme_color_headerText);
    }

    public static Paint m37071J() {
        return C1411z.m37001b(R.id.theme_color_icon);
    }

    public static Paint m37070K() {
        return C1411z.m37001b(R.id.theme_color_iconLight);
    }

    public static Paint m37069L(int i) {
        Paint paint = f5113F;
        if (paint == null || f5119L != i) {
            f5119L = i;
            f5113F = m37050c(paint, i);
        }
        return f5113F;
    }

    public static Paint m37068M() {
        if (f5111D == null) {
            Paint paint = new Paint(5);
            f5111D = paint;
            paint.setStrokeWidth(C1357a0.m37544i(1.5f));
            f5111D.setStyle(Paint.Style.STROKE);
        }
        return f5111D;
    }

    public static Paint m37067N(boolean z) {
        return C1411z.m37001b(z ? R.id.theme_color_bubbleOut_inlineIcon : R.id.theme_color_inlineIcon);
    }

    public static TextPaint m37066O(float f, int i, boolean z) {
        return (TextPaint) m37054a(m37065P(f, z), i);
    }

    public static TextPaint m37065P(float f, boolean z) {
        if (z) {
            if (f5157l0 == null) {
                synchronized (C1410y.class) {
                    if (f5157l0 == null) {
                        f5157l0 = new C6815f<>();
                    }
                }
            }
            TextPaint a = f5157l0.m18902a();
            if (a == null) {
                a = m37009w0(C1389o.m37261k());
                a.setFakeBoldText(true);
                f5157l0.m18901b(a);
            }
            return (TextPaint) m37082C0(a, f);
        }
        if (f5155k0 == null) {
            synchronized (C1410y.class) {
                if (f5155k0 == null) {
                    f5155k0 = new C6815f<>();
                }
            }
        }
        TextPaint a2 = f5155k0.m18902a();
        if (a2 == null) {
            C6815f<TextPaint> fVar = f5155k0;
            TextPaint w0 = m37009w0(C1389o.m37263i());
            fVar.m18901b(w0);
            a2 = w0;
        }
        return (TextPaint) m37082C0(a2, f);
    }

    public static Paint m37064Q() {
        return C1411z.m37001b(R.id.theme_color_playerCoverIcon);
    }

    public static Paint m37063R(int i) {
        Paint paint = f5141d0;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5141d0 = paint2;
            paint2.setStrokeWidth(C1357a0.m37544i(2.0f));
            Paint paint3 = f5141d0;
            f5143e0 = i;
            paint3.setColor(i);
            f5141d0.setStyle(Paint.Style.STROKE);
        } else if (f5143e0 != i) {
            f5143e0 = i;
            paint.setColor(i);
        }
        return f5141d0;
    }

    public static Paint m37062S() {
        return C1411z.m37001b(R.id.theme_color_passcodeIcon);
    }

    public static Path m37061T() {
        if (f5132Y == null) {
            f5132Y = new Path();
        }
        return f5132Y;
    }

    public static Paint m37060U() {
        if (f5136b == null) {
            Paint paint = new Paint(5);
            f5136b = paint;
            paint.setStyle(Paint.Style.FILL);
            f5136b.setColor(C11524j.m241G0());
            C11541z.m24e(f5136b, R.id.theme_color_placeholder);
        }
        return f5136b;
    }

    public static Paint m37059V(int i, Paint.Style style) {
        if (f5130W == null) {
            Paint paint = new Paint(5);
            f5130W = paint;
            paint.setPathEffect(new CornerPathEffect(C1357a0.m37544i(1.5f)));
        }
        f5130W.setStyle(style);
        f5130W.setColor(i);
        return f5130W;
    }

    public static Paint m37058W(int i) {
        if (i == -1) {
            return C1411z.m37001b(R.id.theme_color_white);
        }
        PorterDuffColorFilter z = m37004z(i);
        Paint paint = f5121N;
        if (paint == null) {
            Paint paint2 = new Paint(7);
            f5121N = paint2;
            paint2.setColorFilter(z);
            f5120M = i;
        } else if (f5120M != i) {
            f5120M = i;
            paint.setColorFilter(z);
        }
        return f5121N;
    }

    public static Paint m37057X(int i) {
        Paint paint = f5126S;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5126S = paint2;
            paint2.setStrokeWidth(C1357a0.m37544i(1.5f));
            f5126S.setStyle(Paint.Style.STROKE);
            if (RunnableC6969m2.f22044k0) {
                f5126S.setStrokeCap(Paint.Cap.ROUND);
            }
            Paint paint3 = f5126S;
            f5125R = i;
            paint3.setColor(i);
        } else if (f5125R != i) {
            f5125R = i;
            paint.setColor(i);
        }
        return f5126S;
    }

    public static Paint m37056Y(int i, float f) {
        Paint paint = f5128U;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5128U = paint2;
            f5129V = f;
            paint2.setStrokeWidth(f);
            f5128U.setStyle(Paint.Style.STROKE);
            if (RunnableC6969m2.f22044k0) {
                f5128U.setStrokeCap(Paint.Cap.ROUND);
            }
            Paint paint3 = f5128U;
            f5127T = i;
            paint3.setColor(i);
        } else {
            if (f5127T != i) {
                f5127T = i;
                paint.setColor(i);
            }
            if (f5129V != f) {
                Paint paint4 = f5128U;
                f5129V = f;
                paint4.setStrokeWidth(f);
            }
        }
        return f5128U;
    }

    public static Rect m37055Z() {
        if (f5133Z == null) {
            f5133Z = new Rect();
        }
        return f5133Z;
    }

    public static <T extends Paint> T m37054a(T t, int i) {
        t.setColor(i);
        return t;
    }

    public static RectF m37053a0() {
        if (f5131X == null) {
            f5131X = new RectF();
        }
        return f5131X;
    }

    public static PorterDuffColorFilter m37052b(int i) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public static TextPaint m37051b0(float f) {
        if (f5153j0 == null) {
            synchronized (C1410y.class) {
                if (f5153j0 == null) {
                    f5153j0 = new C6815f<>();
                }
            }
        }
        TextPaint a = f5153j0.m18902a();
        if (a == null) {
            C6815f<TextPaint> fVar = f5153j0;
            TextPaint w0 = m37009w0(C1389o.m37261k());
            fVar.m18901b(w0);
            a = w0;
        }
        return (TextPaint) m37082C0(a, f);
    }

    public static Paint m37050c(Paint paint, int i) {
        if (paint == null) {
            paint = new Paint(7);
        }
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        paint.setColor(i);
        return paint;
    }

    public static TextPaint m37049c0(float f, int i) {
        return (TextPaint) m37054a(m37051b0(f), i);
    }

    public static void m37048d(Canvas canvas, C5386e eVar, float f, float f2, float f3) {
        canvas.drawText(eVar.f17711a, f, f2, m37074G0(f3, eVar.f17712b, false));
    }

    public static Paint m37047d0() {
        return C1411z.m37001b(R.id.theme_color_chatSendButton);
    }

    public static void m37046e(Canvas canvas, C5386e eVar, float f, float f2, float f3, float f4) {
        if (f4 == 1.0f) {
            canvas.drawText(eVar.f17711a, f, f2, m37074G0(f3, eVar.f17712b, false));
        } else if (f4 > 0.0f) {
            TextPaint G0 = m37074G0(f3, eVar.f17712b, false);
            G0.setAlpha((int) (f4 * 255.0f));
            canvas.drawText(eVar.f17711a, f, f2, G0);
            G0.setAlpha(255);
        }
    }

    public static TextPaint m37045e0() {
        if (f5144f == null) {
            TextPaint textPaint = new TextPaint(5);
            f5144f = textPaint;
            textPaint.setColor(C11524j.m217S0());
            f5144f.setTextSize(C1357a0.m37544i(13.0f));
            f5144f.setTypeface(C1389o.m37261k());
            C11541z.m24e(f5144f, R.id.theme_color_text);
        }
        return f5144f;
    }

    public static TextPaint m37044f() {
        if (f5151i0 == null) {
            synchronized (C1410y.class) {
                if (f5151i0 == null) {
                    TextPaint textPaint = new TextPaint(7);
                    f5151i0 = textPaint;
                    textPaint.setTextSize(C1357a0.m37544i(17.0f));
                }
            }
        }
        return f5151i0;
    }

    public static TextPaint m37043f0() {
        if (f5110C == null) {
            TextPaint textPaint = new TextPaint(5);
            f5110C = textPaint;
            textPaint.setColor(C11524j.m213U0());
            f5110C.setTextSize(C1357a0.m37544i(13.0f));
            f5110C.setTypeface(C1389o.m37261k());
            C11541z.m24e(f5110C, R.id.theme_color_textLight);
        }
        return f5110C;
    }

    public static Paint m37042g(int i) {
        Paint paint = f5134a;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5134a = paint2;
            paint2.setStyle(Paint.Style.FILL);
            Paint paint3 = f5134a;
            f5150i = i;
            paint3.setColor(i);
        } else if (f5150i != i) {
            f5150i = i;
            paint.setColor(i);
        }
        return f5134a;
    }

    public static C5457w0 m37041g0() {
        return m37086A0(13.0f);
    }

    public static Paint m37040h() {
        return C1411z.m37001b(R.id.theme_color_iconActive);
    }

    public static TextPaint m37039h0() {
        if (f5163o0 == null) {
            synchronized (C1410y.class) {
                if (f5163o0 == null) {
                    f5163o0 = m37009w0(C1389o.m37261k());
                }
            }
        }
        return (TextPaint) m37082C0(f5163o0, 15.0f);
    }

    public static Paint m37038i() {
        return C1411z.m37001b(R.id.theme_color_background_icon);
    }

    public static TextPaint m37037i0(int i) {
        return (TextPaint) m37054a(m37039h0(), i);
    }

    public static Paint m37036j() {
        if (f5149h0 == null) {
            synchronized (C1410y.class) {
                if (f5149h0 == null) {
                    f5149h0 = new Paint(7);
                }
            }
        }
        return f5149h0;
    }

    public static TextPaint m37035j0() {
        if (f5161n0 == null) {
            synchronized (C1410y.class) {
                if (f5161n0 == null) {
                    f5161n0 = m37009w0(C1389o.m37261k());
                }
            }
        }
        return (TextPaint) m37082C0(f5161n0, 16.0f);
    }

    public static TextPaint m37034k(boolean z) {
        if (z) {
            if (f5172u == null) {
                TextPaint textPaint = new TextPaint(5);
                f5172u = textPaint;
                textPaint.setTextSize(C1357a0.m37544i(13.0f));
                f5172u.setTypeface(C1389o.m37261k());
                f5172u.setFakeBoldText(true);
            }
            return f5172u;
        }
        if (f5173v == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5173v = textPaint2;
            textPaint2.setTextSize(C1357a0.m37544i(13.0f));
            f5173v.setTypeface(C1389o.m37263i());
        }
        return f5173v;
    }

    public static TextPaint m37033k0(int i) {
        return (TextPaint) m37054a(m37035j0(), i);
    }

    public static TextPaint m37032l(boolean z, int i) {
        TextPaint k = m37034k(z);
        k.setColor(i);
        return k;
    }

    public static Paint m37031l0() {
        return C1411z.m37001b(R.id.theme_color_ticks);
    }

    public static TextPaint m37030m(boolean z) {
        if (z) {
            if (f5174w == null) {
                TextPaint textPaint = new TextPaint(5);
                f5174w = textPaint;
                textPaint.setTextSize(C1357a0.m37544i(15.0f));
                f5174w.setTypeface(C1389o.m37261k());
                f5174w.setFakeBoldText(true);
            }
            return f5174w;
        }
        if (f5175x == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5175x = textPaint2;
            textPaint2.setTextSize(C1357a0.m37544i(15.0f));
            f5175x.setTypeface(C1389o.m37263i());
        }
        return f5175x;
    }

    public static Paint m37029m0() {
        return C1411z.m37001b(R.id.theme_color_ticksRead);
    }

    public static TextPaint m37028n(boolean z, int i) {
        TextPaint m = m37030m(z);
        m.setColor(i);
        return m;
    }

    public static TextPaint m37027n0() {
        return m37025o0(false);
    }

    public static TextPaint m37026o(boolean z) {
        if (z) {
            if (f5170s == null) {
                TextPaint textPaint = new TextPaint(5);
                f5170s = textPaint;
                textPaint.setTextSize(C1357a0.m37544i(15.0f));
                f5170s.setTypeface(C1389o.m37261k());
                f5170s.setFakeBoldText(true);
            }
            return f5170s;
        }
        if (f5171t == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5171t = textPaint2;
            textPaint2.setTextSize(C1357a0.m37544i(15.0f));
            f5171t.setTypeface(C1389o.m37263i());
        }
        return f5171t;
    }

    public static TextPaint m37025o0(boolean z) {
        if (z) {
            if (f5109B == null) {
                TextPaint textPaint = new TextPaint(5);
                f5109B = textPaint;
                textPaint.setColor(C11524j.m217S0());
                f5109B.setTextSize(C1357a0.m37544i(16.0f));
                f5109B.setTypeface(C1389o.m37261k());
                f5109B.setFakeBoldText(true);
                C11541z.m24e(f5109B, R.id.theme_color_text);
            }
            return f5109B;
        }
        if (f5108A == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5108A = textPaint2;
            textPaint2.setColor(C11524j.m217S0());
            f5108A.setTextSize(C1357a0.m37544i(16.0f));
            f5108A.setTypeface(C1389o.m37263i());
            C11541z.m24e(f5108A, R.id.theme_color_text);
        }
        return f5108A;
    }

    public static TextPaint m37024p(boolean z, int i) {
        TextPaint o = m37026o(z);
        o.setColor(i);
        return o;
    }

    public static TextPaint m37023p0(boolean z) {
        if (z) {
            if (f5177z == null) {
                TextPaint textPaint = new TextPaint(5);
                f5177z = textPaint;
                textPaint.setColor(C11524j.m217S0());
                f5177z.setTextSize(C1357a0.m37544i(15.0f));
                f5177z.setTypeface(C1389o.m37261k());
                f5177z.setFakeBoldText(true);
                C11541z.m24e(f5177z, R.id.theme_color_text);
            }
            return f5177z;
        }
        if (f5176y == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5176y = textPaint2;
            textPaint2.setColor(C11524j.m217S0());
            f5176y.setTextSize(C1357a0.m37544i(15.0f));
            f5176y.setTypeface(C1389o.m37263i());
            C11541z.m24e(f5176y, R.id.theme_color_text);
        }
        return f5176y;
    }

    public static TextPaint m37022q(float f) {
        if (f5159m0 == null) {
            synchronized (C1410y.class) {
                if (f5159m0 == null) {
                    f5159m0 = new C6815f<>();
                }
            }
        }
        TextPaint a = f5159m0.m18902a();
        if (a == null) {
            C6815f<TextPaint> fVar = f5159m0;
            TextPaint w0 = m37009w0(C1389o.m37265g());
            fVar.m18901b(w0);
            a = w0;
        }
        return (TextPaint) m37082C0(a, f);
    }

    public static C5457w0 m37021q0() {
        return m37086A0(15.0f);
    }

    public static TextPaint m37020r(float f, int i) {
        return (TextPaint) m37054a(m37022q(f), i);
    }

    public static Paint m37019r0(int i) {
        Paint paint = f5112E;
        if (paint == null || f5118K != i) {
            f5118K = i;
            f5112E = m37050c(paint, i);
        }
        return f5112E;
    }

    public static Paint m37018s() {
        return C1411z.m37001b(R.id.theme_color_bubbleIn_time);
    }

    public static Paint m37017s0() {
        return C1411z.m37001b(R.id.theme_color_chatListVerify);
    }

    public static Paint m37016t() {
        return C1411z.m37001b(R.id.theme_color_bubbleOut_time);
    }

    public static TextPaint m37015t0(int i, boolean z) {
        if (z) {
            if (f5139c0 == null) {
                TextPaint textPaint = new TextPaint(5);
                f5139c0 = textPaint;
                textPaint.setTypeface(C1389o.m37261k());
                f5139c0.setFakeBoldText(true);
                f5139c0.setTextSize(C1357a0.m37544i(14.0f));
            }
            f5139c0.setColor(i);
            return f5139c0;
        }
        if (f5137b0 == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5137b0 = textPaint2;
            textPaint2.setTypeface(C1389o.m37263i());
            f5137b0.setTextSize(C1357a0.m37544i(14.0f));
        }
        f5137b0.setColor(i);
        return f5137b0;
    }

    public static Paint m37014u(int i) {
        Paint paint = f5115H;
        if (paint == null || f5117J != i) {
            f5117J = i;
            f5115H = m37050c(paint, i);
        }
        return f5115H;
    }

    public static Paint m37013u0() {
        if (f5147g0 == null) {
            synchronized (C1410y.class) {
                if (f5147g0 == null) {
                    Paint paint = new Paint(3);
                    f5147g0 = paint;
                    paint.setColor(0);
                    f5147g0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                }
            }
        }
        return f5147g0;
    }

    public static Paint m37012v() {
        return C1411z.m37001b(R.id.theme_color_bubbleOut_ticks);
    }

    public static int m37011v0(C5386e eVar, float f) {
        if (eVar != null) {
            return (int) C7389v0.m16680T1(eVar.f17711a, m37074G0(f, eVar.f17712b, true));
        }
        return 0;
    }

    public static Paint m37010w() {
        return C1411z.m37001b(R.id.theme_color_bubbleOut_ticksRead);
    }

    public static TextPaint m37009w0(Typeface typeface) {
        TextPaint textPaint = new TextPaint(5);
        textPaint.setTypeface(typeface);
        return textPaint;
    }

    public static Paint m37008x(int i) {
        Paint paint = f5114G;
        if (paint == null || f5116I != i) {
            f5116I = i;
            f5114G = m37050c(paint, i);
        }
        return f5114G;
    }

    public static TextPaint m37007x0(boolean z) {
        TextPaint textPaint = new TextPaint(5);
        textPaint.setColor(-1);
        if (z) {
            textPaint.setTypeface(C1389o.m37261k());
            textPaint.setFakeBoldText(true);
        } else {
            textPaint.setTypeface(C1389o.m37263i());
        }
        return textPaint;
    }

    public static Paint m37006y() {
        return C1411z.m37001b(R.id.theme_color_chatListMute);
    }

    public static void m37005y0() {
        Paint paint = f5146g;
        if (paint != null) {
            paint.setStrokeWidth(C1357a0.m37544i(3.0f));
        }
        TextPaint textPaint = f5144f;
        if (textPaint != null) {
            textPaint.setTextSize(C1357a0.m37544i(13.0f));
        }
        TextPaint textPaint2 = f5142e;
        if (textPaint2 != null) {
            textPaint2.setTextSize(C1357a0.m37544i(14.0f));
        }
        Paint paint2 = f5152j;
        if (paint2 != null) {
            paint2.setStrokeWidth(C1357a0.m37529x());
        }
        Paint paint3 = f5154k;
        if (paint3 != null) {
            paint3.setStrokeWidth(C1357a0.m37544i(2.0f));
        }
        if (f5158m != null) {
            float max = Math.max(1.0f, C1357a0.m37542k(0.5f));
            f5158m.setShadowLayer(max, 0.0f, max, 1509949440);
        }
        TextPaint textPaint3 = f5170s;
        if (textPaint3 != null) {
            textPaint3.setTextSize(C1357a0.m37544i(15.0f));
        }
        TextPaint textPaint4 = f5171t;
        if (textPaint4 != null) {
            textPaint4.setTextSize(C1357a0.m37544i(15.0f));
        }
        TextPaint textPaint5 = f5175x;
        if (textPaint5 != null) {
            textPaint5.setTextSize(C1357a0.m37544i(15.0f));
        }
        TextPaint textPaint6 = f5174w;
        if (textPaint6 != null) {
            textPaint6.setTextSize(C1357a0.m37544i(15.0f));
        }
        TextPaint textPaint7 = f5172u;
        if (textPaint7 != null) {
            textPaint7.setTextSize(C1357a0.m37544i(13.0f));
        }
        TextPaint textPaint8 = f5173v;
        if (textPaint8 != null) {
            textPaint8.setTextSize(C1357a0.m37544i(13.0f));
        }
        TextPaint textPaint9 = f5177z;
        if (textPaint9 != null) {
            textPaint9.setTextSize(C1357a0.m37544i(15.0f));
        }
        TextPaint textPaint10 = f5176y;
        if (textPaint10 != null) {
            textPaint10.setTextSize(C1357a0.m37544i(15.0f));
        }
        TextPaint textPaint11 = f5109B;
        if (textPaint11 != null) {
            textPaint11.setTextSize(C1357a0.m37544i(16.0f));
        }
        TextPaint textPaint12 = f5108A;
        if (textPaint12 != null) {
            textPaint12.setTextSize(C1357a0.m37544i(16.0f));
        }
        TextPaint textPaint13 = f5110C;
        if (textPaint13 != null) {
            textPaint13.setTextSize(C1357a0.m37544i(13.0f));
        }
        Paint paint4 = f5111D;
        if (paint4 != null) {
            paint4.setStrokeWidth(C1357a0.m37544i(1.5f));
        }
        Paint paint5 = f5126S;
        if (paint5 != null) {
            paint5.setStrokeWidth(C1357a0.m37544i(1.5f));
        }
        Paint paint6 = f5130W;
        if (paint6 != null) {
            paint6.setPathEffect(new CornerPathEffect(C1357a0.m37544i(1.5f)));
        }
        TextPaint textPaint14 = f5139c0;
        if (textPaint14 != null) {
            textPaint14.setTextSize(C1357a0.m37544i(14.0f));
        }
        TextPaint textPaint15 = f5137b0;
        if (textPaint15 != null) {
            textPaint15.setTextSize(C1357a0.m37544i(14.0f));
        }
        Paint paint7 = f5141d0;
        if (paint7 != null) {
            paint7.setStrokeWidth(C1357a0.m37544i(2.0f));
        }
        TextPaint textPaint16 = f5151i0;
        if (textPaint16 != null) {
            textPaint16.setTextSize(C1357a0.m37544i(17.0f));
        }
    }

    public static PorterDuffColorFilter m37004z(int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        if (f5124Q == i && (porterDuffColorFilter2 = f5123P) != null) {
            return porterDuffColorFilter2;
        }
        C6038h<PorterDuffColorFilter> hVar = f5122O;
        if (hVar == null) {
            f5122O = new C6038h<>();
            porterDuffColorFilter = null;
        } else {
            porterDuffColorFilter = hVar.m21472e(i);
        }
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = m37052b(i);
            if (f5122O.m21464n() >= 20) {
                f5122O.m21465l(0);
            }
            C6038h<PorterDuffColorFilter> hVar2 = f5122O;
            f5124Q = i;
            f5123P = porterDuffColorFilter;
            hVar2.m21467j(i, porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public static Paint m37003z0() {
        return f5134a;
    }
}
