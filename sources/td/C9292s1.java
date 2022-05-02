package td;

import android.content.Context;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import p139jb.AbstractC5911c;

public class C9292s1 extends FrameLayoutFix implements AbstractC5911c, C1357a0.AbstractC1358a {
    public boolean f30082M;
    public boolean f30083N;
    public int f30084O = -1;
    public int f30085P;

    public C9292s1(Context context) {
        super(context);
        setPadding(0, View$OnClickListenerC9170d1.m10065c3(true), 0, 0);
        C1357a0.m37552a(this);
    }

    public void m9614C1() {
        this.f30082M = false;
        this.f30083N = false;
    }

    public void m9613D1() {
        this.f30082M = false;
        if (this.f30083N) {
            this.f30083N = false;
            requestLayout();
        }
    }

    public void m9612E1() {
        this.f30082M = true;
    }

    @Override
    public void mo4501a3() {
        C1357a0.m37531v(this);
    }

    @Override
    public boolean isLayoutRequested() {
        return this.f30083N;
    }

    @Override
    public void mo9611n1(int i) {
        int c3 = View$OnClickListenerC9170d1.m10065c3(true);
        if (getPaddingTop() != c3) {
            setPadding(0, c3, 0, 0);
        }
    }

    @Override
    public void requestLayout() {
        if (!this.f30082M) {
            int i = this.f30084O;
            if (i == -1) {
                super.requestLayout();
                return;
            }
            int i2 = this.f30085P;
            if (i2 < i) {
                this.f30085P = i2 + 1;
                super.requestLayout();
                return;
            }
            return;
        }
        this.f30083N = true;
    }

    public void setController(C9270q1 q1Var) {
    }
}
