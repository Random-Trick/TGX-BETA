package s;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.m;
import java.util.concurrent.Executor;
import l0.c;
import r.a;
import s.t;
import t.z;

public class w1 {
    public final t f22328a;
    public final x1 f22329b;
    public final Executor f22330c;
    public boolean f22331d = false;
    public c.a<Integer> f22332e;
    public t.c f22333f;

    public w1(t tVar, z zVar, Executor executor) {
        this.f22328a = tVar;
        this.f22329b = new x1(zVar, 0);
        this.f22330c = executor;
    }

    public final void a() {
        c.a<Integer> aVar = this.f22332e;
        if (aVar != null) {
            aVar.f(new m.a("Cancelled by another setExposureCompensationIndex()"));
            this.f22332e = null;
        }
        t.c cVar = this.f22333f;
        if (cVar != null) {
            this.f22328a.V(cVar);
            this.f22333f = null;
        }
    }

    public void b(boolean z10) {
        if (z10 != this.f22331d) {
            this.f22331d = z10;
            if (!z10) {
                this.f22329b.b(0);
                a();
            }
        }
    }

    public void c(a.C0201a aVar) {
        aVar.e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f22329b.a()));
    }
}
