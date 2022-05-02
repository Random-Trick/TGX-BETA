package p299v5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class BinderC9842b extends Binder implements IInterface {
    public BinderC9842b(String str) {
        attachInterface(this, str);
    }

    public boolean mo6758G1(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
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
        return mo6758G1(i, parcel, parcel2, i2);
    }
}
