package t6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class l implements ServiceConnection {
    public final m f22952a;

    public l(m mVar, k kVar) {
        this.f22952a = mVar;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a aVar;
        aVar = this.f22952a.f22955b;
        aVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f22952a.c().post(new i(this, iBinder));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        aVar = this.f22952a.f22955b;
        aVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f22952a.c().post(new j(this));
    }
}
