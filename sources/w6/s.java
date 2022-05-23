package w6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class s implements Executor {
    public final Handler f25796a = new Handler(Looper.getMainLooper());

    @Override
    public final void execute(Runnable runnable) {
        this.f25796a.post(runnable);
    }
}
