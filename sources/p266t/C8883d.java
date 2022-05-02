package p266t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

public class C8883d {
    public static <T> OutputConfiguration m11029a(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    public static void m11028b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
