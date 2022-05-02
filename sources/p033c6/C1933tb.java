package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C1933tb extends AbstractC6749a {
    public static final Parcelable.Creator<C1933tb> CREATOR = new C1777ic();
    public final String f6949M;
    public final String f6950N;
    public final C1919sb f6951O;
    public final C1919sb f6952P;
    public final String f6953a;
    public final String f6954b;
    public final String f6955c;

    public C1933tb(String str, String str2, String str3, String str4, String str5, C1919sb sbVar, C1919sb sbVar2) {
        this.f6953a = str;
        this.f6954b = str2;
        this.f6955c = str3;
        this.f6949M = str4;
        this.f6950N = str5;
        this.f6951O = sbVar;
        this.f6952P = sbVar2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 1, this.f6953a, false);
        C6752c.m19109p(parcel, 2, this.f6954b, false);
        C6752c.m19109p(parcel, 3, this.f6955c, false);
        C6752c.m19109p(parcel, 4, this.f6949M, false);
        C6752c.m19109p(parcel, 5, this.f6950N, false);
        C6752c.m19110o(parcel, 6, this.f6951O, i, false);
        C6752c.m19110o(parcel, 7, this.f6952P, i, false);
        C6752c.m19123b(parcel, a);
    }
}
