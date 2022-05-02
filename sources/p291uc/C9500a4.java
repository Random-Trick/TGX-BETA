package p291uc;

import android.content.Context;
import android.view.ViewGroup;
import gd.AbstractC4761s4;
import me.AbstractC6828a;
import me.C6858d0;
import me.vkryl.android.widget.FrameLayoutFix;
import p139jb.AbstractC5911c;

public class C9500a4 extends C6858d0 implements AbstractC5911c, AbstractC6828a {
    public final C9555h3 f30755R;

    public C9500a4(Context context) {
        super(context);
        C9555h3 h3Var = new C9555h3(context);
        this.f30755R = h3Var;
        h3Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        addView(h3Var);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public void m8465D1(AbstractC4761s4 s4Var) {
        if (s4Var == null) {
            this.f30755R.m8319a().m20231r(null);
        } else {
            s4Var.mo26160I8(this.f30755R.m8319a());
        }
    }

    @Override
    public void mo4501a3() {
        this.f30755R.mo4501a3();
    }

    @Override
    public void mo8229b() {
        this.f30755R.mo8229b();
    }

    @Override
    public void mo8225f() {
        this.f30755R.mo8225f();
    }
}
