package p009a8;

import android.os.Handler;
import java.util.concurrent.Executor;

public enum EnumC0230u implements Executor {
    INSTANCE;

    @Override
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = C0215g.m42087a().f690a;
        handler.post(runnable);
    }
}
