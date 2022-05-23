package w5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    public final IBinder f25768a;
    public final String f25769b;

    public a(IBinder iBinder, String str) {
        this.f25768a = iBinder;
        this.f25769b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f25768a;
    }

    public final Parcel q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25769b);
        return obtain;
    }

    public final Parcel r(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f25768a.transact(2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final void t(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f25768a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void x0(int i10, Parcel parcel) {
        try {
            this.f25768a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
