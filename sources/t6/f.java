package t6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

public final class f extends b {
    public final m f22947b;

    public f(m mVar) {
        this.f22947b = mVar;
    }

    @Override
    public final void a() {
        IInterface iInterface;
        a aVar;
        Context context;
        ServiceConnection serviceConnection;
        m mVar = this.f22947b;
        iInterface = mVar.f22967n;
        if (iInterface != null) {
            aVar = mVar.f22955b;
            aVar.d("Unbind from service.", new Object[0]);
            m mVar2 = this.f22947b;
            context = mVar2.f22954a;
            serviceConnection = mVar2.f22966m;
            context.unbindService(serviceConnection);
            this.f22947b.f22960g = false;
            this.f22947b.f22967n = null;
            this.f22947b.f22966m = null;
        }
        this.f22947b.u();
    }
}
