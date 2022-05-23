package a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    public static abstract class AbstractBinderC0000a extends Binder implements a {

        public static class C0001a implements a {
            public static a f0b;
            public IBinder f1a;

            public C0001a(IBinder iBinder) {
                this.f1a = iBinder;
            }

            @Override
            public IBinder asBinder() {
                return this.f1a;
            }

            @Override
            public void r1(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1a.transact(1, obtain, null, 1) && AbstractBinderC0000a.r() != null) {
                        AbstractBinderC0000a.r().r1(str, i10, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0001a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public static a r() {
            return C0001a.f0b;
        }
    }

    void r1(String str, int i10, String str2, Notification notification);
}
