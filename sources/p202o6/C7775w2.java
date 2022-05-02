package p202o6;

import android.content.Context;
import android.content.pm.PackageManager;
import p262s6.C8646a;

public final class C7775w2 {
    public static final C8646a f24892c = new C8646a("PackageStateCache");
    public final Context f24893a;
    public int f24894b = -1;

    public C7775w2(Context context) {
        this.f24893a = context;
    }

    public final synchronized int m15109a() {
        if (this.f24894b == -1) {
            try {
                this.f24894b = this.f24893a.getPackageManager().getPackageInfo(this.f24893a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f24892c.m11816b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f24894b;
    }
}
