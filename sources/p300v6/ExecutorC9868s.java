package p300v6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class ExecutorC9868s implements Executor {
    public final Handler f32148a = new Handler(Looper.getMainLooper());

    @Override
    public final void execute(Runnable runnable) {
        this.f32148a.post(runnable);
    }
}
