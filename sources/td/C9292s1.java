package td;

import android.content.Context;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import p139jb.AbstractC5911c;

public class C9292s1 extends FrameLayoutFix implements AbstractC5911c, C1357a0.AbstractC1358a {
    public boolean f30079M;
    public boolean f30080N;
    public int f30081O = -1;
    public int f30082P;

    public C9292s1(Context context) {
        super(context);
        setPadding(0, View$OnClickListenerC9170d1.m10066c3(true), 0, 0);
        C1357a0.m37549a(this);
    }

    public void m9615C1() {
        this.f30079M = false;
        this.f30080N = false;
    }

    public void m9614D1() {
        this.f30079M = false;
        if (this.f30080N) {
            this.f30080N = false;
            requestLayout();
        }
    }

    public void m9613E1() {
        this.f30079M = true;
    }

    @Override
    public void mo4501a3() {
        C1357a0.m37528v(this);
    }

    @Override
    public boolean isLayoutRequested() {
        return this.f30080N;
    }

    @Override
    public void mo9612n1(int i) {
        int c3 = View$OnClickListenerC9170d1.m10066c3(true);
        if (getPaddingTop() != c3) {
            setPadding(0, c3, 0, 0);
        }
    }

    @Override
    public void requestLayout() {
        if (!this.f30079M) {
            int i = this.f30081O;
            if (i == -1) {
                super.requestLayout();
                return;
            }
            int i2 = this.f30082P;
            if (i2 < i) {
                this.f30082P = i2 + 1;
                super.requestLayout();
                return;
            }
            return;
        }
        this.f30080N = true;
    }

    public void setController(C9270q1 q1Var) {
    }
}
