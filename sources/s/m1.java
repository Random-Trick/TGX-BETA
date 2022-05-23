package s;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;
import y.h;
import y.i;

public final class m1 {
    public static CameraCaptureSession.CaptureCallback a(h hVar) {
        if (hVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(hVar, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return k0.a(arrayList);
    }

    public static void b(h hVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (hVar instanceof i) {
            for (h hVar2 : ((i) hVar).d()) {
                b(hVar2, list);
            }
        } else if (hVar instanceof l1) {
            list.add(((l1) hVar).e());
        } else {
            list.add(new k1(hVar));
        }
    }
}
