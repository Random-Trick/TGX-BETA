package r0;

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
import b1.h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import r0.c;

public class d {
    public static volatile c<?> f21595a;
    public static volatile List<r0.a> f21596b;

    public static class a {
        public static String a(List<ShortcutInfo> list) {
            int i10 = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i10) {
                    str = shortcutInfo.getId();
                    i10 = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    public static boolean a(Context context, b bVar) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        IconCompat iconCompat2 = bVar.f21582h;
        if (iconCompat2 == null) {
            return false;
        }
        int i10 = iconCompat2.f2449a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream n10 = iconCompat2.n(context);
        if (n10 == null || (decodeStream = BitmapFactory.decodeStream(n10)) == null) {
            return false;
        }
        if (i10 == 6) {
            iconCompat = IconCompat.b(decodeStream);
        } else {
            iconCompat = IconCompat.c(decodeStream);
        }
        bVar.f21582h = iconCompat;
        return true;
    }

    public static int b(Context context) {
        h.e(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static String c(List<b> list) {
        int i10 = -1;
        String str = null;
        for (b bVar : list) {
            if (bVar.d() > i10) {
                str = bVar.b();
                i10 = bVar.d();
            }
        }
        return str;
    }

    public static List<r0.a> d(Context context) {
        Bundle bundle;
        String string;
        if (f21596b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, Log.TAG_YOUTUBE)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                    try {
                        arrayList.add((r0.a) Class.forName(string, false, d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f21596b == null) {
                f21596b = arrayList;
            }
        }
        return f21596b;
    }

    public static c<?> e(Context context) {
        if (f21595a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f21595a = (c) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f21595a == null) {
                f21595a = new c.a();
            }
        }
        return f21595a;
    }

    public static boolean f(Context context, b bVar) {
        h.e(context);
        h.e(bVar);
        int b10 = b(context);
        if (b10 == 0) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            a(context, bVar);
        }
        if (i10 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(bVar.f());
        } else if (i10 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= b10) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(a.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(bVar.f()));
        }
        c<?> e10 = e(context);
        try {
            List<b> b11 = e10.b();
            if (b11.size() >= b10) {
                e10.c(Arrays.asList(c(b11)));
            }
            e10.a(Arrays.asList(bVar));
            for (r0.a aVar : d(context)) {
                aVar.a(Collections.singletonList(bVar));
            }
            h(context, bVar.b());
            return true;
        } catch (Exception unused) {
            for (r0.a aVar2 : d(context)) {
                aVar2.a(Collections.singletonList(bVar));
            }
            h(context, bVar.b());
            return false;
        } catch (Throwable th) {
            for (r0.a aVar3 : d(context)) {
                aVar3.a(Collections.singletonList(bVar));
            }
            h(context, bVar.b());
            throw th;
        }
    }

    public static void g(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        e(context).c(list);
        for (r0.a aVar : d(context)) {
            aVar.b(list);
        }
    }

    public static void h(Context context, String str) {
        h.e(context);
        h.e(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (r0.a aVar : d(context)) {
            aVar.c(Collections.singletonList(str));
        }
    }
}
