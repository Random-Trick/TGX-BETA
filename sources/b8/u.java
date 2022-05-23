package b8;

import android.os.Handler;
import java.util.concurrent.Executor;

public enum u implements Executor {
    INSTANCE;

    @Override
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = g.a().f4034a;
        handler.post(runnable);
    }
}
