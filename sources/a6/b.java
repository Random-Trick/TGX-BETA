package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import k5.k;
import n5.a;
import n5.c;

public final class b extends a implements k {
    public final Status f556a;
    public static final b f555b = new b(Status.O);
    public static final Parcelable.Creator<b> CREATOR = new c();

    public b(Status status) {
        this.f556a = status;
    }

    @Override
    public final Status a() {
        return this.f556a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 1, this.f556a, i10, false);
        c.b(parcel, a10);
    }
}
