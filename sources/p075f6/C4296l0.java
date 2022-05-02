package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C4296l0 implements Parcelable.Creator<C4291j> {
    @Override
    public final C4291j createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 1:
                    z = C6750b.m19139l(parcel, q);
                    break;
                case 2:
                    z2 = C6750b.m19139l(parcel, q);
                    break;
                case 3:
                    z3 = C6750b.m19139l(parcel, q);
                    break;
                case 4:
                    z4 = C6750b.m19139l(parcel, q);
                    break;
                case 5:
                    z5 = C6750b.m19139l(parcel, q);
                    break;
                case 6:
                    z6 = C6750b.m19139l(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C4291j(z, z2, z3, z4, z5, z6);
    }

    @Override
    public final C4291j[] newArray(int i) {
        return new C4291j[i];
    }
}
