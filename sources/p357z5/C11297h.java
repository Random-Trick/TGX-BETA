package p357z5;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import p075f6.C4284g;

public final class C11297h extends C11283a implements AbstractC11299i {
    public C11297h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override
    public final void mo936A1(C11300i0 i0Var) {
        Parcel q = m955q();
        C11290d0.m946c(q, i0Var);
        m953t(75, q);
    }

    @Override
    public final void mo935C1(boolean z) {
        Parcel q = m955q();
        C11290d0.m948a(q, z);
        m953t(12, q);
    }

    @Override
    public final Location mo934T0() {
        Parcel s = m954s(7, m955q());
        Location location = (Location) C11290d0.m947b(s, Location.CREATOR);
        s.recycle();
        return location;
    }

    @Override
    public final void mo933Z(C4284g gVar, AbstractC11303k kVar, String str) {
        Parcel q = m955q();
        C11290d0.m946c(q, gVar);
        C11290d0.m945d(q, kVar);
        q.writeString(null);
        m953t(63, q);
    }

    @Override
    public final Location mo932m0(String str) {
        Parcel q = m955q();
        q.writeString(str);
        Parcel s = m954s(80, q);
        Location location = (Location) C11290d0.m947b(s, Location.CREATOR);
        s.recycle();
        return location;
    }

    @Override
    public final void mo931s0(C11321x xVar) {
        Parcel q = m955q();
        C11290d0.m946c(q, xVar);
        m953t(59, q);
    }
}
