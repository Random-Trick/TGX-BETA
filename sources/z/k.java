package z;

import android.os.Handler;
import android.os.Looper;
import y0.f;

public final class k {
    public static volatile Handler f26764a;

    public static Handler a() {
        if (f26764a != null) {
            return f26764a;
        }
        synchronized (k.class) {
            if (f26764a == null) {
                f26764a = f.a(Looper.getMainLooper());
            }
        }
        return f26764a;
    }
}
