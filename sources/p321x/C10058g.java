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
    public final C8564t f32720c;
    public final Executor f32721d;
    public C6287c.C6288a<Void> f32724g;
    public boolean f32718a = false;
    public boolean f32719b = false;
    public final Object f32722e = new Object();
    public C8333a.C8334a f32723f = new C8333a.C8334a();
    public final C8564t.AbstractC8567c f32725h = new C8564t.AbstractC8567c() {
        @Override
        public final boolean mo6115a(TotalCaptureResult totalCaptureResult) {
            boolean q;
            q = C10058g.this.m6098q(totalCaptureResult);
            return q;
        }
    };

    public C10058g(C8564t tVar, Executor executor) {
        this.f32720c = tVar;
        this.f32721d = executor;
    }

    public Object m6101n(final C6287c.C6288a aVar) {
        this.f32721d.execute(new Runnable() {
            @Override
            public final void run() {
                C10058g.this.m6102m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public Object m6099p(final C6287c.C6288a aVar) {
        this.f32721d.execute(new Runnable() {
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
        return C1111f.m38349j(C6287c.m20719a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object n;
                n = C10058g.this.m6101n(aVar);
                return n;
            }
        }));
    }

    public final void m6107h(C10061j jVar) {
        synchronized (this.f32722e) {
            for (AbstractC10268n0.AbstractC10269a aVar : jVar.mo5425b()) {
                this.f32723f.mo6092a().mo5566n(aVar, jVar.mo5424c(aVar));
            }
        }
    }

    public AbstractFutureC1291a<Void> m6106i() {
        m6105j();
        return C1111f.m38349j(C6287c.m20719a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object p;
                p = C10058g.this.m6099p(aVar);
                return p;
            }
        }));
    }

    public final void m6105j() {
        synchronized (this.f32722e) {
            this.f32723f = new C8333a.C8334a();
        }
    }

    public C8333a m6104k() {
        C8333a c;
        synchronized (this.f32722e) {
            if (this.f32724g != null) {
                this.f32723f.mo6092a().mo5566n(C8333a.f26993C, Integer.valueOf(this.f32724g.hashCode()));
            }
            c = this.f32723f.m12792c();
        }
        return c;
    }

    public C8564t.AbstractC8567c m6103l() {
        return this.f32725h;
    }

    public void m6096s(final boolean z) {
        this.f32721d.execute(new Runnable() {
            @Override
            public final void run() {
                C10058g.this.m6097r(z);
            }
        });
    }

    public final void m6097r(boolean z) {
        if (this.f32718a != z) {
            this.f32718a = z;
            if (!z) {
                C6287c.C6288a<Void> aVar = this.f32724g;
                if (aVar != null) {
                    aVar.m20713f(new AbstractC0615m.C0616a("The camera control has became inactive."));
                    this.f32724g = null;
                }
            } else if (this.f32719b) {
                m6093v();
            }
        }
    }

    public final void m6100o(C6287c.C6288a<Void> aVar) {
        this.f32719b = true;
        C6287c.C6288a<Void> aVar2 = this.f32724g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f32724g = aVar;
        if (this.f32718a) {
            m6093v();
        }
        if (aVar2 != null) {
            aVar2.m20713f(new AbstractC0615m.C0616a("Camera2CameraControl was updated with new options."));
        }
    }

    public final void m6093v() {
        this.f32720c.m12129c0();
        this.f32719b = false;
    }
}
