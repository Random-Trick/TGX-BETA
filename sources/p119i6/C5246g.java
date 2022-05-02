package p119i6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p163l5.C6374q;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C5246g extends AbstractC6749a {
    public final int f17415a;
    public static final String f17412M = C5246g.class.getSimpleName();
    @RecentlyNonNull
    public static final Parcelable.Creator<C5246g> CREATOR = new C5254o();
    @RecentlyNonNull
    public static final C5246g f17413b = new C5246g(0);
    @RecentlyNonNull
    public static final C5246g f17414c = new C5246g(1);

    public C5246g(int i) {
        this.f17415a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5246g) && this.f17415a == ((C5246g) obj).f17415a;
    }

    public int hashCode() {
        return C6374q.m20523b(Integer.valueOf(this.f17415a));
    }

    @RecentlyNonNull
    public String toString() {
        String str;
        int i = this.f17415a;
        if (i != 0) {
            str = i != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i)) : "OUTDOOR";
        } else {
            str = "DEFAULT";
        }
        return String.format("StreetViewSource:%s", str);
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 2, this.f17415a);
        C6752c.m19123b(parcel, a);
    }
}
