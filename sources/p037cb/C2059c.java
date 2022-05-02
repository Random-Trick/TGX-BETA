package p037cb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import java.io.File;

public final class C2059c {
    public static boolean m35734a(Activity activity) {
        StringBuilder sb2;
        if (m35732c(activity)) {
            return true;
        }
        String str = Build.PRODUCT;
        int i = (str.contains("sdk") || str.contains("Andy") || str.contains("ttVM_Hdragon") || str.contains("google_sdk") || str.contains("Droid4X") || str.contains("nox") || str.contains("sdk_x86") || str.contains("sdk_google") || str.contains("vbox86p")) ? 1 : 0;
        String str2 = Build.MANUFACTURER;
        if (str2.equals("unknown") || str2.equals("Genymotion") || str2.contains("Andy") || str2.contains("MIT") || str2.contains("nox") || str2.contains("TiantianVM")) {
            i++;
        }
        String str3 = Build.BRAND;
        if (str3.equals("generic") || str3.equals("generic_x86") || str3.equals("TTVM") || str3.contains("Andy")) {
            i++;
        }
        String str4 = Build.DEVICE;
        if (str4.contains("generic") || str4.contains("generic_x86") || str4.contains("Andy") || str4.contains("ttVM_Hdragon") || str4.contains("Droid4X") || str4.contains("nox") || str4.contains("generic_x86_64") || str4.contains("vbox86p")) {
            i++;
        }
        String str5 = Build.MODEL;
        if (str5.equals("sdk") || str5.equals("google_sdk") || str5.contains("Droid4X") || str5.contains("TiantianVM") || str5.contains("Andy") || str5.equals("Android SDK built for x86_64") || str5.equals("Android SDK built for x86")) {
            i++;
        }
        String str6 = Build.HARDWARE;
        if (str6.equals("goldfish") || str6.equals("vbox86") || str6.contains("nox") || str6.contains("ttVM_x86")) {
            i++;
        }
        String str7 = Build.FINGERPRINT;
        if (str7.contains("generic/sdk/generic") || str7.contains("generic_x86/sdk_x86/generic_x86") || str7.contains("Andy") || str7.contains("ttVM_Hdragon") || str7.contains("generic_x86_64") || str7.contains("generic/google_sdk/generic") || str7.contains("vbox86p") || str7.contains("generic/vbox86p/vbox86p")) {
            i++;
        }
        if (i > 3) {
            return true;
        }
        try {
            sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStorageDirectory().toString());
            sb2.append(File.separatorChar);
            sb2.append("windows");
            sb2.append(File.separatorChar);
            sb2.append("BstSharedFolder");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return new File(sb2.toString()).exists();
    }

    public static boolean m35733b(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean m35732c(Context context) {
        try {
            return "true".equals(Settings.System.getString(context.getContentResolver(), "firebase.test.lab"));
        } catch (Throwable unused) {
            return false;
        }
    }
}
