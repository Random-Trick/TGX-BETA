package m5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import h5.c;
import j5.j;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import k0.g;
import r5.h;
import t5.b;

public final class d0 {
    @GuardedBy("sCache")
    public static final g<String, String> f17171a = new g<>();
    @GuardedBy("sCache")
    public static Locale f17172b;

    public static String a(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(c.f_res_0x7f0e1207);
            case 2:
                return resources.getString(c.l_res_0x7f0e120e);
            case 3:
                return resources.getString(c.c_res_0x7f0e1204);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i10) {
        String str;
        if (i10 == 6) {
            str = i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = a(context, i10);
        }
        return str == null ? context.getResources().getString(c.h_res_0x7f0e1209) : str;
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String f10 = f(context);
        if (i10 == 1) {
            return resources.getString(c.e_res_0x7f0e1206, f10);
        }
        if (i10 == 2) {
            return h.e(context) ? resources.getString(c.f12523n) : resources.getString(c.k_res_0x7f0e120d, f10);
        }
        if (i10 == 3) {
            return resources.getString(c.b_res_0x7f0e1203, f10);
        }
        if (i10 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", f10);
        }
        if (i10 == 7) {
            return h(context, "common_google_play_services_network_error_text", f10);
        }
        if (i10 == 9) {
            return resources.getString(c.i_res_0x7f0e120b, f10);
        }
        if (i10 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", f10);
        }
        switch (i10) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", f10);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", f10);
            case 18:
                return resources.getString(c.m_res_0x7f0e120f, f10);
            default:
                return resources.getString(j.a_res_0x7f0e120a, f10);
        }
    }

    public static String d(Context context, int i10) {
        if (i10 == 6 || i10 == 19) {
            return h(context, "common_google_play_services_resolution_required_text", f(context));
        }
        return c(context, i10);
    }

    public static String e(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(c.d_res_0x7f0e1205);
        }
        if (i10 == 2) {
            return resources.getString(c.j_res_0x7f0e120c);
        }
        if (i10 != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(c.a_res_0x7f0e1202);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            return b.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String g(Context context) {
        return context.getResources().getString(c.g_res_0x7f0e1208);
    }

    public static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i10 = i(context, str);
        if (i10 == null) {
            i10 = resources.getString(j.a_res_0x7f0e120a);
        }
        return String.format(resources.getConfiguration().locale, i10, str2);
    }

    public static String i(Context context, String str) {
        g<String, String> gVar = f17171a;
        synchronized (gVar) {
            Locale c10 = y0.c.a(context.getResources().getConfiguration()).c(0);
            if (!c10.equals(f17172b)) {
                gVar.clear();
                f17172b = c10;
            }
            String str2 = gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources e10 = j5.g.e(context);
            if (e10 == null) {
                return null;
            }
            int identifier = e10.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = e10.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
