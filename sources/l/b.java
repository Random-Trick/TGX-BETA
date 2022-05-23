package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {
    public final Object f15960a = new Object();
    public final ExecutorService f15961b = Executors.newFixedThreadPool(4, new a());
    public volatile Handler f15962c;

    public class a implements ThreadFactory {
        public final AtomicInteger f15963a = new AtomicInteger(0);

        public a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f15963a.getAndIncrement())));
            return thread;
        }
    }

    public static Handler e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override
    public void a(Runnable runnable) {
        this.f15961b.execute(runnable);
    }

    @Override
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override
    public void d(Runnable runnable) {
        if (this.f15962c == null) {
            synchronized (this.f15960a) {
                if (this.f15962c == null) {
                    this.f15962c = e(Looper.getMainLooper());
                }
            }
        }
        this.f15962c.post(runnable);
    }
}
