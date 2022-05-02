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
        super(w2Var, C4779t2.m25712C4(j, w2Var.m7645r0().mo4348c().m2183wb(j), new TdApi.MessageText(formattedText, null)));
        if (!mo4348c().m2475e7(C7316a.m17058c(m26247A4().m4207i()))) {
            C5459x0 a = new C5459x0(C4403w.m27869i1(R.string.WhatThisBotCanDo), AbstractC4761s4.m26125M4(), m26134L4(), null).m22635a(4);
            this.f16294U2 = a;
            a.m22636H(this.f16101P0);
        }
        C5459x0 D = new C5459x0(formattedText.text, AbstractC4761s4.m26125M4(), m26134L4(), AbstractC5411l0.m22789F(this.f16099O0, formattedText, null)).m22640D(m26209E0());
        this.f16295V2 = D;
        D.m22636H(this.f16101P0);
        this.f16296W2 = C1362c.m37482g(w2Var.m7645r0().mo4347s().getResources(), R.drawable.baseline_help_24);
    }

    @Override
    public int mo25354J3() {
        int X2 = (((((mo25222X2() + C1357a0.m37541i(6.0f)) + (AbstractC4761s4.f16080y2 * 2)) + AbstractC4761s4.f16071p2) - AbstractC4761s4.f16068m2) - AbstractC4761s4.f16070o2) + AbstractC4761s4.f16074s2;
        View p1 = m25846p1();
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
        int i = (int) (((((measuredHeight - X2) - AbstractC4761s4.f16071p2) - AbstractC4761s4.f16074s2) - C1357a0.m37541i(6.0f)) * 0.5f);
        C9580j1 j1Var = this.f16297X2;
        if (j1Var != null) {
            int k0 = j1Var.m8115k0();
            for (int i2 = 0; i2 < k0; i2++) {
                AbstractC4761s4 j0 = this.f16297X2.m8116j0(i2);
                if (j0 != null && j0.m25993Z3().f25406id != 0 && (i = i - j0.mo25354J3()) <= 0) {
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
    public int mo25222X2() {
        int height = this.f16295V2.getHeight();
        C5459x0 x0Var = this.f16294U2;
        return height + (x0Var != null ? x0Var.getHeight() + C1357a0.m37541i(3.0f) : 0);
    }

    @Override
    public void mo25221a0(int i) {
        int i2 = (this.f16096N - AbstractC4761s4.f16072q2) - AbstractC4761s4.f16066k2;
        C5459x0 x0Var = this.f16294U2;
        if (x0Var != null) {
            x0Var.m22642B(i2);
        }
        this.f16295V2.m22642B(i2);
    }

    @Override
    public void mo25220b1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
        int i4 = C1357a0.m37541i(6.0f);
        if (!m26068R9()) {
            Drawable drawable = this.f16296W2;
            C1362c.m37487b(canvas, drawable, AbstractC4761s4.f16011A2 - (drawable.getMinimumWidth() / 2), AbstractC4761s4.f16074s2 + i4, C1410y.m37068J());
        }
        if (m26068R9()) {
            i = mo25219b2() + m26187G1();
        } else {
            i2 = AbstractC4761s4.f16074s2 + i4 + C1357a0.m37541i(3.0f);
        }
        C5459x0 x0Var = this.f16294U2;
        if (x0Var != null) {
            x0Var.m22628j(canvas, i, i2, null, 1.0f);
            i2 += this.f16294U2.getHeight() + C1357a0.m37541i(3.0f);
        }
        this.f16295V2.m22628j(canvas, i, i2, null, 1.0f);
    }

    @Override
    public int mo25218c3() {
        C5459x0 x0Var = this.f16294U2;
        return Math.max(x0Var != null ? x0Var.getWidth() : 0, this.f16295V2.getWidth());
    }

    public int m25353ca() {
        return this.f16298Y2;
    }

    public void m25352da(C9580j1 j1Var) {
        this.f16297X2 = j1Var;
    }

    @Override
    public boolean mo25217f8(C9552h1 h1Var, MotionEvent motionEvent) {
        return super.mo25217f8(h1Var, motionEvent) || this.f16295V2.m22614x(h1Var, motionEvent);
    }

    @Override
    public boolean mo25351j5() {
        return true;
    }

    @Override
    public boolean mo25295m8(View view, float f, float f2) {
        return this.f16295V2.m22643A(view) || super.mo25295m8(view, f, f2);
    }

    @Override
    public boolean mo25350s0() {
        return false;
    }

    @Override
    public boolean mo25349w7() {
        return false;
    }

    @Override
    public boolean mo25348y0() {
        return true;
    }
}
