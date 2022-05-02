package p255s;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.AbstractC0615m;
import androidx.camera.core.C0662u1;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p001a0.C0003a;
import p015b0.AbstractC1104a;
import p015b0.C1108d;
import p015b0.C1111f;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8564t;
import p266t.C8927z;
import p306w.C9923a;
import p306w.C9924b;
import p321x.C10058g;
import p321x.C10061j;
import p336y.AbstractC10234h;
import p336y.AbstractC10268n0;
import p336y.AbstractC10286q;
import p336y.AbstractC10312x;
import p336y.C10200b2;
import p336y.C10242i2;
import p336y.C10243j;
import p336y.C10245j0;
import p336y.C10317x1;

public class C8564t implements AbstractC10312x {
    public final C8566b f27739b;
    public final Executor f27740c;
    public final C8927z f27742e;
    public final AbstractC10312x.AbstractC10315c f27743f;
    public final C10200b2.C10202b f27744g;
    public final C8598z1 f27745h;
    public final C8453c3 f27746i;
    public final C8601z2 f27747j;
    public final C8586w1 f27748k;
    public final C10058g f27749l;
    public final C8529o0 f27750m;
    public final C9923a f27754q;
    public final C8565a f27760w;
    public final Object f27741d = new Object();
    public int f27751n = 0;
    public volatile boolean f27752o = false;
    public volatile int f27753p = 2;
    public final C9924b f27755r = new C9924b();
    public final AtomicLong f27756s = new AtomicLong(0);
    public volatile AbstractFutureC1291a<Void> f27757t = C1111f.m38354h(null);
    public int f27758u = 1;
    public long f27759v = 0;

    public static final class C8565a extends AbstractC10234h {
        public Set<AbstractC10234h> f27761a = new HashSet();
        public Map<AbstractC10234h, Executor> f27762b = new ArrayMap();

