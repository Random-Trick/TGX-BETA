package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import b1.h;
import u.g;

public class h0 extends g0 {
    public h0(CameraDevice cameraDevice) {
        super((CameraDevice) h.e(cameraDevice), null);
    }

    @Override
    public void a(g gVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) gVar.i();
        h.e(sessionConfiguration);
        try {
            this.f22778a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
