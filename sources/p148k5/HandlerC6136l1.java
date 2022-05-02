package p148k5;

import android.os.Looper;
import android.os.Message;
import p148k5.C6120i;
import p163l5.C6378r;
import p299v5.HandlerC9849i;

public final class HandlerC6136l1 extends HandlerC9849i {
    public final C6120i f19462a;

    public HandlerC6136l1(C6120i iVar, Looper looper) {
        super(looper);
        this.f19462a = iVar;
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        C6378r.m20516a(z);
        this.f19462a.m21258d((C6120i.AbstractC6122b) message.obj);
    }
}
