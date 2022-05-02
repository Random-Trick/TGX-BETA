package p262s6;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

public final class C8662i extends AbstractRunnableC8648b {
    public final IBinder f27989b;
    public final ServiceConnectionC8668l f27990c;

    public C8662i(ServiceConnectionC8668l lVar, IBinder iBinder) {
        this.f27990c = lVar;
        this.f27989b = iBinder;
    }

    @Override
    public final void mo11797a() {
        AbstractC8660h hVar;
        List<Runnable> list;
        List list2;
        C8670m mVar = this.f27990c.f27992a;
        hVar = mVar.f28002i;
        mVar.f28007n = (IInterface) hVar.mo11801a(this.f27989b);
        C8670m.m11780o(this.f27990c.f27992a);
        this.f27990c.f27992a.f28000g = false;
        list = this.f27990c.f27992a.f27997d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f27990c.f27992a.f27997d;
        list2.clear();
    }
}
