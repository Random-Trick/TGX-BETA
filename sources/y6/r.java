package y6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface r extends IInterface {

    public static abstract class a extends Binder implements r {

        public static class C0252a implements r {
            public IBinder f26630a;

            public C0252a(IBinder iBinder) {
                this.f26630a = iBinder;
            }

            @Override
            public final IBinder asBinder() {
                return this.f26630a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        }

        public static r q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof r)) ? new C0252a(iBinder) : (r) queryLocalInterface;
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return true;
        }
    }
}
