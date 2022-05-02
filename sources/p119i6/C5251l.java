package p119i6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p176m5.C6750b;

public final class C5251l implements Parcelable.Creator<C5244e> {
    @Override
    public final C5244e createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 2:
                    latLng = (LatLng) C6750b.m19147d(parcel, q, LatLng.CREATOR);
                    break;
                case 3:
                    str = C6750b.m19146e(parcel, q);
                    break;
                case 4:
                    str2 = C6750b.m19146e(parcel, q);
                    break;
                case 5:
                    iBinder = C6750b.m19133r(parcel, q);
                    break;
                case 6:
                    f = C6750b.m19136o(parcel, q);
                    break;
                case 7:
                    f2 = C6750b.m19136o(parcel, q);
                    break;
                case 8:
                    z = C6750b.m19139l(parcel, q);
                    break;
                case 9:
                    z2 = C6750b.m19139l(parcel, q);
                    break;
                case 10:
                    z3 = C6750b.m19139l(parcel, q);
                    break;
                case 11:
                    f3 = C6750b.m19136o(parcel, q);
                    break;
                case 12:
                    f4 = C6750b.m19136o(parcel, q);
                    break;
                case 13:
                    f5 = C6750b.m19136o(parcel, q);
                    break;
                case 14:
                    f6 = C6750b.m19136o(parcel, q);
                    break;
                case 15:
                    f7 = C6750b.m19136o(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C5244e(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }

    @Override
    public final C5244e[] newArray(int i) {
        return new C5244e[i];
    }
}
