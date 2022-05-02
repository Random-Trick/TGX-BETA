package p189n6;

import android.os.RemoteException;
import p262s6.AbstractC8663i0;
import p262s6.AbstractRunnableC8648b;
import p262s6.C8646a;
import p300v6.C9865p;

public final class C7268p extends AbstractRunnableC8648b {
    public final C7273u f23105M;
    public final String f23106b;
    public final C9865p f23107c;

    public C7268p(C7273u uVar, C9865p pVar, String str, C9865p pVar2) {
        super(pVar);
        this.f23105M = uVar;
        this.f23106b = str;
        this.f23107c = pVar2;
    }

    @Override
    public final void mo11797a() {
        C8646a aVar;
        String str;
        try {
            C7273u uVar = this.f23105M;
            str = uVar.f23119b;
            ((AbstractC8663i0) this.f23105M.f23118a.m11790e()).mo11799U(str, C7273u.m17177b(uVar, this.f23106b), new BinderC7272t(this.f23105M, this.f23107c, this.f23106b));
        } catch (RemoteException e) {
            aVar = C7273u.f23116e;
            aVar.m11816c(e, "requestUpdateInfo(%s)", this.f23106b);
            this.f23107c.m6732d(new RuntimeException(e));
        }
    }
}
