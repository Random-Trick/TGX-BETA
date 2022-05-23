package u7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.d;
import n5.b;
import n5.c;

public class f0 implements Parcelable.Creator<d> {
    public static void c(d dVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.d(parcel, 2, dVar.f5769a, false);
        c.b(parcel, a10);
    }

    public d createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            if (b.k(q10) != 2) {
                b.w(parcel, q10);
            } else {
                bundle = b.a(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new d(bundle);
    }

    public d[] newArray(int i10) {
        return new d[i10];
    }
}
