package i6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b6.a;
import b6.h;
import b6.i;
import com.google.android.gms.maps.model.CameraPosition;
import j6.c;
import j6.e;
import u5.b;

public final class x extends a implements b {
    public x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override
    public final float A() {
        Parcel q10 = q(3, r());
        float readFloat = q10.readFloat();
        q10.recycle();
        return readFloat;
    }

    @Override
    public final void D0(int i10) {
        Parcel r10 = r();
        r10.writeInt(i10);
        t(16, r10);
    }

    @Override
    public final boolean H0(c cVar) {
        Parcel r10 = r();
        b6.c.d(r10, cVar);
        Parcel q10 = q(91, r10);
        boolean a10 = b6.c.a(q10);
        q10.recycle();
        return a10;
    }

    @Override
    public final f I0() {
        f fVar;
        Parcel q10 = q(25, r());
        IBinder readStrongBinder = q10.readStrongBinder();
        if (readStrongBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof f) {
                fVar = (f) queryLocalInterface;
            } else {
                fVar = new s(readStrongBinder);
            }
        }
        q10.recycle();
        return fVar;
    }

    @Override
    public final void M0(e0 e0Var) {
        Parcel r10 = r();
        b6.c.e(r10, e0Var);
        t(97, r10);
    }

    @Override
    public final void Z(c0 c0Var) {
        Parcel r10 = r();
        b6.c.e(r10, c0Var);
        t(98, r10);
    }

    @Override
    public final void a1(k kVar) {
        Parcel r10 = r();
        b6.c.e(r10, kVar);
        t(30, r10);
    }

    @Override
    public final void b1(m mVar) {
        Parcel r10 = r();
        b6.c.e(r10, mVar);
        t(36, r10);
    }

    @Override
    public final void f0(g0 g0Var) {
        Parcel r10 = r();
        b6.c.e(r10, g0Var);
        t(96, r10);
    }

    @Override
    public final CameraPosition h0() {
        Parcel q10 = q(1, r());
        CameraPosition cameraPosition = (CameraPosition) b6.c.c(q10, CameraPosition.CREATOR);
        q10.recycle();
        return cameraPosition;
    }

    @Override
    public final float i1() {
        Parcel q10 = q(2, r());
        float readFloat = q10.readFloat();
        q10.recycle();
        return readFloat;
    }

    @Override
    public final void l0(a0 a0Var) {
        Parcel r10 = r();
        b6.c.e(r10, a0Var);
        t(99, r10);
    }

    @Override
    public final void l1(boolean z10) {
        Parcel r10 = r();
        b6.c.b(r10, z10);
        t(22, r10);
    }

    @Override
    public final i s0(e eVar) {
        Parcel r10 = r();
        b6.c.d(r10, eVar);
        Parcel q10 = q(11, r10);
        i r11 = h.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    @Override
    public final void t1(b bVar) {
        Parcel r10 = r();
        b6.c.e(r10, bVar);
        t(5, r10);
    }

    @Override
    public final void u0(b bVar) {
        Parcel r10 = r();
        b6.c.e(r10, bVar);
        t(4, r10);
    }
}
