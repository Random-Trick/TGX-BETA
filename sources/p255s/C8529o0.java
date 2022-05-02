package p255s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.C0572h1;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001a0.C0003a;
import p015b0.AbstractC1104a;
import p015b0.C1108d;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8529o0;
import p255s.C8564t;
import p266t.C8927z;
import p306w.C9931i;
import p306w.C9936n;
import p336y.AbstractC10234h;
import p336y.AbstractC10286q;
import p336y.C10243j;
import p336y.C10245j0;
import p336y.C10317x1;
import p336y.EnumC10250k;
import p336y.EnumC10254l;
import p336y.EnumC10261m;
import p336y.EnumC10267n;

public class C8529o0 {
    public final C8564t f27635a;
    public final C9936n f27636b;
    public final C10317x1 f27637c;
    public final Executor f27638d;
    public final boolean f27639e;
    public int f27640f = 1;

    public static class C8530a implements AbstractC8535d {
        public final C8564t f27641a;
        public final C9931i f27642b;
        public final int f27643c;
        public boolean f27644d = false;

        public C8530a(C8564t tVar, int i, C9931i iVar) {
            this.f27641a = tVar;
            this.f27643c = i;
            this.f27642b = iVar;
        }

        public Object m12234f(C6287c.C6288a aVar) {
            this.f27641a.m12109x().m12004p(aVar);
            this.f27642b.m6469b();
            return "AePreCapture";
        }

        @Override
        public AbstractFutureC1291a<Boolean> mo12208a(TotalCaptureResult totalCaptureResult) {
            if (!C8529o0.m12240a(this.f27643c, totalCaptureResult)) {
                return C1111f.m38354h(Boolean.FALSE);
            }
            C0662u1.m40656a("Camera2CapturePipeline", "Trigger AE");
            this.f27644d = true;
            return C1108d.m38366b(C6287c.m20720a(new C6287c.AbstractC6290c() {
                @Override
                public final Object mo5520a(C6287c.C6288a aVar) {
                    Object f;
                    f = C8529o0.C8530a.this.m12234f(aVar);
                    return f;
                }
            })).m38363e(C8525n0.f27628a, C0003a.m42614a());
        }

        @Override
        public boolean mo12207b() {
            return this.f27643c == 0;
        }

        @Override
        public void mo12206c() {
            if (this.f27644d) {
                C0662u1.m40656a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f27641a.m12109x().m12017c(false, true);
                this.f27642b.m6470a();
            }
        }
    }

    public static class C8531b implements AbstractC8535d {
        public final C8564t f27645a;
        public boolean f27646b = false;

        public C8531b(C8564t tVar) {
            this.f27645a = tVar;
        }

