package p102h5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

public interface AbstractC4959c extends IInterface {

    public static class C4960a implements AbstractC4959c {
        public final IBinder f16879a;

        public C4960a(IBinder iBinder) {
            this.f16879a = iBinder;
        }

        @Override
        public void mo24378O(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f16879a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @Override
        public IBinder asBinder() {
            return this.f16879a;
        }
    }

    void mo24378O(Message message);
}
