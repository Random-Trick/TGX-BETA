package ce;

import ae.j;
import ae.z;
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
import java.lang.ref.SoftReference;
import je.e;
import je.w0;
import k0.h;
import nb.f;
import ne.m2;
import oc.v0;
import org.thunderdog.challegram.R;

public class y {
    public static TextPaint A;
    public static TextPaint B;
    public static Paint C;
    public static Paint D;
    public static Paint E;
    public static Paint F;
    public static Paint G;
    public static int H;
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    public static Paint M;
    public static h<PorterDuffColorFilter> N;
    public static PorterDuffColorFilter O;
    public static int P;
    public static int Q;
    public static Paint R;
    public static int S;
    public static Paint T;
    public static float U;
    public static Paint V;
    public static RectF W;
    public static Path X;
    public static Rect Y;
    public static f<Paint.FontMetricsInt> Z;
    public static Paint f5358a;
    public static TextPaint f5359a0;
    public static Paint f5360b;
    public static TextPaint f5361b0;
    public static TextPaint f5362c;
    public static Paint f5363c0;
    public static TextPaint f5364d;
    public static int f5365d0;
    public static TextPaint f5366e;
    public static Paint f5367e0;
    public static TextPaint f5368f;
    public static Paint f5369f0;
    public static Paint f5370g;
    public static Paint f5371g0;
    public static int f5372h;
    public static TextPaint f5373h0;
    public static int f5374i;
    public static f<TextPaint> f5375i0;
    public static Paint f5376j;
    public static f<TextPaint> f5377j0;
    public static Paint f5378k;
    public static f<TextPaint> f5379k0;
    public static int f5380l;
    public static f<TextPaint> f5381l0;
    public static Paint f5382m;
    public static TextPaint f5383m0;
    public static float f5384n;
    public static TextPaint f5385n0;
    public static float f5386o;
    public static h<w0> f5387o0;
    public static f<SoftReference<TextPaint>> f5388p;
    public static w0 f5389p0;
    public static f<SoftReference<TextPaint>> f5390q;
    public static w0 f5391q0;
    public static TextPaint f5392r;
    public static TextPaint f5393s;
    public static TextPaint f5394t;
    public static TextPaint f5395u;
    public static TextPaint f5396v;
    public static TextPaint f5397w;
    public static TextPaint f5398x;
    public static TextPaint f5399y;
    public static TextPaint f5400z;

    public static TextPaint A() {
        if (f5366e == null) {
            TextPaint textPaint = new TextPaint(5);
            f5366e = textPaint;
            int P0 = j.P0();
            f5372h = P0;
            textPaint.setColor(P0);
            f5366e.setTypeface(o.k());
            f5366e.setTextSize(a0.i(14.0f));
        }
        return f5366e;
    }

    public static w0 A0(float f10) {
        if (f10 == 15.0f) {
            if (f5389p0 == null) {
                f5389p0 = new w0(o.x()).m(15.0f);
            }
            return f5389p0;
        } else if (f10 == 13.0f) {
            if (f5391q0 == null) {
                f5391q0 = new w0(o.x()).m(13.0f);
            }
            return f5391q0;
        } else {
            if (f5387o0 == null) {
                f5387o0 = new h<>();
            }
            int floatToIntBits = Float.floatToIntBits(f10);
            int g10 = f5387o0.g(floatToIntBits);
            if (g10 >= 0) {
                return f5387o0.o(g10);
            }
            h<w0> hVar = f5387o0;
            w0 m10 = new w0(o.x()).m(f10);
            hVar.j(floatToIntBits, m10);
            return m10;
        }
    }

    public static TextPaint B(int i10) {
        TextPaint A2 = A();
        if (f5372h != i10) {
            f5372h = i10;
            A2.setColor(i10);
        }
        return f5366e;
    }

    public static <T extends Paint> T B0(T t10, float f10) {
        t10.setTextSize(a0.i(f10));
        return t10;
    }

    public static Paint C() {
        return z.b(R.id.theme_color_textLight);
    }

