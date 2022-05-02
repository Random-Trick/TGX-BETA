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
    public final C8927z f27396a;
    public final Range<Float> f27397b;
    public C6287c.C6288a<Void> f27399d;
    public float f27398c = 1.0f;
    public float f27400e = 1.0f;

    public C8436a(C8927z zVar) {
        this.f27396a = zVar;
        this.f27397b = (Range) zVar.m10951a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override
    public void mo12064a(TotalCaptureResult totalCaptureResult) {
        if (this.f27399d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f != null) {
                if (this.f27400e == f.floatValue()) {
                    this.f27399d.m20717c(null);
                    this.f27399d = null;
                }
            }
        }
    }

    @Override
    public void mo12063b(C8333a.C8334a aVar) {
        aVar.m12789e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f27398c));
    }

    @Override
    public float mo12062c() {
        return this.f27397b.getUpper().floatValue();
    }

    @Override
    public float mo12061d() {
        return this.f27397b.getLower().floatValue();
    }

    @Override
    public void mo12060e(float f, C6287c.C6288a<Void> aVar) {
        this.f27398c = f;
        C6287c.C6288a<Void> aVar2 = this.f27399d;
        if (aVar2 != null) {
            aVar2.m20714f(new AbstractC0615m.C0616a("There is a new zoomRatio being set"));
        }
        this.f27400e = this.f27398c;
        this.f27399d = aVar;
    }

    @Override
    public void mo12059f() {
        this.f27398c = 1.0f;
        C6287c.C6288a<Void> aVar = this.f27399d;
        if (aVar != null) {
            aVar.m20714f(new AbstractC0615m.C0616a("Camera is not active."));
            this.f27399d = null;
        }
    }
}
