package p255s;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.AbstractC0615m;
import java.util.concurrent.Executor;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8564t;
import p266t.C8927z;

public class C8586w1 {
    public final C8564t f27812a;
    public final C8590x1 f27813b;
    public final Executor f27814c;
    public boolean f27815d = false;
    public C6287c.C6288a<Integer> f27816e;
    public C8564t.AbstractC8567c f27817f;

    public C8586w1(C8564t tVar, C8927z zVar, Executor executor) {
        this.f27812a = tVar;
        this.f27813b = new C8590x1(zVar, 0);
        this.f27814c = executor;
    }

    public final void m12029a() {
        C6287c.C6288a<Integer> aVar = this.f27816e;
        if (aVar != null) {
            aVar.m20713f(new AbstractC0615m.C0616a("Cancelled by another setExposureCompensationIndex()"));
            this.f27816e = null;
        }
        C8564t.AbstractC8567c cVar = this.f27817f;
        if (cVar != null) {
            this.f27812a.m12136V(cVar);
            this.f27817f = null;
        }
    }

    public void m12028b(boolean z) {
        if (z != this.f27815d) {
            this.f27815d = z;
            if (!z) {
                this.f27813b.m12025b(0);
                m12029a();
            }
        }
    }

    public void m12027c(C8333a.C8334a aVar) {
        aVar.m12790e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f27813b.m12026a()));
    }
}
