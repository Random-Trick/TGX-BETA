package ud;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.o;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;

public class g2 extends FrameLayoutFix implements d, v2 {
    public TextView M;

    public g2(Context context) {
        super(context);
        TextView A1 = A1(context);
        this.M = A1;
        A1.setTag(this);
        addView(this.M);
    }

    public static TextView A1(Context context) {
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, (w.G2() ? 5 : 3) | 48);
        r12.setMargins(0, a0.i(15.0f), 0, 0);
        if (w.G2()) {
            r12.rightMargin = a0.i(68.0f);
        } else {
            r12.leftMargin = a0.i(68.0f);
        }
        b2 b2Var = new b2(context);
        b2Var.setTypeface(o.i());
        b2Var.setSingleLine();
        b2Var.setGravity(3);
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setTextSize(1, 19.0f);
        b2Var.setTextColor(-1);
        b2Var.setLayoutParams(r12);
        return b2Var;
    }

    @Override
    public final void I0(int i10, int i11) {
    }

    @Override
    public void setTextColor(int i10) {
        this.M.setTextColor(i10);
    }

    public void z1(v4<?> v4Var) {
        this.M.setText(v4Var.X9());
    }
}
