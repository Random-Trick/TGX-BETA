package p007a6;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class C0190c {
    public static final ClassLoader f669a = C0190c.class.getClassLoader();

    public static boolean m42124a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void m42123b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static <T extends Parcelable> T m42122c(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void m42121d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void m42120e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
