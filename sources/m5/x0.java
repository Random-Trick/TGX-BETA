package m5;

import android.os.IBinder;
import android.os.Parcel;

public final class x0 implements n {
    public final IBinder f17277a;

    public x0(IBinder iBinder) {
        this.f17277a = iBinder;
    }

    @Override
    public final void C(m mVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                k1.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17277a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f17277a;
    }
}
