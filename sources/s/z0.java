package s;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.core.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import x.j;
import y.j0;
import y.n0;
import y.q0;

public class z0 {
    public static void a(CaptureRequest.Builder builder, n0 n0Var) {
        j d10 = j.a.e(n0Var).d();
        for (n0.a aVar : d10.b()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, d10.c(aVar));
            } catch (IllegalArgumentException unused) {
                t1.c("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest b(j0 j0Var, CameraDevice cameraDevice, Map<q0, Surface> map) {
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> d10 = d(j0Var.d(), map);
        if (d10.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(j0Var.f());
        a(createCaptureRequest, j0Var.c());
        n0 c10 = j0Var.c();
        n0.a<Integer> aVar = j0.f26321g;
        if (c10.e(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) j0Var.c().c(aVar));
        }
        n0 c11 = j0Var.c();
        n0.a<Integer> aVar2 = j0.f26322h;
        if (c11.e(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) j0Var.c().c(aVar2)).byteValue()));
        }
        for (Surface surface : d10) {
            createCaptureRequest.addTarget(surface);
        }
        createCaptureRequest.setTag(j0Var.e());
        return createCaptureRequest.build();
    }

    public static CaptureRequest c(j0 j0Var, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(j0Var.f());
        a(createCaptureRequest, j0Var.c());
        return createCaptureRequest.build();
    }

    public static List<Surface> d(List<q0> list, Map<q0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : list) {
            Surface surface = map.get(q0Var);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}
