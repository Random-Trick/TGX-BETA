package u7;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import n6.l;
import n6.m;
import n6.o;
import u7.u0;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class f extends Service {
    public int M;
    public Binder f23622b;
    public final ExecutorService f23621a = o.c();
    public final Object f23623c = new Object();
    public int N = 0;

    public class a implements u0.a {
        public a() {
        }

        @Override
        public l<Void> a(Intent intent) {
            return f.this.h(intent);
        }
    }

    public final void b(Intent intent) {
        if (intent != null) {
            r0.b(intent);
        }
        synchronized (this.f23623c) {
            int i10 = this.N - 1;
            this.N = i10;
            if (i10 == 0) {
                i(this.M);
            }
        }
    }

    public Intent c(Intent intent) {
        return intent;
    }

    public abstract void d(Intent intent);

    public boolean e(Intent intent) {
        return false;
    }

    public final void f(Intent intent, l lVar) {
        b(intent);
    }

    public final void g(Intent intent, m mVar) {
        try {
            d(intent);
        } finally {
            mVar.c(null);
        }
    }

    public final l<Void> h(final Intent intent) {
        if (e(intent)) {
            return o.f(null);
        }
        final m mVar = new m();
        this.f23621a.execute(new Runnable(this, intent, mVar) {
            public final f f23606a;
            public final Intent f23607b;
            public final m f23608c;

            {
                this.f23606a = this;
                this.f23607b = intent;
                this.f23608c = mVar;
            }

            @Override
            public void run() {
                this.f23606a.g(this.f23607b, this.f23608c);
            }
        });
        return mVar.a();
    }

    public boolean i(int i10) {
        return stopSelfResult(i10);
    }

    @Override
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f23622b == null) {
            this.f23622b = new u0(new a());
        }
        return this.f23622b;
    }

    @Override
    public void onDestroy() {
        this.f23621a.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f23623c) {
            this.M = i11;
            this.N++;
        }
        Intent c10 = c(intent);
        if (c10 == null) {
            b(intent);
            return 2;
        }
        l<Void> h10 = h(c10);
        if (h10.o()) {
            b(intent);
            return 2;
        }
        h10.b(d.f23612a, new n6.f(this, intent) {
            public final f f23614a;
            public final Intent f23615b;

            {
                this.f23614a = this;
                this.f23615b = intent;
            }

            @Override
            public void a(l lVar) {
                this.f23614a.f(this.f23615b, lVar);
            }
        });
        return 3;
    }
}
