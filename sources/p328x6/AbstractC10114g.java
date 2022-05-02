package p328x6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface AbstractC10114g extends IInterface {

    public static abstract class AbstractBinderC10115a extends Binder implements AbstractC10114g {
        public AbstractBinderC10115a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IPlaybackEventListener");
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5916a();
            } else if (i == 2) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5915b();
            } else if (i == 3) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5913e();
            } else if (i == 4) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5914d(parcel.readInt() != 0);
            } else if (i == 5) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5912m(parcel.readInt());
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IPlaybackEventListener");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void mo5916a();

    void mo5915b();

    void mo5914d(boolean z);

    void mo5913e();

    void mo5912m(int i);
}
