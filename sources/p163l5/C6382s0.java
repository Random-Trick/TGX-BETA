package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C6382s0 extends AbstractC6749a {
    public static final Parcelable.Creator<C6382s0> CREATOR = new C6385t0();
    @Deprecated
    public final Scope[] f20021M;
    public final int f20022a;
    public final int f20023b;
    public final int f20024c;

    public C6382s0(int i, int i2, int i3, Scope[] scopeArr) {
        this.f20022a = i;
        this.f20023b = i2;
        this.f20024c = i3;
        this.f20021M = scopeArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f20022a);
        C6752c.m19115k(parcel, 2, this.f20023b);
        C6752c.m19115k(parcel, 3, this.f20024c);
        C6752c.m19107s(parcel, 4, this.f20021M, i, false);
        C6752c.m19124b(parcel, a);
    }
}
