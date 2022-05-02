package p103h6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p007a6.C0188a;
import p007a6.C0190c;
import p272t5.AbstractC8983b;

public final class C5018y extends C0188a implements AbstractC4991c {
    public C5018y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override
    public final void mo24291c() {
        m42125t(3, m42126s());
    }

    @Override
    public final void mo24290f() {
        m42125t(4, m42126s());
    }

    @Override
    public final void mo24289g() {
        m42125t(5, m42126s());
    }

    @Override
    public final void mo24288i(Bundle bundle) {
        Parcel s = m42126s();
        C0190c.m42121d(s, bundle);
        m42125t(2, s);
    }

    @Override
    public final AbstractC8983b mo24287r() {
        Parcel q = m42127q(8, m42126s());
        AbstractC8983b s = AbstractC8983b.AbstractBinderC8984a.m10769s(q.readStrongBinder());
        q.recycle();
        return s;
    }

    @Override
    public final void mo24286x1(AbstractC5002i iVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, iVar);
        m42125t(9, s);
    }
}
