package p202o6;

import android.os.RemoteException;
import java.util.Map;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7687f extends AbstractRunnableC8648b {
    public final C7757t f24625M;
    public final Map f24626b;
    public final C9865p f24627c;

    public C7687f(C7757t tVar, C9865p pVar, Map map, C9865p pVar2) {
        super(pVar);
        this.f24625M = tVar;
        this.f24626b = map;
        this.f24627c = pVar2;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        try {
            mVar = this.f24625M.f24848d;
            str = this.f24625M.f24845a;
            ((AbstractC8673n0) mVar.m11789e()).mo11765y1(str, C7757t.m15127o(this.f24626b), new BinderC7732o(this.f24625M, this.f24627c));
        } catch (RemoteException e) {
            aVar = C7757t.f24843g;
            aVar.m11815c(e, "syncPacks", new Object[0]);
            this.f24627c.m6732d(new RuntimeException(e));
        }
    }
}
