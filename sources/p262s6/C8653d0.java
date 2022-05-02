package p262s6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class C8653d0 implements IInterface {
    public final IBinder f27983a;
    public final String f27984b;

    public C8653d0(IBinder iBinder, String str) {
        this.f27983a = iBinder;
        this.f27984b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f27983a;
    }

    public final Parcel m11806q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27984b);
        return obtain;
    }

    public final void m11805s(int i, Parcel parcel) {
        try {
            this.f27983a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
