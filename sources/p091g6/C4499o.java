package p091g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import p119i6.C5246g;
import p176m5.C6750b;

public final class C4499o implements Parcelable.Creator<StreetViewPanoramaOptions> {
    @Override
    public final StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        C5246g gVar = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) C6750b.m19147d(parcel, q, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = C6750b.m19146e(parcel, q);
                    break;
                case 4:
                    latLng = (LatLng) C6750b.m19147d(parcel, q, LatLng.CREATOR);
                    break;
                case 5:
                    num = C6750b.m19131t(parcel, q);
                    break;
                case 6:
                    b = C6750b.m19138m(parcel, q);
                    break;
                case 7:
                    b2 = C6750b.m19138m(parcel, q);
                    break;
                case 8:
                    b3 = C6750b.m19138m(parcel, q);
                    break;
                case 9:
                    b4 = C6750b.m19138m(parcel, q);
                    break;
                case 10:
                    b5 = C6750b.m19138m(parcel, q);
                    break;
                case 11:
                    gVar = (C5246g) C6750b.m19147d(parcel, q, C5246g.CREATOR);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5, gVar);
    }

    @Override
    public final StreetViewPanoramaOptions[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
