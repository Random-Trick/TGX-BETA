package i5;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new g();
    public Messenger f14008a;
    public c f14009b;

    public static final class a extends ClassLoader {
        @Override
        public final Class<?> loadClass(String str, boolean z10) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z10);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return e.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return e.class;
        }
    }

    public e(IBinder iBinder) {
        this.f14008a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f14008a;
        return messenger != null ? messenger.getBinder() : this.f14009b.asBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.f14008a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f14009b.O(message);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((e) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f14008a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f14009b.asBinder());
        }
    }
}
