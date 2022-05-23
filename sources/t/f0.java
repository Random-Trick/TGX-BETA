package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import b1.h;
import java.util.List;
import t.g;
import t.i0;
import u.a;
import u.g;

public class f0 extends i0 {
    public f0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static f0 g(CameraDevice cameraDevice, Handler handler) {
        return new f0(cameraDevice, new i0.a(handler));
    }

    @Override
    public void a(g gVar) {
        i0.c(this.f22778a, gVar);
        g.c cVar = new g.c(gVar.a(), gVar.e());
        List<Surface> f10 = i0.f(gVar.c());
        Handler handler = ((i0.a) h.e((i0.a) this.f22779b)).f22780a;
        a b10 = gVar.b();
        try {
            if (b10 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b10.a();
                h.e(inputConfiguration);
                this.f22778a.createReprocessableCaptureSession(inputConfiguration, f10, cVar, handler);
            } else if (gVar.d() == 1) {
                this.f22778a.createConstrainedHighSpeedCaptureSession(f10, cVar, handler);
            } else {
                e(this.f22778a, f10, cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
