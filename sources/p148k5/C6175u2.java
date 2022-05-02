package p148k5;

import android.app.Dialog;

public final class C6175u2 extends AbstractC6118h1 {
    public final Dialog f19569a;
    public final RunnableC6179v2 f19570b;

    public C6175u2(RunnableC6179v2 v2Var, Dialog dialog) {
        this.f19570b = v2Var;
        this.f19569a = dialog;
    }

    @Override
    public final void mo21104a() {
        this.f19570b.f19574b.m21097c();
        if (this.f19569a.isShowing()) {
            this.f19569a.dismiss();
        }
    }
}
