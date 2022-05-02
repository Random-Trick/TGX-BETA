package p148k5;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p299v5.HandlerC9849i;

public final class HandlerC6169t0 extends HandlerC9849i {
    public final C6173u0 f19548a;

    public HandlerC6169t0(C6173u0 u0Var, Looper looper) {
        super(looper);
        this.f19548a = u0Var;
    }

    @Override
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((AbstractC6165s0) message.obj).m21134b(this.f19548a);
        } else if (i != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i);
            Log.w("GACStateManager", sb2.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
