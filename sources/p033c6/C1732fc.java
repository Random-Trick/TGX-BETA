package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1732fc extends AbstractC6749a {
    public static final Parcelable.Creator<C1732fc> CREATOR = new C1747gc();
    public final int f6288a;

    public C1732fc(int i) {
        this.f6288a = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f6288a);
        C6752c.m19123b(parcel, a);
    }
}
