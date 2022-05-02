package p266t;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import p266t.C8906m0;

public final class C8910n0 {
    public static C8906m0.AbstractC8908b m10967a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new C8914p0(context);
        }
        if (i >= 28) {
            return C8912o0.m10966g(context);
        }
        return C8916q0.m10957f(context, handler);
    }
}
