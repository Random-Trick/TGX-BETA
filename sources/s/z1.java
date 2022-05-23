package s;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.m;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import l0.c;
import r.a;
import s.t;
import w.h;
import y.j;
import y.j0;
import y.q;
import y.x;
import y.x1;

public class z1 {
    public static final MeteringRectangle[] f22356u = new MeteringRectangle[0];
    public final t f22357a;
    public final Executor f22358b;
    public final ScheduledExecutorService f22359c;
    public final h f22362f;
    public ScheduledFuture<?> f22365i;
    public MeteringRectangle[] f22372p;
    public MeteringRectangle[] f22373q;
    public MeteringRectangle[] f22374r;
    public volatile boolean f22360d = false;
    public volatile Rational f22361e = null;
    public boolean f22363g = false;
    public Integer f22364h = 0;
    public long f22366j = 0;
    public boolean f22367k = false;
    public boolean f22368l = false;
    public int f22369m = 1;
    public t.c f22370n = null;
    public t.c f22371o = null;
    public c.a<Object> f22375s = null;
    public c.a<Void> f22376t = null;

    public class a extends y.h {
        public final c.a f22377a;

        public a(c.a aVar) {
            this.f22377a = aVar;
        }

        @Override
        public void a() {
            c.a aVar = this.f22377a;
            if (aVar != null) {
                aVar.f(new m.a("Camera is closed"));
            }
        }

        @Override
        public void b(q qVar) {
            c.a aVar = this.f22377a;
            if (aVar != null) {
                aVar.c(qVar);
            }
        }

        @Override
        public void c(j jVar) {
            c.a aVar = this.f22377a;
            if (aVar != null) {
                aVar.f(new x.b(jVar));
            }
        }
    }

    public class b extends y.h {
        public final c.a f22379a;

        public b(c.a aVar) {
            this.f22379a = aVar;
        }

        @Override
        public void a() {
            c.a aVar = this.f22379a;
            if (aVar != null) {
                aVar.f(new m.a("Camera is closed"));
            }
        }

        @Override
        public void b(q qVar) {
            c.a aVar = this.f22379a;
            if (aVar != null) {
                aVar.c(null);
            }
        }

        @Override
        public void c(j jVar) {
            c.a aVar = this.f22379a;
            if (aVar != null) {
                aVar.f(new x.b(jVar));
            }
        }
    }

    public z1(t tVar, ScheduledExecutorService scheduledExecutorService, Executor executor, x1 x1Var) {
        MeteringRectangle[] meteringRectangleArr = f22356u;
        this.f22372p = meteringRectangleArr;
        this.f22373q = meteringRectangleArr;
        this.f22374r = meteringRectangleArr;
        this.f22357a = tVar;
        this.f22358b = executor;
        this.f22359c = scheduledExecutorService;
        this.f22362f = new h(x1Var);
    }

    public boolean k(int i10, long j10, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !t.J(totalCaptureResult, j10)) {
            return false;
        }
        f();
        return true;
    }

    public void b(a.C0201a aVar) {
        aVar.e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f22357a.B(this.f22363g ? 1 : j())));
        MeteringRectangle[] meteringRectangleArr = this.f22372p;
        if (meteringRectangleArr.length != 0) {
            aVar.e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f22373q;
        if (meteringRectangleArr2.length != 0) {
            aVar.e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f22374r;
        if (meteringRectangleArr3.length != 0) {
            aVar.e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void c(boolean z10, boolean z11) {
        if (this.f22360d) {
            j0.a aVar = new j0.a();
            aVar.p(true);
            aVar.o(this.f22369m);
            a.C0201a aVar2 = new a.C0201a();
            if (z10) {
                aVar2.e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z11) {
                aVar2.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(aVar2.c());
            this.f22357a.b0(Collections.singletonList(aVar.h()));
        }
    }

    public void d(c.a<Void> aVar) {
        i("Cancelled by another cancelFocusAndMetering()");
        h("Cancelled by cancelFocusAndMetering()");
        this.f22376t = aVar;
        g();
        if (o()) {
            c(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f22356u;
        this.f22372p = meteringRectangleArr;
        this.f22373q = meteringRectangleArr;
        this.f22374r = meteringRectangleArr;
        this.f22363g = false;
        final long e02 = this.f22357a.e0();
        if (this.f22376t != null) {
            final int B = this.f22357a.B(j());
            t.c y1Var = new t.c() {
                @Override
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean k10;
                    k10 = z1.this.k(B, e02, totalCaptureResult);
                    return k10;
                }
            };
            this.f22371o = y1Var;
            this.f22357a.s(y1Var);
        }
    }

    public void e() {
        d(null);
    }

    public final void f() {
        c.a<Void> aVar = this.f22376t;
        if (aVar != null) {
            aVar.c(null);
            this.f22376t = null;
        }
    }

    public final void g() {
        ScheduledFuture<?> scheduledFuture = this.f22365i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f22365i = null;
        }
    }

    public final void h(String str) {
        this.f22357a.V(this.f22370n);
        c.a<Object> aVar = this.f22375s;
        if (aVar != null) {
            aVar.f(new m.a(str));
            this.f22375s = null;
        }
    }

    public final void i(String str) {
        this.f22357a.V(this.f22371o);
        c.a<Void> aVar = this.f22376t;
        if (aVar != null) {
            aVar.f(new m.a(str));
            this.f22376t = null;
        }
    }

    public int j() {
        return this.f22369m != 3 ? 4 : 3;
    }

    public void l(boolean z10) {
        if (z10 != this.f22360d) {
            this.f22360d = z10;
            if (!this.f22360d) {
                e();
            }
        }
    }

    public void m(Rational rational) {
        this.f22361e = rational;
    }

    public void n(int i10) {
        this.f22369m = i10;
    }

    public final boolean o() {
        return this.f22372p.length > 0;
    }

    public void p(c.a<Void> aVar) {
        if (this.f22360d) {
            j0.a aVar2 = new j0.a();
            aVar2.o(this.f22369m);
            aVar2.p(true);
            a.C0201a aVar3 = new a.C0201a();
            aVar3.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            aVar2.e(aVar3.c());
            aVar2.c(new b(aVar));
            this.f22357a.b0(Collections.singletonList(aVar2.h()));
        } else if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
        }
    }

    public void q(c.a<q> aVar, boolean z10) {
        if (this.f22360d) {
            j0.a aVar2 = new j0.a();
            aVar2.o(this.f22369m);
            aVar2.p(true);
            a.C0201a aVar3 = new a.C0201a();
            aVar3.e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z10) {
                aVar3.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f22357a.A(1)));
            }
            aVar2.e(aVar3.c());
            aVar2.c(new a(aVar));
            this.f22357a.b0(Collections.singletonList(aVar2.h()));
        } else if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
        }
    }
}
