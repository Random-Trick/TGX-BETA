package j5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import d.j;
import m5.q;
import n5.c;

public final class a extends n5.a {
    public final String M;
    public final int f15061a;
    public final int f15062b;
    public final PendingIntent f15063c;
    @RecentlyNonNull
    public static final a N = new a(0);
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new m();

    public a(int i10) {
        this(i10, null, null);
    }

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f15061a = i10;
        this.f15062b = i11;
        this.f15063c = pendingIntent;
        this.M = str;
    }

    public static String g(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case j.K3:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public int b() {
        return this.f15062b;
    }

    @RecentlyNullable
    public String c() {
        return this.M;
    }

    @RecentlyNullable
    public PendingIntent d() {
        return this.f15063c;
    }

    public boolean e() {
        return (this.f15062b == 0 || this.f15063c == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15062b == aVar.f15062b && q.a(this.f15063c, aVar.f15063c) && q.a(this.M, aVar.M);
    }

    public boolean f() {
        return this.f15062b == 0;
    }

    public int hashCode() {
        return q.b(Integer.valueOf(this.f15062b), this.f15063c, this.M);
    }

    @RecentlyNonNull
    public String toString() {
        q.a c10 = q.c(this);
        c10.a("statusCode", g(this.f15062b));
        c10.a("resolution", this.f15063c);
        c10.a("message", this.M);
        return c10.toString();
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f15061a);
        c.k(parcel, 2, b());
        c.o(parcel, 3, d(), i10, false);
        c.p(parcel, 4, c(), false);
        c.b(parcel, a10);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public a(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
