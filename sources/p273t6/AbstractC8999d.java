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
    public final C8646a f28895a;
    public final IntentFilter f28896b;
    public final Context f28897c;
    public final Set f28898d = new HashSet();
    public C8998c f28899e = null;
    public volatile boolean f28900f = false;

    public AbstractC8999d(C8646a aVar, IntentFilter intentFilter, Context context) {
        this.f28895a = aVar;
        this.f28896b = intentFilter;
        this.f28897c = C8676p.m11764a(context);
    }

    public abstract void mo10756a(Context context, Intent intent);

    public final void m10755b() {
        C8998c cVar;
        if ((this.f28900f || !this.f28898d.isEmpty()) && this.f28899e == null) {
            C8998c cVar2 = new C8998c(this, null);
            this.f28899e = cVar2;
            this.f28897c.registerReceiver(cVar2, this.f28896b);
        }
        if (!this.f28900f && this.f28898d.isEmpty() && (cVar = this.f28899e) != null) {
            this.f28897c.unregisterReceiver(cVar);
            this.f28899e = null;
        }
    }

    public final synchronized void m10754c(AbstractC8996a aVar) {
        this.f28895a.m11815d("registerListener", new Object[0]);
        C8682s.m11744a(aVar, "Registered Play Core listener should not be null.");
        this.f28898d.add(aVar);
        m10755b();
    }

    public final synchronized void m10753d(boolean z) {
        this.f28900f = z;
        m10755b();
    }

    public final synchronized void m10752e(AbstractC8996a aVar) {
        this.f28895a.m11815d("unregisterListener", new Object[0]);
        C8682s.m11744a(aVar, "Unregistered Play Core listener should not be null.");
        this.f28898d.remove(aVar);
        m10755b();
    }

    public final synchronized void m10751f(Object obj) {
        Iterator it = new HashSet(this.f28898d).iterator();
        while (it.hasNext()) {
            ((AbstractC8996a) it.next()).mo10757a(obj);
        }
    }

    public final synchronized boolean m10750g() {
        return this.f28899e != null;
    }
}
