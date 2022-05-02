package p255s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;
import p022b7.AbstractFutureC1291a;
import p266t.C8889g;

public interface AbstractC8508j2 {

    public static abstract class AbstractC8509a {
        public void mo12037a(AbstractC8508j2 j2Var) {
        }

        public void mo12036o(AbstractC8508j2 j2Var) {
        }

        public void mo12035p(AbstractC8508j2 j2Var) {
        }

        public void mo12034q(AbstractC8508j2 j2Var) {
        }

        public void mo12033r(AbstractC8508j2 j2Var) {
        }

        public void mo12032s(AbstractC8508j2 j2Var) {
        }

        public void mo12031t(AbstractC8508j2 j2Var) {
        }

        public void mo12030u(AbstractC8508j2 j2Var, Surface surface) {
        }
    }

    AbstractC8509a mo12192c();

    void close();

    void mo12191d();

    int mo12190f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    C8889g mo12189h();

    void mo12188i();

    CameraDevice mo12187j();

    int mo12068k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    void mo12186l();

    AbstractFutureC1291a<Void> mo12067n(String str);
}
