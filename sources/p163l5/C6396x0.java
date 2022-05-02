package p163l5;

import android.os.IBinder;
import android.os.Parcel;

public final class C6396x0 implements AbstractC6365n {
    public final IBinder f20042a;

    public C6396x0(IBinder iBinder) {
        this.f20042a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f20042a;
    }

    @Override
    public final void mo20474e1(AbstractC6362m mVar, C6343g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                C6358k1.m20556a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f20042a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
