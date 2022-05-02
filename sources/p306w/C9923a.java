package p306w;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import p240r.C8333a;
import p293v.C9806a;
import p336y.C10317x1;

public class C9923a {
    public final Range<Integer> f32305a;

    public C9923a(C10317x1 x1Var) {
        C9806a aVar = (C9806a) x1Var.m5479b(C9806a.class);
        if (aVar == null) {
            this.f32305a = null;
        } else {
            this.f32305a = aVar.m6828b();
        }
    }

    public void m6476a(C8333a.C8334a aVar) {
        Range<Integer> range = this.f32305a;
        if (range != null) {
            aVar.m12789e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
