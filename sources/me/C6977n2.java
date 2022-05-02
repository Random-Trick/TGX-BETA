package me;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import p037cb.C2057b;
import p051db.C3950k;
import p139jb.AbstractC5911c;
import td.AbstractC9321v2;

public class C6977n2 extends View implements C3950k.AbstractC3952b, AbstractC9321v2, AbstractC6828a, AbstractC5911c {
    public View f22096M;
    public RunnableC6969m2 f22097a;
    public float f22098b;
    public C3950k f22099c;

    public C6977n2(Context context) {
        super(context);
    }

    private void setFactor(float f) {
        if (this.f22098b != f) {
            this.f22098b = f;
            RunnableC6969m2 m2Var = this.f22097a;
            if (m2Var != null) {
                m2Var.m18275o(f);
            }
            View view = this.f22096M;
            if (view != null) {
                view.setAlpha(1.0f - f);
            }
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setFactor(f);
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void m18231a(float f) {
        if (this.f22099c == null) {
            this.f22099c = new C3950k(0, this, C2057b.f7280b, 180L, this.f22098b);
        }
        this.f22099c.m29544i(f);
    }

    @Override
    public void mo4501a3() {
        mo8229b();
    }

    @Override
    public void mo8229b() {
        RunnableC6969m2 m2Var = this.f22097a;
        if (m2Var != null) {
            m2Var.m18288b(this);
        }
    }

    public float m18230c() {
        C3950k kVar = this.f22099c;
        if (kVar != null) {
            kVar.m29542k();
        }
        return this.f22098b;
    }

    public void m18229d(float f) {
        C3950k kVar = this.f22099c;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setFactor(f);
    }

    public void m18228e(float f) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(8.0f));
        this.f22097a = m2Var;
        m2Var.m18293C(C1357a0.m37541i(2.5f));
        this.f22097a.m18265y();
        this.f22097a.m18275o(f);
        m18229d(f);
        setMinimumWidth(C1357a0.m37541i(20.0f));
        setMinimumHeight(C1357a0.m37541i(20.0f));
    }

    @Override
    public void mo8225f() {
        if (this.f22097a != null) {
            m18222l();
        }
    }

    public void m18227g(float f, float f2, float f3) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(f));
        this.f22097a = m2Var;
        m2Var.m18275o(f2);
        m18229d(f2);
        setMinimumWidth(C1357a0.m37541i(f3));
        setMinimumHeight(C1357a0.m37541i(f3));
    }

    public RunnableC6969m2 getProgress() {
        return this.f22097a;
    }

    public void m18226h(float f) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(18.0f));
        this.f22097a = m2Var;
        m2Var.m18293C(C1357a0.m37541i(4.0f));
        this.f22097a.m18265y();
        this.f22097a.m18275o(f);
        m18229d(f);
        m18222l();
        setMinimumWidth(C1357a0.m37541i(44.0f));
        setMinimumHeight(C1357a0.m37541i(44.0f));
    }

    public void m18225i(float f) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(6.0f));
        this.f22097a = m2Var;
        m2Var.m18275o(f);
        this.f22097a.m18294B();
        this.f22097a.m18265y();
        m18229d(f);
        setMinimumWidth(C1357a0.m37541i(16.0f));
        setMinimumHeight(C1357a0.m37541i(16.0f));
    }

    public void m18224j(float f) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(3.5f));
        this.f22097a = m2Var;
        m2Var.m18275o(f);
        m18229d(f);
        setMinimumWidth(C1357a0.m37541i(8.0f));
        setMinimumHeight(C1357a0.m37541i(8.0f));
    }

    public void m18223k() {
        RunnableC6969m2 m2Var = this.f22097a;
        if (m2Var != null) {
            m2Var.m18292D();
        }
    }

    public final void m18222l() {
        if (this.f22097a == null) {
            return;
        }
        if (getVisibility() != 0 || getAlpha() <= 0.0f) {
            this.f22097a.m18288b(this);
        } else {
            this.f22097a.m18289a(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        RunnableC6969m2 m2Var = this.f22097a;
        if (m2Var != null) {
            m2Var.m18287c(canvas);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RunnableC6969m2 m2Var = this.f22097a;
        if (m2Var != null) {
            m2Var.m18274p(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        m18222l();
    }

    public void setInverseView(View view) {
        this.f22096M = view;
    }

    public void setProgressColor(int i) {
        RunnableC6969m2 m2Var = this.f22097a;
        if (m2Var != null) {
            m2Var.m18286d(i);
        }
    }

    @Override
    public void setTextColor(int i) {
        RunnableC6969m2 m2Var = this.f22097a;
        if (m2Var != null) {
            m2Var.m18286d(i);
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        m18222l();
    }
}
