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
    public static final C8646a f23119e = new C8646a("AppUpdateService");
    public static final Intent f23120f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public C8670m f23121a;
    public final String f23122b;
    public final Context f23123c;
    public final C7275w f23124d;

    public C7273u(Context context, C7275w wVar) {
        this.f23122b = context.getPackageName();
        this.f23123c = context;
        this.f23124d = wVar;
        if (C8680r.m11746b(context)) {
            this.f23121a = new C8670m(C8676p.m11763a(context), f23119e, "AppUpdateService", f23120f, C7267o.f23107a, null);
        }
    }

    public static Bundle m17177b(C7273u uVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m17170i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(uVar.f23123c.getPackageManager().getPackageInfo(uVar.f23123c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f23119e.m11816b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static Bundle m17170i() {
        Bundle bundle = new Bundle();
        bundle.putAll(C8259c.m13019a("app_update"));
        bundle.putInt("playcore.version.code", 11003);
        return bundle;
    }

    public static AbstractC9854e m17169j() {
        f23119e.m11816b("onError(%d)", -9);
        return C9856g.m6748b(new C3505a(-9));
    }

    public final AbstractC9854e m17173f(String str) {
        if (this.f23121a == null) {
            return m17169j();
        }
        f23119e.m11814d("completeUpdate(%s)", str);
        C9865p pVar = new C9865p();
        this.f23121a.m11777q(new C7269q(this, pVar, pVar, str), pVar);
        return pVar.m6735a();
    }

    public final AbstractC9854e m17172g(String str) {
        if (this.f23121a == null) {
            return m17169j();
        }
        f23119e.m11814d("requestUpdateInfo(%s)", str);
        C9865p pVar = new C9865p();
        this.f23121a.m11777q(new C7268p(this, pVar, str, pVar), pVar);
        return pVar.m6735a();
    }
}
