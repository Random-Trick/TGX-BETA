package p351z;

import android.os.Looper;
import p016b1.C1132h;

public final class C11202l {
    public static void m1236a() {
        C1132h.m38319h(m1235b(), "Not in application's main thread");
    }

    public static boolean m1235b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
