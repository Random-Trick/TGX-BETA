package p148k5;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class ExecutorC6181w0 implements Executor {
    public final Handler f19577a;

    public ExecutorC6181w0(Handler handler) {
        this.f19577a = handler;
    }

    public static Executor m21099a(Handler handler) {
        return new ExecutorC6181w0(handler);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f19577a.post(runnable);
    }
}
