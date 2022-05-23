package m5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j5.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import k5.f;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import w5.i;

public final class k0 implements Handler.Callback {
    public final Handler Q;
    @NotOnlyInitialized
    public final j0 f17219a;
    public final ArrayList<f.b> f17220b = new ArrayList<>();
    public final ArrayList<f.b> f17221c = new ArrayList<>();
    public final ArrayList<f.c> M = new ArrayList<>();
    public volatile boolean N = false;
    public final AtomicInteger O = new AtomicInteger(0);
    public boolean P = false;
    public final Object R = new Object();

    public k0(Looper looper, j0 j0Var) {
        this.f17219a = j0Var;
        this.Q = new i(looper, this);
    }

    public final void a() {
        this.N = false;
        this.O.incrementAndGet();
    }

    public final void b() {
        this.N = true;
    }

    public final void c(Bundle bundle) {
        r.e(this.Q, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.R) {
            boolean z10 = true;
            r.m(!this.P);
            this.Q.removeMessages(1);
            this.P = true;
            if (this.f17221c.size() != 0) {
                z10 = false;
            }
            r.m(z10);
            ArrayList arrayList = new ArrayList(this.f17220b);
            int i10 = this.O.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.b bVar = (f.b) it.next();
                if (!this.N || !this.f17219a.a() || this.O.get() != i10) {
                    break;
                } else if (!this.f17221c.contains(bVar)) {
                    bVar.t(bundle);
                }
            }
            this.f17221c.clear();
            this.P = false;
        }
    }

    public final void d(int i10) {
        r.e(this.Q, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.Q.removeMessages(1);
        synchronized (this.R) {
            this.P = true;
            ArrayList arrayList = new ArrayList(this.f17220b);
            int i11 = this.O.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.b bVar = (f.b) it.next();
                if (!this.N || this.O.get() != i11) {
                    break;
                } else if (this.f17220b.contains(bVar)) {
                    bVar.q(i10);
                }
            }
            this.f17221c.clear();
            this.P = false;
        }
    }

    public final void e(a aVar) {
        r.e(this.Q, "onConnectionFailure must only be called on the Handler thread");
        this.Q.removeMessages(1);
        synchronized (this.R) {
            ArrayList arrayList = new ArrayList(this.M);
            int i10 = this.O.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.c cVar = (f.c) it.next();
                if (this.N && this.O.get() == i10) {
                    if (this.M.contains(cVar)) {
                        cVar.r(aVar);
                    }
                }
                return;
            }
        }
    }

    public final void f(f.b bVar) {
        r.k(bVar);
        synchronized (this.R) {
            if (this.f17220b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
                sb2.append("registerConnectionCallbacks(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f17220b.add(bVar);
            }
        }
        if (this.f17219a.a()) {
            Handler handler = this.Q;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(f.c cVar) {
        r.k(cVar);
        synchronized (this.R) {
            if (this.M.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 67);
                sb2.append("registerConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.M.add(cVar);
            }
        }
    }

    public final void h(f.c cVar) {
        r.k(cVar);
        synchronized (this.R) {
            if (!this.M.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 57);
                sb2.append("unregisterConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" not found");
                Log.w("GmsClientEvents", sb2.toString());
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            f.b bVar = (f.b) message.obj;
            synchronized (this.R) {
                if (this.N && this.f17219a.a() && this.f17220b.contains(bVar)) {
                    bVar.t(null);
                }
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i10);
        Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
        return false;
    }
}
