package p100h3;

import java.util.concurrent.Executor;
import p018b3.AbstractC1159m;
import p116i3.AbstractC5179c;
import p131j3.AbstractC5843b;

public class C4948q {
    public final Executor f16855a;
    public final AbstractC5179c f16856b;
    public final AbstractC4950s f16857c;
    public final AbstractC5843b f16858d;

    public C4948q(Executor executor, AbstractC5179c cVar, AbstractC4950s sVar, AbstractC5843b bVar) {
        this.f16855a = executor;
        this.f16856b = cVar;
        this.f16857c = sVar;
        this.f16858d = bVar;
    }

    public Object m24397d() {
        for (AbstractC1159m mVar : this.f16856b.mo23676E()) {
            this.f16857c.mo24392a(mVar, 1);
        }
        return null;
    }

    public void m24396e() {
        this.f16858d.mo21945m(new AbstractC5843b.AbstractC5844a() {
            @Override
            public final Object mo21944a() {
                Object d;
                d = C4948q.this.m24397d();
                return d;
            }
        });
    }

    public void m24398c() {
        this.f16855a.execute(new Runnable() {
            @Override
            public final void run() {
                C4948q.this.m24396e();
            }
        });
    }
}
