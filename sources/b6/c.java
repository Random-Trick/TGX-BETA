package b6;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class c {
    public static final ClassLoader f4014a = c.class.getClassLoader();

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static <T extends Parcelable> T c(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
