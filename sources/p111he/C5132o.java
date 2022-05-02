package p111he;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import be.C1357a0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5063c;
import p108hb.C5064d;
import p291uc.C9620n4;
import p364zd.AbstractC11531p;
import p364zd.C11514c0;
import p364zd.C11524j;

public class C5132o extends MetricAffectingSpan {
    public TdApi.TextEntityType f17200M;
    public int f17201N;
    public float f17202O;
    public int f17203P;
    public C9620n4 f17204Q;
    public int f17205R;
    public Object f17206S;
    public AbstractC5133a f17207T;
    public Typeface f17208a;
    public int f17209b;
    public AbstractC11531p f17210c;

    public interface AbstractC5133a {
        boolean mo490a(View view, C5132o oVar);
    }

    public C5132o(Typeface typeface, int i) {
        this.f17208a = typeface;
        this.f17209b = i;
    }

    public final void m23861a(TextPaint textPaint) {
        int i;
        C9620n4 n4Var;
        int i2 = 0;
        textPaint.setFakeBoldText((this.f17201N & 1) != 0);
        C5063c.m24144b(this.f17201N, 32);
        int i3 = this.f17205R;
        if (i3 != 0) {
            AbstractC11531p pVar = this.f17210c;
            int e = pVar != null ? pVar.mo92e(i3) : C11524j.m228N(i3);
            if ((this.f17201N & 4) != 0 && Color.alpha(e) < 255) {
                e = C5064d.m24129c(-16777216, e);
            }
            textPaint.bgColor = e;
        }
        if ((this.f17201N & 2) != 0) {
            textPaint.setUnderlineText(false);
        }
        if ((this.f17201N & 8) != 0) {
            textPaint.setUnderlineText(true);
        }
        if ((this.f17201N & 16) != 0) {
            textPaint.setStrikeThruText(true);
        }
        if (this.f17208a != null) {
            Typeface typeface = textPaint.getTypeface();
            if (typeface != null) {
                i2 = typeface.getStyle();
            }
            int i4 = (~this.f17208a.getStyle()) & i2;
            if ((i4 & 1) != 0) {
                textPaint.setFakeBoldText(true);
            }
            if ((i4 & 2) != 0) {
                textPaint.setTextSkewX(-0.25f);
            }
            textPaint.setTypeface(this.f17208a);
        }
        float f = this.f17202O;
        if (f != 0.0f) {
            textPaint.setTextSize(C1357a0.m37541i(f));
        }
        int i5 = this.f17209b;
        if (i5 != 0) {
            AbstractC11531p pVar2 = this.f17210c;
            if (pVar2 != null) {
                i = pVar2.mo92e(i5);
            } else {
                int i6 = this.f17203P;
                if (i6 == 0 || i6 == i5 || (n4Var = this.f17204Q) == null) {
                    i = C11524j.m228N(i5);
                } else {
                    float backgroundTransparency = n4Var.getBackgroundTransparency();
                    if (backgroundTransparency == 0.0f) {
                        i = C11524j.m228N(this.f17209b);
                    } else if (backgroundTransparency == 1.0f) {
                        i = C11524j.m228N(this.f17203P);
                    } else {
                        i = C5064d.m24128d(C11524j.m228N(this.f17209b), C11524j.m228N(this.f17203P), backgroundTransparency);
                    }
                }
            }
            textPaint.setColor(i);
        } else if (this.f17203P != 0 && this.f17204Q != null) {
            textPaint.setColor(C5064d.m24128d(textPaint.getColor(), C11524j.m228N(this.f17203P), this.f17204Q.getBackgroundTransparency()));
        }
    }

    public TdApi.TextEntityType m23860b() {
        return this.f17200M;
    }

    public AbstractC5133a m23859c() {
        return this.f17207T;
    }

    public Object m23858d() {
        return this.f17206S;
    }

    public boolean m23857e() {
        return this.f17207T != null;
    }

    public void m23856f(View view) {
        AbstractC5133a aVar = this.f17207T;
        if (aVar != null) {
            aVar.mo490a(view, this);
        }
    }

    public C5132o m23855g(int i) {
        return m23854h(i, false);
    }

    public C5132o m23854h(int i, boolean z) {
        this.f17205R = i;
        this.f17201N = C5063c.m24138h(this.f17201N, 4, z);
        return this;
    }

    public C5132o m23853i(int i) {
        this.f17209b = i;
        return this;
    }

    public C5132o m23852j(TdApi.TextEntityType textEntityType) {
        this.f17200M = textEntityType;
        boolean z = false;
        if (textEntityType != null) {
            m23846p(textEntityType.getConstructor() == 792317842);
            m23847o(textEntityType.getConstructor() == 961529082);
            if (textEntityType.getConstructor() == 544019899) {
                z = true;
            }
            m23848n(z);
        } else {
            m23846p(false);
            m23847o(false);
            m23848n(false);
        }
        return this;
    }

    public C5132o m23851k(boolean z) {
        this.f17201N = C5063c.m24138h(this.f17201N, 1, z);
        return this;
    }

    public C5132o m23850l(int i) {
        this.f17210c = i != 0 ? C11514c0.m345d(i, true) : null;
        return this;
    }

    public C5132o m23849m(AbstractC11531p pVar) {
        this.f17210c = pVar;
        return this;
    }

    public C5132o m23848n(boolean z) {
        this.f17201N = C5063c.m24138h(this.f17201N, 32, z);
        return this;
    }

    public C5132o m23847o(boolean z) {
        this.f17201N = C5063c.m24138h(this.f17201N, 16, z);
        return this;
    }

    public C5132o m23846p(boolean z) {
        this.f17201N = C5063c.m24138h(this.f17201N, 8, z);
        return this;
    }

    public C5132o m23845q(AbstractC5133a aVar) {
        this.f17207T = aVar;
        return this;
    }

    public C5132o m23844r(boolean z) {
        this.f17201N = C5063c.m24138h(this.f17201N, 2, z);
        return this;
    }

    public C5132o m23843s(Object obj) {
        this.f17206S = obj;
        return this;
    }

    public C5132o m23842t(float f) {
        this.f17202O = f;
        return this;
    }

    public C5132o m23841u(int i, C9620n4 n4Var) {
        this.f17203P = i;
        this.f17204Q = n4Var;
        return this;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        m23861a(textPaint);
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        m23861a(textPaint);
    }

    public C5132o m23840v(Typeface typeface) {
        this.f17208a = typeface;
        return this;
    }
}
