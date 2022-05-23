package ie;

import ae.c0;
import ae.j;
import ae.p;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import ce.a0;
import ib.c;
import ib.d;
import org.drinkless.td.libcore.telegram.TdApi;
import vc.m4;

public class o extends MetricAffectingSpan {
    public TdApi.TextEntityType M;
    public int N;
    public float O;
    public int P;
    public m4 Q;
    public int R;
    public Object S;
    public a T;
    public Typeface f14270a;
    public int f14271b;
    public p f14272c;

    public interface a {
        boolean a(View view, o oVar);
    }

    public o(Typeface typeface, int i10) {
        this.f14270a = typeface;
        this.f14271b = i10;
    }

    public final void a(TextPaint textPaint) {
        int i10;
        m4 m4Var;
        int i11 = 0;
        textPaint.setFakeBoldText((this.N & 1) != 0);
        c.b(this.N, 32);
        int i12 = this.R;
        if (i12 != 0) {
            p pVar = this.f14272c;
            int e10 = pVar != null ? pVar.e(i12) : j.L(i12);
            if ((this.N & 4) != 0 && Color.alpha(e10) < 255) {
                e10 = d.c(-16777216, e10);
            }
            textPaint.bgColor = e10;
        }
        if ((this.N & 2) != 0) {
            textPaint.setUnderlineText(false);
        }
        if ((this.N & 8) != 0) {
            textPaint.setUnderlineText(true);
        }
        if ((this.N & 16) != 0) {
            textPaint.setStrikeThruText(true);
        }
        if (this.f14270a != null) {
            Typeface typeface = textPaint.getTypeface();
            if (typeface != null) {
                i11 = typeface.getStyle();
            }
            int i13 = (~this.f14270a.getStyle()) & i11;
            if ((i13 & 1) != 0) {
                textPaint.setFakeBoldText(true);
            }
            if ((i13 & 2) != 0) {
                textPaint.setTextSkewX(-0.25f);
            }
            textPaint.setTypeface(this.f14270a);
        }
        float f10 = this.O;
        if (f10 != 0.0f) {
            textPaint.setTextSize(a0.i(f10));
        }
        int i14 = this.f14271b;
        if (i14 != 0) {
            p pVar2 = this.f14272c;
            if (pVar2 != null) {
                i10 = pVar2.e(i14);
            } else {
                int i15 = this.P;
                if (i15 == 0 || i15 == i14 || (m4Var = this.Q) == null) {
                    i10 = j.L(i14);
                } else {
                    float backgroundTransparency = m4Var.getBackgroundTransparency();
                    if (backgroundTransparency == 0.0f) {
                        i10 = j.L(this.f14271b);
                    } else if (backgroundTransparency == 1.0f) {
                        i10 = j.L(this.P);
                    } else {
                        i10 = d.d(j.L(this.f14271b), j.L(this.P), backgroundTransparency);
                    }
                }
            }
            textPaint.setColor(i10);
        } else if (this.P != 0 && this.Q != null) {
            textPaint.setColor(d.d(textPaint.getColor(), j.L(this.P), this.Q.getBackgroundTransparency()));
        }
    }

    public TdApi.TextEntityType b() {
        return this.M;
    }

    public a c() {
        return this.T;
    }

    public Object d() {
        return this.S;
    }

    public boolean e() {
        return this.T != null;
    }

    public void f(View view) {
        a aVar = this.T;
        if (aVar != null) {
            aVar.a(view, this);
        }
    }

    public o g(int i10) {
        return h(i10, false);
    }

    public o h(int i10, boolean z10) {
        this.R = i10;
        this.N = c.h(this.N, 4, z10);
        return this;
    }

    public o i(int i10) {
        this.f14271b = i10;
        return this;
    }

    public o j(TdApi.TextEntityType textEntityType) {
        this.M = textEntityType;
        boolean z10 = false;
        if (textEntityType != null) {
            p(textEntityType.getConstructor() == 792317842);
            o(textEntityType.getConstructor() == 961529082);
            if (textEntityType.getConstructor() == 544019899) {
                z10 = true;
            }
            n(z10);
        } else {
            p(false);
            o(false);
            n(false);
        }
        return this;
    }

    public o k(boolean z10) {
        this.N = c.h(this.N, 1, z10);
        return this;
    }

    public o l(int i10) {
        this.f14272c = i10 != 0 ? c0.d(i10, true) : null;
        return this;
    }

    public o m(p pVar) {
        this.f14272c = pVar;
        return this;
    }

    public o n(boolean z10) {
        this.N = c.h(this.N, 32, z10);
        return this;
    }

    public o o(boolean z10) {
        this.N = c.h(this.N, 16, z10);
        return this;
    }

    public o p(boolean z10) {
        this.N = c.h(this.N, 8, z10);
        return this;
    }

    public o q(a aVar) {
        this.T = aVar;
        return this;
    }

    public o r(boolean z10) {
        this.N = c.h(this.N, 2, z10);
        return this;
    }

    public o s(Object obj) {
        this.S = obj;
        return this;
    }

    public o t(float f10) {
        this.O = f10;
        return this;
    }

    public o u(int i10, m4 m4Var) {
        this.P = i10;
        this.Q = m4Var;
        return this;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }

    public o v(Typeface typeface) {
        this.f14270a = typeface;
        return this;
    }
}
