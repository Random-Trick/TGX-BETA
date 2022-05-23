package t6;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

public final class i extends b {
    public final IBinder f22949b;
    public final l f22950c;

    public i(l lVar, IBinder iBinder) {
        this.f22950c = lVar;
        this.f22949b = iBinder;
    }

    @Override
    public final void a() {
        h hVar;
        List<Runnable> list;
        List list2;
        m mVar = this.f22950c.f22952a;
        hVar = mVar.f22962i;
        mVar.f22967n = (IInterface) hVar.a(this.f22949b);
        m.o(this.f22950c.f22952a);
        this.f22950c.f22952a.f22960g = false;
        list = this.f22950c.f22952a.f22957d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f22950c.f22952a.f22957d;
        list2.clear();
    }
}
