package c5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class f0 implements d {
    @Override
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override
    public n b(Looper looper, Handler.Callback callback) {
        return new g0(new Handler(looper, callback));
    }

    @Override
    public void c() {
    }

    @Override
    public long d() {
        return SystemClock.elapsedRealtime();
    }
}
