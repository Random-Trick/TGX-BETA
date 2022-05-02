package p262s6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ServiceConnectionC8668l implements ServiceConnection {
    public final C8670m f27995a;

    public ServiceConnectionC8668l(C8670m mVar, C8666k kVar) {
        this.f27995a = mVar;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C8646a aVar;
        aVar = this.f27995a.f27998b;
        aVar.m11814d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f27995a.m11791c().post(new C8662i(this, iBinder));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        C8646a aVar;
        aVar = this.f27995a.f27998b;
        aVar.m11814d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f27995a.m11791c().post(new C8664j(this));
    }
}
