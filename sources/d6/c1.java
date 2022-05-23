package d6;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class c1 {
    public static final ClassLoader f6397a = c1.class.getClassLoader();

    public static void a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
