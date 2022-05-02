package p189n6;

import android.os.RemoteException;
import p262s6.AbstractC8663i0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p300v6.C9865p;

public final class C7268p extends AbstractRunnableC8648b {
    public final C7273u f23108M;
    public final String f23109b;
    public final C9865p f23110c;

    public C7268p(C7273u uVar, C9865p pVar, String str, C9865p pVar2) {
        super(pVar);
        this.f23108M = uVar;
        this.f23109b = str;
        this.f23110c = pVar2;
    }

    @Override
    public final void mo11796a() {
        C8646a aVar;
        String str;
        try {
            C7273u uVar = this.f23108M;
            str = uVar.f23122b;
            ((AbstractC8663i0) this.f23108M.f23121a.m11789e()).mo11798U(str, C7273u.m17177b(uVar, this.f23109b), new BinderC7272t(this.f23108M, this.f23110c, this.f23109b));
        } catch (RemoteException e) {
            aVar = C7273u.f23119e;
            aVar.m11815c(e, "requestUpdateInfo(%s)", this.f23109b);
            this.f23110c.m6732d(new RuntimeException(e));
        }
    }
}
