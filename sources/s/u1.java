package s;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.m;
import b1.h;
import l0.c;
import r.a;
import s.c3;
import t.z;

public final class u1 implements c3.b {
    public final z f22300a;
    public c.a<Void> f22302c;
    public Rect f22301b = null;
    public Rect f22303d = null;

    public u1(z zVar) {
        this.f22300a = zVar;
    }

    public static Rect g(Rect rect, float f10) {
        float width = rect.width() / f10;
        float height = rect.height() / f10;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f22302c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f22303d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f22302c.c(null);
                this.f22302c = null;
                this.f22303d = null;
            }
        }
    }

    @Override
    public void b(a.C0201a aVar) {
        Rect rect = this.f22301b;
        if (rect != null) {
            aVar.e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override
    public float c() {
        Float f10 = (Float) this.f22300a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        if (f10.floatValue() < d()) {
            return d();
        }
        return f10.floatValue();
    }

    @Override
    public float d() {
        return 1.0f;
    }

    @Override
    public void e(float f10, c.a<Void> aVar) {
        this.f22301b = g(h(), f10);
        c.a<Void> aVar2 = this.f22302c;
        if (aVar2 != null) {
            aVar2.f(new m.a("There is a new zoomRatio being set"));
        }
        this.f22303d = this.f22301b;
        this.f22302c = aVar;
    }

    @Override
    public void f() {
        this.f22303d = null;
        this.f22301b = null;
        c.a<Void> aVar = this.f22302c;
        if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
            this.f22302c = null;
        }
    }

    public final Rect h() {
        return (Rect) h.e((Rect) this.f22300a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
