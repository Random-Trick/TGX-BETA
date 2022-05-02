package p148k5;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p299v5.HandlerC9849i;

public final class HandlerC6148o0 extends HandlerC9849i {
    public final C6156q0 f19492a;

    public HandlerC6148o0(C6156q0 q0Var, Looper looper) {
        super(looper);
        this.f19492a = q0Var;
    }

    @Override
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C6156q0.m21162v(this.f19492a);
        } else if (i != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i);
            Log.w("GoogleApiClientImpl", sb2.toString());
        } else {
            C6156q0.m21163u(this.f19492a);
        }
    }
}
