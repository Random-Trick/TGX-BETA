package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import be.C1357a0;
import gd.C4649h;
import p082fd.C4403w;
import p156kd.C6257p;
import p350yd.C10930q6;
import td.C9357x2;

public class C6952l3 extends View$OnClickListenerC6902i implements AbstractC6828a, C9357x2.AbstractC9363f {
    public final C6257p f21953k0 = new C6257p(this, C1357a0.m37544i(50.0f) / 2);
    public C4649h f21954l0;

    public C6952l3(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        int i = C1357a0.m37544i(62.0f);
        m18384C0();
        setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    public void m18385B0(C4649h hVar) {
        if (this.f21954l0 == hVar) {
            m18383F0();
        }
    }

    public final void m18384C0() {
        int i = C1357a0.m37544i(62.0f);
        int i2 = C1357a0.m37544i(50.0f) / 2;
        int i3 = C1357a0.m37544i(11.0f);
        int i4 = C1357a0.m37544i(11.0f) + (i2 * 2);
        if (C4403w.m27986G2()) {
            int measuredWidth = getMeasuredWidth();
            int i5 = i / 2;
            this.f21953k0.mo20257K0(measuredWidth - i4, i5 - i2, measuredWidth - i3, i5 + i2);
            return;
        }
        int i6 = i / 2;
        this.f21953k0.mo20257K0(i3, i6 - i2, i4, i6 + i2);
    }

    public final void m18383F0() {
        C6257p pVar = this.f21953k0;
        C4649h hVar = this.f21954l0;
        pVar.m20820G(hVar != null ? hVar.m26644j() : null);
    }

    @Override
    public void mo8229b() {
        this.f21953k0.mo20248b();
    }

    @Override
    public void mo8225f() {
        this.f21953k0.mo20246f();
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        C4649h hVar = this.f21954l0;
        if (hVar != null) {
            hVar.mo8098f1(view, rect);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f21954l0 != null) {
            m18384C0();
            if (this.f21954l0.m26644j() != null) {
                if (this.f21953k0.mo20247c0()) {
                    C6257p pVar = this.f21953k0;
                    pVar.mo20229u0(canvas, pVar.m20797t());
                }
                this.f21953k0.draw(canvas);
            } else if (this.f21954l0.m26643k() != null) {
                this.f21954l0.m26643k().m27217a(canvas, this.f21953k0.mo20258I0(), this.f21953k0.mo20228y0());
            }
            this.f21954l0.m26645i(this, this.f21953k0, canvas);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        C4649h hVar;
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth > 0 && (hVar = this.f21954l0) != null) {
            hVar.m26637r(measuredWidth);
        }
        m18384C0();
    }

    public void setChat(C4649h hVar) {
        C4649h hVar2 = this.f21954l0;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.m26638q().m28241l(this);
            }
            this.f21954l0 = hVar;
            if (hVar != null) {
                m18494v0(null, hVar.m26642m(), null);
            } else {
                m18511K();
            }
            if (hVar != null) {
                int measuredWidth = getMeasuredWidth();
                if (measuredWidth != 0) {
                    hVar.m26637r(measuredWidth);
                }
                hVar.m26638q().m28243j(this);
            }
            m18383F0();
            invalidate();
        }
    }
}
