package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C2018zc extends AbstractC6749a {
    public static final Parcelable.Creator<C2018zc> CREATOR = new C1674c();
    public String f7191a;
    public String f7192b;

    public C2018zc() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 2, this.f7191a, false);
        C6752c.m19109p(parcel, 3, this.f7192b, false);
        C6752c.m19123b(parcel, a);
    }

    public C2018zc(String str, String str2) {
        this.f7191a = str;
        this.f7192b = str2;
    }
}
