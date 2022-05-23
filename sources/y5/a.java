package y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    public final IBinder f26579a;
    public final String f26580b;

    public a(IBinder iBinder, String str) {
        this.f26579a = iBinder;
        this.f26580b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f26579a;
    }

    public final Parcel q(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f26579a.transact(i10, parcel, parcel, 0);
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
        obtain.writeInterfaceToken(this.f26580b);
        return obtain;
    }
}
