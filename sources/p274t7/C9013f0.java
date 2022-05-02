package p274t7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C3528d;
import p176m5.C6750b;
import p176m5.C6752c;

public class C9013f0 implements Parcelable.Creator<C3528d> {
    public static void m10692c(C3528d dVar, Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19121d(parcel, 2, dVar.f11773a, false);
        C6752c.m19123b(parcel, a);
    }

    public C3528d createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            if (C6750b.m19140k(q) != 2) {
                C6750b.m19128w(parcel, q);
            } else {
                bundle = C6750b.m19150a(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C3528d(bundle);
    }

    public C3528d[] newArray(int i) {
        return new C3528d[i];
    }
}
