package gd;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import ie.AbstractC5411l0;
import ie.C5459x0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p193nb.C7316a;
import p291uc.C9552h1;
import p291uc.C9580j1;
import p291uc.C9678w2;

public class C4791t4 extends AbstractC4761s4 {
    public C5459x0 f16294U2;
    public C5459x0 f16295V2;
    public Drawable f16296W2;
    public C9580j1 f16297X2;
    public int f16298Y2;

    public C4791t4(C9678w2 w2Var, long j, TdApi.FormattedText formattedText) {
        super(w2Var, C4779t2.m25713C4(j, w2Var.m7645r0().mo4348c().m2183wb(j), new TdApi.MessageText(formattedText, null)));
        if (!mo4348c().m2475e7(C7316a.m17058c(m26248A4().m4207i()))) {
            C5459x0 a = new C5459x0(C4403w.m27871i1(R.string.WhatThisBotCanDo), AbstractC4761s4.m26126M4(), m26135L4(), null).m22636a(4);
            this.f16294U2 = a;
            a.m22637H(this.f16101P0);
        }
        C5459x0 D = new C5459x0(formattedText.text, AbstractC4761s4.m26126M4(), m26135L4(), AbstractC5411l0.m22790F(this.f16099O0, formattedText, null)).m22641D(m26210E0());
        this.f16295V2 = D;
        D.m22637H(this.f16101P0);
        this.f16296W2 = C1362c.m37485g(w2Var.m7645r0().mo4347s().getResources(), R.drawable.baseline_help_24);
    }

    @Override
    public int mo25355J3() {
        int X2 = (((((mo25223X2() + C1357a0.m37544i(6.0f)) + (AbstractC4761s4.f16080y2 * 2)) + AbstractC4761s4.f16071p2) - AbstractC4761s4.f16068m2) - AbstractC4761s4.f16070o2) + AbstractC4761s4.f16074s2;
        View p1 = m25847p1();
        if (p1 == null) {
            this.f16298Y2 = X2;
            return X2;
        }
        ViewParent parent = p1.getParent();
        if (parent == null) {
            this.f16298Y2 = X2;
            return X2;
        }
        int measuredHeight = ((View) parent).getMeasuredHeight();
        if (measuredHeight == 0 || X2 >= measuredHeight) {
            this.f16298Y2 = X2;
            return X2;
        }
        int i = (int) (((((measuredHeight - X2) - AbstractC4761s4.f16071p2) - AbstractC4761s4.f16074s2) - C1357a0.m37544i(6.0f)) * 0.5f);
        C9580j1 j1Var = this.f16297X2;
        if (j1Var != null) {
            int k0 = j1Var.m8115k0();
            for (int i2 = 0; i2 < k0; i2++) {
                AbstractC4761s4 j0 = this.f16297X2.m8116j0(i2);
                if (j0 != null && j0.m25994Z3().f25409id != 0 && (i = i - j0.mo25355J3()) <= 0) {
                    this.f16298Y2 = X2;
                    return X2;
                }
            }
        }
        int i3 = X2 + i;
        this.f16298Y2 = i3;
        return i3;
    }

    @Override
    public int mo25223X2() {
        int height = this.f16295V2.getHeight();
        C5459x0 x0Var = this.f16294U2;
        return height + (x0Var != null ? x0Var.getHeight() + C1357a0.m37544i(3.0f) : 0);
    }

    @Override
    public void mo25222a0(int i) {
        int i2 = (this.f16096N - AbstractC4761s4.f16072q2) - AbstractC4761s4.f16066k2;
        C5459x0 x0Var = this.f16294U2;
        if (x0Var != null) {
            x0Var.m22643B(i2);
        }
        this.f16295V2.m22643B(i2);
    }

    @Override
    public void mo25221b1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
        int i4 = C1357a0.m37544i(6.0f);
        if (!m26069R9()) {
            Drawable drawable = this.f16296W2;
            C1362c.m37490b(canvas, drawable, AbstractC4761s4.f16011A2 - (drawable.getMinimumWidth() / 2), AbstractC4761s4.f16074s2 + i4, C1410y.m37071J());
        }
        if (m26069R9()) {
            i = mo25220b2() + m26188G1();
        } else {
            i2 = AbstractC4761s4.f16074s2 + i4 + C1357a0.m37544i(3.0f);
        }
        C5459x0 x0Var = this.f16294U2;
        if (x0Var != null) {
            x0Var.m22629j(canvas, i, i2, null, 1.0f);
            i2 += this.f16294U2.getHeight() + C1357a0.m37544i(3.0f);
        }
        this.f16295V2.m22629j(canvas, i, i2, null, 1.0f);
    }

    @Override
    public int mo25219c3() {
        C5459x0 x0Var = this.f16294U2;
        return Math.max(x0Var != null ? x0Var.getWidth() : 0, this.f16295V2.getWidth());
    }

    public int m25354ca() {
        return this.f16298Y2;
    }

    public void m25353da(C9580j1 j1Var) {
        this.f16297X2 = j1Var;
    }

    @Override
    public boolean mo25218f8(C9552h1 h1Var, MotionEvent motionEvent) {
        return super.mo25218f8(h1Var, motionEvent) || this.f16295V2.m22615x(h1Var, motionEvent);
    }

    @Override
    public boolean mo25352j5() {
        return true;
    }

    @Override
    public boolean mo25296m8(View view, float f, float f2) {
        return this.f16295V2.m22644A(view) || super.mo25296m8(view, f, f2);
    }

    @Override
    public boolean mo25351s0() {
        return false;
    }

    @Override
    public boolean mo25350w7() {
        return false;
    }

    @Override
    public boolean mo25349y0() {
        return true;
    }
}
