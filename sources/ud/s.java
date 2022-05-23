package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.o;
import ce.p0;
import ce.y;
import db.b;
import eb.k;
import gd.w;
import ib.d;
import kb.c;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import zd.s1;
import zd.t1;

public class s extends FrameLayoutFix implements c2, k.b, v2, c, t1.a {
    public TextView M;
    public TextView N;
    public boolean O;
    public k P;
    public boolean Q;
    public float R;
    public float S;

    public s(Context context) {
        super(context);
        int i10 = 5;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, -2, (w.G2() ? 5 : 3) | 48);
        r12.topMargin = a0.i(5.0f);
        b2 b2Var = new b2(context);
        this.M = b2Var;
        b2Var.setTextColor(j.n0());
        this.M.setTextSize(1, 18.0f);
        this.M.setTypeface(o.i());
        this.M.setSingleLine(true);
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(w.F1());
        this.M.setLayoutParams(r12);
        addView(this.M);
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-1, -2, (!w.G2() ? 3 : i10) | 48);
        r13.topMargin = a0.i(28.0f);
        b2 b2Var2 = new b2(context);
        this.N = b2Var2;
        b2Var2.setTextSize(1, 14.0f);
        this.N.setTypeface(o.k());
        this.N.setSingleLine(true);
        this.N.setEllipsize(TextUtils.TruncateAt.END);
        this.N.setGravity(w.F1());
        this.N.setLayoutParams(r13);
        addView(this.N);
        t1.b().a(this);
    }

    public void A1(int i10, boolean z10) {
        int a32 = d1.a3(false);
        int F1 = w.F1();
        int i11 = w.G2() ? i10 : a0.i(68.0f);
        if (w.G2()) {
            i10 = a0.i(68.0f);
        }
        setLayoutParams(FrameLayoutFix.s1(-1, a32, F1, i11, 0, i10, 0));
        if (z10) {
            this.N.setTextColor(j.N0(this.M.getCurrentTextColor()));
        }
    }

    public void B1(int i10, int i11) {
        if (!this.O) {
            this.M.setTextColor(i10);
            this.N.setTextColor(i11);
        }
    }

    public void C1(int i10, int i11, v4<?> v4Var) {
        this.M.setTextColor(j.L(i10));
        this.N.setTextColor(j.L(i11));
        this.O = true;
        if (v4Var != null) {
            v4Var.z8(this.M, i10);
            v4Var.z8(this.N, i11);
        }
    }

    public void D1(int i10, v4<?> v4Var) {
        setTextColor(j.L(i10));
        v4Var.z8(this, i10);
    }

    @Override
    public void Q2() {
        t1.b().d(this);
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void e2() {
        this.M.invalidate();
        this.N.invalidate();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 == 1 && this.R != f10) {
                this.R = f10;
                if (this.S == 0.0f || f10 == 1.0f) {
                    z10 = true;
                }
                setWillNotDraw(z10);
                invalidate();
            }
        } else if (this.S != f10) {
            this.S = f10;
            if (f10 == 0.0f || this.R == 1.0f) {
                z10 = true;
            }
            setWillNotDraw(z10);
            invalidate();
            if (f10 == 1.0f && !this.Q) {
                this.Q = true;
                new k(1, this, b.f7287b, 280L).i(1.0f);
            }
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i10 = a0.i(2.0f);
        float f10 = measuredWidth;
        int i11 = (int) (this.S * f10);
        int b10 = d.b((int) ((1.0f - this.R) * 255.0f), j.n0());
        if (i11 < measuredWidth) {
            canvas.drawRect(i11, measuredHeight - i10, f10, measuredHeight, y.g(d.b((int) ((1.0f - this.R) * 16.0f), 0)));
        }
        canvas.drawRect(0.0f, measuredHeight - i10, i11, measuredHeight, y.g(b10));
    }

    @Override
    public void s() {
        int i10 = 5;
        if (p0.V(this.M, (w.G2() ? 5 : 3) | 48)) {
            this.M.setGravity(w.F1());
            p0.r0(this.M);
        }
        TextView textView = this.N;
        if (!w.G2()) {
            i10 = 3;
        }
        if (p0.V(textView, i10 | 48)) {
            this.N.setGravity(w.F1());
            p0.r0(this.N);
        }
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    public void setSubtitle(int i10) {
        this.N.setText(w.i1(i10));
    }

    @Override
    public void setTextColor(int i10) {
        if (!this.O) {
            this.M.setTextColor(i10);
            this.N.setTextColor(j.N0(i10));
        }
    }

    public void setThemedTextColor(v4<?> v4Var) {
        D1(v4Var.Q9(), v4Var);
    }

    public void setTitle(int i10) {
        p0.c0(this.M, w.i1(i10));
    }

    public void z1(float f10) {
        if (f10 >= this.S) {
            if (this.P == null) {
                this.P = new k(0, this, b.f7287b, 320L, 0.0f);
            }
            this.P.i(f10);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        this.N.setText(id.d.z().I(charSequence));
    }

    public void setTitle(CharSequence charSequence) {
        p0.c0(this.M, id.d.z().I(charSequence));
    }
}
