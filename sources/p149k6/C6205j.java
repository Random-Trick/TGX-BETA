package p149k6;

import android.os.Parcel;
import android.os.Parcelable;
import p163l5.C6369o0;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C6205j extends AbstractC6749a {
    public static final Parcelable.Creator<C6205j> CREATOR = new C6206k();
    public final int f19608a;
    public final C6369o0 f19609b;

    public C6205j(int i, C6369o0 o0Var) {
        this.f19608a = i;
        this.f19609b = o0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f19608a);
        C6752c.m19110o(parcel, 2, this.f19609b, i, false);
        C6752c.m19123b(parcel, a);
    }
}
