package p033c6;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class C1676c1 {
    public static final ClassLoader f6149a = C1676c1.class.getClassLoader();

    public static void m36100a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void m36099b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
