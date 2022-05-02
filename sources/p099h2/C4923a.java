package p099h2;

import java.util.HashMap;
import java.util.Map;
import p071f2.AbstractC4234j;
import p071f2.AbstractC4248q;
import p198o2.C7554p;

public class C4923a {
    public static final String f16784d = AbstractC4234j.m28360f("DelayedWorkTracker");
    public final C4925b f16785a;
    public final AbstractC4248q f16786b;
    public final Map<String, Runnable> f16787c = new HashMap();

    public class RunnableC4924a implements Runnable {
        public final C7554p f16788a;

        public RunnableC4924a(C7554p pVar) {
            this.f16788a = pVar;
        }

        @Override
        public void run() {
            AbstractC4234j.m28362c().mo28359a(C4923a.f16784d, String.format("Scheduling work %s", this.f16788a.f24140a), new Throwable[0]);
            C4923a.this.f16785a.mo21955a(this.f16788a);
        }
    }

    public C4923a(C4925b bVar, AbstractC4248q qVar) {
        this.f16785a = bVar;
        this.f16786b = qVar;
    }

    public void m24444a(C7554p pVar) {
        Runnable remove = this.f16787c.remove(pVar.f24140a);
        if (remove != null) {
            this.f16786b.mo27639b(remove);
        }
        RunnableC4924a aVar = new RunnableC4924a(pVar);
        this.f16787c.put(pVar.f24140a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f16786b.mo27640a(pVar.m15702a() - currentTimeMillis, aVar);
    }

    public void m24443b(String str) {
        Runnable remove = this.f16787c.remove(str);
        if (remove != null) {
            this.f16786b.mo27639b(remove);
        }
    }
}
