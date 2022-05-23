package x;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.m;
import b0.f;
import java.util.concurrent.Executor;
import l0.c;
import r.a;
import s.t;
import y.n0;

public final class g {
    public final t f25919c;
    public final Executor f25920d;
    public c.a<Void> f25923g;
    public boolean f25917a = false;
    public boolean f25918b = false;
    public final Object f25921e = new Object();
    public a.C0201a f25922f = new a.C0201a();
    public final t.c f25924h = new t.c() {
        @Override
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            boolean q10;
            q10 = g.this.q(totalCaptureResult);
            return q10;
        }
    };

    public g(t tVar, Executor executor) {
        this.f25919c = tVar;
        this.f25920d = executor;
    }

    public Object n(final c.a aVar) {
        this.f25920d.execute(new Runnable() {
            @Override
            public final void run() {
                g.this.m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public Object p(final c.a aVar) {
        this.f25920d.execute(new Runnable() {
            @Override
            public final void run() {
                g.this.o(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public boolean q(android.hardware.camera2.TotalCaptureResult r3) {
        throw new UnsupportedOperationException("Method not decompiled: x.g.q(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    public c7.a<Void> g(j jVar) {
        h(jVar);
        return f.j(c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object n10;
                n10 = g.this.n(aVar);
                return n10;
            }
        }));
    }

    public final void h(j jVar) {
        synchronized (this.f25921e) {
            for (n0.a aVar : jVar.b()) {
                this.f25922f.a().n(aVar, jVar.c(aVar));
            }
        }
    }

    public c7.a<Void> i() {
        j();
        return f.j(c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object p10;
                p10 = g.this.p(aVar);
                return p10;
            }
        }));
    }

    public final void j() {
        synchronized (this.f25921e) {
            this.f25922f = new a.C0201a();
        }
    }

    public a k() {
        a c10;
        synchronized (this.f25921e) {
            if (this.f25923g != null) {
                this.f25922f.a().n(a.C, Integer.valueOf(this.f25923g.hashCode()));
            }
            c10 = this.f25922f.c();
        }
        return c10;
    }

    public t.c l() {
        return this.f25924h;
    }

    public void s(final boolean z10) {
        this.f25920d.execute(new Runnable() {
            @Override
            public final void run() {
                g.this.r(z10);
            }
        });
    }

    public final void r(boolean z10) {
        if (this.f25917a != z10) {
            this.f25917a = z10;
            if (!z10) {
                c.a<Void> aVar = this.f25923g;
                if (aVar != null) {
                    aVar.f(new m.a("The camera control has became inactive."));
                    this.f25923g = null;
                }
            } else if (this.f25918b) {
                v();
            }
        }
    }

    public final void o(c.a<Void> aVar) {
        this.f25918b = true;
        c.a<Void> aVar2 = this.f25923g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f25923g = aVar;
        if (this.f25917a) {
            v();
        }
        if (aVar2 != null) {
            aVar2.f(new m.a("Camera2CameraControl was updated with new options."));
        }
    }

    public final void v() {
        this.f25919c.c0();
        this.f25918b = false;
    }
}
