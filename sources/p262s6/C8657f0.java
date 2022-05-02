package p262s6;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class C8657f0 {
    public static final ClassLoader f27991a = C8657f0.class.getClassLoader();

    public static Parcelable m11803a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void m11802b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void m11801c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
