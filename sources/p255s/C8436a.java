package p255s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.AbstractC0615m;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8453c3;
import p266t.C8927z;

public final class C8436a implements C8453c3.AbstractC8455b {
    public final C8927z f27393a;
    public final Range<Float> f27394b;
    public C6287c.C6288a<Void> f27396d;
    public float f27395c = 1.0f;
    public float f27397e = 1.0f;

    public C8436a(C8927z zVar) {
        this.f27393a = zVar;
        this.f27394b = (Range) zVar.m10952a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override
    public void mo12065a(TotalCaptureResult totalCaptureResult) {
        if (this.f27396d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f != null) {
                if (this.f27397e == f.floatValue()) {
                    this.f27396d.m20716c(null);
                    this.f27396d = null;
                }
            }
        }
    }

    @Override
    public void mo12064b(C8333a.C8334a aVar) {
        aVar.m12790e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f27395c));
    }

    @Override
    public float mo12063c() {
        return this.f27394b.getUpper().floatValue();
    }

    @Override
    public float mo12062d() {
        return this.f27394b.getLower().floatValue();
    }

    @Override
    public void mo12061e(float f, C6287c.C6288a<Void> aVar) {
        this.f27395c = f;
        C6287c.C6288a<Void> aVar2 = this.f27396d;
        if (aVar2 != null) {
            aVar2.m20713f(new AbstractC0615m.C0616a("There is a new zoomRatio being set"));
        }
        this.f27397e = this.f27395c;
        this.f27396d = aVar;
    }

    @Override
    public void mo12060f() {
        this.f27395c = 1.0f;
        C6287c.C6288a<Void> aVar = this.f27396d;
        if (aVar != null) {
            aVar.m20713f(new AbstractC0615m.C0616a("Camera is not active."));
            this.f27396d = null;
        }
    }
}
