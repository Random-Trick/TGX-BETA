package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import b1.h;
import java.util.List;
import java.util.concurrent.Executor;
import t.g;

public class w implements g.a {
    public final CameraCaptureSession f22826a;
    public final Object f22827b;

    public static class a {
        public final Handler f22828a;

        public a(Handler handler) {
            this.f22828a = handler;
        }
    }

    public w(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f22826a = (CameraCaptureSession) h.e(cameraCaptureSession);
        this.f22827b = obj;
    }

    public static g.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new w(cameraCaptureSession, new a(handler));
    }

    @Override
    public int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f22826a.setRepeatingRequest(captureRequest, new g.b(executor, captureCallback), ((a) this.f22827b).f22828a);
    }

    @Override
    public CameraCaptureSession b() {
        return this.f22826a;
    }

    @Override
    public int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f22826a.captureBurst(list, new g.b(executor, captureCallback), ((a) this.f22827b).f22828a);
    }
}
