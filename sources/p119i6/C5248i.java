package p119i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p176m5.C6750b;

public final class C5248i implements Parcelable.Creator<LatLngBounds> {
    @Override
    public final LatLngBounds createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 2) {
                latLng = (LatLng) C6750b.m19147d(parcel, q, LatLng.CREATOR);
            } else if (k != 3) {
                C6750b.m19128w(parcel, q);
            } else {
                latLng2 = (LatLng) C6750b.m19147d(parcel, q, LatLng.CREATOR);
            }
        }
        C6750b.m19141j(parcel, x);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override
    public final LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
