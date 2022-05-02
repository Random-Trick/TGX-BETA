package p007a6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import p272t5.AbstractC8983b;

public final class C0194g extends C0188a implements AbstractC0196i {
    public C0194g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override
    public final void mo42119A(AbstractC8983b bVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, bVar);
        m42128t(18, s);
    }

    @Override
    public final void mo42118D0(AbstractC8983b bVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, bVar);
        m42128t(29, s);
    }

    @Override
    public final int mo42117E1() {
        Parcel q = m42130q(17, m42129s());
        int readInt = q.readInt();
        q.recycle();
        return readInt;
    }

    @Override
    public final void mo42116V(LatLng latLng) {
        Parcel s = m42129s();
        C0190c.m42124d(s, latLng);
        m42128t(3, s);
    }

    @Override
    public final AbstractC8983b mo42115W() {
        Parcel q = m42130q(30, m42129s());
        AbstractC8983b s = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s;
    }

    @Override
    public final void mo42114X(float f) {
        Parcel s = m42129s();
        s.writeFloat(f);
        m42128t(27, s);
    }

    @Override
    public final void mo42113p() {
        m42128t(1, m42129s());
    }

    @Override
    public final boolean mo42112q0(AbstractC0196i iVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, iVar);
        Parcel q = m42130q(16, s);
        boolean a = C0190c.m42127a(q);
        q.recycle();
        return a;
    }

    @Override
    public final void mo42111v(float f) {
        Parcel s = m42129s();
        s.writeFloat(f);
        m42128t(25, s);
    }
}
