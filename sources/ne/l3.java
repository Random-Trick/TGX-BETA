package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import ce.a0;
import gd.w;
import hd.h;
import ld.p;
import ud.x2;
import zd.o6;

public class l3 extends i implements a, x2.f {
    public final p f18182k0 = new p(this, a0.i(50.0f) / 2);
    public h f18183l0;

    public l3(Context context, o6 o6Var) {
        super(context, o6Var);
        int i10 = a0.i(62.0f);
        D0();
        setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    public void C0(h hVar) {
        if (this.f18183l0 == hVar) {
            G0();
        }
    }

    public final void D0() {
        int i10 = a0.i(62.0f);
        int i11 = a0.i(50.0f) / 2;
        int i12 = a0.i(11.0f);
        int i13 = a0.i(11.0f) + (i11 * 2);
        if (w.G2()) {
            int measuredWidth = getMeasuredWidth();
            int i14 = i10 / 2;
            this.f18182k0.K0(measuredWidth - i13, i14 - i11, measuredWidth - i12, i14 + i11);
            return;
        }
        int i15 = i10 / 2;
        this.f18182k0.K0(i12, i15 - i11, i13, i15 + i11);
    }

    public final void G0() {
        p pVar = this.f18182k0;
        h hVar = this.f18183l0;
        pVar.G(hVar != null ? hVar.j() : null);
    }

    @Override
    public void b() {
        this.f18182k0.b();
    }

    @Override
    public void d1(View view, Rect rect) {
        h hVar = this.f18183l0;
        if (hVar != null) {
            hVar.d1(view, rect);
        }
    }

    @Override
    public void e() {
        this.f18182k0.e();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f18183l0 != null) {
            D0();
            if (this.f18183l0.j() != null) {
                if (this.f18182k0.e0()) {
                    p pVar = this.f18182k0;
                    pVar.u0(canvas, pVar.t());
                }
                this.f18182k0.draw(canvas);
            } else if (this.f18183l0.k() != null) {
                this.f18183l0.k().a(canvas, this.f18182k0.J0(), this.f18182k0.x0());
            }
            this.f18183l0.i(this, this.f18182k0, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        h hVar;
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth > 0 && (hVar = this.f18183l0) != null) {
            hVar.r(measuredWidth);
        }
        D0();
    }

    public void setChat(h hVar) {
        h hVar2 = this.f18183l0;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.q().l(this);
            }
            this.f18183l0 = hVar;
            if (hVar != null) {
                w0(null, hVar.m(), null);
            } else {
                L();
            }
            if (hVar != null) {
                int measuredWidth = getMeasuredWidth();
                if (measuredWidth != 0) {
                    hVar.r(measuredWidth);
                }
                hVar.q().j(this);
            }
            G0();
            invalidate();
        }
    }
}
