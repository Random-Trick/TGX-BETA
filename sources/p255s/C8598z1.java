package p255s;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.AbstractC0615m;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8564t;
import p306w.C9930h;
import p336y.AbstractC10234h;
import p336y.AbstractC10286q;
import p336y.AbstractC10312x;
import p336y.C10243j;
import p336y.C10245j0;
import p336y.C10317x1;

public class C8598z1 {
    public static final MeteringRectangle[] f27840u = new MeteringRectangle[0];
    public final C8564t f27841a;
    public final Executor f27842b;
    public final ScheduledExecutorService f27843c;
    public final C9930h f27846f;
    public ScheduledFuture<?> f27849i;
    public MeteringRectangle[] f27856p;
    public MeteringRectangle[] f27857q;
    public MeteringRectangle[] f27858r;
    public volatile boolean f27844d = false;
    public volatile Rational f27845e = null;
    public boolean f27847g = false;
    public Integer f27848h = 0;
    public long f27850j = 0;
    public boolean f27851k = false;
    public boolean f27852l = false;
    public int f27853m = 1;
    public C8564t.AbstractC8567c f27854n = null;
    public C8564t.AbstractC8567c f27855o = null;
    public C6287c.C6288a<Object> f27859s = null;
    public C6287c.C6288a<Void> f27860t = null;

    public class C8599a extends AbstractC10234h {
        public final C6287c.C6288a f27861a;

        public C8599a(C6287c.C6288a aVar) {
            this.f27861a = aVar;
        }

        @Override
        public void mo5669a() {
            C6287c.C6288a aVar = this.f27861a;
            if (aVar != null) {
                aVar.m20713f(new AbstractC0615m.C0616a("Camera is closed"));
            }
        }

        @Override
        public void mo5668b(AbstractC10286q qVar) {
            C6287c.C6288a aVar = this.f27861a;
            if (aVar != null) {
                aVar.m20716c(qVar);
            }
        }

        @Override
        public void mo5667c(C10243j jVar) {
            C6287c.C6288a aVar = this.f27861a;
            if (aVar != null) {
                aVar.m20713f(new AbstractC10312x.C10314b(jVar));
            }
        }
    }

    public class C8600b extends AbstractC10234h {
        public final C6287c.C6288a f27863a;

        public C8600b(C6287c.C6288a aVar) {
            this.f27863a = aVar;
        }

        @Override
        public void mo5669a() {
            C6287c.C6288a aVar = this.f27863a;
            if (aVar != null) {
                aVar.m20713f(new AbstractC0615m.C0616a("Camera is closed"));
            }
        }

        @Override
        public void mo5668b(AbstractC10286q qVar) {
            C6287c.C6288a aVar = this.f27863a;
            if (aVar != null) {
                aVar.m20716c(null);
            }
        }

        @Override
        public void mo5667c(C10243j jVar) {
            C6287c.C6288a aVar = this.f27863a;
            if (aVar != null) {
                aVar.m20713f(new AbstractC10312x.C10314b(jVar));
            }
        }
    }

    public C8598z1(C8564t tVar, ScheduledExecutorService scheduledExecutorService, Executor executor, C10317x1 x1Var) {
        MeteringRectangle[] meteringRectangleArr = f27840u;
        this.f27856p = meteringRectangleArr;
        this.f27857q = meteringRectangleArr;
        this.f27858r = meteringRectangleArr;
        this.f27841a = tVar;
        this.f27842b = executor;
        this.f27843c = scheduledExecutorService;
        this.f27846f = new C9930h(x1Var);
    }

