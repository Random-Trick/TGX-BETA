package p099h2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1066a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071f2.AbstractC4234j;
import p071f2.C4250s;
import p087g2.AbstractC4450b;
import p087g2.AbstractC4454e;
import p087g2.C4458i;
import p145k2.AbstractC6043c;
import p145k2.C6044d;
import p198o2.C7554p;
import p215p2.C8002g;
import p243r2.AbstractC8354a;

public class C4925b implements AbstractC4454e, AbstractC6043c, AbstractC4450b {
    public static final String f16790R = AbstractC4234j.m28362f("GreedyScheduler");
    public C4923a f16792N;
    public boolean f16793O;
    public Boolean f16795Q;
    public final Context f16796a;
    public final C4458i f16797b;
    public final C6044d f16798c;
    public final Set<C7554p> f16791M = new HashSet();
    public final Object f16794P = new Object();

    public C4925b(Context context, C1066a aVar, AbstractC8354a aVar2, C4458i iVar) {
        this.f16796a = context;
        this.f16797b = iVar;
        this.f16798c = new C6044d(context, aVar2, this);
        this.f16792N = new C4923a(this, aVar.m38488k());
    }

    @Override
    public void mo21956a(C7554p... pVarArr) {
        if (this.f16795Q == null) {
            m24442g();
        }
        if (!this.f16795Q.booleanValue()) {
            AbstractC4234j.m28364c().mo28359d(f16790R, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m24441h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C7554p pVar : pVarArr) {
            long a = pVar.m15702a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f24144b == C4250s.EnumC4251a.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C4923a aVar = this.f16792N;
                    if (aVar != null) {
                        aVar.m24445a(pVar);
                    }
                } else if (pVar.m15701b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && pVar.f24152j.m28390h()) {
                        AbstractC4234j.m28364c().mo28361a(f16790R, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i < 24 || !pVar.f24152j.m28393e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f24143a);
                    } else {
                        AbstractC4234j.m28364c().mo28361a(f16790R, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    AbstractC4234j.m28364c().mo28361a(f16790R, String.format("Starting work for %s", pVar.f24143a), new Throwable[0]);
                    this.f16797b.m27583y(pVar.f24143a);
                }
            }
        }
        synchronized (this.f16794P) {
            if (!hashSet.isEmpty()) {
                AbstractC4234j.m28364c().mo28361a(f16790R, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f16791M.addAll(hashSet);
                this.f16798c.m21455d(this.f16791M);
            }
        }
    }

    @Override
    public void mo21458b(List<String> list) {
        for (String str : list) {
            AbstractC4234j.m28364c().mo28361a(f16790R, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f16797b.m27605B(str);
        }
    }

    @Override
    public boolean mo21954c() {
        return false;
    }

    @Override
    public void mo24443d(String str, boolean z) {
        m24440i(str);
    }

    @Override
    public void mo21952e(String str) {
        if (this.f16795Q == null) {
            m24442g();
        }
        if (!this.f16795Q.booleanValue()) {
            AbstractC4234j.m28364c().mo28359d(f16790R, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m24441h();
        AbstractC4234j.m28364c().mo28361a(f16790R, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C4923a aVar = this.f16792N;
        if (aVar != null) {
            aVar.m24444b(str);
        }
        this.f16797b.m27605B(str);
    }

    @Override
    public void mo21457f(List<String> list) {
        for (String str : list) {
            AbstractC4234j.m28364c().mo28361a(f16790R, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f16797b.m27583y(str);
        }
    }

    public final void m24442g() {
        this.f16795Q = Boolean.valueOf(C8002g.m13798b(this.f16796a, this.f16797b.m27595m()));
    }

    public final void m24441h() {
        if (!this.f16793O) {
            this.f16797b.m27591q().m27639c(this);
            this.f16793O = true;
        }
    }

    public final void m24440i(String str) {
        synchronized (this.f16794P) {
            Iterator<C7554p> it = this.f16791M.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7554p next = it.next();
                if (next.f24143a.equals(str)) {
                    AbstractC4234j.m28364c().mo28361a(f16790R, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f16791M.remove(next);
                    this.f16798c.m21455d(this.f16791M);
                    break;
                }
            }
        }
    }
}
