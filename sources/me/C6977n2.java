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
    public View f22099M;
    public RunnableC6969m2 f22100a;
    public float f22101b;
    public C3950k f22102c;

    public C6977n2(Context context) {
        super(context);
    }

    private void setFactor(float f) {
        if (this.f22101b != f) {
            this.f22101b = f;
            RunnableC6969m2 m2Var = this.f22100a;
            if (m2Var != null) {
                m2Var.m18275o(f);
            }
            View view = this.f22099M;
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
        if (this.f22102c == null) {
            this.f22102c = new C3950k(0, this, C2057b.f7280b, 180L, this.f22101b);
        }
        this.f22102c.m29546i(f);
    }

    @Override
    public void mo4501a3() {
        mo8229b();
    }

    @Override
    public void mo8229b() {
        RunnableC6969m2 m2Var = this.f22100a;
        if (m2Var != null) {
            m2Var.m18288b(this);
        }
    }

    public float m18230c() {
        C3950k kVar = this.f22102c;
        if (kVar != null) {
            kVar.m29544k();
        }
        return this.f22101b;
    }

    public void m18229d(float f) {
        C3950k kVar = this.f22102c;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setFactor(f);
    }

    public void m18228e(float f) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(8.0f));
        this.f22100a = m2Var;
        m2Var.m18293C(C1357a0.m37544i(2.5f));
        this.f22100a.m18265y();
        this.f22100a.m18275o(f);
        m18229d(f);
        setMinimumWidth(C1357a0.m37544i(20.0f));
        setMinimumHeight(C1357a0.m37544i(20.0f));
    }

    @Override
    public void mo8225f() {
        if (this.f22100a != null) {
            m18222l();
        }
    }

    public void m18227g(float f, float f2, float f3) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(f));
        this.f22100a = m2Var;
        m2Var.m18275o(f2);
        m18229d(f2);
        setMinimumWidth(C1357a0.m37544i(f3));
        setMinimumHeight(C1357a0.m37544i(f3));
    }

    public RunnableC6969m2 getProgress() {
        return this.f22100a;
    }

    public void m18226h(float f) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(18.0f));
        this.f22100a = m2Var;
        m2Var.m18293C(C1357a0.m37544i(4.0f));
        this.f22100a.m18265y();
        this.f22100a.m18275o(f);
        m18229d(f);
        m18222l();
        setMinimumWidth(C1357a0.m37544i(44.0f));
        setMinimumHeight(C1357a0.m37544i(44.0f));
    }

    public void m18225i(float f) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(6.0f));
        this.f22100a = m2Var;
        m2Var.m18275o(f);
        this.f22100a.m18294B();
        this.f22100a.m18265y();
        m18229d(f);
        setMinimumWidth(C1357a0.m37544i(16.0f));
        setMinimumHeight(C1357a0.m37544i(16.0f));
    }

    public void m18224j(float f) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(3.5f));
        this.f22100a = m2Var;
        m2Var.m18275o(f);
        m18229d(f);
        setMinimumWidth(C1357a0.m37544i(8.0f));
        setMinimumHeight(C1357a0.m37544i(8.0f));
    }

    public void m18223k() {
        RunnableC6969m2 m2Var = this.f22100a;
        if (m2Var != null) {
            m2Var.m18292D();
        }
    }

    public final void m18222l() {
        if (this.f22100a == null) {
            return;
        }
        if (getVisibility() != 0 || getAlpha() <= 0.0f) {
            this.f22100a.m18288b(this);
        } else {
            this.f22100a.m18289a(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        RunnableC6969m2 m2Var = this.f22100a;
        if (m2Var != null) {
            m2Var.m18287c(canvas);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RunnableC6969m2 m2Var = this.f22100a;
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
        this.f22099M = view;
    }

    public void setProgressColor(int i) {
        RunnableC6969m2 m2Var = this.f22100a;
        if (m2Var != null) {
            m2Var.m18286d(i);
        }
    }

    @Override
    public void setTextColor(int i) {
        RunnableC6969m2 m2Var = this.f22100a;
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
