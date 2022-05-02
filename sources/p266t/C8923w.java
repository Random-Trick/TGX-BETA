package p266t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import p016b1.C1132h;
import p266t.C8889g;

public class C8923w implements C8889g.AbstractC8890a {
    public final CameraCaptureSession f28780a;
    public final Object f28781b;

    public static class C8924a {
        public final Handler f28782a;

        public C8924a(Handler handler) {
            this.f28782a = handler;
        }
    }

    public C8923w(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f28780a = (CameraCaptureSession) C1132h.m38322e(cameraCaptureSession);
        this.f28781b = obj;
    }

    public static C8889g.AbstractC8890a m10953d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C8923w(cameraCaptureSession, new C8924a(handler));
    }

    @Override
    public int mo10956a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28780a.setRepeatingRequest(captureRequest, new C8889g.C8891b(executor, captureCallback), ((C8924a) this.f28781b).f28782a);
    }

    @Override
    public CameraCaptureSession mo10955b() {
        return this.f28780a;
    }

    @Override
    public int mo10954c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28780a.captureBurst(list, new C8889g.C8891b(executor, captureCallback), ((C8924a) this.f28781b).f28782a);
    }
}
