package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.t1;
import b1.h;
import java.util.ArrayList;
import java.util.List;
import t.a0;
import t.g;
import u.b;
import u.g;

public class i0 implements a0.a {
    public final CameraDevice f22778a;
    public final Object f22779b;

    public static class a {
        public final Handler f22780a;

        public a(Handler handler) {
            this.f22780a = handler;
        }
    }

    public i0(CameraDevice cameraDevice, Object obj) {
        this.f22778a = (CameraDevice) h.e(cameraDevice);
        this.f22779b = obj;
    }

    public static void b(CameraDevice cameraDevice, List<b> list) {
        String id2 = cameraDevice.getId();
        for (b bVar : list) {
            String a10 = bVar.a();
            if (a10 != null && !a10.isEmpty()) {
                t1.k("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + a10 + ". Ignoring.");
            }
        }
    }

    public static void c(CameraDevice cameraDevice, g gVar) {
        h.e(cameraDevice);
        h.e(gVar);
        h.e(gVar.e());
        List<b> c10 = gVar.c();
        if (c10 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (gVar.a() != null) {
            b(cameraDevice, c10);
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    public static i0 d(CameraDevice cameraDevice, Handler handler) {
        return new i0(cameraDevice, new a(handler));
    }

    public static List<Surface> f(List<b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (b bVar : list) {
            arrayList.add(bVar.b());
        }
        return arrayList;
    }

    @Override
    public void a(g gVar) {
        c(this.f22778a, gVar);
        if (gVar.b() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        } else if (gVar.d() != 1) {
            g.c cVar = new g.c(gVar.a(), gVar.e());
            e(this.f22778a, f(gVar.c()), cVar, ((a) this.f22779b).f22780a);
        } else {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
    }

    public void e(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
