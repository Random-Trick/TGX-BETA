package gd;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.CountDownLatch;
import org.thunderdog.challegram.Log;

public class m extends Thread {
    public volatile Handler f12298a;
    public volatile Handler f12299b;
    public final CountDownLatch f12300c = new CountDownLatch(1);

    public static class a extends Handler {
        public m f12301a;

        public a(m mVar) {
            this.f12301a = mVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f12301a.f(message);
        }
    }

    public m(String str) {
        setName(str);
        start();
    }

    public void a(Runnable runnable) {
        try {
            this.f12300c.await();
        } catch (InterruptedException e10) {
            Log.e(e10);
        }
        this.f12298a.removeCallbacks(runnable);
    }

    public Handler b() {
        return null;
    }

    public Handler c() {
        try {
            this.f12300c.await();
        } catch (InterruptedException e10) {
            Log.e(e10);
        }
        return this.f12299b;
    }

    public Handler d() {
        try {
            this.f12300c.await();
        } catch (InterruptedException e10) {
            Log.e(e10);
        }
        return this.f12298a;
    }

    public void e(Runnable runnable, long j10) {
        try {
            this.f12300c.await();
        } catch (InterruptedException e10) {
            Log.e(e10);
        }
        if (j10 <= 0) {
            this.f12298a.post(runnable);
        } else {
            this.f12298a.postDelayed(runnable, j10);
        }
    }

    public void f(Message message) {
    }

    public void g(boolean z10) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            return;
        }
        if (z10) {
            myLooper.quitSafely();
        } else {
            myLooper.quit();
        }
    }

    public void h(Message message, long j10) {
        try {
            this.f12300c.await();
        } catch (InterruptedException e10) {
            Log.e(e10);
        }
        if (j10 <= 0) {
            this.f12298a.sendMessage(message);
        } else {
            this.f12298a.sendMessageDelayed(message, j10);
        }
    }

    @Override
    public void run() {
        Looper.prepare();
        this.f12298a = new a(this);
        this.f12299b = b();
        this.f12300c.countDown();
        Looper.loop();
    }
}
