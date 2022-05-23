package l5;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class w0 implements Executor {
    public final Handler f16263a;

    public w0(Handler handler) {
        this.f16263a = handler;
    }

    public static Executor a(Handler handler) {
        return new w0(handler);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f16263a.post(runnable);
    }
}
