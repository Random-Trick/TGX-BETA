package p232q5;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import p163l5.C6378r;

public final class C8246f {
    public static final String[] f26697a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean m13051a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            C6378r.m20507k(context);
            C6378r.m20507k(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
