package j5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import m5.q;
import n5.a;

public class c extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<c> CREATOR = new n();
    public final String f15067a;
    @Deprecated
    public final int f15068b;
    public final long f15069c;

    public c(@RecentlyNonNull String str, int i10, long j10) {
        this.f15067a = str;
        this.f15068b = i10;
        this.f15069c = j10;
    }

    public c(@RecentlyNonNull String str, long j10) {
        this.f15067a = str;
        this.f15069c = j10;
        this.f15068b = -1;
    }

    @RecentlyNonNull
    public String b() {
        return this.f15067a;
    }

    public long c() {
        long j10 = this.f15069c;
        return j10 == -1 ? this.f15068b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (((b() != null && b().equals(cVar.b())) || (b() == null && cVar.b() == null)) && c() == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return q.b(b(), Long.valueOf(c()));
    }

    @RecentlyNonNull
    public final String toString() {
        q.a c10 = q.c(this);
        c10.a("name", b());
        c10.a("version", Long.valueOf(c()));
        return c10.toString();
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = n5.c.a(parcel);
        n5.c.p(parcel, 1, b(), false);
        n5.c.k(parcel, 2, this.f15068b);
        n5.c.n(parcel, 3, c());
        n5.c.b(parcel, a10);
    }
}
