package p327x5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class C10099c {
    public static final ClassLoader f32797a = C10099c.class.getClassLoader();

    public static void m6023a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static <T extends Parcelable> T m6022b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void m6021c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
