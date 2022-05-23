package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;
import t.g;

public interface j2 {

    public static abstract class a {
        public void a(j2 j2Var) {
        }

        public void o(j2 j2Var) {
        }

        public void p(j2 j2Var) {
        }

        public void q(j2 j2Var) {
        }

        public void r(j2 j2Var) {
        }

        public void s(j2 j2Var) {
        }

        public void t(j2 j2Var) {
        }

        public void u(j2 j2Var, Surface surface) {
        }
    }

    a c();

    void close();

    void d();

    int f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    g h();

    void i();

    CameraDevice j();

    int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    void l();

    c7.a<Void> n(String str);
}
