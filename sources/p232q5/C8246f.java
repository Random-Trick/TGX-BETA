package p232q5;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import p163l5.C6378r;

public final class C8246f {
    public static final String[] f26694a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean m13052a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            C6378r.m20506k(context);
            C6378r.m20506k(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
