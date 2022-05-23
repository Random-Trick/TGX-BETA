package h2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import f2.j;
import f2.s;
import g2.e;
import g2.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k2.c;
import k2.d;
import o2.p;
import p2.g;

public class b implements e, c, g2.b {
    public static final String R = j.f("GreedyScheduler");
    public a N;
    public boolean O;
    public Boolean Q;
    public final Context f12458a;
    public final i f12459b;
    public final d f12460c;
    public final Set<p> M = new HashSet();
    public final Object P = new Object();

    public b(Context context, a aVar, r2.a aVar2, i iVar) {
        this.f12458a = context;
        this.f12459b = iVar;
        this.f12460c = new d(context, aVar2, this);
        this.N = new a(this, aVar.k());
    }

    @Override
    public void a(p... pVarArr) {
        if (this.Q == null) {
            g();
        }
        if (!this.Q.booleanValue()) {
            j.c().d(R, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f18591b == s.a.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    a aVar = this.N;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && pVar.f18599j.h()) {
                        j.c().a(R, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i10 < 24 || !pVar.f18599j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f18590a);
                    } else {
                        j.c().a(R, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    j.c().a(R, String.format("Starting work for %s", pVar.f18590a), new Throwable[0]);
                    this.f12459b.y(pVar.f18590a);
                }
            }
        }
        synchronized (this.P) {
            if (!hashSet.isEmpty()) {
                j.c().a(R, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.M.addAll(hashSet);
                this.f12460c.d(this.M);
            }
        }
    }

    @Override
    public void b(List<String> list) {
        for (String str : list) {
            j.c().a(R, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f12459b.B(str);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public void d(String str, boolean z10) {
        i(str);
    }

    @Override
    public void e(String str) {
        if (this.Q == null) {
            g();
        }
        if (!this.Q.booleanValue()) {
            j.c().d(R, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        j.c().a(R, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.N;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f12459b.B(str);
    }

    @Override
    public void f(List<String> list) {
        for (String str : list) {
            j.c().a(R, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f12459b.y(str);
        }
    }

    public final void g() {
        this.Q = Boolean.valueOf(g.b(this.f12458a, this.f12459b.m()));
    }

    public final void h() {
        if (!this.O) {
            this.f12459b.q().c(this);
            this.O = true;
        }
    }

    public final void i(String str) {
        synchronized (this.P) {
            Iterator<p> it = this.M.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f18590a.equals(str)) {
                    j.c().a(R, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.M.remove(next);
                    this.f12460c.d(this.M);
                    break;
                }
            }
        }
    }
}
