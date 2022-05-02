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
        C6378r.m20504n(!C8253m.m13027a(str), "ApplicationId must be set.");
        this.f7216b = str;
        this.f7215a = str2;
        this.f7217c = str3;
        this.f7218d = str4;
        this.f7219e = str5;
        this.f7220f = str6;
        this.f7221g = str7;
    }

    public static C2032i m35798a(Context context) {
        C6387u uVar = new C6387u(context);
        String a = uVar.m20487a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C2032i(a, uVar.m20487a("google_api_key"), uVar.m20487a("firebase_database_url"), uVar.m20487a("ga_trackingId"), uVar.m20487a("gcm_defaultSenderId"), uVar.m20487a("google_storage_bucket"), uVar.m20487a("project_id"));
    }

    public String m35797b() {
        return this.f7215a;
    }

    public String m35796c() {
        return this.f7216b;
    }

    public String m35795d() {
        return this.f7219e;
    }

    public String m35794e() {
        return this.f7221g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2032i)) {
            return false;
        }
        C2032i iVar = (C2032i) obj;
        return C6374q.m20525a(this.f7216b, iVar.f7216b) && C6374q.m20525a(this.f7215a, iVar.f7215a) && C6374q.m20525a(this.f7217c, iVar.f7217c) && C6374q.m20525a(this.f7218d, iVar.f7218d) && C6374q.m20525a(this.f7219e, iVar.f7219e) && C6374q.m20525a(this.f7220f, iVar.f7220f) && C6374q.m20525a(this.f7221g, iVar.f7221g);
    }

    public int hashCode() {
        return C6374q.m20524b(this.f7216b, this.f7215a, this.f7217c, this.f7218d, this.f7219e, this.f7220f, this.f7221g);
    }

    public String toString() {
        return C6374q.m20523c(this).m20522a("applicationId", this.f7216b).m20522a("apiKey", this.f7215a).m20522a("databaseUrl", this.f7217c).m20522a("gcmSenderId", this.f7219e).m20522a("storageBucket", this.f7220f).m20522a("projectId", this.f7221g).toString();
    }
}
