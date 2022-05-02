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
    public static volatile AbstractC8341c<?> f27023a;
    public static volatile List<AbstractC8338a> f27024b;

    public static class C8344a {
        public static String m12747a(List<ShortcutInfo> list) {
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

    public static boolean m12755a(Context context, C8339b bVar) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        IconCompat iconCompat2 = bVar.f27010h;
        if (iconCompat2 == null) {
            return false;
        }
        int i = iconCompat2.f2712a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream n = iconCompat2.m40313n(context);
        if (n == null || (decodeStream = BitmapFactory.decodeStream(n)) == null) {
            return false;
        }
        if (i == 6) {
            iconCompat = IconCompat.m40325b(decodeStream);
        } else {
            iconCompat = IconCompat.m40324c(decodeStream);
        }
        bVar.f27010h = iconCompat;
        return true;
    }

    public static int m12754b(Context context) {
        C1132h.m38325e(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static String m12753c(List<C8339b> list) {
        int i = -1;
        String str = null;
        for (C8339b bVar : list) {
            if (bVar.m12772d() > i) {
                str = bVar.m12774b();
                i = bVar.m12772d();
            }
        }
        return str;
    }

    public static List<AbstractC8338a> m12752d(Context context) {
        Bundle bundle;
        String string;
        if (f27024b == null) {
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
            if (f27024b == null) {
                f27024b = arrayList;
            }
        }
        return f27024b;
    }

    public static AbstractC8341c<?> m12751e(Context context) {
        if (f27023a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f27023a = (AbstractC8341c) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C8343d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f27023a == null) {
                f27023a = new AbstractC8341c.C8342a();
            }
        }
        return f27023a;
    }

    public static boolean m12750f(Context context, C8339b bVar) {
        C1132h.m38325e(context);
        C1132h.m38325e(bVar);
        int b = m12754b(context);
        if (b == 0) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            m12755a(context, bVar);
        }
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(bVar.m12770f());
        } else if (i >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= b) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(C8344a.m12747a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(bVar.m12770f()));
        }
        AbstractC8341c<?> e = m12751e(context);
        try {
            List<C8339b> b2 = e.m12760b();
            if (b2.size() >= b) {
                e.mo12758c(Arrays.asList(m12753c(b2)));
            }
            e.mo12759a(Arrays.asList(bVar));
            for (AbstractC8338a aVar : m12752d(context)) {
                aVar.m12778a(Collections.singletonList(bVar));
            }
            m12748h(context, bVar.m12774b());
            return true;
        } catch (Exception unused) {
            for (AbstractC8338a aVar2 : m12752d(context)) {
                aVar2.m12778a(Collections.singletonList(bVar));
            }
            m12748h(context, bVar.m12774b());
            return false;
        } catch (Throwable th) {
            for (AbstractC8338a aVar3 : m12752d(context)) {
                aVar3.m12778a(Collections.singletonList(bVar));
            }
            m12748h(context, bVar.m12774b());
            throw th;
        }
    }

    public static void m12749g(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m12751e(context).mo12758c(list);
        for (AbstractC8338a aVar : m12752d(context)) {
            aVar.m12777b(list);
        }
    }

    public static void m12748h(Context context, String str) {
        C1132h.m38325e(context);
        C1132h.m38325e(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (AbstractC8338a aVar : m12752d(context)) {
            aVar.m12776c(Collections.singletonList(str));
        }
    }
}
