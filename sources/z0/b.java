package z0;

import android.os.Handler;
import android.os.Looper;

public class b {
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
