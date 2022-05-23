package g2;

import android.os.Handler;
import android.os.Looper;
import f2.q;
import y0.f;

public class a implements q {
    public final Handler f12022a = f.a(Looper.getMainLooper());

    @Override
    public void a(long j10, Runnable runnable) {
        this.f12022a.postDelayed(runnable, j10);
    }

    @Override
    public void b(Runnable runnable) {
        this.f12022a.removeCallbacks(runnable);
    }
}
