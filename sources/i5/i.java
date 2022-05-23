package i5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import n6.l;
import x5.a;
import x5.f;

public final class i {
    @GuardedBy("MessengerIpcClient.class")
    public static i f14013e;
    public final Context f14014a;
    public final ScheduledExecutorService f14015b;
    @GuardedBy("this")
    public j f14016c = new j(this);
    @GuardedBy("this")
    public int f14017d = 1;

    public i(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14015b = scheduledExecutorService;
        this.f14014a = context.getApplicationContext();
    }

    public static synchronized i c(Context context) {
        i iVar;
        synchronized (i.class) {
            if (f14013e == null) {
                f14013e = new i(context, a.a().a(1, new s5.a("MessengerIpcClient"), f.f26058b));
            }
            iVar = f14013e;
        }
        return iVar;
    }

    public final synchronized int a() {
        int i10;
        i10 = this.f14017d;
        this.f14017d = i10 + 1;
        return i10;
    }

    public final l<Void> d(int i10, Bundle bundle) {
        return e(new r(a(), 2, bundle));
    }

    public final synchronized <T> l<T> e(u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f14016c.e(uVar)) {
            j jVar = new j(this);
            this.f14016c = jVar;
            jVar.e(uVar);
        }
        return uVar.f14033b.a();
    }

    public final l<Bundle> g(int i10, Bundle bundle) {
        return e(new w(a(), 1, bundle));
    }
}
