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
    public final void mo24329c() {
        m42128t(3, m42129s());
    }

    @Override
    public final void mo24328f() {
        m42128t(4, m42129s());
    }

    @Override
    public final void mo24327f1(AbstractC5009p pVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, pVar);
        m42128t(9, s);
    }

    @Override
    public final void mo24326g() {
        m42128t(5, m42129s());
    }

    @Override
    public final void mo24325i(Bundle bundle) {
        Parcel s = m42129s();
        C0190c.m42124d(s, bundle);
        m42128t(2, s);
    }

    @Override
    public final AbstractC8983b mo24324r() {
        Parcel q = m42130q(8, m42129s());
        AbstractC8983b s = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s;
    }
}
