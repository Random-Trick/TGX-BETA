package r5;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import m5.r;

public final class f {
    public static final String[] f21737a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            r.k(context);
            r.k(th);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
