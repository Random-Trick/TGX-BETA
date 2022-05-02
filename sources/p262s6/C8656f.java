package p262s6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

public final class C8656f extends AbstractRunnableC8648b {
    public final C8670m f27987b;

    public C8656f(C8670m mVar) {
        this.f27987b = mVar;
    }

    @Override
    public final void mo11797a() {
        IInterface iInterface;
        C8646a aVar;
        Context context;
        ServiceConnection serviceConnection;
        C8670m mVar = this.f27987b;
        iInterface = mVar.f28007n;
        if (iInterface != null) {
            aVar = mVar.f27995b;
            aVar.m11815d("Unbind from service.", new Object[0]);
            C8670m mVar2 = this.f27987b;
            context = mVar2.f27994a;
            serviceConnection = mVar2.f28006m;
            context.unbindService(serviceConnection);
            this.f27987b.f28000g = false;
            this.f27987b.f28007n = null;
            this.f27987b.f28006m = null;
        }
        this.f27987b.m11774u();
    }
}
