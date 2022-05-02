package p274t7;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public final class C9030n0 {
    public static WeakReference<C9030n0> f28976d;
    public final SharedPreferences f28977a;
    public C9023k0 f28978b;
    public final Executor f28979c;

    public C9030n0(SharedPreferences sharedPreferences, Executor executor) {
        this.f28979c = executor;
        this.f28977a = sharedPreferences;
    }

    public static synchronized C9030n0 m10654a(Context context, Executor executor) {
        synchronized (C9030n0.class) {
            WeakReference<C9030n0> weakReference = f28976d;
            C9030n0 n0Var = weakReference != null ? weakReference.get() : null;
            if (n0Var != null) {
                return n0Var;
            }
            C9030n0 n0Var2 = new C9030n0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            n0Var2.m10652c();
            f28976d = new WeakReference<>(n0Var2);
            return n0Var2;
        }
    }

    public synchronized C9028m0 m10653b() {
        return C9028m0.m10667a(this.f28978b.m10678e());
    }

    public final synchronized void m10652c() {
        this.f28978b = C9023k0.m10680c(this.f28977a, "topic_operation_queue", ",", this.f28979c);
    }

    public synchronized boolean m10651d(C9028m0 m0Var) {
        return this.f28978b.m10677f(m0Var.m10663e());
    }
}
