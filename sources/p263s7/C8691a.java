package p263s7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import org.thunderdog.challegram.Log;
import p135j7.AbstractC5895c;
import p227q0.C8117a;

public class C8691a {
    public final Context f28013a;
    public final SharedPreferences f28014b;
    public final AbstractC5895c f28015c;
    public boolean f28016d = m11728c();

    public C8691a(Context context, String str, AbstractC5895c cVar) {
        Context a = m11730a(context);
        this.f28013a = a;
        this.f28014b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f28015c = cVar;
    }

    public static Context m11730a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C8117a.m13442b(context);
    }

    public synchronized boolean m11729b() {
        return this.f28016d;
    }

    public final boolean m11728c() {
        if (this.f28014b.contains("firebase_data_collection_default_enabled")) {
            return this.f28014b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m11727d();
    }

    public final boolean m11727d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f28013a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f28013a.getPackageName(), Log.TAG_YOUTUBE)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
