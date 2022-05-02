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
    public final void mo24292c() {
        m42128t(3, m42129s());
    }

    @Override
    public final void mo24291f() {
        m42128t(4, m42129s());
    }

    @Override
    public final void mo24290g() {
        m42128t(5, m42129s());
    }

    @Override
    public final void mo24289i(Bundle bundle) {
        Parcel s = m42129s();
        C0190c.m42124d(s, bundle);
        m42128t(2, s);
    }

    @Override
    public final AbstractC8983b mo24288r() {
        Parcel q = m42130q(8, m42129s());
        AbstractC8983b s = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s;
    }

    @Override
    public final void mo24287x1(AbstractC5002i iVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, iVar);
        m42128t(9, s);
    }
}
