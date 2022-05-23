package y6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        public static class C0251a implements j {
            public IBinder f26587a;

            public C0251a(IBinder iBinder) {
                this.f26587a = iBinder;
            }

            @Override
            public final IBinder a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    this.f26587a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override
            public final IBinder asBinder() {
                return this.f26587a;
            }

            @Override
            public final void d(boolean z10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z10 ? 1 : 0);
                    this.f26587a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static j q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new C0251a(iBinder) : (j) queryLocalInterface;
        }
    }

    IBinder a();

    void d(boolean z10);
}
