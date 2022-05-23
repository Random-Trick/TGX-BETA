package ie;

import ae.j;
import ae.p;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import ce.a0;
import ce.y;
import gd.w;

public class e0 implements r {
    public final int f14240a;
    public p f14241b;

    public e0(int i10, p pVar) {
        this.f14240a = i10;
        this.f14241b = pVar;
    }

    @Override
    public void a(View view, Canvas canvas) {
        RectF a02 = y.a0();
        a02.top = a0.i(12.0f);
        a02.bottom = view.getMeasuredHeight() - a02.top;
        int i10 = a0.i(3.0f);
        int i11 = a0.i(14.0f);
        if (w.G2()) {
            a02.left = (view.getMeasuredWidth() - i11) - i10;
        } else {
            a02.left = i11;
        }
        a02.right = a02.left + i10;
        float i12 = a0.i(1.5f);
        float i13 = a0.i(1.5f);
        p pVar = this.f14241b;
        canvas.drawRoundRect(a02, i12, i13, y.g(pVar != null ? pVar.e(this.f14240a) : j.L(this.f14240a)));
        canvas.save();
        canvas.translate(a0.i(8.0f) * (w.G2() ? -1 : 1), 0.0f);
    }

    @Override
    public void b(View view, Canvas canvas) {
        canvas.restore();
    }
}
