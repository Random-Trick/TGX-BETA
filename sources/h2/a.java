package h2;

import f2.j;
import f2.q;
import java.util.HashMap;
import java.util.Map;
import o2.p;

public class a {
    public static final String f12452d = j.f("DelayedWorkTracker");
    public final b f12453a;
    public final q f12454b;
    public final Map<String, Runnable> f12455c = new HashMap();

    public class RunnableC0114a implements Runnable {
        public final p f12456a;

        public RunnableC0114a(p pVar) {
            this.f12456a = pVar;
        }

        @Override
        public void run() {
            j.c().a(a.f12452d, String.format("Scheduling work %s", this.f12456a.f18590a), new Throwable[0]);
            a.this.f12453a.a(this.f12456a);
        }
    }

    public a(b bVar, q qVar) {
        this.f12453a = bVar;
        this.f12454b = qVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f12455c.remove(pVar.f18590a);
        if (remove != null) {
            this.f12454b.b(remove);
        }
        RunnableC0114a aVar = new RunnableC0114a(pVar);
        this.f12455c.put(pVar.f18590a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f12454b.a(pVar.a() - currentTimeMillis, aVar);
    }

    public void b(String str) {
        Runnable remove = this.f12455c.remove(str);
        if (remove != null) {
            this.f12454b.b(remove);
        }
    }
}
