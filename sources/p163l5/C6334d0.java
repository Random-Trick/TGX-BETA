package p163l5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import p090g5.C4477c;
import p118i5.C5223g;
import p118i5.C5226j;
import p143k0.C6037g;
import p232q5.C8248h;
import p261s5.C8645b;
import p337y0.C10329c;

public final class C6334d0 {
    @GuardedBy("sCache")
    public static final C6037g<String, String> f19900a = new C6037g<>();
    @GuardedBy("sCache")
    public static Locale f19901b;

    public static String m20618a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C4477c.f_res_0x7f0e11fb);
            case 2:
                return resources.getString(C4477c.l_res_0x7f0e1202);
            case 3:
                return resources.getString(C4477c.c_res_0x7f0e11f8);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m20610i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m20610i(context, "common_google_play_services_network_error_title");
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
                sb2.append(i);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m20610i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m20610i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String m20617b(Context context, int i) {
        String str;
        if (i == 6) {
            str = m20610i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m20618a(context, i);
        }
        return str == null ? context.getResources().getString(C4477c.h_res_0x7f0e11fd) : str;
    }

    public static String m20616c(Context context, int i) {
        Resources resources = context.getResources();
        String f = m20613f(context);
        if (i == 1) {
            return resources.getString(C4477c.e_res_0x7f0e11fa, f);
        }
        if (i == 2) {
            return C8248h.m13045e(context) ? resources.getString(C4477c.n) : resources.getString(C4477c.k_res_0x7f0e1201, f);
        }
        if (i == 3) {
            return resources.getString(C4477c.b_res_0x7f0e11f7, f);
        }
        if (i == 5) {
            return m20611h(context, "common_google_play_services_invalid_account_text", f);
        }
        if (i == 7) {
            return m20611h(context, "common_google_play_services_network_error_text", f);
        }
        if (i == 9) {
            return resources.getString(C4477c.i_res_0x7f0e11ff, f);
        }
        if (i == 20) {
            return m20611h(context, "common_google_play_services_restricted_profile_text", f);
        }
        switch (i) {
            case 16:
                return m20611h(context, "common_google_play_services_api_unavailable_text", f);
            case 17:
                return m20611h(context, "common_google_play_services_sign_in_failed_text", f);
            case 18:
                return resources.getString(C4477c.m_res_0x7f0e1203, f);
            default:
                return resources.getString(C5226j.a_res_0x7f0e11fe, f);
        }
    }

    public static String m20615d(Context context, int i) {
        if (i == 6 || i == 19) {
            return m20611h(context, "common_google_play_services_resolution_required_text", m20613f(context));
        }
        return m20616c(context, i);
    }

    public static String m20614e(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C4477c.d_res_0x7f0e11f9);
        }
        if (i == 2) {
            return resources.getString(C4477c.j_res_0x7f0e1200);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C4477c.a_res_0x7f0e11f6);
    }

    public static String m20613f(Context context) {
        String packageName = context.getPackageName();
        try {
            return C8645b.m11819a(context).m11821c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String m20612g(Context context) {
        return context.getResources().getString(C4477c.g_res_0x7f0e11fc);
    }

    public static String m20611h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m20610i(context, str);
        if (i == null) {
            i = resources.getString(C5226j.a_res_0x7f0e11fe);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    public static String m20610i(Context context, String str) {
        C6037g<String, String> gVar = f19900a;
        synchronized (gVar) {
            Locale c = C10329c.m5412a(context.getResources().getConfiguration()).m5403c(0);
            if (!c.equals(f19901b)) {
                gVar.clear();
                f19901b = c;
            }
            String str2 = gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources e = C5223g.m23580e(context);
            if (e == null) {
                return null;
            }
            int identifier = e.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = e.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