    public static Paint C0(int i10) {
        if (f5378k == null) {
            Paint paint = new Paint(5);
            f5378k = paint;
            paint.setStyle(Paint.Style.STROKE);
            f5378k.setStrokeWidth(a0.i(2.0f));
        }
        f5378k.setColor(i10);
        return f5378k;
    }

    public static Paint D() {
        if (f5367e0 == null) {
            synchronized (y.class) {
                if (f5367e0 == null) {
                    Paint paint = new Paint(3);
                    f5367e0 = paint;
                    paint.setColor(0);
                    f5367e0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
            }
        }
        return f5367e0;
    }

    public static Paint D0(int i10) {
        Paint paint = f5376j;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5376j = paint2;
            f5380l = i10;
            paint2.setColor(i10);
            f5376j.setStyle(Paint.Style.STROKE);
            f5376j.setStrokeWidth(a0.x());
        } else if (f5380l != i10) {
            f5380l = i10;
            paint.setColor(i10);
        }
        return f5376j;
    }

    public static Paint.FontMetricsInt E(TextPaint textPaint) {
        if (Z == null) {
            synchronized (y.class) {
                if (Z == null) {
                    Z = new f<>();
                }
            }
        }
        Paint.FontMetricsInt a10 = Z.a();
        if (a10 == null) {
            f<Paint.FontMetricsInt> fVar = Z;
            Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
            fVar.b(fontMetricsInt);
            a10 = fontMetricsInt;
        }
        textPaint.getFontMetricsInt(a10);
        return a10;
    }

    public static Paint E0() {
        if (f5370g == null) {
            Paint paint = new Paint(5);
            f5370g = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f5370g.setStyle(Paint.Style.STROKE);
            f5370g.setColor(-1610612737);
            f5370g.setStrokeWidth(a0.i(3.0f));
        }
        return f5370g;
    }

    public static Paint F() {
        return z.b(R.id.theme_color_textSecure);
    }

    public static TextPaint F0(float f10, boolean z10, boolean z11) {
        if (z11 && Looper.myLooper() != Looper.getMainLooper()) {
            TextPaint textPaint = null;
            synchronized (y.class) {
                f<SoftReference<TextPaint>> fVar = z10 ? f5388p : f5390q;
                if (fVar == null) {
                    fVar = new f<>();
                    if (z10) {
                        f5388p = fVar;
                    } else {
                        f5390q = fVar;
                    }
                }
                SoftReference<TextPaint> a10 = fVar.a();
                if (a10 != null) {
                    textPaint = a10.get();
                }
                if (textPaint == null) {
                    textPaint = x0(z10);
                    fVar.b(new SoftReference<>(textPaint));
                }
                textPaint.setTextSize(a0.i(f10));
            }
            return textPaint;
        } else if (z10) {
            TextPaint textPaint2 = f5364d;
            if (textPaint2 == null) {
                TextPaint x02 = x0(true);
                f5364d = x02;
                f5386o = f10;
                x02.setTextSize(a0.i(f10));
            } else if (f5386o != f10) {
                f5386o = f10;
                textPaint2.setTextSize(a0.i(f10));
            }
            return f5364d;
        } else {
            TextPaint textPaint3 = f5362c;
            if (textPaint3 == null) {
                TextPaint x03 = x0(false);
                f5362c = x03;
                f5384n = f10;
                x03.setTextSize(a0.i(f10));
            } else if (f5384n != f10) {
                f5384n = f10;
                textPaint3.setTextSize(a0.i(f10));
            }
            return f5362c;
        }
    }

    public static Paint G() {
        return z.b(R.id.theme_color_headerButtonIcon);
    }

    public static Paint H() {
        return z.b(R.id.theme_color_headerIcon);
    }

    public static Paint I() {
        return z.b(R.id.theme_color_headerText);
    }

    public static Paint J() {
        return z.b(R.id.theme_color_icon);
    }

    public static Paint K() {
        return z.b(R.id.theme_color_iconLight);
    }

    public static Paint L(int i10) {
        Paint paint = E;
        if (paint == null || K != i10) {
            K = i10;
            E = c(paint, i10);
        }
        return E;
    }

