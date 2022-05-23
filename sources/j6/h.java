package j6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import n5.b;

public final class h implements Parcelable.Creator<CameraPosition> {
    @Override
    public final CameraPosition createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        float f10 = 0.0f;
        LatLng latLng = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                latLng = (LatLng) b.d(parcel, q10, LatLng.CREATOR);
            } else if (k10 == 3) {
                f10 = b.o(parcel, q10);
            } else if (k10 == 4) {
                f11 = b.o(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                f12 = b.o(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new CameraPosition(latLng, f10, f11, f12);
    }

    @Override
    public final CameraPosition[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
