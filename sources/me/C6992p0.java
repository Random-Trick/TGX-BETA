package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import gd.C4587b;
import gd.C4817v6;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p110hd.C5078d;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;
import td.AbstractC9165c2;
import td.AbstractC9323v4;

public class C6992p0 extends RelativeLayout implements AbstractC9165c2, AbstractC5911c, C11052v1.AbstractC11053a {
    public final RunnableC6507m f22170M;
    public C6853c2 f22171N;
    public boolean f22172O;
    public int f22173P;
    public boolean f22174Q;
    public C4817v6 f22175R;
    public Path f22176S;
    public boolean f22177T;
    public C4587b f22178U;
    public TextView f22179a;
    public TextView f22180b;
    public final C6257p f22181c;

    public C6992p0(Context context) {
        super(context);
        int i = C1357a0.m37544i(72.0f);
        setPadding(0, Math.max(1, C1357a0.m37544i(0.5f)), 0, 0);
        setLayoutParams(new RecyclerView.LayoutParams(-1, i));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C1357a0.m37544i(15.0f);
        if (C4403w.m27986G2()) {
            layoutParams.rightMargin = C1357a0.m37544i(72.0f);
            layoutParams.leftMargin = C1357a0.m37544i(16.0f);
            layoutParams.addRule(1, R.id.btn_double);
        } else {
            layoutParams.leftMargin = C1357a0.m37544i(72.0f);
            layoutParams.rightMargin = C1357a0.m37544i(16.0f);
            layoutParams.addRule(0, R.id.btn_double);
        }
        C6847b2 b2Var = new C6847b2(context);
        this.f22179a = b2Var;
        b2Var.setId(R.id.text_title);
        this.f22179a.setTextSize(1, 16.0f);
        this.f22179a.setTypeface(C1389o.m37263i());
        this.f22179a.setTextColor(C11524j.m217S0());
        this.f22179a.setEllipsize(TextUtils.TruncateAt.END);
        this.f22179a.setSingleLine(true);
        this.f22179a.setLayoutParams(layoutParams);
        this.f22179a.setGravity(C4403w.m27991F1());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C1357a0.m37544i(38.0f);
        if (C4403w.m27986G2()) {
            layoutParams2.rightMargin = C1357a0.m37544i(72.0f);
            layoutParams2.leftMargin = C1357a0.m37544i(16.0f);
            layoutParams2.addRule(1, R.id.btn_double);
        } else {
            layoutParams2.leftMargin = C1357a0.m37544i(72.0f);
            layoutParams2.rightMargin = C1357a0.m37544i(16.0f);
            layoutParams2.addRule(0, R.id.btn_double);
        }
        C6847b2 b2Var2 = new C6847b2(context);
        this.f22180b = b2Var2;
        b2Var2.setTextSize(1, 13.0f);
        this.f22180b.setTextColor(C11524j.m213U0());
        this.f22180b.setTypeface(C1389o.m37261k());
        this.f22180b.setEllipsize(TextUtils.TruncateAt.END);
        this.f22180b.setSingleLine(true);
        this.f22180b.setGravity(C4403w.m27991F1());
        this.f22180b.setLayoutParams(layoutParams2);
        C11052v1.m1768b().m1769a(this);
        int i2 = i - (C1357a0.m37544i(12.0f) * 2);
        int i3 = (i / 2) - (i2 / 2);
        this.f22173P = i3;
        C6257p pVar = new C6257p(this, 0);
        this.f22181c = pVar;
        int i4 = i2 + i3;
        pVar.mo20257K0(i3, i3, i4, i4);
        RunnableC6507m mVar = new RunnableC6507m(this);
        this.f22170M = mVar;
        mVar.mo20257K0(i3, i3, i4, i4);
        addView(this.f22179a);
        addView(this.f22180b);
        setWillNotDraw(false);
    }

    public static void m18139j(View view, int i, int i2, int i3) {
        int i4 = C4403w.m27986G2() ? i2 : i;
        if (!C4403w.m27986G2()) {
            i = i2;
        }
        if (C1399s0.m37182h0(view, i4, i3, i, 0)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            C1399s0.m37206R(layoutParams, !C4403w.m27986G2() ? 1 : 0);
            layoutParams.addRule(C4403w.m27986G2() ? 1 : 0, R.id.btn_double);
            C1399s0.m37148y0(view);
        }
    }

