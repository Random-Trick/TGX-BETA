package p149k6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p133j5.AbstractC5876k;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C6197b extends AbstractC6749a implements AbstractC5876k {
    public static final Parcelable.Creator<C6197b> CREATOR = new C6198c();
    public final int f19603a;
    public int f19604b;
    public Intent f19605c;

    public C6197b() {
        this(2, 0, null);
    }

    @Override
    public final Status mo952a() {
        if (this.f19604b == 0) {
            return Status.f11569O;
        }
        return Status.f11573S;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f19603a);
        C6752c.m19114k(parcel, 2, this.f19604b);
        C6752c.m19110o(parcel, 3, this.f19605c, i, false);
        C6752c.m19123b(parcel, a);
    }

    public C6197b(int i, int i2, Intent intent) {
        this.f19603a = i;
        this.f19604b = i2;
        this.f19605c = intent;
    }
}