    public static Paint M() {
        if (C == null) {
            Paint paint = new Paint(5);
            C = paint;
            paint.setStrokeWidth(a0.i(1.5f));
            C.setStyle(Paint.Style.STROKE);
        }
        return C;
    }

    public static Paint N(boolean z10) {
        return z.b(z10 ? R.id.theme_color_bubbleOut_inlineIcon : R.id.theme_color_inlineIcon);
    }

    public static TextPaint O(float f10, int i10, boolean z10) {
        return (TextPaint) a(P(f10, z10), i10);
    }

    public static TextPaint P(float f10, boolean z10) {
        if (z10) {
            if (f5379k0 == null) {
                synchronized (y.class) {
                    if (f5379k0 == null) {
                        f5379k0 = new f<>();
                    }
                }
            }
            TextPaint a10 = f5379k0.a();
            if (a10 == null) {
                a10 = w0(o.k());
                a10.setFakeBoldText(true);
                f5379k0.b(a10);
            }
            return (TextPaint) B0(a10, f10);
        }
        if (f5377j0 == null) {
            synchronized (y.class) {
                if (f5377j0 == null) {
                    f5377j0 = new f<>();
                }
            }
        }
        TextPaint a11 = f5377j0.a();
        if (a11 == null) {
            f<TextPaint> fVar = f5377j0;
            TextPaint w02 = w0(o.i());
            fVar.b(w02);
            a11 = w02;
        }
        return (TextPaint) B0(a11, f10);
    }

    public static Paint Q() {
        return z.b(R.id.theme_color_playerCoverIcon);
    }