        @Override
        public AbstractFutureC1291a<Boolean> mo12208a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            AbstractFutureC1291a<Boolean> h = C1111f.m38354h(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return h;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C0662u1.m40656a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C0662u1.m40656a("Camera2CapturePipeline", "Trigger AF");
                    this.f27646b = true;
                    this.f27645a.m12109x().m12003q(null, false);
                }
            }
            return h;
        }

        @Override
        public boolean mo12207b() {
            return true;
        }

        @Override
        public void mo12206c() {
            if (this.f27646b) {
                C0662u1.m40656a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f27645a.m12109x().m12017c(true, false);
            }
        }
    }

    public static class C8532c {
        public static final long f27647i;
        public static final long f27648j;
        public final int f27649a;
        public final Executor f27650b;
        public final C8564t f27651c;
        public final C9931i f27652d;
        public final boolean f27653e;
        public long f27654f = f27647i;
        public final List<AbstractC8535d> f27655g = new ArrayList();
        public final AbstractC8535d f27656h = new C8533a();

        public class C8533a implements AbstractC8535d {
            public C8533a() {
            }

            public static Boolean m12212e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override
            public AbstractFutureC1291a<Boolean> mo12208a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC8535d dVar : C8532c.this.f27655g) {
                    arrayList.add(dVar.mo12208a(totalCaptureResult));
                }
                return C1111f.m38347o(C1111f.m38359c(arrayList), C8580v0.f27803a, C0003a.m42614a());
            }

            @Override
            public boolean mo12207b() {
                for (AbstractC8535d dVar : C8532c.this.f27655g) {
                    if (dVar.mo12207b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void mo12206c() {
                for (AbstractC8535d dVar : C8532c.this.f27655g) {
                    dVar.mo12206c();
                }
            }
        }

        public class C8534b extends AbstractC10234h {
            public final C6287c.C6288a f27658a;

            public C8534b(C6287c.C6288a aVar) {
                this.f27658a = aVar;
            }

            @Override
            public void mo5669a() {
                this.f27658a.m20714f(new C0572h1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override
            public void mo5668b(AbstractC10286q qVar) {
                this.f27658a.m20717c(null);
            }

            @Override
            public void mo5667c(C10243j jVar) {
                this.f27658a.m20714f(new C0572h1(2, "Capture request failed with reason " + jVar.m5657a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f27647i = timeUnit.toNanos(1L);
            f27648j = timeUnit.toNanos(5L);
        }

        public C8532c(int i, Executor executor, C8564t tVar, boolean z, C9931i iVar) {
            this.f27649a = i;
            this.f27650b = executor;
            this.f27651c = tVar;
            this.f27653e = z;
            this.f27652d = iVar;
        }

        public AbstractFutureC1291a m12221l(int i, TotalCaptureResult totalCaptureResult) {
            if (C8529o0.m12240a(i, totalCaptureResult)) {
                m12216q(f27648j);
            }
            return this.f27656h.mo12208a(totalCaptureResult);
        }

        public AbstractFutureC1291a m12220m(Boolean bool) {
            if (bool.booleanValue()) {
                return m12214s(this.f27654f, new C8536e.AbstractC8537a() {
                    @Override
                    public final boolean mo12065a(TotalCaptureResult totalCaptureResult) {
                        boolean k;
                        k = C8529o0.C8532c.this.m12222k(totalCaptureResult);
                        return k;
                    }
                });
            }
            return C1111f.m38354h(null);
        }

        public AbstractFutureC1291a m12219n(List list, int i, TotalCaptureResult totalCaptureResult) {
            return m12215r(list, i);
        }

        public void m12218o() {
            this.f27656h.mo12206c();
        }

        public Object m12217p(C10245j0.C10246a aVar, C6287c.C6288a aVar2) {
            aVar.m5647c(new C8534b(aVar2));
            return "submitStillCapture";
        }

        public void m12226g(AbstractC8535d dVar) {
            this.f27655g.add(dVar);
        }

        public final void m12225h(C10245j0.C10246a aVar) {
            C8333a.C8334a aVar2 = new C8333a.C8334a();
            aVar2.m12789e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.m5645e(aVar2.m12791c());
        }

        public final void m12224i(C10245j0.C10246a aVar, C10245j0 j0Var) {
            int i;
            if (this.f27649a != 3 || this.f27653e) {
                i = j0Var.m5651f() == -1 ? 2 : -1;
            } else {
                i = 4;
            }
            if (i != -1) {
                aVar.m5635o(i);
            }
        }

        public AbstractFutureC1291a<List<Void>> m12223j(final List<C10245j0> list, final int i) {
            AbstractFutureC1291a<TotalCaptureResult> aVar;
            AbstractFutureC1291a h = C1111f.m38354h(null);
            if (!this.f27655g.isEmpty()) {
                if (this.f27656h.mo12207b()) {
                    aVar = m12214s(0L, null);
                } else {
                    aVar = C1111f.m38354h(null);
                }
                h = C1108d.m38366b(aVar).m38362f(new AbstractC1104a() {
                    @Override
                    public final AbstractFutureC1291a apply(Object obj) {
                        AbstractFutureC1291a l;
                        l = C8529o0.C8532c.this.m12221l(i, (TotalCaptureResult) obj);
                        return l;
                    }
                }, this.f27650b).m38362f(new AbstractC1104a() {
                    @Override
                    public final AbstractFutureC1291a apply(Object obj) {
                        AbstractFutureC1291a m;
                        m = C8529o0.C8532c.this.m12220m((Boolean) obj);
                        return m;
                    }
                }, this.f27650b);
            }
            C1108d f = C1108d.m38366b(h).m38362f(new AbstractC1104a() {
                @Override
                public final AbstractFutureC1291a apply(Object obj) {
                    AbstractFutureC1291a n;
                    n = C8529o0.C8532c.this.m12219n(list, i, (TotalCaptureResult) obj);
                    return n;
                }
            }, this.f27650b);
            f.mo13371a(new Runnable() {
                @Override
                public final void run() {
                    C8529o0.C8532c.this.m12218o();
                }
            }, this.f27650b);
            return f;
        }

        public final boolean m12222k(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            C8462e eVar = new C8462e(totalCaptureResult);
            boolean z = eVar.m12415f() == EnumC10254l.OFF || eVar.m12415f() == EnumC10254l.UNKNOWN || eVar.m12414g() == EnumC10261m.PASSIVE_FOCUSED || eVar.m12414g() == EnumC10261m.PASSIVE_NOT_FOCUSED || eVar.m12414g() == EnumC10261m.LOCKED_FOCUSED || eVar.m12414g() == EnumC10261m.LOCKED_NOT_FOCUSED;
            boolean z2 = eVar.m12416e() == EnumC10250k.CONVERGED || eVar.m12416e() == EnumC10250k.FLASH_REQUIRED || eVar.m12416e() == EnumC10250k.UNKNOWN;
            boolean z3 = eVar.m12413h() == EnumC10267n.CONVERGED || eVar.m12413h() == EnumC10267n.UNKNOWN;
            C0662u1.m40656a("Camera2CapturePipeline", "checkCaptureResult, AE=" + eVar.m12416e() + " AF =" + eVar.m12414g() + " AWB=" + eVar.m12413h());
            return z && z2 && z3;
        }

        public final void m12216q(long j) {
            this.f27654f = j;
        }

        public AbstractFutureC1291a<List<Void>> m12215r(List<C10245j0> list, int i) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C10245j0 j0Var : list) {
                final C10245j0.C10246a k = C10245j0.C10246a.m5639k(j0Var);
                m12224i(k, j0Var);
                if (this.f27652d.m6468c(i)) {
                    m12225h(k);
                }
                arrayList.add(C6287c.m20720a(new C6287c.AbstractC6290c() {
                    @Override
                    public final Object mo5520a(C6287c.C6288a aVar) {
                        Object p;
                        p = C8529o0.C8532c.this.m12217p(k, aVar);
                        return p;
                    }
                }));
                arrayList2.add(k.m5642h());
            }
            this.f27651c.m12129b0(arrayList2);
            return C1111f.m38359c(arrayList);
        }

        public final AbstractFutureC1291a<TotalCaptureResult> m12214s(long j, C8536e.AbstractC8537a aVar) {
            C8536e eVar = new C8536e(j, aVar);
            this.f27651c.m12114s(eVar);
            return eVar.m12210c();
        }
    }

    public interface AbstractC8535d {
        AbstractFutureC1291a<Boolean> mo12208a(TotalCaptureResult totalCaptureResult);

        boolean mo12207b();

        void mo12206c();
    }

    public static class C8536e implements C8564t.AbstractC8567c {
        public C6287c.C6288a<TotalCaptureResult> f27660a;
        public final long f27662c;
        public final AbstractC8537a f27663d;
        public final AbstractFutureC1291a<TotalCaptureResult> f27661b = C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object d;
                d = C8529o0.C8536e.this.m12209d(aVar);
                return d;
            }
        });
        public volatile Long f27664e = null;

        public interface AbstractC8537a {
            boolean mo12065a(TotalCaptureResult totalCaptureResult);
        }

        public C8536e(long j, AbstractC8537a aVar) {
            this.f27662c = j;
            this.f27663d = aVar;
        }

        public Object m12209d(C6287c.C6288a aVar) {
            this.f27660a = aVar;
            return "waitFor3AResult";
        }

        @Override
        public boolean mo6115a(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f27664e == null) {
                this.f27664e = l;
            }
            Long l2 = this.f27664e;
            if (0 == this.f27662c || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f27662c) {
                AbstractC8537a aVar = this.f27663d;
                if (aVar != null && !aVar.mo12065a(totalCaptureResult)) {
                    return false;
                }
                this.f27660a.m20717c(totalCaptureResult);
                return true;
            }
            this.f27660a.m20717c(null);
            C0662u1.m40656a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }

        public AbstractFutureC1291a<TotalCaptureResult> m12210c() {
            return this.f27661b;
        }
    }

    public static class C8538f implements AbstractC8535d {
        public final C8564t f27665a;
        public final int f27666b;
        public boolean f27667c = false;

        public C8538f(C8564t tVar, int i) {
            this.f27665a = tVar;
            this.f27666b = i;
        }

        public Object m12203f(C6287c.C6288a aVar) {
            this.f27665a.m12153D().m11996g(aVar, true);
            return "TorchOn";
        }

        @Override
        public AbstractFutureC1291a<Boolean> mo12208a(TotalCaptureResult totalCaptureResult) {
            if (C8529o0.m12240a(this.f27666b, totalCaptureResult)) {
                if (this.f27665a.m12146K()) {
                    C0662u1.m40656a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    C0662u1.m40656a("Camera2CapturePipeline", "Turn on torch");
                    this.f27667c = true;
                    return C1108d.m38366b(C6287c.m20720a(new C6287c.AbstractC6290c() {
                        @Override
                        public final Object mo5520a(C6287c.C6288a aVar) {
                            Object f;
                            f = C8529o0.C8538f.this.m12203f(aVar);
                            return f;
                        }
                    })).m38363e(C8593y0.f27835a, C0003a.m42614a());
                }
            }
            return C1111f.m38354h(Boolean.FALSE);
        }

        @Override
        public boolean mo12207b() {
            return this.f27666b == 0;
        }

        @Override
        public void mo12206c() {
            if (this.f27667c) {
                this.f27665a.m12153D().m11996g(null, false);
                C0662u1.m40656a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    public C8529o0(C8564t tVar, C8927z zVar, C10317x1 x1Var, Executor executor) {
        boolean z = true;
        this.f27635a = tVar;
        Integer num = (Integer) zVar.m10951a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f27639e = (num == null || num.intValue() != 2) ? false : z;
        this.f27638d = executor;
        this.f27637c = x1Var;
        this.f27636b = new C9936n(x1Var);
    }

    public static boolean m12240a(int i, TotalCaptureResult totalCaptureResult) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        }
    }

    public final boolean m12239b(int i) {
        return this.f27636b.m6463a() || this.f27640f == 3 || i == 1;
    }

    public void m12238c(int i) {
        this.f27640f = i;
    }

    public AbstractFutureC1291a<List<Void>> m12237d(List<C10245j0> list, int i, int i2, int i3) {
        C9931i iVar = new C9931i(this.f27637c);
        C8532c cVar = new C8532c(this.f27640f, this.f27638d, this.f27635a, this.f27639e, iVar);
        if (i == 0) {
            cVar.m12226g(new C8531b(this.f27635a));
        }
        if (m12239b(i3)) {
            cVar.m12226g(new C8538f(this.f27635a, i2));
        } else {
            cVar.m12226g(new C8530a(this.f27635a, i2, iVar));
        }
        return C1111f.m38352j(cVar.m12223j(list, i2));
    }
}
