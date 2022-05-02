package p255s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import p016b1.C1132h;
import p336y.AbstractC10234h;
import p336y.C10242i2;
import p336y.C10243j;

public final class C8514k1 extends CameraCaptureSession.CaptureCallback {
    public final AbstractC10234h f27615a;

    public C8514k1(AbstractC10234h hVar) {
        Objects.requireNonNull(hVar, "cameraCaptureCallback is null");
        this.f27615a = hVar;
    }

    @Override
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C10242i2 i2Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C1132h.m38328b(tag instanceof C10242i2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            i2Var = (C10242i2) tag;
        } else {
            i2Var = C10242i2.m5661a();
        }
        this.f27615a.mo5668b(new C8462e(i2Var, totalCaptureResult));
    }

    @Override
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f27615a.mo5667c(new C10243j(C10243j.EnumC10244a.ERROR));
    }
}
