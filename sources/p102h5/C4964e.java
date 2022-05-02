package p102h5;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import p102h5.AbstractC4959c;

public class C4964e implements Parcelable {
    public static final Parcelable.Creator<C4964e> CREATOR = new C4967g();
    public Messenger f16892a;
    public AbstractC4959c f16893b;

    public static final class C4965a extends ClassLoader {
        @Override
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return C4964e.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return C4964e.class;
        }
    }

    public C4964e(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f16892a = new Messenger(iBinder);
        } else {
            this.f16893b = new AbstractC4959c.C4960a(iBinder);
        }
    }

    public final IBinder m24363a() {
        Messenger messenger = this.f16892a;
        return messenger != null ? messenger.getBinder() : this.f16893b.asBinder();
    }

    public final void m24362b(Message message) {
        Messenger messenger = this.f16892a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f16893b.mo24377O(message);
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
            return m24363a().equals(((C4964e) obj).m24363a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m24363a().hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f16892a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f16893b.asBinder());
        }
    }
}
