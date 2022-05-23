package t6;

import android.content.Context;

public final class p {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
