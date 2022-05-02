package p202o6;

import android.content.Context;
import android.content.pm.PackageManager;
import p262s6.C8646a;

public final class C7775w2 {
    public static final C8646a f24889c = new C8646a("PackageStateCache");
    public final Context f24890a;
    public int f24891b = -1;

    public C7775w2(Context context) {
        this.f24890a = context;
    }

    public final synchronized int m15109a() {
        if (this.f24891b == -1) {
            try {
                this.f24891b = this.f24890a.getPackageManager().getPackageInfo(this.f24890a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f24889c.m11817b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f24891b;
    }
}
