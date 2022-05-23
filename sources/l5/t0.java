package l5;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import w5.i;

public final class t0 extends i {
    public final u0 f16234a;

    public t0(u0 u0Var, Looper looper) {
        super(looper);
        this.f16234a = u0Var;
    }

    @Override
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((s0) message.obj).b(this.f16234a);
        } else if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GACStateManager", sb2.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
