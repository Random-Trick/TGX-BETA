package b6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    public final IBinder f4012a;
    public final String f4013b;

    public a(IBinder iBinder, String str) {
        this.f4012a = iBinder;
        this.f4013b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f4012a;
    }

    public final Parcel q(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f4012a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel r() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4013b);
        return obtain;
    }

    public final void t(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4012a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
