package u7;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public final class n0 {
    public static WeakReference<n0> f23661d;
    public final SharedPreferences f23662a;
    public k0 f23663b;
    public final Executor f23664c;

    public n0(SharedPreferences sharedPreferences, Executor executor) {
        this.f23664c = executor;
        this.f23662a = sharedPreferences;
    }

    public static synchronized n0 a(Context context, Executor executor) {
        synchronized (n0.class) {
            WeakReference<n0> weakReference = f23661d;
            n0 n0Var = weakReference != null ? weakReference.get() : null;
            if (n0Var != null) {
                return n0Var;
            }
            n0 n0Var2 = new n0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            n0Var2.c();
            f23661d = new WeakReference<>(n0Var2);
            return n0Var2;
        }
    }

    public synchronized m0 b() {
        return m0.a(this.f23663b.e());
    }

    public final synchronized void c() {
        this.f23663b = k0.c(this.f23662a, "topic_operation_queue", ",", this.f23664c);
    }

    public synchronized boolean d(m0 m0Var) {
        return this.f23663b.f(m0Var.e());
    }
}
