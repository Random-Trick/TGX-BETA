package p102h5;

import android.os.Parcel;
import android.os.Parcelable;

public final class C4967g implements Parcelable.Creator<C4964e> {
    @Override
    public final C4964e createFromParcel(Parcel parcel) {
        return new C4964e(parcel.readStrongBinder());
    }

    @Override
    public final C4964e[] newArray(int i) {
        return new C4964e[i];
    }
}
