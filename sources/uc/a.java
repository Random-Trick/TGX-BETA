package uc;

import ae.j;
import ae.v;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ce.a0;
import ce.o;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import org.thunderdog.challegram.R;
import yd.g;

public class a extends FrameLayoutFix {
    public TextView M;
    public ProgressBar N;

    public a(Context context) {
        super(context);
        int min = Math.min(a0.B() - a0.i(56.0f), a0.i(300.0f));
        int i10 = a0.i(94.0f);
        g.j(this, R.id.theme_color_filling);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(36.0f), a0.i(36.0f), 19);
        r12.setMargins(a0.i(12.0f), 0, 0, 0);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.N = progressBar;
        progressBar.setIndeterminate(true);
        this.N.setLayoutParams(r12);
        addView(this.N);
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-2, -2, 19);
        r13.setMargins(a0.i(60.0f), a0.i(1.0f), 0, 0);
        b2 b2Var = new b2(context);
        this.M = b2Var;
        b2Var.setTextColor(j.P0());
        this.M.setGravity(3);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(o.k());
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setMaxWidth(min - a0.i(64.0f));
        this.M.setMaxLines(2);
        this.M.setLayoutParams(r13);
        addView(this.M);
        setLayoutParams(FrameLayoutFix.r1(min, i10, 17));
    }

    public ProgressBar getProgress() {
        return this.N;
    }

    public void setMessage(String str) {
        this.M.setText(str);
    }

    public void z1(v vVar) {
        if (vVar != null) {
            vVar.f(this);
            vVar.j(this.M);
        }
    }
}
