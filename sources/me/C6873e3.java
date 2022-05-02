package me;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p335xd.C10189d;
import p364zd.C11524j;
import td.AbstractC9165c2;
import td.AbstractC9323v4;

public class C6873e3 extends RelativeLayout implements AbstractC9165c2 {
    public final TextView f21616a;
    public final TextView f21617b;
    public int f21618c = R.id.theme_color_text;
    public int f21615M = R.id.theme_color_textLight;

    public C6873e3(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(C1357a0.m37544i(76.0f));
        setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(18.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(18.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(C4403w.m27873i());
        C6847b2 b2Var = new C6847b2(context);
        this.f21616a = b2Var;
        b2Var.setId(R.id.text_stupid);
        b2Var.setTextColor(C11524j.m228N(R.id.theme_color_text));
        b2Var.setTextSize(1, 16.0f);
        b2Var.setTypeface(C1389o.m37261k());
        b2Var.setLayoutParams(layoutParams);
        addView(b2Var);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, R.id.text_stupid);
        layoutParams2.addRule(C4403w.m27873i());
        layoutParams2.topMargin = C1357a0.m37544i(2.0f);
        C6847b2 b2Var2 = new C6847b2(context);
        this.f21617b = b2Var2;
        b2Var2.setTextColor(C11524j.m228N(R.id.theme_color_textLight));
        b2Var2.setTextSize(1, 13.0f);
        b2Var2.setTypeface(C1389o.m37261k());
        b2Var2.setLayoutParams(layoutParams2);
        addView(b2Var2);
        C1399s0.m37196a0(this);
        C10189d.m5797g(this);
    }

    public void m18710a(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.m9119z8(this.f21616a, this.f21618c);
            v4Var.m9119z8(this.f21617b, this.f21615M);
            v4Var.m9163t8(this);
        }
    }

    public void m18709b() {
        TextView textView = this.f21616a;
        this.f21618c = R.id.theme_color_textNegative;
        textView.setTextColor(C11524j.m228N(R.id.theme_color_textNegative));
    }

    @Override
    public void mo8255s() {
        if (C1399s0.m37199Y(this.f21616a, C4403w.m27986G2())) {
            C1399s0.m37148y0(this.f21616a);
        }
        if (C1399s0.m37199Y(this.f21617b, C4403w.m27986G2())) {
            C1399s0.m37148y0(this.f21617b);
        }
    }

    public void setSubtitle(int i) {
        this.f21617b.setText(C4403w.m27871i1(i));
    }

    public void setTitle(int i) {
        this.f21616a.setText(C4403w.m27871i1(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f21617b.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f21616a.setText(charSequence);
    }
}
