package p357z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import p163l5.C6333d;
import p176m5.C6750b;

public final class C11320w implements Parcelable.Creator<C11319v> {
    @Override
    public final C11319v createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        LocationRequest locationRequest = null;
        long j = Long.MAX_VALUE;
        ArrayList arrayList = C11319v.f36232U;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k != 1) {
                switch (k) {
                    case 5:
                        arrayList = C6750b.m19142i(parcel, q, C6333d.CREATOR);
                        continue;
                    case 6:
                        str = C6750b.m19146e(parcel, q);
                        continue;
                    case 7:
                        z = C6750b.m19139l(parcel, q);
                        continue;
                    case 8:
                        z2 = C6750b.m19139l(parcel, q);
                        continue;
                    case 9:
                        z3 = C6750b.m19139l(parcel, q);
                        continue;
                    case 10:
                        str2 = C6750b.m19146e(parcel, q);
                        continue;
                    case 11:
                        z4 = C6750b.m19139l(parcel, q);
                        continue;
                    case 12:
                        z5 = C6750b.m19139l(parcel, q);
                        continue;
                    case 13:
                        str3 = C6750b.m19146e(parcel, q);
                        continue;
                    case 14:
                        j = C6750b.m19130u(parcel, q);
                        continue;
                    default:
                        C6750b.m19128w(parcel, q);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) C6750b.m19147d(parcel, q, LocationRequest.CREATOR);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C11319v(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    @Override
    public final C11319v[] newArray(int i) {
        return new C11319v[i];
    }
}
