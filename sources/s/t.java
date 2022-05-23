package s;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.m;
import androidx.camera.core.t1;
import b0.d;
import b0.f;
import c7.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import l0.c;
import r.a;
import s.t;
import t.z;
import x.g;
import x.j;
import y.b2;
import y.h;
import y.i2;
import y.j;
import y.j0;
import y.n0;
import y.q;
import y.x;
import y.x1;

public class t implements x {
    public final b f22252b;
    public final Executor f22253c;
    public final z f22255e;
    public final x.c f22256f;
    public final b2.b f22257g;
    public final z1 f22258h;
    public final c3 f22259i;
    public final z2 f22260j;
    public final w1 f22261k;
    public final g f22262l;
    public final o0 f22263m;
    public final w.a f22267q;
    public final a f22273w;
    public final Object f22254d = new Object();
    public int f22264n = 0;
    public volatile boolean f22265o = false;
    public volatile int f22266p = 2;
    public final w.b f22268r = new w.b();
    public final AtomicLong f22269s = new AtomicLong(0);
    public volatile c7.a<Void> f22270t = f.h(null);
    public int f22271u = 1;
    public long f22272v = 0;

    public static final class a extends h {
        public Set<h> f22274a = new HashSet();
        public Map<h, Executor> f22275b = new ArrayMap();

