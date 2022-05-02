package p087g2;

import android.os.Handler;
import android.os.Looper;
import p071f2.AbstractC4248q;
import p337y0.C10333f;

public class C4449a implements AbstractC4248q {
    public final Handler f14715a = C10333f.m5409a(Looper.getMainLooper());

    @Override
    public void mo27640a(long j, Runnable runnable) {
        this.f14715a.postDelayed(runnable, j);
    }

    @Override
    public void mo27639b(Runnable runnable) {
        this.f14715a.removeCallbacks(runnable);
    }
}
