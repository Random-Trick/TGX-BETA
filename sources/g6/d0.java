package g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import n5.b;

public final class d0 implements Parcelable.Creator<LocationRequest> {
    @Override
    public final LocationRequest createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        long j10 = 3600000;
        long j11 = 600000;
        long j12 = Long.MAX_VALUE;
        long j13 = 0;
        int i10 = 102;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z11 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    i10 = b.s(parcel, q10);
                    break;
                case 2:
                    j10 = b.u(parcel, q10);
                    break;
                case 3:
                    j11 = b.u(parcel, q10);
                    break;
                case 4:
                    z10 = b.l(parcel, q10);
                    break;
                case 5:
                    j12 = b.u(parcel, q10);
                    break;
                case 6:
                    i11 = b.s(parcel, q10);
                    break;
                case 7:
                    f10 = b.o(parcel, q10);
                    break;
                case 8:
                    j13 = b.u(parcel, q10);
                    break;
                case 9:
                    z11 = b.l(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new LocationRequest(i10, j10, j11, z10, j12, i11, f10, j13, z11);
    }

    @Override
    public final LocationRequest[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
