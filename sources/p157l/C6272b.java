package p157l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class C6272b extends AbstractC6274c {
    public final Object f19792a = new Object();
    public final ExecutorService f19793b = Executors.newFixedThreadPool(4, new ThreadFactoryC6273a());
    public volatile Handler f19794c;

    public class ThreadFactoryC6273a implements ThreadFactory {
        public final AtomicInteger f19795a = new AtomicInteger(0);

        public ThreadFactoryC6273a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f19795a.getAndIncrement())));
            return thread;
        }
    }

    public static Handler m20746e(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Override
    public void mo20745a(Runnable runnable) {
        this.f19793b.execute(runnable);
    }

    @Override
    public boolean mo20743c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override
    public void mo20742d(Runnable runnable) {
        if (this.f19794c == null) {
            synchronized (this.f19792a) {
                if (this.f19794c == null) {
                    this.f19794c = m20746e(Looper.getMainLooper());
                }
            }
        }
        this.f19794c.post(runnable);
    }
}
