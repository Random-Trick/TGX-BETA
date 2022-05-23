package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class fc extends a {
    public static final Parcelable.Creator<fc> CREATOR = new gc();
    public final int f6508a;

    public fc(int i10) {
        this.f6508a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f6508a);
        c.b(parcel, a10);
    }
}
