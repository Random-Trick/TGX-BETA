package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import be.C1357a0;
import be.C1389o;
import be.C1410y;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.EditTextBase;
import p037cb.C2057b;
import p051db.C3950k;
import p108hb.C5064d;
import p364zd.C11524j;

public class C7043v1 extends EditTextBase implements C3950k.AbstractC3952b {
    public int f22344M;
    public AbstractC7044a f22345N;
    public float f22346O;
    public boolean f22347P;
    public C3950k f22348Q;
    public float f22349R;
    public float f22350S;
    public boolean f22351T;
    public boolean f22352U;
    public View$OnFocusChangeListenerC7069y1 f22353c;

    public interface AbstractC7044a {
        boolean mo18028z3(C7043v1 v1Var);
    }

    public C7043v1(Context context) {
        super(context);
        setBackgroundResource(R.drawable.transparent);
        setPadding(C1357a0.m37544i(1.5f), 0, C1357a0.m37544i(1.5f), 0);
        setSingleLine(true);
        setTypeface(C1389o.m37261k());
        setHighlightColor(C11524j.m252B());
    }

    public void m18031A(float f) {
        boolean z = this.f22347P;
        if ((z && this.f22346O != 1.0f) || (!z && this.f22346O != 0.0f)) {
            setActiveFactor(f);
        }
    }

    public void m18030B(boolean z, boolean z2) {
        if (this.f22347P != z) {
            this.f22347P = z;
            if (z2) {
                m18029z(z ? 1.0f : 0.0f);
            }
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setActiveFactor(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (!this.f22352U) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i = C1357a0.m37544i(2.0f);
            float f = this.f22344M != 0 ? 1.0f : this.f22346O;
            int i2 = i - ((int) (C1357a0.m37544i(1.0f) * (1.0f - f)));
            int scrollX = getScrollX();
            RectF a0 = C1410y.m37053a0();
            a0.set(scrollX, measuredHeight - i2, measuredWidth + scrollX, measuredHeight);
            int i3 = this.f22344M;
            int N = i3 != 0 ? C11524j.m228N(i3) : C5064d.m24129d(C11524j.m228N(R.id.theme_color_inputInactive), C11524j.m228N(R.id.theme_color_inputActive), f);
            if (this.f22350S != 0.0f) {
                N = C5064d.m24129d(N, C11524j.m228N(R.id.theme_color_inputPositive), this.f22350S);
            }
            if (this.f22349R != 0.0f) {
                N = C5064d.m24129d(N, C11524j.m228N(R.id.theme_color_inputNegative), this.f22349R);
            }
            float f2 = i2 / 2;
            canvas.drawRoundRect(a0, f2, f2, C1410y.m37042g(N));
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC7044a aVar;
        return (i == 66 && (aVar = this.f22345N) != null && aVar.mo18028z3(this)) || super.onKeyDown(i, keyEvent);
    }

    public void setActiveFactor(float f) {
        if (this.f22346O != f) {
            this.f22346O = f;
            View$OnFocusChangeListenerC7069y1 y1Var = this.f22353c;
            if (y1Var != null) {
                y1Var.m17908a2(f);
            }
            invalidate();
        }
    }

    public void setEnterKeyListener(AbstractC7044a aVar) {
        this.f22345N = aVar;
    }

    public void setErrorFactor(float f) {
        if (this.f22349R != f) {
            this.f22349R = f;
            invalidate();
        }
    }

    public void setForceColorId(int i) {
        if (this.f22344M != i) {
            this.f22344M = i;
            invalidate();
        }
    }

    public void setGoodFactor(float f) {
        if (this.f22350S != f) {
            this.f22350S = f;
            invalidate();
        }
    }

    public void setIsPassword(boolean z) {
        if (this.f22351T != z) {
            this.f22351T = z;
            setTransformationMethod(z ? PasswordTransformationMethod.getInstance() : null);
        }
    }

    public void setLineDisabled(boolean z) {
        if (this.f22352U != z) {
            this.f22352U = z;
            invalidate();
        }
    }

    public void setParent(View$OnFocusChangeListenerC7069y1 y1Var) {
        this.f22353c = y1Var;
    }

    public final void m18029z(float f) {
        C3950k kVar = this.f22348Q;
        if (kVar == null) {
            this.f22348Q = new C3950k(0, this, C2057b.f7280b, 120L, this.f22346O);
        } else {
            kVar.m29543l(this.f22346O);
        }
        this.f22348Q.m29546i(f);
    }
}
