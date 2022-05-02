package p012ab;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.AsusHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.EverythingMeHomeBadger;
import me.leolin.shortcutbadger.impl.HuaweiHomeBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.OPPOHomeBader;
import me.leolin.shortcutbadger.impl.SamsungHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import me.leolin.shortcutbadger.impl.VivoHomeBadger;
import me.leolin.shortcutbadger.impl.ZTEHomeBadger;
import me.leolin.shortcutbadger.impl.ZukHomeBadger;

public final class C0245c {
    public static final List<Class<? extends AbstractC0243a>> f746a;
    public static final Object f747b = new Object();
    public static AbstractC0243a f748c;
    public static ComponentName f749d;

    static {
        LinkedList linkedList = new LinkedList();
        f746a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(ZTEHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    public static void m42022a(Context context, int i) {
        if (f748c != null || m42020c(context)) {
            try {
                f748c.mo18370b(context, f749d, i);
            } catch (Exception e) {
                throw new C0244b("Unable to execute badge", e);
            }
        } else {
            throw new C0244b("No default launcher available");
        }
    }

    public static void m42021b(Context context, Notification notification, int i) {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
            } catch (Exception e) {
                if (Log.isLoggable("ShortcutBadger", 3)) {
                    Log.d("ShortcutBadger", "Unable to execute badge", e);
                }
            }
        }
    }

    public static boolean m42020c(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f749d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, org.thunderdog.challegram.Log.TAG_COMPRESS)) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator<Class<? extends AbstractC0243a>> it = f746a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0243a aVar = null;
                try {
                    aVar = it.next().newInstance();
                } catch (Exception unused) {
                }
                if (aVar != null && aVar.mo18371a().contains(str)) {
                    f748c = aVar;
                    break;
                }
            }
            if (f748c != null) {
                break;
            }
        }
        if (f748c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f748c = new ZukHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("OPPO")) {
            f748c = new OPPOHomeBader();
            return true;
        } else if (str2.equalsIgnoreCase("VIVO")) {
            f748c = new VivoHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("ZTE")) {
            f748c = new ZTEHomeBadger();
            return true;
        } else {
            f748c = new DefaultBadger();
            return true;
        }
    }
}
