package ed;

import ae.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import ce.a0;
import ce.y;
import ed.j;
import gd.w;
import hd.b;
import hd.d7;
import je.g;
import je.t;
import kb.c;
import ld.p;
import ne.i;
import ne.j3;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.x2;
import zd.o6;
import zd.w8;

public class o extends i implements c, j.d, x2.f {
    public static int A0;
    public static int B0;
    public static int C0;
    public static TextPaint f11586w0;
    public static int f11587x0;
    public static int f11588y0;
    public static int f11589z0;
    public d7 f11590k0;
    public final p f11591l0;
    public int f11592m0 = a0.i(68.0f);
    public j f11593n0;
    public w8.i f11594o0;
    public b f11595p0;
    public String f11596q0;
    public g f11597r0;
    public String f11598s0;
    public String f11599t0;
    public float f11600u0;
    public j3 f11601v0;

    public o(Context context, o6 o6Var) {
        super(context, o6Var);
        if (f11586w0 == null) {
            L0();
        }
        if (f11588y0 == 0) {
            f11588y0 = a0.i(25.0f);
            f11587x0 = a0.i(16.0f);
            f11589z0 = (f11588y0 * 2) + a0.i(11.0f);
            A0 = a0.i(20.0f) + a0.i(12.0f);
            B0 = a0.i(40.0f) + a0.i(12.0f);
            C0 = a0.i(30.0f) + a0.i(12.0f);
        }
        this.f11591l0 = new p(this, f11588y0);
        P0();
        this.f11593n0 = new j(this, R.drawable.baseline_remove_circle_24);
    }

    public static void L0() {
        TextPaint textPaint = new TextPaint(5);
        f11586w0 = textPaint;
        textPaint.setTypeface(ce.o.k());
        f11586w0.setTextSize(a0.i(14.0f));
        f11586w0.setColor(ae.j.R0());
        z.f(f11586w0, R.id.theme_color_textLight);
    }

    public static TextPaint getStatusPaint() {
        if (f11586w0 == null) {
            L0();
        }
        return f11586w0;
    }

    public void C0() {
        this.f11591l0.e();
    }

    public final void D0() {
        if (getMeasuredWidth() > 0) {
            b1();
            e1();
            Y0();
        }
    }

    public void G0() {
        this.f11591l0.b();
    }

    public final void P0() {
        int i10 = a0.i(72.0f) / 2;
        if (w.G2()) {
            int measuredWidth = getMeasuredWidth();
            p pVar = this.f11591l0;
            int i11 = this.f11592m0;
            int i12 = f11588y0;
            pVar.K0(((measuredWidth - i11) - i12) - i12, i10 - i12, measuredWidth - i11, i10 + i12);
            return;
        }
        p pVar2 = this.f11591l0;
        int i13 = this.f11592m0;
        int i14 = f11588y0;
        pVar2.K0(i13, i10 - i14, (i14 * 2) + i13, i10 + i14);
    }

    public void Q0(boolean z10, boolean z11) {
        if (this.f11601v0 == null) {
            this.f11601v0 = new j3(this, this.f11591l0);
        }
        this.f11601v0.d(z10, z11);
    }

    @Override
    public void Q2() {
        this.f11591l0.G(null);
    }

    @Override
    public void U0() {
        this.f11593n0.c();
    }

