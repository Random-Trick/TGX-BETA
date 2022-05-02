package p020b5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class C1197f0 implements AbstractC1192d {
    @Override
    public long mo38087a() {
        return SystemClock.uptimeMillis();
    }

    @Override
    public AbstractC1221n mo38086b(Looper looper, Handler.Callback callback) {
        return new C1199g0(new Handler(looper, callback));
    }

    @Override
    public void mo38085c() {
    }

    @Override
    public long mo38084d() {
        return SystemClock.elapsedRealtime();
    }
}
