package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.a;
import n5.c;

public final class wb extends a {
    public static final Parcelable.Creator<wb> CREATOR = new mc();
    public final String M;
    public final int f7096a;
    public final String f7097b;
    public final String f7098c;

    public wb(int i10, String str, String str2, String str3) {
        this.f7096a = i10;
        this.f7097b = str;
        this.f7098c = str2;
        this.M = str3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f7096a);
        c.p(parcel, 2, this.f7097b, false);
        c.p(parcel, 3, this.f7098c, false);
        c.p(parcel, 4, this.M, false);
        c.b(parcel, a10);
    }
}
