package p133j5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p176m5.C6750b;

public final class C5884s implements Parcelable.Creator<Scope> {
    @Override
    public final Scope createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i = C6750b.m19133s(parcel, q);
            } else if (k != 2) {
                C6750b.m19129w(parcel, q);
            } else {
                str = C6750b.m19147e(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new Scope(i, str);
    }

    @Override
    public final Scope[] newArray(int i) {
        return new Scope[i];
    }
}
