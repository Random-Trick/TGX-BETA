package p6;

import android.content.Context;
import android.content.pm.PackageManager;
import t6.a;

public final class w2 {
    public static final a f20844c = new a("PackageStateCache");
    public final Context f20845a;
    public int f20846b = -1;

    public w2(Context context) {
        this.f20845a = context;
    }

    public final synchronized int a() {
        if (this.f20846b == -1) {
            try {
                this.f20846b = this.f20845a.getPackageManager().getPackageInfo(this.f20845a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f20844c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f20846b;
    }
}
