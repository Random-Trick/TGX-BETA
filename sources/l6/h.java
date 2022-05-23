package l6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import k5.k;
import n5.a;
import n5.c;

public final class h extends a implements k {
    public static final Parcelable.Creator<h> CREATOR = new i();
    public final List<String> f16290a;
    public final String f16291b;

    public h(List<String> list, String str) {
        this.f16290a = list;
        this.f16291b = str;
    }

    @Override
    public final Status a() {
        if (this.f16291b != null) {
            return Status.O;
        }
        return Status.S;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 1, this.f16290a, false);
        c.p(parcel, 2, this.f16291b, false);
        c.b(parcel, a10);
    }
}
