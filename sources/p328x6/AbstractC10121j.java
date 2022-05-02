package p328x6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface AbstractC10121j extends IInterface {

    public static abstract class AbstractBinderC10122a extends Binder implements AbstractC10121j {

        public static class C10123a implements AbstractC10121j {
            public IBinder f32806a;

            public C10123a(IBinder iBinder) {
                this.f32806a = iBinder;
            }

            @Override
            public final IBinder mo5981a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    this.f32806a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override
            public final IBinder asBinder() {
                return this.f32806a;
            }

            @Override
            public final void mo5980d(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f32806a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static AbstractC10121j m5982q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC10121j)) ? new C10123a(iBinder) : (AbstractC10121j) queryLocalInterface;
        }
    }

    IBinder mo5981a();

    void mo5980d(boolean z);
}
