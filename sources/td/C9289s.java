package td;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import me.C6847b2;
import me.vkryl.android.widget.FrameLayoutFix;
import p037cb.C2057b;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p110hd.C5078d;
import p139jb.AbstractC5911c;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;

public class C9289s extends FrameLayoutFix implements AbstractC9165c2, C3950k.AbstractC3952b, AbstractC9321v2, AbstractC5911c, C11052v1.AbstractC11053a {
    public TextView f30053M;
    public TextView f30054N;
    public boolean f30055O;
    public C3950k f30056P;
    public boolean f30057Q;
    public float f30058R;
    public float f30059S;

    public C9289s(Context context) {
        super(context);
        int i = 5;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, (C4403w.m27986G2() ? 5 : 3) | 48);
        t1.topMargin = C1357a0.m37544i(5.0f);
        C6847b2 b2Var = new C6847b2(context);
        this.f30053M = b2Var;
        b2Var.setTextColor(C11524j.m161p0());
        this.f30053M.setTextSize(1, 18.0f);
        this.f30053M.setTypeface(C1389o.m37263i());
        this.f30053M.setSingleLine(true);
        this.f30053M.setEllipsize(TextUtils.TruncateAt.END);
        this.f30053M.setGravity(C4403w.m27991F1());
        this.f30053M.setLayoutParams(t1);
        addView(this.f30053M);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, -2, (!C4403w.m27986G2() ? 3 : i) | 48);
        t12.topMargin = C1357a0.m37544i(28.0f);
        C6847b2 b2Var2 = new C6847b2(context);
        this.f30054N = b2Var2;
        b2Var2.setTextSize(1, 14.0f);
        this.f30054N.setTypeface(C1389o.m37261k());
        this.f30054N.setSingleLine(true);
        this.f30054N.setEllipsize(TextUtils.TruncateAt.END);
        this.f30054N.setGravity(C4403w.m27991F1());
        this.f30054N.setLayoutParams(t12);
        addView(this.f30054N);
        C11052v1.m1768b().m1769a(this);
    }

    public void m9632C1(float f) {
        if (f >= this.f30059S) {
            if (this.f30056P == null) {
                this.f30056P = new C3950k(0, this, C2057b.f7280b, 320L, 0.0f);
            }
            this.f30056P.m29546i(f);
        }
    }

    public void m9631D1(int i, boolean z) {
        int c3 = View$OnClickListenerC9170d1.m10065c3(false);
        int F1 = C4403w.m27991F1();
        int i2 = C4403w.m27986G2() ? i : C1357a0.m37544i(68.0f);
        if (C4403w.m27986G2()) {
            i = C1357a0.m37544i(68.0f);
        }
        setLayoutParams(FrameLayoutFix.m18006u1(-1, c3, F1, i2, 0, i, 0));
        if (z) {
            this.f30054N.setTextColor(C11524j.m221Q0(this.f30053M.getCurrentTextColor()));
        }
    }

    public void m9630E1(int i, int i2) {
        if (!this.f30055O) {
            this.f30053M.setTextColor(i);
            this.f30054N.setTextColor(i2);
        }
    }

    public void m9629F1(int i, int i2, AbstractC9323v4<?> v4Var) {
        this.f30053M.setTextColor(C11524j.m228N(i));
        this.f30054N.setTextColor(C11524j.m228N(i2));
        this.f30055O = true;
        if (v4Var != null) {
            v4Var.m9119z8(this.f30053M, i);
            v4Var.m9119z8(this.f30054N, i2);
        }
    }

    public void m9628G1(int i, AbstractC9323v4<?> v4Var) {
        setTextColor(C11524j.m228N(i));
        v4Var.m9119z8(this, i);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        boolean z = false;
        if (i != 0) {
            if (i == 1 && this.f30058R != f) {
                this.f30058R = f;
                if (this.f30059S == 0.0f || f == 1.0f) {
                    z = true;
                }
                setWillNotDraw(z);
                invalidate();
            }
        } else if (this.f30059S != f) {
            this.f30059S = f;
            if (f == 0.0f || this.f30058R == 1.0f) {
                z = true;
            }
            setWillNotDraw(z);
            invalidate();
            if (f == 1.0f && !this.f30057Q) {
                this.f30057Q = true;
                new C3950k(1, this, C2057b.f7280b, 280L).m29546i(1.0f);
            }
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        C11052v1.m1768b().m1766d(this);
    }

    @Override
    public void mo452g2() {
        this.f30053M.invalidate();
        this.f30054N.invalidate();
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = C1357a0.m37544i(2.0f);
        float f = measuredWidth;
        int i2 = (int) (this.f30059S * f);
        int b = C5064d.m24131b((int) ((1.0f - this.f30058R) * 255.0f), C11524j.m161p0());
        if (i2 < measuredWidth) {
            canvas.drawRect(i2, measuredHeight - i, f, measuredHeight, C1410y.m37042g(C5064d.m24131b((int) ((1.0f - this.f30058R) * 16.0f), 0)));
        }
        canvas.drawRect(0.0f, measuredHeight - i, i2, measuredHeight, C1410y.m37042g(b));
    }

    @Override
    public void mo8255s() {
        int i = 5;
        if (C1399s0.m37192c0(this.f30053M, (C4403w.m27986G2() ? 5 : 3) | 48)) {
            this.f30053M.setGravity(C4403w.m27991F1());
            C1399s0.m37148y0(this.f30053M);
        }
        TextView textView = this.f30054N;
        if (!C4403w.m27986G2()) {
            i = 3;
        }
        if (C1399s0.m37192c0(textView, i | 48)) {
            this.f30054N.setGravity(C4403w.m27991F1());
            C1399s0.m37148y0(this.f30054N);
        }
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setSubtitle(int i) {
        this.f30054N.setText(C4403w.m27871i1(i));
    }

    @Override
    public void setTextColor(int i) {
        if (!this.f30055O) {
            this.f30053M.setTextColor(i);
            this.f30054N.setTextColor(C11524j.m221Q0(i));
        }
    }

    public void setThemedTextColor(AbstractC9323v4<?> v4Var) {
        m9628G1(v4Var.mo9360Q9(), v4Var);
    }

    public void setTitle(int i) {
        C1399s0.m37178j0(this.f30053M, C4403w.m27871i1(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f30054N.setText(C5078d.m23987z().m24025I(charSequence));
    }

    public void setTitle(CharSequence charSequence) {
        C1399s0.m37178j0(this.f30053M, C5078d.m23987z().m24025I(charSequence));
    }
}
