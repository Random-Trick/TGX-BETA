package p266t;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

public class C8879b {
    public static void m11030a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
