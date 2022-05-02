package p321x;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.AbstractC0615m;
import java.util.concurrent.Executor;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8564t;
import p336y.AbstractC10268n0;

public final class C10058g {
    public final C8564t f32723c;
    public final Executor f32724d;
    public C6287c.C6288a<Void> f32727g;
    public boolean f32721a = false;
    public boolean f32722b = false;
    public final Object f32725e = new Object();
    public C8333a.C8334a f32726f = new C8333a.C8334a();
    public final C8564t.AbstractC8567c f32728h = new C8564t.AbstractC8567c() {
        @Override
        public final boolean mo6115a(TotalCaptureResult totalCaptureResult) {
            boolean q;
            q = C10058g.this.m6098q(totalCaptureResult);
            return q;
        }
    };

    public C10058g(C8564t tVar, Executor executor) {
        this.f32723c = tVar;
        this.f32724d = executor;
    }

    public Object m6101n(final C6287c.C6288a aVar) {
        this.f32724d.execute(new Runnable() {
            @Override
            public final void run() {
                C10058g.this.m6102m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public Object m6099p(final C6287c.C6288a aVar) {
        this.f32724d.execute(new Runnable() {
            @Override
            public final void run() {
                C10058g.this.m6100o(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public boolean m6098q(android.hardware.camera2.TotalCaptureResult r3) {
        throw new UnsupportedOperationException("Method not decompiled: p321x.C10058g.m6098q(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    public AbstractFutureC1291a<Void> m6108g(C10061j jVar) {
        m6107h(jVar);
        return C1111f.m38352j(C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object n;
                n = C10058g.this.m6101n(aVar);
                return n;
            }
        }));
    }

    public final void m6107h(C10061j jVar) {
        synchronized (this.f32725e) {
            for (AbstractC10268n0.AbstractC10269a aVar : jVar.mo5425b()) {
                this.f32726f.mo6092a().mo5566n(aVar, jVar.mo5424c(aVar));
            }
        }
    }

    public AbstractFutureC1291a<Void> m6106i() {
        m6105j();
        return C1111f.m38352j(C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object p;
                p = C10058g.this.m6099p(aVar);
                return p;
            }
        }));
    }

    public final void m6105j() {
        synchronized (this.f32725e) {
            this.f32726f = new C8333a.C8334a();
        }
    }

    public C8333a m6104k() {
        C8333a c;
        synchronized (this.f32725e) {
            if (this.f32727g != null) {
                this.f32726f.mo6092a().mo5566n(C8333a.f26996C, Integer.valueOf(this.f32727g.hashCode()));
            }
            c = this.f32726f.m12791c();
        }
        return c;
    }

    public C8564t.AbstractC8567c m6103l() {
        return this.f32728h;
    }

    public void m6096s(final boolean z) {
        this.f32724d.execute(new Runnable() {
            @Override
            public final void run() {
                C10058g.this.m6097r(z);
            }
        });
    }

    public final void m6097r(boolean z) {
        if (this.f32721a != z) {
            this.f32721a = z;
            if (!z) {
                C6287c.C6288a<Void> aVar = this.f32727g;
                if (aVar != null) {
                    aVar.m20714f(new AbstractC0615m.C0616a("The camera control has became inactive."));
                    this.f32727g = null;
                }
            } else if (this.f32722b) {
                m6093v();
            }
        }
    }

    public final void m6100o(C6287c.C6288a<Void> aVar) {
        this.f32722b = true;
        C6287c.C6288a<Void> aVar2 = this.f32727g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f32727g = aVar;
        if (this.f32721a) {
            m6093v();
        }
        if (aVar2 != null) {
            aVar2.m20714f(new AbstractC0615m.C0616a("Camera2CameraControl was updated with new options."));
        }
    }

    public final void m6093v() {
        this.f32723c.m12128c0();
        this.f32722b = false;
    }
}
