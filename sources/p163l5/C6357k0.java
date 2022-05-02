package p163l5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p118i5.C5217a;
import p133j5.AbstractC5867f;
import p299v5.HandlerC9849i;

public final class C6357k0 implements Handler.Callback {
    public final Handler f19967Q;
    @NotOnlyInitialized
    public final AbstractC6353j0 f19969a;
    public final ArrayList<AbstractC5867f.AbstractC5869b> f19970b = new ArrayList<>();
    public final ArrayList<AbstractC5867f.AbstractC5869b> f19971c = new ArrayList<>();
    public final ArrayList<AbstractC5867f.AbstractC5870c> f19963M = new ArrayList<>();
    public volatile boolean f19964N = false;
    public final AtomicInteger f19965O = new AtomicInteger(0);
    public boolean f19966P = false;
    public final Object f19968R = new Object();

    public C6357k0(Looper looper, AbstractC6353j0 j0Var) {
        this.f19969a = j0Var;
        this.f19967Q = new HandlerC9849i(looper, this);
    }

    public final void m20564a() {
        this.f19964N = false;
        this.f19965O.incrementAndGet();
    }

    public final void m20563b() {
        this.f19964N = true;
    }

    public final void m20562c(Bundle bundle) {
        C6378r.m20513e(this.f19967Q, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f19968R) {
            boolean z = true;
            C6378r.m20505m(!this.f19966P);
            this.f19967Q.removeMessages(1);
            this.f19966P = true;
            if (this.f19971c.size() != 0) {
                z = false;
            }
            C6378r.m20505m(z);
            ArrayList arrayList = new ArrayList(this.f19970b);
            int i = this.f19965O.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC5867f.AbstractC5869b bVar = (AbstractC5867f.AbstractC5869b) it.next();
                if (!this.f19964N || !this.f19969a.mo20566a() || this.f19965O.get() != i) {
                    break;
                } else if (!this.f19971c.contains(bVar)) {
                    bVar.mo21080t(bundle);
                }
            }
            this.f19971c.clear();
            this.f19966P = false;
        }
    }

    public final void m20561d(int i) {
        C6378r.m20513e(this.f19967Q, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f19967Q.removeMessages(1);
        synchronized (this.f19968R) {
            this.f19966P = true;
            ArrayList arrayList = new ArrayList(this.f19970b);
            int i2 = this.f19965O.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC5867f.AbstractC5869b bVar = (AbstractC5867f.AbstractC5869b) it.next();
                if (!this.f19964N || this.f19965O.get() != i2) {
                    break;
                } else if (this.f19970b.contains(bVar)) {
                    bVar.mo21081q(i);
                }
            }
            this.f19971c.clear();
            this.f19966P = false;
        }
    }

    public final void m20560e(C5217a aVar) {
        C6378r.m20513e(this.f19967Q, "onConnectionFailure must only be called on the Handler thread");
        this.f19967Q.removeMessages(1);
        synchronized (this.f19968R) {
            ArrayList arrayList = new ArrayList(this.f19963M);
            int i = this.f19965O.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC5867f.AbstractC5870c cVar = (AbstractC5867f.AbstractC5870c) it.next();
                if (this.f19964N && this.f19965O.get() == i) {
                    if (this.f19963M.contains(cVar)) {
                        cVar.mo11483s(aVar);
                    }
                }
                return;
            }
        }
    }

    public final void m20559f(AbstractC5867f.AbstractC5869b bVar) {
        C6378r.m20507k(bVar);
        synchronized (this.f19968R) {
            if (this.f19970b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
                sb2.append("registerConnectionCallbacks(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f19970b.add(bVar);
            }
        }
        if (this.f19969a.mo20566a()) {
            Handler handler = this.f19967Q;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void m20558g(AbstractC5867f.AbstractC5870c cVar) {
        C6378r.m20507k(cVar);
        synchronized (this.f19968R) {
            if (this.f19963M.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 67);
                sb2.append("registerConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f19963M.add(cVar);
            }
        }
    }

    public final void m20557h(AbstractC5867f.AbstractC5870c cVar) {
        C6378r.m20507k(cVar);
        synchronized (this.f19968R) {
            if (!this.f19963M.remove(cVar)) {
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
        int i = message.what;
        if (i == 1) {
            AbstractC5867f.AbstractC5869b bVar = (AbstractC5867f.AbstractC5869b) message.obj;
            synchronized (this.f19968R) {
                if (this.f19964N && this.f19969a.mo20566a() && this.f19970b.contains(bVar)) {
                    bVar.mo21080t(null);
                }
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i);
        Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
        return false;
    }
}
