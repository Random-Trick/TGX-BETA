package p357z5;

import p075f6.C4289i;
import p148k5.AbstractC6096d;
import p163l5.C6378r;

public final class BinderC11316s extends AbstractBinderC11301j {
    public AbstractC6096d<C4289i> f36233a;

    public BinderC11316s(AbstractC6096d<C4289i> dVar) {
        C6378r.m20516b(dVar != null, "listener can't be null.");
        this.f36233a = dVar;
    }

    @Override
    public final void mo907i0(C4289i iVar) {
        this.f36233a.mo21336a(iVar);
        this.f36233a = null;
    }
}
