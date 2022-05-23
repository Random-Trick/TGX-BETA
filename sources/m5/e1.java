package m5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class e1 implements ServiceConnection {
    public final int f17193a;
    public final c f17194b;

    public e1(c cVar, int i10) {
        this.f17194b = cVar;
        this.f17193a = i10;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        n nVar;
        if (iBinder == null) {
            c.X(this.f17194b, 16);
            return;
        }
        obj = this.f17194b.W;
        synchronized (obj) {
            c cVar = this.f17194b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof n)) {
                nVar = new x0(iBinder);
            } else {
                nVar = (n) queryLocalInterface;
            }
            cVar.X = nVar;
        }
        this.f17194b.W(0, null, this.f17193a);
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f17194b.W;
        synchronized (obj) {
            this.f17194b.X = null;
        }
        Handler handler = this.f17194b.U;
        handler.sendMessage(handler.obtainMessage(6, this.f17193a, 1));
    }
}
