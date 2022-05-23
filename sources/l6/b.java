package l6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import k5.k;
import n5.a;
import n5.c;

public final class b extends a implements k {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public final int f16287a;
    public int f16288b;
    public Intent f16289c;

    public b() {
        this(2, 0, null);
    }

    @Override
    public final Status a() {
        if (this.f16288b == 0) {
            return Status.O;
        }
        return Status.S;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f16287a);
        c.k(parcel, 2, this.f16288b);
        c.o(parcel, 3, this.f16289c, i10, false);
        c.b(parcel, a10);
    }

    public b(int i10, int i11, Intent intent) {
        this.f16287a = i10;
        this.f16288b = i11;
        this.f16289c = intent;
    }
}
