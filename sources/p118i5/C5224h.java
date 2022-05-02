package p118i5;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;
import p163l5.C6378r;
import p163l5.C6399y0;
import p232q5.C8248h;
import p232q5.C8251k;
import p232q5.C8255o;

public class C5224h {
    @Deprecated
    public static final int f17372a = 12451000;
    public static final AtomicBoolean f17373b = new AtomicBoolean();
    public static final AtomicBoolean f17374c = new AtomicBoolean();

    @Deprecated
    public static void m23578a(@RecentlyNonNull Context context) {
        if (!f17373b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @Deprecated
    public static int m23577b(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String m23576c(int i) {
        return C5217a.m23611g(i);
    }

    @RecentlyNullable
    public static Context m23575d(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public static Resources m23574e(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static int m23573f(@RecentlyNonNull Context context, int i) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C5226j.a_res_0x7f0e11fe);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f17374c.get()) {
            int a = C6399y0.m20469a(context);
            if (a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            } else if (a != f17372a) {
                throw new GooglePlayServicesIncorrectManifestValueException(a);
            }
        }
        boolean z = !C8248h.m13045e(context) && !C8248h.m13043g(context);
        C6378r.m20517a(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C5225i.m23568a(context);
            if (!C5225i.m23566c(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z) {
                    C6378r.m20507k(packageInfo);
                    if (!C5225i.m23566c(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (C8255o.m13022a(packageInfo2.versionCode) < C8255o.m13022a(i)) {
                    int i2 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 82);
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i);
                    sb2.append(" but found ");
                    sb2.append(i2);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    return 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean m23572g(@RecentlyNonNull Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m23569j(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean m23571h(@RecentlyNonNull Context context) {
        if (!C8251k.m13035c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C6378r.m20507k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean m23570i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(21)
    public static boolean m23569j(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C8251k.m13033e()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, org.thunderdog.challegram.Log.TAG_LUX);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        return applicationInfo.enabled && !m23571h(context);
    }
}
