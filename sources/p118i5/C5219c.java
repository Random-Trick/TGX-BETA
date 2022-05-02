package p118i5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p163l5.C6374q;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public class C5219c extends AbstractC6749a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C5219c> CREATOR = new C5230n();
    public final String f17361a;
    @Deprecated
    public final int f17362b;
    public final long f17363c;

    public C5219c(@RecentlyNonNull String str, int i, long j) {
        this.f17361a = str;
        this.f17362b = i;
        this.f17363c = j;
    }

    public C5219c(@RecentlyNonNull String str, long j) {
        this.f17361a = str;
        this.f17363c = j;
        this.f17362b = -1;
    }

    @RecentlyNonNull
    public String m23609b() {
        return this.f17361a;
    }

    public long m23608c() {
        long j = this.f17363c;
        return j == -1 ? this.f17362b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5219c) {
            C5219c cVar = (C5219c) obj;
            if (((m23609b() != null && m23609b().equals(cVar.m23609b())) || (m23609b() == null && cVar.m23609b() == null)) && m23608c() == cVar.m23608c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6374q.m20524b(m23609b(), Long.valueOf(m23608c()));
    }

    @RecentlyNonNull
    public final String toString() {
        C6374q.C6375a c = C6374q.m20523c(this);
        c.m20522a("name", m23609b());
        c.m20522a("version", Long.valueOf(m23608c()));
        return c.toString();
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19110p(parcel, 1, m23609b(), false);
        C6752c.m19115k(parcel, 2, this.f17362b);
        C6752c.m19112n(parcel, 3, m23608c());
        C6752c.m19124b(parcel, a);
    }
}
