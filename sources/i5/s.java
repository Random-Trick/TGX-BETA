package i5;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public final class s {
    public final Messenger f14029a;
    public final e f14030b;

    public s(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f14029a = new Messenger(iBinder);
            this.f14030b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f14030b = new e(iBinder);
            this.f14029a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public final void a(Message message) {
        Messenger messenger = this.f14029a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        e eVar = this.f14030b;
        if (eVar != null) {
            eVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
