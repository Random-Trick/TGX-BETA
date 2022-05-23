package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.g1;
import androidx.camera.core.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l0.c;
import r.a;
import s.o0;
import s.t;
import t.z;
import w.i;
import w.n;
import y.h;
import y.j;
import y.j0;
import y.k;
import y.l;
import y.m;
import y.q;
import y.x1;

public class o0 {
    public final t f22154a;
    public final n f22155b;
    public final x1 f22156c;
    public final Executor f22157d;
    public final boolean f22158e;
    public int f22159f = 1;

    public static class a implements d {
        public final t f22160a;
        public final i f22161b;
        public final int f22162c;
        public boolean f22163d = false;

        public a(t tVar, int i10, i iVar) {
            this.f22160a = tVar;
            this.f22162c = i10;
            this.f22161b = iVar;
        }

        public Object f(c.a aVar) {
            this.f22160a.x().p(aVar);
            this.f22161b.b();
            return "AePreCapture";
        }

        @Override
        public c7.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!o0.a(this.f22162c, totalCaptureResult)) {
                return b0.f.h(Boolean.FALSE);
            }
            t1.a("Camera2CapturePipeline", "Trigger AE");
            this.f22163d = true;
            return b0.d.b(l0.c.a(new c.AbstractC0147c() {
                @Override
                public final Object a(c.a aVar) {
                    Object f10;
                    f10 = o0.a.this.f(aVar);
                    return f10;
                }
            })).e(n0.f22147a, a0.a.a());
        }

        @Override
        public boolean b() {
            return this.f22162c == 0;
        }

        @Override
        public void c() {
            if (this.f22163d) {
                t1.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f22160a.x().c(false, true);
                this.f22161b.a();
            }
        }
    }

    public static class b implements d {
        public final t f22164a;
        public boolean f22165b = false;

        public b(t tVar) {
            this.f22164a = tVar;
        }

        @Override
        public c7.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            c7.a<Boolean> h10 = b0.f.h(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return h10;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                t1.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    t1.a("Camera2CapturePipeline", "Trigger AF");
                    this.f22165b = true;
                    this.f22164a.x().q(null, false);
                }
            }
            return h10;
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public void c() {
            if (this.f22165b) {
                t1.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f22164a.x().c(true, false);
            }
        }
    }

    public static class c {
        public static final long f22166i;
        public static final long f22167j;
        public final int f22168a;
        public final Executor f22169b;
        public final t f22170c;
        public final i f22171d;
        public final boolean f22172e;
        public long f22173f = f22166i;
        public final List<d> f22174g = new ArrayList();
        public final d f22175h = new a();

        public class a implements d {
            public a() {
            }

            public static Boolean e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override
            public c7.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (d dVar : c.this.f22174g) {
                    arrayList.add(dVar.a(totalCaptureResult));
                }
                return b0.f.o(b0.f.c(arrayList), v0.f22316a, a0.a.a());
            }

            @Override
            public boolean b() {
                for (d dVar : c.this.f22174g) {
                    if (dVar.b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void c() {
                for (d dVar : c.this.f22174g) {
                    dVar.c();
                }
            }
        }

        public class b extends h {
            public final c.a f22177a;

            public b(c.a aVar) {
                this.f22177a = aVar;
            }

            @Override
            public void a() {
                this.f22177a.f(new g1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override
            public void b(q qVar) {
                this.f22177a.c(null);
            }

            @Override
            public void c(j jVar) {
                this.f22177a.f(new g1(2, "Capture request failed with reason " + jVar.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f22166i = timeUnit.toNanos(1L);
            f22167j = timeUnit.toNanos(5L);
        }

        public c(int i10, Executor executor, t tVar, boolean z10, i iVar) {
            this.f22168a = i10;
            this.f22169b = executor;
            this.f22170c = tVar;
            this.f22172e = z10;
            this.f22171d = iVar;
        }

        public c7.a l(int i10, TotalCaptureResult totalCaptureResult) {
            if (o0.a(i10, totalCaptureResult)) {
                q(f22167j);
            }
            return this.f22175h.a(totalCaptureResult);
        }

        public c7.a m(Boolean bool) {
            if (bool.booleanValue()) {
                return s(this.f22173f, new e.a() {
                    @Override
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        boolean k10;
                        k10 = o0.c.this.k(totalCaptureResult);
                        return k10;
                    }
                });
            }
            return b0.f.h(null);
        }

        public c7.a n(List list, int i10, TotalCaptureResult totalCaptureResult) {
            return r(list, i10);
        }

        public void o() {
            this.f22175h.c();
        }

        public Object p(j0.a aVar, c.a aVar2) {
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        public void g(d dVar) {
            this.f22174g.add(dVar);
        }

        public final void h(j0.a aVar) {
            a.C0201a aVar2 = new a.C0201a();
            aVar2.e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(aVar2.c());
        }

        public final void i(j0.a aVar, j0 j0Var) {
            int i10;
            if (this.f22168a != 3 || this.f22172e) {
                i10 = j0Var.f() == -1 ? 2 : -1;
            } else {
                i10 = 4;
            }
            if (i10 != -1) {
                aVar.o(i10);
            }
        }

        public c7.a<List<Void>> j(final List<j0> list, final int i10) {
            c7.a<TotalCaptureResult> aVar;
            c7.a h10 = b0.f.h(null);
            if (!this.f22174g.isEmpty()) {
                if (this.f22175h.b()) {
                    aVar = s(0L, null);
                } else {
                    aVar = b0.f.h(null);
                }
                h10 = b0.d.b(aVar).f(new b0.a() {
                    @Override
                    public final c7.a apply(Object obj) {
                        c7.a l10;
                        l10 = o0.c.this.l(i10, (TotalCaptureResult) obj);
                        return l10;
                    }
                }, this.f22169b).f(new b0.a() {
                    @Override
                    public final c7.a apply(Object obj) {
                        c7.a m10;
                        m10 = o0.c.this.m((Boolean) obj);
                        return m10;
                    }
                }, this.f22169b);
            }
            b0.d f10 = b0.d.b(h10).f(new b0.a() {
                @Override
                public final c7.a apply(Object obj) {
                    c7.a n10;
                    n10 = o0.c.this.n(list, i10, (TotalCaptureResult) obj);
                    return n10;
                }
            }, this.f22169b);
            f10.a(new Runnable() {
                @Override
                public final void run() {
                    o0.c.this.o();
                }
            }, this.f22169b);
            return f10;
        }

        public final boolean k(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            s.e eVar = new s.e(totalCaptureResult);
            boolean z10 = eVar.f() == l.OFF || eVar.f() == l.UNKNOWN || eVar.g() == m.PASSIVE_FOCUSED || eVar.g() == m.PASSIVE_NOT_FOCUSED || eVar.g() == m.LOCKED_FOCUSED || eVar.g() == m.LOCKED_NOT_FOCUSED;
            boolean z11 = eVar.e() == k.CONVERGED || eVar.e() == k.FLASH_REQUIRED || eVar.e() == k.UNKNOWN;
            boolean z12 = eVar.h() == y.n.CONVERGED || eVar.h() == y.n.UNKNOWN;
            t1.a("Camera2CapturePipeline", "checkCaptureResult, AE=" + eVar.e() + " AF =" + eVar.g() + " AWB=" + eVar.h());
            return z10 && z11 && z12;
        }

        public final void q(long j10) {
            this.f22173f = j10;
        }

        public c7.a<List<Void>> r(List<j0> list, int i10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (j0 j0Var : list) {
                final j0.a k10 = j0.a.k(j0Var);
                i(k10, j0Var);
                if (this.f22171d.c(i10)) {
                    h(k10);
                }
                arrayList.add(l0.c.a(new c.AbstractC0147c() {
                    @Override
                    public final Object a(c.a aVar) {
                        Object p10;
                        p10 = o0.c.this.p(k10, aVar);
                        return p10;
                    }
                }));
                arrayList2.add(k10.h());
            }
            this.f22170c.b0(arrayList2);
            return b0.f.c(arrayList);
        }

        public final c7.a<TotalCaptureResult> s(long j10, e.a aVar) {
            e eVar = new e(j10, aVar);
            this.f22170c.s(eVar);
            return eVar.c();
        }
    }

    public interface d {
        c7.a<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    public static class e implements t.c {
        public c.a<TotalCaptureResult> f22179a;
        public final long f22181c;
        public final a f22182d;
        public final c7.a<TotalCaptureResult> f22180b = l0.c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object d10;
                d10 = o0.e.this.d(aVar);
                return d10;
            }
        });
        public volatile Long f22183e = null;

        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public e(long j10, a aVar) {
            this.f22181c = j10;
            this.f22182d = aVar;
        }

        public Object d(c.a aVar) {
            this.f22179a = aVar;
            return "waitFor3AResult";
        }

        @Override
        public boolean a(TotalCaptureResult totalCaptureResult) {
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && this.f22183e == null) {
                this.f22183e = l10;
            }
            Long l11 = this.f22183e;
            if (0 == this.f22181c || l11 == null || l10 == null || l10.longValue() - l11.longValue() <= this.f22181c) {
                a aVar = this.f22182d;
                if (aVar != null && !aVar.a(totalCaptureResult)) {
                    return false;
                }
                this.f22179a.c(totalCaptureResult);
                return true;
            }
            this.f22179a.c(null);
            t1.a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l10 + " first: " + l11);
            return true;
        }

        public c7.a<TotalCaptureResult> c() {
            return this.f22180b;
        }
    }

    public static class f implements d {
        public final t f22184a;
        public final int f22185b;
        public boolean f22186c = false;

        public f(t tVar, int i10) {
            this.f22184a = tVar;
            this.f22185b = i10;
        }

        public Object f(c.a aVar) {
            this.f22184a.D().g(aVar, true);
            return "TorchOn";
        }

        @Override
        public c7.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (o0.a(this.f22185b, totalCaptureResult)) {
                if (this.f22184a.K()) {
                    t1.a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    t1.a("Camera2CapturePipeline", "Turn on torch");
                    this.f22186c = true;
                    return b0.d.b(l0.c.a(new c.AbstractC0147c() {
                        @Override
                        public final Object a(c.a aVar) {
                            Object f10;
                            f10 = o0.f.this.f(aVar);
                            return f10;
                        }
                    })).e(y0.f22348a, a0.a.a());
                }
            }
            return b0.f.h(Boolean.FALSE);
        }

        @Override
        public boolean b() {
            return this.f22185b == 0;
        }

        @Override
        public void c() {
            if (this.f22186c) {
                this.f22184a.D().g(null, false);
                t1.a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    public o0(t tVar, z zVar, x1 x1Var, Executor executor) {
        boolean z10 = true;
        this.f22154a = tVar;
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f22158e = (num == null || num.intValue() != 2) ? false : z10;
        this.f22157d = executor;
        this.f22156c = x1Var;
        this.f22155b = new n(x1Var);
    }

    public static boolean a(int i10, TotalCaptureResult totalCaptureResult) {
        if (i10 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        } else if (i10 == 1) {
            return true;
        } else {
            if (i10 == 2) {
                return false;
            }
            throw new AssertionError(i10);
        }
    }

    public final boolean b(int i10) {
        return this.f22155b.a() || this.f22159f == 3 || i10 == 1;
    }

    public void c(int i10) {
        this.f22159f = i10;
    }

    public c7.a<List<Void>> d(List<j0> list, int i10, int i11, int i12) {
        i iVar = new i(this.f22156c);
        c cVar = new c(this.f22159f, this.f22157d, this.f22154a, this.f22158e, iVar);
        if (i10 == 0) {
            cVar.g(new b(this.f22154a));
        }
        if (b(i12)) {
            cVar.g(new f(this.f22154a, i11));
        } else {
            cVar.g(new a(this.f22154a, i11, iVar));
        }
        return b0.f.j(cVar.j(list, i11));
    }
}
