package p091g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p176m5.C6750b;

public final class C4495k implements Parcelable.Creator<GoogleMapOptions> {
    @Override
    public final GoogleMapOptions createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 2:
                    b = C6750b.m19138m(parcel, q);
                    break;
                case 3:
                    b2 = C6750b.m19138m(parcel, q);
                    break;
                case 4:
                    i = C6750b.m19132s(parcel, q);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C6750b.m19147d(parcel, q, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = C6750b.m19138m(parcel, q);
                    break;
                case 7:
                    b4 = C6750b.m19138m(parcel, q);
                    break;
                case 8:
                    b5 = C6750b.m19138m(parcel, q);
                    break;
                case 9:
                    b6 = C6750b.m19138m(parcel, q);
                    break;
                case 10:
                    b7 = C6750b.m19138m(parcel, q);
                    break;
                case 11:
                    b8 = C6750b.m19138m(parcel, q);
                    break;
                case 12:
                    b9 = C6750b.m19138m(parcel, q);
                    break;
                case 13:
                default:
                    C6750b.m19128w(parcel, q);
                    break;
                case 14:
                    b10 = C6750b.m19138m(parcel, q);
                    break;
                case 15:
                    b11 = C6750b.m19138m(parcel, q);
                    break;
                case 16:
                    f = C6750b.m19135p(parcel, q);
                    break;
                case 17:
                    f2 = C6750b.m19135p(parcel, q);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C6750b.m19147d(parcel, q, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = C6750b.m19138m(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12);
    }

    @Override
    public final GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
