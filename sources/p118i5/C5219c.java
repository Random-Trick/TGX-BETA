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
    public String m23608b() {
        return this.f17361a;
    }

    public long m23607c() {
        long j = this.f17363c;
        return j == -1 ? this.f17362b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5219c) {
            C5219c cVar = (C5219c) obj;
            if (((m23608b() != null && m23608b().equals(cVar.m23608b())) || (m23608b() == null && cVar.m23608b() == null)) && m23607c() == cVar.m23607c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6374q.m20523b(m23608b(), Long.valueOf(m23607c()));
    }

    @RecentlyNonNull
    public final String toString() {
        C6374q.C6375a c = C6374q.m20522c(this);
        c.m20521a("name", m23608b());
        c.m20521a("version", Long.valueOf(m23607c()));
        return c.toString();
    }

    @Override
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19109p(parcel, 1, m23608b(), false);
        C6752c.m19114k(parcel, 2, this.f17362b);
        C6752c.m19111n(parcel, 3, m23607c());
        C6752c.m19123b(parcel, a);
    }
}
