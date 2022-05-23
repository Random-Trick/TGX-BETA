package m5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import n5.a;
import n5.c;

public class d extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new z();
    public final int f17169a;
    @RecentlyNullable
    public final String f17170b;

    public d(int i10, String str) {
        this.f17169a = i10;
        this.f17170b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f17169a == this.f17169a && q.a(dVar.f17170b, this.f17170b);
    }

    public final int hashCode() {
        return this.f17169a;
    }

    @RecentlyNonNull
    public final String toString() {
        int i10 = this.f17169a;
        String str = this.f17170b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
        sb2.append(i10);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f17169a);
        c.p(parcel, 2, this.f17170b, false);
        c.b(parcel, a10);
    }
}
