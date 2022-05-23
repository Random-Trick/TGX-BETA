package u7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import n6.c;
import n6.l;
import n6.o;
import r5.k;

public class n {
    public static final Object f23657c = new Object();
    @GuardedBy("lock")
    public static x0 f23658d;
    public final Context f23659a;
    public final Executor f23660b = g.f23625a;

    public n(Context context) {
        this.f23659a = context;
    }

    public static l<Integer> a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).h(j.f23638a, k.f23640a);
    }

    public static x0 b(Context context, String str) {
        x0 x0Var;
        synchronized (f23657c) {
            if (f23658d == null) {
                f23658d = new x0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            x0Var = f23658d;
        }
        return x0Var;
    }

    public static final Integer c(l lVar) {
        return -1;
    }

    public static final Integer e(l lVar) {
        return 403;
    }

    public static final l f(Context context, Intent intent, l lVar) {
        return (!k.g() || ((Integer) lVar.l()).intValue() != 402) ? lVar : a(context, intent).h(l.f23647a, m.f23652a);
    }

    public l<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f23659a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public l<Integer> h(final Context context, final Intent intent) {
        boolean z10 = false;
        if (k.g() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (!z10 || flags != 0) {
            return o.c(this.f23660b, new Callable(context, intent) {
                public final Context f23628a;
                public final Intent f23629b;

                {
                    this.f23628a = context;
                    this.f23629b = intent;
                }

                @Override
                public Object call() {
                    Integer valueOf;
                    valueOf = Integer.valueOf(i0.b().g(this.f23628a, this.f23629b));
                    return valueOf;
                }
            }).j(this.f23660b, new c(context, intent) {
                public final Context f23631a;
                public final Intent f23632b;

                {
                    this.f23631a = context;
                    this.f23632b = intent;
                }

                @Override
                public Object a(l lVar) {
                    return n.f(this.f23631a, this.f23632b, lVar);
                }
            });
        }
        return a(context, intent);
    }
}
