package j6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import n5.b;

public final class i implements Parcelable.Creator<LatLngBounds> {
    @Override
    public final LatLngBounds createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                latLng = (LatLng) b.d(parcel, q10, LatLng.CREATOR);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                latLng2 = (LatLng) b.d(parcel, q10, LatLng.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override
    public final LatLngBounds[] newArray(int i10) {
        return new LatLngBounds[i10];
    }
}
