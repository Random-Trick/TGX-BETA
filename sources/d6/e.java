package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new f();
    public int f6465a;
    public boolean f6466b;

    public e() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f6465a);
        c.c(parcel, 3, this.f6466b);
        c.b(parcel, a10);
    }

    public e(int i10, boolean z10) {
        this.f6465a = i10;
        this.f6466b = z10;
    }
}
