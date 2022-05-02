package p190n7;

import p177m6.C6777m;
import p220p7.AbstractC8061d;

public class C7293j implements AbstractC7298n {
    public final C7299o f23168a;
    public final C6777m<AbstractC7295l> f23169b;

    public C7293j(C7299o oVar, C6777m<AbstractC7295l> mVar) {
        this.f23168a = oVar;
        this.f23169b = mVar;
    }

    @Override
    public boolean mo17121a(Exception exc) {
        this.f23169b.m19084d(exc);
        return true;
    }

    @Override
    public boolean mo17120b(AbstractC8061d dVar) {
        if (!dVar.m13666k() || this.f23168a.m17114f(dVar)) {
            return false;
        }
        this.f23169b.m19085c(AbstractC7295l.m17132a().mo17127b(dVar.mo13675b()).mo17125d(dVar.mo13674c()).mo17126c(dVar.mo13669h()).mo17128a());
        return true;
    }
}
