package h6;

import android.os.RemoteException;
import i6.f;

public final class i {
    public final f f12562a;

    public i(f fVar) {
        this.f12562a = fVar;
    }

    public void a(boolean z10) {
        try {
            this.f12562a.M(z10);
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public void b(boolean z10) {
        try {
            this.f12562a.J(z10);
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f12562a.y0(z10);
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }
}
