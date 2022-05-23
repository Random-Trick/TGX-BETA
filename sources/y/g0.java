package y;

import android.os.Handler;
import java.util.concurrent.Executor;

public abstract class g0 {
    public static g0 a(Executor executor, Handler handler) {
        return new a(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
