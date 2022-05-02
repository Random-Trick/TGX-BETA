package p111he;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import p082fd.C4403w;
import p364zd.AbstractC11531p;
import p364zd.C11524j;

public class C5111e0 implements AbstractC5139r {
    public final int f17159a;
    public AbstractC11531p f17160b;

    public C5111e0(int i, AbstractC11531p pVar) {
        this.f17159a = i;
        this.f17160b = pVar;
    }

    @Override
    public void mo23818a(View view, Canvas canvas) {
        RectF a0 = C1410y.m37050a0();
        a0.top = C1357a0.m37541i(12.0f);
        a0.bottom = view.getMeasuredHeight() - a0.top;
        int i = C1357a0.m37541i(3.0f);
        int i2 = C1357a0.m37541i(14.0f);
        if (C4403w.m27984G2()) {
            a0.left = (view.getMeasuredWidth() - i2) - i;
        } else {
            a0.left = i2;
        }
        a0.right = a0.left + i;
        float i3 = C1357a0.m37541i(1.5f);
        float i4 = C1357a0.m37541i(1.5f);
        AbstractC11531p pVar = this.f17160b;
        canvas.drawRoundRect(a0, i3, i4, C1410y.m37039g(pVar != null ? pVar.mo92e(this.f17159a) : C11524j.m228N(this.f17159a)));
        canvas.save();
        canvas.translate(C1357a0.m37541i(8.0f) * (C4403w.m27984G2() ? -1 : 1), 0.0f);
    }

    @Override
    public void mo23817b(View view, Canvas canvas) {
        canvas.restore();
    }
}
