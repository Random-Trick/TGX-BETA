package p075f6;

import p148k5.C6120i;
import p177m6.C6777m;
import p357z5.C11317t;

public final class C4299n extends AbstractC4309s {
    public final C6120i f14364b;
    public final C4274b f14365c;

    public C4299n(C4274b bVar, C6120i iVar) {
        this.f14365c = bVar;
        this.f14364b = iVar;
    }

    @Override
    public final void mo17211a(C11317t tVar, C6777m<Boolean> mVar) {
        C11317t tVar2 = tVar;
        C6777m<Boolean> mVar2 = mVar;
        if (m28287b()) {
            BinderC4301o oVar = new BinderC4301o(this.f14365c, mVar2);
            try {
                C6120i.C6121a<AbstractC4278d> b = this.f14364b.m21260b();
                if (b != null) {
                    tVar2.m901r0(b, oVar);
                }
            } catch (RuntimeException e) {
                mVar2.m19083d(e);
            }
        }
    }
}
