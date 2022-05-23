package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import m5.d;
import m5.q;
import n5.a;
import n5.c;

public final class v extends a {
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final String P;
    public final boolean Q;
    public boolean R;
    public String S;
    public long T;
    public final LocationRequest f584a;
    public final List<d> f585b;
    public final String f586c;
    public static final List<d> U = Collections.emptyList();
    public static final Parcelable.Creator<v> CREATOR = new w();

    public v(LocationRequest locationRequest, List<d> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.f584a = locationRequest;
        this.f585b = list;
        this.f586c = str;
        this.M = z10;
        this.N = z11;
        this.O = z12;
        this.P = str2;
        this.Q = z13;
        this.R = z14;
        this.S = str3;
        this.T = j10;
    }

    public static v b(String str, LocationRequest locationRequest) {
        return new v(locationRequest, U, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final v c(String str) {
        this.S = str;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (q.a(this.f584a, vVar.f584a) && q.a(this.f585b, vVar.f585b) && q.a(this.f586c, vVar.f586c) && this.M == vVar.M && this.N == vVar.N && this.O == vVar.O && q.a(this.P, vVar.P) && this.Q == vVar.Q && this.R == vVar.R && q.a(this.S, vVar.S)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f584a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f584a);
        if (this.f586c != null) {
            sb2.append(" tag=");
            sb2.append(this.f586c);
        }
        if (this.P != null) {
            sb2.append(" moduleId=");
            sb2.append(this.P);
        }
        if (this.S != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.S);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.M);
        sb2.append(" clients=");
        sb2.append(this.f585b);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.N);
        if (this.O) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.Q) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.R) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.o(parcel, 1, this.f584a, i10, false);
        c.t(parcel, 5, this.f585b, false);
        c.p(parcel, 6, this.f586c, false);
        c.c(parcel, 7, this.M);
        c.c(parcel, 8, this.N);
        c.c(parcel, 9, this.O);
        c.p(parcel, 10, this.P, false);
        c.c(parcel, 11, this.Q);
        c.c(parcel, 12, this.R);
        c.p(parcel, 13, this.S, false);
        c.n(parcel, 14, this.T);
        c.b(parcel, a10);
    }
}
