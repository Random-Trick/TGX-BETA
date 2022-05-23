package u6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import t6.a;
import t6.p;
import t6.s;

public abstract class d {
    public final a f23586a;
    public final IntentFilter f23587b;
    public final Context f23588c;
    public final Set f23589d = new HashSet();
    public c f23590e = null;
    public volatile boolean f23591f = false;

    public d(a aVar, IntentFilter intentFilter, Context context) {
        this.f23586a = aVar;
        this.f23587b = intentFilter;
        this.f23588c = p.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        c cVar;
        if ((this.f23591f || !this.f23589d.isEmpty()) && this.f23590e == null) {
            c cVar2 = new c(this, null);
            this.f23590e = cVar2;
            this.f23588c.registerReceiver(cVar2, this.f23587b);
        }
        if (!this.f23591f && this.f23589d.isEmpty() && (cVar = this.f23590e) != null) {
            this.f23588c.unregisterReceiver(cVar);
            this.f23590e = null;
        }
    }

    public final synchronized void c(a aVar) {
        this.f23586a.d("registerListener", new Object[0]);
        s.a(aVar, "Registered Play Core listener should not be null.");
        this.f23589d.add(aVar);
        b();
    }

    public final synchronized void d(boolean z10) {
        this.f23591f = z10;
        b();
    }

    public final synchronized void e(a aVar) {
        this.f23586a.d("unregisterListener", new Object[0]);
        s.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f23589d.remove(aVar);
        b();
    }

    public final synchronized void f(Object obj) {
        Iterator it = new HashSet(this.f23589d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(obj);
        }
    }

    public final synchronized boolean g() {
        return this.f23590e != null;
    }
}