        @Override
        public void a() {
            for (final h hVar : this.f22274a) {
                try {
                    this.f22275b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            h.this.a();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    t1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override
        public void b(final q qVar) {
            for (final h hVar : this.f22274a) {
                try {
                    this.f22275b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            h.this.b(qVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    t1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override
        public void c(final j jVar) {
            for (final h hVar : this.f22274a) {
                try {
                    this.f22275b.get(hVar).execute(new Runnable() {
                        @Override
                        public final void run() {
                            h.this.c(jVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    t1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        public void g(Executor executor, h hVar) {
            this.f22274a.add(hVar);
            this.f22275b.put(hVar, executor);
        }

        public void k(h hVar) {
            this.f22274a.remove(hVar);
            this.f22275b.remove(hVar);
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {
        public final Set<c> f22276a = new HashSet();
        public final Executor f22277b;

        public b(Executor executor) {
            this.f22277b = executor;
        }

        public void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f22276a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f22276a.removeAll(hashSet);
            }
        }

        public void b(c cVar) {
            this.f22276a.add(cVar);
        }

        public void d(c cVar) {
            this.f22276a.remove(cVar);
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f22277b.execute(new Runnable() {
                @Override
                public final void run() {
                    t.b.this.c(totalCaptureResult);
                }
            });
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public t(z zVar, ScheduledExecutorService scheduledExecutorService, Executor executor, x.c cVar, x1 x1Var) {
        b2.b bVar = new b2.b();
        this.f22257g = bVar;
        a aVar = new a();
        this.f22273w = aVar;
        this.f22255e = zVar;
        this.f22256f = cVar;
        this.f22253c = executor;
        b bVar2 = new b(executor);
        this.f22252b = bVar2;
        bVar.r(this.f22271u);
        bVar.i(l1.d(bVar2));
        bVar.i(aVar);
        this.f22261k = new w1(this, zVar, executor);
        this.f22258h = new z1(this, scheduledExecutorService, executor, x1Var);
        this.f22259i = new c3(this, zVar, executor);
        this.f22260j = new z2(this, zVar, executor);
        this.f22267q = new w.a(x1Var);
        this.f22262l = new g(this, executor);
        this.f22263m = new o0(this, zVar, x1Var, executor);
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                t.this.O();
            }
        });
    }

    public static boolean J(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof i2) && (l10 = (Long) ((i2) tag).c("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    public static void L() {
    }

    public void M(Executor executor, h hVar) {
        this.f22273w.g(executor, hVar);
    }

    public static void N() {
    }

    public void O() {
        s(this.f22262l.l());
    }

    public void P(h hVar) {
        this.f22273w.k(hVar);
    }

    public c7.a Q(List list, int i10, int i11, int i12, Void r52) {
        return this.f22263m.d(list, i10, i11, i12);
    }

    public void R(c.a aVar) {
        f.k(f0(e0()), aVar);
    }

    public Object S(final c.a aVar) {
        this.f22253c.execute(new Runnable() {
            @Override
            public final void run() {
                t.this.R(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static boolean T(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!J(totalCaptureResult, j10)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public Object U(final long j10, final c.a aVar) {
        s(new c() {
            @Override
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean T;
                T = t.T(j10, aVar, totalCaptureResult);
                return T;
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    public int A(int i10) {
        int[] iArr = (int[]) this.f22255e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return I(i10, iArr) ? i10 : I(1, iArr) ? 1 : 0;
    }

    public int B(int i10) {
        int[] iArr = (int[]) this.f22255e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (I(i10, iArr)) {
            return i10;
        }
        if (I(4, iArr)) {
            return 4;
        }
        return I(1, iArr) ? 1 : 0;
    }

    public final int C(int i10) {
        int[] iArr = (int[]) this.f22255e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return I(i10, iArr) ? i10 : I(1, iArr) ? 1 : 0;
    }

    public z2 D() {
        return this.f22260j;
    }

    public int E() {
        int i10;
        synchronized (this.f22254d) {
            i10 = this.f22264n;
        }
        return i10;
    }

    public c3 F() {
        return this.f22259i;
    }

    public void G() {
        synchronized (this.f22254d) {
            this.f22264n++;
        }
    }

    public final boolean H() {
        return E() > 0;
    }

    public final boolean I(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public boolean K() {
        return this.f22265o;
    }

    public void V(c cVar) {
        this.f22252b.d(cVar);
    }

    public void W(final h hVar) {
        this.f22253c.execute(new Runnable() {
            @Override
            public final void run() {
                t.this.P(hVar);
            }
        });
    }

    public void X() {
        a0(1);
    }

    public void Y(boolean z10) {
        this.f22258h.l(z10);
        this.f22259i.j(z10);
        this.f22260j.j(z10);
        this.f22261k.b(z10);
        this.f22262l.s(z10);
    }

    public void Z(Rational rational) {
        this.f22258h.m(rational);
    }

    @Override
    public c7.a<List<Void>> a(final List<j0> list, final int i10, final int i11) {
        if (!H()) {
            t1.k("Camera2CameraControlImp", "Camera is not active.");
            return f.f(new m.a("Camera is not active."));
        }
        final int w10 = w();
        return d.b(this.f22270t).f(new b0.a() {
            @Override
            public final a apply(Object obj) {
                a Q;
                Q = t.this.Q(list, i10, w10, i11, (Void) obj);
                return Q;
            }
        }, this.f22253c);
    }

    public void a0(int i10) {
        this.f22271u = i10;
        this.f22258h.n(i10);
        this.f22263m.c(this.f22271u);
    }

    @Override
    public c7.a<Void> b(float f10) {
        if (!H()) {
            return f.f(new m.a("Camera is not active."));
        }
        return f.j(this.f22259i.k(f10));
    }

    public void b0(List<j0> list) {
        this.f22256f.b(list);
    }

    @Override
    public Rect c() {
        return (Rect) b1.h.e((Rect) this.f22255e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public void c0() {
        this.f22253c.execute(new Runnable() {
            @Override
            public final void run() {
                t.this.e0();
            }
        });
    }

    @Override
    public void d(int i10) {
        if (!H()) {
            t1.k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f22266p = i10;
        this.f22270t = d0();
    }

    public c7.a<Void> d0() {
        return f.j(l0.c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object S;
                S = t.this.S(aVar);
                return S;
            }
        }));
    }

    @Override
    public c7.a<Void> e(boolean z10) {
        if (!H()) {
            return f.f(new m.a("Camera is not active."));
        }
        return f.j(this.f22260j.d(z10));
    }

    public long e0() {
        this.f22272v = this.f22269s.getAndIncrement();
        this.f22256f.a();
        return this.f22272v;
    }

    @Override
    public n0 f() {
        return this.f22262l.k();
    }

    public final c7.a<Void> f0(final long j10) {
        return l0.c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object U;
                U = t.this.U(j10, aVar);
                return U;
            }
        });
    }

    @Override
    public void g() {
        this.f22262l.i().a(m.f22142a, a0.a.a());
    }

    @Override
    public void h(n0 n0Var) {
        this.f22262l.g(j.a.e(n0Var).d()).a(n.f22146a, a0.a.a());
    }

    public void s(c cVar) {
        this.f22252b.b(cVar);
    }

    public void t(final Executor executor, final h hVar) {
        this.f22253c.execute(new Runnable() {
            @Override
            public final void run() {
                t.this.M(executor, hVar);
            }
        });
    }

    public void u() {
        synchronized (this.f22254d) {
            int i10 = this.f22264n;
            if (i10 != 0) {
                this.f22264n = i10 - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    public void v(boolean z10) {
        this.f22265o = z10;
        if (!z10) {
            j0.a aVar = new j0.a();
            aVar.o(this.f22271u);
            aVar.p(true);
            a.C0201a aVar2 = new a.C0201a();
            aVar2.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(A(1)));
            aVar2.e(CaptureRequest.FLASH_MODE, 0);
            aVar.e(aVar2.c());
            b0(Collections.singletonList(aVar.h()));
        }
        e0();
    }

    public int w() {
        return this.f22266p;
    }

    public z1 x() {
        return this.f22258h;
    }

    public b2 y() {
        this.f22257g.r(this.f22271u);
        this.f22257g.q(z());
        Object I = this.f22262l.k().I(null);
        if (I != null && (I instanceof Integer)) {
            this.f22257g.l("Camera2CameraControl", I);
        }
        this.f22257g.l("CameraControlSessionUpdateId", Long.valueOf(this.f22272v));
        return this.f22257g.m();
    }

    public y.n0 z() {
        throw new UnsupportedOperationException("Method not decompiled: s.t.z():y.n0");
    }
}
