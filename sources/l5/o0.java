package l5;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import w5.i;

public final class o0 extends i {
    public final q0 f16179a;

    public o0(q0 q0Var, Looper looper) {
        super(looper);
        this.f16179a = q0Var;
    }

    @Override
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            q0.v(this.f16179a);
        } else if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GoogleApiClientImpl", sb2.toString());
        } else {
            q0.u(this.f16179a);
        }
    }
}
