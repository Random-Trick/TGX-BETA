package p273t6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p262s6.C8646a;
import p262s6.C8676p;
import p262s6.C8682s;

public abstract class AbstractC8999d {
    public final C8646a f28898a;
    public final IntentFilter f28899b;
    public final Context f28900c;
    public final Set f28901d = new HashSet();
    public C8998c f28902e = null;
    public volatile boolean f28903f = false;

    public AbstractC8999d(C8646a aVar, IntentFilter intentFilter, Context context) {
        this.f28898a = aVar;
        this.f28899b = intentFilter;
        this.f28900c = C8676p.m11763a(context);
    }

    public abstract void mo10755a(Context context, Intent intent);

    public final void m10754b() {
        C8998c cVar;
        if ((this.f28903f || !this.f28901d.isEmpty()) && this.f28902e == null) {
            C8998c cVar2 = new C8998c(this, null);
            this.f28902e = cVar2;
            this.f28900c.registerReceiver(cVar2, this.f28899b);
        }
        if (!this.f28903f && this.f28901d.isEmpty() && (cVar = this.f28902e) != null) {
            this.f28900c.unregisterReceiver(cVar);
            this.f28902e = null;
        }
    }

    public final synchronized void m10753c(AbstractC8996a aVar) {
        this.f28898a.m11814d("registerListener", new Object[0]);
        C8682s.m11743a(aVar, "Registered Play Core listener should not be null.");
        this.f28901d.add(aVar);
        m10754b();
    }

    public final synchronized void m10752d(boolean z) {
        this.f28903f = z;
        m10754b();
    }

    public final synchronized void m10751e(AbstractC8996a aVar) {
        this.f28898a.m11814d("unregisterListener", new Object[0]);
        C8682s.m11743a(aVar, "Unregistered Play Core listener should not be null.");
        this.f28901d.remove(aVar);
        m10754b();
    }

    public final synchronized void m10750f(Object obj) {
        Iterator it = new HashSet(this.f28901d).iterator();
        while (it.hasNext()) {
            ((AbstractC8996a) it.next()).mo10756a(obj);
        }
    }

    public final synchronized boolean m10749g() {
        return this.f28902e != null;
    }
}
