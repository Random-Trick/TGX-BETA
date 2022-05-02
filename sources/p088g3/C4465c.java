package p088g3;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p018b3.AbstractC1150h;
import p018b3.AbstractC1159m;
import p018b3.C1165r;
import p030c3.AbstractC1538e;
import p030c3.AbstractC1549m;
import p100h3.AbstractC4950s;
import p116i3.AbstractC5179c;
import p131j3.AbstractC5843b;
import p339y2.AbstractC10358h;

public class C4465c implements AbstractC4467e {
    public static final Logger f14801f = Logger.getLogger(C1165r.class.getName());
    public final AbstractC4950s f14802a;
    public final Executor f14803b;
    public final AbstractC1538e f14804c;
    public final AbstractC5179c f14805d;
    public final AbstractC5843b f14806e;

    public C4465c(Executor executor, AbstractC1538e eVar, AbstractC4950s sVar, AbstractC5179c cVar, AbstractC5843b bVar) {
        this.f14803b = executor;
        this.f14804c = eVar;
        this.f14802a = sVar;
        this.f14805d = cVar;
        this.f14806e = bVar;
    }

    public Object m27561d(AbstractC1159m mVar, AbstractC1150h hVar) {
        this.f14805d.mo23675P(mVar, hVar);
        this.f14802a.mo24393a(mVar, 1);
        return null;
    }

    public void m27560e(final AbstractC1159m mVar, AbstractC10358h hVar, AbstractC1150h hVar2) {
        try {
            AbstractC1549m a = this.f14804c.mo36494a(mVar.mo38266b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", mVar.mo38266b());
                f14801f.warning(format);
                hVar.mo5360a(new IllegalArgumentException(format));
                return;
            }
            final AbstractC1150h b = a.mo1176b(hVar2);
            this.f14806e.mo21946m(new AbstractC5843b.AbstractC5844a() {
                @Override
                public final Object mo21945a() {
                    Object d;
                    d = C4465c.this.m27561d(mVar, b);
                    return d;
                }
            });
            hVar.mo5360a(null);
        } catch (Exception e) {
            Logger logger = f14801f;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo5360a(e);
        }
    }

    @Override
    public void mo27556a(final AbstractC1159m mVar, final AbstractC1150h hVar, final AbstractC10358h hVar2) {
        this.f14803b.execute(new Runnable() {
            @Override
            public final void run() {
                C4465c.this.m27560e(mVar, hVar2, hVar);
            }
        });
    }
}
