package ud;

import android.content.Context;
import ce.a0;
import kb.c;
import me.vkryl.android.widget.FrameLayoutFix;

public class s1 extends FrameLayoutFix implements c, a0.a {
    public boolean M;
    public boolean N;
    public int O = -1;
    public int P;

    public s1(Context context) {
        super(context);
        setPadding(0, d1.a3(true), 0, 0);
        a0.a(this);
    }

    public void A1() {
        this.M = false;
        if (this.N) {
            this.N = false;
            requestLayout();
        }
    }

    public void B1() {
        this.M = true;
    }

    @Override
    public void Q2() {
        a0.v(this);
    }

    @Override
    public boolean isLayoutRequested() {
        return this.N;
    }

    @Override
    public void k1(int i10) {
        int a32 = d1.a3(true);
        if (getPaddingTop() != a32) {
            setPadding(0, a32, 0, 0);
        }
    }

    @Override
    public void requestLayout() {
        if (!this.M) {
            int i10 = this.O;
            if (i10 == -1) {
                super.requestLayout();
                return;
            }
            int i11 = this.P;
            if (i11 < i10) {
                this.P = i11 + 1;
                super.requestLayout();
                return;
            }
            return;
        }
        this.N = true;
    }

    public void setController(q1 q1Var) {
    }

    public void z1() {
        this.M = false;
        this.N = false;
    }
}
