package ne;

import ae.j;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ce.a0;
import ce.o;
import ce.p0;
import gd.w;
import org.thunderdog.challegram.R;
import ud.c2;
import ud.v4;
import yd.d;

public class e3 extends RelativeLayout implements c2 {
    public final TextView f17975a;
    public final TextView f17976b;
    public int f17977c = R.id.theme_color_text;
    public int M = R.id.theme_color_textLight;

    public e3(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(a0.i(76.0f));
        setPadding(a0.i(16.0f), a0.i(18.0f), a0.i(16.0f), a0.i(18.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(w.i());
        b2 b2Var = new b2(context);
        this.f17975a = b2Var;
        b2Var.setId(R.id.text_stupid);
        b2Var.setTextColor(j.L(R.id.theme_color_text));
        b2Var.setTextSize(1, 16.0f);
        b2Var.setTypeface(o.k());
        b2Var.setLayoutParams(layoutParams);
        addView(b2Var);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, R.id.text_stupid);
        layoutParams2.addRule(w.i());
        layoutParams2.topMargin = a0.i(2.0f);
        b2 b2Var2 = new b2(context);
        this.f17976b = b2Var2;
        b2Var2.setTextColor(j.L(R.id.theme_color_textLight));
        b2Var2.setTextSize(1, 13.0f);
        b2Var2.setTypeface(o.k());
        b2Var2.setLayoutParams(layoutParams2);
        addView(b2Var2);
        p0.T(this);
        d.g(this);
    }

    public void a(v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.z8(this.f17975a, this.f17977c);
            v4Var.z8(this.f17976b, this.M);
            v4Var.t8(this);
        }
    }

    public void b() {
        TextView textView = this.f17975a;
        this.f17977c = R.id.theme_color_textNegative;
        textView.setTextColor(j.L(R.id.theme_color_textNegative));
    }

    @Override
    public void s() {
        if (p0.R(this.f17975a, w.G2())) {
            p0.r0(this.f17975a);
        }
        if (p0.R(this.f17976b, w.G2())) {
            p0.r0(this.f17976b);
        }
    }

    public void setSubtitle(int i10) {
        this.f17976b.setText(w.i1(i10));
    }

    public void setTitle(int i10) {
        this.f17975a.setText(w.i1(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f17976b.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17975a.setText(charSequence);
    }
}
