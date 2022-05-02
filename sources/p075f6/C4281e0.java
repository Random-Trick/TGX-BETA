package p075f6;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import p176m5.C6750b;

public final class C4281e0 implements Parcelable.Creator<LocationResult> {
    @Override
    public final LocationResult createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        List<Location> list = LocationResult.f11635b;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            if (C6750b.m19140k(q) != 1) {
                C6750b.m19128w(parcel, q);
            } else {
                list = C6750b.m19142i(parcel, q, Location.CREATOR);
            }
        }
        C6750b.m19141j(parcel, x);
        return new LocationResult(list);
    }

    @Override
    public final LocationResult[] newArray(int i) {
        return new LocationResult[i];
    }
}
