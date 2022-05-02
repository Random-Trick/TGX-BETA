package p351z;

import android.os.Handler;
import android.os.Looper;
import p337y0.C10333f;

public final class C11201k {
    public static volatile Handler f35890a;

    public static Handler m1237a() {
        if (f35890a != null) {
            return f35890a;
        }
        synchronized (C11201k.class) {
            if (f35890a == null) {
                f35890a = C10333f.m5409a(Looper.getMainLooper());
            }
        }
        return f35890a;
    }
}
