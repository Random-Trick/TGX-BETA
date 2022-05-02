package p266t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.List;
import p016b1.C1132h;
import p266t.C8876a0;
import p266t.C8889g;
import p279u.C9398b;
import p279u.C9407g;

public class C8897i0 implements C8876a0.AbstractC8877a {
    public final CameraDevice f28725a;
    public final Object f28726b;

    public static class C8898a {
        public final Handler f28727a;

        public C8898a(Handler handler) {
            this.f28727a = handler;
        }
    }

    public C8897i0(CameraDevice cameraDevice, Object obj) {
        this.f28725a = (CameraDevice) C1132h.m38322e(cameraDevice);
        this.f28726b = obj;
    }

    public static void m10986b(CameraDevice cameraDevice, List<C9398b> list) {
        String id2 = cameraDevice.getId();
        for (C9398b bVar : list) {
            String a = bVar.m8798a();
            if (a != null && !a.isEmpty()) {
                C0662u1.m40643k("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + a + ". Ignoring.");
            }
        }
    }

    public static void m10985c(CameraDevice cameraDevice, C9407g gVar) {
        C1132h.m38322e(cameraDevice);
        C1132h.m38322e(gVar);
        C1132h.m38322e(gVar.m8779e());
        List<C9398b> c = gVar.m8781c();
        if (c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (gVar.m8783a() != null) {
            m10986b(cameraDevice, c);
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    public static C8897i0 m10984d(CameraDevice cameraDevice, Handler handler) {
        return new C8897i0(cameraDevice, new C8898a(handler));
    }

    public static List<Surface> m10982f(List<C9398b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C9398b bVar : list) {
            arrayList.add(bVar.m8797b());
        }
        return arrayList;
    }

    @Override
    public void mo10987a(C9407g gVar) {
        m10985c(this.f28725a, gVar);
        if (gVar.m8782b() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        } else if (gVar.m8780d() != 1) {
            C8889g.C8892c cVar = new C8889g.C8892c(gVar.m8783a(), gVar.m8779e());
            m10983e(this.f28725a, m10982f(gVar.m8781c()), cVar, ((C8898a) this.f28726b).f28727a);
        } else {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
    }

    public void m10983e(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }
}
