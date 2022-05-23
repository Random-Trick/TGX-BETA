package t7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import k7.c;
import org.thunderdog.challegram.Log;

public class a {
    public final Context f22973a;
    public final SharedPreferences f22974b;
    public final c f22975c;
    public boolean f22976d = c();

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f22973a = a10;
        this.f22974b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f22975c = cVar;
    }

    public static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : q0.a.a(context);
    }

    public synchronized boolean b() {
        return this.f22976d;
    }

    public final boolean c() {
        if (this.f22974b.contains("firebase_data_collection_default_enabled")) {
            return this.f22974b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f22973a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f22973a.getPackageName(), Log.TAG_YOUTUBE)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
