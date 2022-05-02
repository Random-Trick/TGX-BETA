package p148k5;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p118i5.C5217a;
import p163l5.C6378r;

public final class RunnableC6179v2 implements Runnable {
    public final C6171t2 f19573a;
    public final AbstractDialogInterface$OnCancelListenerC6183w2 f19574b;

    public RunnableC6179v2(AbstractDialogInterface$OnCancelListenerC6183w2 w2Var, C6171t2 t2Var) {
        this.f19574b = w2Var;
        this.f19573a = t2Var;
    }

    @Override
    public final void run() {
        if (this.f19574b.f19581b) {
            C5217a b = this.f19573a.m21129b();
            if (b.m23613e()) {
                AbstractDialogInterface$OnCancelListenerC6183w2 w2Var = this.f19574b;
                w2Var.f11598a.m21272d(GoogleApiActivity.m30402a(w2Var.m30379a(), (PendingIntent) C6378r.m20507k(b.m23614d()), this.f19573a.m21130a(), false), 1);
                return;
            }
            AbstractDialogInterface$OnCancelListenerC6183w2 w2Var2 = this.f19574b;
            if (w2Var2.f19580N.mo23591d(w2Var2.m30379a(), b.m23616b(), null) != null) {
                AbstractDialogInterface$OnCancelListenerC6183w2 w2Var3 = this.f19574b;
                w2Var3.f19580N.m23602s(w2Var3.m30379a(), this.f19574b.f11598a, b.m23616b(), 2, this.f19574b);
            } else if (b.m23616b() == 18) {
                AbstractDialogInterface$OnCancelListenerC6183w2 w2Var4 = this.f19574b;
                Dialog v = w2Var4.f19580N.m23599v(w2Var4.m30379a(), this.f19574b);
                AbstractDialogInterface$OnCancelListenerC6183w2 w2Var5 = this.f19574b;
                w2Var5.f19580N.m23598w(w2Var5.m30379a().getApplicationContext(), new C6175u2(this, v));
            } else {
                this.f19574b.m21097d(b, this.f19573a.m21130a());
            }
        }
    }
}
