package w;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import r.a;
import v.i;
import v.n;

public class f {
    @SuppressLint({"NewApi"})
    public void a(int i10, a.C0201a aVar) {
        if (((n) i.a(n.class)) != null) {
            if (i10 == 0) {
                aVar.e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
            } else if (i10 == 1) {
                aVar.e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
            }
        }
    }
}
