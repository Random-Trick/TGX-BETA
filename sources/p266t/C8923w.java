package p266t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import p016b1.C1132h;
import p266t.C8889g;

public class C8923w implements C8889g.AbstractC8890a {
    public final CameraCaptureSession f28783a;
    public final Object f28784b;

    public static class C8924a {
        public final Handler f28785a;

        public C8924a(Handler handler) {
            this.f28785a = handler;
        }
    }

    public C8923w(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f28783a = (CameraCaptureSession) C1132h.m38325e(cameraCaptureSession);
        this.f28784b = obj;
    }

    public static C8889g.AbstractC8890a m10952d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C8923w(cameraCaptureSession, new C8924a(handler));
    }

    @Override
    public int mo10955a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28783a.setRepeatingRequest(captureRequest, new C8889g.C8891b(executor, captureCallback), ((C8924a) this.f28784b).f28785a);
    }

    @Override
    public CameraCaptureSession mo10954b() {
        return this.f28783a;
    }

    @Override
    public int mo10953c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28783a.captureBurst(list, new C8889g.C8891b(executor, captureCallback), ((C8924a) this.f28784b).f28785a);
    }
}
