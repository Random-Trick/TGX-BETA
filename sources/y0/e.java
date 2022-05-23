package y0;

import android.os.Handler;
import b1.h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class e {

    public static class a implements Executor {
        public final Handler f26454a;

        public a(Handler handler) {
            this.f26454a = (Handler) h.e(handler);
        }

        @Override
        public void execute(Runnable runnable) {
            if (!this.f26454a.post((Runnable) h.e(runnable))) {
                throw new RejectedExecutionException(this.f26454a + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
