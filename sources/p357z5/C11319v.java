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
    public final boolean f36233M;
    public final boolean f36234N;
    public final boolean f36235O;
    public final String f36236P;
    public final boolean f36237Q;
    public boolean f36238R;
    public String f36239S;
    public long f36240T;
    public final LocationRequest f36241a;
    public final List<C6333d> f36242b;
    public final String f36243c;
    public static final List<C6333d> f36232U = Collections.emptyList();
    public static final Parcelable.Creator<C11319v> CREATOR = new C11320w();

    public C11319v(LocationRequest locationRequest, List<C6333d> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.f36241a = locationRequest;
        this.f36242b = list;
        this.f36243c = str;
        this.f36233M = z;
        this.f36234N = z2;
        this.f36235O = z3;
        this.f36236P = str2;
        this.f36237Q = z4;
        this.f36238R = z5;
        this.f36239S = str3;
        this.f36240T = j;
    }

    public static C11319v m897b(String str, LocationRequest locationRequest) {
        return new C11319v(locationRequest, f36232U, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final C11319v m896c(String str) {
        this.f36239S = str;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11319v) {
            C11319v vVar = (C11319v) obj;
            if (C6374q.m20524a(this.f36241a, vVar.f36241a) && C6374q.m20524a(this.f36242b, vVar.f36242b) && C6374q.m20524a(this.f36243c, vVar.f36243c) && this.f36233M == vVar.f36233M && this.f36234N == vVar.f36234N && this.f36235O == vVar.f36235O && C6374q.m20524a(this.f36236P, vVar.f36236P) && this.f36237Q == vVar.f36237Q && this.f36238R == vVar.f36238R && C6374q.m20524a(this.f36239S, vVar.f36239S)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36241a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f36241a);
        if (this.f36243c != null) {
            sb2.append(" tag=");
            sb2.append(this.f36243c);
        }
        if (this.f36236P != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f36236P);
        }
        if (this.f36239S != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f36239S);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f36233M);
        sb2.append(" clients=");
        sb2.append(this.f36242b);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f36234N);
        if (this.f36235O) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f36237Q) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f36238R) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19110o(parcel, 1, this.f36241a, i, false);
        C6752c.m19105t(parcel, 5, this.f36242b, false);
        C6752c.m19109p(parcel, 6, this.f36243c, false);
        C6752c.m19122c(parcel, 7, this.f36233M);
        C6752c.m19122c(parcel, 8, this.f36234N);
        C6752c.m19122c(parcel, 9, this.f36235O);
        C6752c.m19109p(parcel, 10, this.f36236P, false);
        C6752c.m19122c(parcel, 11, this.f36237Q);
        C6752c.m19122c(parcel, 12, this.f36238R);
        C6752c.m19109p(parcel, 13, this.f36239S, false);
        C6752c.m19111n(parcel, 14, this.f36240T);
        C6752c.m19123b(parcel, a);
    }
}
