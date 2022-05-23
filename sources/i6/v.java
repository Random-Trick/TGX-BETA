package i6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b6.a;
import b6.c;
import b6.e;
import b6.f;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import u5.b;

public final class v extends a implements w {
    public v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override
    public final void U(b bVar, int i10) {
        Parcel r10 = r();
        c.e(r10, bVar);
        r10.writeInt(i10);
        t(6, r10);
    }

    @Override
    public final e X(b bVar, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        e eVar;
        Parcel r10 = r();
        c.e(r10, bVar);
        c.d(r10, streetViewPanoramaOptions);
        Parcel q10 = q(7, r10);
        IBinder readStrongBinder = q10.readStrongBinder();
        if (readStrongBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (queryLocalInterface instanceof e) {
                eVar = (e) queryLocalInterface;
            } else {
                eVar = new r(readStrongBinder);
            }
        }
        q10.recycle();
        return eVar;
    }

    @Override
    public final c e1(b bVar, GoogleMapOptions googleMapOptions) {
        c cVar;
        Parcel r10 = r();
        c.e(r10, bVar);
        c.d(r10, googleMapOptions);
        Parcel q10 = q(3, r10);
        IBinder readStrongBinder = q10.readStrongBinder();
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof c) {
                cVar = (c) queryLocalInterface;
            } else {
                cVar = new y(readStrongBinder);
            }
        }
        q10.recycle();
        return cVar;
    }

    @Override
    public final a k() {
        a aVar;
        Parcel q10 = q(4, r());
        IBinder readStrongBinder = q10.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof a) {
                aVar = (a) queryLocalInterface;
            } else {
                aVar = new n(readStrongBinder);
            }
        }
        q10.recycle();
        return aVar;
    }

    @Override
    public final f v0() {
        Parcel q10 = q(5, r());
        f r10 = e.r(q10.readStrongBinder());
        q10.recycle();
        return r10;
    }
}
