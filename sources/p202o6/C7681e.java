package p202o6;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p262s6.AbstractC8673n0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class C7681e extends AbstractRunnableC8648b {
    public final C7757t f24610M;
    public final List f24611b;
    public final C9865p f24612c;

    public C7681e(C7757t tVar, C9865p pVar, List list, C9865p pVar2) {
        super(pVar);
        this.f24610M = tVar;
        this.f24611b = list;
        this.f24612c = pVar2;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle g;
        ArrayList u = C7757t.m15121u(this.f24611b);
        try {
            mVar = this.f24610M.f24848d;
            str = this.f24610M.f24845a;
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11789e()).mo11766u1(str, u, g, new BinderC7722m(this.f24610M, this.f24612c));
        } catch (RemoteException e) {
            aVar = C7757t.f24843g;
            aVar.m11815c(e, "cancelDownloads(%s)", this.f24611b);
        }
    }
}
