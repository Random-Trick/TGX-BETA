package p000a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface AbstractC0000a extends IInterface {

    public static abstract class AbstractBinderC0001a extends Binder implements AbstractC0000a {

        public static class C0002a implements AbstractC0000a {
            public static AbstractC0000a f0b;
            public IBinder f1a;

            public C0002a(IBinder iBinder) {
                this.f1a = iBinder;
            }

            @Override
            public void mo42617G0(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (!this.f1a.transact(2, obtain, null, 1) && AbstractBinderC0001a.m42618s() != null) {
                        AbstractBinderC0001a.m42618s().mo42617G0(str, i, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override
            public IBinder asBinder() {
                return this.f1a;
            }

            @Override
            public void mo42616b0(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (!this.f1a.transact(3, obtain, null, 1) && AbstractBinderC0001a.m42618s() != null) {
                        AbstractBinderC0001a.m42618s().mo42616b0(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override
            public void mo42615s1(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1a.transact(1, obtain, null, 1) && AbstractBinderC0001a.m42618s() != null) {
                        AbstractBinderC0001a.m42618s().mo42615s1(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static AbstractC0000a m42619q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0000a)) {
                return new C0002a(iBinder);
            }
            return (AbstractC0000a) queryLocalInterface;
        }

        public static AbstractC0000a m42618s() {
            return C0002a.f0b;
        }
    }

    void mo42617G0(String str, int i, String str2);

    void mo42616b0(String str);

    void mo42615s1(String str, int i, String str2, Notification notification);
}
