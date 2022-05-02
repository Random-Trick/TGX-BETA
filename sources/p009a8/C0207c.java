package p009a8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.Locale;
import p163l5.C6352j;
import p232q5.C8251k;

public class C0207c {
    public static final C6352j f681a = new C6352j("CommonUtils", "");

    @RecentlyNonNull
    public static String m42088a(@RecentlyNonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            C6352j jVar = f681a;
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
            sb2.append("Exception thrown when trying to get app version ");
            sb2.append(valueOf);
            jVar.m20570c("CommonUtils", sb2.toString());
            return "";
        }
    }

    public static String m42087b(@RecentlyNonNull Locale locale) {
        if (C8251k.m13034e()) {
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
