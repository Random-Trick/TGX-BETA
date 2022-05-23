package y6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.net.Uri;

public final class w {
    public static final Uri f26632a = Uri.parse("http://play.google.com/store/apps/details");
    public static final String[] f26633b = {"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms", null};

    public static String a(Context context) {
        ServiceInfo serviceInfo;
        String str;
        PackageManager packageManager = context.getPackageManager();
        for (String str2 : f26633b) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(str2), 0);
            if (!(resolveService == null || (serviceInfo = resolveService.serviceInfo) == null || (str = serviceInfo.packageName) == null)) {
                return str;
            }
        }
        return packageManager.hasSystemFeature("android.software.leanback") ? "com.google.android.youtube.tv" : packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
    }

    public static boolean b(Context context, String str) {
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            if (str.equals("com.google.android.youtube.googletvdev")) {
                str = "com.google.android.youtube.googletv";
            }
            int identifier = resourcesForApplication.getIdentifier("youtube_api_version_code", "integer", str);
            return identifier == 0 || 12 > resourcesForApplication.getInteger(identifier) / 100;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext(a(context), 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int d(Context context) {
        Context c10 = c(context);
        int identifier = c10 != null ? c10.getResources().getIdentifier("clientTheme", "style", a(context)) : 0;
        if (identifier == 0) {
            return 16974120;
        }
        return identifier;
    }

    public static String e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e10);
        }
    }
}
