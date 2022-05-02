package p327x5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class C10097a implements IInterface {
    public final IBinder f32798a;
    public final String f32799b;

    public C10097a(IBinder iBinder, String str) {
        this.f32798a = iBinder;
        this.f32799b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f32798a;
    }

    public final Parcel m6026q(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f32798a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel m6025s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32799b);
        return obtain;
    }
}
