package p351z;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

public final class C11181d {

    public static class C11182a {
        public static Context m1308a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String m1307b(Context context) {
            return context.getAttributionTag();
        }
    }

    public static Context m1311a(Context context) {
        String b;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (b = C11182a.m1307b(context)) == null) ? applicationContext : C11182a.m1308a(applicationContext, b);
    }

    public static Application m1310b(Context context) {
        for (Context a = m1311a(context); a instanceof ContextWrapper; a = m1309c((ContextWrapper) a)) {
            if (a instanceof Application) {
                return (Application) a;
            }
        }
        return null;
    }

    public static Context m1309c(ContextWrapper contextWrapper) {
        String b;
        Context baseContext = contextWrapper.getBaseContext();
        return (Build.VERSION.SDK_INT < 30 || (b = C11182a.m1307b(contextWrapper)) == null) ? baseContext : C11182a.m1308a(baseContext, b);
    }
}
