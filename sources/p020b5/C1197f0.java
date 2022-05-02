package p020b5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class C1197f0 implements AbstractC1192d {
    @Override
    public long mo38084a() {
        return SystemClock.uptimeMillis();
    }

    @Override
    public AbstractC1221n mo38083b(Looper looper, Handler.Callback callback) {
        return new C1199g0(new Handler(looper, callback));
    }

    @Override
    public void mo38082c() {
    }

    @Override
    public long mo38081d() {
        return SystemClock.elapsedRealtime();
    }
}
