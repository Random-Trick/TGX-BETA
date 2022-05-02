package p034c7;

import android.content.Context;
import android.text.TextUtils;
import p163l5.C6374q;
import p163l5.C6378r;
import p163l5.C6387u;
import p232q5.C8253m;

public final class C2032i {
    public final String f7215a;
    public final String f7216b;
    public final String f7217c;
    public final String f7218d;
    public final String f7219e;
    public final String f7220f;
    public final String f7221g;

    public C2032i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C6378r.m20503n(!C8253m.m13028a(str), "ApplicationId must be set.");
        this.f7216b = str;
        this.f7215a = str2;
        this.f7217c = str3;
        this.f7218d = str4;
        this.f7219e = str5;
        this.f7220f = str6;
        this.f7221g = str7;
    }

    public static C2032i m35795a(Context context) {
        C6387u uVar = new C6387u(context);
        String a = uVar.m20486a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C2032i(a, uVar.m20486a("google_api_key"), uVar.m20486a("firebase_database_url"), uVar.m20486a("ga_trackingId"), uVar.m20486a("gcm_defaultSenderId"), uVar.m20486a("google_storage_bucket"), uVar.m20486a("project_id"));
    }

    public String m35794b() {
        return this.f7215a;
    }

    public String m35793c() {
        return this.f7216b;
    }

    public String m35792d() {
        return this.f7219e;
    }

    public String m35791e() {
        return this.f7221g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2032i)) {
            return false;
        }
        C2032i iVar = (C2032i) obj;
        return C6374q.m20524a(this.f7216b, iVar.f7216b) && C6374q.m20524a(this.f7215a, iVar.f7215a) && C6374q.m20524a(this.f7217c, iVar.f7217c) && C6374q.m20524a(this.f7218d, iVar.f7218d) && C6374q.m20524a(this.f7219e, iVar.f7219e) && C6374q.m20524a(this.f7220f, iVar.f7220f) && C6374q.m20524a(this.f7221g, iVar.f7221g);
    }

    public int hashCode() {
        return C6374q.m20523b(this.f7216b, this.f7215a, this.f7217c, this.f7218d, this.f7219e, this.f7220f, this.f7221g);
    }

    public String toString() {
        return C6374q.m20522c(this).m20521a("applicationId", this.f7216b).m20521a("apiKey", this.f7215a).m20521a("databaseUrl", this.f7217c).m20521a("gcmSenderId", this.f7219e).m20521a("storageBucket", this.f7220f).m20521a("projectId", this.f7221g).toString();
    }
}
