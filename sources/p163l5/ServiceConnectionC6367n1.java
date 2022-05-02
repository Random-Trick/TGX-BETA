package p163l5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import p218p5.C8050a;

public final class ServiceConnectionC6367n1 implements ServiceConnection, AbstractC6377q1 {
    public IBinder f19980M;
    public final C6361l1 f19981N;
    public ComponentName f19982O;
    public final C6373p1 f19983P;
    public final Map<ServiceConnection, ServiceConnection> f19984a = new HashMap();
    public int f19985b = 2;
    public boolean f19986c;

    public ServiceConnectionC6367n1(C6373p1 p1Var, C6361l1 l1Var) {
        this.f19983P = p1Var;
        this.f19981N = l1Var;
    }

    public final void m20543a(String str) {
        C8050a aVar;
        Context context;
        Context context2;
        C8050a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f19985b = 3;
        aVar = this.f19983P.f20006g;
        context = this.f19983P.f20004e;
        C6361l1 l1Var = this.f19981N;
        context2 = this.f19983P.f20004e;
        boolean d = aVar.m13700d(context, str, l1Var.m20548d(context2), this, this.f19981N.m20549c());
        this.f19986c = d;
        if (d) {
            handler = this.f19983P.f20005f;
            Message obtainMessage = handler.obtainMessage(1, this.f19981N);
            handler2 = this.f19983P.f20005f;
            j = this.f19983P.f20008i;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.f19985b = 2;
        try {
            aVar2 = this.f19983P.f20006g;
            context3 = this.f19983P.f20004e;
            aVar2.m13701c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void m20542b(String str) {
        Handler handler;
        C8050a aVar;
        Context context;
        handler = this.f19983P.f20005f;
        handler.removeMessages(1, this.f19981N);
        aVar = this.f19983P.f20006g;
        context = this.f19983P.f20004e;
        aVar.m13701c(context, this);
        this.f19986c = false;
        this.f19985b = 2;
    }

    public final void m20541c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f19984a.put(serviceConnection, serviceConnection2);
    }

    public final void m20540d(ServiceConnection serviceConnection, String str) {
        this.f19984a.remove(serviceConnection);
    }

    public final boolean m20539e() {
        return this.f19986c;
    }

    public final int m20538f() {
        return this.f19985b;
    }

    public final boolean m20537g(ServiceConnection serviceConnection) {
        return this.f19984a.containsKey(serviceConnection);
    }

    public final boolean m20536h() {
        return this.f19984a.isEmpty();
    }

    public final IBinder m20535i() {
        return this.f19980M;
    }

    public final ComponentName m20534j() {
        return this.f19982O;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f19983P.f20003d;
        synchronized (hashMap) {
            handler = this.f19983P.f20005f;
            handler.removeMessages(1, this.f19981N);
            this.f19980M = iBinder;
            this.f19982O = componentName;
            for (ServiceConnection serviceConnection : this.f19984a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f19985b = 1;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f19983P.f20003d;
        synchronized (hashMap) {
            handler = this.f19983P.f20005f;
            handler.removeMessages(1, this.f19981N);
            this.f19980M = null;
            this.f19982O = componentName;
            for (ServiceConnection serviceConnection : this.f19984a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f19985b = 2;
        }
    }
}
