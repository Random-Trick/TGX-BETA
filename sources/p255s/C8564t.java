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
    public final C8566b f27736b;
    public final Executor f27737c;
    public final C8927z f27739e;
    public final AbstractC10312x.AbstractC10315c f27740f;
    public final C10200b2.C10202b f27741g;
    public final C8598z1 f27742h;
    public final C8453c3 f27743i;
    public final C8601z2 f27744j;
    public final C8586w1 f27745k;
    public final C10058g f27746l;
    public final C8529o0 f27747m;
    public final C9923a f27751q;
    public final C8565a f27757w;
    public final Object f27738d = new Object();
    public int f27748n = 0;
    public volatile boolean f27749o = false;
    public volatile int f27750p = 2;
    public final C9924b f27752r = new C9924b();
    public final AtomicLong f27753s = new AtomicLong(0);
    public volatile AbstractFutureC1291a<Void> f27754t = C1111f.m38351h(null);
    public int f27755u = 1;
    public long f27756v = 0;

    public static final class C8565a extends AbstractC10234h {
        public Set<AbstractC10234h> f27758a = new HashSet();
        public Map<AbstractC10234h, Executor> f27759b = new ArrayMap();

        @Override
        public void mo5669a() {
            for (final AbstractC10234h hVar : this.f27758a) {
                try {
                    this.f27759b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            AbstractC10234h.this.mo5669a();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C0662u1.m40650d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override
        public void mo5668b(final AbstractC10286q qVar) {
            for (final AbstractC10234h hVar : this.f27758a) {
                try {
                    this.f27759b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            AbstractC10234h.this.mo5668b(qVar);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C0662u1.m40650d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override
        public void mo5667c(final C10243j jVar) {
            for (final AbstractC10234h hVar : this.f27758a) {
                try {
                    this.f27759b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            AbstractC10234h.this.mo5667c(jVar);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C0662u1.m40650d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        public void m12104g(Executor executor, AbstractC10234h hVar) {
            this.f27758a.add(hVar);
            this.f27759b.put(hVar, executor);
        }

        public void m12100k(AbstractC10234h hVar) {
            this.f27758a.remove(hVar);
            this.f27759b.remove(hVar);
        }
    }

    public static final class C8566b extends CameraCaptureSession.CaptureCallback {
        public final Set<AbstractC8567c> f27760a = new HashSet();
        public final Executor f27761b;

        public C8566b(Executor executor) {
            this.f27761b = executor;
        }

        public void m12097c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (AbstractC8567c cVar : this.f27760a) {
                if (cVar.mo6115a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f27760a.removeAll(hashSet);
            }
        }

        public void m12098b(AbstractC8567c cVar) {
            this.f27760a.add(cVar);
        }

        public void m12096d(AbstractC8567c cVar) {
            this.f27760a.remove(cVar);
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f27761b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8564t.C8566b.this.m12097c(totalCaptureResult);
                }
            });
        }
    }

    public interface AbstractC8567c {
        boolean mo6115a(TotalCaptureResult totalCaptureResult);
    }

    public C8564t(C8927z zVar, ScheduledExecutorService scheduledExecutorService, Executor executor, AbstractC10312x.AbstractC10315c cVar, C10317x1 x1Var) {
        C10200b2.C10202b bVar = new C10200b2.C10202b();
        this.f27741g = bVar;
        C8565a aVar = new C8565a();
        this.f27757w = aVar;
        this.f27739e = zVar;
        this.f27740f = cVar;
        this.f27737c = executor;
        C8566b bVar2 = new C8566b(executor);
        this.f27736b = bVar2;
        bVar.m5742r(this.f27755u);
        bVar.m5751i(C8518l1.m12245d(bVar2));
        bVar.m5751i(aVar);
        this.f27745k = new C8586w1(this, zVar, executor);
        this.f27742h = new C8598z1(this, scheduledExecutorService, executor, x1Var);
        this.f27743i = new C8453c3(this, zVar, executor);
        this.f27744j = new C8601z2(this, zVar, executor);
        this.f27751q = new C9923a(x1Var);
        this.f27746l = new C10058g(this, executor);
        this.f27747m = new C8529o0(this, zVar, x1Var, executor);
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12143O();
            }
        });
    }

    public static boolean m12148J(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C10242i2) && (l = (Long) ((C10242i2) tag).m5659c("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    public static void m12146L() {
    }

    public void m12145M(Executor executor, AbstractC10234h hVar) {
        this.f27757w.m12104g(executor, hVar);
    }

    public static void m12144N() {
    }

    public void m12143O() {
        m12115s(this.f27746l.m6103l());
    }

    public void m12142P(AbstractC10234h hVar) {
        this.f27757w.m12100k(hVar);
    }

    public AbstractFutureC1291a m12141Q(List list, int i, int i2, int i3, Void r5) {
        return this.f27747m.m12238d(list, i, i2, i3);
    }

    public void m12140R(C6287c.C6288a aVar) {
        C1111f.m38348k(m12126f0(m12127e0()), aVar);
    }

    public Object m12139S(final C6287c.C6288a aVar) {
        this.f27737c.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12140R(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static boolean m12138T(long j, C6287c.C6288a aVar, TotalCaptureResult totalCaptureResult) {
        if (!m12148J(totalCaptureResult, j)) {
            return false;
        }
        aVar.m20716c(null);
        return true;
    }

    public Object m12137U(final long j, final C6287c.C6288a aVar) {
        m12115s(new AbstractC8567c() {
            @Override
            public final boolean mo6115a(TotalCaptureResult totalCaptureResult) {
                boolean T;
                T = C8564t.m12138T(j, aVar, totalCaptureResult);
                return T;
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    public int m12157A(int i) {
        int[] iArr = (int[]) this.f27739e.m10952a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m12149I(i, iArr) ? i : m12149I(1, iArr) ? 1 : 0;
    }

    public int m12156B(int i) {
        int[] iArr = (int[]) this.f27739e.m10952a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m12149I(i, iArr)) {
            return i;
        }
        if (m12149I(4, iArr)) {
            return 4;
        }
        return m12149I(1, iArr) ? 1 : 0;
    }

    public final int m12155C(int i) {
        int[] iArr = (int[]) this.f27739e.m10952a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m12149I(i, iArr) ? i : m12149I(1, iArr) ? 1 : 0;
    }

    public C8601z2 m12154D() {
        return this.f27744j;
    }

    public int m12153E() {
        int i;
        synchronized (this.f27738d) {
            i = this.f27748n;
        }
        return i;
    }

    public C8453c3 m12152F() {
        return this.f27743i;
    }

    public void m12151G() {
        synchronized (this.f27738d) {
            this.f27748n++;
        }
    }

    public final boolean m12150H() {
        return m12153E() > 0;
    }

    public final boolean m12149I(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean m12147K() {
        return this.f27749o;
    }

    public void m12136V(AbstractC8567c cVar) {
        this.f27736b.m12096d(cVar);
    }

    public void m12135W(final AbstractC10234h hVar) {
        this.f27737c.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12142P(hVar);
            }
        });
    }

    public void m12134X() {
        m12131a0(1);
    }

    public void m12133Y(boolean z) {
        this.f27742h.m12009l(z);
        this.f27743i.m12427j(z);
        this.f27744j.m11994j(z);
        this.f27745k.m12028b(z);
        this.f27746l.m6096s(z);
    }

    public void m12132Z(Rational rational) {
        this.f27742h.m12008m(rational);
    }

    @Override
    public AbstractFutureC1291a<List<Void>> mo5492a(final List<C10245j0> list, final int i, final int i2) {
        if (!m12150H()) {
            C0662u1.m40643k("Camera2CameraControlImp", "Camera is not active.");
            return C1111f.m38353f(new AbstractC0615m.C0616a("Camera is not active."));
        }
        final int w = m12111w();
        return C1108d.m38363b(this.f27754t).m38359f(new AbstractC1104a() {
            @Override
            public final AbstractFutureC1291a apply(Object obj) {
                AbstractFutureC1291a Q;
                Q = C8564t.this.m12141Q(list, i, w, i2, (Void) obj);
                return Q;
            }
        }, this.f27737c);
    }

    public void m12131a0(int i) {
        this.f27755u = i;
        this.f27742h.m12007n(i);
        this.f27747m.m12239c(this.f27755u);
    }

    @Override
    public AbstractFutureC1291a<Void> mo5491b(float f) {
        if (!m12150H()) {
            return C1111f.m38353f(new AbstractC0615m.C0616a("Camera is not active."));
        }
        return C1111f.m38349j(this.f27743i.m12426k(f));
    }

    public void m12130b0(List<C10245j0> list) {
        this.f27740f.mo5483b(list);
    }

    @Override
    public Rect mo5490c() {
        return (Rect) C1132h.m38322e((Rect) this.f27739e.m10952a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public void m12129c0() {
        this.f27737c.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12127e0();
            }
        });
    }

    @Override
    public void mo5489d(int i) {
        if (!m12150H()) {
            C0662u1.m40643k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f27750p = i;
        this.f27754t = m12128d0();
    }

    public AbstractFutureC1291a<Void> m12128d0() {
        return C1111f.m38349j(C6287c.m20719a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object S;
                S = C8564t.this.m12139S(aVar);
                return S;
            }
        }));
    }

    @Override
    public AbstractFutureC1291a<Void> mo5488e(boolean z) {
        if (!m12150H()) {
            return C1111f.m38353f(new AbstractC0615m.C0616a("Camera is not active."));
        }
        return C1111f.m38349j(this.f27744j.m12000d(z));
    }

    public long m12127e0() {
        this.f27756v = this.f27753s.getAndIncrement();
        this.f27740f.mo5484a();
        return this.f27756v;
    }

    @Override
    public AbstractC10268n0 mo5487f() {
        return this.f27746l.m6104k();
    }

    public final AbstractFutureC1291a<Void> m12126f0(final long j) {
        return C6287c.m20719a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object U;
                U = C8564t.this.m12137U(j, aVar);
                return U;
            }
        });
    }

    @Override
    public void mo5486g() {
        this.f27746l.m6106i().mo13372a(RunnableC8520m.f27620a, C0003a.m42611a());
    }

    @Override
    public void mo5485h(AbstractC10268n0 n0Var) {
        this.f27746l.m6108g(C10061j.C10062a.m6089e(n0Var).m6090d()).mo13372a(RunnableC8524n.f27624a, C0003a.m42611a());
    }

    public void m12115s(AbstractC8567c cVar) {
        this.f27736b.m12098b(cVar);
    }

    public void m12114t(final Executor executor, final AbstractC10234h hVar) {
        this.f27737c.execute(new Runnable() {
            @Override
            public final void run() {
                C8564t.this.m12145M(executor, hVar);
            }
        });
    }

    public void m12113u() {
        synchronized (this.f27738d) {
            int i = this.f27748n;
            if (i != 0) {
                this.f27748n = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    public void m12112v(boolean z) {
        this.f27749o = z;
        if (!z) {
            C10245j0.C10246a aVar = new C10245j0.C10246a();
            aVar.m5635o(this.f27755u);
            aVar.m5634p(true);
            C8333a.C8334a aVar2 = new C8333a.C8334a();
            aVar2.m12790e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m12157A(1)));
            aVar2.m12790e(CaptureRequest.FLASH_MODE, 0);
            aVar.m5645e(aVar2.m12792c());
            m12130b0(Collections.singletonList(aVar.m5642h()));
        }
        m12127e0();
    }

    public int m12111w() {
        return this.f27750p;
    }

    public C8598z1 m12110x() {
        return this.f27742h;
    }

    public C10200b2 m12109y() {
        this.f27741g.m5742r(this.f27755u);
        this.f27741g.m5743q(m12108z());
        Object I = this.f27746l.m6104k().m12798I(null);
        if (I != null && (I instanceof Integer)) {
            this.f27741g.m5748l("Camera2CameraControl", I);
        }
        this.f27741g.m5748l("CameraControlSessionUpdateId", Long.valueOf(this.f27756v));
        return this.f27741g.m5747m();
    }

    public p336y.AbstractC10268n0 m12108z() {
        throw new UnsupportedOperationException("Method not decompiled: p255s.C8564t.m12108z():y.n0");
    }
}
