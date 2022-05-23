package m5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;
import org.thunderdog.challegram.Log;
import t5.b;

public final class y0 {
    public static final Object f17281a = new Object();
    @GuardedBy("sLock")
    public static boolean f17282b;
    public static String f17283c;
    public static int f17284d;

    public static int a(Context context) {
        b(context);
        return f17284d;
    }

    public static void b(Context context) {
        Bundle bundle;
        synchronized (f17281a) {
            if (!f17282b) {
                f17282b = true;
                try {
                    bundle = b.a(context).b(context.getPackageName(), Log.TAG_YOUTUBE).metaData;
                } catch (PackageManager.NameNotFoundException e10) {
                    android.util.Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
                if (bundle != null) {
                    f17283c = bundle.getString("com.google.app.id");
                    f17284d = bundle.getInt("com.google.android.gms.version");
                }
            }
        }
    }
}
