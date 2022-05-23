package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import ce.a0;
import ce.o;
import ce.y;
import db.b;
import eb.k;
import ib.d;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.EditTextBase;

public class v1 extends EditTextBase implements k.b {
    public int M;
    public a N;
    public float O;
    public boolean P;
    public k Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public y1 f18400c;

    public interface a {
        boolean a1(v1 v1Var);
    }

    public v1(Context context) {
        super(context);
        setBackgroundResource(R.drawable.transparent);
        setPadding(a0.i(1.5f), 0, a0.i(1.5f), 0);
        setSingleLine(true);
        setTypeface(o.k());
        setHighlightColor(j.z());
    }

    public void A(float f10) {
        boolean z10 = this.P;
        if ((z10 && this.O != 1.0f) || (!z10 && this.O != 0.0f)) {
            setActiveFactor(f10);
        }
    }

    public void B(boolean z10, boolean z11) {
        if (this.P != z10) {
            this.P = z10;
            if (z11) {
                z(z10 ? 1.0f : 0.0f);
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setActiveFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (!this.U) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i10 = a0.i(2.0f);
            float f10 = this.M != 0 ? 1.0f : this.O;
            int i11 = i10 - ((int) (a0.i(1.0f) * (1.0f - f10)));
            int scrollX = getScrollX();
            RectF a02 = y.a0();
            a02.set(scrollX, measuredHeight - i11, measuredWidth + scrollX, measuredHeight);
            int i12 = this.M;
            int L = i12 != 0 ? j.L(i12) : d.d(j.L(R.id.theme_color_inputInactive), j.L(R.id.theme_color_inputActive), f10);
            if (this.S != 0.0f) {
                L = d.d(L, j.L(R.id.theme_color_inputPositive), this.S);
            }
            if (this.R != 0.0f) {
                L = d.d(L, j.L(R.id.theme_color_inputNegative), this.R);
            }
            float f11 = i11 / 2;
            canvas.drawRoundRect(a02, f11, f11, y.g(L));
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        a aVar;
        return (i10 == 66 && (aVar = this.N) != null && aVar.a1(this)) || super.onKeyDown(i10, keyEvent);
    }

    public void setActiveFactor(float f10) {
        if (this.O != f10) {
            this.O = f10;
            y1 y1Var = this.f18400c;
            if (y1Var != null) {
                y1Var.Z1(f10);
            }
            invalidate();
        }
    }

    public void setEnterKeyListener(a aVar) {
        this.N = aVar;
    }

    public void setErrorFactor(float f10) {
        if (this.R != f10) {
            this.R = f10;
            invalidate();
        }
    }

    public void setForceColorId(int i10) {
        if (this.M != i10) {
            this.M = i10;
            invalidate();
        }
    }

    public void setGoodFactor(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidate();
        }
    }

    public void setIsPassword(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            setTransformationMethod(z10 ? PasswordTransformationMethod.getInstance() : null);
        }
    }

    public void setLineDisabled(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            invalidate();
        }
    }

    public void setParent(y1 y1Var) {
        this.f18400c = y1Var;
    }

    public final void z(float f10) {
        k kVar = this.Q;
        if (kVar == null) {
            this.Q = new k(0, this, b.f7287b, 120L, this.O);
        } else {
            kVar.l(this.O);
        }
        this.Q.i(f10);
    }
}
