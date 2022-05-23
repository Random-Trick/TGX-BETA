package m5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import q5.a;

public final class n1 implements ServiceConnection, q1 {
    public IBinder M;
    public final l1 N;
    public ComponentName O;
    public final p1 P;
    public final Map<ServiceConnection, ServiceConnection> f17230a = new HashMap();
    public int f17231b = 2;
    public boolean f17232c;

    public n1(p1 p1Var, l1 l1Var) {
        this.P = p1Var;
        this.N = l1Var;
    }

    public final void a(String str) {
        a aVar;
        Context context;
        Context context2;
        a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        this.f17231b = 3;
        aVar = this.P.f17246g;
        context = this.P.f17244e;
        l1 l1Var = this.N;
        context2 = this.P.f17244e;
        boolean d10 = aVar.d(context, str, l1Var.d(context2), this, this.N.c());
        this.f17232c = d10;
        if (d10) {
            handler = this.P.f17245f;
            Message obtainMessage = handler.obtainMessage(1, this.N);
            handler2 = this.P.f17245f;
            j10 = this.P.f17248i;
            handler2.sendMessageDelayed(obtainMessage, j10);
            return;
        }
        this.f17231b = 2;
        try {
            aVar2 = this.P.f17246g;
            context3 = this.P.f17244e;
            aVar2.c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void b(String str) {
        Handler handler;
        a aVar;
        Context context;
        handler = this.P.f17245f;
        handler.removeMessages(1, this.N);
        aVar = this.P.f17246g;
        context = this.P.f17244e;
        aVar.c(context, this);
        this.f17232c = false;
        this.f17231b = 2;
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f17230a.put(serviceConnection, serviceConnection2);
    }

    public final void d(ServiceConnection serviceConnection, String str) {
        this.f17230a.remove(serviceConnection);
    }

    public final boolean e() {
        return this.f17232c;
    }

    public final int f() {
        return this.f17231b;
    }

    public final boolean g(ServiceConnection serviceConnection) {
        return this.f17230a.containsKey(serviceConnection);
    }

    public final boolean h() {
        return this.f17230a.isEmpty();
    }

    public final IBinder i() {
        return this.M;
    }

    public final ComponentName j() {
        return this.O;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.P.f17243d;
        synchronized (hashMap) {
            handler = this.P.f17245f;
            handler.removeMessages(1, this.N);
            this.M = iBinder;
            this.O = componentName;
            for (ServiceConnection serviceConnection : this.f17230a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f17231b = 1;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.P.f17243d;
        synchronized (hashMap) {
            handler = this.P.f17245f;
            handler.removeMessages(1, this.N);
            this.M = null;
            this.O = componentName;
            for (ServiceConnection serviceConnection : this.f17230a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f17231b = 2;
        }
    }
}
