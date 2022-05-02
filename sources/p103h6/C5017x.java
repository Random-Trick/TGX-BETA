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
    public final void mo24307A0(int i) {
        Parcel s = m42126s();
        s.writeInt(i);
        m42125t(16, s);
    }

    @Override
    public final void mo24306C0(AbstractC4988a0 a0Var) {
        Parcel s = m42126s();
        C0190c.m42120e(s, a0Var);
        m42125t(99, s);
    }

    @Override
    public final float mo24305D() {
        Parcel q = m42127q(3, m42126s());
        float readFloat = q.readFloat();
        q.recycle();
        return readFloat;
    }

    @Override
    public final void mo24304D1(AbstractC4996e0 e0Var) {
        Parcel s = m42126s();
        C0190c.m42120e(s, e0Var);
        m42125t(97, s);
    }

    @Override
    public final void mo24303E(AbstractC8983b bVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, bVar);
        m42125t(5, s);
    }

    @Override
    public final void mo24302F0(AbstractC8983b bVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, bVar);
        m42125t(4, s);
    }

    @Override
    public final AbstractC0196i mo24301H(C5244e eVar) {
        Parcel s = m42126s();
        C0190c.m42121d(s, eVar);
        Parcel q = m42127q(11, s);
        AbstractC0196i s2 = AbstractBinderC0195h.m42117s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    @Override
    public final void mo24300K0(AbstractC5004k kVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, kVar);
        m42125t(30, s);
    }

    @Override
    public final AbstractC4997f mo24299L0() {
        AbstractC4997f fVar;
        Parcel q = m42127q(25, m42126s());
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
    public final CameraPosition mo24298e0() {
        Parcel q = m42127q(1, m42126s());
        CameraPosition cameraPosition = (CameraPosition) C0190c.m42122c(q, CameraPosition.CREATOR);
        q.recycle();
        return cameraPosition;
    }

    @Override
    public final float mo24297i1() {
        Parcel q = m42127q(2, m42126s());
        float readFloat = q.readFloat();
        q.recycle();
        return readFloat;
    }

    @Override
    public final void mo24296l0(AbstractC4992c0 c0Var) {
        Parcel s = m42126s();
        C0190c.m42120e(s, c0Var);
        m42125t(98, s);
    }

    @Override
    public final void mo24295l1(boolean z) {
        Parcel s = m42126s();
        C0190c.m42123b(s, z);
        m42125t(22, s);
    }

    @Override
    public final void mo24294n1(AbstractC5000g0 g0Var) {
        Parcel s = m42126s();
        C0190c.m42120e(s, g0Var);
        m42125t(96, s);
    }

    @Override
    public final void mo24293r1(AbstractC5006m mVar) {
        Parcel s = m42126s();
        C0190c.m42120e(s, mVar);
        m42125t(36, s);
    }

    @Override
    public final boolean mo24292w(C5242c cVar) {
        Parcel s = m42126s();
        C0190c.m42121d(s, cVar);
        Parcel q = m42127q(91, s);
        boolean a = C0190c.m42124a(q);
        q.recycle();
        return a;
    }
}
