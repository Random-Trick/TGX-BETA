package w;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import r.a;
import y.x1;

public class a {
    public final Range<Integer> f25677a;

    public a(x1 x1Var) {
        v.a aVar = (v.a) x1Var.b(v.a.class);
        if (aVar == null) {
            this.f25677a = null;
        } else {
            this.f25677a = aVar.b();
        }
    }

    public void a(a.C0201a aVar) {
        Range<Integer> range = this.f25677a;
        if (range != null) {
            aVar.e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
