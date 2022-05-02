package p103h6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p007a6.C0188a;
import p007a6.C0190c;
import p272t5.AbstractC8983b;

public final class C5011r extends C0188a implements AbstractC4995e {
    public C5011r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    @Override
    public final void mo24328c() {
        m42125t(3, m42126s());
    }

    @Override
    public final void mo24327f() {
        m42125t(4, m42126s());
    }

    @Override
    public final void mo24326f1(AbstractC5009p pVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, pVar);
        m42125t(9, s);
    }

    @Override
    public final void mo24325g() {
        m42125t(5, m42126s());
    }

    @Override
    public final void mo24324i(Bundle bundle) {
        Parcel s = m42126s();
        C0190c.m42121d(s, bundle);
        m42125t(2, s);
    }

    @Override
    public final AbstractC8983b mo24323r() {
        Parcel q = m42127q(8, m42126s());
        AbstractC8983b s = AbstractC8983b.AbstractBinderC8984a.m10769s(q.readStrongBinder());
        q.recycle();
        return s;
    }
}
