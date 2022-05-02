package p352z0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p016b1.AbstractC1125a;

public class C11220g {

    public static class ThreadFactoryC11221a implements ThreadFactory {
        public String f35929a;
        public int f35930b;

        public static class C11222a extends Thread {
            public final int f35931a;

            public C11222a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f35931a = i;
            }

            @Override
            public void run() {
                Process.setThreadPriority(this.f35931a);
                super.run();
            }
        }

        public ThreadFactoryC11221a(String str, int i) {
            this.f35929a = str;
            this.f35930b = i;
        }

        @Override
        public Thread newThread(Runnable runnable) {
            return new C11222a(runnable, this.f35929a, this.f35930b);
        }
    }

    public static class RunnableC11223b<T> implements Runnable {
        public Callable<T> f35932a;
        public AbstractC1125a<T> f35933b;
        public Handler f35934c;

        public class RunnableC11224a implements Runnable {
            public final AbstractC1125a f35935a;
            public final Object f35936b;

            public RunnableC11224a(AbstractC1125a aVar, Object obj) {
                this.f35935a = aVar;
                this.f35936b = obj;
            }

            @Override
            public void run() {
                this.f35935a.mo1208a(this.f35936b);
            }
        }

        public RunnableC11223b(Handler handler, Callable<T> callable, AbstractC1125a<T> aVar) {
            this.f35932a = callable;
            this.f35933b = aVar;
            this.f35934c = handler;
        }

        @Override
        public void run() {
            T t;
            try {
                t = this.f35932a.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f35934c.post(new RunnableC11224a(this.f35933b, t));
        }
    }

    public static ThreadPoolExecutor m1193a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC11221a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void m1192b(Executor executor, Callable<T> callable, AbstractC1125a<T> aVar) {
        executor.execute(new RunnableC11223b(C11206b.m1231a(), callable, aVar));
    }

    public static <T> T m1191c(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
