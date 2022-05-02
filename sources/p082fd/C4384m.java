package p082fd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.CountDownLatch;
import org.thunderdog.challegram.Log;

public class C4384m extends Thread {
    public volatile Handler f14532a;
    public volatile Handler f14533b;
    public final CountDownLatch f14534c = new CountDownLatch(1);

    public static class HandlerC4385a extends Handler {
        public C4384m f14535a;

        public HandlerC4385a(C4384m mVar) {
            this.f14535a = mVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f14535a.mo3052f(message);
        }
    }

    public C4384m(String str) {
        setName(str);
        start();
    }

    public void m28055a(Runnable runnable) {
        try {
            this.f14534c.await();
        } catch (InterruptedException e) {
            Log.m14723e(e);
        }
        this.f14532a.removeCallbacks(runnable);
    }

    public Handler mo20313b() {
        return null;
    }

    public Handler m28054c() {
        try {
            this.f14534c.await();
        } catch (InterruptedException e) {
            Log.m14723e(e);
        }
        return this.f14533b;
    }

    public Handler m28053d() {
        try {
            this.f14534c.await();
        } catch (InterruptedException e) {
            Log.m14723e(e);
        }
        return this.f14532a;
    }

    public void m28052e(Runnable runnable, long j) {
        try {
            this.f14534c.await();
        } catch (InterruptedException e) {
            Log.m14723e(e);
        }
        if (j <= 0) {
            this.f14532a.post(runnable);
        } else {
            this.f14532a.postDelayed(runnable, j);
        }
    }

    public void mo3052f(Message message) {
    }

    public void m28051g(boolean z) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 18 || !z) {
            myLooper.quit();
        } else {
            myLooper.quitSafely();
        }
    }

    public void m28050h(Message message, long j) {
        try {
            this.f14534c.await();
        } catch (InterruptedException e) {
            Log.m14723e(e);
        }
        if (j <= 0) {
            this.f14532a.sendMessage(message);
        } else {
            this.f14532a.sendMessageDelayed(message, j);
        }
    }

    @Override
    public void run() {
        Looper.prepare();
        this.f14532a = new HandlerC4385a(this);
        this.f14533b = mo20313b();
        this.f14534c.countDown();
        Looper.loop();
    }
}
