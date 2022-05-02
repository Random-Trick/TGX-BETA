package p189n6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.install.C3505a;
import p233q6.C8259c;
import p262s6.C8646a;
import p262s6.C8670m;
import p262s6.C8676p;
import p262s6.C8680r;
import p300v6.AbstractC9854e;
import p300v6.C9856g;
import p300v6.C9865p;

public final class C7273u {
    public static final C8646a f23116e = new C8646a("AppUpdateService");
    public static final Intent f23117f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public C8670m f23118a;
    public final String f23119b;
    public final Context f23120c;
    public final C7275w f23121d;

    public C7273u(Context context, C7275w wVar) {
        this.f23119b = context.getPackageName();
        this.f23120c = context;
        this.f23121d = wVar;
        if (C8680r.m11747b(context)) {
            this.f23118a = new C8670m(C8676p.m11764a(context), f23116e, "AppUpdateService", f23117f, C7267o.f23104a, null);
        }
    }

    public static Bundle m17177b(C7273u uVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m17170i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(uVar.f23120c.getPackageManager().getPackageInfo(uVar.f23120c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f23116e.m11817b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static Bundle m17170i() {
        Bundle bundle = new Bundle();
        bundle.putAll(C8259c.m13020a("app_update"));
        bundle.putInt("playcore.version.code", 11003);
        return bundle;
    }

    public static AbstractC9854e m17169j() {
        f23116e.m11817b("onError(%d)", -9);
        return C9856g.m6748b(new C3505a(-9));
    }

    public final AbstractC9854e m17173f(String str) {
        if (this.f23118a == null) {
            return m17169j();
        }
        f23116e.m11815d("completeUpdate(%s)", str);
        C9865p pVar = new C9865p();
        this.f23118a.m11778q(new C7269q(this, pVar, pVar, str), pVar);
        return pVar.m6735a();
    }

    public final AbstractC9854e m17172g(String str) {
        if (this.f23118a == null) {
            return m17169j();
        }
        f23116e.m11815d("requestUpdateInfo(%s)", str);
        C9865p pVar = new C9865p();
        this.f23118a.m11778q(new C7268p(this, pVar, str, pVar), pVar);
        return pVar.m6735a();
    }
}
