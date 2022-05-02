package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1733fd implements Parcelable.Creator<C1741g6> {
    @Override
    public final C1741g6 createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        C1805ka kaVar = null;
        String str = null;
        String str2 = null;
        C1821lb[] lbVarArr = null;
        C1773i8[] i8VarArr = null;
        String[] strArr = null;
        C1693d3[] d3VarArr = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            switch (C6750b.m19141k(q)) {
                case 2:
                    kaVar = (C1805ka) C6750b.m19148d(parcel, q, C1805ka.CREATOR);
                    break;
                case 3:
                    str = C6750b.m19147e(parcel, q);
                    break;
                case 4:
                    str2 = C6750b.m19147e(parcel, q);
                    break;
                case 5:
                    lbVarArr = (C1821lb[]) C6750b.m19144h(parcel, q, C1821lb.CREATOR);
                    break;
                case 6:
                    i8VarArr = (C1773i8[]) C6750b.m19144h(parcel, q, C1773i8.CREATOR);
                    break;
                case 7:
                    strArr = C6750b.m19146f(parcel, q);
                    break;
                case 8:
                    d3VarArr = (C1693d3[]) C6750b.m19144h(parcel, q, C1693d3.CREATOR);
                    break;
                default:
                    C6750b.m19129w(parcel, q);
                    break;
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1741g6(kaVar, str, str2, lbVarArr, i8VarArr, strArr, d3VarArr);
    }

    @Override
    public final C1741g6[] newArray(int i) {
        return new C1741g6[i];
    }
}
