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
    public static final Object f28972c = new Object();
    @GuardedBy("lock")
    public static ServiceConnectionC9052x0 f28973d;
    public final Context f28974a;
    public final Executor f28975b = ExecutorC9014g.f28939a;

    public C9029n(Context context) {
        this.f28974a = context;
    }

    public static AbstractC6775l<Integer> m10662a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return m10661b(context, "com.google.firebase.MESSAGING_EVENT").m10604c(intent).mo19074h(ExecutorC9020j.f28952a, C9022k.f28954a);
    }

    public static ServiceConnectionC9052x0 m10661b(Context context, String str) {
        ServiceConnectionC9052x0 x0Var;
        synchronized (f28972c) {
            if (f28973d == null) {
                f28973d = new ServiceConnectionC9052x0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            x0Var = f28973d;
        }
        return x0Var;
    }

    public static final Integer m10660c(AbstractC6775l lVar) {
        return -1;
    }

    public static final Integer m10658e(AbstractC6775l lVar) {
        return 403;
    }

    public static final AbstractC6775l m10657f(Context context, Intent intent, AbstractC6775l lVar) {
        return (!C8251k.m13031g() || ((Integer) lVar.mo19070l()).intValue() != 402) ? lVar : m10662a(context, intent).mo19074h(ExecutorC9024l.f28961a, C9027m.f28967a);
    }

    public AbstractC6775l<Integer> m10656g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m10655h(this.f28974a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public AbstractC6775l<Integer> m10655h(final Context context, final Intent intent) {
        boolean z = false;
        if (C8251k.m13031g() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (!z || flags != 0) {
            return C6781o.m19053c(this.f28975b, new Callable(context, intent) {
                public final Context f28942a;
                public final Intent f28943b;

                {
                    this.f28942a = context;
                    this.f28943b = intent;
                }

                @Override
                public Object call() {
                    Integer valueOf;
                    valueOf = Integer.valueOf(C9019i0.m10688b().m10683g(this.f28942a, this.f28943b));
                    return valueOf;
                }
            }).mo19072j(this.f28975b, new AbstractC6757c(context, intent) {
                public final Context f28945a;
                public final Intent f28946b;

                {
                    this.f28945a = context;
                    this.f28946b = intent;
                }

                @Override
                public Object mo10597a(AbstractC6775l lVar) {
                    return C9029n.m10657f(this.f28945a, this.f28946b, lVar);
                }
            });
        }
        return m10662a(context, intent);
    }
}
