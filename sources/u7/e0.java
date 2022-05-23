package u7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import d7.c;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import r5.k;

public class e0 {
    public final Context f23616a;
    @GuardedBy("this")
    public String f23617b;
    @GuardedBy("this")
    public String f23618c;
    @GuardedBy("this")
    public int f23619d;
    @GuardedBy("this")
    public int f23620e = 0;

    public e0(Context context) {
        this.f23616a = context;
    }

    public static String c(c cVar) {
        String d10 = cVar.k().d();
        if (d10 != null) {
            return d10;
        }
        String c10 = cVar.k().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        if (this.f23617b == null) {
            h();
        }
        return this.f23617b;
    }

    public synchronized String b() {
        if (this.f23618c == null) {
            h();
        }
        return this.f23618c;
    }

    public synchronized int d() {
        PackageInfo f10;
        if (this.f23619d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f23619d = f10.versionCode;
        }
        return this.f23619d;
    }

    public synchronized int e() {
        int i10 = this.f23620e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f23616a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!k.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f23620e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f23620e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (k.g()) {
            this.f23620e = 2;
            i11 = 2;
        } else {
            this.f23620e = 1;
        }
        return i11;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f23616a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseMessaging", sb2.toString());
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo f10 = f(this.f23616a.getPackageName());
        if (f10 != null) {
            this.f23617b = Integer.toString(f10.versionCode);
            this.f23618c = f10.versionName;
        }
    }
}
