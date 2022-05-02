package p243r2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p215p2.ExecutorC8003h;

public class C8355b implements AbstractC8354a {
    public final ExecutorC8003h f27075a;
    public final Handler f27076b = new Handler(Looper.getMainLooper());
    public final Executor f27077c = new ExecutorC8356a();

    public class ExecutorC8356a implements Executor {
        public ExecutorC8356a() {
        }

        @Override
        public void execute(Runnable runnable) {
            C8355b.this.m12679d(runnable);
        }
    }

    public C8355b(Executor executor) {
        this.f27075a = new ExecutorC8003h(executor);
    }

    @Override
    public Executor mo12682a() {
        return this.f27077c;
    }

    @Override
    public void mo12681b(Runnable runnable) {
        this.f27075a.execute(runnable);
    }

    @Override
    public ExecutorC8003h mo12680c() {
        return this.f27075a;
    }

    public void m12679d(Runnable runnable) {
        this.f27076b.post(runnable);
    }
}
