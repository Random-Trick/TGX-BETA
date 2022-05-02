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
        public void mo12036a(AbstractC8508j2 j2Var) {
        }

        public void mo12035o(AbstractC8508j2 j2Var) {
        }

        public void mo12034p(AbstractC8508j2 j2Var) {
        }

        public void mo12033q(AbstractC8508j2 j2Var) {
        }

        public void mo12032r(AbstractC8508j2 j2Var) {
        }

        public void mo12031s(AbstractC8508j2 j2Var) {
        }

        public void mo12030t(AbstractC8508j2 j2Var) {
        }

        public void mo12029u(AbstractC8508j2 j2Var, Surface surface) {
        }
    }

    AbstractC8509a mo12191c();

    void close();

    void mo12190d();

    int mo12189f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    C8889g mo12188h();

    void mo12187i();

    CameraDevice mo12186j();

    int mo12067k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    void mo12185l();

    AbstractFutureC1291a<Void> mo12066n(String str);
}
