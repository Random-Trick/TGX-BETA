package i6;

import android.os.IBinder;
import android.os.Parcel;
import b6.a;
import b6.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import u5.b;

public final class n extends a implements a {
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override
    public final b G0(LatLngBounds latLngBounds, int i10, int i11, int i12) {
        Parcel r10 = r();
        c.d(r10, latLngBounds);
        r10.writeInt(i10);
        r10.writeInt(i11);
        r10.writeInt(i12);
        Parcel q10 = q(11, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    @Override
    public final b L0(CameraPosition cameraPosition) {
        Parcel r10 = r();
        c.d(r10, cameraPosition);
        Parcel q10 = q(7, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    @Override
    public final b b0(LatLng latLng) {
        Parcel r10 = r();
        c.d(r10, latLng);
        Parcel q10 = q(8, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    @Override
    public final b m1(LatLng latLng, float f10) {
        Parcel r10 = r();
        c.d(r10, latLng);
        r10.writeFloat(f10);
        Parcel q10 = q(9, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }
}