        @Override
        public void mo5669a() {
            for (final AbstractC10234h hVar : this.f27761a) {
                try {
                    this.f27762b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            AbstractC10234h.this.mo5669a();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C0662u1.m40653d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override
        public void mo5668b(final AbstractC10286q qVar) {
            for (final AbstractC10234h hVar : this.f27761a) {
                try {
                    this.f27762b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            AbstractC10234h.this.mo5668b(qVar);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C0662u1.m40653d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override
        public void mo5667c(final C10243j jVar) {
            for (final AbstractC10234h hVar : this.f27761a) {
                try {
                    this.f27762b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            AbstractC10234h.this.mo5667c(jVar);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C0662u1.m40653d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        public void m12103g(Executor executor, AbstractC10234h hVar) {
            this.f27761a.add(hVar);
            this.f27762b.put(hVar, executor);
        }

        public void m12099k(AbstractC10234h hVar) {
            this.f27761a.remove(hVar);
            this.f27762b.remove(hVar);
        }
    }

    public static final class C8566b extends CameraCaptureSession.CaptureCallback {
        public final Set<AbstractC8567c> f27763a = new HashSet();
        public final Executor f27764b;

        public C8566b(Executor executor) {
            this.f27764b = executor;
        }

        public void m12096c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (AbstractC8567c cVar : this.f27763a) {
                if (cVar.mo6115a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f27763a.removeAll(hashSet);
            }
        }

        public void m12097b(AbstractC8567c cVar) {
            this.f27763a.add(cVar);
        }

        public void m12095d(AbstractC8567c cVar) {
            this.f27763a.remove(cVar);
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f27764b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8564t.C8566b.this.m12096c(totalCaptureResult);
                }
            });
        }
    }

    public interface AbstractC8567c {
        boolean mo6115a(TotalCaptureResult totalCaptureResult);
    }

    public C8564t(C8927z zVar, ScheduledExecutorService scheduledExecutorService, Executor executor, AbstractC10312x.AbstractC10315c cVar, C10317x1 x1Var) {
        C10200b2.C10202b bVar = new C10200b2.C10202b();
        this.f27744g = bVar;
        C8565a aVar = new C8565a();
        this.f27760w = aVar;
        this.f27742e = zVar;
        this.f27743f = cVar;
        this.f27740c = executor;
        C8566b bVar2 = new C8566b(executor);
        this.f27739b = bVar2;
        bVar.m5742r(this.f27758u);
        bVar.m5751i(C8518l1.m12244d(bVar2));
        bVar.m5751i(aVar);
        this.f27748k = new C8586w1(this, zVar, executor);
        this.f27745h = new C8598z1(this, scheduledExecutorService, executor, x1Var);
        this.f27746i = new C8453c3(this, zVar, executor);
        this.f27747j = new C8601z2(this, zVar, executor);
        this.f27754q = new C9923a(x1Var);
        this.f27749l = new C10058g(this, executor);
        this.f27750m = new C8529o0(this, zVar, x1Var, executor);
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12142O();
            }
        });
    }

    public static boolean m12147J(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C10242i2) && (l = (Long) ((C10242i2) tag).m5659c("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    public static void m12145L() {
    }

    public void m12144M(Executor executor, AbstractC10234h hVar) {
        this.f27760w.m12103g(executor, hVar);
    }

    public static void m12143N() {
    }

    public void m12142O() {
        m12114s(this.f27749l.m6103l());
    }

    public void m12141P(AbstractC10234h hVar) {
        this.f27760w.m12099k(hVar);
    }

    public AbstractFutureC1291a m12140Q(List list, int i, int i2, int i3, Void r5) {
        return this.f27750m.m12237d(list, i, i2, i3);
    }

    public void m12139R(C6287c.C6288a aVar) {
        C1111f.m38351k(m12125f0(m12126e0()), aVar);
    }

    public Object m12138S(final C6287c.C6288a aVar) {
        this.f27740c.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12139R(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static boolean m12137T(long j, C6287c.C6288a aVar, TotalCaptureResult totalCaptureResult) {
        if (!m12147J(totalCaptureResult, j)) {
            return false;
        }
        aVar.m20717c(null);
        return true;
    }

    public Object m12136U(final long j, final C6287c.C6288a aVar) {
        m12114s(new AbstractC8567c() {
            @Override
            public final boolean mo6115a(TotalCaptureResult totalCaptureResult) {
                boolean T;
                T = C8564t.m12137T(j, aVar, totalCaptureResult);
                return T;
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    public int m12156A(int i) {
        int[] iArr = (int[]) this.f27742e.m10951a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m12148I(i, iArr) ? i : m12148I(1, iArr) ? 1 : 0;
    }

    public int m12155B(int i) {
        int[] iArr = (int[]) this.f27742e.m10951a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m12148I(i, iArr)) {
            return i;
        }
        if (m12148I(4, iArr)) {
            return 4;
        }
        return m12148I(1, iArr) ? 1 : 0;
    }

    public final int m12154C(int i) {
        int[] iArr = (int[]) this.f27742e.m10951a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m12148I(i, iArr) ? i : m12148I(1, iArr) ? 1 : 0;
    }

    public C8601z2 m12153D() {
        return this.f27747j;
    }

    public int m12152E() {
        int i;
        synchronized (this.f27741d) {
            i = this.f27751n;
        }
        return i;
    }

    public C8453c3 m12151F() {
        return this.f27746i;
    }

    public void m12150G() {
        synchronized (this.f27741d) {
            this.f27751n++;
        }
    }

    public final boolean m12149H() {
        return m12152E() > 0;
    }

    public final boolean m12148I(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean m12146K() {
        return this.f27752o;
    }

    public void m12135V(AbstractC8567c cVar) {
        this.f27739b.m12095d(cVar);
    }

    public void m12134W(final AbstractC10234h hVar) {
        this.f27740c.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12141P(hVar);
            }
        });
    }

    public void m12133X() {
        m12130a0(1);
    }

    public void m12132Y(boolean z) {
        this.f27745h.m12008l(z);
        this.f27746i.m12426j(z);
        this.f27747j.m11993j(z);
        this.f27748k.m12027b(z);
        this.f27749l.m6096s(z);
    }

    public void m12131Z(Rational rational) {
        this.f27745h.m12007m(rational);
    }

    @Override
    public AbstractFutureC1291a<List<Void>> mo5492a(final List<C10245j0> list, final int i, final int i2) {
        if (!m12149H()) {
            C0662u1.m40646k("Camera2CameraControlImp", "Camera is not active.");
            return C1111f.m38356f(new AbstractC0615m.C0616a("Camera is not active."));
        }
        final int w = m12110w();
        return C1108d.m38366b(this.f27757t).m38362f(new AbstractC1104a() {
            @Override
            public final AbstractFutureC1291a apply(Object obj) {
                AbstractFutureC1291a Q;
                Q = C8564t.this.m12140Q(list, i, w, i2, (Void) obj);
                return Q;
            }
        }, this.f27740c);
    }

    public void m12130a0(int i) {
        this.f27758u = i;
        this.f27745h.m12006n(i);
        this.f27750m.m12238c(this.f27758u);
    }

    @Override
    public AbstractFutureC1291a<Void> mo5491b(float f) {
        if (!m12149H()) {
            return C1111f.m38356f(new AbstractC0615m.C0616a("Camera is not active."));
        }
        return C1111f.m38352j(this.f27746i.m12425k(f));
    }

    public void m12129b0(List<C10245j0> list) {
        this.f27743f.mo5483b(list);
    }

    @Override
    public Rect mo5490c() {
        return (Rect) C1132h.m38325e((Rect) this.f27742e.m10951a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public void m12128c0() {
        this.f27740c.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12126e0();
            }
        });
    }

    @Override
    public void mo5489d(int i) {
        if (!m12149H()) {
            C0662u1.m40646k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f27753p = i;
        this.f27757t = m12127d0();
    }

    public AbstractFutureC1291a<Void> m12127d0() {
        return C1111f.m38352j(C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object S;
                S = C8564t.this.m12138S(aVar);
                return S;
            }
        }));
    }

    @Override
    public AbstractFutureC1291a<Void> mo5488e(boolean z) {
        if (!m12149H()) {
            return C1111f.m38356f(new AbstractC0615m.C0616a("Camera is not active."));
        }
        return C1111f.m38352j(this.f27747j.m11999d(z));
    }

    public long m12126e0() {
        this.f27759v = this.f27756s.getAndIncrement();
        this.f27743f.mo5484a();
        return this.f27759v;
    }

    @Override
    public AbstractC10268n0 mo5487f() {
        return this.f27749l.m6104k();
    }

    public final AbstractFutureC1291a<Void> m12125f0(final long j) {
        return C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object U;
                U = C8564t.this.m12136U(j, aVar);
                return U;
            }
        });
    }

