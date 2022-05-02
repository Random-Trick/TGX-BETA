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
    public int f28933M;
    public Binder f28936b;
    public final ExecutorService f28935a = C9031o.m10648c();
    public final Object f28937c = new Object();
    public int f28934N = 0;

    public class C9012a implements BinderC9045u0.AbstractC9046a {
        public C9012a() {
        }

        @Override
        public AbstractC6775l<Void> mo10609a(Intent intent) {
            return AbstractServiceC9011f.this.m10695h(intent);
        }
    }

    public final void m10701b(Intent intent) {
        if (intent != null) {
            C9039r0.m10615b(intent);
        }
        synchronized (this.f28937c) {
            int i = this.f28934N - 1;
            this.f28934N = i;
            if (i == 0) {
                m10694i(this.f28933M);
            }
        }
    }

    public Intent mo10700c(Intent intent) {
        return intent;
    }

    public abstract void mo10699d(Intent intent);

    public boolean m10698e(Intent intent) {
        return false;
    }

    public final void m10697f(Intent intent, AbstractC6775l lVar) {
        m10701b(intent);
    }

    public final void m10696g(Intent intent, C6777m mVar) {
        try {
            mo10699d(intent);
        } finally {
            mVar.m19085c(null);
        }
    }

    public final AbstractC6775l<Void> m10695h(final Intent intent) {
        if (m10698e(intent)) {
            return C6781o.m19050f(null);
        }
        final C6777m mVar = new C6777m();
        this.f28935a.execute(new Runnable(this, intent, mVar) {
            public final AbstractServiceC9011f f28918a;
            public final Intent f28919b;
            public final C6777m f28920c;

            {
                this.f28918a = this;
                this.f28919b = intent;
                this.f28920c = mVar;
            }

            @Override
            public void run() {
                this.f28918a.m10696g(this.f28919b, this.f28920c);
            }
        });
        return mVar.m19087a();
    }

    public boolean m10694i(int i) {
        return stopSelfResult(i);
    }

    @Override
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f28936b == null) {
            this.f28936b = new BinderC9045u0(new C9012a());
        }
        return this.f28936b;
    }

    @Override
    public void onDestroy() {
        this.f28935a.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f28937c) {
            this.f28933M = i2;
            this.f28934N++;
        }
        Intent c = mo10700c(intent);
        if (c == null) {
            m10701b(intent);
            return 2;
        }
        AbstractC6775l<Void> h = m10695h(c);
        if (h.mo19067o()) {
            m10701b(intent);
            return 2;
        }
        h.mo19080b(ExecutorC9007d.f28924a, new AbstractC6763f(this, intent) {
            public final AbstractServiceC9011f f28926a;
            public final Intent f28927b;

            {
                this.f28926a = this;
                this.f28927b = intent;
            }

            @Override
            public void mo10607a(AbstractC6775l lVar) {
                this.f28926a.m10697f(this.f28927b, lVar);
            }
        });
        return 3;
    }
}
