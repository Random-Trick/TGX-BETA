package p262s6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ServiceConnectionC8668l implements ServiceConnection {
    public final C8670m f27992a;

    public ServiceConnectionC8668l(C8670m mVar, C8666k kVar) {
        this.f27992a = mVar;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C8646a aVar;
        aVar = this.f27992a.f27995b;
        aVar.m11815d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f27992a.m11792c().post(new C8662i(this, iBinder));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        C8646a aVar;
        aVar = this.f27992a.f27995b;
        aVar.m11815d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f27992a.m11792c().post(new C8664j(this));
    }
}
