package p103h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import p007a6.AbstractBinderC0195h;
import p007a6.AbstractC0196i;
import p007a6.C0188a;
import p007a6.C0190c;
import p119i6.C5242c;
import p119i6.C5244e;
import p272t5.AbstractC8983b;

public final class C5017x extends C0188a implements AbstractC4989b {
    public C5017x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override
    public final void mo24308A0(int i) {
        Parcel s = m42129s();
        s.writeInt(i);
        m42128t(16, s);
    }

    @Override
    public final void mo24307C0(AbstractC4988a0 a0Var) {
        Parcel s = m42129s();
        C0190c.m42123e(s, a0Var);
        m42128t(99, s);
    }

    @Override
    public final float mo24306D() {
        Parcel q = m42130q(3, m42129s());
        float readFloat = q.readFloat();
        q.recycle();
        return readFloat;
    }

    @Override
    public final void mo24305D1(AbstractC4996e0 e0Var) {
        Parcel s = m42129s();
        C0190c.m42123e(s, e0Var);
        m42128t(97, s);
    }

    @Override
    public final void mo24304E(AbstractC8983b bVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, bVar);
        m42128t(5, s);
    }

    @Override
    public final void mo24303F0(AbstractC8983b bVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, bVar);
        m42128t(4, s);
    }

    @Override
    public final AbstractC0196i mo24302H(C5244e eVar) {
        Parcel s = m42129s();
        C0190c.m42124d(s, eVar);
        Parcel q = m42130q(11, s);
        AbstractC0196i s2 = AbstractBinderC0195h.m42120s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    @Override
    public final void mo24301K0(AbstractC5004k kVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, kVar);
        m42128t(30, s);
    }

    @Override
    public final AbstractC4997f mo24300L0() {
        AbstractC4997f fVar;
        Parcel q = m42130q(25, m42129s());
        IBinder readStrongBinder = q.readStrongBinder();
        if (readStrongBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof AbstractC4997f) {
                fVar = (AbstractC4997f) queryLocalInterface;
            } else {
                fVar = new C5012s(readStrongBinder);
            }
        }
        q.recycle();
        return fVar;
    }

    @Override
    public final CameraPosition mo24299e0() {
        Parcel q = m42130q(1, m42129s());
        CameraPosition cameraPosition = (CameraPosition) C0190c.m42125c(q, CameraPosition.CREATOR);
        q.recycle();
        return cameraPosition;
    }

    @Override
    public final float mo24298i1() {
        Parcel q = m42130q(2, m42129s());
        float readFloat = q.readFloat();
        q.recycle();
        return readFloat;
    }

    @Override
    public final void mo24297l0(AbstractC4992c0 c0Var) {
        Parcel s = m42129s();
        C0190c.m42123e(s, c0Var);
        m42128t(98, s);
    }

    @Override
    public final void mo24296l1(boolean z) {
        Parcel s = m42129s();
        C0190c.m42126b(s, z);
        m42128t(22, s);
    }

    @Override
    public final void mo24295n1(AbstractC5000g0 g0Var) {
        Parcel s = m42129s();
        C0190c.m42123e(s, g0Var);
        m42128t(96, s);
    }

    @Override
    public final void mo24294r1(AbstractC5006m mVar) {
        Parcel s = m42129s();
        C0190c.m42123e(s, mVar);
        m42128t(36, s);
    }

    @Override
    public final boolean mo24293w(C5242c cVar) {
        Parcel s = m42129s();
        C0190c.m42124d(s, cVar);
        Parcel q = m42130q(91, s);
        boolean a = C0190c.m42127a(q);
        q.recycle();
        return a;
    }
}
