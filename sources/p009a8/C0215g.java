package p009a8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p021b6.HandlerC1248a;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p314w7.C9987a;

public class C0215g {
    public static final Object f688b = new Object();
    public static C0215g f689c;
    public Handler f690a;

    public C0215g(Looper looper) {
        this.f690a = new HandlerC1248a(looper);
    }

    @RecentlyNonNull
    public static C0215g m42087a() {
        C0215g gVar;
        synchronized (f688b) {
            if (f689c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f689c = new C0215g(handlerThread.getLooper());
            }
            gVar = f689c;
        }
        return gVar;
    }

    @RecentlyNonNull
    public static Executor m42084d() {
        return EnumC0230u.f719a;
    }

    @RecentlyNonNull
    public <ResultT> AbstractC6775l<ResultT> m42086b(@RecentlyNonNull final Callable<ResultT> callable) {
        final C6777m mVar = new C6777m();
        m42085c(new Runnable() {
            @Override
            public final void run() {
                Callable callable2 = callable;
                C6777m mVar2 = mVar;
                try {
                    mVar2.m19085c(callable2.call());
                } catch (C9987a e) {
                    mVar2.m19086b(e);
                } catch (Exception e2) {
                    mVar2.m19086b(new C9987a("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return mVar.m19087a();
    }

    public void m42085c(@RecentlyNonNull Runnable runnable) {
        m42084d().execute(runnable);
    }
}
