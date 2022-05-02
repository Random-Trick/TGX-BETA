package p102h5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C4955a extends AbstractC6749a {
    public static final Parcelable.Creator<C4955a> CREATOR = new C4966f();
    public Intent f16873a;

    public C4955a(Intent intent) {
        this.f16873a = intent;
    }

    public final Intent m24386b() {
        return this.f16873a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19111o(parcel, 1, this.f16873a, i, false);
        C6752c.m19124b(parcel, a);
    }
}
