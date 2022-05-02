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
    public final C7757t f24607M;
    public final List f24608b;
    public final C9865p f24609c;

    public C7681e(C7757t tVar, C9865p pVar, List list, C9865p pVar2) {
        super(pVar);
        this.f24607M = tVar;
        this.f24608b = list;
        this.f24609c = pVar2;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        C8670m mVar;
        String str;
        Bundle g;
        ArrayList u = C7757t.m15121u(this.f24608b);
        try {
            mVar = this.f24607M.f24845d;
            str = this.f24607M.f24842a;
            g = C7757t.m15135g();
            ((AbstractC8673n0) mVar.m11790e()).mo11767u1(str, u, g, new BinderC7722m(this.f24607M, this.f24609c));
        } catch (RemoteException e) {
            aVar = C7757t.f24840g;
            aVar.m11816c(e, "cancelDownloads(%s)", this.f24608b);
        }
    }
}
