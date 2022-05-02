package p149k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p176m5.C6750b;

public final class C6204i implements Parcelable.Creator<C6203h> {
    @Override
    public final C6203h createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                arrayList = C6750b.m19144g(parcel, q);
            } else if (k != 2) {
                C6750b.m19128w(parcel, q);
            } else {
                str = C6750b.m19146e(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C6203h(arrayList, str);
    }

    @Override
    public final C6203h[] newArray(int i) {
        return new C6203h[i];
    }
}
