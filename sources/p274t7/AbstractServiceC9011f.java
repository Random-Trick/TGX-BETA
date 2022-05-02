package p274t7;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import p177m6.AbstractC6763f;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p177m6.C6781o;
import p274t7.BinderC9045u0;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class AbstractServiceC9011f extends Service {
    public int f28930M;
    public Binder f28933b;
    public final ExecutorService f28932a = C9031o.m10649c();
    public final Object f28934c = new Object();
    public int f28931N = 0;

    public class C9012a implements BinderC9045u0.AbstractC9046a {
        public C9012a() {
        }

        @Override
        public AbstractC6775l<Void> mo10610a(Intent intent) {
            return AbstractServiceC9011f.this.m10696h(intent);
        }
    }

    public final void m10702b(Intent intent) {
        if (intent != null) {
            C9039r0.m10616b(intent);
        }
        synchronized (this.f28934c) {
            int i = this.f28931N - 1;
            this.f28931N = i;
            if (i == 0) {
                m10695i(this.f28930M);
            }
        }
    }

    public Intent mo10701c(Intent intent) {
        return intent;
    }

    public abstract void mo10700d(Intent intent);

    public boolean m10699e(Intent intent) {
        return false;
    }

    public final void m10698f(Intent intent, AbstractC6775l lVar) {
        m10702b(intent);
    }

    public final void m10697g(Intent intent, C6777m mVar) {
        try {
            mo10700d(intent);
        } finally {
            mVar.m19084c(null);
        }
    }

    public final AbstractC6775l<Void> m10696h(final Intent intent) {
        if (m10699e(intent)) {
            return C6781o.m19049f(null);
        }
        final C6777m mVar = new C6777m();
        this.f28932a.execute(new Runnable(this, intent, mVar) {
            public final AbstractServiceC9011f f28915a;
            public final Intent f28916b;
            public final C6777m f28917c;

            {
                this.f28915a = this;
                this.f28916b = intent;
                this.f28917c = mVar;
            }

            @Override
            public void run() {
                this.f28915a.m10697g(this.f28916b, this.f28917c);
            }
        });
        return mVar.m19086a();
    }

    public boolean m10695i(int i) {
        return stopSelfResult(i);
    }

    @Override
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f28933b == null) {
            this.f28933b = new BinderC9045u0(new C9012a());
        }
        return this.f28933b;
    }

    @Override
    public void onDestroy() {
        this.f28932a.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f28934c) {
            this.f28930M = i2;
            this.f28931N++;
        }
        Intent c = mo10701c(intent);
        if (c == null) {
            m10702b(intent);
            return 2;
        }
        AbstractC6775l<Void> h = m10696h(c);
        if (h.mo19066o()) {
            m10702b(intent);
            return 2;
        }
        h.mo19079b(ExecutorC9007d.f28921a, new AbstractC6763f(this, intent) {
            public final AbstractServiceC9011f f28923a;
            public final Intent f28924b;

            {
                this.f28923a = this;
                this.f28924b = intent;
            }

            @Override
            public void mo10608a(AbstractC6775l lVar) {
                this.f28923a.m10698f(this.f28924b, lVar);
            }
        });
        return 3;
    }
}
