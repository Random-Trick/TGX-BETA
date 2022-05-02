package gb;

import android.content.Context;
import android.view.View;
import me.vkryl.android.widget.FrameLayoutFix;

public class C4534a extends FrameLayoutFix {
    public Runnable f14950M;

    public C4534a(Context context) {
        super(context);
    }

    @Override
    public void mo8061R(View view, Runnable runnable) {
        this.f14950M = runnable;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f14950M;
        if (runnable != null) {
            runnable.run();
            this.f14950M = null;
        }
    }
}
