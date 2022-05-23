package n6;

import android.os.Handler;
import android.os.Looper;
import f6.a;
import java.util.concurrent.Executor;

public final class l0 implements Executor {
    public final Handler f17723a = new a(Looper.getMainLooper());

    @Override
    public final void execute(Runnable runnable) {
        this.f17723a.post(runnable);
    }
}
