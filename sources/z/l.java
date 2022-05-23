package z;

import android.os.Looper;
import b1.h;

public final class l {
    public static void a() {
        h.h(b(), "Not in application's main thread");
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
