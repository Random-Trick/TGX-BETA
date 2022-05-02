package p177m6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p061e6.HandlerC4162a;

public final class ExecutorC6776l0 implements Executor {
    public final Handler f21248a = new HandlerC4162a(Looper.getMainLooper());

    @Override
    public final void execute(Runnable runnable) {
        this.f21248a.post(runnable);
    }
}
