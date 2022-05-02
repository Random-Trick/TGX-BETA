package p243r2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p215p2.ExecutorC8003h;

public class C8355b implements AbstractC8354a {
    public final ExecutorC8003h f27072a;
    public final Handler f27073b = new Handler(Looper.getMainLooper());
    public final Executor f27074c = new ExecutorC8356a();

    public class ExecutorC8356a implements Executor {
        public ExecutorC8356a() {
        }

        @Override
        public void execute(Runnable runnable) {
            C8355b.this.m12680d(runnable);
        }
    }

    public C8355b(Executor executor) {
        this.f27072a = new ExecutorC8003h(executor);
    }

    @Override
    public Executor mo12683a() {
        return this.f27074c;
    }

    @Override
    public void mo12682b(Runnable runnable) {
        this.f27072a.execute(runnable);
    }

    @Override
    public ExecutorC8003h mo12681c() {
        return this.f27072a;
    }

    public void m12680d(Runnable runnable) {
        this.f27073b.post(runnable);
    }
}