    public static Paint R(int i10) {
        Paint paint = f5363c0;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5363c0 = paint2;
            paint2.setStrokeWidth(a0.i(2.0f));
            Paint paint3 = f5363c0;
            f5365d0 = i10;
            paint3.setColor(i10);
            f5363c0.setStyle(Paint.Style.STROKE);
        } else if (f5365d0 != i10) {
            f5365d0 = i10;
            paint.setColor(i10);
        }
        return f5363c0;
    }

    public static Paint S() {
        return z.b(R.id.theme_color_passcodeIcon);
    }

    public static Path T() {
        if (X == null) {
            X = new Path();
        }
        return X;
    }

    public static Paint U() {
        if (f5360b == null) {
            Paint paint = new Paint(5);
            f5360b = paint;
            paint.setStyle(Paint.Style.FILL);
            f5360b.setColor(j.E0());
            z.f(f5360b, R.id.theme_color_placeholder);
        }
        return f5360b;
    }

    public static Paint V(int i10, Paint.Style style) {
        if (V == null) {
            Paint paint = new Paint(5);
            V = paint;
            paint.setPathEffect(new CornerPathEffect(a0.i(1.5f)));
        }
        V.setStyle(style);
        V.setColor(i10);
        return V;
    }

    public static Paint W(int i10) {
        if (i10 == -1) {
            return z.b(R.id.theme_color_white);
        }
        PorterDuffColorFilter z10 = z(i10);
        Paint paint = M;
        if (paint == null) {
            Paint paint2 = new Paint(7);
            M = paint2;
            paint2.setColorFilter(z10);
            L = i10;
        } else if (L != i10) {
            L = i10;
            paint.setColorFilter(z10);
        }
        return M;
    }

    public static Paint X(int i10) {
        Paint paint = R;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            R = paint2;
            paint2.setStrokeWidth(a0.i(1.5f));
            R.setStyle(Paint.Style.STROKE);
            if (m2.f18239k0) {
                R.setStrokeCap(Paint.Cap.ROUND);
            }
            Paint paint3 = R;
            Q = i10;
            paint3.setColor(i10);
        } else if (Q != i10) {
            Q = i10;
            paint.setColor(i10);
        }
        return R;
    }

    public static Paint Y(int i10, float f10) {
        Paint paint = T;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            T = paint2;
            U = f10;
            paint2.setStrokeWidth(f10);
            T.setStyle(Paint.Style.STROKE);
            if (m2.f18239k0) {
                T.setStrokeCap(Paint.Cap.ROUND);
            }
            Paint paint3 = T;
            S = i10;
            paint3.setColor(i10);
        } else {
            if (S != i10) {
                S = i10;
                paint.setColor(i10);
            }
            if (U != f10) {
                Paint paint4 = T;
                U = f10;
                paint4.setStrokeWidth(f10);
            }
        }
        return T;
    }

    public static Rect Z() {
        if (Y == null) {
            Y = new Rect();
        }
        return Y;
    }

    public static <T extends Paint> T a(T t10, int i10) {
        t10.setColor(i10);
        return t10;
    }

    public static RectF a0() {
        if (W == null) {
            W = new RectF();
        }
        return W;
    }

    public static PorterDuffColorFilter b(int i10) {
        return new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public static TextPaint b0(float f10) {
        if (f5375i0 == null) {
            synchronized (y.class) {
                if (f5375i0 == null) {
                    f5375i0 = new f<>();
                }
            }
        }
        TextPaint a10 = f5375i0.a();
        if (a10 == null) {
            f<TextPaint> fVar = f5375i0;
            TextPaint w02 = w0(o.k());
            fVar.b(w02);
            a10 = w02;
        }
        return (TextPaint) B0(a10, f10);
    }

    public static Paint c(Paint paint, int i10) {
        if (paint == null) {
            paint = new Paint(7);
        }
        paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        paint.setColor(i10);
        return paint;
    }

    public static TextPaint c0(float f10, int i10) {
        return (TextPaint) a(b0(f10), i10);
    }

    public static void d(Canvas canvas, e eVar, float f10, float f11, float f12) {
        canvas.drawText(eVar.f15363a, f10, f11, F0(f12, eVar.f15364b, false));
    }

    public static Paint d0() {
        return z.b(R.id.theme_color_chatSendButton);
    }

    public static void e(Canvas canvas, e eVar, float f10, float f11, float f12, float f13) {
        if (f13 == 1.0f) {
            canvas.drawText(eVar.f15363a, f10, f11, F0(f12, eVar.f15364b, false));
        } else if (f13 > 0.0f) {
            TextPaint F0 = F0(f12, eVar.f15364b, false);
            F0.setAlpha((int) (f13 * 255.0f));
            canvas.drawText(eVar.f15363a, f10, f11, F0);
            F0.setAlpha(255);
        }
    }

    public static TextPaint e0() {
        if (f5368f == null) {
            TextPaint textPaint = new TextPaint(5);
            f5368f = textPaint;
            textPaint.setColor(j.P0());
            f5368f.setTextSize(a0.i(13.0f));
            f5368f.setTypeface(o.k());
            z.f(f5368f, R.id.theme_color_text);
        }
        return f5368f;
    }

    public static TextPaint f() {
        if (f5373h0 == null) {
            synchronized (y.class) {
                if (f5373h0 == null) {
                    TextPaint textPaint = new TextPaint(7);
                    f5373h0 = textPaint;
                    textPaint.setTextSize(a0.i(17.0f));
                }
            }
        }
        return f5373h0;
    }

    public static TextPaint f0() {
        if (B == null) {
            TextPaint textPaint = new TextPaint(5);
            B = textPaint;
            textPaint.setColor(j.R0());
            B.setTextSize(a0.i(13.0f));
            B.setTypeface(o.k());
            z.f(B, R.id.theme_color_textLight);
        }
        return B;
    }

    public static Paint g(int i10) {
        Paint paint = f5358a;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            f5358a = paint2;
            paint2.setStyle(Paint.Style.FILL);
            Paint paint3 = f5358a;
            f5374i = i10;
            paint3.setColor(i10);
        } else if (f5374i != i10) {
            f5374i = i10;
            paint.setColor(i10);
        }
        return f5358a;
    }

    public static w0 g0() {
        return A0(13.0f);
    }

    public static Paint h() {
        return z.b(R.id.theme_color_iconActive);
    }

    public static TextPaint h0() {
        if (f5385n0 == null) {
            synchronized (y.class) {
                if (f5385n0 == null) {
                    f5385n0 = w0(o.k());
                }
            }
        }
        return (TextPaint) B0(f5385n0, 15.0f);
    }

    public static Paint i() {
        return z.b(R.id.theme_color_background_icon);
    }

    public static TextPaint i0(int i10) {
        return (TextPaint) a(h0(), i10);
    }

    public static Paint j() {
        if (f5371g0 == null) {
            synchronized (y.class) {
                if (f5371g0 == null) {
                    f5371g0 = new Paint(7);
                }
            }
        }
        return f5371g0;
    }

    public static TextPaint j0() {
        if (f5383m0 == null) {
            synchronized (y.class) {
                if (f5383m0 == null) {
                    f5383m0 = w0(o.k());
                }
            }
        }
        return (TextPaint) B0(f5383m0, 16.0f);
    }

    public static TextPaint k(boolean z10) {
        if (z10) {
            if (f5394t == null) {
                TextPaint textPaint = new TextPaint(5);
                f5394t = textPaint;
                textPaint.setTextSize(a0.i(13.0f));
                f5394t.setTypeface(o.k());
                f5394t.setFakeBoldText(true);
            }
            return f5394t;
        }
        if (f5395u == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5395u = textPaint2;
            textPaint2.setTextSize(a0.i(13.0f));
            f5395u.setTypeface(o.i());
        }
        return f5395u;
    }

    public static TextPaint k0(int i10) {
        return (TextPaint) a(j0(), i10);
    }

    public static TextPaint l(boolean z10, int i10) {
        TextPaint k10 = k(z10);
        k10.setColor(i10);
        return k10;
    }

    public static Paint l0() {
        return z.b(R.id.theme_color_ticks);
    }

    public static TextPaint m(boolean z10) {
        if (z10) {
            if (f5396v == null) {
                TextPaint textPaint = new TextPaint(5);
                f5396v = textPaint;
                textPaint.setTextSize(a0.i(15.0f));
                f5396v.setTypeface(o.k());
                f5396v.setFakeBoldText(true);
            }
            return f5396v;
        }
        if (f5397w == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5397w = textPaint2;
            textPaint2.setTextSize(a0.i(15.0f));
            f5397w.setTypeface(o.i());
        }
        return f5397w;
    }

    public static Paint m0() {
        return z.b(R.id.theme_color_ticksRead);
    }

    public static TextPaint n(boolean z10, int i10) {
        TextPaint m10 = m(z10);
        m10.setColor(i10);
        return m10;
    }

    public static TextPaint n0() {
        return o0(false);
    }

    public static TextPaint o(boolean z10) {
        if (z10) {
            if (f5392r == null) {
                TextPaint textPaint = new TextPaint(5);
                f5392r = textPaint;
                textPaint.setTextSize(a0.i(15.0f));
                f5392r.setTypeface(o.k());
                f5392r.setFakeBoldText(true);
            }
            return f5392r;
        }
        if (f5393s == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5393s = textPaint2;
            textPaint2.setTextSize(a0.i(15.0f));
            f5393s.setTypeface(o.i());
        }
        return f5393s;
    }

    public static TextPaint o0(boolean z10) {
        if (z10) {
            if (A == null) {
                TextPaint textPaint = new TextPaint(5);
                A = textPaint;
                textPaint.setColor(j.P0());
                A.setTextSize(a0.i(16.0f));
                A.setTypeface(o.k());
                A.setFakeBoldText(true);
                z.f(A, R.id.theme_color_text);
            }
            return A;
        }
        if (f5400z == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5400z = textPaint2;
            textPaint2.setColor(j.P0());
            f5400z.setTextSize(a0.i(16.0f));
            f5400z.setTypeface(o.i());
            z.f(f5400z, R.id.theme_color_text);
        }
        return f5400z;
    }

    public static TextPaint p(boolean z10, int i10) {
        TextPaint o10 = o(z10);
        o10.setColor(i10);
        return o10;
    }

    public static TextPaint p0(boolean z10) {
        if (z10) {
            if (f5399y == null) {
                TextPaint textPaint = new TextPaint(5);
                f5399y = textPaint;
                textPaint.setColor(j.P0());
                f5399y.setTextSize(a0.i(15.0f));
                f5399y.setTypeface(o.k());
                f5399y.setFakeBoldText(true);
                z.f(f5399y, R.id.theme_color_text);
            }
            return f5399y;
        }
        if (f5398x == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5398x = textPaint2;
            textPaint2.setColor(j.P0());
            f5398x.setTextSize(a0.i(15.0f));
            f5398x.setTypeface(o.i());
            z.f(f5398x, R.id.theme_color_text);
        }
        return f5398x;
    }

    public static TextPaint q(float f10) {
        if (f5381l0 == null) {
            synchronized (y.class) {
                if (f5381l0 == null) {
                    f5381l0 = new f<>();
                }
            }
        }
        TextPaint a10 = f5381l0.a();
        if (a10 == null) {
            f<TextPaint> fVar = f5381l0;
            TextPaint w02 = w0(o.g());
            fVar.b(w02);
            a10 = w02;
        }
        return (TextPaint) B0(a10, f10);
    }

    public static w0 q0() {
        return A0(15.0f);
    }

    public static TextPaint r(float f10, int i10) {
        return (TextPaint) a(q(f10), i10);
    }

    public static Paint r0(int i10) {
        Paint paint = D;
        if (paint == null || J != i10) {
            J = i10;
            D = c(paint, i10);
        }
        return D;
    }

    public static Paint s() {
        return z.b(R.id.theme_color_bubbleIn_time);
    }

    public static Paint s0() {
        return z.b(R.id.theme_color_chatListVerify);
    }

    public static Paint t() {
        return z.b(R.id.theme_color_bubbleOut_time);
    }

    public static TextPaint t0(int i10, boolean z10) {
        if (z10) {
            if (f5361b0 == null) {
                TextPaint textPaint = new TextPaint(5);
                f5361b0 = textPaint;
                textPaint.setTypeface(o.k());
                f5361b0.setFakeBoldText(true);
                f5361b0.setTextSize(a0.i(14.0f));
            }
            f5361b0.setColor(i10);
            return f5361b0;
        }
        if (f5359a0 == null) {
            TextPaint textPaint2 = new TextPaint(5);
            f5359a0 = textPaint2;
            textPaint2.setTypeface(o.i());
            f5359a0.setTextSize(a0.i(14.0f));
        }
        f5359a0.setColor(i10);
        return f5359a0;
    }

    public static Paint u(int i10) {
        Paint paint = G;
        if (paint == null || I != i10) {
            I = i10;
            G = c(paint, i10);
        }
        return G;
    }

    public static Paint u0() {
        if (f5369f0 == null) {
            synchronized (y.class) {
                if (f5369f0 == null) {
                    Paint paint = new Paint(3);
                    f5369f0 = paint;
                    paint.setColor(0);
                    f5369f0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                }
            }
        }
        return f5369f0;
    }

    public static Paint v() {
        return z.b(R.id.theme_color_bubbleOut_ticks);
    }

    public static int v0(e eVar, float f10) {
        if (eVar != null) {
            return (int) v0.T1(eVar.f15363a, F0(f10, eVar.f15364b, true));
        }
        return 0;
    }

    public static Paint w() {
        return z.b(R.id.theme_color_bubbleOut_ticksRead);
    }

    public static TextPaint w0(Typeface typeface) {
        TextPaint textPaint = new TextPaint(5);
        textPaint.setTypeface(typeface);
        return textPaint;
    }

    public static Paint x(int i10) {
        Paint paint = F;
        if (paint == null || H != i10) {
            H = i10;
            F = c(paint, i10);
        }
        return F;
    }

    public static TextPaint x0(boolean z10) {
        TextPaint textPaint = new TextPaint(5);
        textPaint.setColor(-1);
        if (z10) {
            textPaint.setTypeface(o.k());
            textPaint.setFakeBoldText(true);
        } else {
            textPaint.setTypeface(o.i());
        }
        return textPaint;
    }

    public static Paint y() {
        return z.b(R.id.theme_color_chatListMute);
    }

    public static void y0() {
        Paint paint = f5370g;
        if (paint != null) {
            paint.setStrokeWidth(a0.i(3.0f));
        }
        TextPaint textPaint = f5368f;
        if (textPaint != null) {
            textPaint.setTextSize(a0.i(13.0f));
        }
        TextPaint textPaint2 = f5366e;
        if (textPaint2 != null) {
            textPaint2.setTextSize(a0.i(14.0f));
        }
        Paint paint2 = f5376j;
        if (paint2 != null) {
            paint2.setStrokeWidth(a0.x());
        }
        Paint paint3 = f5378k;
        if (paint3 != null) {
            paint3.setStrokeWidth(a0.i(2.0f));
        }
        if (f5382m != null) {
            float max = Math.max(1.0f, a0.k(0.5f));
            f5382m.setShadowLayer(max, 0.0f, max, 1509949440);
        }
        TextPaint textPaint3 = f5392r;
        if (textPaint3 != null) {
            textPaint3.setTextSize(a0.i(15.0f));
        }
        TextPaint textPaint4 = f5393s;
        if (textPaint4 != null) {
            textPaint4.setTextSize(a0.i(15.0f));
        }
        TextPaint textPaint5 = f5397w;
        if (textPaint5 != null) {
            textPaint5.setTextSize(a0.i(15.0f));
        }
        TextPaint textPaint6 = f5396v;
        if (textPaint6 != null) {
            textPaint6.setTextSize(a0.i(15.0f));
        }
        TextPaint textPaint7 = f5394t;
        if (textPaint7 != null) {
            textPaint7.setTextSize(a0.i(13.0f));
        }
        TextPaint textPaint8 = f5395u;
        if (textPaint8 != null) {
            textPaint8.setTextSize(a0.i(13.0f));
        }
        TextPaint textPaint9 = f5399y;
        if (textPaint9 != null) {
            textPaint9.setTextSize(a0.i(15.0f));
        }
        TextPaint textPaint10 = f5398x;
        if (textPaint10 != null) {
            textPaint10.setTextSize(a0.i(15.0f));
        }
        TextPaint textPaint11 = A;
        if (textPaint11 != null) {
            textPaint11.setTextSize(a0.i(16.0f));
        }
        TextPaint textPaint12 = f5400z;
        if (textPaint12 != null) {
            textPaint12.setTextSize(a0.i(16.0f));
        }
        TextPaint textPaint13 = B;
        if (textPaint13 != null) {
            textPaint13.setTextSize(a0.i(13.0f));
        }
        Paint paint4 = C;
        if (paint4 != null) {
            paint4.setStrokeWidth(a0.i(1.5f));
        }
        Paint paint5 = R;
        if (paint5 != null) {
            paint5.setStrokeWidth(a0.i(1.5f));
        }
        Paint paint6 = V;
        if (paint6 != null) {
            paint6.setPathEffect(new CornerPathEffect(a0.i(1.5f)));
        }
        TextPaint textPaint14 = f5361b0;
        if (textPaint14 != null) {
            textPaint14.setTextSize(a0.i(14.0f));
        }
        TextPaint textPaint15 = f5359a0;
        if (textPaint15 != null) {
            textPaint15.setTextSize(a0.i(14.0f));
        }
        Paint paint7 = f5363c0;
        if (paint7 != null) {
            paint7.setStrokeWidth(a0.i(2.0f));
        }
        TextPaint textPaint16 = f5373h0;
        if (textPaint16 != null) {
            textPaint16.setTextSize(a0.i(17.0f));
        }
    }

    public static PorterDuffColorFilter z(int i10) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        if (P == i10 && (porterDuffColorFilter2 = O) != null) {
            return porterDuffColorFilter2;
        }
        h<PorterDuffColorFilter> hVar = N;
        if (hVar == null) {
            N = new h<>();
            porterDuffColorFilter = null;
        } else {
            porterDuffColorFilter = hVar.e(i10);
        }
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = b(i10);
            if (N.n() >= 20) {
                N.l(0);
            }
            h<PorterDuffColorFilter> hVar2 = N;
            P = i10;
            O = porterDuffColorFilter;
            hVar2.j(i10, porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public static Paint z0() {
        return f5358a;
    }
}
