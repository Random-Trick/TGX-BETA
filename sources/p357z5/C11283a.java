package p357z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class C11283a implements IInterface {
    public final IBinder f36197a;
    public final String f36198b;

    public C11283a(IBinder iBinder, String str) {
        this.f36197a = iBinder;
        this.f36198b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f36197a;
    }

    public final Parcel m955q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f36198b);
        return obtain;
    }

    public final Parcel m954s(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f36197a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void m953t(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f36197a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
