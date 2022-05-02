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
    public TextView f30050M;
    public TextView f30051N;
    public boolean f30052O;
    public C3950k f30053P;
    public boolean f30054Q;
    public float f30055R;
    public float f30056S;

    public C9289s(Context context) {
        super(context);
        int i = 5;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, (C4403w.m27984G2() ? 5 : 3) | 48);
        t1.topMargin = C1357a0.m37541i(5.0f);
        C6847b2 b2Var = new C6847b2(context);
        this.f30050M = b2Var;
        b2Var.setTextColor(C11524j.m161p0());
        this.f30050M.setTextSize(1, 18.0f);
        this.f30050M.setTypeface(C1389o.m37260i());
        this.f30050M.setSingleLine(true);
        this.f30050M.setEllipsize(TextUtils.TruncateAt.END);
        this.f30050M.setGravity(C4403w.m27989F1());
        this.f30050M.setLayoutParams(t1);
        addView(this.f30050M);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, -2, (!C4403w.m27984G2() ? 3 : i) | 48);
        t12.topMargin = C1357a0.m37541i(28.0f);
        C6847b2 b2Var2 = new C6847b2(context);
        this.f30051N = b2Var2;
        b2Var2.setTextSize(1, 14.0f);
        this.f30051N.setTypeface(C1389o.m37258k());
        this.f30051N.setSingleLine(true);
        this.f30051N.setEllipsize(TextUtils.TruncateAt.END);
        this.f30051N.setGravity(C4403w.m27989F1());
        this.f30051N.setLayoutParams(t12);
        addView(this.f30051N);
        C11052v1.m1768b().m1769a(this);
    }

    public void m9633C1(float f) {
        if (f >= this.f30056S) {
            if (this.f30053P == null) {
                this.f30053P = new C3950k(0, this, C2057b.f7280b, 320L, 0.0f);
            }
            this.f30053P.m29544i(f);
        }
    }

    public void m9632D1(int i, boolean z) {
        int c3 = View$OnClickListenerC9170d1.m10066c3(false);
        int F1 = C4403w.m27989F1();
        int i2 = C4403w.m27984G2() ? i : C1357a0.m37541i(68.0f);
        if (C4403w.m27984G2()) {
            i = C1357a0.m37541i(68.0f);
        }
        setLayoutParams(FrameLayoutFix.m18006u1(-1, c3, F1, i2, 0, i, 0));
        if (z) {
            this.f30051N.setTextColor(C11524j.m221Q0(this.f30050M.getCurrentTextColor()));
        }
    }

    public void m9631E1(int i, int i2) {
        if (!this.f30052O) {
            this.f30050M.setTextColor(i);
            this.f30051N.setTextColor(i2);
        }
    }

    public void m9630F1(int i, int i2, AbstractC9323v4<?> v4Var) {
        this.f30050M.setTextColor(C11524j.m228N(i));
        this.f30051N.setTextColor(C11524j.m228N(i2));
        this.f30052O = true;
        if (v4Var != null) {
            v4Var.m9119z8(this.f30050M, i);
            v4Var.m9119z8(this.f30051N, i2);
        }
    }

    public void m9629G1(int i, AbstractC9323v4<?> v4Var) {
        setTextColor(C11524j.m228N(i));
        v4Var.m9119z8(this, i);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        boolean z = false;
        if (i != 0) {
            if (i == 1 && this.f30055R != f) {
                this.f30055R = f;
                if (this.f30056S == 0.0f || f == 1.0f) {
                    z = true;
                }
                setWillNotDraw(z);
                invalidate();
            }
        } else if (this.f30056S != f) {
            this.f30056S = f;
            if (f == 0.0f || this.f30055R == 1.0f) {
                z = true;
            }
            setWillNotDraw(z);
            invalidate();
            if (f == 1.0f && !this.f30054Q) {
                this.f30054Q = true;
                new C3950k(1, this, C2057b.f7280b, 280L).m29544i(1.0f);
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
        this.f30050M.invalidate();
        this.f30051N.invalidate();
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = C1357a0.m37541i(2.0f);
        float f = measuredWidth;
        int i2 = (int) (this.f30056S * f);
        int b = C5064d.m24130b((int) ((1.0f - this.f30055R) * 255.0f), C11524j.m161p0());
        if (i2 < measuredWidth) {
            canvas.drawRect(i2, measuredHeight - i, f, measuredHeight, C1410y.m37039g(C5064d.m24130b((int) ((1.0f - this.f30055R) * 16.0f), 0)));
        }
        canvas.drawRect(0.0f, measuredHeight - i, i2, measuredHeight, C1410y.m37039g(b));
    }

    @Override
    public void mo8255s() {
        int i = 5;
        if (C1399s0.m37189c0(this.f30050M, (C4403w.m27984G2() ? 5 : 3) | 48)) {
            this.f30050M.setGravity(C4403w.m27989F1());
            C1399s0.m37145y0(this.f30050M);
        }
        TextView textView = this.f30051N;
        if (!C4403w.m27984G2()) {
            i = 3;
        }
        if (C1399s0.m37189c0(textView, i | 48)) {
            this.f30051N.setGravity(C4403w.m27989F1());
            C1399s0.m37145y0(this.f30051N);
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
        this.f30051N.setText(C4403w.m27869i1(i));
    }

    @Override
    public void setTextColor(int i) {
        if (!this.f30052O) {
            this.f30050M.setTextColor(i);
            this.f30051N.setTextColor(C11524j.m221Q0(i));
        }
    }

    public void setThemedTextColor(AbstractC9323v4<?> v4Var) {
        m9629G1(v4Var.mo9360Q9(), v4Var);
    }

    public void setTitle(int i) {
        C1399s0.m37175j0(this.f30050M, C4403w.m27869i1(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f30051N.setText(C5078d.m23986z().m24024I(charSequence));
    }

    public void setTitle(CharSequence charSequence) {
        C1399s0.m37175j0(this.f30050M, C5078d.m23986z().m24024I(charSequence));
    }
}
