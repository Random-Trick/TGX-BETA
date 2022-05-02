package p102h5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p177m6.AbstractC6775l;
import p246r5.ThreadFactoryC8371a;
import p312w5.C9979a;
import p312w5.C9984f;

public final class C4969i {
    @GuardedBy("MessengerIpcClient.class")
    public static C4969i f16899e;
    public final Context f16900a;
    public final ScheduledExecutorService f16901b;
    @GuardedBy("this")
    public ServiceConnectionC4970j f16902c = new ServiceConnectionC4970j(this);
    @GuardedBy("this")
    public int f16903d = 1;

    public C4969i(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16901b = scheduledExecutorService;
        this.f16900a = context.getApplicationContext();
    }

    public static synchronized C4969i m24360c(Context context) {
        C4969i iVar;
        synchronized (C4969i.class) {
            if (f16899e == null) {
                f16899e = new C4969i(context, C9979a.m6312a().mo6311a(1, new ThreadFactoryC8371a("MessengerIpcClient"), C9984f.f32468b));
            }
            iVar = f16899e;
        }
        return iVar;
    }

    public final synchronized int m24362a() {
        int i;
        i = this.f16903d;
        this.f16903d = i + 1;
        return i;
    }

    public final AbstractC6775l<Void> m24359d(int i, Bundle bundle) {
        return m24358e(new C4978r(m24362a(), 2, bundle));
    }

    public final synchronized <T> AbstractC6775l<T> m24358e(AbstractC4981u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f16902c.m24351e(uVar)) {
            ServiceConnectionC4970j jVar = new ServiceConnectionC4970j(this);
            this.f16902c = jVar;
            jVar.m24351e(uVar);
        }
        return uVar.f16922b.m19087a();
    }

    public final AbstractC6775l<Bundle> m24356g(int i, Bundle bundle) {
        return m24358e(new C4983w(m24362a(), 1, bundle));
    }
}
