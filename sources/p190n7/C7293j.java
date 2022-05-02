package p190n7;

import p177m6.C6777m;
import p220p7.AbstractC8061d;

public class C7293j implements AbstractC7298n {
    public final C7299o f23165a;
    public final C6777m<AbstractC7295l> f23166b;

    public C7293j(C7299o oVar, C6777m<AbstractC7295l> mVar) {
        this.f23165a = oVar;
        this.f23166b = mVar;
    }

    @Override
    public boolean mo17121a(Exception exc) {
        this.f23166b.m19083d(exc);
        return true;
    }

    @Override
    public boolean mo17120b(AbstractC8061d dVar) {
        if (!dVar.m13667k() || this.f23165a.m17114f(dVar)) {
            return false;
        }
        this.f23166b.m19084c(AbstractC7295l.m17132a().mo17127b(dVar.mo13676b()).mo17125d(dVar.mo13675c()).mo17126c(dVar.mo13670h()).mo17128a());
        return true;
    }
}
