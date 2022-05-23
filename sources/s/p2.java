package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.t1;
import b0.d;
import b0.f;
import b1.h;
import c7.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l0.c;
import s.j2;
import s.u2;
import t.a0;
import t.g;
import y.q0;
import y.v0;

public class p2 extends j2.a implements j2, u2.b {
    public final t1 f22197b;
    public final Handler f22198c;
    public final Executor f22199d;
    public final ScheduledExecutorService f22200e;
    public j2.a f22201f;
    public g f22202g;
    public c7.a<Void> f22203h;
    public c.a<Void> f22204i;
    public c7.a<List<Surface>> f22205j;
    public final Object f22196a = new Object();
    public List<q0> f22206k = null;
    public boolean f22207l = false;
    public boolean f22208m = false;
    public boolean f22209n = false;

    public class a implements b0.c<Void> {
        public a() {
        }

        @Override
        public void b(Throwable th) {
            p2.this.d();
            p2 p2Var = p2.this;
            p2Var.f22197b.j(p2Var);
        }

        public void a(Void r12) {
        }
    }

    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            p2.this.A(cameraCaptureSession);
            p2 p2Var = p2.this;
            p2Var.a(p2Var);
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            p2.this.A(cameraCaptureSession);
            p2 p2Var = p2.this;
            p2Var.o(p2Var);
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            p2.this.A(cameraCaptureSession);
            p2 p2Var = p2.this;
            p2Var.p(p2Var);
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                p2.this.A(cameraCaptureSession);
                p2 p2Var = p2.this;
                p2Var.q(p2Var);
                synchronized (p2.this.f22196a) {
                    h.f(p2.this.f22204i, "OpenCaptureSession completer should not null");
                    p2 p2Var2 = p2.this;
                    aVar = p2Var2.f22204i;
                    p2Var2.f22204i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (p2.this.f22196a) {
                    h.f(p2.this.f22204i, "OpenCaptureSession completer should not null");
                    p2 p2Var3 = p2.this;
                    c.a<Void> aVar2 = p2Var3.f22204i;
                    p2Var3.f22204i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                p2.this.A(cameraCaptureSession);
                p2 p2Var = p2.this;
                p2Var.r(p2Var);
                synchronized (p2.this.f22196a) {
                    h.f(p2.this.f22204i, "OpenCaptureSession completer should not null");
                    p2 p2Var2 = p2.this;
                    aVar = p2Var2.f22204i;
                    p2Var2.f22204i = null;
                }
                aVar.c(null);
            } catch (Throwable th) {
                synchronized (p2.this.f22196a) {
                    h.f(p2.this.f22204i, "OpenCaptureSession completer should not null");
                    p2 p2Var3 = p2.this;
                    c.a<Void> aVar2 = p2Var3.f22204i;
                    p2Var3.f22204i = null;
                    aVar2.c(null);
                    throw th;
                }
            }
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            p2.this.A(cameraCaptureSession);
            p2 p2Var = p2.this;
            p2Var.s(p2Var);
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            p2.this.A(cameraCaptureSession);
            p2 p2Var = p2.this;
            p2Var.u(p2Var, surface);
        }
    }

    public p2(t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f22197b = t1Var;
        this.f22198c = handler;
        this.f22199d = executor;
        this.f22200e = scheduledExecutorService;
    }

    public void D() {
        t(this);
    }

    public void E(j2 j2Var) {
        this.f22197b.h(this);
        t(j2Var);
        this.f22201f.p(j2Var);
    }

    public void F(j2 j2Var) {
        this.f22201f.t(j2Var);
    }

    public Object G(List list, a0 a0Var, u.g gVar, c.a aVar) {
        String str;
        synchronized (this.f22196a) {
            B(list);
            h.h(this.f22204i == null, "The openCaptureSessionCompleter can only set once!");
            this.f22204i = aVar;
            a0Var.a(gVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public c7.a H(List list, List list2) {
        t1.a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return f.f(new q0.a("Surface closed", (q0) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return f.f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return f.h(list2);
    }

    public void A(CameraCaptureSession cameraCaptureSession) {
        if (this.f22202g == null) {
            this.f22202g = g.d(cameraCaptureSession, this.f22198c);
        }
    }

    public void B(List<q0> list) {
        synchronized (this.f22196a) {
            I();
            v0.f(list);
            this.f22206k = list;
        }
    }

    public boolean C() {
        boolean z10;
        synchronized (this.f22196a) {
            z10 = this.f22203h != null;
        }
        return z10;
    }

    public void I() {
        synchronized (this.f22196a) {
            List<q0> list = this.f22206k;
            if (list != null) {
                v0.e(list);
                this.f22206k = null;
            }
        }
    }

    @Override
    public void a(j2 j2Var) {
        this.f22201f.a(j2Var);
    }

    @Override
    public Executor b() {
        return this.f22199d;
    }

    @Override
    public j2.a c() {
        return this;
    }

    @Override
    public void close() {
        h.f(this.f22202g, "Need to call openCaptureSession before using this API.");
        this.f22197b.i(this);
        this.f22202g.c().close();
        b().execute(new Runnable() {
            @Override
            public final void run() {
                p2.this.D();
            }
        });
    }

    @Override
    public void d() {
        I();
    }

    @Override
    public c7.a<Void> e(CameraDevice cameraDevice, final u.g gVar, final List<q0> list) {
        synchronized (this.f22196a) {
            if (this.f22208m) {
                return f.f(new CancellationException("Opener is disabled"));
            }
            this.f22197b.l(this);
            final a0 b10 = a0.b(cameraDevice, this.f22198c);
            c7.a<Void> a10 = c.a(new c.AbstractC0147c() {
                @Override
                public final Object a(c.a aVar) {
                    Object G;
                    G = p2.this.G(list, b10, gVar, aVar);
                    return G;
                }
            });
            this.f22203h = a10;
            f.b(a10, new a(), a0.a.a());
            return f.j(this.f22203h);
        }
    }

    @Override
    public int f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        h.f(this.f22202g, "Need to call openCaptureSession before using this API.");
        return this.f22202g.a(list, b(), captureCallback);
    }

    @Override
    public u.g g(int i10, List<u.b> list, j2.a aVar) {
        this.f22201f = aVar;
        return new u.g(i10, list, b(), new b());
    }

    @Override
    public g h() {
        h.e(this.f22202g);
        return this.f22202g;
    }

    @Override
    public void i() {
        h.f(this.f22202g, "Need to call openCaptureSession before using this API.");
        this.f22202g.c().abortCaptures();
    }

    @Override
    public CameraDevice j() {
        h.e(this.f22202g);
        return this.f22202g.c().getDevice();
    }

    @Override
    public int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        h.f(this.f22202g, "Need to call openCaptureSession before using this API.");
        return this.f22202g.b(captureRequest, b(), captureCallback);
    }

    @Override
    public void l() {
        h.f(this.f22202g, "Need to call openCaptureSession before using this API.");
        this.f22202g.c().stopRepeating();
    }

    @Override
    public c7.a<List<Surface>> m(final List<q0> list, long j10) {
        synchronized (this.f22196a) {
            if (this.f22208m) {
                return f.f(new CancellationException("Opener is disabled"));
            }
            d f10 = d.b(v0.k(list, false, j10, b(), this.f22200e)).f(new b0.a() {
                @Override
                public final a apply(Object obj) {
                    a H;
                    H = p2.this.H(list, (List) obj);
                    return H;
                }
            }, b());
            this.f22205j = f10;
            return f.j(f10);
        }
    }

    @Override
    public c7.a<Void> n(String str) {
        return f.h(null);
    }

    @Override
    public void o(j2 j2Var) {
        this.f22201f.o(j2Var);
    }

    @Override
    public void p(final j2 j2Var) {
        c7.a<Void> aVar;
        synchronized (this.f22196a) {
            if (!this.f22207l) {
                this.f22207l = true;
                h.f(this.f22203h, "Need to call openCaptureSession before using this API.");
                aVar = this.f22203h;
            } else {
                aVar = null;
            }
        }
        d();
        if (aVar != null) {
            aVar.a(new Runnable() {
                @Override
                public final void run() {
                    p2.this.E(j2Var);
                }
            }, a0.a.a());
        }
    }

    @Override
    public void q(j2 j2Var) {
        d();
        this.f22197b.j(this);
        this.f22201f.q(j2Var);
    }

    @Override
    public void r(j2 j2Var) {
        this.f22197b.k(this);
        this.f22201f.r(j2Var);
    }

    @Override
    public void s(j2 j2Var) {
        this.f22201f.s(j2Var);
    }

    @Override
    public boolean stop() {
        boolean z10;
        c7.a<List<Surface>> aVar = null;
        try {
            synchronized (this.f22196a) {
                if (!this.f22208m) {
                    c7.a<List<Surface>> aVar2 = this.f22205j;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    this.f22208m = true;
                }
                z10 = !C();
            }
            return z10;
        } finally {
            if (aVar != null) {
                aVar.cancel(true);
            }
        }
    }

    @Override
    public void t(final j2 j2Var) {
        c7.a<Void> aVar;
        synchronized (this.f22196a) {
            if (!this.f22209n) {
                this.f22209n = true;
                h.f(this.f22203h, "Need to call openCaptureSession before using this API.");
                aVar = this.f22203h;
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.a(new Runnable() {
                @Override
                public final void run() {
                    p2.this.F(j2Var);
                }
            }, a0.a.a());
        }
    }

    @Override
    public void u(j2 j2Var, Surface surface) {
        this.f22201f.u(j2Var, surface);
    }
}
