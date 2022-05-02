package p091g6;

import android.os.RemoteException;
import p103h6.AbstractC4997f;
import p119i6.C5245f;

public final class C4493i {
    public final AbstractC4997f f14854a;

    public C4493i(AbstractC4997f fVar) {
        this.f14854a = fVar;
    }

    public void m27516a(boolean z) {
        try {
            this.f14854a.mo24321M(z);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m27515b(boolean z) {
        try {
            this.f14854a.mo24322J(z);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m27514c(boolean z) {
        try {
            this.f14854a.mo24320v0(z);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }
}
