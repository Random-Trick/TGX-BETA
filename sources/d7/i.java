package d7;

import android.content.Context;
import android.text.TextUtils;
import m5.q;
import m5.r;
import m5.u;
import r5.m;

public final class i {
    public final String f7222a;
    public final String f7223b;
    public final String f7224c;
    public final String f7225d;
    public final String f7226e;
    public final String f7227f;
    public final String f7228g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.n(!m.a(str), "ApplicationId must be set.");
        this.f7223b = str;
        this.f7222a = str2;
        this.f7224c = str3;
        this.f7225d = str4;
        this.f7226e = str5;
        this.f7227f = str6;
        this.f7228g = str7;
    }

    public static i a(Context context) {
        u uVar = new u(context);
        String a10 = uVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new i(a10, uVar.a("google_api_key"), uVar.a("firebase_database_url"), uVar.a("ga_trackingId"), uVar.a("gcm_defaultSenderId"), uVar.a("google_storage_bucket"), uVar.a("project_id"));
    }

    public String b() {
        return this.f7222a;
    }

    public String c() {
        return this.f7223b;
    }

    public String d() {
        return this.f7226e;
    }

    public String e() {
        return this.f7228g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return q.a(this.f7223b, iVar.f7223b) && q.a(this.f7222a, iVar.f7222a) && q.a(this.f7224c, iVar.f7224c) && q.a(this.f7225d, iVar.f7225d) && q.a(this.f7226e, iVar.f7226e) && q.a(this.f7227f, iVar.f7227f) && q.a(this.f7228g, iVar.f7228g);
    }

    public int hashCode() {
        return q.b(this.f7223b, this.f7222a, this.f7224c, this.f7225d, this.f7226e, this.f7227f, this.f7228g);
    }

    public String toString() {
        return q.c(this).a("applicationId", this.f7223b).a("apiKey", this.f7222a).a("databaseUrl", this.f7224c).a("gcmSenderId", this.f7226e).a("storageBucket", this.f7227f).a("projectId", this.f7228g).toString();
    }
}
