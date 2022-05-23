package y6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        public static class C0250a implements i {
            public IBinder f26586a;

            public C0250a(IBinder iBinder) {
                this.f26586a = iBinder;
            }

            @Override
            public final void G(e eVar, int i10, String str, String str2, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeInt(i10);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26586a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override
            public final IBinder asBinder() {
                return this.f26586a;
            }
        }

        public static i q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new C0250a(iBinder) : (i) queryLocalInterface;
        }
    }

    void G(e eVar, int i10, String str, String str2, String str3, Bundle bundle);
}
