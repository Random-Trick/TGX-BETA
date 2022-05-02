package p241r0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import p016b1.C1132h;
import p241r0.AbstractC8341c;

public class C8343d {
    public static volatile AbstractC8341c<?> f27020a;
    public static volatile List<AbstractC8338a> f27021b;

    public static class C8344a {
        public static String m12748a(List<ShortcutInfo> list) {
            int i = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i) {
                    str = shortcutInfo.getId();
                    i = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    public static boolean m12756a(Context context, C8339b bVar) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        IconCompat iconCompat2 = bVar.f27007h;
        if (iconCompat2 == null) {
            return false;
        }
        int i = iconCompat2.f2712a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream n = iconCompat2.m40310n(context);
        if (n == null || (decodeStream = BitmapFactory.decodeStream(n)) == null) {
            return false;
        }
        if (i == 6) {
            iconCompat = IconCompat.m40322b(decodeStream);
        } else {
            iconCompat = IconCompat.m40321c(decodeStream);
        }
        bVar.f27007h = iconCompat;
        return true;
    }

    public static int m12755b(Context context) {
        C1132h.m38322e(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static String m12754c(List<C8339b> list) {
        int i = -1;
        String str = null;
        for (C8339b bVar : list) {
            if (bVar.m12773d() > i) {
                str = bVar.m12775b();
                i = bVar.m12773d();
            }
        }
        return str;
    }

    public static List<AbstractC8338a> m12753d(Context context) {
        Bundle bundle;
        String string;
        if (f27021b == null) {
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
                intent.setPackage(context.getPackageName());
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, Log.TAG_YOUTUBE)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                        try {
                            arrayList.add((AbstractC8338a) Class.forName(string, false, C8343d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (f27021b == null) {
                f27021b = arrayList;
            }
        }
        return f27021b;
    }

    public static AbstractC8341c<?> m12752e(Context context) {
        if (f27020a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f27020a = (AbstractC8341c) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C8343d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f27020a == null) {
                f27020a = new AbstractC8341c.C8342a();
            }
        }
        return f27020a;
    }

    public static boolean m12751f(Context context, C8339b bVar) {
        C1132h.m38322e(context);
        C1132h.m38322e(bVar);
        int b = m12755b(context);
        if (b == 0) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            m12756a(context, bVar);
        }
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(bVar.m12771f());
        } else if (i >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= b) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(C8344a.m12748a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(bVar.m12771f()));
        }
        AbstractC8341c<?> e = m12752e(context);
        try {
            List<C8339b> b2 = e.m12761b();
            if (b2.size() >= b) {
                e.mo12759c(Arrays.asList(m12754c(b2)));
            }
            e.mo12760a(Arrays.asList(bVar));
            for (AbstractC8338a aVar : m12753d(context)) {
                aVar.m12779a(Collections.singletonList(bVar));
            }
            m12749h(context, bVar.m12775b());
            return true;
        } catch (Exception unused) {
            for (AbstractC8338a aVar2 : m12753d(context)) {
                aVar2.m12779a(Collections.singletonList(bVar));
            }
            m12749h(context, bVar.m12775b());
            return false;
        } catch (Throwable th) {
            for (AbstractC8338a aVar3 : m12753d(context)) {
                aVar3.m12779a(Collections.singletonList(bVar));
            }
            m12749h(context, bVar.m12775b());
            throw th;
        }
    }

    public static void m12750g(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m12752e(context).mo12759c(list);
        for (AbstractC8338a aVar : m12753d(context)) {
            aVar.m12778b(list);
        }
    }

    public static void m12749h(Context context, String str) {
        C1132h.m38322e(context);
        C1132h.m38322e(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (AbstractC8338a aVar : m12753d(context)) {
            aVar.m12777c(Collections.singletonList(str));
        }
    }
}
