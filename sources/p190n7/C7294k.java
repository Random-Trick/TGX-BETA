package p190n7;

import p177m6.C6777m;
import p220p7.AbstractC8061d;

public class C7294k implements AbstractC7298n {
    public final C6777m<String> f23170a;

    public C7294k(C6777m<String> mVar) {
        this.f23170a = mVar;
    }

    @Override
    public boolean mo17121a(Exception exc) {
        return false;
    }

    @Override
    public boolean mo17120b(AbstractC8061d dVar) {
        if (!dVar.m13665l() && !dVar.m13666k() && !dVar.m13668i()) {
            return false;
        }
        this.f23170a.m19083e(dVar.mo13673d());
        return true;
    }
}
