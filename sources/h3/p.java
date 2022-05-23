package h3;

import b3.m;
import i3.c;
import j3.b;
import java.util.concurrent.Executor;

public class p {
    public final Executor f12510a;
    public final c f12511b;
    public final r f12512c;
    public final b f12513d;

    public p(Executor executor, c cVar, r rVar, b bVar) {
        this.f12510a = executor;
        this.f12511b = cVar;
        this.f12512c = rVar;
        this.f12513d = bVar;
    }

    public Object d() {
        for (m mVar : this.f12511b.F()) {
            this.f12512c.a(mVar, 1);
        }
        return null;
    }

    public void e() {
        this.f12513d.m(new b.a() {
            @Override
            public final Object a() {
                Object d10;
                d10 = p.this.d();
                return d10;
            }
        });
    }

    public void c() {
        this.f12510a.execute(new Runnable() {
            @Override
            public final void run() {
                p.this.e();
            }
        });
    }
}
