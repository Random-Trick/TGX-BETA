package p103h6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p007a6.C0188a;
import p007a6.C0190c;
import p272t5.AbstractC8983b;

public final class C5007n extends C0188a implements AbstractC4987a {
    public C5007n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override
    public final AbstractC8983b mo24334I0(LatLngBounds latLngBounds, int i, int i2, int i3) {
        Parcel s = m42129s();
        C0190c.m42124d(s, latLngBounds);
        s.writeInt(i);
        s.writeInt(i2);
        s.writeInt(i3);
        Parcel q = m42130q(11, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    @Override
    public final AbstractC8983b mo24333O0(CameraPosition cameraPosition) {
        Parcel s = m42129s();
        C0190c.m42124d(s, cameraPosition);
        Parcel q = m42130q(7, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    @Override
    public final AbstractC8983b mo24332a0(LatLng latLng) {
        Parcel s = m42129s();
        C0190c.m42124d(s, latLng);
        Parcel q = m42130q(8, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    @Override
    public final AbstractC8983b mo24331m1(LatLng latLng, float f) {
        Parcel s = m42129s();
        C0190c.m42124d(s, latLng);
        s.writeFloat(f);
        Parcel q = m42130q(9, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }
}
