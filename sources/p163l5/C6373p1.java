package p163l5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p218p5.C8050a;
import p327x5.HandlerC10104h;

public final class C6373p1 extends AbstractC6349i {
    public final Context f20004e;
    public final Handler f20005f;
    @GuardedBy("connectionStatus")
    public final HashMap<C6361l1, ServiceConnectionC6367n1> f20003d = new HashMap<>();
    public final C8050a f20006g = C8050a.m13701b();
    public final long f20007h = 5000;
    public final long f20008i = 300000;

    public C6373p1(Context context) {
        this.f20004e = context.getApplicationContext();
        this.f20005f = new HandlerC10104h(context.getMainLooper(), new C6370o1(this, null));
    }

    @Override
    public final boolean mo20532d(C6361l1 l1Var, ServiceConnection serviceConnection, String str) {
        boolean e;
        C6378r.m20506l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f20003d) {
            ServiceConnectionC6367n1 n1Var = this.f20003d.get(l1Var);
            if (n1Var == null) {
                n1Var = new ServiceConnectionC6367n1(this, l1Var);
                n1Var.m20542c(serviceConnection, serviceConnection, str);
                n1Var.m20544a(str);
                this.f20003d.put(l1Var, n1Var);
            } else {
                this.f20005f.removeMessages(0, l1Var);
                if (!n1Var.m20538g(serviceConnection)) {
                    n1Var.m20542c(serviceConnection, serviceConnection, str);
                    int f = n1Var.m20539f();
                    if (f == 1) {
                        serviceConnection.onServiceConnected(n1Var.m20535j(), n1Var.m20536i());
                    } else if (f == 2) {
                        n1Var.m20544a(str);
                    }
                } else {
                    String valueOf = String.valueOf(l1Var);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            e = n1Var.m20540e();
        }
        return e;
    }

    @Override
    public final void mo20531e(C6361l1 l1Var, ServiceConnection serviceConnection, String str) {
        C6378r.m20506l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f20003d) {
            ServiceConnectionC6367n1 n1Var = this.f20003d.get(l1Var);
            if (n1Var == null) {
                String valueOf = String.valueOf(l1Var);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            } else if (n1Var.m20538g(serviceConnection)) {
                n1Var.m20541d(serviceConnection, str);
                if (n1Var.m20537h()) {
                    this.f20005f.sendMessageDelayed(this.f20005f.obtainMessage(0, l1Var), this.f20007h);
                }
            } else {
                String valueOf2 = String.valueOf(l1Var);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 76);
                sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb3.append(valueOf2);
                throw new IllegalStateException(sb3.toString());
            }
        }
    }
}