    public void m18148a(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.m9126y8(this.f22179a);
            v4Var.m9480A8(this.f22180b);
            v4Var.m9163t8(this);
            v4Var.m9163t8(this.f22171N);
        }
    }

    @Override
    public void mo4501a3() {
        this.f22181c.mo20250Z();
        this.f22170M.mo20250Z();
        C11052v1.m1768b().m1766d(this);
    }

    public void m18147b() {
        this.f22181c.mo20246f();
        this.f22170M.mo20246f();
    }

    public final void m18146c() {
        if (this.f22171N == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1357a0.m37544i(28.0f));
            layoutParams.addRule(C4403w.m27986G2() ? 9 : 11);
            layoutParams.addRule(15);
            int i = C1357a0.m37544i(19.0f);
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
            C6853c2 c2Var = new C6853c2(getContext());
            this.f22171N = c2Var;
            c2Var.setId(R.id.btn_double);
            this.f22171N.setLayoutParams(layoutParams);
            addView(this.f22171N);
        }
    }

    public void m18145d() {
        this.f22181c.mo20248b();
        this.f22170M.mo20248b();
    }

    public void m18144e(boolean z) {
        this.f22172O = z;
        mo8255s();
        invalidate();
    }

    public void m18143f(C6246h hVar, C4587b.C4588a aVar) {
        this.f22181c.m20820G(hVar);
        this.f22170M.clear();
        setAvatarPlaceholder(aVar);
    }

    public void m18142g(int i, View.OnClickListener onClickListener) {
        m18146c();
        this.f22171N.setText(i);
        this.f22171N.setOnClickListener(onClickListener);
    }

    @Override
    public void mo452g2() {
        this.f22179a.invalidate();
        this.f22180b.invalidate();
        invalidate();
    }

    public C6853c2 getButton() {
        return this.f22171N;
    }

    public void m18141h(int i, View.OnClickListener onClickListener) {
        m18146c();
        this.f22171N.setIcon(i);
        this.f22171N.setOnClickListener(onClickListener);
        this.f22171N.setPadding(C1357a0.m37544i(6.0f), 0, C1357a0.m37544i(6.0f), 0);
    }

    public void m18140i(CharSequence charSequence, CharSequence charSequence2) {
        this.f22179a.setText(C5078d.m23987z().m24025I(charSequence));
        this.f22180b.setText(C5078d.m23987z().m24025I(charSequence2));
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        C4587b bVar = this.f22178U;
        if (bVar != null) {
            bVar.m27217a(canvas, this.f22181c.mo20258I0(), this.f22181c.mo20228y0());
        } else {
            C4817v6 v6Var = this.f22175R;
            if (v6Var == null || !v6Var.m25173m()) {
                if (this.f22181c.mo20247c0()) {
                    Path path = this.f22176S;
                    if (path != null) {
                        this.f22181c.mo20255O(canvas, path);
                    } else if (this.f22177T) {
                        C6257p pVar = this.f22181c;
                        pVar.mo20229u0(canvas, pVar.getWidth() / 2);
                    }
                }
                this.f22181c.draw(canvas);
            } else {
                if (this.f22170M.mo20247c0()) {
                    this.f22170M.mo20255O(canvas, this.f22176S);
                }
                this.f22170M.draw(canvas);
            }
        }
        C4817v6 v6Var2 = this.f22175R;
        if (v6Var2 != null && v6Var2.m25165u()) {
            int max = Math.max(1, C1357a0.m37544i(0.5f));
            int i = C1357a0.m37544i(72.0f);
            if (C4403w.m27986G2()) {
                int measuredWidth = getMeasuredWidth();
                float f = measuredWidth - i;
                float f2 = max;
                canvas.drawRect(f, 0.0f, measuredWidth, f2, C1410y.m37042g(C11524j.m148w()));
                canvas.drawRect(0.0f, 0.0f, f, f2, C1410y.m37042g(C11524j.m223P0()));
                return;
            }
            float f3 = i;
            float f4 = max;
            canvas.drawRect(0.0f, 0.0f, f3, f4, C1410y.m37042g(C11524j.m148w()));
            canvas.drawRect(f3, 0.0f, getMeasuredWidth(), f4, C1410y.m37042g(C11524j.m223P0()));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = C1357a0.m37544i(72.0f);
        int i4 = i3 - (C1357a0.m37544i(12.0f) * 2);
        int i5 = (i3 / 2) - (i4 / 2);
        this.f22173P = i5;
        int i6 = this.f22172O ? i5 / 2 : i5;
        if (C4403w.m27986G2()) {
            int measuredWidth = (getMeasuredWidth() - i6) - i4;
            int i7 = measuredWidth + i4;
            int i8 = i4 + i5;
            this.f22181c.mo20257K0(measuredWidth, i5, i7, i8);
            this.f22170M.mo20257K0(measuredWidth, i5, i7, i8);
            return;
        }
        int i9 = i6 + i4;
        int i10 = i4 + i5;
        this.f22181c.mo20257K0(i6, i5, i9, i10);
        this.f22170M.mo20257K0(i6, i5, i9, i10);
    }

    @Override
    public void mo8255s() {
        if (this.f22179a.getGravity() != C4403w.m27991F1()) {
            this.f22179a.setGravity(C4403w.m27991F1());
        }
        if (this.f22180b.getGravity() != C4403w.m27991F1()) {
            this.f22180b.setGravity(C4403w.m27991F1());
        }
        int i = C1357a0.m37544i(72.0f) - (this.f22172O ? this.f22173P / 2 : 0);
        int i2 = C1357a0.m37544i(16.0f);
        m18139j(this.f22179a, i, i2, C1357a0.m37544i(15.0f));
        m18139j(this.f22180b, i, i2, C1357a0.m37544i(38.0f));
    }

    public void setAvatarPlaceholder(C4587b.C4588a aVar) {
        C4587b bVar = null;
        if (aVar != null) {
            bVar = new C4587b(C1357a0.m37532u(this.f22181c.getWidth() / 2.0f), aVar, null);
        }
        this.f22178U = bVar;
    }

    public void setIsRounded(boolean z) {
        if (this.f22174Q != z) {
            this.f22174Q = z;
            C6257p pVar = this.f22181c;
            pVar.mo20260D0(z ? pVar.getWidth() / 2 : 0);
        }
    }

    public void setStickerSet(C4817v6 v6Var) {
        this.f22177T = false;
        this.f22179a.setText(C5078d.m23987z().m24025I(v6Var.m25174l()));
        this.f22180b.setText(C4403w.m27846o2(v6Var.m25170p() ? R.string.xMasks : R.string.xStickers, v6Var.m25176j()));
        this.f22181c.m20820G(v6Var.m25177i());
        this.f22170M.m20232r(v6Var.m25179g());
        this.f22176S = v6Var.m25178h(C1357a0.m37544i(72.0f) - (C1357a0.m37544i(12.0f) * 2));
        this.f22175R = v6Var;
    }

    public void setTitleColorId(int i) {
        this.f22179a.setTextColor(C11524j.m228N(i));
    }
}
