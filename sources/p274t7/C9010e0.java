package p274t7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import p034c7.C2021c;
import p232q5.C8251k;

public class C9010e0 {
    public final Context f28928a;
    @GuardedBy("this")
    public String f28929b;
    @GuardedBy("this")
    public String f28930c;
    @GuardedBy("this")
    public int f28931d;
    @GuardedBy("this")
    public int f28932e = 0;

    public C9010e0(Context context) {
        this.f28928a = context;
    }

    public static String m10708c(C2021c cVar) {
        String d = cVar.m35815k().m35795d();
        if (d != null) {
            return d;
        }
        String c = cVar.m35815k().m35796c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String m10710a() {
        if (this.f28929b == null) {
            m10703h();
        }
        return this.f28929b;
    }

    public synchronized String m10709b() {
        if (this.f28930c == null) {
            m10703h();
        }
        return this.f28930c;
    }

    public synchronized int m10707d() {
        PackageInfo f;
        if (this.f28931d == 0 && (f = m10705f("com.google.android.gms")) != null) {
            this.f28931d = f.versionCode;
        }
        return this.f28931d;
    }

    public synchronized int m10706e() {
        int i = this.f28932e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f28928a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!C8251k.m13031g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f28932e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f28932e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (C8251k.m13031g()) {
            this.f28932e = 2;
            i2 = 2;
        } else {
            this.f28932e = 1;
        }
        return i2;
    }

    public final PackageInfo m10705f(String str) {
        try {
            return this.f28928a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseMessaging", sb2.toString());
            return null;
        }
    }

    public boolean m10704g() {
        return m10706e() != 0;
    }

    public final synchronized void m10703h() {
        PackageInfo f = m10705f(this.f28928a.getPackageName());
        if (f != null) {
            this.f28929b = Integer.toString(f.versionCode);
            this.f28930c = f.versionName;
        }
    }
}
