package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

public class v extends w {
    public v(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override
    public int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f22826a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override
    public int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f22826a.captureBurstRequests(list, executor, captureCallback);
    }
}
