package od;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import me.vkryl.android.widget.FrameLayoutFix;
import od.p1;

public class o1 extends FrameLayoutFix implements p1.a {
    public q M;
    public p1 N;
    public a O;

    public interface a {
        void b(o1 o1Var);

        void g(o1 o1Var, int i10);

        void k(o1 o1Var);

        boolean x();
    }

    public o1(Context context) {
        super(context);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(86.0f), -1);
        q12.bottomMargin = a0.i(2.5f);
        q qVar = new q(context);
        this.M = qVar;
        qVar.setLayoutParams(q12);
        addView(this.M);
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-1, -1);
        q13.leftMargin = ((a0.i(64.0f) + a0.i(22.0f)) + a0.i(18.0f)) - a0.i(12.0f);
        q13.rightMargin = a0.i(22.0f) - a0.i(12.0f);
        p1 p1Var = new p1(context);
        this.N = p1Var;
        p1Var.setPadding(a0.i(12.0f), a0.i(1.0f), a0.i(12.0f), 0);
        this.N.setListener(this);
        this.N.setLayoutParams(q13);
        addView(this.N);
        setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(42.0f)));
    }

    @Override
    public boolean A4(p1 p1Var) {
        a aVar = this.O;
        return aVar == null || aVar.x();
    }

    @Override
    public void O2(p1 p1Var, boolean z10) {
        this.M.B1(z10, true);
        a aVar = this.O;
        if (aVar == null) {
            return;
        }
        if (z10) {
            aVar.b(this);
        } else {
            aVar.k(this);
        }
    }

    @Override
    public void Y0(p1 p1Var, float f10) {
        String str;
        int round = Math.round(f10 * 100.0f);
        q qVar = this.M;
        if (round == 0) {
            str = "0";
        } else if (round > 0) {
            str = "+" + round;
        } else {
            str = String.valueOf(round);
        }
        qVar.setValue(str);
        a aVar = this.O;
        if (aVar != null) {
            aVar.g(this, round);
        }
    }

    public void setCallback(a aVar) {
        this.O = aVar;
    }

    public void setColorId(int i10) {
        this.N.g(i10, true);
    }

    public void setSlideEnabled(boolean z10) {
        this.N.h(z10, true);
    }

    public void z1(String str, int i10, float f10, int i11, int i12, boolean z10) {
        String str2;
        this.M.setName(str);
        q qVar = this.M;
        if (i10 == 0) {
            str2 = "0";
        } else if (i10 > 0) {
            str2 = "+" + i10;
        } else {
            str2 = String.valueOf(i10);
        }
        qVar.setValue(str2);
        this.N.g(i12, false);
        this.N.setValue(f10);
        this.N.setAnchorMode(i11);
        this.N.h(z10, false);
    }
}
