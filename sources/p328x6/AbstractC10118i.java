package p328x6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface AbstractC10118i extends IInterface {

    public static abstract class AbstractBinderC10119a extends Binder implements AbstractC10118i {

        public static class C10120a implements AbstractC10118i {
            public IBinder f32805a;

            public C10120a(IBinder iBinder) {
                this.f32805a = iBinder;
            }

            @Override
            public final IBinder asBinder() {
                return this.f32805a;
            }

            @Override
            public final void mo5983y(AbstractC10109e eVar, int i, String str, String str2, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f32805a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static AbstractC10118i m5984q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC10118i)) ? new C10120a(iBinder) : (AbstractC10118i) queryLocalInterface;
        }
    }

    void mo5983y(AbstractC10109e eVar, int i, String str, String str2, String str3, Bundle bundle);
}
