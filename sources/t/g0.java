package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import b1.h;
import java.util.List;
import t.g;
import t.i0;
import u.a;
import u.b;
import u.g;

public class g0 extends f0 {
    public g0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static g0 h(CameraDevice cameraDevice, Handler handler) {
        return new g0(cameraDevice, new i0.a(handler));
    }

    @Override
    public void a(g gVar) {
        i0.c(this.f22778a, gVar);
        g.c cVar = new g.c(gVar.a(), gVar.e());
        List<b> c10 = gVar.c();
        Handler handler = ((i0.a) h.e((i0.a) this.f22779b)).f22780a;
        a b10 = gVar.b();
        try {
            if (b10 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b10.a();
                h.e(inputConfiguration);
                this.f22778a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, u.g.g(c10), cVar, handler);
            } else if (gVar.d() == 1) {
                this.f22778a.createConstrainedHighSpeedCaptureSession(i0.f(c10), cVar, handler);
            } else {
                this.f22778a.createCaptureSessionByOutputConfigurations(u.g.g(c10), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
