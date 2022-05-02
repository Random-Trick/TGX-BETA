package p102h5;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public final class C4979s {
    public final Messenger f16918a;
    public final C4964e f16919b;

    public C4979s(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f16918a = new Messenger(iBinder);
            this.f16919b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f16919b = new C4964e(iBinder);
            this.f16918a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public final void m24348a(Message message) {
        Messenger messenger = this.f16918a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C4964e eVar = this.f16919b;
        if (eVar != null) {
            eVar.m24363b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
