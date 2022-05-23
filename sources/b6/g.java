package b6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import u5.b;

public final class g extends a implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override
    public final int C1() {
        Parcel q10 = q(17, r());
        int readInt = q10.readInt();
        q10.recycle();
        return readInt;
    }

    @Override
    public final void I(b bVar) {
        Parcel r10 = r();
        c.e(r10, bVar);
        t(29, r10);
    }

    @Override
    public final void S(LatLng latLng) {
        Parcel r10 = r();
        c.d(r10, latLng);
        t(3, r10);
    }

    @Override
    public final b W() {
        Parcel q10 = q(30, r());
        b r10 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r10;
    }

    @Override
    public final void Y(float f10) {
        Parcel r10 = r();
        r10.writeFloat(f10);
        t(27, r10);
    }

    @Override
    public final boolean g1(i iVar) {
        Parcel r10 = r();
        c.e(r10, iVar);
        Parcel q10 = q(16, r10);
        boolean a10 = c.a(q10);
        q10.recycle();
        return a10;
    }

    @Override
    public final void p() {
        t(1, r());
    }

    @Override
    public final void q1(b bVar) {
        Parcel r10 = r();
        c.e(r10, bVar);
        t(18, r10);
    }

    @Override
    public final void w(float f10) {
        Parcel r10 = r();
        r10.writeFloat(f10);
        t(25, r10);
    }
}
