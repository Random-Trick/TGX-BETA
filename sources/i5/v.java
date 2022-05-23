package i5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import r5.k;
import t5.b;

public final class v {
    public final Context f14036a;
    @GuardedBy("this")
    public int f14037b;
    @GuardedBy("this")
    public int f14038c = 0;

    public v(Context context) {
        this.f14036a = context;
    }

    public final synchronized int a() {
        int i10 = this.f14038c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f14036a.getPackageManager();
        if (b.a(this.f14036a).a("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!k.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f14038c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (k.g()) {
                this.f14038c = 2;
            } else {
                this.f14038c = 1;
            }
            return this.f14038c;
        }
        this.f14038c = 2;
        return 2;
    }

    public final PackageInfo b(String str) {
        try {
            return b.a(this.f14036a).d(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("Metadata", sb2.toString());
            return null;
        }
    }

    public final synchronized int c() {
        PackageInfo b10;
        if (this.f14037b == 0 && (b10 = b("com.google.android.gms")) != null) {
            this.f14037b = b10.versionCode;
        }
        return this.f14037b;
    }
}
