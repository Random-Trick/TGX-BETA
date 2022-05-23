package a6;

import android.os.Looper;
import m5.r;

public final class c0 {
    public static Looper a(Looper looper) {
        return looper != null ? looper : b();
    }

    public static Looper b() {
        r.n(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
