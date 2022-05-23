package y6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {
        public a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IConnectionCallbacks");
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                U0(parcel.readString(), parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IConnectionCallbacks");
                return true;
            }
        }
    }

    void U0(String str, IBinder iBinder);
}
