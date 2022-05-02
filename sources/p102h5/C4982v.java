package p102h5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import p232q5.C8251k;
import p261s5.C8645b;

public final class C4982v {
    public final Context f16925a;
    @GuardedBy("this")
    public int f16926b;
    @GuardedBy("this")
    public int f16927c = 0;

    public C4982v(Context context) {
        this.f16925a = context;
    }

    public final synchronized int m24344a() {
        int i = this.f16927c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f16925a.getPackageManager();
        if (C8645b.m11820a(this.f16925a).m11824a("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C8251k.m13032g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f16927c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (C8251k.m13032g()) {
                this.f16927c = 2;
            } else {
                this.f16927c = 1;
            }
            return this.f16927c;
        }
        this.f16927c = 2;
        return 2;
    }

    public final PackageInfo m24343b(String str) {
        try {
            return C8645b.m11820a(this.f16925a).m11821d(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("Metadata", sb2.toString());
            return null;
        }
    }

    public final synchronized int m24342c() {
        PackageInfo b;
        if (this.f16926b == 0 && (b = m24343b("com.google.android.gms")) != null) {
            this.f16926b = b.versionCode;
        }
        return this.f16926b;
    }
}
