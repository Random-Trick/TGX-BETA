package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public class C6333d extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C6333d> CREATOR = new C6400z();
    public final int f19898a;
    @RecentlyNullable
    public final String f19899b;

    public C6333d(int i, String str) {
        this.f19898a = i;
        this.f19899b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6333d)) {
            return false;
        }
        C6333d dVar = (C6333d) obj;
        return dVar.f19898a == this.f19898a && C6374q.m20524a(dVar.f19899b, this.f19899b);
    }

    public final int hashCode() {
        return this.f19898a;
    }

    @RecentlyNonNull
    public final String toString() {
        int i = this.f19898a;
        String str = this.f19899b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
        sb2.append(i);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f19898a);
        C6752c.m19109p(parcel, 2, this.f19899b, false);
        C6752c.m19123b(parcel, a);
    }
}
