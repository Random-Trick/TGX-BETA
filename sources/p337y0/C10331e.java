package p337y0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p016b1.C1132h;

public final class C10331e {

    public static class ExecutorC10332a implements Executor {
        public final Handler f33191a;

        public ExecutorC10332a(Handler handler) {
            this.f33191a = (Handler) C1132h.m38322e(handler);
        }

        @Override
        public void execute(Runnable runnable) {
            if (!this.f33191a.post((Runnable) C1132h.m38322e(runnable))) {
                throw new RejectedExecutionException(this.f33191a + " is shutting down");
            }
        }
    }

    public static Executor m5410a(Handler handler) {
        return new ExecutorC10332a(handler);
    }
}
