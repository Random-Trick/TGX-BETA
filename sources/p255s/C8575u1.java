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
    public final C8927z f27784a;
    public C6287c.C6288a<Void> f27786c;
    public Rect f27785b = null;
    public Rect f27787d = null;

    public C8575u1(C8927z zVar) {
        this.f27784a = zVar;
    }

    public static Rect m12059g(Rect rect, float f) {
        float width = rect.width() / f;
        float height = rect.height() / f;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override
    public void mo12065a(TotalCaptureResult totalCaptureResult) {
        if (this.f27786c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f27787d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f27786c.m20716c(null);
                this.f27786c = null;
                this.f27787d = null;
            }
        }
    }

    @Override
    public void mo12064b(C8333a.C8334a aVar) {
        Rect rect = this.f27785b;
        if (rect != null) {
            aVar.m12790e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override
    public float mo12063c() {
        Float f = (Float) this.f27784a.m10952a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < mo12062d()) {
            return mo12062d();
        }
        return f.floatValue();
    }

    @Override
    public float mo12062d() {
        return 1.0f;
    }

    @Override
    public void mo12061e(float f, C6287c.C6288a<Void> aVar) {
        this.f27785b = m12059g(m12058h(), f);
        C6287c.C6288a<Void> aVar2 = this.f27786c;
        if (aVar2 != null) {
            aVar2.m20713f(new AbstractC0615m.C0616a("There is a new zoomRatio being set"));
        }
        this.f27787d = this.f27785b;
        this.f27786c = aVar;
    }

    @Override
    public void mo12060f() {
        this.f27787d = null;
        this.f27785b = null;
        C6287c.C6288a<Void> aVar = this.f27786c;
        if (aVar != null) {
            aVar.m20713f(new AbstractC0615m.C0616a("Camera is not active."));
            this.f27786c = null;
        }
    }

    public final Rect m12058h() {
        return (Rect) C1132h.m38322e((Rect) this.f27784a.m10952a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
