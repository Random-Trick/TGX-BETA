package p266t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

public class C8922v extends C8923w {
    public C8922v(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override
    public int mo10955a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28783a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override
    public int mo10953c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28783a.captureBurstRequests(list, executor, captureCallback);
    }
}
