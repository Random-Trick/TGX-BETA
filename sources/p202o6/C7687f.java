package p202o6;

import android.os.RemoteException;
import java.util.Map;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7687f extends AbstractRunnableC8648b {
    public final C7757t f24622M;
    public final Map f24623b;
    public final C9865p f24624c;

    public C7687f(C7757t tVar, C9865p pVar, Map map, C9865p pVar2) {
        super(pVar);
        this.f24622M = tVar;
        this.f24623b = map;
        this.f24624c = pVar2;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        try {
            mVar = this.f24622M.f24845d;
            str = this.f24622M.f24842a;
            ((AbstractC8673n0) mVar.m11790e()).mo11766y1(str, C7757t.m15127o(this.f24623b), new BinderC7732o(this.f24622M, this.f24624c));
        } catch (RemoteException e) {
            aVar = C7757t.f24840g;
            aVar.m11816c(e, "syncPacks", new Object[0]);
            this.f24624c.m6732d(new RuntimeException(e));
        }
    }
}
