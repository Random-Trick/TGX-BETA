package p255s;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.AbstractC0615m;
import p016b1.C1132h;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8453c3;
import p266t.C8927z;

public final class C8575u1 implements C8453c3.AbstractC8455b {
    public final C8927z f27787a;
    public C6287c.C6288a<Void> f27789c;
    public Rect f27788b = null;
    public Rect f27790d = null;

    public C8575u1(C8927z zVar) {
        this.f27787a = zVar;
    }

    public static Rect m12058g(Rect rect, float f) {
        float width = rect.width() / f;
        float height = rect.height() / f;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override
    public void mo12064a(TotalCaptureResult totalCaptureResult) {
        if (this.f27789c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f27790d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f27789c.m20717c(null);
                this.f27789c = null;
                this.f27790d = null;
            }
        }
    }

    @Override
    public void mo12063b(C8333a.C8334a aVar) {
        Rect rect = this.f27788b;
        if (rect != null) {
            aVar.m12789e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override
    public float mo12062c() {
        Float f = (Float) this.f27787a.m10951a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < mo12061d()) {
            return mo12061d();
        }
        return f.floatValue();
    }

    @Override
    public float mo12061d() {
        return 1.0f;
    }

    @Override
    public void mo12060e(float f, C6287c.C6288a<Void> aVar) {
        this.f27788b = m12058g(m12057h(), f);
        C6287c.C6288a<Void> aVar2 = this.f27789c;
        if (aVar2 != null) {
            aVar2.m20714f(new AbstractC0615m.C0616a("There is a new zoomRatio being set"));
        }
        this.f27790d = this.f27788b;
        this.f27789c = aVar;
    }

    @Override
    public void mo12059f() {
        this.f27790d = null;
        this.f27788b = null;
        C6287c.C6288a<Void> aVar = this.f27789c;
        if (aVar != null) {
            aVar.m20714f(new AbstractC0615m.C0616a("Camera is not active."));
            this.f27789c = null;
        }
    }

    public final Rect m12057h() {
        return (Rect) C1132h.m38325e((Rect) this.f27787a.m10951a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
