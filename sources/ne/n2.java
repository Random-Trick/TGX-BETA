package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ce.a0;
import ce.j0;
import db.b;
import eb.k;
import kb.c;
import ud.v2;

public class n2 extends View implements k.b, v2, a, c {
    public View M;
    public m2 f18271a;
    public float f18272b;
    public k f18273c;

    public n2(Context context) {
        super(context);
    }

    private void setFactor(float f10) {
        if (this.f18272b != f10) {
            this.f18272b = f10;
            m2 m2Var = this.f18271a;
            if (m2Var != null) {
                m2Var.o(f10);
            }
            View view = this.M;
            if (view != null) {
                view.setAlpha(1.0f - f10);
            }
        }
    }

    @Override
    public void Q2() {
        b();
    }

    public void a(float f10) {
        if (this.f18273c == null) {
            this.f18273c = new k(0, this, b.f7287b, 180L, this.f18272b);
        }
        this.f18273c.i(f10);
    }

    @Override
    public void b() {
        m2 m2Var = this.f18271a;
        if (m2Var != null) {
            m2Var.b(this);
        }
    }

    public float c() {
        k kVar = this.f18273c;
        if (kVar != null) {
            kVar.k();
        }
        return this.f18272b;
    }

    public void d(float f10) {
        k kVar = this.f18273c;
        if (kVar != null) {
            kVar.l(f10);
        }
        setFactor(f10);
    }

    @Override
    public void e() {
        if (this.f18271a != null) {
            l();
        }
    }

    public void f(float f10) {
        m2 m2Var = new m2(j0.r(getContext()), a0.i(8.0f));
        this.f18271a = m2Var;
        m2Var.C(a0.i(2.5f));
        this.f18271a.y();
        this.f18271a.o(f10);
        d(f10);
        setMinimumWidth(a0.i(20.0f));
        setMinimumHeight(a0.i(20.0f));
    }

    public void g(float f10, float f11, float f12) {
        m2 m2Var = new m2(j0.r(getContext()), a0.i(f10));
        this.f18271a = m2Var;
        m2Var.o(f11);
        d(f11);
        setMinimumWidth(a0.i(f12));
        setMinimumHeight(a0.i(f12));
    }

    public m2 getProgress() {
        return this.f18271a;
    }

    public void h(float f10) {
        m2 m2Var = new m2(j0.r(getContext()), a0.i(18.0f));
        this.f18271a = m2Var;
        m2Var.C(a0.i(4.0f));
        this.f18271a.y();
        this.f18271a.o(f10);
        d(f10);
        l();
        setMinimumWidth(a0.i(44.0f));
        setMinimumHeight(a0.i(44.0f));
    }

    public void i(float f10) {
        m2 m2Var = new m2(j0.r(getContext()), a0.i(6.0f));
        this.f18271a = m2Var;
        m2Var.o(f10);
        this.f18271a.B();
        this.f18271a.y();
        d(f10);
        setMinimumWidth(a0.i(16.0f));
        setMinimumHeight(a0.i(16.0f));
    }

    public void j(float f10) {
        m2 m2Var = new m2(j0.r(getContext()), a0.i(3.5f));
        this.f18271a = m2Var;
        m2Var.o(f10);
        d(f10);
        setMinimumWidth(a0.i(8.0f));
        setMinimumHeight(a0.i(8.0f));
    }

    public void k() {
        m2 m2Var = this.f18271a;
        if (m2Var != null) {
            m2Var.D();
        }
    }

    public final void l() {
        if (this.f18271a == null) {
            return;
        }
        if (getVisibility() != 0 || getAlpha() <= 0.0f) {
            this.f18271a.b(this);
        } else {
            this.f18271a.a(this);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setFactor(f10);
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        m2 m2Var = this.f18271a;
        if (m2Var != null) {
            m2Var.c(canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m2 m2Var = this.f18271a;
        if (m2Var != null) {
            m2Var.p(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        l();
    }

    public void setInverseView(View view) {
        this.M = view;
    }

    public void setProgressColor(int i10) {
        m2 m2Var = this.f18271a;
        if (m2Var != null) {
            m2Var.d(i10);
        }
    }

    @Override
    public void setTextColor(int i10) {
        m2 m2Var = this.f18271a;
        if (m2Var != null) {
            m2Var.d(i10);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        l();
    }
}
