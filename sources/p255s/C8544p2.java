package p255s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C0662u1;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p001a0.C0003a;
import p015b0.AbstractC1104a;
import p015b0.AbstractC1107c;
import p015b0.C1108d;
import p015b0.C1111f;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p255s.AbstractC8508j2;
import p255s.C8576u2;
import p266t.C8876a0;
import p266t.C8889g;
import p279u.C9398b;
import p279u.C9407g;
import p336y.AbstractC10287q0;
import p336y.C10305v0;

public class C8544p2 extends AbstractC8508j2.AbstractC8509a implements AbstractC8508j2, C8576u2.AbstractC8578b {
    public final C8569t1 f27678b;
    public final Handler f27679c;
    public final Executor f27680d;
    public final ScheduledExecutorService f27681e;
    public AbstractC8508j2.AbstractC8509a f27682f;
    public C8889g f27683g;
    public AbstractFutureC1291a<Void> f27684h;
    public C6287c.C6288a<Void> f27685i;
    public AbstractFutureC1291a<List<Surface>> f27686j;
    public final Object f27677a = new Object();
    public List<AbstractC10287q0> f27687k = null;
    public boolean f27688l = false;
    public boolean f27689m = false;
    public boolean f27690n = false;

    public class C8545a implements AbstractC1107c<Void> {
        public C8545a() {
        }

        @Override
        public void mo5502b(Throwable th) {
            C8544p2.this.mo12190d();
            C8544p2 p2Var = C8544p2.this;
            p2Var.f27678b.m12085j(p2Var);
        }

        public void mo5503a(Void r1) {
        }
    }

    public class C8546b extends CameraCaptureSession.StateCallback {
        public C8546b() {
        }

        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C8544p2.this.m12200A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12036a(p2Var);
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            C8544p2.this.m12200A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12035o(p2Var);
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C8544p2.this.m12200A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12034p(p2Var);
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C6287c.C6288a<Void> aVar;
            try {
                C8544p2.this.m12200A(cameraCaptureSession);
                C8544p2 p2Var = C8544p2.this;
                p2Var.mo12033q(p2Var);
                synchronized (C8544p2.this.f27677a) {
                    C1132h.m38324f(C8544p2.this.f27685i, "OpenCaptureSession completer should not null");
                    C8544p2 p2Var2 = C8544p2.this;
                    aVar = p2Var2.f27685i;
                    p2Var2.f27685i = null;
                }
                aVar.m20714f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (C8544p2.this.f27677a) {
                    C1132h.m38324f(C8544p2.this.f27685i, "OpenCaptureSession completer should not null");
                    C8544p2 p2Var3 = C8544p2.this;
                    C6287c.C6288a<Void> aVar2 = p2Var3.f27685i;
                    p2Var3.f27685i = null;
                    aVar2.m20714f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C6287c.C6288a<Void> aVar;
            try {
                C8544p2.this.m12200A(cameraCaptureSession);
                C8544p2 p2Var = C8544p2.this;
                p2Var.mo12032r(p2Var);
                synchronized (C8544p2.this.f27677a) {
                    C1132h.m38324f(C8544p2.this.f27685i, "OpenCaptureSession completer should not null");
                    C8544p2 p2Var2 = C8544p2.this;
                    aVar = p2Var2.f27685i;
                    p2Var2.f27685i = null;
                }
                aVar.m20717c(null);
            } catch (Throwable th) {
                synchronized (C8544p2.this.f27677a) {
                    C1132h.m38324f(C8544p2.this.f27685i, "OpenCaptureSession completer should not null");
                    C8544p2 p2Var3 = C8544p2.this;
                    C6287c.C6288a<Void> aVar2 = p2Var3.f27685i;
                    p2Var3.f27685i = null;
                    aVar2.m20717c(null);
                    throw th;
                }
            }
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            C8544p2.this.m12200A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12031s(p2Var);
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C8544p2.this.m12200A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12029u(p2Var, surface);
        }
    }

    public C8544p2(C8569t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f27678b = t1Var;
        this.f27679c = handler;
        this.f27680d = executor;
        this.f27681e = scheduledExecutorService;
    }

