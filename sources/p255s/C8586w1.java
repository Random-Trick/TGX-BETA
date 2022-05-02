package p255s;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.AbstractC0615m;
import java.util.concurrent.Executor;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8564t;
import p266t.C8927z;

public class C8586w1 {
    public final C8564t f27815a;
    public final C8590x1 f27816b;
    public final Executor f27817c;
    public boolean f27818d = false;
    public C6287c.C6288a<Integer> f27819e;
    public C8564t.AbstractC8567c f27820f;

    public C8586w1(C8564t tVar, C8927z zVar, Executor executor) {
        this.f27815a = tVar;
        this.f27816b = new C8590x1(zVar, 0);
        this.f27817c = executor;
    }

    public final void m12028a() {
        C6287c.C6288a<Integer> aVar = this.f27819e;
        if (aVar != null) {
            aVar.m20714f(new AbstractC0615m.C0616a("Cancelled by another setExposureCompensationIndex()"));
            this.f27819e = null;
        }
        C8564t.AbstractC8567c cVar = this.f27820f;
        if (cVar != null) {
            this.f27815a.m12135V(cVar);
            this.f27820f = null;
        }
    }

    public void m12027b(boolean z) {
        if (z != this.f27818d) {
            this.f27818d = z;
            if (!z) {
                this.f27816b.m12024b(0);
                m12028a();
            }
        }
    }

    public void m12026c(C8333a.C8334a aVar) {
        aVar.m12789e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f27816b.m12025a()));
    }
}
