package p262s6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class BinderC8655e0 extends Binder implements IInterface {
    public BinderC8655e0(String str) {
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
        return mo11748q(i, parcel, parcel2, i2);
    }

    public boolean mo11748q(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }
}
