package y6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {
        public a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        a();
                        break;
                    case 2:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        o(parcel.readString());
                        break;
                    case 3:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        b();
                        break;
                    case 4:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        e();
                        break;
                    case 5:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        l();
                        break;
                    case 6:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        z0(parcel.readString());
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
            return true;
        }
    }

    void a();

    void b();

    void e();

    void l();

    void o(String str);

    void z0(String str);
}
