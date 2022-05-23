package o6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import r6.c;
import t6.a;
import t6.m;
import t6.p;
import t6.r;
import w6.e;
import w6.g;

public final class u {
    public static final a f19254e = new a("AppUpdateService");
    public static final Intent f19255f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public m f19256a;
    public final String f19257b;
    public final Context f19258c;
    public final w f19259d;

    public u(Context context, w wVar) {
        this.f19257b = context.getPackageName();
        this.f19258c = context;
        this.f19259d = wVar;
        if (r.b(context)) {
            this.f19256a = new m(p.a(context), f19254e, "AppUpdateService", f19255f, o.f19244a, null);
        }
    }

    public static Bundle b(u uVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(uVar.f19258c.getPackageManager().getPackageInfo(uVar.f19258c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f19254e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putAll(c.a("app_update"));
        bundle.putInt("playcore.version.code", 11003);
        return bundle;
    }

    public static e j() {
        f19254e.b("onError(%d)", -9);
        return g.b(new com.google.android.play.core.install.a(-9));
    }

    public final e f(String str) {
        if (this.f19256a == null) {
            return j();
        }
        f19254e.d("completeUpdate(%s)", str);
        w6.p pVar = new w6.p();
        this.f19256a.q(new q(this, pVar, pVar, str), pVar);
        return pVar.a();
    }

    public final e g(String str) {
        if (this.f19256a == null) {
            return j();
        }
        f19254e.d("requestUpdateInfo(%s)", str);
        w6.p pVar = new w6.p();
        this.f19256a.q(new p(this, pVar, str, pVar), pVar);
        return pVar.a();
    }
}
