package p262s6;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class C8657f0 {
    public static final ClassLoader f27988a = C8657f0.class.getClassLoader();

    public static Parcelable m11804a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void m11803b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void m11802c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
