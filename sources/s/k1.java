package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import y.h;
import y.i2;
import y.j;

public final class k1 extends CameraCaptureSession.CaptureCallback {
    public final h f22134a;

    public k1(h hVar) {
        Objects.requireNonNull(hVar, "cameraCaptureCallback is null");
        this.f22134a = hVar;
    }

    @Override
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        i2 i2Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            b1.h.b(tag instanceof i2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            i2Var = (i2) tag;
        } else {
            i2Var = i2.a();
        }
        this.f22134a.b(new e(i2Var, totalCaptureResult));
    }

    @Override
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f22134a.c(new j(j.a.ERROR));
    }
}
