package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import ce.a0;
import ce.y;
import ib.d;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.g;

public class f3 extends View {
    public static Paint N;
    public static Paint O;
    public static Paint P;
    public boolean M;
    public Paint f17990a;
    public boolean f17991b;
    public boolean f17992c;

    public f3(Context context) {
        super(context);
    }

    public static int[] a() {
        return new int[]{402653184, 352321536, 268435456, 218103808, 134217728, 83886080, 50331648, 16777216, 0};
    }

    public static void b(Canvas canvas, int i10, int i11, int i12, float f10) {
        if (f10 > 0.0f) {
            float d02 = j.d0();
            if (d02 == 0.0f) {
                c(canvas, i10, i11, i12, f10);
            } else if (d02 == 1.0f) {
                f(canvas, i10, i11, i12, f10);
            } else {
                c(canvas, i10, i11, i12, (1.0f - d02) * f10);
                f(canvas, i10, i11, i12, f10 * d02);
            }
        }
    }

    public static void c(Canvas canvas, int i10, int i11, int i12, float f10) {
        if (O == null) {
            O = new Paint(5);
            O.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, p(), a(), (float[]) null, Shader.TileMode.CLAMP));
        }
        O.setAlpha((int) (j.e0() * 255.0f * f10 * j.e0()));
        boolean z10 = (i10 == 0 && i12 == 0) ? false : true;
        if (z10) {
            canvas.save();
            canvas.translate(i10, i12);
        }
        canvas.drawRect(0.0f, 0.0f, i11 - i10, p(), O);
        if (z10) {
            canvas.restore();
        }
    }

    public static void d(Canvas canvas, int i10, int i11, int i12, float f10) {
        if (f10 > 0.0f) {
            if (P == null) {
                j();
            }
            float d02 = 1.0f - j.d0();
            if (d02 != 0.0f) {
                canvas.save();
                canvas.translate(i10, i12);
                P.setAlpha((int) (j.e0() * 255.0f * f10));
                canvas.drawRect(0.0f, 0.0f, i11 - i10, p(), P);
                canvas.restore();
            }
            if (d02 != 1.0f) {
                canvas.drawRect(i10, i12, i11, i12 + Math.max(1, a0.j(0.5f, 3.0f)), y.g(d.a(f10 * (1.0f - d02), j.M0())));
            }
        }
    }

    public static void f(Canvas canvas, int i10, int i11, int i12, float f10) {
        canvas.drawRect(i10, i12, i11, i12 + k(), y.g(d.a(f10, j.M0())));
    }

    public static void h(Canvas canvas, int i10, int i11, int i12, float f10) {
        if (f10 > 0.0f) {
            float d02 = j.d0();
            if (d02 == 0.0f) {
                i(canvas, i10, i11, i12 - q(), f10);
            } else if (d02 == 1.0f) {
                f(canvas, i10, i11, i12 - k(), f10);
            } else {
                i(canvas, i10, i11, i12, (1.0f - d02) * f10);
                f(canvas, i10, i11, i12 - k(), f10 * d02);
            }
        }
    }

    public static void i(Canvas canvas, int i10, int i11, int i12, float f10) {
        if (N == null) {
            N = new Paint(5);
            N.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, q(), r(), (float[]) null, Shader.TileMode.CLAMP));
        }
        N.setAlpha((int) (j.e0() * 255.0f * f10));
        boolean z10 = (i10 == 0 && i12 == 0) ? false : true;
        if (z10) {
            canvas.save();
            canvas.translate(i10, i12);
        }
        canvas.drawRect(0.0f, 0.0f, i11 - i10, q(), N);
        if (z10) {
            canvas.restore();
        }
    }

    public static void j() {
        if (P == null) {
            P = new Paint(5);
            int[] a10 = a();
            int i10 = 0;
            for (int i11 : a10) {
                a10[i10] = Color.argb(Color.alpha(i11) * 2, Color.red(i11), Color.green(i11), Color.blue(i11));
                i10++;
            }
            P.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, p(), a10, (float[]) null, Shader.TileMode.CLAMP));
            P.setAlpha(127);
        }
    }

    public static int k() {
        return Math.max(1, a0.i(0.5f));
    }

    public static int p() {
        return a0.i(3.0f);
    }

    public static int q() {
        return Math.max(1, a0.i(1.0f));
    }

    public static int[] r() {
        return new int[]{0, 50331648, 117440512, 167772160};
    }

    public final void e(Canvas canvas, float f10) {
        int k10 = k();
        int measuredHeight = this.f17991b ? getMeasuredHeight() - k10 : getPaddingTop();
        canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth() - getPaddingLeft(), measuredHeight + k10, y.g(d.a(f10, j.M0())));
    }

    public final void g(Canvas canvas, float f10) {
        if (this.f17990a != null) {
            int shadowTop = getShadowTop();
            int paddingLeft = getPaddingLeft();
            boolean z10 = (shadowTop == 0 && paddingLeft == 0) ? false : true;
            if (z10) {
                canvas.save();
                canvas.translate(paddingLeft, shadowTop);
            }
            this.f17990a.setAlpha((int) (f10 * 255.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth() - paddingLeft, getMeasuredHeight() - shadowTop, this.f17990a);
            if (z10) {
                canvas.restore();
            }
        }
    }

    public int getShadowTop() {
        return this.M ? getMeasuredHeight() - q() : getPaddingTop();
    }

    public void l() {
        this.M = true;
    }

    public void m(int[] iArr, float[] fArr, int i10) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, i10, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
        if (this.f17990a == null) {
            this.f17990a = new Paint(5);
        }
        this.f17990a.setShader(linearGradient);
    }

    public void n(boolean z10, v4<?> v4Var) {
        setSimpleTopShadow(z10);
        g.i(this, R.id.theme_color_background, v4Var);
    }

    public void o(int[] iArr, float[] fArr, int i10) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i10, iArr, fArr, Shader.TileMode.CLAMP);
        if (this.f17990a == null) {
            this.f17990a = new Paint(5);
        }
        this.f17990a.setShader(linearGradient);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float d02 = j.d0();
        float f10 = 1.0f;
        if (d02 == 0.0f) {
            if (this.f17992c) {
                f10 = j.e0();
            }
            g(canvas, f10);
        } else if (d02 == 1.0f) {
            e(canvas, 1.0f);
        } else {
            g(canvas, (this.f17992c ? j.e0() : 1.0f) * (1.0f - d02));
            e(canvas, d02);
        }
    }

    public void setSimpleBottomTransparentShadow(boolean z10) {
        int[] a10 = a();
        this.f17992c = true;
        o(a10, null, p());
        if (z10) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, a0.i(7.0f)));
        }
    }

    public void setSimpleLeftShadow(boolean z10) {
        this.f17992c = true;
        m(new int[]{16777216, 50331648, 100663296, 167772160, 268435456, 369098752, 486539264, 620756992, 738197504}, null, a0.i(3.0f));
        setPadding(a0.i(7.0f) - a0.i(3.0f), 0, 0, 0);
        if (z10) {
            setLayoutParams(new ViewGroup.LayoutParams(a0.i(7.0f), -1));
        }
    }

    public void setSimpleRightShadow(boolean z10) {
        this.f17992c = true;
        m(new int[]{738197504, 620756992, 486539264, 369098752, 268435456, 167772160, 100663296, 50331648, 16777216}, null, a0.i(3.0f));
        setPadding(0, 0, 0, 0);
        if (z10) {
            setLayoutParams(new ViewGroup.LayoutParams(a0.i(7.0f), -1));
        }
    }

    public void setSimpleTopShadow(boolean z10) {
        int q10 = q();
        int[] r10 = r();
        this.f17991b = true;
        this.f17992c = true;
        o(r10, null, q10);
        if (z10) {
            int i10 = a0.i(6.0f);
            setPadding(0, i10 - q10, 0, 0);
            setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
        }
    }
}
