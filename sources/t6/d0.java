package t6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class d0 implements IInterface {
    public final IBinder f22943a;
    public final String f22944b;

    public d0(IBinder iBinder, String str) {
        this.f22943a = iBinder;
        this.f22944b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f22943a;
    }

    public final Parcel q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f22944b);
        return obtain;
    }

    public final void r(int i10, Parcel parcel) {
        try {
            this.f22943a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
