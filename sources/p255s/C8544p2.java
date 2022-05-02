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
    public final C8569t1 f27675b;
    public final Handler f27676c;
    public final Executor f27677d;
    public final ScheduledExecutorService f27678e;
    public AbstractC8508j2.AbstractC8509a f27679f;
    public C8889g f27680g;
    public AbstractFutureC1291a<Void> f27681h;
    public C6287c.C6288a<Void> f27682i;
    public AbstractFutureC1291a<List<Surface>> f27683j;
    public final Object f27674a = new Object();
    public List<AbstractC10287q0> f27684k = null;
    public boolean f27685l = false;
    public boolean f27686m = false;
    public boolean f27687n = false;

    public class C8545a implements AbstractC1107c<Void> {
        public C8545a() {
        }

        @Override
        public void mo5502b(Throwable th) {
            C8544p2.this.mo12191d();
            C8544p2 p2Var = C8544p2.this;
            p2Var.f27675b.m12086j(p2Var);
        }

        public void mo5503a(Void r1) {
        }
    }

    public class C8546b extends CameraCaptureSession.StateCallback {
        public C8546b() {
        }

        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C8544p2.this.m12201A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12037a(p2Var);
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            C8544p2.this.m12201A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12036o(p2Var);
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C8544p2.this.m12201A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12035p(p2Var);
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C6287c.C6288a<Void> aVar;
            try {
                C8544p2.this.m12201A(cameraCaptureSession);
                C8544p2 p2Var = C8544p2.this;
                p2Var.mo12034q(p2Var);
                synchronized (C8544p2.this.f27674a) {
                    C1132h.m38321f(C8544p2.this.f27682i, "OpenCaptureSession completer should not null");
                    C8544p2 p2Var2 = C8544p2.this;
                    aVar = p2Var2.f27682i;
                    p2Var2.f27682i = null;
                }
                aVar.m20713f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (C8544p2.this.f27674a) {
                    C1132h.m38321f(C8544p2.this.f27682i, "OpenCaptureSession completer should not null");
                    C8544p2 p2Var3 = C8544p2.this;
                    C6287c.C6288a<Void> aVar2 = p2Var3.f27682i;
                    p2Var3.f27682i = null;
                    aVar2.m20713f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C6287c.C6288a<Void> aVar;
            try {
                C8544p2.this.m12201A(cameraCaptureSession);
                C8544p2 p2Var = C8544p2.this;
                p2Var.mo12033r(p2Var);
                synchronized (C8544p2.this.f27674a) {
                    C1132h.m38321f(C8544p2.this.f27682i, "OpenCaptureSession completer should not null");
                    C8544p2 p2Var2 = C8544p2.this;
                    aVar = p2Var2.f27682i;
                    p2Var2.f27682i = null;
                }
                aVar.m20716c(null);
            } catch (Throwable th) {
                synchronized (C8544p2.this.f27674a) {
                    C1132h.m38321f(C8544p2.this.f27682i, "OpenCaptureSession completer should not null");
                    C8544p2 p2Var3 = C8544p2.this;
                    C6287c.C6288a<Void> aVar2 = p2Var3.f27682i;
                    p2Var3.f27682i = null;
                    aVar2.m20716c(null);
                    throw th;
                }
            }
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            C8544p2.this.m12201A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12032s(p2Var);
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C8544p2.this.m12201A(cameraCaptureSession);
            C8544p2 p2Var = C8544p2.this;
            p2Var.mo12030u(p2Var, surface);
        }
    }

    public C8544p2(C8569t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f27675b = t1Var;
        this.f27676c = handler;
        this.f27677d = executor;
        this.f27678e = scheduledExecutorService;
    }

    public void m12198D() {
        mo12031t(this);
    }

    public void m12197E(AbstractC8508j2 j2Var) {
        this.f27675b.m12088h(this);
        mo12031t(j2Var);
        this.f27679f.mo12035p(j2Var);
    }

    public void m12196F(AbstractC8508j2 j2Var) {
        this.f27679f.mo12031t(j2Var);
    }

    public Object m12195G(List list, C8876a0 a0Var, C9407g gVar, C6287c.C6288a aVar) {
        String str;
        synchronized (this.f27674a) {
            m12200B(list);
            C1132h.m38319h(this.f27682i == null, "The openCaptureSessionCompleter can only set once!");
            this.f27682i = aVar;
            a0Var.m11041a(gVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public AbstractFutureC1291a m12194H(List list, List list2) {
        C0662u1.m40653a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return C1111f.m38353f(new AbstractC10287q0.C10288a("Surface closed", (AbstractC10287q0) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return C1111f.m38353f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return C1111f.m38351h(list2);
    }

    public void m12201A(CameraCaptureSession cameraCaptureSession) {
        if (this.f27680g == null) {
            this.f27680g = C8889g.m11017d(cameraCaptureSession, this.f27676c);
        }
    }

    public void m12200B(List<AbstractC10287q0> list) {
        synchronized (this.f27674a) {
            m12193I();
            C10305v0.m5509f(list);
            this.f27684k = list;
        }
    }

    public boolean m12199C() {
        boolean z;
        synchronized (this.f27674a) {
            z = this.f27681h != null;
        }
        return z;
    }

    public void m12193I() {
        synchronized (this.f27674a) {
            List<AbstractC10287q0> list = this.f27684k;
            if (list != null) {
                C10305v0.m5510e(list);
                this.f27684k = null;
            }
        }
    }

    @Override
    public void mo12037a(AbstractC8508j2 j2Var) {
        this.f27679f.mo12037a(j2Var);
    }

    @Override
    public Executor mo12051b() {
        return this.f27677d;
    }

    @Override
    public AbstractC8508j2.AbstractC8509a mo12192c() {
        return this;
    }

    @Override
    public void close() {
        C1132h.m38321f(this.f27680g, "Need to call openCaptureSession before using this API.");
        this.f27675b.m12087i(this);
        this.f27680g.m11018c().close();
        mo12051b().execute(new Runnable() {
            @Override
            public final void run() {
                C8544p2.this.m12198D();
            }
        });
    }

    @Override
    public void mo12191d() {
        m12193I();
    }

    @Override
    public AbstractFutureC1291a<Void> mo12050e(CameraDevice cameraDevice, final C9407g gVar, final List<AbstractC10287q0> list) {
        synchronized (this.f27674a) {
            if (this.f27686m) {
                return C1111f.m38353f(new CancellationException("Opener is disabled"));
            }
            this.f27675b.m12084l(this);
            final C8876a0 b = C8876a0.m11040b(cameraDevice, this.f27676c);
            AbstractFutureC1291a<Void> a = C6287c.m20719a(new C6287c.AbstractC6290c() {
                @Override
                public final Object mo5520a(C6287c.C6288a aVar) {
                    Object G;
                    G = C8544p2.this.m12195G(list, b, gVar, aVar);
                    return G;
                }
            });
            this.f27681h = a;
            C1111f.m38357b(a, new C8545a(), C0003a.m42611a());
            return C1111f.m38349j(this.f27681h);
        }
    }

    @Override
    public int mo12190f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C1132h.m38321f(this.f27680g, "Need to call openCaptureSession before using this API.");
        return this.f27680g.m11020a(list, mo12051b(), captureCallback);
    }

    @Override
    public C9407g mo12049g(int i, List<C9398b> list, AbstractC8508j2.AbstractC8509a aVar) {
        this.f27679f = aVar;
        return new C9407g(i, list, mo12051b(), new C8546b());
    }

    @Override
    public C8889g mo12189h() {
        C1132h.m38322e(this.f27680g);
        return this.f27680g;
    }

    @Override
    public void mo12188i() {
        C1132h.m38321f(this.f27680g, "Need to call openCaptureSession before using this API.");
        this.f27680g.m11018c().abortCaptures();
    }

    @Override
    public CameraDevice mo12187j() {
        C1132h.m38322e(this.f27680g);
        return this.f27680g.m11018c().getDevice();
    }

    @Override
    public int mo12068k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C1132h.m38321f(this.f27680g, "Need to call openCaptureSession before using this API.");
        return this.f27680g.m11019b(captureRequest, mo12051b(), captureCallback);
    }

    @Override
    public void mo12186l() {
        C1132h.m38321f(this.f27680g, "Need to call openCaptureSession before using this API.");
        this.f27680g.m11018c().stopRepeating();
    }

    @Override
    public AbstractFutureC1291a<List<Surface>> mo12048m(final List<AbstractC10287q0> list, long j) {
        synchronized (this.f27674a) {
            if (this.f27686m) {
                return C1111f.m38353f(new CancellationException("Opener is disabled"));
            }
            C1108d f = C1108d.m38363b(C10305v0.m5504k(list, false, j, mo12051b(), this.f27678e)).m38359f(new AbstractC1104a() {
                @Override
                public final AbstractFutureC1291a apply(Object obj) {
                    AbstractFutureC1291a H;
                    H = C8544p2.this.m12194H(list, (List) obj);
                    return H;
                }
            }, mo12051b());
            this.f27683j = f;
            return C1111f.m38349j(f);
        }
    }

    @Override
    public AbstractFutureC1291a<Void> mo12067n(String str) {
        return C1111f.m38351h(null);
    }

    @Override
    public void mo12036o(AbstractC8508j2 j2Var) {
        this.f27679f.mo12036o(j2Var);
    }

    @Override
    public void mo12035p(final AbstractC8508j2 j2Var) {
        AbstractFutureC1291a<Void> aVar;
        synchronized (this.f27674a) {
            if (!this.f27685l) {
                this.f27685l = true;
                C1132h.m38321f(this.f27681h, "Need to call openCaptureSession before using this API.");
                aVar = this.f27681h;
            } else {
                aVar = null;
            }
        }
        mo12191d();
        if (aVar != null) {
            aVar.mo13372a(new Runnable() {
                @Override
                public final void run() {
                    C8544p2.this.m12197E(j2Var);
                }
            }, C0003a.m42611a());
        }
    }

    @Override
    public void mo12034q(AbstractC8508j2 j2Var) {
        mo12191d();
        this.f27675b.m12086j(this);
        this.f27679f.mo12034q(j2Var);
    }

    @Override
    public void mo12033r(AbstractC8508j2 j2Var) {
        this.f27675b.m12085k(this);
        this.f27679f.mo12033r(j2Var);
    }

    @Override
    public void mo12032s(AbstractC8508j2 j2Var) {
        this.f27679f.mo12032s(j2Var);
    }

    @Override
    public boolean stop() {
        boolean z;
        AbstractFutureC1291a<List<Surface>> aVar = null;
        try {
            synchronized (this.f27674a) {
                if (!this.f27686m) {
                    AbstractFutureC1291a<List<Surface>> aVar2 = this.f27683j;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    this.f27686m = true;
                }
                z = !m12199C();
            }
            return z;
        } finally {
            if (aVar != null) {
                aVar.cancel(true);
            }
        }
    }

    @Override
    public void mo12031t(final AbstractC8508j2 j2Var) {
        AbstractFutureC1291a<Void> aVar;
        synchronized (this.f27674a) {
            if (!this.f27687n) {
                this.f27687n = true;
                C1132h.m38321f(this.f27681h, "Need to call openCaptureSession before using this API.");
                aVar = this.f27681h;
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo13372a(new Runnable() {
                @Override
                public final void run() {
                    C8544p2.this.m12196F(j2Var);
                }
            }, C0003a.m42611a());
        }
    }

    @Override
    public void mo12030u(AbstractC8508j2 j2Var, Surface surface) {
        this.f27679f.mo12030u(j2Var, surface);
    }
}
