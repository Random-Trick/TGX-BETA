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

    public Object m24398d() {
        for (AbstractC1159m mVar : this.f16856b.mo23677E()) {
            this.f16857c.mo24393a(mVar, 1);
        }
        return null;
    }

    public void m24397e() {
        this.f16858d.mo21946m(new AbstractC5843b.AbstractC5844a() {
            @Override
            public final Object mo21945a() {
                Object d;
                d = C4948q.this.m24398d();
                return d;
            }
        });
    }

    public void m24399c() {
        this.f16855a.execute(new Runnable() {
            @Override
            public final void run() {
                C4948q.this.m24397e();
            }
        });
    }
}
