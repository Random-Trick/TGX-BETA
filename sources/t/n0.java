package t;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import t.m0;

public final class n0 {
    public static m0.b a(Context context, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new p0(context);
        }
        if (i10 >= 28) {
            return o0.g(context);
        }
        return q0.f(context, handler);
    }
}
