package l5;

import android.app.Dialog;

public final class u2 extends h1 {
    public final Dialog f16255a;
    public final v2 f16256b;

    public u2(v2 v2Var, Dialog dialog) {
        this.f16256b = v2Var;
        this.f16255a = dialog;
    }

    @Override
    public final void a() {
        this.f16256b.f16260b.c();
        if (this.f16255a.isShowing()) {
            this.f16255a.dismiss();
        }
    }
}
