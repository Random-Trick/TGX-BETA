package p357z5;

import android.os.Looper;
import p163l5.C6378r;

public final class C11288c0 {
    public static Looper m950a(Looper looper) {
        return looper != null ? looper : m949b();
    }

    public static Looper m949b() {
        C6378r.m20504n(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
