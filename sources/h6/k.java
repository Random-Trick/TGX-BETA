package h6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import n5.b;

public final class k implements Parcelable.Creator<GoogleMapOptions> {
    @Override
    public final GoogleMapOptions createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        CameraPosition cameraPosition = null;
        Float f10 = null;
        Float f11 = null;
        LatLngBounds latLngBounds = null;
        byte b10 = -1;
        byte b11 = -1;
        int i10 = 0;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b20 = -1;
        byte b21 = -1;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 2:
                    b10 = b.m(parcel, q10);
                    break;
                case 3:
                    b11 = b.m(parcel, q10);
                    break;
                case 4:
                    i10 = b.s(parcel, q10);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) b.d(parcel, q10, CameraPosition.CREATOR);
                    break;
                case 6:
                    b12 = b.m(parcel, q10);
                    break;
                case 7:
                    b13 = b.m(parcel, q10);
                    break;
                case 8:
                    b14 = b.m(parcel, q10);
                    break;
                case 9:
                    b15 = b.m(parcel, q10);
                    break;
                case 10:
                    b16 = b.m(parcel, q10);
                    break;
                case 11:
                    b17 = b.m(parcel, q10);
                    break;
                case 12:
                    b18 = b.m(parcel, q10);
                    break;
                case 13:
                default:
                    b.w(parcel, q10);
                    break;
                case 14:
                    b19 = b.m(parcel, q10);
                    break;
                case 15:
                    b20 = b.m(parcel, q10);
                    break;
                case 16:
                    f10 = b.p(parcel, q10);
                    break;
                case 17:
                    f11 = b.p(parcel, q10);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) b.d(parcel, q10, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b21 = b.m(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new GoogleMapOptions(b10, b11, i10, cameraPosition, b12, b13, b14, b15, b16, b17, b18, b19, b20, f10, f11, latLngBounds, b21);
    }

    @Override
    public final GoogleMapOptions[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
