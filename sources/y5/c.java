package y5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class c {
    public static final ClassLoader f26581a = c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static <T extends Parcelable> T b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
