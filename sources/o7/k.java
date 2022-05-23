package o7;

import n6.m;
import q7.d;

public class k implements n {
    public final m<String> f19304a;

    public k(m<String> mVar) {
        this.f19304a = mVar;
    }

    @Override
    public boolean a(d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f19304a.e(dVar.d());
        return true;
    }

    @Override
    public boolean b(Exception exc) {
        return false;
    }
}
