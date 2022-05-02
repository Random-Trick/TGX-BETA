package p262s6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

public final class C8656f extends AbstractRunnableC8648b {
    public final C8670m f27990b;

    public C8656f(C8670m mVar) {
        this.f27990b = mVar;
    }

    @Override
    public final void mo11796a() {
        IInterface iInterface;
        C8646a aVar;
        Context context;
        ServiceConnection serviceConnection;
        C8670m mVar = this.f27990b;
        iInterface = mVar.f28010n;
        if (iInterface != null) {
            aVar = mVar.f27998b;
            aVar.m11814d("Unbind from service.", new Object[0]);
            C8670m mVar2 = this.f27990b;
            context = mVar2.f27997a;
            serviceConnection = mVar2.f28009m;
            context.unbindService(serviceConnection);
            this.f27990b.f28003g = false;
            this.f27990b.f28010n = null;
            this.f27990b.f28009m = null;
        }
        this.f27990b.m11773u();
    }
}
