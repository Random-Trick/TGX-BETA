package r2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p2.h;

public class b implements r2.a {
    public final h f21647a;
    public final Handler f21648b = new Handler(Looper.getMainLooper());
    public final Executor f21649c = new a();

    public class a implements Executor {
        public a() {
        }

        @Override
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f21647a = new h(executor);
    }

    @Override
    public Executor a() {
        return this.f21649c;
    }

    @Override
    public void b(Runnable runnable) {
        this.f21647a.execute(runnable);
    }

    @Override
    public h c() {
        return this.f21647a;
    }

    public void d(Runnable runnable) {
        this.f21648b.post(runnable);
    }
}
