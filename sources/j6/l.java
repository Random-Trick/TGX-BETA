package j6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import n5.b;

public final class l implements Parcelable.Creator<e> {
    @Override
    public final e createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        float f12 = 0.0f;
        float f13 = 0.5f;
        float f14 = 0.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 2:
                    latLng = (LatLng) b.d(parcel, q10, LatLng.CREATOR);
                    break;
                case 3:
                    str = b.e(parcel, q10);
                    break;
                case 4:
                    str2 = b.e(parcel, q10);
                    break;
                case 5:
                    iBinder = b.r(parcel, q10);
                    break;
                case 6:
                    f10 = b.o(parcel, q10);
                    break;
                case 7:
                    f11 = b.o(parcel, q10);
                    break;
                case 8:
                    z10 = b.l(parcel, q10);
                    break;
                case 9:
                    z11 = b.l(parcel, q10);
                    break;
                case 10:
                    z12 = b.l(parcel, q10);
                    break;
                case 11:
                    f12 = b.o(parcel, q10);
                    break;
                case 12:
                    f13 = b.o(parcel, q10);
                    break;
                case 13:
                    f14 = b.o(parcel, q10);
                    break;
                case 14:
                    f15 = b.o(parcel, q10);
                    break;
                case 15:
                    f16 = b.o(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new e(latLng, str, str2, iBinder, f10, f11, z10, z11, z12, f12, f13, f14, f15, f16);
    }

    @Override
    public final e[] newArray(int i10) {
        return new e[i10];
    }
}
