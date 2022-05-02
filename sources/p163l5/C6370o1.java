package p163l5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

public final class C6370o1 implements Handler.Callback {
    public final C6373p1 f19994a;

    public C6370o1(C6373p1 p1Var, C6364m1 m1Var) {
        this.f19994a = p1Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.f19994a.f20003d;
            synchronized (hashMap) {
                C6361l1 l1Var = (C6361l1) message.obj;
                hashMap2 = this.f19994a.f20003d;
                ServiceConnectionC6367n1 n1Var = (ServiceConnectionC6367n1) hashMap2.get(l1Var);
                if (n1Var != null && n1Var.m20536h()) {
                    if (n1Var.m20539e()) {
                        n1Var.m20542b("GmsClientSupervisor");
                    }
                    hashMap3 = this.f19994a.f20003d;
                    hashMap3.remove(l1Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            hashMap4 = this.f19994a.f20003d;
            synchronized (hashMap4) {
                C6361l1 l1Var2 = (C6361l1) message.obj;
                hashMap5 = this.f19994a.f20003d;
                ServiceConnectionC6367n1 n1Var2 = (ServiceConnectionC6367n1) hashMap5.get(l1Var2);
                if (n1Var2 != null && n1Var2.m20538f() == 3) {
                    String valueOf = String.valueOf(l1Var2);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName j = n1Var2.m20534j();
                    if (j == null) {
                        j = l1Var2.m20550b();
                    }
                    if (j == null) {
                        String a = l1Var2.m20551a();
                        C6378r.m20506k(a);
                        j = new ComponentName(a, "unknown");
                    }
                    n1Var2.onServiceDisconnected(j);
                }
            }
            return true;
        }
    }
}
