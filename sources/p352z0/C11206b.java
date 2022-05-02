package p352z0;

import android.os.Handler;
import android.os.Looper;

public class C11206b {
    public static Handler m1231a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
