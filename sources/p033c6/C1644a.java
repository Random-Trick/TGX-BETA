package p033c6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class C1644a implements IInterface {
    public final IBinder f6063a;
    public final String f6064b;

    public C1644a(IBinder iBinder, String str) {
        this.f6063a = iBinder;
        this.f6064b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f6063a;
    }

    public final Parcel m36124q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6064b);
        return obtain;
    }

    public final Parcel m36123s(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6063a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void m36122t(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6063a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
