package hb;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import eb.c;

public class b extends LinearLayout implements c {
    public Runnable f12625a;

    public b(Context context) {
        super(context);
    }

    @Override
    public void S(View view, Runnable runnable) {
        this.f12625a = runnable;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f12625a;
        if (runnable != null) {
            runnable.run();
            this.f12625a = null;
        }
    }
}
