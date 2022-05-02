package p163l5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;
import org.thunderdog.challegram.Log;
import p261s5.C8645b;

public final class C6399y0 {
    public static final Object f20046a = new Object();
    @GuardedBy("sLock")
    public static boolean f20047b;
    public static String f20048c;
    public static int f20049d;

    public static int m20469a(Context context) {
        m20468b(context);
        return f20049d;
    }

    public static void m20468b(Context context) {
        Bundle bundle;
        synchronized (f20046a) {
            if (!f20047b) {
                f20047b = true;
                try {
                    bundle = C8645b.m11819a(context).m11822b(context.getPackageName(), Log.TAG_YOUTUBE).metaData;
                } catch (PackageManager.NameNotFoundException e) {
                    android.util.Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
                if (bundle != null) {
                    f20048c = bundle.getString("com.google.app.id");
                    f20049d = bundle.getInt("com.google.android.gms.version");
                }
            }
        }
    }
}
