package p266t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import p016b1.C1132h;
import p266t.C8889g;
import p266t.C8897i0;
import p279u.C9394a;
import p279u.C9407g;

public class C8888f0 extends C8897i0 {
    public C8888f0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static C8888f0 m11021g(CameraDevice cameraDevice, Handler handler) {
        return new C8888f0(cameraDevice, new C8897i0.C8898a(handler));
    }

    @Override
    public void mo10987a(C9407g gVar) {
        C8897i0.m10985c(this.f28725a, gVar);
        C8889g.C8892c cVar = new C8889g.C8892c(gVar.m8783a(), gVar.m8779e());
        List<Surface> f = C8897i0.m10982f(gVar.m8781c());
        Handler handler = ((C8897i0.C8898a) C1132h.m38322e((C8897i0.C8898a) this.f28726b)).f28727a;
        C9394a b = gVar.m8782b();
        try {
            if (b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b.m8801a();
                C1132h.m38322e(inputConfiguration);
                this.f28725a.createReprocessableCaptureSession(inputConfiguration, f, cVar, handler);
            } else if (gVar.m8780d() == 1) {
                this.f28725a.createConstrainedHighSpeedCaptureSession(f, cVar, handler);
            } else {
                m10983e(this.f28725a, f, cVar, handler);
            }
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }
}
