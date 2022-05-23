package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import m5.d;
import n5.b;

public final class w implements Parcelable.Creator<v> {
    @Override
    public final v createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        LocationRequest locationRequest = null;
        long j10 = Long.MAX_VALUE;
        ArrayList arrayList = v.U;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 != 1) {
                switch (k10) {
                    case 5:
                        arrayList = b.i(parcel, q10, d.CREATOR);
                        continue;
                    case 6:
                        str = b.e(parcel, q10);
                        continue;
                    case 7:
                        z10 = b.l(parcel, q10);
                        continue;
                    case 8:
                        z11 = b.l(parcel, q10);
                        continue;
                    case 9:
                        z12 = b.l(parcel, q10);
                        continue;
                    case 10:
                        str2 = b.e(parcel, q10);
                        continue;
                    case 11:
                        z13 = b.l(parcel, q10);
                        continue;
                    case 12:
                        z14 = b.l(parcel, q10);
                        continue;
                    case 13:
                        str3 = b.e(parcel, q10);
                        continue;
                    case 14:
                        j10 = b.u(parcel, q10);
                        continue;
                    default:
                        b.w(parcel, q10);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) b.d(parcel, q10, LocationRequest.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new v(locationRequest, arrayList, str, z10, z11, z12, str2, z13, z14, str3, j10);
    }

    @Override
    public final v[] newArray(int i10) {
        return new v[i10];
    }
}
