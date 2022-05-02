package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C4291j extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C4291j> CREATOR = new C4296l0();
    public final boolean f14348M;
    public final boolean f14349N;
    public final boolean f14350O;
    public final boolean f14351a;
    public final boolean f14352b;
    public final boolean f14353c;

    public C4291j(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f14351a = z;
        this.f14352b = z2;
        this.f14353c = z3;
        this.f14348M = z4;
        this.f14349N = z5;
        this.f14350O = z6;
    }

    public boolean m28295b() {
        return this.f14350O;
    }

    public boolean m28294c() {
        return this.f14353c;
    }

    public boolean m28293d() {
        return this.f14348M;
    }

    public boolean m28292e() {
        return this.f14351a;
    }

    public boolean m28291f() {
        return this.f14351a || this.f14352b;
    }

    public boolean m28290g() {
        return this.f14349N;
    }

    public boolean m28289h() {
        return this.f14352b;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19122c(parcel, 1, m28292e());
        C6752c.m19122c(parcel, 2, m28289h());
        C6752c.m19122c(parcel, 3, m28294c());
        C6752c.m19122c(parcel, 4, m28293d());
        C6752c.m19122c(parcel, 5, m28290g());
        C6752c.m19122c(parcel, 6, m28295b());
        C6752c.m19123b(parcel, a);
    }
}
