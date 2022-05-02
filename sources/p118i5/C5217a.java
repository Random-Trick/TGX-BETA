package p118i5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p039d.C3563j;
import p163l5.C6374q;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C5217a extends AbstractC6749a {
    public final String f17354M;
    public final int f17355a;
    public final int f17356b;
    public final PendingIntent f17357c;
    @RecentlyNonNull
    public static final C5217a f17353N = new C5217a(0);
    @RecentlyNonNull
    public static final Parcelable.Creator<C5217a> CREATOR = new C5229m();

    public C5217a(int i) {
        this(i, null, null);
    }

    public C5217a(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f17355a = i;
        this.f17356b = i2;
        this.f17357c = pendingIntent;
        this.f17354M = str;
    }

    public static String m23610g(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
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
                switch (i) {
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
                    case C3563j.f11955K3:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public int m23615b() {
        return this.f17356b;
    }

    @RecentlyNullable
    public String m23614c() {
        return this.f17354M;
    }

    @RecentlyNullable
    public PendingIntent m23613d() {
        return this.f17357c;
    }

    public boolean m23612e() {
        return (this.f17356b == 0 || this.f17357c == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5217a)) {
            return false;
        }
        C5217a aVar = (C5217a) obj;
        return this.f17356b == aVar.f17356b && C6374q.m20524a(this.f17357c, aVar.f17357c) && C6374q.m20524a(this.f17354M, aVar.f17354M);
    }

    public boolean m23611f() {
        return this.f17356b == 0;
    }

    public int hashCode() {
        return C6374q.m20523b(Integer.valueOf(this.f17356b), this.f17357c, this.f17354M);
    }

    @RecentlyNonNull
    public String toString() {
        C6374q.C6375a c = C6374q.m20522c(this);
        c.m20521a("statusCode", m23610g(this.f17356b));
        c.m20521a("resolution", this.f17357c);
        c.m20521a("message", this.f17354M);
        return c.toString();
    }

    @Override
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C6752c.m19124a(parcel);
        C6752c.m19114k(parcel, 1, this.f17355a);
        C6752c.m19114k(parcel, 2, m23615b());
        C6752c.m19110o(parcel, 3, m23613d(), i, false);
        C6752c.m19109p(parcel, 4, m23614c(), false);
        C6752c.m19123b(parcel, a);
    }

    public C5217a(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C5217a(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
