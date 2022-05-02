package p091g6;

import android.os.RemoteException;
import p103h6.AbstractC4997f;
import p119i6.C5245f;

public final class C4493i {
    public final AbstractC4997f f14854a;

    public C4493i(AbstractC4997f fVar) {
        this.f14854a = fVar;
    }

    public void m27518a(boolean z) {
        try {
            this.f14854a.mo24322M(z);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m27517b(boolean z) {
        try {
            this.f14854a.mo24323J(z);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m27516c(boolean z) {
        try {
            this.f14854a.mo24321v0(z);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }
}
