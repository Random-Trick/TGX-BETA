package s;

import android.hardware.camera2.CameraCaptureSession;
import java.util.Objects;
import y.h;

public final class l1 extends h {
    public final CameraCaptureSession.CaptureCallback f22140a;

    public l1(CameraCaptureSession.CaptureCallback captureCallback) {
        Objects.requireNonNull(captureCallback, "captureCallback is null");
        this.f22140a = captureCallback;
    }

    public static l1 d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new l1(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback e() {
        return this.f22140a;
    }
}
