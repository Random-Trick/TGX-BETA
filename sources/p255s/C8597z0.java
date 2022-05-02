package p255s;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p321x.C10061j;
import p336y.AbstractC10268n0;
import p336y.AbstractC10287q0;
import p336y.C10245j0;

public class C8597z0 {
    public static void m12024a(CaptureRequest.Builder builder, AbstractC10268n0 n0Var) {
        C10061j d = C10061j.C10062a.m6089e(n0Var).m6090d();
        for (AbstractC10268n0.AbstractC10269a aVar : d.mo5425b()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.mo5579d();
            try {
                builder.set(key, d.mo5424c(aVar));
            } catch (IllegalArgumentException unused) {
                C0662u1.m40651c("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest m12023b(C10245j0 j0Var, CameraDevice cameraDevice, Map<AbstractC10287q0, Surface> map) {
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> d = m12021d(j0Var.m5653d(), map);
        if (d.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(j0Var.m5651f());
        m12024a(createCaptureRequest, j0Var.m5654c());
        AbstractC10268n0 c = j0Var.m5654c();
        AbstractC10268n0.AbstractC10269a<Integer> aVar = C10245j0.f33024g;
        if (c.mo5422e(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) j0Var.m5654c().mo5424c(aVar));
        }
        AbstractC10268n0 c2 = j0Var.m5654c();
        AbstractC10268n0.AbstractC10269a<Integer> aVar2 = C10245j0.f33025h;
        if (c2.mo5422e(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) j0Var.m5654c().mo5424c(aVar2)).byteValue()));
        }
        for (Surface surface : d) {
            createCaptureRequest.addTarget(surface);
        }
        createCaptureRequest.setTag(j0Var.m5652e());
        return createCaptureRequest.build();
    }

    public static CaptureRequest m12022c(C10245j0 j0Var, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(j0Var.m5651f());
        m12024a(createCaptureRequest, j0Var.m5654c());
        return createCaptureRequest.build();
    }

    public static List<Surface> m12021d(List<AbstractC10287q0> list, Map<AbstractC10287q0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC10287q0 q0Var : list) {
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
