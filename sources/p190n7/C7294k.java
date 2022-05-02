package p190n7;

import p177m6.C6777m;
import p220p7.AbstractC8061d;

public class C7294k implements AbstractC7298n {
    public final C6777m<String> f23167a;

    public C7294k(C6777m<String> mVar) {
        this.f23167a = mVar;
    }

    @Override
    public boolean mo17121a(Exception exc) {
        return false;
    }

    @Override
    public boolean mo17120b(AbstractC8061d dVar) {
        if (!dVar.m13666l() && !dVar.m13667k() && !dVar.m13669i()) {
            return false;
        }
        this.f23167a.m19082e(dVar.mo13674d());
        return true;
    }
}
