package z0;

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

public class g {

    public static class a implements ThreadFactory {
        public String f26803a;
        public int f26804b;

        public static class C0257a extends Thread {
            public final int f26805a;

            public C0257a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f26805a = i10;
            }

            @Override
            public void run() {
                Process.setThreadPriority(this.f26805a);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f26803a = str;
            this.f26804b = i10;
        }

        @Override
        public Thread newThread(Runnable runnable) {
            return new C0257a(runnable, this.f26803a, this.f26804b);
        }
    }

    public static class b<T> implements Runnable {
        public Callable<T> f26806a;
        public b1.a<T> f26807b;
        public Handler f26808c;

        public class a implements Runnable {
            public final b1.a f26809a;
            public final Object f26810b;

            public a(b1.a aVar, Object obj) {
                this.f26809a = aVar;
                this.f26810b = obj;
            }

            @Override
            public void run() {
                this.f26809a.a(this.f26810b);
            }
        }

        public b(Handler handler, Callable<T> callable, b1.a<T> aVar) {
            this.f26806a = callable;
            this.f26807b = aVar;
            this.f26808c = handler;
        }

        @Override
        public void run() {
            T t10;
            try {
                t10 = this.f26806a.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f26808c.post(new a(this.f26807b, t10));
        }
    }

    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void b(Executor executor, Callable<T> callable, b1.a<T> aVar) {
        executor.execute(new b(z0.b.a(), callable, aVar));
    }

    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
