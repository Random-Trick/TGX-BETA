package d6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    public final IBinder f6337a;
    public final String f6338b;

    public a(IBinder iBinder, String str) {
        this.f6337a = iBinder;
        this.f6338b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f6337a;
    }

    public final Parcel q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6338b);
        return obtain;
    }

    public final Parcel r(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6337a.transact(i10, parcel, parcel, 0);
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
            this.f6337a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
