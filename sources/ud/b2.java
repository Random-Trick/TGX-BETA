package ud;

import android.content.Context;
import me.vkryl.android.widget.FrameLayoutFix;

public class b2 extends FrameLayoutFix {
    public boolean M;
    public boolean N;
    public int O = -1;
    public int P;

    public b2(Context context) {
        super(context);
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
    public boolean isLayoutRequested() {
        return this.N;
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

    public void z1() {
        this.M = false;
        this.N = false;
    }
}
