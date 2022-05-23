package j6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import m5.q;
import n5.a;
import n5.c;

public final class g extends a {
    public final int f15106a;
    public static final String M = g.class.getSimpleName();
    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new o();
    @RecentlyNonNull
    public static final g f15104b = new g(0);
    @RecentlyNonNull
    public static final g f15105c = new g(1);

    public g(int i10) {
        this.f15106a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f15106a == ((g) obj).f15106a;
    }

    public int hashCode() {
        return q.b(Integer.valueOf(this.f15106a));
    }

    @RecentlyNonNull
    public String toString() {
        String str;
        int i10 = this.f15106a;
        if (i10 != 0) {
            str = i10 != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i10)) : "OUTDOOR";
        } else {
            str = "DEFAULT";
        }
        return String.format("StreetViewSource:%s", str);
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f15106a);
        c.b(parcel, a10);
    }
}
