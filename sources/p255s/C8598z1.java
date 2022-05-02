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
    public static final MeteringRectangle[] f27843u = new MeteringRectangle[0];
    public final C8564t f27844a;
    public final Executor f27845b;
    public final ScheduledExecutorService f27846c;
    public final C9930h f27849f;
    public ScheduledFuture<?> f27852i;
    public MeteringRectangle[] f27859p;
    public MeteringRectangle[] f27860q;
    public MeteringRectangle[] f27861r;
    public volatile boolean f27847d = false;
    public volatile Rational f27848e = null;
    public boolean f27850g = false;
    public Integer f27851h = 0;
    public long f27853j = 0;
    public boolean f27854k = false;
    public boolean f27855l = false;
    public int f27856m = 1;
    public C8564t.AbstractC8567c f27857n = null;
    public C8564t.AbstractC8567c f27858o = null;
    public C6287c.C6288a<Object> f27862s = null;
    public C6287c.C6288a<Void> f27863t = null;

    public class C8599a extends AbstractC10234h {
        public final C6287c.C6288a f27864a;

        public C8599a(C6287c.C6288a aVar) {
            this.f27864a = aVar;
        }

        @Override
        public void mo5669a() {
            C6287c.C6288a aVar = this.f27864a;
            if (aVar != null) {
                aVar.m20714f(new AbstractC0615m.C0616a("Camera is closed"));
            }
        }

        @Override
        public void mo5668b(AbstractC10286q qVar) {
            C6287c.C6288a aVar = this.f27864a;
            if (aVar != null) {
                aVar.m20717c(qVar);
            }
        }

        @Override
        public void mo5667c(C10243j jVar) {
            C6287c.C6288a aVar = this.f27864a;
            if (aVar != null) {
                aVar.m20714f(new AbstractC10312x.C10314b(jVar));
            }
        }
    }

    public class C8600b extends AbstractC10234h {
        public final C6287c.C6288a f27866a;

        public C8600b(C6287c.C6288a aVar) {
            this.f27866a = aVar;
        }

        @Override
        public void mo5669a() {
            C6287c.C6288a aVar = this.f27866a;
            if (aVar != null) {
                aVar.m20714f(new AbstractC0615m.C0616a("Camera is closed"));
            }
        }

        @Override
        public void mo5668b(AbstractC10286q qVar) {
            C6287c.C6288a aVar = this.f27866a;
            if (aVar != null) {
                aVar.m20717c(null);
            }
        }

        @Override
        public void mo5667c(C10243j jVar) {
            C6287c.C6288a aVar = this.f27866a;
            if (aVar != null) {
                aVar.m20714f(new AbstractC10312x.C10314b(jVar));
            }
        }
    }

    public C8598z1(C8564t tVar, ScheduledExecutorService scheduledExecutorService, Executor executor, C10317x1 x1Var) {
        MeteringRectangle[] meteringRectangleArr = f27843u;
        this.f27859p = meteringRectangleArr;
        this.f27860q = meteringRectangleArr;
        this.f27861r = meteringRectangleArr;
        this.f27844a = tVar;
        this.f27845b = executor;
        this.f27846c = scheduledExecutorService;
        this.f27849f = new C9930h(x1Var);
    }

    public boolean m12009k(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !C8564t.m12147J(totalCaptureResult, j)) {
            return false;
        }
        m12014f();
        return true;
    }

    public void m12018b(C8333a.C8334a aVar) {
        aVar.m12789e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f27844a.m12155B(this.f27850g ? 1 : m12010j())));
        MeteringRectangle[] meteringRectangleArr = this.f27859p;
        if (meteringRectangleArr.length != 0) {
            aVar.m12789e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f27860q;
        if (meteringRectangleArr2.length != 0) {
            aVar.m12789e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f27861r;
        if (meteringRectangleArr3.length != 0) {
            aVar.m12789e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void m12017c(boolean z, boolean z2) {
        if (this.f27847d) {
            C10245j0.C10246a aVar = new C10245j0.C10246a();
            aVar.m5634p(true);
            aVar.m5635o(this.f27856m);
            C8333a.C8334a aVar2 = new C8333a.C8334a();
            if (z) {
                aVar2.m12789e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z2) {
                aVar2.m12789e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.m5645e(aVar2.m12791c());
            this.f27844a.m12129b0(Collections.singletonList(aVar.m5642h()));
        }
    }

    public void m12016d(C6287c.C6288a<Void> aVar) {
        m12011i("Cancelled by another cancelFocusAndMetering()");
        m12012h("Cancelled by cancelFocusAndMetering()");
        this.f27863t = aVar;
        m12013g();
        if (m12005o()) {
            m12017c(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f27843u;
        this.f27859p = meteringRectangleArr;
        this.f27860q = meteringRectangleArr;
        this.f27861r = meteringRectangleArr;
        this.f27850g = false;
        final long e0 = this.f27844a.m12126e0();
        if (this.f27863t != null) {
            final int B = this.f27844a.m12155B(m12010j());
            C8564t.AbstractC8567c y1Var = new C8564t.AbstractC8567c() {
                @Override
                public final boolean mo6115a(TotalCaptureResult totalCaptureResult) {
                    boolean k;
                    k = C8598z1.this.m12009k(B, e0, totalCaptureResult);
                    return k;
                }
            };
            this.f27858o = y1Var;
            this.f27844a.m12114s(y1Var);
        }
    }

    public void m12015e() {
        m12016d(null);
    }

    public final void m12014f() {
        C6287c.C6288a<Void> aVar = this.f27863t;
        if (aVar != null) {
            aVar.m20717c(null);
            this.f27863t = null;
        }
    }

    public final void m12013g() {
        ScheduledFuture<?> scheduledFuture = this.f27852i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f27852i = null;
        }
    }

    public final void m12012h(String str) {
        this.f27844a.m12135V(this.f27857n);
        C6287c.C6288a<Object> aVar = this.f27862s;
        if (aVar != null) {
            aVar.m20714f(new AbstractC0615m.C0616a(str));
            this.f27862s = null;
        }
    }

    public final void m12011i(String str) {
        this.f27844a.m12135V(this.f27858o);
        C6287c.C6288a<Void> aVar = this.f27863t;
        if (aVar != null) {
            aVar.m20714f(new AbstractC0615m.C0616a(str));
            this.f27863t = null;
        }
    }

    public int m12010j() {
        return this.f27856m != 3 ? 4 : 3;
    }

    public void m12008l(boolean z) {
        if (z != this.f27847d) {
            this.f27847d = z;
            if (!this.f27847d) {
                m12015e();
            }
        }
    }

    public void m12007m(Rational rational) {
        this.f27848e = rational;
    }

    public void m12006n(int i) {
        this.f27856m = i;
    }

    public final boolean m12005o() {
        return this.f27859p.length > 0;
    }

    public void m12004p(C6287c.C6288a<Void> aVar) {
        if (this.f27847d) {
            C10245j0.C10246a aVar2 = new C10245j0.C10246a();
            aVar2.m5635o(this.f27856m);
            aVar2.m5634p(true);
            C8333a.C8334a aVar3 = new C8333a.C8334a();
            aVar3.m12789e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            aVar2.m5645e(aVar3.m12791c());
            aVar2.m5647c(new C8600b(aVar));
            this.f27844a.m12129b0(Collections.singletonList(aVar2.m5642h()));
        } else if (aVar != null) {
            aVar.m20714f(new AbstractC0615m.C0616a("Camera is not active."));
        }
    }

    public void m12003q(C6287c.C6288a<AbstractC10286q> aVar, boolean z) {
        if (this.f27847d) {
            C10245j0.C10246a aVar2 = new C10245j0.C10246a();
            aVar2.m5635o(this.f27856m);
            aVar2.m5634p(true);
            C8333a.C8334a aVar3 = new C8333a.C8334a();
            aVar3.m12789e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                aVar3.m12789e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f27844a.m12156A(1)));
            }
            aVar2.m5645e(aVar3.m12791c());
            aVar2.m5647c(new C8599a(aVar));
            this.f27844a.m12129b0(Collections.singletonList(aVar2.m5642h()));
        } else if (aVar != null) {
            aVar.m20714f(new AbstractC0615m.C0616a("Camera is not active."));
        }
    }
}
