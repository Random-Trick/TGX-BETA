package b8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import c6.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import n6.l;
import n6.m;

public class g {
    public static final Object f4032b = new Object();
    public static g f4033c;
    public Handler f4034a;

    public g(Looper looper) {
        this.f4034a = new a(looper);
    }

    @RecentlyNonNull
    public static g a() {
        g gVar;
        synchronized (f4032b) {
            if (f4033c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f4033c = new g(handlerThread.getLooper());
            }
            gVar = f4033c;
        }
        return gVar;
    }

    @RecentlyNonNull
    public static Executor d() {
        return u.f4059a;
    }

    @RecentlyNonNull
    public <ResultT> l<ResultT> b(@RecentlyNonNull final Callable<ResultT> callable) {
        final m mVar = new m();
        c(new Runnable() {
            @Override
            public final void run() {
                Callable callable2 = callable;
                m mVar2 = mVar;
                try {
                    mVar2.c(callable2.call());
                } catch (x7.a e10) {
                    mVar2.b(e10);
                } catch (Exception e11) {
                    mVar2.b(new x7.a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return mVar.a();
    }

    public void c(@RecentlyNonNull Runnable runnable) {
        d().execute(runnable);
    }
}
