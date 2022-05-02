package p163l5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class ServiceConnectionC6339e1 implements ServiceConnection {
    public final int f19922a;
    public final AbstractC6325c f19923b;

    public ServiceConnectionC6339e1(AbstractC6325c cVar, int i) {
        this.f19923b = cVar;
        this.f19922a = i;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC6365n nVar;
        if (iBinder == null) {
            AbstractC6325c.m20652X(this.f19923b, 16);
            return;
        }
        obj = this.f19923b.f19874W;
        synchronized (obj) {
            AbstractC6325c cVar = this.f19923b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6365n)) {
                nVar = new C6396x0(iBinder);
            } else {
                nVar = (AbstractC6365n) queryLocalInterface;
            }
            cVar.f19875X = nVar;
        }
        this.f19923b.m20653W(0, null, this.f19922a);
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f19923b.f19874W;
        synchronized (obj) {
            this.f19923b.f19875X = null;
        }
        Handler handler = this.f19923b.f19872U;
        handler.sendMessage(handler.obtainMessage(6, this.f19922a, 1));
    }
}
