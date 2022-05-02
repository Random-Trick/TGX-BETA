package p274t7;

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
import com.google.firebase.messaging.C3527c;
import java.util.concurrent.atomic.AtomicInteger;
import org.thunderdog.challegram.Log;
import p039d.C3563j;
import p213p0.C7956h;
import p227q0.C8117a;

public final class C9000a {
    public static final AtomicInteger f28904a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class C9001a {
        public final C7956h.C7965e f28905a;
        public final String f28906b;
        public final int f28907c = 0;

        public C9001a(C7956h.C7965e eVar, String str, int i) {
            this.f28905a = eVar;
            this.f28906b = str;
        }
    }

    public static PendingIntent m10748a(Context context, C3527c cVar, String str, PackageManager packageManager) {
        Intent f = m10743f(str, cVar, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(cVar.m30147y());
        if (m10732q(cVar)) {
            f.putExtra("gcm.n.analytics_data", cVar.m30148x());
        }
        return PendingIntent.getActivity(context, m10742g(), f, m10737l(Log.TAG_TDLIB_OPTIONS));
    }

    public static PendingIntent m10747b(Context context, C3527c cVar) {
        if (!m10732q(cVar)) {
            return null;
        }
        return m10746c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.m30148x()));
    }

    public static PendingIntent m10746c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m10742g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m10737l(Log.TAG_TDLIB_OPTIONS));
    }

    public static C9001a m10745d(Context context, C3527c cVar) {
        Bundle j = m10739j(context.getPackageManager(), context.getPackageName());
        return m10744e(context, context.getPackageName(), cVar, m10738k(context, cVar.m30161k(), j), context.getResources(), context.getPackageManager(), j);
    }

    public static C9001a m10744e(Context context, String str, C3527c cVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        C7956h.C7965e eVar = new C7956h.C7965e(context, str2);
        String n = cVar.m30158n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.m13945q(n);
        }
        String n2 = cVar.m30158n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.m13946p(n2);
            eVar.m13967I(new C7956h.C7963c().m13977h(n2));
        }
        eVar.m13970F(m10736m(packageManager, resources, str, cVar.m30156p("gcm.n.icon"), bundle));
        Uri n3 = m10735n(str, cVar, resources);
        if (n3 != null) {
            eVar.m13968H(n3);
        }
        eVar.m13947o(m10748a(context, cVar, str, packageManager));
        PendingIntent b = m10747b(context, cVar);
        if (b != null) {
            eVar.m13943s(b);
        }
        Integer h = m10741h(context, cVar.m30156p("gcm.n.color"), bundle);
        if (h != null) {
            eVar.m13948n(h.intValue());
        }
        eVar.m13951k(!cVar.m30171a("gcm.n.sticky"));
        eVar.m13936z(cVar.m30171a("gcm.n.local_only"));
        String p = cVar.m30156p("gcm.n.ticker");
        if (p != null) {
            eVar.m13965K(p);
        }
        Integer m = cVar.m30159m();
        if (m != null) {
            eVar.m13973C(m.intValue());
        }
        Integer r = cVar.m30154r();
        if (r != null) {
            eVar.m13963M(r.intValue());
        }
        Integer l = cVar.m30160l();
        if (l != null) {
            eVar.m13975A(l.intValue());
        }
        Long j = cVar.m30162j("gcm.n.event_time");
        if (j != null) {
            eVar.m13971E(true);
            eVar.m13962N(j.longValue());
        }
        long[] q = cVar.m30155q();
        if (q != null) {
            eVar.m13964L(q);
        }
        int[] e = cVar.m30167e();
        if (e != null) {
            eVar.m13937y(e[0], e[1], e[2]);
        }
        eVar.m13944r(m10740i(cVar));
        return new C9001a(eVar, m10734o(cVar), 0);
    }

    public static Intent m10743f(String str, C3527c cVar, PackageManager packageManager) {
        String p = cVar.m30156p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = cVar.m30166f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            android.util.Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int m10742g() {
        return f28904a.incrementAndGet();
    }

    public static Integer m10741h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
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
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C8117a.m13439d(context, i));
            } catch (Resources.NotFoundException unused2) {
                android.util.Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    public static int m10740i(C3527c cVar) {
        boolean a = cVar.m30171a("gcm.n.default_sound");
        if (cVar.m30171a("gcm.n.default_vibrate_timings")) {
            a = (a ? 1 : 0) | true;
        }
        if (cVar.m30171a("gcm.n.default_light_settings")) {
            return (a ? 1 : 0) | 4;
        }
        int i = a ? 1 : 0;
        int i2 = a ? 1 : 0;
        return i;
    }

    public static Bundle m10739j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, Log.TAG_YOUTUBE);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
            sb2.append("Couldn't get own application info: ");
            sb2.append(valueOf);
            android.util.Log.w("FirebaseMessaging", sb2.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String m10738k(Context context, String str, Bundle bundle) {
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
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + C3563j.f11967N0);
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

    public static int m10737l(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return 1140850688;
        }
        return Log.TAG_TDLIB_OPTIONS;
    }

    public static int m10736m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m10733p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m10733p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61);
            sb2.append("Icon resource ");
            sb2.append(str2);
            sb2.append(" not found. Notification will use default icon.");
            android.util.Log.w("FirebaseMessaging", sb2.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m10733p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 35);
                sb3.append("Couldn't get own application info: ");
                sb3.append(valueOf);
                android.util.Log.w("FirebaseMessaging", sb3.toString());
            }
        }
        if (i == 0 || !m10733p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    public static Uri m10735n(String str, C3527c cVar, Resources resources) {
        String o = cVar.m30157o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(o).length());
        sb2.append("android.resource://");
        sb2.append(str);
        sb2.append("/raw/");
        sb2.append(o);
        return Uri.parse(sb2.toString());
    }

    public static String m10734o(C3527c cVar) {
        String p = cVar.m30156p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("FCM-Notification:");
        sb2.append(uptimeMillis);
        return sb2.toString();
    }

    @TargetApi(26)
    public static boolean m10733p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb2.append(i);
            android.util.Log.e("FirebaseMessaging", sb2.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Couldn't find resource ");
            sb3.append(i);
            sb3.append(", treating it as an invalid icon");
            android.util.Log.e("FirebaseMessaging", sb3.toString());
            return false;
        }
    }

    public static boolean m10732q(C3527c cVar) {
        return cVar.m30171a("google.c.a.e");
    }
}
