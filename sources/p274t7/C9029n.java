package p274t7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p177m6.AbstractC6757c;
import p177m6.AbstractC6775l;
import p177m6.C6781o;
import p232q5.C8251k;

public class C9029n {
    public static final Object f28969c = new Object();
    @GuardedBy("lock")
    public static ServiceConnectionC9052x0 f28970d;
    public final Context f28971a;
    public final Executor f28972b = ExecutorC9014g.f28936a;

    public C9029n(Context context) {
        this.f28971a = context;
    }

    public static AbstractC6775l<Integer> m10663a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return m10662b(context, "com.google.firebase.MESSAGING_EVENT").m10605c(intent).mo19073h(ExecutorC9020j.f28949a, C9022k.f28951a);
    }

    public static ServiceConnectionC9052x0 m10662b(Context context, String str) {
        ServiceConnectionC9052x0 x0Var;
        synchronized (f28969c) {
            if (f28970d == null) {
                f28970d = new ServiceConnectionC9052x0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            x0Var = f28970d;
        }
        return x0Var;
    }

    public static final Integer m10661c(AbstractC6775l lVar) {
        return -1;
    }

    public static final Integer m10659e(AbstractC6775l lVar) {
        return 403;
    }

    public static final AbstractC6775l m10658f(Context context, Intent intent, AbstractC6775l lVar) {
        return (!C8251k.m13032g() || ((Integer) lVar.mo19069l()).intValue() != 402) ? lVar : m10663a(context, intent).mo19073h(ExecutorC9024l.f28958a, C9027m.f28964a);
    }

    public AbstractC6775l<Integer> m10657g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m10656h(this.f28971a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public AbstractC6775l<Integer> m10656h(final Context context, final Intent intent) {
        boolean z = false;
        if (C8251k.m13032g() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (!z || flags != 0) {
            return C6781o.m19052c(this.f28972b, new Callable(context, intent) {
                public final Context f28939a;
                public final Intent f28940b;

                {
                    this.f28939a = context;
                    this.f28940b = intent;
                }

                @Override
                public Object call() {
                    Integer valueOf;
                    valueOf = Integer.valueOf(C9019i0.m10689b().m10684g(this.f28939a, this.f28940b));
                    return valueOf;
                }
            }).mo19071j(this.f28972b, new AbstractC6757c(context, intent) {
                public final Context f28942a;
                public final Intent f28943b;

                {
                    this.f28942a = context;
                    this.f28943b = intent;
                }

                @Override
                public Object mo10598a(AbstractC6775l lVar) {
                    return C9029n.m10658f(this.f28942a, this.f28943b, lVar);
                }
            });
        }
        return m10663a(context, intent);
    }
}
