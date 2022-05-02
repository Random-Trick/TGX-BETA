package p194nd;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import p194nd.C7484p1;

public class C7478o1 extends FrameLayoutFix implements C7484p1.AbstractC7485a {
    public C7486q f23886M;
    public C7484p1 f23887N;
    public AbstractC7479a f23888O;

    public interface AbstractC7479a {
        void mo15818d(C7478o1 o1Var);

        void mo15812u(C7478o1 o1Var);

        boolean mo15811w();

        void mo15810y(C7478o1 o1Var, int i);
    }

    public C7478o1(Context context) {
        super(context);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37544i(86.0f), -1);
        s1.bottomMargin = C1357a0.m37544i(2.5f);
        C7486q qVar = new C7486q(context);
        this.f23886M = qVar;
        qVar.setLayoutParams(s1);
        addView(this.f23886M);
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, -1);
        s12.leftMargin = ((C1357a0.m37544i(64.0f) + C1357a0.m37544i(22.0f)) + C1357a0.m37544i(18.0f)) - C1357a0.m37544i(12.0f);
        s12.rightMargin = C1357a0.m37544i(22.0f) - C1357a0.m37544i(12.0f);
        C7484p1 p1Var = new C7484p1(context);
        this.f23887N = p1Var;
        p1Var.setPadding(C1357a0.m37544i(12.0f), C1357a0.m37544i(1.0f), C1357a0.m37544i(12.0f), 0);
        this.f23887N.setListener(this);
        this.f23887N.setLayoutParams(s12);
        addView(this.f23887N);
        setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(42.0f)));
    }

    public void m15886C1(String str, int i, float f, int i2, int i3, boolean z) {
        String str2;
        this.f23886M.setName(str);
        C7486q qVar = this.f23886M;
        if (i == 0) {
            str2 = "0";
        } else if (i > 0) {
            str2 = "+" + i;
        } else {
            str2 = String.valueOf(i);
        }
        qVar.setValue(str2);
        this.f23887N.m15842g(i3, false);
        this.f23887N.setValue(f);
        this.f23887N.setAnchorMode(i2);
        this.f23887N.m15841h(z, false);
    }

    @Override
    public void mo15839U0(C7484p1 p1Var, float f) {
        String str;
        int round = Math.round(f * 100.0f);
        C7486q qVar = this.f23886M;
        if (round == 0) {
            str = "0";
        } else if (round > 0) {
            str = "+" + round;
        } else {
            str = String.valueOf(round);
        }
        qVar.setValue(str);
        AbstractC7479a aVar = this.f23888O;
        if (aVar != null) {
            aVar.mo15810y(this, round);
        }
    }

    @Override
    public void mo15838q2(C7484p1 p1Var, boolean z) {
        this.f23886M.m15834E1(z, true);
        AbstractC7479a aVar = this.f23888O;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.mo15812u(this);
        } else {
            aVar.mo15818d(this);
        }
    }

    @Override
    public boolean mo15837s0(C7484p1 p1Var) {
        AbstractC7479a aVar = this.f23888O;
        return aVar == null || aVar.mo15811w();
    }

    public void setCallback(AbstractC7479a aVar) {
        this.f23888O = aVar;
    }

    public void setColorId(int i) {
        this.f23887N.m15842g(i, true);
    }

    public void setSlideEnabled(boolean z) {
        this.f23887N.m15841h(z, true);
    }
}
