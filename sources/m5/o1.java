package m5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

public final class o1 implements Handler.Callback {
    public final p1 f17239a;

    public o1(p1 p1Var, m1 m1Var) {
        this.f17239a = p1Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f17239a.f17243d;
            synchronized (hashMap) {
                l1 l1Var = (l1) message.obj;
                hashMap2 = this.f17239a.f17243d;
                n1 n1Var = (n1) hashMap2.get(l1Var);
                if (n1Var != null && n1Var.h()) {
                    if (n1Var.e()) {
                        n1Var.b("GmsClientSupervisor");
                    }
                    hashMap3 = this.f17239a.f17243d;
                    hashMap3.remove(l1Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            hashMap4 = this.f17239a.f17243d;
            synchronized (hashMap4) {
                l1 l1Var2 = (l1) message.obj;
                hashMap5 = this.f17239a.f17243d;
                n1 n1Var2 = (n1) hashMap5.get(l1Var2);
                if (n1Var2 != null && n1Var2.f() == 3) {
                    String valueOf = String.valueOf(l1Var2);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName j10 = n1Var2.j();
                    if (j10 == null) {
                        j10 = l1Var2.b();
                    }
                    if (j10 == null) {
                        String a10 = l1Var2.a();
                        r.k(a10);
                        j10 = new ComponentName(a10, "unknown");
                    }
                    n1Var2.onServiceDisconnected(j10);
                }
            }
            return true;
        }
    }
}
