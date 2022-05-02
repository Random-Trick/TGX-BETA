package td;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1389o;
import me.C6847b2;
import me.vkryl.android.widget.FrameLayoutFix;
import p082fd.C4403w;

public class C9196g2 extends FrameLayoutFix implements AbstractC9168d, AbstractC9321v2 {
    public TextView f29691M;

    public C9196g2(Context context) {
        super(context);
        TextView D1 = m9982D1(context);
        this.f29691M = D1;
        D1.setTag(this);
        addView(this.f29691M);
    }

    public static TextView m9982D1(Context context) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, (C4403w.m27986G2() ? 5 : 3) | 48);
        t1.setMargins(0, C1357a0.m37544i(15.0f), 0, 0);
        if (C4403w.m27986G2()) {
            t1.rightMargin = C1357a0.m37544i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37544i(68.0f);
        }
        C6847b2 b2Var = new C6847b2(context);
        b2Var.setTypeface(C1389o.m37263i());
        b2Var.setSingleLine();
        b2Var.setGravity(3);
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setTextSize(1, 19.0f);
        b2Var.setTextColor(-1);
        b2Var.setLayoutParams(t1);
        return b2Var;
    }

    public void m9983C1(AbstractC9323v4<?> v4Var) {
        this.f29691M.setText(v4Var.mo9313X9());
    }

    @Override
    public final void mo9846G0(int i, int i2) {
    }

    @Override
    public void setTextColor(int i) {
        this.f29691M.setTextColor(i);
    }
}
