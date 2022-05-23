package bb;

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

public final class c {
    public static final List<Class<? extends a>> f4084a;
    public static final Object f4085b = new Object();
    public static a f4086c;
    public static ComponentName f4087d;

    static {
        LinkedList linkedList = new LinkedList();
        f4084a = linkedList;
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

    public static void a(Context context, int i10) {
        if (f4086c != null || c(context)) {
            try {
                f4086c.b(context, f4087d, i10);
            } catch (Exception e10) {
                throw new b("Unable to execute badge", e10);
            }
        } else {
            throw new b("No default launcher available");
        }
    }

    public static void b(Context context, Notification notification, int i10) {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
            } catch (Exception e10) {
                if (Log.isLoggable("ShortcutBadger", 3)) {
                    Log.d("ShortcutBadger", "Unable to execute badge", e10);
                }
            }
        }
    }

    public static boolean c(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f4087d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, org.thunderdog.challegram.Log.TAG_COMPRESS)) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator<Class<? extends a>> it = f4084a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a aVar = null;
                try {
                    aVar = it.next().newInstance();
                } catch (Exception unused) {
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f4086c = aVar;
                    break;
                }
            }
            if (f4086c != null) {
                break;
            }
        }
        if (f4086c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f4086c = new ZukHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("OPPO")) {
            f4086c = new OPPOHomeBader();
            return true;
        } else if (str2.equalsIgnoreCase("VIVO")) {
            f4086c = new VivoHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("ZTE")) {
            f4086c = new ZTEHomeBadger();
            return true;
        } else {
            f4086c = new DefaultBadger();
            return true;
        }
    }
}
