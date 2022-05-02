package p119i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import p176m5.C6750b;

public final class C5252m implements Parcelable.Creator<StreetViewPanoramaCamera> {
    @Override
    public final StreetViewPanoramaCamera createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 2) {
                f = C6750b.m19136o(parcel, q);
            } else if (k == 3) {
                f2 = C6750b.m19136o(parcel, q);
            } else if (k != 4) {
                C6750b.m19128w(parcel, q);
            } else {
                f3 = C6750b.m19136o(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new StreetViewPanoramaCamera(f, f2, f3);
    }

    @Override
    public final StreetViewPanoramaCamera[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
