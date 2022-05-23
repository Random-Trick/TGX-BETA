package i5;

import android.os.Parcel;
import android.os.Parcelable;

public final class g implements Parcelable.Creator<e> {
    @Override
    public final e createFromParcel(Parcel parcel) {
        return new e(parcel.readStrongBinder());
    }

    @Override
    public final e[] newArray(int i10) {
        return new e[i10];
    }
}
