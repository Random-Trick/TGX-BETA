package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public class C6384t extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C6384t> CREATOR = new C6321a1();
    public final int f20029M;
    public final int f20030N;
    public final int f20031a;
    public final boolean f20032b;
    public final boolean f20033c;

    public C6384t(int i, boolean z, boolean z2, int i2, int i3) {
        this.f20031a = i;
        this.f20032b = z;
        this.f20033c = z2;
        this.f20029M = i2;
        this.f20030N = i3;
    }

    public int m20491b() {
        return this.f20029M;
    }

    public int m20490c() {
        return this.f20030N;
    }

    public boolean m20489d() {
        return this.f20032b;
    }

    public boolean m20488e() {
        return this.f20033c;
    }

    public int m20487f() {
        return this.f20031a;
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, m20487f());
        C6752c.m19122c(parcel, 2, m20489d());
        C6752c.m19122c(parcel, 3, m20488e());
        C6752c.m19114k(parcel, 4, m20491b());
        C6752c.m19114k(parcel, 5, m20490c());
        C6752c.m19123b(parcel, a);
    }
}
