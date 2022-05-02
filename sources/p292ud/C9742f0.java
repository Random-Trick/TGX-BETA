package p292ud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import me.RunnableC6969m2;
import p037cb.C2057b;
import p051db.C3950k;
import p108hb.C5064d;

public class C9742f0 extends View implements C3950k.AbstractC3952b {
    public C3950k f31698M;
    public float f31699N;
    public float f31700O;
    public float f31701P;
    public float f31702Q;
    public float f31703R;
    public C9746h0 f31704a;
    public RunnableC6969m2 f31705b;
    public boolean f31706c;

    public C9742f0(Context context) {
        super(context);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        m7298d(f);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void m7301a() {
        if (this.f31705b == null) {
            RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(6.0f));
            this.f31705b = m2Var;
            m2Var.m18293C(C1357a0.m37544i(2.0f));
            this.f31705b.m18272r();
            this.f31705b.m18286d(-1);
            this.f31705b.m18275o(0.0f);
            this.f31705b.m18289a(this);
            this.f31705b.m18274p(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void m7300b(C9746h0 h0Var) {
        this.f31704a = h0Var;
    }

    public void m7299c(float f) {
        RunnableC6969m2 m2Var = this.f31705b;
        if (m2Var != null) {
            m2Var.m18268v(f, true);
        }
    }

    public final void m7298d(float f) {
        if (this.f31699N != f) {
            this.f31699N = f;
            this.f31705b.m18275o(f);
            invalidate();
        }
    }

    public void m7297e(boolean z) {
        if (this.f31706c != z) {
            this.f31706c = z;
            m7301a();
            boolean z2 = true;
            if (z) {
                this.f31705b.m18268v(0.0f, true);
            }
            float f = z ? 1.0f : 0.0f;
            if (getAlpha() == 0.0f || getParent() == null || ((View) getParent()).getAlpha() == 0.0f) {
                z2 = false;
            }
            if (z2) {
                if (this.f31698M == null) {
                    float f2 = this.f31699N;
                    if (f2 != f) {
                        this.f31698M = new C3950k(0, this, C2057b.f7280b, 180L, f2);
                    } else {
                        return;
                    }
                }
                this.f31698M.m29546i(f);
                return;
            }
            C3950k kVar = this.f31698M;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            m7298d(f);
        }
    }

    public void m7296f(float f) {
        if (this.f31702Q != f) {
            this.f31702Q = f;
            float f2 = this.f31701P;
            if (((int) (this.f31703R * f2)) != ((int) (f2 * f))) {
                invalidate();
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        C9746h0 h0Var = this.f31704a;
        float C0 = h0Var != null ? h0Var.m7292C0() : this.f31702Q;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (C0 != 0.0f) {
            RectF a0 = C1410y.m37053a0();
            float i2 = C1357a0.m37544i(1.5f);
            a0.set(i2, i2, measuredWidth - i, measuredHeight - i);
            canvas.drawArc(a0, -90.0f, (360.0f - this.f31700O) * C0, false, C1410y.m37076F0());
        }
        if (this.f31705b != null) {
            canvas.drawCircle(measuredWidth / 2, measuredHeight / 2, C1357a0.m37544i(12.0f), C1410y.m37042g(C5064d.m24132a(this.f31705b.m18285e(), 1140850688)));
            this.f31705b.m18287c(canvas);
        }
        this.f31703R = C0;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        double strokeWidth = C1410y.m37076F0().getStrokeWidth();
        double measuredWidth = (int) ((getMeasuredWidth() / 2) * 6.283185307179586d);
        this.f31701P = (float) (measuredWidth - strokeWidth);
        this.f31700O = ((float) (strokeWidth / measuredWidth)) * 360.0f;
        RunnableC6969m2 m2Var = this.f31705b;
        if (m2Var != null) {
            m2Var.m18274p(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
