package p075f6;

import com.google.android.gms.common.api.Status;
import p133j5.C5861b;
import p133j5.C5874i;
import p148k5.AbstractC6096d;
import p177m6.C6777m;

public final class C4304p0 implements AbstractC6096d<C4289i> {
    public final C6777m<C4287h> f14369a;

    public C4304p0(C6777m<C4287h> mVar) {
        this.f14369a = mVar;
    }

    @Override
    public final void mo21335a(C4289i iVar) {
        C4289i iVar2 = iVar;
        Status a = iVar2.mo952a();
        if (a.m30393f()) {
            this.f14369a.m19084c(new C4287h(iVar2));
        } else if (a.m30394e()) {
            this.f14369a.m19085b(new C5874i(a));
        } else {
            this.f14369a.m19085b(new C5861b(a));
        }
    }
}
