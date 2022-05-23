package i5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import n5.c;

public final class a extends n5.a {
    public static final Parcelable.Creator<a> CREATOR = new f();
    public Intent f13990a;

    public a(Intent intent) {
        this.f13990a = intent;
    }

    public final Intent b() {
        return this.f13990a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 1, this.f13990a, i10, false);
        c.b(parcel, a10);
    }
}
