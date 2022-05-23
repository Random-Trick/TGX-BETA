package vc;

import android.content.Context;
import android.view.ViewGroup;
import hd.s4;
import kb.c;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.a;
import ne.d0;

public class z3 extends d0 implements c, a {
    public final g3 R;

    public z3(Context context) {
        super(context);
        g3 g3Var = new g3(context);
        this.R = g3Var;
        g3Var.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        addView(g3Var);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public void A1(s4 s4Var) {
        if (s4Var == null) {
            this.R.a().r(null);
        } else {
            s4Var.I8(this.R.a());
        }
    }

    @Override
    public void Q2() {
        this.R.Q2();
    }

    @Override
    public void b() {
        this.R.b();
    }

    @Override
    public void e() {
        this.R.e();
    }
}
