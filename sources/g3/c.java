package g3;

import b3.h;
import b3.m;
import b3.r;
import c3.e;
import j3.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c implements e {
    public static final Logger f12084f = Logger.getLogger(r.class.getName());
    public final h3.r f12085a;
    public final Executor f12086b;
    public final e f12087c;
    public final i3.c f12088d;
    public final b f12089e;

    public c(Executor executor, e eVar, h3.r rVar, i3.c cVar, b bVar) {
        this.f12086b = executor;
        this.f12087c = eVar;
        this.f12085a = rVar;
        this.f12088d = cVar;
        this.f12089e = bVar;
    }

    public Object d(m mVar, h hVar) {
        this.f12088d.Q(mVar, hVar);
        this.f12085a.a(mVar, 1);
        return null;
    }

    public void e(final m mVar, y2.h hVar, h hVar2) {
        try {
            c3.m a10 = this.f12087c.a(mVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", mVar.b());
                f12084f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            final h b10 = a10.b(hVar2);
            this.f12089e.m(new b.a() {
                @Override
                public final Object a() {
                    Object d10;
                    d10 = c.this.d(mVar, b10);
                    return d10;
                }
            });
            hVar.a(null);
        } catch (Exception e10) {
            Logger logger = f12084f;
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    @Override
    public void a(final m mVar, final h hVar, final y2.h hVar2) {
        this.f12086b.execute(new Runnable() {
            @Override
            public final void run() {
                c.this.e(mVar, hVar2, hVar);
            }
        });
    }
}
