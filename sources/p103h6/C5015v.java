package p103h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import p007a6.AbstractBinderC0192e;
import p007a6.AbstractC0193f;
import p007a6.C0188a;
import p007a6.C0190c;
import p272t5.AbstractC8983b;

public final class C5015v extends C0188a implements AbstractC5016w {
    public C5015v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override
    public final AbstractC4995e mo24312B0(AbstractC8983b bVar, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        AbstractC4995e eVar;
        Parcel s = m42126s();
        C0190c.m42120e(s, bVar);
        C0190c.m42121d(s, streetViewPanoramaOptions);
        Parcel q = m42127q(7, s);
        IBinder readStrongBinder = q.readStrongBinder();
        if (readStrongBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (queryLocalInterface instanceof AbstractC4995e) {
                eVar = (AbstractC4995e) queryLocalInterface;
            } else {
                eVar = new C5011r(readStrongBinder);
            }
        }
        q.recycle();
        return eVar;
    }

    @Override
    public final void mo24311a1(AbstractC8983b bVar, int i) {
        Parcel s = m42126s();
        C0190c.m42120e(s, bVar);
        s.writeInt(i);
        m42125t(6, s);
    }

    @Override
    public final AbstractC4991c mo24310g1(AbstractC8983b bVar, GoogleMapOptions googleMapOptions) {
        AbstractC4991c cVar;
        Parcel s = m42126s();
        C0190c.m42120e(s, bVar);
        C0190c.m42121d(s, googleMapOptions);
        Parcel q = m42127q(3, s);
        IBinder readStrongBinder = q.readStrongBinder();
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof AbstractC4991c) {
                cVar = (AbstractC4991c) queryLocalInterface;
            } else {
                cVar = new C5018y(readStrongBinder);
            }
        }
        q.recycle();
        return cVar;
    }

    @Override
    public final AbstractC4987a mo24309k() {
        AbstractC4987a aVar;
        Parcel q = m42127q(4, m42126s());
        IBinder readStrongBinder = q.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof AbstractC4987a) {
                aVar = (AbstractC4987a) queryLocalInterface;
            } else {
                aVar = new C5007n(readStrongBinder);
            }
        }
        q.recycle();
        return aVar;
    }

    @Override
    public final AbstractC0193f mo24308t0() {
        Parcel q = m42127q(5, m42126s());
        AbstractC0193f s = AbstractBinderC0192e.m42119s(q.readStrongBinder());
        q.recycle();
        return s;
    }
}
