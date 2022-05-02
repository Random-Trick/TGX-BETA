package p266t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import p016b1.C1132h;
import p266t.C8889g;
import p266t.C8897i0;
import p279u.C9394a;
import p279u.C9398b;
import p279u.C9407g;

public class C8893g0 extends C8888f0 {
    public C8893g0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static C8893g0 m10988h(CameraDevice cameraDevice, Handler handler) {
        return new C8893g0(cameraDevice, new C8897i0.C8898a(handler));
    }

    @Override
    public void mo10987a(C9407g gVar) {
        C8897i0.m10985c(this.f28725a, gVar);
        C8889g.C8892c cVar = new C8889g.C8892c(gVar.m8783a(), gVar.m8779e());
        List<C9398b> c = gVar.m8781c();
        Handler handler = ((C8897i0.C8898a) C1132h.m38322e((C8897i0.C8898a) this.f28726b)).f28727a;
        C9394a b = gVar.m8782b();
        try {
            if (b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b.m8801a();
                C1132h.m38322e(inputConfiguration);
                this.f28725a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C9407g.m8777g(c), cVar, handler);
            } else if (gVar.m8780d() == 1) {
                this.f28725a.createConstrainedHighSpeedCaptureSession(C8897i0.m10982f(c), cVar, handler);
            } else {
                this.f28725a.createCaptureSessionByOutputConfigurations(C9407g.m8777g(c), cVar, handler);
            }
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }
}
