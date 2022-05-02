package p274t7;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public final class C9030n0 {
    public static WeakReference<C9030n0> f28973d;
    public final SharedPreferences f28974a;
    public C9023k0 f28975b;
    public final Executor f28976c;

    public C9030n0(SharedPreferences sharedPreferences, Executor executor) {
        this.f28976c = executor;
        this.f28974a = sharedPreferences;
    }

    public static synchronized C9030n0 m10655a(Context context, Executor executor) {
        synchronized (C9030n0.class) {
            WeakReference<C9030n0> weakReference = f28973d;
            C9030n0 n0Var = weakReference != null ? weakReference.get() : null;
            if (n0Var != null) {
                return n0Var;
            }
            C9030n0 n0Var2 = new C9030n0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            n0Var2.m10653c();
            f28973d = new WeakReference<>(n0Var2);
            return n0Var2;
        }
    }

    public synchronized C9028m0 m10654b() {
        return C9028m0.m10668a(this.f28975b.m10679e());
    }

    public final synchronized void m10653c() {
        this.f28975b = C9023k0.m10681c(this.f28974a, "topic_operation_queue", ",", this.f28976c);
    }

    public synchronized boolean m10652d(C9028m0 m0Var) {
        return this.f28975b.m10678f(m0Var.m10664e());
    }
}
