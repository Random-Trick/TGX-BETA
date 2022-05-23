package g6;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import n5.b;

public final class e0 implements Parcelable.Creator<LocationResult> {
    @Override
    public final LocationResult createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        List<Location> list = LocationResult.f5681b;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            if (b.k(q10) != 1) {
                b.w(parcel, q10);
            } else {
                list = b.i(parcel, q10, Location.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new LocationResult(list);
    }

    @Override
    public final LocationResult[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
