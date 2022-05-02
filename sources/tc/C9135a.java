package tc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import be.C1357a0;
import be.C1389o;
import me.C6847b2;
import me.RunnableC6996p3;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p335xd.C10192g;
import p364zd.C11524j;
import p364zd.C11537v;

public class C9135a extends FrameLayoutFix {
    public TextView f29422M;
    public ProgressBar f29423N;

    public C9135a(Context context) {
        super(context);
        int min = Math.min(C1357a0.m37556B() - C1357a0.m37544i(56.0f), C1357a0.m37544i(300.0f));
        int i = C1357a0.m37544i(94.0f);
        C10192g.m5781j(this, R.id.theme_color_filling);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37544i(36.0f), C1357a0.m37544i(36.0f), 19);
        t1.setMargins(C1357a0.m37544i(12.0f), 0, 0, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            ProgressBar progressBar = new ProgressBar(getContext());
            this.f29423N = progressBar;
            progressBar.setIndeterminate(true);
            this.f29423N.setLayoutParams(t1);
            addView(this.f29423N);
        } else {
            RunnableC6996p3 p3Var = new RunnableC6996p3(getContext());
            p3Var.setImageResource(R.drawable.spinner_48_inner);
            p3Var.setLayoutParams(t1);
            addView(p3Var);
        }
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-2, -2, 19);
        t12.setMargins(C1357a0.m37544i(60.0f), C1357a0.m37544i(1.0f), 0, 0);
        C6847b2 b2Var = new C6847b2(context);
        this.f29422M = b2Var;
        b2Var.setTextColor(C11524j.m217S0());
        this.f29422M.setGravity(3);
        this.f29422M.setTextSize(1, 14.0f);
        this.f29422M.setTypeface(C1389o.m37261k());
        this.f29422M.setEllipsize(TextUtils.TruncateAt.END);
        this.f29422M.setMaxWidth(min - C1357a0.m37544i(64.0f));
        this.f29422M.setMaxLines(2);
        this.f29422M.setLayoutParams(t12);
        addView(this.f29422M);
        setLayoutParams(FrameLayoutFix.m18007t1(min, i, 17));
    }

    public void m10226C1(C11537v vVar) {
        if (vVar != null) {
            vVar.m74f(this);
            vVar.m70j(this.f29422M);
        }
    }

    public ProgressBar getProgress() {
        return this.f29423N;
    }

    public void setMessage(String str) {
        this.f29422M.setText(str);
    }
}
