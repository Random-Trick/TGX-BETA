package g6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import n5.a;
import n5.c;

public final class j extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<j> CREATOR = new l0();
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean f12123a;
    public final boolean f12124b;
    public final boolean f12125c;

    public j(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f12123a = z10;
        this.f12124b = z11;
        this.f12125c = z12;
        this.M = z13;
        this.N = z14;
        this.O = z15;
    }

    public boolean b() {
        return this.O;
    }

    public boolean c() {
        return this.f12125c;
    }

    public boolean d() {
        return this.M;
    }

    public boolean e() {
        return this.f12123a;
    }

    public boolean f() {
        return this.f12123a || this.f12124b;
    }

    public boolean g() {
        return this.N;
    }

    public boolean h() {
        return this.f12124b;
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, e());
        c.c(parcel, 2, h());
        c.c(parcel, 3, c());
        c.c(parcel, 4, d());
        c.c(parcel, 5, g());
        c.c(parcel, 6, b());
        c.b(parcel, a10);
    }
}
