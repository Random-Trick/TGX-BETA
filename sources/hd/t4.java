package hd;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import ce.a0;
import ce.c;
import ce.y;
import gd.w;
import je.l0;
import je.x0;
import ob.a;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import vc.g1;
import vc.i1;
import vc.v2;

public class t4 extends s4 {
    public x0 U2;
    public x0 V2;
    public Drawable W2;
    public i1 X2;
    public int Y2;

    public t4(v2 v2Var, long j10, TdApi.FormattedText formattedText) {
        super(v2Var, t2.C4(j10, v2Var.r0().c().Ab(j10), new TdApi.MessageText(formattedText, null)));
        if (!c().i7(a.c(z4().i()))) {
            x0 a10 = new x0(w.i1(R.string.WhatThisBotCanDo), s4.L4(), K4(), null).a(4);
            this.U2 = a10;
            a10.H(this.P0);
        }
        x0 D = new x0(formattedText.text, s4.L4(), K4(), l0.F(this.O0, formattedText, null)).D(F0());
        this.V2 = D;
        D.H(this.P0);
        this.W2 = c.g(v2Var.r0().t().getResources(), R.drawable.baseline_help_24);
    }

    @Override
    public int G3() {
        int W2 = (((((W2() + a0.i(6.0f)) + (s4.f13447y2 * 2)) + s4.f13438p2) - s4.f13435m2) - s4.f13437o2) + s4.f13441s2;
        View n12 = n1();
        if (n12 == null) {
            this.Y2 = W2;
            return W2;
        }
        ViewParent parent = n12.getParent();
        if (parent == null) {
            this.Y2 = W2;
            return W2;
        }
        int measuredHeight = ((View) parent).getMeasuredHeight();
        if (measuredHeight == 0 || W2 >= measuredHeight) {
            this.Y2 = W2;
            return W2;
        }
        int i10 = (int) (((((measuredHeight - W2) - s4.f13438p2) - s4.f13441s2) - a0.i(6.0f)) * 0.5f);
        i1 i1Var = this.X2;
        if (i1Var != null) {
            int j02 = i1Var.j0();
            for (int i11 = 0; i11 < j02; i11++) {
                s4 i02 = this.X2.i0(i11);
                if (i02 != null && i02.X3().f19946id != 0 && (i10 = i10 - i02.G3()) <= 0) {
                    this.Y2 = W2;
                    return W2;
                }
            }
        }
        int i12 = W2 + i10;
        this.Y2 = i12;
        return i12;
    }

    @Override
    public int W2() {
        int height = this.V2.getHeight();
        x0 x0Var = this.U2;
        return height + (x0Var != null ? x0Var.getHeight() + a0.i(3.0f) : 0);
    }

    @Override
    public void a1(g1 g1Var, Canvas canvas, int i10, int i11, int i12) {
        int i13 = a0.i(6.0f);
        if (!R9()) {
            Drawable drawable = this.W2;
            c.b(canvas, drawable, s4.A2 - (drawable.getMinimumWidth() / 2), s4.f13441s2 + i13, y.J());
        }
        if (R9()) {
            i10 = Y1() + D1();
        } else {
            i11 = s4.f13441s2 + i13 + a0.i(3.0f);
        }
        x0 x0Var = this.U2;
        if (x0Var != null) {
            x0Var.j(canvas, i10, i11, null, 1.0f);
            i11 += this.U2.getHeight() + a0.i(3.0f);
        }
        this.V2.j(canvas, i10, i11, null, 1.0f);
    }

    @Override
    public int a3() {
        x0 x0Var = this.U2;
        return Math.max(x0Var != null ? x0Var.getWidth() : 0, this.V2.getWidth());
    }

    @Override
    public void b0(int i10) {
        int i11 = (this.N - s4.f13439q2) - s4.f13433k2;
        x0 x0Var = this.U2;
        if (x0Var != null) {
            x0Var.B(i11);
        }
        this.V2.B(i11);
    }

    public int ca() {
        return this.Y2;
    }

    public void da(i1 i1Var) {
        this.X2 = i1Var;
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        return super.f8(g1Var, motionEvent) || this.V2.x(g1Var, motionEvent);
    }

    @Override
    public boolean i5() {
        return true;
    }

    @Override
    public boolean m8(View view, float f10, float f11) {
        return this.V2.A(view) || super.m8(view, f10, f11);
    }

    @Override
    public boolean t0() {
        return false;
    }

    @Override
    public boolean w7() {
        return false;
    }

    @Override
    public boolean z0() {
        return true;
    }
}