    @Override
    public void mo5486g() {
        this.f27749l.m6106i().mo13371a(RunnableC8520m.f27623a, C0003a.m42614a());
    }

    @Override
    public void mo5485h(AbstractC10268n0 n0Var) {
        this.f27749l.m6108g(C10061j.C10062a.m6089e(n0Var).m6090d()).mo13371a(RunnableC8524n.f27627a, C0003a.m42614a());
    }

    public void m12114s(AbstractC8567c cVar) {
        this.f27739b.m12097b(cVar);
    }

    public void m12113t(final Executor executor, final AbstractC10234h hVar) {
        this.f27740c.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12144M(executor, hVar);
            }
        });
    }

    public void m12112u() {
        synchronized (this.f27741d) {
            int i = this.f27751n;
            if (i != 0) {
                this.f27751n = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    public void m12111v(boolean z) {
        this.f27752o = z;
        if (!z) {
            C10245j0.C10246a aVar = new C10245j0.C10246a();
            aVar.m5635o(this.f27758u);
            aVar.m5634p(true);
            C8333a.C8334a aVar2 = new C8333a.C8334a();
            aVar2.m12789e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m12156A(1)));
            aVar2.m12789e(CaptureRequest.FLASH_MODE, 0);
            aVar.m5645e(aVar2.m12791c());
            m12129b0(Collections.singletonList(aVar.m5642h()));
        }
        m12126e0();
    }

    public int m12110w() {
        return this.f27753p;
    }

    public C8598z1 m12109x() {
        return this.f27745h;
    }

    public C10200b2 m12108y() {
        this.f27744g.m5742r(this.f27758u);
        this.f27744g.m5743q(m12107z());
        Object I = this.f27749l.m6104k().m12797I(null);
        if (I != null && (I instanceof Integer)) {
            this.f27744g.m5748l("Camera2CameraControl", I);
        }
        this.f27744g.m5748l("CameraControlSessionUpdateId", Long.valueOf(this.f27759v));
        return this.f27744g.m5747m();
    }

    public p336y.AbstractC10268n0 m12107z() {
        throw new UnsupportedOperationException("Method not decompiled: p255s.C8564t.m12107z():y.n0");
    }
}
