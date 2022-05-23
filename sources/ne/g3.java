package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ce.y;
import gb.h;
import gb.j;
import hd.f0;
import ld.c;
import ld.p;
import org.thunderdog.challegram.widget.SparseDrawableView;

public class g3 extends SparseDrawableView {
    public int N;
    public f0 O;
    public boolean P;
    public final c f18068b = new c(this, 0);
    public final p f18069c = new p(this, 0);
    public final j M = new a(this);

    public class a extends h {
        public a(View view) {
            super(view);
        }

        @Override
        public boolean a() {
            if (g3.this.O == null) {
                return true;
            }
            g3.this.O.m0(g3.this.f18069c);
            return true;
        }
    }

    public g3(Context context) {
        super(context);
    }

    public void A() {
        this.P = true;
    }

    public void b() {
        this.f18069c.b();
        this.f18068b.b();
    }

    public void clear() {
        setWrapper(null);
    }

    public void e() {
        this.f18069c.e();
        this.f18068b.e();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.N != 0) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom(), y.g(ae.j.L(this.N)));
        }
        if (this.O != null) {
            int paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
            f0 f0Var = this.O;
            f0Var.s(this, canvas, paddingLeft - (f0Var.B() / 2), getPaddingTop(), this.f18068b, this.f18069c, 1.0f);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        x();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.O;
        return f0Var != null && f0Var.i0(this, motionEvent);
    }

    public void setBackgroundColorId(int i10) {
        this.N = i10;
    }

    public void setWrapper(f0 f0Var) {
        f0 f0Var2 = this.O;
        if (f0Var2 != f0Var) {
            if (f0Var2 != null) {
                f0Var2.C0(null);
            }
            this.O = f0Var;
            if (f0Var != null) {
                x();
                y();
                f0Var.G().k();
                f0Var.C0(this.M);
            }
        }
    }

    public final void x() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        f0 f0Var = this.O;
        if (f0Var != null && measuredWidth > 0 && measuredHeight > 0) {
            if (this.P) {
                float F = f0Var.F();
                float E = this.O.E();
                float min = Math.min(measuredWidth / F, measuredHeight / E);
                this.O.j((int) (F * min), (int) (E * min));
                return;
            }
            f0Var.j(measuredWidth, measuredHeight);
        }
    }

    public void y() {
        f0 f0Var = this.O;
        if (f0Var != null) {
            f0Var.n0(this.f18068b);
            this.O.m0(this.f18069c);
            return;
        }
        this.f18068b.clear();
        this.f18069c.clear();
    }
}