    public void m12197D() {
        mo12030t(this);
    }

    public void m12196E(AbstractC8508j2 j2Var) {
        this.f27678b.m12087h(this);
        mo12030t(j2Var);
        this.f27682f.mo12034p(j2Var);
    }

    public void m12195F(AbstractC8508j2 j2Var) {
        this.f27682f.mo12030t(j2Var);
    }

    public Object m12194G(List list, C8876a0 a0Var, C9407g gVar, C6287c.C6288a aVar) {
        String str;
        synchronized (this.f27677a) {
            m12199B(list);
            C1132h.m38322h(this.f27685i == null, "The openCaptureSessionCompleter can only set once!");
            this.f27685i = aVar;
            a0Var.m11040a(gVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public AbstractFutureC1291a m12193H(List list, List list2) {
        C0662u1.m40656a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return C1111f.m38356f(new AbstractC10287q0.C10288a("Surface closed", (AbstractC10287q0) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return C1111f.m38356f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return C1111f.m38354h(list2);
    }

    public void m12200A(CameraCaptureSession cameraCaptureSession) {
        if (this.f27683g == null) {
            this.f27683g = C8889g.m11016d(cameraCaptureSession, this.f27679c);
        }
    }

    public void m12199B(List<AbstractC10287q0> list) {
        synchronized (this.f27677a) {
            m12192I();
            C10305v0.m5509f(list);
            this.f27687k = list;
        }
    }

    public boolean m12198C() {
        boolean z;
        synchronized (this.f27677a) {
            z = this.f27684h != null;
        }
        return z;
    }

    public void m12192I() {
        synchronized (this.f27677a) {
            List<AbstractC10287q0> list = this.f27687k;
            if (list != null) {
                C10305v0.m5510e(list);
                this.f27687k = null;
            }
        }
    }

    @Override
    public void mo12036a(AbstractC8508j2 j2Var) {
        this.f27682f.mo12036a(j2Var);
    }

    @Override
    public Executor mo12050b() {
        return this.f27680d;
    }

    @Override
    public AbstractC8508j2.AbstractC8509a mo12191c() {
        return this;
    }

    @Override
    public void close() {
        C1132h.m38324f(this.f27683g, "Need to call openCaptureSession before using this API.");
        this.f27678b.m12086i(this);
        this.f27683g.m11017c().close();
        mo12050b().execute(new Runnable() {
            @Override
            public final void run() {
                C8544p2.this.m12197D();
            }
        });
    }

    @Override
    public void mo12190d() {
        m12192I();
    }

    @Override
    public AbstractFutureC1291a<Void> mo12049e(CameraDevice cameraDevice, final C9407g gVar, final List<AbstractC10287q0> list) {
        synchronized (this.f27677a) {
            if (this.f27689m) {
                return C1111f.m38356f(new CancellationException("Opener is disabled"));
            }
            this.f27678b.m12083l(this);
            final C8876a0 b = C8876a0.m11039b(cameraDevice, this.f27679c);
            AbstractFutureC1291a<Void> a = C6287c.m20720a(new C6287c.AbstractC6290c() {
                @Override
                public final Object mo5520a(C6287c.C6288a aVar) {
                    Object G;
                    G = C8544p2.this.m12194G(list, b, gVar, aVar);
                    return G;
                }
            });
            this.f27684h = a;
            C1111f.m38360b(a, new C8545a(), C0003a.m42614a());
            return C1111f.m38352j(this.f27684h);
        }
    }

    @Override
    public int mo12189f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C1132h.m38324f(this.f27683g, "Need to call openCaptureSession before using this API.");
        return this.f27683g.m11019a(list, mo12050b(), captureCallback);
    }

    @Override
    public C9407g mo12048g(int i, List<C9398b> list, AbstractC8508j2.AbstractC8509a aVar) {
        this.f27682f = aVar;
        return new C9407g(i, list, mo12050b(), new C8546b());
    }

    @Override
    public C8889g mo12188h() {
        C1132h.m38325e(this.f27683g);
        return this.f27683g;
    }

    @Override
    public void mo12187i() {
        C1132h.m38324f(this.f27683g, "Need to call openCaptureSession before using this API.");
        this.f27683g.m11017c().abortCaptures();
    }

    @Override
    public CameraDevice mo12186j() {
        C1132h.m38325e(this.f27683g);
        return this.f27683g.m11017c().getDevice();
    }

    @Override
    public int mo12067k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C1132h.m38324f(this.f27683g, "Need to call openCaptureSession before using this API.");
        return this.f27683g.m11018b(captureRequest, mo12050b(), captureCallback);
    }

    @Override
    public void mo12185l() {
        C1132h.m38324f(this.f27683g, "Need to call openCaptureSession before using this API.");
        this.f27683g.m11017c().stopRepeating();
    }

    @Override
    public AbstractFutureC1291a<List<Surface>> mo12047m(final List<AbstractC10287q0> list, long j) {
        synchronized (this.f27677a) {
            if (this.f27689m) {
                return C1111f.m38356f(new CancellationException("Opener is disabled"));
            }
            C1108d f = C1108d.m38366b(C10305v0.m5504k(list, false, j, mo12050b(), this.f27681e)).m38362f(new AbstractC1104a() {
                @Override
                public final AbstractFutureC1291a apply(Object obj) {
                    AbstractFutureC1291a H;
                    H = C8544p2.this.m12193H(list, (List) obj);
                    return H;
                }
            }, mo12050b());
            this.f27686j = f;
            return C1111f.m38352j(f);
        }
    }

    @Override
    public AbstractFutureC1291a<Void> mo12066n(String str) {
        return C1111f.m38354h(null);
    }

    @Override
    public void mo12035o(AbstractC8508j2 j2Var) {
        this.f27682f.mo12035o(j2Var);
    }

    @Override
    public void mo12034p(final AbstractC8508j2 j2Var) {
        AbstractFutureC1291a<Void> aVar;
        synchronized (this.f27677a) {
            if (!this.f27688l) {
                this.f27688l = true;
                C1132h.m38324f(this.f27684h, "Need to call openCaptureSession before using this API.");
                aVar = this.f27684h;
            } else {
                aVar = null;
            }
        }
        mo12190d();
        if (aVar != null) {
            aVar.mo13371a(new Runnable() {
                @Override
                public final void run() {
                    C8544p2.this.m12196E(j2Var);
                }
            }, C0003a.m42614a());
        }
    }

    @Override
    public void mo12033q(AbstractC8508j2 j2Var) {
        mo12190d();
        this.f27678b.m12085j(this);
        this.f27682f.mo12033q(j2Var);
    }

    @Override
    public void mo12032r(AbstractC8508j2 j2Var) {
        this.f27678b.m12084k(this);
        this.f27682f.mo12032r(j2Var);
    }

    @Override
    public void mo12031s(AbstractC8508j2 j2Var) {
        this.f27682f.mo12031s(j2Var);
    }

    @Override
    public boolean stop() {
        boolean z;
        AbstractFutureC1291a<List<Surface>> aVar = null;
        try {
            synchronized (this.f27677a) {
                if (!this.f27689m) {
                    AbstractFutureC1291a<List<Surface>> aVar2 = this.f27686j;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    this.f27689m = true;
                }
                z = !m12198C();
            }
            return z;
        } finally {
            if (aVar != null) {
                aVar.cancel(true);
            }
        }
    }

    @Override
    public void mo12030t(final AbstractC8508j2 j2Var) {
        AbstractFutureC1291a<Void> aVar;
        synchronized (this.f27677a) {
            if (!this.f27690n) {
                this.f27690n = true;
                C1132h.m38324f(this.f27684h, "Need to call openCaptureSession before using this API.");
                aVar = this.f27684h;
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo13371a(new Runnable() {
                @Override
                public final void run() {
                    C8544p2.this.m12195F(j2Var);
                }
            }, C0003a.m42614a());
        }
    }

    @Override
    public void mo12029u(AbstractC8508j2 j2Var, Surface surface) {
        this.f27682f.mo12029u(j2Var, surface);
    }
}
