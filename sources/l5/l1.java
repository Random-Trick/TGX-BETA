package l5;

import android.os.Looper;
import android.os.Message;
import l5.i;
import m5.r;
import w5.i;

public final class l1 extends i {
    public final i f16149a;

    public l1(i iVar, Looper looper) {
        super(looper);
        this.f16149a = iVar;
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10 = true;
        if (message.what != 1) {
            z10 = false;
        }
        r.a(z10);
        this.f16149a.d((i.b) message.obj);
    }
}
