package p262s6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class C8653d0 implements IInterface {
    public final IBinder f27986a;
    public final String f27987b;

    public C8653d0(IBinder iBinder, String str) {
        this.f27986a = iBinder;
        this.f27987b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f27986a;
    }

    public final Parcel m11805q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27987b);
        return obtain;
    }

    public final void m11804s(int i, Parcel parcel) {
        try {
            this.f27986a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
