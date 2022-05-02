package p119i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import p176m5.C6750b;

public final class C5247h implements Parcelable.Creator<CameraPosition> {
    @Override
    public final CameraPosition createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 2) {
                latLng = (LatLng) C6750b.m19147d(parcel, q, LatLng.CREATOR);
            } else if (k == 3) {
                f = C6750b.m19136o(parcel, q);
            } else if (k == 4) {
                f2 = C6750b.m19136o(parcel, q);
            } else if (k != 5) {
                C6750b.m19128w(parcel, q);
            } else {
                f3 = C6750b.m19136o(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new CameraPosition(latLng, f, f2, f3);
    }

    @Override
    public final CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
