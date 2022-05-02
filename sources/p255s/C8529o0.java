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
    public final C8564t f27632a;
    public final C9936n f27633b;
    public final C10317x1 f27634c;
    public final Executor f27635d;
    public final boolean f27636e;
    public int f27637f = 1;

    public static class C8530a implements AbstractC8535d {
        public final C8564t f27638a;
        public final C9931i f27639b;
        public final int f27640c;
        public boolean f27641d = false;

        public C8530a(C8564t tVar, int i, C9931i iVar) {
            this.f27638a = tVar;
            this.f27640c = i;
            this.f27639b = iVar;
        }

        public Object m12235f(C6287c.C6288a aVar) {
            this.f27638a.m12110x().m12005p(aVar);
            this.f27639b.m6469b();
            return "AePreCapture";
        }

        @Override
        public AbstractFutureC1291a<Boolean> mo12209a(TotalCaptureResult totalCaptureResult) {
            if (!C8529o0.m12241a(this.f27640c, totalCaptureResult)) {
                return C1111f.m38351h(Boolean.FALSE);
            }
            C0662u1.m40653a("Camera2CapturePipeline", "Trigger AE");
            this.f27641d = true;
            return C1108d.m38363b(C6287c.m20719a(new C6287c.AbstractC6290c() {
                @Override
                public final Object mo5520a(C6287c.C6288a aVar) {
                    Object f;
                    f = C8529o0.C8530a.this.m12235f(aVar);
                    return f;
                }
            })).m38360e(C8525n0.f27625a, C0003a.m42611a());
        }

        @Override
        public boolean mo12208b() {
            return this.f27640c == 0;
        }

        @Override
        public void mo12207c() {
            if (this.f27641d) {
                C0662u1.m40653a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f27638a.m12110x().m12018c(false, true);
                this.f27639b.m6470a();
            }
        }
    }

    public static class C8531b implements AbstractC8535d {
        public final C8564t f27642a;
        public boolean f27643b = false;

        public C8531b(C8564t tVar) {
            this.f27642a = tVar;
        }

        @Override
        public AbstractFutureC1291a<Boolean> mo12209a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            AbstractFutureC1291a<Boolean> h = C1111f.m38351h(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return h;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C0662u1.m40653a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C0662u1.m40653a("Camera2CapturePipeline", "Trigger AF");
                    this.f27643b = true;
                    this.f27642a.m12110x().m12004q(null, false);
                }
            }
            return h;
        }

        @Override
        public boolean mo12208b() {
            return true;
        }

        @Override
        public void mo12207c() {
            if (this.f27643b) {
                C0662u1.m40653a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f27642a.m12110x().m12018c(true, false);
            }
        }
    }

    public static class C8532c {
        public static final long f27644i;
        public static final long f27645j;
        public final int f27646a;
        public final Executor f27647b;
        public final C8564t f27648c;
        public final C9931i f27649d;
        public final boolean f27650e;
        public long f27651f = f27644i;
        public final List<AbstractC8535d> f27652g = new ArrayList();
        public final AbstractC8535d f27653h = new C8533a();

        public class C8533a implements AbstractC8535d {
            public C8533a() {
            }

            public static Boolean m12213e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override
            public AbstractFutureC1291a<Boolean> mo12209a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC8535d dVar : C8532c.this.f27652g) {
                    arrayList.add(dVar.mo12209a(totalCaptureResult));
                }
                return C1111f.m38344o(C1111f.m38356c(arrayList), C8580v0.f27800a, C0003a.m42611a());
            }

            @Override
            public boolean mo12208b() {
                for (AbstractC8535d dVar : C8532c.this.f27652g) {
                    if (dVar.mo12208b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void mo12207c() {
                for (AbstractC8535d dVar : C8532c.this.f27652g) {
                    dVar.mo12207c();
                }
            }
        }

        public class C8534b extends AbstractC10234h {
            public final C6287c.C6288a f27655a;

            public C8534b(C6287c.C6288a aVar) {
                this.f27655a = aVar;
            }

            @Override
            public void mo5669a() {
                this.f27655a.m20713f(new C0572h1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override
            public void mo5668b(AbstractC10286q qVar) {
                this.f27655a.m20716c(null);
            }

            @Override
            public void mo5667c(C10243j jVar) {
                this.f27655a.m20713f(new C0572h1(2, "Capture request failed with reason " + jVar.m5657a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f27644i = timeUnit.toNanos(1L);
            f27645j = timeUnit.toNanos(5L);
        }

        public C8532c(int i, Executor executor, C8564t tVar, boolean z, C9931i iVar) {
            this.f27646a = i;
            this.f27647b = executor;
            this.f27648c = tVar;
            this.f27650e = z;
            this.f27649d = iVar;
        }

        public AbstractFutureC1291a m12222l(int i, TotalCaptureResult totalCaptureResult) {
            if (C8529o0.m12241a(i, totalCaptureResult)) {
                m12217q(f27645j);
            }
            return this.f27653h.mo12209a(totalCaptureResult);
        }

        public AbstractFutureC1291a m12221m(Boolean bool) {
            if (bool.booleanValue()) {
                return m12215s(this.f27651f, new C8536e.AbstractC8537a() {
                    @Override
                    public final boolean mo12066a(TotalCaptureResult totalCaptureResult) {
                        boolean k;
                        k = C8529o0.C8532c.this.m12223k(totalCaptureResult);
                        return k;
                    }
                });
            }
            return C1111f.m38351h(null);
        }

        public AbstractFutureC1291a m12220n(List list, int i, TotalCaptureResult totalCaptureResult) {
            return m12216r(list, i);
        }

        public void m12219o() {
            this.f27653h.mo12207c();
        }

        public Object m12218p(C10245j0.C10246a aVar, C6287c.C6288a aVar2) {
            aVar.m5647c(new C8534b(aVar2));
            return "submitStillCapture";
        }

        public void m12227g(AbstractC8535d dVar) {
            this.f27652g.add(dVar);
        }

        public final void m12226h(C10245j0.C10246a aVar) {
            C8333a.C8334a aVar2 = new C8333a.C8334a();
            aVar2.m12790e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.m5645e(aVar2.m12792c());
        }

        public final void m12225i(C10245j0.C10246a aVar, C10245j0 j0Var) {
            int i;
            if (this.f27646a != 3 || this.f27650e) {
                i = j0Var.m5651f() == -1 ? 2 : -1;
            } else {
                i = 4;
            }
            if (i != -1) {
                aVar.m5635o(i);
            }
        }

        public AbstractFutureC1291a<List<Void>> m12224j(final List<C10245j0> list, final int i) {
            AbstractFutureC1291a<TotalCaptureResult> aVar;
            AbstractFutureC1291a h = C1111f.m38351h(null);
            if (!this.f27652g.isEmpty()) {
                if (this.f27653h.mo12208b()) {
                    aVar = m12215s(0L, null);
                } else {
                    aVar = C1111f.m38351h(null);
                }
                h = C1108d.m38363b(aVar).m38359f(new AbstractC1104a() {
                    @Override
                    public final AbstractFutureC1291a apply(Object obj) {
                        AbstractFutureC1291a l;
                        l = C8529o0.C8532c.this.m12222l(i, (TotalCaptureResult) obj);
                        return l;
                    }
                }, this.f27647b).m38359f(new AbstractC1104a() {
                    @Override
                    public final AbstractFutureC1291a apply(Object obj) {
                        AbstractFutureC1291a m;
                        m = C8529o0.C8532c.this.m12221m((Boolean) obj);
                        return m;
                    }
                }, this.f27647b);
            }
            C1108d f = C1108d.m38363b(h).m38359f(new AbstractC1104a() {
                @Override
                public final AbstractFutureC1291a apply(Object obj) {
                    AbstractFutureC1291a n;
                    n = C8529o0.C8532c.this.m12220n(list, i, (TotalCaptureResult) obj);
                    return n;
                }
            }, this.f27647b);
            f.mo13372a(new Runnable() {
                @Override
                public final void run() {
                    C8529o0.C8532c.this.m12219o();
                }
            }, this.f27647b);
            return f;
        }

        public final boolean m12223k(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            C8462e eVar = new C8462e(totalCaptureResult);
            boolean z = eVar.m12416f() == EnumC10254l.OFF || eVar.m12416f() == EnumC10254l.UNKNOWN || eVar.m12415g() == EnumC10261m.PASSIVE_FOCUSED || eVar.m12415g() == EnumC10261m.PASSIVE_NOT_FOCUSED || eVar.m12415g() == EnumC10261m.LOCKED_FOCUSED || eVar.m12415g() == EnumC10261m.LOCKED_NOT_FOCUSED;
            boolean z2 = eVar.m12417e() == EnumC10250k.CONVERGED || eVar.m12417e() == EnumC10250k.FLASH_REQUIRED || eVar.m12417e() == EnumC10250k.UNKNOWN;
            boolean z3 = eVar.m12414h() == EnumC10267n.CONVERGED || eVar.m12414h() == EnumC10267n.UNKNOWN;
            C0662u1.m40653a("Camera2CapturePipeline", "checkCaptureResult, AE=" + eVar.m12417e() + " AF =" + eVar.m12415g() + " AWB=" + eVar.m12414h());
            return z && z2 && z3;
        }

        public final void m12217q(long j) {
            this.f27651f = j;
        }

        public AbstractFutureC1291a<List<Void>> m12216r(List<C10245j0> list, int i) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C10245j0 j0Var : list) {
                final C10245j0.C10246a k = C10245j0.C10246a.m5639k(j0Var);
                m12225i(k, j0Var);
                if (this.f27649d.m6468c(i)) {
                    m12226h(k);
                }
                arrayList.add(C6287c.m20719a(new C6287c.AbstractC6290c() {
                    @Override
                    public final Object mo5520a(C6287c.C6288a aVar) {
                        Object p;
                        p = C8529o0.C8532c.this.m12218p(k, aVar);
                        return p;
                    }
                }));
                arrayList2.add(k.m5642h());
            }
            this.f27648c.m12130b0(arrayList2);
            return C1111f.m38356c(arrayList);
        }

        public final AbstractFutureC1291a<TotalCaptureResult> m12215s(long j, C8536e.AbstractC8537a aVar) {
            C8536e eVar = new C8536e(j, aVar);
            this.f27648c.m12115s(eVar);
            return eVar.m12211c();
        }
    }

    public interface AbstractC8535d {
        AbstractFutureC1291a<Boolean> mo12209a(TotalCaptureResult totalCaptureResult);

        boolean mo12208b();

        void mo12207c();
    }

    public static class C8536e implements C8564t.AbstractC8567c {
        public C6287c.C6288a<TotalCaptureResult> f27657a;
        public final long f27659c;
        public final AbstractC8537a f27660d;
        public final AbstractFutureC1291a<TotalCaptureResult> f27658b = C6287c.m20719a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object d;
                d = C8529o0.C8536e.this.m12210d(aVar);
                return d;
            }
        });
        public volatile Long f27661e = null;

        public interface AbstractC8537a {
            boolean mo12066a(TotalCaptureResult totalCaptureResult);
        }

        public C8536e(long j, AbstractC8537a aVar) {
            this.f27659c = j;
            this.f27660d = aVar;
        }

        public Object m12210d(C6287c.C6288a aVar) {
            this.f27657a = aVar;
            return "waitFor3AResult";
        }

        @Override
        public boolean mo6115a(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f27661e == null) {
                this.f27661e = l;
            }
            Long l2 = this.f27661e;
            if (0 == this.f27659c || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f27659c) {
                AbstractC8537a aVar = this.f27660d;
                if (aVar != null && !aVar.mo12066a(totalCaptureResult)) {
                    return false;
                }
                this.f27657a.m20716c(totalCaptureResult);
                return true;
            }
            this.f27657a.m20716c(null);
            C0662u1.m40653a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }

        public AbstractFutureC1291a<TotalCaptureResult> m12211c() {
            return this.f27658b;
        }
    }

    public static class C8538f implements AbstractC8535d {
        public final C8564t f27662a;
        public final int f27663b;
        public boolean f27664c = false;

        public C8538f(C8564t tVar, int i) {
            this.f27662a = tVar;
            this.f27663b = i;
        }

        public Object m12204f(C6287c.C6288a aVar) {
            this.f27662a.m12154D().m11997g(aVar, true);
            return "TorchOn";
        }

        @Override
        public AbstractFutureC1291a<Boolean> mo12209a(TotalCaptureResult totalCaptureResult) {
            if (C8529o0.m12241a(this.f27663b, totalCaptureResult)) {
                if (this.f27662a.m12147K()) {
                    C0662u1.m40653a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    C0662u1.m40653a("Camera2CapturePipeline", "Turn on torch");
                    this.f27664c = true;
                    return C1108d.m38363b(C6287c.m20719a(new C6287c.AbstractC6290c() {
                        @Override
                        public final Object mo5520a(C6287c.C6288a aVar) {
                            Object f;
                            f = C8529o0.C8538f.this.m12204f(aVar);
                            return f;
                        }
                    })).m38360e(C8593y0.f27832a, C0003a.m42611a());
                }
            }
            return C1111f.m38351h(Boolean.FALSE);
        }

        @Override
        public boolean mo12208b() {
            return this.f27663b == 0;
        }

        @Override
        public void mo12207c() {
            if (this.f27664c) {
                this.f27662a.m12154D().m11997g(null, false);
                C0662u1.m40653a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    public C8529o0(C8564t tVar, C8927z zVar, C10317x1 x1Var, Executor executor) {
        boolean z = true;
        this.f27632a = tVar;
        Integer num = (Integer) zVar.m10952a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f27636e = (num == null || num.intValue() != 2) ? false : z;
        this.f27635d = executor;
        this.f27634c = x1Var;
        this.f27633b = new C9936n(x1Var);
    }

    public static boolean m12241a(int i, TotalCaptureResult totalCaptureResult) {
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

    public final boolean m12240b(int i) {
        return this.f27633b.m6463a() || this.f27637f == 3 || i == 1;
    }

    public void m12239c(int i) {
        this.f27637f = i;
    }

    public AbstractFutureC1291a<List<Void>> m12238d(List<C10245j0> list, int i, int i2, int i3) {
        C9931i iVar = new C9931i(this.f27634c);
        C8532c cVar = new C8532c(this.f27637f, this.f27635d, this.f27632a, this.f27636e, iVar);
        if (i == 0) {
            cVar.m12227g(new C8531b(this.f27632a));
        }
        if (m12240b(i3)) {
            cVar.m12227g(new C8538f(this.f27632a, i2));
        } else {
            cVar.m12227g(new C8530a(this.f27632a, i2, iVar));
        }
        return C1111f.m38349j(cVar.m12224j(list, i2));
    }
}
