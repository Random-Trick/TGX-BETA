package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class gc implements Parcelable.Creator<fc> {
    @Override
    public final fc createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            if (b.k(q10) != 1) {
                b.w(parcel, q10);
            } else {
                i10 = b.s(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new fc(i10);
    }

    @Override
    public final fc[] newArray(int i10) {
        return new fc[i10];
    }
}
