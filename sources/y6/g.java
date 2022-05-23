package y6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface g extends IInterface {

    public static abstract class a extends Binder implements g {
        public a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IPlaybackEventListener");
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                a();
            } else if (i10 == 2) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                b();
            } else if (i10 == 3) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                e();
            } else if (i10 == 4) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                d(parcel.readInt() != 0);
            } else if (i10 == 5) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                m(parcel.readInt());
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IPlaybackEventListener");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a();

    void b();

    void d(boolean z10);

    void e();

    void m(int i10);
}
