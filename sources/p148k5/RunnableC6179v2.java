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
            C5217a b = this.f19573a.m21128b();
            if (b.m23612e()) {
                AbstractDialogInterface$OnCancelListenerC6183w2 w2Var = this.f19574b;
                w2Var.f11598a.m21271d(GoogleApiActivity.m30400a(w2Var.m30377a(), (PendingIntent) C6378r.m20506k(b.m23613d()), this.f19573a.m21129a(), false), 1);
                return;
            }
            AbstractDialogInterface$OnCancelListenerC6183w2 w2Var2 = this.f19574b;
            if (w2Var2.f19580N.mo23590d(w2Var2.m30377a(), b.m23615b(), null) != null) {
                AbstractDialogInterface$OnCancelListenerC6183w2 w2Var3 = this.f19574b;
                w2Var3.f19580N.m23601s(w2Var3.m30377a(), this.f19574b.f11598a, b.m23615b(), 2, this.f19574b);
            } else if (b.m23615b() == 18) {
                AbstractDialogInterface$OnCancelListenerC6183w2 w2Var4 = this.f19574b;
                Dialog v = w2Var4.f19580N.m23598v(w2Var4.m30377a(), this.f19574b);
                AbstractDialogInterface$OnCancelListenerC6183w2 w2Var5 = this.f19574b;
                w2Var5.f19580N.m23597w(w2Var5.m30377a().getApplicationContext(), new C6175u2(this, v));
            } else {
                this.f19574b.m21096d(b, this.f19573a.m21129a());
            }
        }
    }
}
