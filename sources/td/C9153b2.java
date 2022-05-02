package td;

import android.content.Context;
import me.vkryl.android.widget.FrameLayoutFix;

public class C9153b2 extends FrameLayoutFix {
    public boolean f29499M;
    public boolean f29500N;
    public int f29501O = -1;
    public int f29502P;

    public C9153b2(Context context) {
        super(context);
    }

    public void m10175C1() {
        this.f29499M = false;
        this.f29500N = false;
    }

    public void m10174D1() {
        this.f29499M = false;
        if (this.f29500N) {
            this.f29500N = false;
            requestLayout();
        }
    }

    public void m10173E1() {
        this.f29499M = true;
    }

    @Override
    public boolean isLayoutRequested() {
        return this.f29500N;
    }

    @Override
    public void requestLayout() {
        if (!this.f29499M) {
            int i = this.f29501O;
            if (i == -1) {
                super.requestLayout();
                return;
            }
            int i2 = this.f29502P;
            if (i2 < i) {
                this.f29502P = i2 + 1;
                super.requestLayout();
                return;
            }
            return;
        }
        this.f29500N = true;
    }
}
