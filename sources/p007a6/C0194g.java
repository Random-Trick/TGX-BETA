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
    public final void mo42116A(AbstractC8983b bVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, bVar);
        m42125t(18, s);
    }

    @Override
    public final void mo42115D0(AbstractC8983b bVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, bVar);
        m42125t(29, s);
    }

    @Override
    public final int mo42114E1() {
        Parcel q = m42127q(17, m42126s());
        int readInt = q.readInt();
        q.recycle();
        return readInt;
    }

    @Override
    public final void mo42113V(LatLng latLng) {
        Parcel s = m42126s();
        C0190c.m42121d(s, latLng);
        m42125t(3, s);
    }

    @Override
    public final AbstractC8983b mo42112W() {
        Parcel q = m42127q(30, m42126s());
        AbstractC8983b s = AbstractC8983b.AbstractBinderC8984a.m10769s(q.readStrongBinder());
        q.recycle();
        return s;
    }

    @Override
    public final void mo42111X(float f) {
        Parcel s = m42126s();
        s.writeFloat(f);
        m42125t(27, s);
    }

    @Override
    public final void mo42110p() {
        m42125t(1, m42126s());
    }

    @Override
    public final boolean mo42109q0(AbstractC0196i iVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, iVar);
        Parcel q = m42127q(16, s);
        boolean a = C0190c.m42124a(q);
        q.recycle();
        return a;
    }

    @Override
    public final void mo42108v(float f) {
        Parcel s = m42126s();
        s.writeFloat(f);
        m42125t(25, s);
    }
}
