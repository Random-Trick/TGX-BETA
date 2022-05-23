package hb;

import android.content.Context;
import android.view.View;
import me.vkryl.android.widget.FrameLayoutFix;

public class a extends FrameLayoutFix {
    public Runnable M;

    public a(Context context) {
        super(context);
    }

    @Override
    public void S(View view, Runnable runnable) {
        this.M = runnable;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.M;
        if (runnable != null) {
            runnable.run();
            this.M = null;
        }
    }
}
