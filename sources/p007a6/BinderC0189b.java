package p007a6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class BinderC0189b extends Binder implements IInterface {
    public BinderC0189b(String str) {
        attachInterface(this, str);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo24285q(i, parcel, parcel2, i2);
    }

    public boolean mo24285q(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }
}
