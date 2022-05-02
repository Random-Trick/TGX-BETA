package gb;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import p051db.AbstractC3937c;

public class C4535b extends LinearLayout implements AbstractC3937c {
    public Runnable f14951a;

    public C4535b(Context context) {
        super(context);
    }

    @Override
    public void mo8061R(View view, Runnable runnable) {
        this.f14951a = runnable;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f14951a;
        if (runnable != null) {
            runnable.run();
            this.f14951a = null;
        }
    }
}
