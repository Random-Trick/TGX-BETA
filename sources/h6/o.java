package h6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import j6.g;
import n5.b;

public final class o implements Parcelable.Creator<StreetViewPanoramaOptions> {
    @Override
    public final StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        g gVar = null;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) b.d(parcel, q10, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = b.e(parcel, q10);
                    break;
                case 4:
                    latLng = (LatLng) b.d(parcel, q10, LatLng.CREATOR);
                    break;
                case 5:
                    num = b.t(parcel, q10);
                    break;
                case 6:
                    b10 = b.m(parcel, q10);
                    break;
                case 7:
                    b11 = b.m(parcel, q10);
                    break;
                case 8:
                    b12 = b.m(parcel, q10);
                    break;
                case 9:
                    b13 = b.m(parcel, q10);
                    break;
                case 10:
                    b14 = b.m(parcel, q10);
                    break;
                case 11:
                    gVar = (g) b.d(parcel, q10, g.CREATOR);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b10, b11, b12, b13, b14, gVar);
    }

    @Override
    public final StreetViewPanoramaOptions[] newArray(int i10) {
        return new StreetViewPanoramaOptions[i10];
    }
}
