package p328x6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface AbstractC10141r extends IInterface {

    public static abstract class AbstractBinderC10142a extends Binder implements AbstractC10141r {

        public static class C10143a implements AbstractC10141r {
            public IBinder f32849a;

            public C10143a(IBinder iBinder) {
                this.f32849a = iBinder;
            }

            @Override
            public final IBinder asBinder() {
                return this.f32849a;
            }
        }

        public AbstractBinderC10142a() {
            attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        }

        public static AbstractC10141r m5906q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC10141r)) ? new C10143a(iBinder) : (AbstractC10141r) queryLocalInterface;
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return true;
        }
    }
}
