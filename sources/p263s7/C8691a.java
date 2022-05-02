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
    public final Context f28016a;
    public final SharedPreferences f28017b;
    public final AbstractC5895c f28018c;
    public boolean f28019d = m11727c();

    public C8691a(Context context, String str, AbstractC5895c cVar) {
        Context a = m11729a(context);
        this.f28016a = a;
        this.f28017b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f28018c = cVar;
    }

    public static Context m11729a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C8117a.m13441b(context);
    }

    public synchronized boolean m11728b() {
        return this.f28019d;
    }

    public final boolean m11727c() {
        if (this.f28017b.contains("firebase_data_collection_default_enabled")) {
            return this.f28017b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m11726d();
    }

    public final boolean m11726d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f28016a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f28016a.getPackageName(), Log.TAG_YOUTUBE)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
