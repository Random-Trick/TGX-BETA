package b8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.Locale;
import m5.j;
import r5.k;

public class c {
    public static final j f4025a = new j("CommonUtils", "");

    @RecentlyNonNull
    public static String a(@RecentlyNonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            j jVar = f4025a;
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
            sb2.append("Exception thrown when trying to get app version ");
            sb2.append(valueOf);
            jVar.c("CommonUtils", sb2.toString());
            return "";
        }
    }

    public static String b(@RecentlyNonNull Locale locale) {
        if (k.e()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
