package p007a6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class C0188a implements IInterface {
    public final IBinder f667a;
    public final String f668b;

    public C0188a(IBinder iBinder, String str) {
        this.f667a = iBinder;
        this.f668b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f667a;
    }

    public final Parcel m42130q(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f667a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel m42129s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f668b);
        return obtain;
    }

    public final void m42128t(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f667a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
