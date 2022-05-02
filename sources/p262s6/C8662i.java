package p262s6;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

public final class C8662i extends AbstractRunnableC8648b {
    public final IBinder f27992b;
    public final ServiceConnectionC8668l f27993c;

    public C8662i(ServiceConnectionC8668l lVar, IBinder iBinder) {
        this.f27993c = lVar;
        this.f27992b = iBinder;
    }

    @Override
    public final void mo11796a() {
        AbstractC8660h hVar;
        List<Runnable> list;
        List list2;
        C8670m mVar = this.f27993c.f27995a;
        hVar = mVar.f28005i;
        mVar.f28010n = (IInterface) hVar.mo11800a(this.f27992b);
        C8670m.m11779o(this.f27993c.f27995a);
        this.f27993c.f27995a.f28003g = false;
        list = this.f27993c.f27995a.f28000d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f27993c.f27995a.f28000d;
        list2.clear();
    }
}