    public boolean m12010k(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !C8564t.m12148J(totalCaptureResult, j)) {
            return false;
        }
        m12015f();
        return true;
    }

    public void m12019b(C8333a.C8334a aVar) {
        aVar.m12790e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f27841a.m12156B(this.f27847g ? 1 : m12011j())));
        MeteringRectangle[] meteringRectangleArr = this.f27856p;
        if (meteringRectangleArr.length != 0) {
            aVar.m12790e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f27857q;
        if (meteringRectangleArr2.length != 0) {
            aVar.m12790e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f27858r;
        if (meteringRectangleArr3.length != 0) {
            aVar.m12790e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void m12018c(boolean z, boolean z2) {
        if (this.f27844d) {
            C10245j0.C10246a aVar = new C10245j0.C10246a();
            aVar.m5634p(true);
            aVar.m5635o(this.f27853m);
            C8333a.C8334a aVar2 = new C8333a.C8334a();
            if (z) {
                aVar2.m12790e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z2) {
                aVar2.m12790e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.m5645e(aVar2.m12792c());
            this.f27841a.m12130b0(Collections.singletonList(aVar.m5642h()));
        }
    }

    public void m12017d(C6287c.C6288a<Void> aVar) {
        m12012i("Cancelled by another cancelFocusAndMetering()");
        m12013h("Cancelled by cancelFocusAndMetering()");
        this.f27860t = aVar;
        m12014g();
        if (m12006o()) {
            m12018c(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f27840u;
        this.f27856p = meteringRectangleArr;
        this.f27857q = meteringRectangleArr;
        this.f27858r = meteringRectangleArr;
        this.f27847g = false;
        final long e0 = this.f27841a.m12127e0();
        if (this.f27860t != null) {
            final int B = this.f27841a.m12156B(m12011j());
            C8564t.AbstractC8567c y1Var = new C8564t.AbstractC8567c() {
                @Override
                public final boolean mo6115a(TotalCaptureResult totalCaptureResult) {
                    boolean k;
                    k = C8598z1.this.m12010k(B, e0, totalCaptureResult);
                    return k;
                }
            };
            this.f27855o = y1Var;
            this.f27841a.m12115s(y1Var);
        }
    }

    public void m12016e() {
        m12017d(null);
    }

    public final void m12015f() {
        C6287c.C6288a<Void> aVar = this.f27860t;
        if (aVar != null) {
            aVar.m20716c(null);
            this.f27860t = null;
        }
    }

    public final void m12014g() {
        ScheduledFuture<?> scheduledFuture = this.f27849i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f27849i = null;
        }
    }

    public final void m12013h(String str) {
        this.f27841a.m12136V(this.f27854n);
        C6287c.C6288a<Object> aVar = this.f27859s;
        if (aVar != null) {
            aVar.m20713f(new AbstractC0615m.C0616a(str));
            this.f27859s = null;
        }
    }

    public final void m12012i(String str) {
        this.f27841a.m12136V(this.f27855o);
        C6287c.C6288a<Void> aVar = this.f27860t;
        if (aVar != null) {
            aVar.m20713f(new AbstractC0615m.C0616a(str));
            this.f27860t = null;
        }
    }

    public int m12011j() {
        return this.f27853m != 3 ? 4 : 3;
    }

    public void m12009l(boolean z) {
        if (z != this.f27844d) {
            this.f27844d = z;
            if (!this.f27844d) {
                m12016e();
            }
        }
    }

    public void m12008m(Rational rational) {
        this.f27845e = rational;
    }

    public void m12007n(int i) {
        this.f27853m = i;
    }

    public final boolean m12006o() {
        return this.f27856p.length > 0;
    }

    public void m12005p(C6287c.C6288a<Void> aVar) {
        if (this.f27844d) {
            C10245j0.C10246a aVar2 = new C10245j0.C10246a();
            aVar2.m5635o(this.f27853m);
            aVar2.m5634p(true);
            C8333a.C8334a aVar3 = new C8333a.C8334a();
            aVar3.m12790e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            aVar2.m5645e(aVar3.m12792c());
            aVar2.m5647c(new C8600b(aVar));
            this.f27841a.m12130b0(Collections.singletonList(aVar2.m5642h()));
        } else if (aVar != null) {
            aVar.m20713f(new AbstractC0615m.C0616a("Camera is not active."));
        }
    }

    public void m12004q(C6287c.C6288a<AbstractC10286q> aVar, boolean z) {
        if (this.f27844d) {
            C10245j0.C10246a aVar2 = new C10245j0.C10246a();
            aVar2.m5635o(this.f27853m);
            aVar2.m5634p(true);
            C8333a.C8334a aVar3 = new C8333a.C8334a();
            aVar3.m12790e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                aVar3.m12790e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f27841a.m12157A(1)));
            }
            aVar2.m5645e(aVar3.m12792c());
            aVar2.m5647c(new C8599a(aVar));
            this.f27841a.m12130b0(Collections.singletonList(aVar2.m5642h()));
        } else if (aVar != null) {
            aVar.m20713f(new AbstractC0615m.C0616a("Camera is not active."));
        }
    }
}
