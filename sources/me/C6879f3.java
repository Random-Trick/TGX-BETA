package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p108hb.C5064d;
import p335xd.C10192g;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C6879f3 extends View {
    public static Paint f21633N;
    public static Paint f21634O;
    public static Paint f21635P;
    public boolean f21636M;
    public Paint f21637a;
    public boolean f21638b;
    public boolean f21639c;

    public C6879f3(Context context) {
        super(context);
    }

    public static int[] m18708a() {
        return new int[]{402653184, 352321536, 268435456, 218103808, 134217728, 83886080, 50331648, 16777216, 0};
    }

    public static void m18707b(Canvas canvas, int i, int i2, int i3, float f) {
        if (f > 0.0f) {
            float f0 = C11524j.m186f0();
            if (f0 == 0.0f) {
                m18706c(canvas, i, i2, i3, f);
            } else if (f0 == 1.0f) {
                m18703f(canvas, i, i2, i3, f);
            } else {
                m18706c(canvas, i, i2, i3, (1.0f - f0) * f);
                m18703f(canvas, i, i2, i3, f * f0);
            }
        }
    }

    public static void m18706c(Canvas canvas, int i, int i2, int i3, float f) {
        if (f21634O == null) {
            f21634O = new Paint(5);
            f21634O.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, m18693p(), m18708a(), (float[]) null, Shader.TileMode.CLAMP));
        }
        f21634O.setAlpha((int) (C11524j.m183g0() * 255.0f * f * C11524j.m183g0()));
        boolean z = (i == 0 && i3 == 0) ? false : true;
        if (z) {
            canvas.save();
            canvas.translate(i, i3);
        }
        canvas.drawRect(0.0f, 0.0f, i2 - i, m18693p(), f21634O);
        if (z) {
            canvas.restore();
        }
    }

    public static void m18705d(Canvas canvas, int i, int i2, int i3, float f) {
        if (f > 0.0f) {
            if (f21635P == null) {
                m18699j();
            }
            float f0 = 1.0f - C11524j.m186f0();
            if (f0 != 0.0f) {
                canvas.save();
                canvas.translate(i, i3);
                f21635P.setAlpha((int) (C11524j.m183g0() * 255.0f * f));
                canvas.drawRect(0.0f, 0.0f, i2 - i, m18693p(), f21635P);
                canvas.restore();
            }
            if (f0 != 1.0f) {
                canvas.drawRect(i, i3, i2, i3 + Math.max(1, C1357a0.m37543j(0.5f, 3.0f)), C1410y.m37042g(C5064d.m24132a(f * (1.0f - f0), C11524j.m223P0())));
            }
        }
    }

    public static void m18703f(Canvas canvas, int i, int i2, int i3, float f) {
        canvas.drawRect(i, i3, i2, i3 + m18698k(), C1410y.m37042g(C5064d.m24132a(f, C11524j.m223P0())));
    }

    public static void m18701h(Canvas canvas, int i, int i2, int i3, float f) {
        if (f > 0.0f) {
            float f0 = C11524j.m186f0();
            if (f0 == 0.0f) {
                m18700i(canvas, i, i2, i3 - m18692q(), f);
            } else if (f0 == 1.0f) {
                m18703f(canvas, i, i2, i3 - m18698k(), f);
            } else {
                m18700i(canvas, i, i2, i3, (1.0f - f0) * f);
                m18703f(canvas, i, i2, i3 - m18698k(), f * f0);
            }
        }
    }

    public static void m18700i(Canvas canvas, int i, int i2, int i3, float f) {
        if (f21633N == null) {
            f21633N = new Paint(5);
            f21633N.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, m18692q(), m18691r(), (float[]) null, Shader.TileMode.CLAMP));
        }
        f21633N.setAlpha((int) (C11524j.m183g0() * 255.0f * f));
        boolean z = (i == 0 && i3 == 0) ? false : true;
        if (z) {
            canvas.save();
            canvas.translate(i, i3);
        }
        canvas.drawRect(0.0f, 0.0f, i2 - i, m18692q(), f21633N);
        if (z) {
            canvas.restore();
        }
    }

    public static void m18699j() {
        if (f21635P == null) {
            f21635P = new Paint(5);
            int[] a = m18708a();
            int i = 0;
            for (int i2 : a) {
                a[i] = Color.argb(Color.alpha(i2) * 2, Color.red(i2), Color.green(i2), Color.blue(i2));
                i++;
            }
            f21635P.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, m18693p(), a, (float[]) null, Shader.TileMode.CLAMP));
            f21635P.setAlpha(127);
        }
    }

    public static int m18698k() {
        return Math.max(1, C1357a0.m37544i(0.5f));
    }

    public static int m18693p() {
        return C1357a0.m37544i(3.0f);
    }

    public static int m18692q() {
        return Math.max(1, C1357a0.m37544i(1.0f));
    }

    public static int[] m18691r() {
        return new int[]{0, 50331648, 117440512, 167772160};
    }

    public final void m18704e(Canvas canvas, float f) {
        int k = m18698k();
        int measuredHeight = this.f21638b ? getMeasuredHeight() - k : getPaddingTop();
        canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth() - getPaddingLeft(), measuredHeight + k, C1410y.m37042g(C5064d.m24132a(f, C11524j.m223P0())));
    }

    public final void m18702g(Canvas canvas, float f) {
        if (this.f21637a != null) {
            int shadowTop = getShadowTop();
            int paddingLeft = getPaddingLeft();
            boolean z = (shadowTop == 0 && paddingLeft == 0) ? false : true;
            if (z) {
                canvas.save();
                canvas.translate(paddingLeft, shadowTop);
            }
            this.f21637a.setAlpha((int) (f * 255.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth() - paddingLeft, getMeasuredHeight() - shadowTop, this.f21637a);
            if (z) {
                canvas.restore();
            }
        }
    }

    public int getShadowTop() {
        return this.f21636M ? getMeasuredHeight() - m18692q() : getPaddingTop();
    }

    public void m18697l() {
        this.f21636M = true;
    }

    public void m18696m(int[] iArr, float[] fArr, int i) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, i, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
        if (this.f21637a == null) {
            this.f21637a = new Paint(5);
        }
        this.f21637a.setShader(linearGradient);
    }

    public void m18695n(boolean z, AbstractC9323v4<?> v4Var) {
        setSimpleTopShadow(z);
        C10192g.m5782i(this, R.id.theme_color_background, v4Var);
    }

    public void m18694o(int[] iArr, float[] fArr, int i) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i, iArr, fArr, Shader.TileMode.CLAMP);
        if (this.f21637a == null) {
            this.f21637a = new Paint(5);
        }
        this.f21637a.setShader(linearGradient);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f0 = C11524j.m186f0();
        float f = 1.0f;
        if (f0 == 0.0f) {
            if (this.f21639c) {
                f = C11524j.m183g0();
            }
            m18702g(canvas, f);
        } else if (f0 == 1.0f) {
            m18704e(canvas, 1.0f);
        } else {
            m18702g(canvas, (this.f21639c ? C11524j.m183g0() : 1.0f) * (1.0f - f0));
            m18704e(canvas, f0);
        }
    }

    public void setSimpleBottomTransparentShadow(boolean z) {
        int[] a = m18708a();
        this.f21639c = true;
        m18694o(a, null, m18693p());
        if (z) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37544i(7.0f)));
        }
    }

    public void setSimpleLeftShadow(boolean z) {
        this.f21639c = true;
        m18696m(new int[]{16777216, 50331648, 100663296, 167772160, 268435456, 369098752, 486539264, 620756992, 738197504}, null, C1357a0.m37544i(3.0f));
        setPadding(C1357a0.m37544i(7.0f) - C1357a0.m37544i(3.0f), 0, 0, 0);
        if (z) {
            setLayoutParams(new ViewGroup.LayoutParams(C1357a0.m37544i(7.0f), -1));
        }
    }

    public void setSimpleRightShadow(boolean z) {
        this.f21639c = true;
        m18696m(new int[]{738197504, 620756992, 486539264, 369098752, 268435456, 167772160, 100663296, 50331648, 16777216}, null, C1357a0.m37544i(3.0f));
        setPadding(0, 0, 0, 0);
        if (z) {
            setLayoutParams(new ViewGroup.LayoutParams(C1357a0.m37544i(7.0f), -1));
        }
    }

    public void setSimpleTopShadow(boolean z) {
        int q = m18692q();
        int[] r = m18691r();
        this.f21638b = true;
        this.f21639c = true;
        m18694o(r, null, q);
        if (z) {
            int i = C1357a0.m37544i(6.0f);
            setPadding(0, i - q, 0, 0);
            setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }
}