    public void V0() {
        b1();
        e1();
        Y0();
        p pVar = this.f11591l0;
        d7 d7Var = this.f11590k0;
        pVar.G(d7Var != null ? d7Var.f() : null);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public final void Y0() {
        d7 d7Var = this.f11590k0;
        if (d7Var == null || d7Var.g() == null) {
            w8.i iVar = this.f11594o0;
            if (iVar != null) {
                this.f11595p0 = new b(25.0f, new b.a((int) R.id.theme_color_avatarInactive, iVar.f28635d.f15363a), null);
            } else {
                this.f11595p0 = null;
            }
        } else {
            this.f11595p0 = new b(25.0f, this.f11590k0.g(), null);
        }
    }

    public void b1() {
        String str;
        d7 d7Var = this.f11590k0;
        if (d7Var != null) {
            d7Var.D();
        }
        d7 d7Var2 = this.f11590k0;
        g gVar = null;
        if (d7Var2 != null) {
            str = d7Var2.k();
        } else {
            w8.i iVar = this.f11594o0;
            str = iVar != null ? iVar.a() : null;
        }
        float measuredWidth = (((getMeasuredWidth() - f11589z0) - this.f11592m0) - f11587x0) - (this.f11594o0 != null ? a0.i(32.0f) : 0);
        if (measuredWidth > 0.0f) {
            this.f11596q0 = str;
            if (!ib.i.i(str)) {
                gVar = new g.b(str, (int) measuredWidth, y.A0(16.0f), t.d.C).v().b().f();
            }
            this.f11597r0 = gVar;
        }
    }

    @Override
    public void d1(View view, Rect rect) {
        g gVar;
        if (this.f11590k0 != null && (gVar = this.f11597r0) != null) {
            gVar.q1(rect);
        }
    }

    public void e1() {
        float f10;
        String str;
        d7 d7Var = this.f11590k0;
        if (d7Var != null) {
            d7Var.E();
        }
        d7 d7Var2 = this.f11590k0;
        if (d7Var2 != null) {
            str = d7Var2.p();
            f10 = this.f11590k0.q();
        } else {
            w8.i iVar = this.f11594o0;
            if (iVar != null) {
                str = iVar.b();
                f10 = v0.T1(str, f11586w0);
            } else {
                str = null;
                f10 = 0.0f;
            }
        }
        float measuredWidth = (((getMeasuredWidth() - f11589z0) - this.f11592m0) - f11587x0) - (this.f11594o0 != null ? a0.i(32.0f) : 0);
        if (measuredWidth > 0.0f) {
            this.f11598s0 = str;
            if (f10 > measuredWidth) {
                String charSequence = TextUtils.ellipsize(str, f11586w0, measuredWidth, TextUtils.TruncateAt.END).toString();
                this.f11599t0 = charSequence;
                this.f11600u0 = v0.T1(charSequence, f11586w0);
            } else {
                this.f11599t0 = str;
                this.f11600u0 = f10;
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public d7 getUser() {
        return this.f11590k0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f11593n0.e(canvas);
        int i10 = a0.i(72.0f) / 2;
        boolean G2 = w.G2();
        int measuredWidth = getMeasuredWidth();
        g gVar = this.f11597r0;
        if (gVar != null) {
            gVar.t(canvas, this.f11592m0 + f11589z0, a0.i(17.0f));
        }
        if (this.f11599t0 != null) {
            TextPaint textPaint = f11586w0;
            d7 d7Var = this.f11590k0;
            textPaint.setColor(ae.j.L((d7Var == null || !d7Var.v()) ? R.id.theme_color_textLight : R.id.theme_color_textNeutral));
            String str = this.f11599t0;
            int i11 = this.f11592m0;
            canvas.drawText(str, G2 ? ((measuredWidth - i11) - f11589z0) - this.f11600u0 : i11 + f11589z0, B0, f11586w0);
        }
        if (this.f11590k0 != null) {
            P0();
            if (this.f11590k0.u()) {
                if (this.f11591l0.e0()) {
                    this.f11591l0.u0(canvas, f11588y0);
                }
                this.f11591l0.draw(canvas);
            } else {
                b bVar = this.f11595p0;
                if (bVar != null) {
                    bVar.a(canvas, this.f11591l0.J0(), this.f11591l0.x0());
                }
            }
        } else if (this.f11594o0 != null) {
            P0();
            b bVar2 = this.f11595p0;
            if (bVar2 != null) {
                bVar2.a(canvas, this.f11591l0.J0(), this.f11591l0.x0());
            }
            int measuredWidth2 = getMeasuredWidth() - a0.i(21.0f);
            int i12 = a0.i(14.0f);
            int i13 = a0.i(2.0f);
            Paint g10 = y.g(ae.j.L(R.id.theme_color_iconActive));
            if (G2) {
                int i14 = i13 / 2;
                int i15 = i13 % 2;
                canvas.drawRect(measuredWidth - measuredWidth2, i10 - i14, measuredWidth - (measuredWidth2 - i12), i10 + i14 + i15, g10);
                int i16 = i12 / 2;
                int i17 = measuredWidth2 - i16;
                canvas.drawRect(measuredWidth - ((i17 + i14) + i15), i10 - i16, measuredWidth - (i17 - i14), i10 + i16 + (i12 % 2), g10);
            } else {
                int i18 = i13 / 2;
                int i19 = i13 % 2;
                canvas.drawRect(measuredWidth2 - i12, i10 - i18, measuredWidth2, i10 + i18 + i19, g10);
                int i20 = i12 / 2;
                int i21 = measuredWidth2 - i20;
                canvas.drawRect(i21 - i18, i10 - i20, i21 + i18 + i19, i10 + i20 + (i12 % 2), g10);
            }
        }
        j3 j3Var = this.f11601v0;
        if (j3Var != null) {
            ce.b.y(canvas, this.f11591l0, j3Var.a());
        }
        this.f11593n0.d(canvas);
        this.f11593n0.b(canvas);
        d7 d7Var2 = this.f11590k0;
        if (d7Var2 != null && d7Var2.w()) {
            int measuredHeight = getMeasuredHeight() - Math.max(1, a0.i(0.5f));
            int measuredHeight2 = getMeasuredHeight();
            int i22 = this.f11592m0;
            int i23 = f11589z0;
            if (i22 + i23 > 0) {
                if (G2) {
                    canvas.drawRect((measuredWidth - i22) - i23, measuredHeight, measuredWidth, measuredHeight2, y.g(ae.j.u()));
                } else {
                    canvas.drawRect(0.0f, measuredHeight, i22 + i23, measuredHeight2, y.g(ae.j.u()));
                }
            }
            if (G2) {
                canvas.drawRect(0.0f, measuredHeight, (measuredWidth - this.f11592m0) - f11589z0, measuredHeight2, y.g(ae.j.M0()));
            } else {
                canvas.drawRect(this.f11592m0 + f11589z0, measuredHeight, getMeasuredWidth(), measuredHeight2, y.g(ae.j.M0()));
            }
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            D0();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.MeasureSpec.makeMeasureSpec(a0.i(72.0f), Log.TAG_TDLIB_OPTIONS));
        P0();
    }

    public void setContact(w8.i iVar) {
        if (!(this.f11590k0 == null && this.f11594o0 == iVar)) {
            this.f11590k0 = null;
            this.f11594o0 = iVar;
            D0();
        }
        this.f11591l0.G(null);
    }

    public void setOffsetLeft(int i10) {
        if (this.f11592m0 != i10) {
            this.f11592m0 = i10;
            int i11 = a0.i(72.0f) / 2;
            p pVar = this.f11591l0;
            int i12 = this.f11592m0;
            int i13 = f11588y0;
            pVar.K0(i12, i11 - i13, (i13 * 2) + i12, i11 + i13);
        }
    }

    @Override
    public void setRemoveDx(float f10) {
        this.f11593n0.f(f10);
    }

    public void setUser(d7 d7Var) {
        if (this.f11594o0 != null || !d7Var.equals(this.f11590k0)) {
            this.f11590k0 = d7Var;
            this.f11594o0 = null;
            D0();
        } else {
            if (this.f11596q0 == null || d7Var.D() || !this.f11596q0.equals(d7Var.k())) {
                b1();
            }
            if (this.f11598s0 == null || d7Var.E() || !this.f11598s0.equals(d7Var.p())) {
                e1();
            }
        }
        this.f11591l0.G(d7Var.f());
    }

    public void setUserForced(d7 d7Var) {
        this.f11590k0 = d7Var;
        this.f11594o0 = null;
        D0();
        this.f11591l0.G(d7Var.f());
    }
}
