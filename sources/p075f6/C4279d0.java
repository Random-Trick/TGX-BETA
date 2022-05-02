package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import p176m5.C6750b;

public final class C4279d0 implements Parcelable.Creator<LocationRequest> {
    @Override
    public final LocationRequest createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 1:
                    i = C6750b.m19132s(parcel, q);
                    break;
                case 2:
                    j = C6750b.m19130u(parcel, q);
                    break;
                case 3:
                    j2 = C6750b.m19130u(parcel, q);
                    break;
                case 4:
                    z = C6750b.m19139l(parcel, q);
                    break;
                case 5:
                    j3 = C6750b.m19130u(parcel, q);
                    break;
                case 6:
                    i2 = C6750b.m19132s(parcel, q);
                    break;
                case 7:
                    f = C6750b.m19136o(parcel, q);
                    break;
                case 8:
                    j4 = C6750b.m19130u(parcel, q);
                    break;
                case 9:
                    z2 = C6750b.m19139l(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
    }

    @Override
    public final LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
