package p053dd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1389o;
import be.C1410y;
import gd.C4587b;
import gd.C4618d7;
import ie.C5428t;
import ie.RunnableC5390g;
import me.C6935j3;
import me.View$OnClickListenerC6902i;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p053dd.C4007j;
import p082fd.C4403w;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6257p;
import p350yd.C10930q6;
import p350yd.C11134y8;
import p364zd.C11524j;
import p364zd.C11541z;
import td.C9357x2;

public class C4022o extends View$OnClickListenerC6902i implements AbstractC5911c, C4007j.AbstractC4011d, C9357x2.AbstractC9363f {
    public static int f13476A0;
    public static int f13477B0;
    public static int f13478C0;
    public static TextPaint f13479w0;
    public static int f13480x0;
    public static int f13481y0;
    public static int f13482z0;
    public C4618d7 f13483k0;
    public final C6257p f13484l0;
    public int f13485m0 = C1357a0.m37541i(68.0f);
    public C4007j f13486n0;
    public C11134y8.C11144i f13487o0;
    public C4587b f13488p0;
    public String f13489q0;
    public RunnableC5390g f13490r0;
    public String f13491s0;
    public String f13492t0;
    public float f13493u0;
    public C6935j3 f13494v0;

    public C4022o(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        if (f13479w0 == null) {
            m29282J0();
        }
        if (f13481y0 == 0) {
            f13481y0 = C1357a0.m37541i(25.0f);
            f13480x0 = C1357a0.m37541i(16.0f);
            f13482z0 = (f13481y0 * 2) + C1357a0.m37541i(11.0f);
            f13476A0 = C1357a0.m37541i(20.0f) + C1357a0.m37541i(12.0f);
            f13477B0 = C1357a0.m37541i(40.0f) + C1357a0.m37541i(12.0f);
            f13478C0 = C1357a0.m37541i(30.0f) + C1357a0.m37541i(12.0f);
        }
        this.f13484l0 = new C6257p(this, f13481y0);
        m29281M0();
        this.f13486n0 = new C4007j(this, R.drawable.baseline_remove_circle_24);
    }

    public static void m29282J0() {
        TextPaint textPaint = new TextPaint(5);
        f13479w0 = textPaint;
        textPaint.setTypeface(C1389o.m37258k());
        f13479w0.setTextSize(C1357a0.m37541i(14.0f));
        f13479w0.setColor(C11524j.m213U0());
        C11541z.m24e(f13479w0, R.id.theme_color_textLight);
    }

    public static TextPaint getStatusPaint() {
        if (f13479w0 == null) {
            m29282J0();
        }
        return f13479w0;
    }

    public void m29285B0() {
        this.f13484l0.mo20245f();
    }

    public final void m29284C0() {
        if (getMeasuredWidth() > 0) {
            m29277W0();
            m29276c1();
            m29278U0();
        }
    }

    public void m29283F0() {
        this.f13484l0.mo20247b();
    }

    public final void m29281M0() {
        int i = C1357a0.m37541i(72.0f) / 2;
        if (C4403w.m27984G2()) {
            int measuredWidth = getMeasuredWidth();
            C6257p pVar = this.f13484l0;
            int i2 = this.f13485m0;
            int i3 = f13481y0;
            pVar.mo20256K0(((measuredWidth - i2) - i3) - i3, i - i3, measuredWidth - i2, i + i3);
            return;
        }
        C6257p pVar2 = this.f13484l0;
        int i4 = this.f13485m0;
        int i5 = f13481y0;
        pVar2.mo20256K0(i4, i - i5, (i5 * 2) + i4, i + i5);
    }

    public void m29280O0(boolean z, boolean z2) {
        if (this.f13494v0 == null) {
            this.f13494v0 = new C6935j3(this, this.f13484l0);
        }
        this.f13494v0.m18402d(z, z2);
    }

