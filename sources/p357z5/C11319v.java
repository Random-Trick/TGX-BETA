package p357z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p163l5.C6333d;
import p163l5.C6374q;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C11319v extends AbstractC6749a {
    public final boolean f36236M;
    public final boolean f36237N;
    public final boolean f36238O;
    public final String f36239P;
    public final boolean f36240Q;
    public boolean f36241R;
    public String f36242S;
    public long f36243T;
    public final LocationRequest f36244a;
    public final List<C6333d> f36245b;
    public final String f36246c;
    public static final List<C6333d> f36235U = Collections.emptyList();
    public static final Parcelable.Creator<C11319v> CREATOR = new C11320w();

    public C11319v(LocationRequest locationRequest, List<C6333d> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.f36244a = locationRequest;
        this.f36245b = list;
        this.f36246c = str;
        this.f36236M = z;
        this.f36237N = z2;
        this.f36238O = z3;
        this.f36239P = str2;
        this.f36240Q = z4;
        this.f36241R = z5;
        this.f36242S = str3;
        this.f36243T = j;
    }

    public static C11319v m897b(String str, LocationRequest locationRequest) {
        return new C11319v(locationRequest, f36235U, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final C11319v m896c(String str) {
        this.f36242S = str;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11319v) {
            C11319v vVar = (C11319v) obj;
            if (C6374q.m20525a(this.f36244a, vVar.f36244a) && C6374q.m20525a(this.f36245b, vVar.f36245b) && C6374q.m20525a(this.f36246c, vVar.f36246c) && this.f36236M == vVar.f36236M && this.f36237N == vVar.f36237N && this.f36238O == vVar.f36238O && C6374q.m20525a(this.f36239P, vVar.f36239P) && this.f36240Q == vVar.f36240Q && this.f36241R == vVar.f36241R && C6374q.m20525a(this.f36242S, vVar.f36242S)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36244a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f36244a);
        if (this.f36246c != null) {
            sb2.append(" tag=");
            sb2.append(this.f36246c);
        }
        if (this.f36239P != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f36239P);
        }
        if (this.f36242S != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f36242S);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f36236M);
        sb2.append(" clients=");
        sb2.append(this.f36245b);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f36237N);
        if (this.f36238O) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f36240Q) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f36241R) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19111o(parcel, 1, this.f36244a, i, false);
        C6752c.m19106t(parcel, 5, this.f36245b, false);
        C6752c.m19110p(parcel, 6, this.f36246c, false);
        C6752c.m19123c(parcel, 7, this.f36236M);
        C6752c.m19123c(parcel, 8, this.f36237N);
        C6752c.m19123c(parcel, 9, this.f36238O);
        C6752c.m19110p(parcel, 10, this.f36239P, false);
        C6752c.m19123c(parcel, 11, this.f36240Q);
        C6752c.m19123c(parcel, 12, this.f36241R);
        C6752c.m19110p(parcel, 13, this.f36242S, false);
        C6752c.m19112n(parcel, 14, this.f36243T);
        C6752c.m19124b(parcel, a);
    }
}
