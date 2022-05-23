package u7;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.messaging.c;
import d.j;
import java.util.concurrent.atomic.AtomicInteger;
import org.thunderdog.challegram.Log;
import p0.h;

public final class a {
    public static final AtomicInteger f23592a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class C0221a {
        public final h.e f23593a;
        public final String f23594b;
        public final int f23595c = 0;

        public C0221a(h.e eVar, String str, int i10) {
            this.f23593a = eVar;
            this.f23594b = str;
        }
    }

    public static PendingIntent a(Context context, c cVar, String str, PackageManager packageManager) {
        Intent f10 = f(str, cVar, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(cVar.y());
        if (q(cVar)) {
            f10.putExtra("gcm.n.analytics_data", cVar.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(Log.TAG_TDLIB_OPTIONS));
    }

    public static PendingIntent b(Context context, c cVar) {
        if (!q(cVar)) {
            return null;
        }
        return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.x()));
    }

    public static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), l(Log.TAG_TDLIB_OPTIONS));
    }

    public static C0221a d(Context context, c cVar) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return e(context, context.getPackageName(), cVar, k(context, cVar.k(), j10), context.getResources(), context.getPackageManager(), j10);
    }

    public static C0221a e(Context context, String str, c cVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        h.e eVar = new h.e(context, str2);
        String n10 = cVar.n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.q(n10);
        }
        String n11 = cVar.n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.p(n11);
            eVar.I(new h.c().h(n11));
        }
        eVar.F(m(packageManager, resources, str, cVar.p("gcm.n.icon"), bundle));
        Uri n12 = n(str, cVar, resources);
        if (n12 != null) {
            eVar.H(n12);
        }
        eVar.o(a(context, cVar, str, packageManager));
        PendingIntent b10 = b(context, cVar);
        if (b10 != null) {
            eVar.s(b10);
        }
        Integer h10 = h(context, cVar.p("gcm.n.color"), bundle);
        if (h10 != null) {
            eVar.n(h10.intValue());
        }
        eVar.k(!cVar.a("gcm.n.sticky"));
        eVar.z(cVar.a("gcm.n.local_only"));
        String p10 = cVar.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.K(p10);
        }
        Integer m10 = cVar.m();
        if (m10 != null) {
            eVar.C(m10.intValue());
        }
        Integer r10 = cVar.r();
        if (r10 != null) {
            eVar.M(r10.intValue());
        }
        Integer l10 = cVar.l();
        if (l10 != null) {
            eVar.A(l10.intValue());
        }
        Long j10 = cVar.j("gcm.n.event_time");
        if (j10 != null) {
            eVar.E(true);
            eVar.N(j10.longValue());
        }
        long[] q10 = cVar.q();
        if (q10 != null) {
            eVar.L(q10);
        }
        int[] e10 = cVar.e();
        if (e10 != null) {
            eVar.y(e10[0], e10[1], e10[2]);
        }
        eVar.r(i(cVar));
        return new C0221a(eVar, o(cVar), 0);
    }

    public static Intent f(String str, c cVar, PackageManager packageManager) {
        String p10 = cVar.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = cVar.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            android.util.Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return f23592a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 56);
                sb2.append("Color is invalid: ");
                sb2.append(str);
                sb2.append(". Notification will use default color.");
                android.util.Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(q0.a.b(context, i10));
        } catch (Resources.NotFoundException unused2) {
            android.util.Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    public static int i(c cVar) {
        boolean a10 = cVar.a("gcm.n.default_sound");
        if (cVar.a("gcm.n.default_vibrate_timings")) {
            a10 = (a10 ? 1 : 0) | true;
        }
        if (cVar.a("gcm.n.default_light_settings")) {
            return (a10 ? 1 : 0) | 4;
        }
        int i10 = a10 ? 1 : 0;
        int i11 = a10 ? 1 : 0;
        return i10;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, Log.TAG_YOUTUBE);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
            sb2.append("Couldn't get own application info: ");
            sb2.append(valueOf);
            android.util.Log.w("FirebaseMessaging", sb2.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + j.N0);
                    sb2.append("Notification Channel requested (");
                    sb2.append(str);
                    sb2.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    android.util.Log.w("FirebaseMessaging", sb2.toString());
                }
                String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (TextUtils.isEmpty(string)) {
                    android.util.Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                } else if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                } else {
                    android.util.Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        android.util.Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        str2 = "Misc";
                    } else {
                        str2 = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static int l(int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return 1140850688;
        }
        return Log.TAG_TDLIB_OPTIONS;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61);
            sb2.append("Icon resource ");
            sb2.append(str2);
            sb2.append(" not found. Notification will use default icon.");
            android.util.Log.w("FirebaseMessaging", sb2.toString());
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 35);
                sb3.append("Couldn't get own application info: ");
                sb3.append(valueOf);
                android.util.Log.w("FirebaseMessaging", sb3.toString());
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    public static Uri n(String str, c cVar, Resources resources) {
        String o10 = cVar.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if ("default".equals(o10) || resources.getIdentifier(o10, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(o10).length());
        sb2.append("android.resource://");
        sb2.append(str);
        sb2.append("/raw/");
        sb2.append(o10);
        return Uri.parse(sb2.toString());
    }

    public static String o(c cVar) {
        String p10 = cVar.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p10)) {
            return p10;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("FCM-Notification:");
        sb2.append(uptimeMillis);
        return sb2.toString();
    }

    @TargetApi(26)
    public static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb2.append(i10);
            android.util.Log.e("FirebaseMessaging", sb2.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Couldn't find resource ");
            sb3.append(i10);
            sb3.append(", treating it as an invalid icon");
            android.util.Log.e("FirebaseMessaging", sb3.toString());
            return false;
        }
    }

    public static boolean q(c cVar) {
        return cVar.a("google.c.a.e");
    }
}
