package m5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import q5.a;
import y5.h;

public final class p1 extends i {
    public final Context f17244e;
    public final Handler f17245f;
    @GuardedBy("connectionStatus")
    public final HashMap<l1, n1> f17243d = new HashMap<>();
    public final a f17246g = a.b();
    public final long f17247h = 5000;
    public final long f17248i = 300000;

    public p1(Context context) {
        this.f17244e = context.getApplicationContext();
        this.f17245f = new h(context.getMainLooper(), new o1(this, null));
    }

    @Override
    public final boolean d(l1 l1Var, ServiceConnection serviceConnection, String str) {
        boolean e10;
        r.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17243d) {
            n1 n1Var = this.f17243d.get(l1Var);
            if (n1Var == null) {
                n1Var = new n1(this, l1Var);
                n1Var.c(serviceConnection, serviceConnection, str);
                n1Var.a(str);
                this.f17243d.put(l1Var, n1Var);
            } else {
                this.f17245f.removeMessages(0, l1Var);
                if (!n1Var.g(serviceConnection)) {
                    n1Var.c(serviceConnection, serviceConnection, str);
                    int f10 = n1Var.f();
                    if (f10 == 1) {
                        serviceConnection.onServiceConnected(n1Var.j(), n1Var.i());
                    } else if (f10 == 2) {
                        n1Var.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(l1Var);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            e10 = n1Var.e();
        }
        return e10;
    }

    @Override
    public final void e(l1 l1Var, ServiceConnection serviceConnection, String str) {
        r.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17243d) {
            n1 n1Var = this.f17243d.get(l1Var);
            if (n1Var == null) {
                String valueOf = String.valueOf(l1Var);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            } else if (n1Var.g(serviceConnection)) {
                n1Var.d(serviceConnection, str);
                if (n1Var.h()) {
                    this.f17245f.sendMessageDelayed(this.f17245f.obtainMessage(0, l1Var), this.f17247h);
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
