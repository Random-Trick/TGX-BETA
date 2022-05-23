package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.m;
import l0.c;
import r.a;
import s.c3;
import t.z;

public final class a implements c3.b {
    public final z f21939a;
    public final Range<Float> f21940b;
    public c.a<Void> f21942d;
    public float f21941c = 1.0f;
    public float f21943e = 1.0f;

    public a(z zVar) {
        this.f21939a = zVar;
        this.f21940b = (Range) zVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f21942d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 != null) {
                if (this.f21943e == f10.floatValue()) {
                    this.f21942d.c(null);
                    this.f21942d = null;
                }
            }
        }
    }

    @Override
    public void b(a.C0201a aVar) {
        aVar.e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f21941c));
    }

    @Override
    public float c() {
        return this.f21940b.getUpper().floatValue();
    }

    @Override
    public float d() {
        return this.f21940b.getLower().floatValue();
    }

    @Override
    public void e(float f10, c.a<Void> aVar) {
        this.f21941c = f10;
        c.a<Void> aVar2 = this.f21942d;
        if (aVar2 != null) {
            aVar2.f(new m.a("There is a new zoomRatio being set"));
        }
        this.f21943e = this.f21941c;
        this.f21942d = aVar;
    }

    @Override
    public void f() {
        this.f21941c = 1.0f;
        c.a<Void> aVar = this.f21942d;
        if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
            this.f21942d = null;
        }
    }
}
