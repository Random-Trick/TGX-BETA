package td;

import android.content.Context;
import me.vkryl.android.widget.FrameLayoutFix;

public class C9153b2 extends FrameLayoutFix {
    public boolean f29502M;
    public boolean f29503N;
    public int f29504O = -1;
    public int f29505P;

    public C9153b2(Context context) {
        super(context);
    }

    public void m10174C1() {
        this.f29502M = false;
        this.f29503N = false;
    }

    public void m10173D1() {
        this.f29502M = false;
        if (this.f29503N) {
            this.f29503N = false;
            requestLayout();
        }
    }

    public void m10172E1() {
        this.f29502M = true;
    }

    @Override
    public boolean isLayoutRequested() {
        return this.f29503N;
    }

    @Override
    public void requestLayout() {
        if (!this.f29502M) {
            int i = this.f29504O;
            if (i == -1) {
                super.requestLayout();
                return;
            }
            int i2 = this.f29505P;
            if (i2 < i) {
                this.f29505P = i2 + 1;
                super.requestLayout();
                return;
            }
            return;
        }
        this.f29503N = true;
    }
}
