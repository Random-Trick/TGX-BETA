package p075f6;

import com.google.android.gms.common.api.Status;
import p133j5.C5861b;
import p163l5.C6322b;
import p177m6.C6777m;
import p357z5.AbstractBinderC11293f;
import p357z5.C11285b;

public final class BinderC4301o extends AbstractBinderC11293f {
    public final C6777m f14366a;

    public BinderC4301o(C4274b bVar, C6777m mVar) {
        this.f14366a = mVar;
    }

    @Override
    public final void mo925J0(C11285b bVar) {
        Status a = bVar.mo952a();
        if (a == null) {
            this.f14366a.m19084d(new C5861b(new Status(8, "Got null status from location service")));
        } else if (a.m30398c() == 0) {
            this.f14366a.m19085c(Boolean.TRUE);
        } else {
            this.f14366a.m19084d(C6322b.m20673a(a));
        }
    }

    @Override
    public final void mo924h() {
    }
}