    public void m29279Q0() {
        m29277W0();
        m29276c1();
        m29278U0();
        C6257p pVar = this.f13484l0;
        C4618d7 d7Var = this.f13483k0;
        pVar.m20819G(d7Var != null ? d7Var.m26882f() : null);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public final void m29278U0() {
        C4618d7 d7Var = this.f13483k0;
        if (d7Var == null || d7Var.m26881g() == null) {
            C11134y8.C11144i iVar = this.f13487o0;
            if (iVar != null) {
                this.f13488p0 = new C4587b(25.0f, new C4587b.C4588a((int) R.id.theme_color_avatarInactive, iVar.f35750d.f17711a), null);
            } else {
                this.f13488p0 = null;
            }
        } else {
            this.f13488p0 = new C4587b(25.0f, this.f13483k0.m26881g(), null);
        }
    }

    @Override
    public void mo5812V0() {
        this.f13486n0.m29340c();
    }

    public void m29277W0() {
        String str;
        C4618d7 d7Var = this.f13483k0;
        if (d7Var != null) {
            d7Var.m26888D();
        }
        C4618d7 d7Var2 = this.f13483k0;
        RunnableC5390g gVar = null;
        if (d7Var2 != null) {
            str = d7Var2.m26877k();
        } else {
            C11134y8.C11144i iVar = this.f13487o0;
            str = iVar != null ? iVar.m1352a() : null;
        }
        float measuredWidth = (((getMeasuredWidth() - f13482z0) - this.f13485m0) - f13480x0) - (this.f13487o0 != null ? C1357a0.m37541i(32.0f) : 0);
        if (measuredWidth > 0.0f) {
            this.f13489q0 = str;
            if (!C5070i.m24061i(str)) {
                gVar = new RunnableC5390g.C5392b(str, (int) measuredWidth, C1410y.m37083A0(16.0f), C5428t.AbstractC5441d.f17872C).m22868v().m22888b().m22884f();
            }
            this.f13490r0 = gVar;
        }
    }

    @Override
    public void mo4501a3() {
        this.f13484l0.m20819G(null);
    }

    public void m29276c1() {
        float f;
        String str;
        C4618d7 d7Var = this.f13483k0;
        if (d7Var != null) {
            d7Var.m26887E();
        }
        C4618d7 d7Var2 = this.f13483k0;
        if (d7Var2 != null) {
            str = d7Var2.m26872p();
            f = this.f13483k0.m26871q();
        } else {
            C11134y8.C11144i iVar = this.f13487o0;
            if (iVar != null) {
                str = iVar.m1351b();
                f = C7389v0.m16680T1(str, f13479w0);
            } else {
                str = null;
                f = 0.0f;
            }
        }
        float measuredWidth = (((getMeasuredWidth() - f13482z0) - this.f13485m0) - f13480x0) - (this.f13487o0 != null ? C1357a0.m37541i(32.0f) : 0);
        if (measuredWidth > 0.0f) {
            this.f13491s0 = str;
            if (f > measuredWidth) {
                String charSequence = TextUtils.ellipsize(str, f13479w0, measuredWidth, TextUtils.TruncateAt.END).toString();
                this.f13492t0 = charSequence;
                this.f13493u0 = C7389v0.m16680T1(charSequence, f13479w0);
            } else {
                this.f13492t0 = str;
                this.f13493u0 = f;
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        RunnableC5390g gVar;
        if (this.f13483k0 != null && (gVar = this.f13490r0) != null) {
            gVar.m22908q1(rect);
        }
    }

    public C4618d7 getUser() {
        return this.f13483k0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f13486n0.m29338e(canvas);
        int i = C1357a0.m37541i(72.0f) / 2;
        boolean G2 = C4403w.m27984G2();
        int measuredWidth = getMeasuredWidth();
        RunnableC5390g gVar = this.f13490r0;
        if (gVar != null) {
            gVar.m22903t(canvas, this.f13485m0 + f13482z0, C1357a0.m37541i(17.0f));
        }
        if (this.f13492t0 != null) {
            TextPaint textPaint = f13479w0;
            C4618d7 d7Var = this.f13483k0;
            textPaint.setColor(C11524j.m228N((d7Var == null || !d7Var.m26866v()) ? R.id.theme_color_textLight : R.id.theme_color_textNeutral));
            String str = this.f13492t0;
            int i2 = this.f13485m0;
            canvas.drawText(str, G2 ? ((measuredWidth - i2) - f13482z0) - this.f13493u0 : i2 + f13482z0, f13477B0, f13479w0);
        }
        if (this.f13483k0 != null) {
            m29281M0();
            if (this.f13483k0.m26867u()) {
                if (this.f13484l0.mo20246c0()) {
                    this.f13484l0.mo20228u0(canvas, f13481y0);
                }
                this.f13484l0.draw(canvas);
            } else {
                C4587b bVar = this.f13488p0;
                if (bVar != null) {
                    bVar.m27215a(canvas, this.f13484l0.mo20257I0(), this.f13484l0.mo20227y0());
                }
            }
        } else if (this.f13487o0 != null) {
            m29281M0();
            C4587b bVar2 = this.f13488p0;
            if (bVar2 != null) {
                bVar2.m27215a(canvas, this.f13484l0.mo20257I0(), this.f13484l0.mo20227y0());
            }
            int measuredWidth2 = getMeasuredWidth() - C1357a0.m37541i(21.0f);
            int i3 = C1357a0.m37541i(14.0f);
            int i4 = C1357a0.m37541i(2.0f);
            Paint g = C1410y.m37039g(C11524j.m228N(R.id.theme_color_iconActive));
            if (G2) {
                int i5 = i4 / 2;
                int i6 = i4 % 2;
                canvas.drawRect(measuredWidth - measuredWidth2, i - i5, measuredWidth - (measuredWidth2 - i3), i + i5 + i6, g);
                int i7 = i3 / 2;
                int i8 = measuredWidth2 - i7;
                canvas.drawRect(measuredWidth - ((i8 + i5) + i6), i - i7, measuredWidth - (i8 - i5), i + i7 + (i3 % 2), g);
            } else {
                int i9 = i4 / 2;
                int i10 = i4 % 2;
                canvas.drawRect(measuredWidth2 - i3, i - i9, measuredWidth2, i + i9 + i10, g);
                int i11 = i3 / 2;
                int i12 = measuredWidth2 - i11;
                canvas.drawRect(i12 - i9, i - i11, i12 + i9 + i10, i + i11 + (i3 % 2), g);
            }
        }
        C6935j3 j3Var = this.f13494v0;
        if (j3Var != null) {
            C1359b.m37494y(canvas, this.f13484l0, j3Var.m18405a());
        }
        this.f13486n0.m29339d(canvas);
        this.f13486n0.m29341b(canvas);
        C4618d7 d7Var2 = this.f13483k0;
        if (d7Var2 != null && d7Var2.m26865w()) {
            int measuredHeight = getMeasuredHeight() - Math.max(1, C1357a0.m37541i(0.5f));
            int measuredHeight2 = getMeasuredHeight();
            int i13 = this.f13485m0;
            int i14 = f13482z0;
            if (i13 + i14 > 0) {
                if (G2) {
                    canvas.drawRect((measuredWidth - i13) - i14, measuredHeight, measuredWidth, measuredHeight2, C1410y.m37039g(C11524j.m148w()));
                } else {
                    canvas.drawRect(0.0f, measuredHeight, i13 + i14, measuredHeight2, C1410y.m37039g(C11524j.m148w()));
                }
            }
            if (G2) {
                canvas.drawRect(0.0f, measuredHeight, (measuredWidth - this.f13485m0) - f13482z0, measuredHeight2, C1410y.m37039g(C11524j.m223P0()));
            } else {
                canvas.drawRect(this.f13485m0 + f13482z0, measuredHeight, getMeasuredWidth(), measuredHeight2, C1410y.m37039g(C11524j.m223P0()));
            }
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            m29284C0();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.MeasureSpec.makeMeasureSpec(C1357a0.m37541i(72.0f), Log.TAG_TDLIB_OPTIONS));
        m29281M0();
    }

    public void setContact(C11134y8.C11144i iVar) {
        if (!(this.f13483k0 == null && this.f13487o0 == iVar)) {
            this.f13483k0 = null;
            this.f13487o0 = iVar;
            m29284C0();
        }
        this.f13484l0.m20819G(null);
    }

    public void setOffsetLeft(int i) {
        if (this.f13485m0 != i) {
            this.f13485m0 = i;
            int i2 = C1357a0.m37541i(72.0f) / 2;
            C6257p pVar = this.f13484l0;
            int i3 = this.f13485m0;
            int i4 = f13481y0;
            pVar.mo20256K0(i3, i2 - i4, (i4 * 2) + i3, i2 + i4);
        }
    }

    @Override
    public void setRemoveDx(float f) {
        this.f13486n0.m29337f(f);
    }

    public void setUser(C4618d7 d7Var) {
        if (this.f13487o0 != null || !d7Var.equals(this.f13483k0)) {
            this.f13483k0 = d7Var;
            this.f13487o0 = null;
            m29284C0();
        } else {
            if (this.f13489q0 == null || d7Var.m26888D() || !this.f13489q0.equals(d7Var.m26877k())) {
                m29277W0();
            }
            if (this.f13491s0 == null || d7Var.m26887E() || !this.f13491s0.equals(d7Var.m26872p())) {
                m29276c1();
            }
        }
        this.f13484l0.m20819G(d7Var.m26882f());
    }

    public void setUserForced(C4618d7 d7Var) {
        this.f13483k0 = d7Var;
        this.f13487o0 = null;
        m29284C0();
        this.f13484l0.m20819G(d7Var.m26882f());
    }
}
