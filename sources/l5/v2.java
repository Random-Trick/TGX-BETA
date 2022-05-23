package l5;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import j5.a;
import m5.r;

public final class v2 implements Runnable {
    public final t2 f16259a;
    public final w2 f16260b;

    public v2(w2 w2Var, t2 t2Var) {
        this.f16260b = w2Var;
        this.f16259a = t2Var;
    }

    @Override
    public final void run() {
        if (this.f16260b.f16265b) {
            a b10 = this.f16259a.b();
            if (b10.e()) {
                w2 w2Var = this.f16260b;
                w2Var.f5652a.d(GoogleApiActivity.a(w2Var.a(), (PendingIntent) r.k(b10.d()), this.f16259a.a(), false), 1);
                return;
            }
            w2 w2Var2 = this.f16260b;
            if (w2Var2.N.d(w2Var2.a(), b10.b(), null) != null) {
                w2 w2Var3 = this.f16260b;
                w2Var3.N.s(w2Var3.a(), this.f16260b.f5652a, b10.b(), 2, this.f16260b);
            } else if (b10.b() == 18) {
                w2 w2Var4 = this.f16260b;
                Dialog v10 = w2Var4.N.v(w2Var4.a(), this.f16260b);
                w2 w2Var5 = this.f16260b;
                w2Var5.N.w(w2Var5.a().getApplicationContext(), new u2(this, v10));
            } else {
                this.f16260b.d(b10, this.f16259a.a());
            }
        }
    }
}
